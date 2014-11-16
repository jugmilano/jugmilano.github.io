Mi appunto qui un pò di istruzioni su come avere su una macchina Unix un'installazione di Tomcat condivisa e più istanze in esecuzione (ovviamente in ascolto su porte diverse).

Questa configurazione è quella attualmente in essere sulla macchina che ospita il Wiki del JugMilano.

Il funzionamento si basa su un meccanismo specifico di Tomcat che utilizza due variabili di ambiente, le quali vengono poi caricate come System Properties all'avvio del server:
	* CATALINA_HOME (catalina.home) - la directory di installazione, condivisa come nel nostro caso
	* CATALINA_BASE (catalina.base) - la directory della specifica istanza da eseguire

Nel nostro caso il valore di CATALINA_HOME è fisso e corrisponde all'unica installazione condivisa di tomcat presente sulla macchina:
	* {{{/opt/jakarta-tomcat-5.5.9}}}

per facilitare eventuali aggiornamenti ci riferiremo a questa directory attraverso un ''symlink'':
	* {{{/usr/local/tomcat -> /opt/jakarta-tomcat-5.5.9}}}

L'obiettivo è di far si che nessuna istanza di Tomcat in esecuzione modifichi il contenuto di questa directory, in modo da minimizzare i problemi derivanti da eventuali aggiornamenti.

Vediamo ora come preparare la directory della nostra istanza $CATALINA_BASE.
Copio le seguenti directory da $CATALINA_HOME:
	* conf

quindi creo le seguenti directory vuote: 
	* logs
	* temp
	* webapps
	* work

il proprietario del contenuto di $CATALINA_BASE deve essere l'utente con il quale lanceremo questa istanza di Tomcat.

!Porte!
Modifichiamo il contenuto del file:
	* {{{$CATALINA_HOME/conf/server.xml}}}

in modo che non ci siano conflitti di porte con altri server già in esecuzione.

!PID!
Per effetturare un kill del processo:
	* {{{$CATALINA_HOME/bin/shutdown.sh -kill}}}

è necessario diversificare anche il contenuto della variabile di ambiente CATALINA_PID fra le diverse istanze.

!Logging!
Per far sì che tutti i log della nostra istanza finiscano in $CATALINA_BASE/logs invece di $CATALINA_HOME/logs, è necessario utilizzare una serie di accorgimenti:
	* controllare che nello script di startup i file che catturano stdout e stderr (catalina.out e catalina.err) abbiano percorsi che facciano riferimento a CATALINA_BASE e non a CATALINA_HOME
	* nel caso si utilizzi '''Log4j''' per il logging del server o quello delle applicazioni, verificare che nei file di configurazione, siano essi properties o xml, i percorsi facciano riferimento con la stessa sintassi di Ant alla property catalina.base e non a catalina.home come indicato in: http://jakarta.apache.org/tomcat/tomcat-5.5-doc/logging.html

'''NB''' In questo modo ho scoperto un giochetto piuttosto utile: i file di configurazione di Log4J __risolvono__ le system properties con la stessa sintassi delle property in Ant. Ciò si applica anche ad altri logging framework, come l'implementazione di java.util.logging JULI, integrata in Tomcat 5.5.9.

!Webapps!
La nostra istanza di Tomcat al momento non contiene alcuna web application, ad eccezione di quelle di default non caricate da $CATALINA_HOME/webapps in :
	* manager
	* admin

che è comunque possibile eliminare cancellando i rispettivi context file:
	* $CATALINA_BASE/conf/Catalina/localhost/manager.xml
	* $CATALINA_BASE/conf/Catalina/localhost/admin.xml

Per il tomcat del JUG Milano aggiungo il WAR espanso dell'applicazione VeryQuickWiki che utilizziamo:
	* $CATALINA_BASE/webapps/vqwiki

In questo modo l'applicazione è raggiungibile dal contesto {{{vqwiki}}} ma, poichè mi interessa impostarla anche come ROOT del webserver, aggiungo il seguente context file:
	* {{{$CATALINA_BASE/conf/Catalina/localhost/ROOT.xml}}}

[<java>]<Context path="" docBase="${catalina.base}/webapps/vqwiki" />[</java>]

Se avessi voluto mantenere l'applicazione in una directory completamente separata da tomcat, avrei potuto mettere come {{{docBase}}} un percorso assoluto in una qualsiasi posizione, oppure relativo a ${user.home} nel caso la webapp fosse stata all'interno della directory dell'utente che esegue questa instanza di tomcat.

!That's all Folks!
A questo punto controllo di aver impostato correttamente le variabile di ambiente CATALINA_HOME alla directory di installazione, CATALINA_BASE alla directory creata adhoc per la mia istanza e CATALINA_PID, quindi lancio:
	* {{{$CATALINA_HOME/bin/startup.sh}}}

Nel caso volessi lanciare la mia istanza di Tomcat come daemon tramite uno script in /etc/init.d, questo deve contenere le impostazioni della variabili su indicate, oppure nel caso si utilizzi {{{jsvc}}} (commons-daemon) per lanciare la JVM come daemon eseguito da un utente specifico, bisogna impostare le system property corrispondenti, ad esempio:

[<java>]#!/bin/sh
#
# tomcat-jugmi				  Starts the Tomcat daemon for jugmi
# chkconfig: - 85 15
# description: Tomcat is a Servlet Engine. This is the instance for jugmi.
# processname: java
# pidfile: /var/run/jsvc-tomcat-jugmi.pid
# config: /data/tomcat-jugmi/conf/server.xml

export JAVA_HOME=/usr/local/java15
export CATALINA_HOME=/usr/local/tomcat
export CATALINA_BASE=/data/tomcat-jugmi

DAEMON=$CATALINA_HOME/bin/jsvc
TOMCAT_USER=jugmi
ENDORSED_DIR=$CATALINA_HOME/common/endorsed
OUTFILE=$CATALINA_BASE/logs/catalina.out
ERRFILE=$CATALINA_BASE/logs/catalina.err
CLASSPATH=$JAVA_HOME/lib/tools.jar:$CATALINA_HOME/bin/bootstrap.jar:$CATALINA_HOME/bin/commons-daemon.jar
CATALINA_OPTS=-Xmx512m
BOOTSTRAP_CLASS=org.apache.catalina.startup.Bootstrap
CATALINA_TMPDIR=$CATALINA_BASE/temp
CATALINA_PID=/var/run/jsvc-tomcat-jugmi.pid

case "$1" in
  start)
	 #
	 # Start Tomcat
	 #
	 $DAEMON \
	 -user $TOMCAT_USER \
	 -pidfile $CATALINA_PID \
	 -Dcatalina.home=$CATALINA_HOME \
	 -Dcatalina.base=$CATALINA_BASE \
	 -Djava.endorsed.dirs=$ENDORSED_DIR \
	 -Djava.awt.headless=true \
	 -Djava.io.tmpdir=$CATALINA_TMPDIR \
	 -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager \
	 -outfile $OUTFILE \
	 -errfile $ERRFILE \
	 -classpath $CLASSPATH \
	 $CATALINA_OPTS \
	 $BOOTSTRAP_CLASS
	 ;;

  stop)
	 #
	 # Stop Tomcat
	 #
	 PID=`cat $CATALINA_PID`
	 kill $PID
	 ;;

  restart)
	 $0 stop
	 $0 start
	 ;;

  *)
	 echo "Usage tomcat-jugmi start/stop"
	 exit 1;;
esac[</java>]

attach:catalina-base.tar.gz
