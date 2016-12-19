by RenzoBorgatti

!Introduzione!
''Questo tutorial mostra come installare da zero (compreso un repository SVN) un'istanza di Cruisecontrol per Java sotto ambiente Linux. Come progetto target e' stato scelto per comodita' CruiseControl stesso che e' un progetto Java dotato di unit test e build Ant. Nella realta' paths, progetti e configurazioni andranno calate nel contesto del proprio ambiente di lavoro.

Dato che esistono port speculari di Cruisecontrol, JUnit ed Ant per dotNET (CruiseControl.net, NUnit, NAnt) effettuare le stesse operazioni sulla piattaforma dotNET e' abbastanza semplice. Le differenze piu' grandi risiedono nelle operazioni di deploy dei vari package (visto che il target e' Windows/IIS). Questo tutorial non comprende la parte relativa a dotNET (ma esistono tutorial molto ben fatti come ad esempio http://www.15seconds.com/issue/040621.htm).

Si assume che la cartella $HOME corrisponda alla cartella base dell'utente corrente. Sostituire eventualmente $HOME con una cartella di preferenza. In questi esempi qualche volta e' stata usata la variabile altre volte il nome della cartella home sul mio HD attuale (/home/renzo_borgatti).''

!Preparazione di un source repository centralizzato con SVN!
Le prossime operazioni hanno lo scopo di creare un repository svn che contenga 2 progetti. Nel caso in cui si possieda gia' tale repository oppure si possiede un repository cvs, e' possibile saltare questa parte ed andare direttamente al paragrafo successivo.
	# Creare una directory adatta per contenere il necessari file per CruiseControl, ad esempio {{{mkdir $HOME/cc}}}
	# Creare una home svnroot con il comando:  {{{svnadmin create svnroot}}} all'interno della directory creata precedentemente	
	# Creare dentro la cartella cc una cartella temporanea tmp che potra' poi essere cancellata
	# Scompattare lo zip di CruiseControl con {{{unzip cruisecontrol-2.2.zip}}} (la release corrente e' attualmente la 2.2 ed e' scaricabile qui http://cruisecontrol.sourceforge.net/download.html) all'interno della cartella tmp creando cosi' la sottocartella {{{$HOME/cc/tmp/cruisecontrol-2.2}}}
	# Creare una cartella {{{$HOME/cc/tmp/root}}}
	# Effettuare una move {{{mv cruisecontrol-2.2/main root}}} dalla cartella corrente {{{$HOME/cc/tmp}}} che serve per isolare il sottoprogetto di Cruisecontrol che racchiude il server vero e proprio
	# Effettuare una move {{{mv cruisecontrol-2.2/reporting/jsp root}}} dalla cartella corrente {{{$HOME/cc/tmp}}} che sposta il sottoprogetto relativo alla web application di Cruisecontrol
	# Lanciare da {{{$HOME/cc/tmp}}} il comando {{{svn import root file://$HOME/cc/svnroot -m "First commit"}}} che simula l'ingresso nel repository svn dei due sottoprogetti che costituiscono Cruisecontrol
	
Svn comincia ora ad importare le due sottodirectory considerandole due progetti separati. Quando questa operazione termina, la cartella $HOME/cc/svnroot conterra' la copia interna dei progetti, che non dovrebbe essere manipolata dall'utente se non con gli appositi comandi di svn.

!Creazione della struttura di directory!
In questo paragrafo, viene creata la struttura tipica di un server Cruisecontrol che controlla i progetti presenti all'interno del repository creato in precedenza. Attenzione a non farsi ingannare dal fatto che il repository svn e l'installazione del server Cruisecontrol coesistano nella stessa directory. Nella realta' il repository potrebbe essere in un altro file system di un altro server della rete locale.
	# Creare dentro {{{$HOME/cc}}} le directory {{{checkout}}}, {{{logs}}} ed {{{artifacts}}} con il comando {{{mkdir checkout logs artifacts}}}
	# Creare dentro {{{$HOME/cc/logs}}} le directory main e jsp per i progetti correnti {{{mkdir logs/main logs/jsp}}}
	# Creare in {{{$HOME/cc}}} un file main-build.xml contenente le tre azioni ant di cancellazione, checkout e lancio del build per il progetto sotto continous integration (vedi esempio qui sotto)
	# Creare analogamente un file build ant jsp-build.xml. Nel caso generale, dev'essere creato un file ant con i task citati per ogni progetto di cui Cruisecontrol si dovra' occupare. Lo scopo e' mettere in grado Cruisecontrol di sapere come fare per recuperare quel progetto e come fare per lanciare il build di quel progetto. E' in questa sede che si puo' specificare ad esempio un repository diverso da svn. Il terzo esempio e' il main-build.xml ipotizzando di scaricare il progetto da cvs invece che svn.
	# Provare a lanciare i comandi ant per testare gli script: {{{ant -f main-build.xml}}} e {{{ant -f jsp-build.xml}}}. Questo provoca l'accesso al repository ed il lancio del comando di build per i progetti con conseguente esecuzione dei test. Potrebbe passare un po' di tempo.
	* Il build della parte jsp del progetto richiedera' di inserire alcune directory:
		* Inserire il percorso completo della directory logs creata in precedenza: {{{$HOME/cc/logs}}}
		* Quando verra' richiesto di inserire il nome del file di status, inserire il nome b{{{buildstatus.txt}}}
		* Quando verra' richiesto di inserire la directory degli artifacts, inserire il percorso completo della directory artifacts creata in precedenza: {{{$HOME/cc/artifacts}}}

[<java>]
<!--Il file main-build.xml-->
<project name="main-build" default="build" basedir="checkout">
  <target name="build">
	<delete dir="main"/>
	<exec dir="." executable="svn" os="Linux">
	 <arg line="co file:///home/renzo_borgatti/cc/svnroot/main"/>
	</exec>
	<ant antfile="build.xml" dir="main" target="all"/>
  </target>
</project>
[</java>]


[<java>]
<!--Il file jsp-build.xml-->
<project name="jsp-build" default="build" basedir="checkout">
  <target name="build">
	<delete dir="jsp"/>
		  <exec dir="." executable="svn" os="Linux">
	  <arg line="co file:///home/renzo_borgatti/cc/svnroot/jsp"/>
	</exec>
	<ant antfile="build.xml" dir="jsp" target="war"/>
  </target>
</project>
[</java>]

[<java>]
<!-- Di nuovo il main-build.xml ipotizzando di lavorare con un progetto -->
<!-- cvs invece che svn. Non e' il caso di questo tutorial, ma viene -->
<!-- riportato come esempio di diverso repository -->
<project name="main-build" default="build" basedir="checkout">
  <target name="build">
		  <cvs command="up -d -P -C"/>
	<ant antfile="build.xml" dir="main" target="all"/>
  </target>
</project>
[</java>]

Abbiamo ottenuto un wrapper ant al normale processo di installazione dei sorgenti e loro verifica attraverso i test che normalmente viene eseguita da uno sviluppatore che s'aggiunge al progetto. Come un nuovo sviluppatore, Cruisecontrol non fa riferimento ad alcuna condizione preesitente e deve sapere come effettuare il checkout dal sistema di versioning e come lanciare il build del progetto che produrra' l'esecuzione dei test. Come si vede dal caso cvs, cambiare sistema di versioning ha a che vedere con i task ant. Dato che esiste il task ant di collegamento a cvs (ma anche a pvcs, sourcesafe ecc.) basta utilizzarlo seguendo il manuale ant. Nel caso il proprio sistema di versioning non esista tra i task ant (e' il caso nostro con svn) si puo' far ricorso al tool da linea di comando.

!Configurazione dello scheduler Cruisecontrol!
Ora che esiste un build ant per ogni progetto che e' in grado di scaricare e lanciare il comando di build, e' ora di dire a Cruisecontrol che tali progetti sono sotto la sua giurisdizione. Per farlo entriamo nell'ambito del config.xml, ovvero la configrazione di Cruisecontrol.
	* Creare il file config.xml in {{{$HOME/cc}}}
	* Dentro il tag base <cruisecontrol> dovranno esistere tanti tag <project> quanti sono i progetti di cui CruiseControl si dovra' occupare. Ogni progetto puo' avere i propri settaggi indipendenti e fara' riferimento ai singoli file di build creati in precedenza. Vedi l'esempio qui sotto.
	* Aver cura di fornire a CruiseControl la directory home di Ant preferita. Se si omette l'attributo antscript nel tag ant, CruiseControl scegliera' la ANT_HOME di default. Cosi' si puo' creare uno script ant.sh che esegue uno specifico ant. Il motivo per cui e' meglio scegliere questa strada e' di sapere con esattezza al di la' dei settaggi del proprio environment quale installazione di Ant Cruisecontrol scegliera' con esatezza. Creare un file {{{ant.sh}}} nella directory home del tutorial {{{$HOME/cc}}} come in questo esempio (avendo cura di sostituire la {{{ANT_HOME}}} con la propria):

[<java>]
#! /bin/sh
 PROJECT_HOME=`dirname "$0"`
 ANT_HOME=/home/renzo_borgatti/lib/ant/apache-ant-1.6.2
 ANT_CMD=${ANT_HOME}/bin/ant
 exec "$ANT_CMD" "$@"
[</java>]

	* Creare la sezione dedicata al progetto main e jsp e racchiudere il tutto nel tag corretto (vedi esempio completo qui sotto).

[<java>]
<?xml version="1.0"?>
<cruisecontrol>
<project name="main">
  <bootstrappers>
	 <currentbuildstatusbootstrapper file="logs/main/buildstatus.txt"/>
  </bootstrappers>
  <modificationset>
	 <svn localworkingcopy="checkout/main"/>
  </modificationset>
  <schedule interval="120">
			<ant antscript="ant.sh" uselogger="false" buildfile="main-build.xml"/>
  </schedule>
  <log dir="logs/main">
	 <merge dir="checkout/main/target/test-results" removeproperties="false"/>
  </log>
  <publishers>
	 <currentbuildstatuspublisher file="logs/main/buildstatus.txt"/>
	 <!--email mailhost="smtp.mail.yahoo.com" 
			  returnaddress="cruisecontrol@localhost" 
			  buildresultsurl="http://localhost:9000/cruisecontrol/index.jsp" 
			  spamwhilebroken="true" 
			  reportsuccess="fixes">
		<failure address="renzo_borgatti@yahuu.com" reportWhenFixed="true"/>
		<failure address="doroty.sterevan@piko.au" reportWhenFixed="true"/>
	 </email-->
			 <execute command="playwave /home/renzo_borgatti/aiutami.wav"/>
			<artifactspublisher dir="checkout/main/target" dest="artifacts/main"/>
  </publishers>
</project>
<project name="jsp">
  <bootstrappers>
	 <currentbuildstatusbootstrapper file="logs/jsp/buildstatus.txt"/>
  </bootstrappers>
  <modificationset>
	 <svn localworkingcopy="checkout/jsp"/>
  </modificationset>
  <schedule interval="120">
	 <ant antscript="ant.sh" uselogger="false" buildfile="jsp-build.xml"/>
  </schedule>
  <log dir="logs/jsp">
	 <merge dir="checkout/jsp/target/testresults" removeproperties="false"/>
  </log>
  <publishers>
	 <currentbuildstatuspublisher file="logs/jsp/buildstatus.txt"/>
	 <!--email mailhost="smtp.mail.yahoo.com" 
			  returnaddress="cruisecontrol@localhost" 
			  buildresultsurl="http://localhost:9000/cruisecontrol/index.jsp" 
			  spamwhilebroken="true" 
			  reportsuccess="fixes">
		<failure address="renzo_borgatti@yahuu.com" reportWhenFixed="true"/>
		<failure address="doroty.sterevan@piko.au" reportWhenFixed="true"/>
	 </email-->
			 <execute command="playwave /home/renzo_borgatti/aiutami.wav"/>
			<artifactspublisher dir="checkout/jsp/target" dest="artifacts/jsp"/>
  </publishers>
</project>
</cruisecontrol>
[</java>]

	* Quando CruiseControl effettuera' la build della jsp application, chiedera' interattivamente la posizione di certe directory. Questo e' evitabile inserendo un file override.properties nella root del progetto jsp con le impostazioni indicate in precedenza. Ma attenzione: ad ogni integrazione Cruisecontrol spazza via le directory presenti in {{{$HOME/cc/checkout}}} e con loro qualunque modifica che qui viene effettuata. Infatti ci dobbiamo ricordare che la directory dei checkout e' una directory ad uso e consumo di Cruisecontrol, non la directory di progetto di ogni sviluppatore. Se e' vero che serve un nuovo file al progetto, e' nel repository svn che deve finire, da dove verra' prelevato ad ogni successiva integrazione. Quindi:
		* {{{cd $HOME/cc/checkout/jsp}}}
		* {{{touch override.properties}}}
		* {{{vi override.properties}}} e copia del contenuto qui sotto (sostituire sempre con il proprio path assoluto)
		* {{{svn commit override.properties -m "Override iterative message"}}}
		* Il file e' indelebilmente legato al repository svn ora

[<java>]
# Il contenuto del file override.properties
user.log.dir=/home/renzo_borgatti/cc/logs
user.build.status.file=buildstatus.txt
cruise.build.artifacts.dir=/home/renzo_borgatti/cc/logs
jdk1.4=true
[</java>]

	* Ultima quisquiglia: posizionarsi in {{{$HOME/cc}}} ed impartire il comando {{{chmod -R 755 *}}} per rendere utilizzabili tutti gli script che sono stati scaricati da svn con l'attributo di non eseguibilita' di default.
	* A questo punto e' impartire il comando {{{checkout/main/bin/cruisecontrol.sh}}} dalla directory che contiene il config.xml per far partire Cruise Control. Dato che lo schedule interval nel file di configurazione e' 120 secondi, dopo 2 minuti si vedra' lo stesso output visto in precedenza, dato che Cruisecontrol sta eseguendo gli script di ant in automatico al posto nostro. Se poi non si uccide il processo con {{{<ctrl>+c}}} ogni due minuti il miracolo si ripetera', anche se non essendoci modifiche sul versioning, non averranno build.
	* Per vedere variazioni, provare ad esempio ad effettuare il commit nuovamente del file override.properties, aggiungendo magari un commento.
	* Ogni variazione determina una nuova build ed esecuzione dei test.

'''Cruisecontrol allo specchio''': abbiamo messo sotto continous integration la root di progetto dalla cui build abbiamo ottenuto il processo stesso!  Pazienza, e' solo a fini didattici :). Ma quello che succede e' che il successivo build di progetto ricreera' il jar di Cruisecontrol e quindi lo script cruisecontrol.sh ha caricato in memoria ed eseguito il contenuto di un jar che ha successivamente determinato la cancellazione di se stesso. Questa nota di folklore vale solo per il tutorial in questione, che non richiede di avere un progetto di prova ma fa affidamento sui sorgenti di Cruisecontrol stesso.

!Installazione della webapp di monitoraggio CruiseControl!
	# Il primo giro di build creera' la webapp nella directory {{{$HOME/cc/checkout/jsp/dist}}}
	# Prendere il file {{{$HOME/cc/checkout/jsp/dist/cruisecontrol.war}}} e portarlo tra le applicazione del servlet engine preferito (Tomcat! Su Resin ho avuto problemi di jsp engine)
	# Ammesso che il server sia in ascolto sulla porta 8080, per accedere alla console digitare nel browser {{{http://localhost:8080/cruisecontrol}}}
	# L'auto-refresh come dice il nome attiva il polling automatico della pagina al server perregistrare le variazioni nelle build.
	# Da notare: il delta dall'ultima build, i risultati dei test e le statistiche delle ultime build

!Accesso HTML ai bean JMX!
	* Stoppare il processo di cruisecontrol.sh se ancora in funzione
	* Basta avviare il processo cruisecontrol passando il parametro -port ed una porta sul quale sara' in ascolto l'adapter html JMX, ad esempio {{{-port 9000}}}
	* Per contattare l'adapter digitare {{{http://localhost:9000}}} nel proprio browser
	* L'adaptor espone vari MBean, ma quelli importanti sono gli MBean generati appositamente per il progetto dai quali e' possibile modificare la configurazione o forzare una build

!Simulazione di utilizzo!
	* A questo punto si puo' provare ad eseguire una modifica al progetto che procura il fallimento di un test e vedere come si comporta CruiseControl. Ad esempio nella classe BuildQueueTest.java si puo' modificare un test con una assert(false). Ricordarsi di effettuare la commit della modifica.
	* Si puo' forzare la build dalla console JMX del progetto main ed aspettarsi il fallimento
	* Verificare ora sulla console qual e' il risultato dell'ultima build, e guardare il log per vedere quali azioni CruiseControl ha intrapreso
	* Rollback della modifica e nuovo force build
	* Nel config.xml c'e' una sezione commentata che avvia le alert via email in caso di fallimento di un progetto. Nella mail si possono trovare molte delle notizie presenti nella webapp di Cruisecontrol


!Tips&Tricks!
	* Se il progetto sotto version control e' molto grande, non ha senso imporre a Cruisecontrol di cancellarlo e downloadarlo per intero ad ogni integrazione. Per questo e' sufficiente trovare un differenziale e scaricare solo i file che sono stati modificati. Per farlo occorre fae riferimento al task ant del proprio sistema di versioning e trovare le opportune opzioni da attivare. Se anche in questo caso non fosse sufficiente e' possibile personalizzare quale sia l'evento che induce Cruisecontrol a scaricare il progetto dal versioning. Potrebbe anche trattarsi di un singolo file esterno al progetto che viene alterato ad esempio con un touch e viene controllato da Cruisecontrol. Informazioni specifiche su come fare si trovano sul wiki del sito di Cruisecontrol.
	* Se si esegue il tutto da linea di comando, assicurarsi che il comando java sia eseguibile. Se non viene trovato, aggiungere al path il percorso della directory bin, ad esempio: {{{export PATH=$PATH:/<jdk_home>/bin}}}
	* Ho provato ad usare Resin come servlet engine, ma purtroppo si sono verificati problemi durante l'esecuzione della jsp. I problemi sono superabili probabilmente, ma per un deploy ed esecuzione pulite al primo colpo, Tomcat 5.0.28 ha fatto il suo dovere.
	* JFreeChart sotto linux non funzioneranno finche' non sara' presente l'opzione {{{-Djava.awt.headless=true}}}. Per vedere i grafici delle metriche nella webapp sara' necessario inserire, ad esempio in {{{<TOMCAT_HOME>/bin/startup.sh}}} la riga {{{export JAVA_OPTS=${JAVA_OPTS}' -Djava.awt.headless=true'}}} in cima al file. Riavviare tomcat e riprovare.
	* Se si verificano problemi di permessi di accesso ai file da Tomcat verso la directory contenente i log, controllare di avere effettivamente fornito durante il build le diretory iterativamente oppure di aver inserito il file.override. Se non lo si e' fatto verranno prese delle directory di default sulle queli si potrebbero non avere i permessi di accesso. Se anche e' stato fatto correttamente, controllare che tutte le directory nella catena abbiano il diritto di lettura: {{{/home/<utente>/cc/logs}}}. Thanks to Matteo Turra per la segnalazione.



!Conclusioni!
''L'installazione di Cruisecontrol e' solo la prima fatica (non troppo onerosa per la verita') che il team dovra' affrontare. Cruisecontrol impone al team una fatica piu' pesante che e' quella della '''disciplina''' (in senso buono ovviamente :). Sapendo che il proprio lavoro puo' rompere il meccanismo di build e generare vari eventi "pubblici" lo sviluppatore avra' l'onere prima del check-in di verificare nuovamente l'integrita' del proprio lavoro con quello del team scaricando una versione fresca di tutti i sorgenti che non sono stati oggetto della sua modifica corrente. Se i test girano, la commit verso Cruisecontrol puo' avvenire quasi sicuramente con successo. 

Quel "quasi" lascia aperta la possibilita' che integrando in modo concorrente, due coppie di lavoro non si rendano conto di aver lasciato irrisolti alcuni conflitti. Per questo e' meglio che le operazioni di commit avvengano in lock pessimistico ed esclusivo. '''Solo una coppia del team potra' integrare allo stesso momento'''. Per regolarsi in questo operazione si puo' usare un qualche lock fisico (un oggetto, una scritta ecc.), posizionato sopra lo schermo di chi sta integrando ad indicare che in quel momento nessun altro puo' integrare.

Una cosa subdola che puo' comunemente capitare (e che fa fallire i test) e' quando inavvertitamente si introducono '''riferimenti assoluti''' al proprio ambiente di lavoro. Un localhost che prevede un certo percorso o un URI come file:/home/tmp sono esempi di legame fra i test e l'ambiente di test. Quando i test verranno eseguiti su Cruisecontrol si avranno le inaspettate sorprese... ''

Per ulteriori informazioni:
	* '''http://www.martinfowler.com/articles/continuousIntegration.html''' l'articolo illustra i principi che hanno portato alla nascita di CruiseControl raccontato direttamente dagli autori
	* '''http://cruisecontrol.sf.net''' La home di CruiseControl
	* '''http://confluence.public.thoughtworks.org/display/CCNET/''' la home relativa alla versione .NET
	* '''[<html>]renzo[dot]borgatti[at]jugmilano[dot]it[</html>]''' la mia mail ;)
	

