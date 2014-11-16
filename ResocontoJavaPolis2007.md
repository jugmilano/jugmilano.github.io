Ancora una volta la carovana del JugMilano si è trasferita a __JavaPolis__ in compagnia degli amici degli altri JUG italiani! Ed eccoci all'abituale resoconto, in mezzo a folle di sviluppatori, ricche colazioni, birra, cozze e gamberi a volontè!

!![http://www.javapolis.com/confluence/display/JP07/Uni+Day+2|11/12/07 University Giorno 2]!!
![http://www.javapolis.com/confluence/display/JP07/Struts2|Struts2] by Ian Roughley!
	* example about reusing S1 actions in S2
	* multiple action methods don't work well with code-behind and single responsibility of action gets broken anyway
	* annotations are handy but have issues:
		* cannot set interceptors
		* cannot give multiple name with action

![http://www.javapolis.com/confluence/display/JP07/A+gentle+introduction+to+dependency+management+with+Apache+Ivy|A gentle introduction to dependency management with Apache Ivy] by [http://xhab.blogspot.com/|Xavier Hanin]!
	* stress on flexibility and build reproducibility
	* plugin for eclipse
		* classpath container for maven dependencies
		* can leverage an existing pom.xml, interesting for migrating ant to maven gently
	* ivy configuration are like maven scope but are not a limited set
	* current discussion with maven folks about using ivy for dependency management within maven as it is more flexible

![http://www.javapolis.com/confluence/display/JP07/Task-focused+programming+with+Mylyn|Eclipse Mylyn] by Wayne Beaton!
	* evangelist talk, with no insight on real day-to-day use
	* avoid information overload
	* context switch
	* integration for:
		* task
		* context (java, c++, dynamic lang...)
		* team (repo)
	* windows desktop integration for tasked-based ui also on the OS made by tasktop (company of original coder)

!JUG & Speaker Dinner!

!![http://www.javapolis.com/confluence/display/JP07/Conf+Day+1|12/12/07 Conference Giorno 1]!!
!Keynote!
Benvenuto di Stephen Janssen ai presenti e obbligatoria ovazione a quest'uomo che non finiremo mai di ringraziare per quanto stia facendo per la community con __JavaPolis__. Subito dopo spazio a Bruce Eckel, ospite speciale di quest'anno, che però già prende una prima cantonata mettendosi a parlare del concetto di '''unconference''' in una conferenza come __JavaPolis__ dove le opprtunità di incontro ed i meeting spontanei hanno sempre avuto ampio spazio e sono spesso più interessanti di quanto avvenga sul palco. Informarsi prima, please, avanti il prossimo.

Sembra incredibile che il giorno prima fossimo a brindare insieme, ora invece il nostro babbo natale di Java, James Gosling, è sul palco a far spettacolo per il keynote. Scherza un po' sulla parodia un tantinello greve che si è beccato nello spot "Meet Your Idols" della __JavaPolis__ dell'anno prima, ma ci tiene a precisare che un particolare sicuramente non gli appartiene: lui di certo non guida un Magnum!

Ed ora il solito giro dei numeri di Java, che però fa sempre impressione, più un po' di pillole di Gosling-pensiero e di Java-per-punti:
	* Java The Platform in questo momento è più importante di Java The Language
	* la performance di Java è migliore o uguale a quella del C++ e si avvicina a quella del Fortran (ci sono problemi solo nel calcolo matriciale)
	* il garbage collector è più veloce della gestione manuale della memoria tramite malloc/free
	* la compilazione dinamica batte quella statica
	* per quanto riguarda Java opensource, è stata finalmente completata la migrazione dal repository del codice interno su __TeamWare__ a quello pubblico su Mercurial
	* i siti Open<__QualcheCosa__> mantengono stretto il legame fra Sun e la community 
	* le specifiche realtime Java RTS sono realtà, e capaci di far produrre ad ABB un robot capace di applicare una forza di 10G ad alta precisione
	* è il momento di Java anche per gli ''intelligent mesh'', reti di oggetti intelligenti, in pratica la versione industriale del progetto [http://www.sunspotworld.com/|Sun SPOT]
	* ''Mobile Services Architecture'' è una versione adulta di CLDC capace di superare le problematiche di API e device fracturing in Java ME
	* JavaFX è il nome di marketing di tutte le iniziative in ambito tecnologie desktop e comprenderà
		* strumenti per sviluppatori e designer
		* compilatori JavaFX per piattaforme diverse
		* versione JavaFX Mobile per piattaforma CLDC/MSA

Ed ora il momento autoreferenziale, James ci fa sapere che, sì, {{{emacs}}} è stato un buon IDE, ma ora lui usa NetBeans! Subito dopo però una piacevole sorpresa, sale sul palco un italiano, '''Giulio Toffoli''', che presenta una piccola demo di un plugin visuale di NetBeans per la creazione di report con la libreria opensource __JasperReports__, derivato dal suo progetto [http://www.jasperforge.org/jaspersoft/opensource/business_intelligence/ireport/|iReport]. Complimenti!

Seguono Simon Ritter e Angela Caceido con le abituali demo di robot e sensori, con qualche lieve aggiornamento rispetto all'anno scorso che prevede l'obbligatoria chiamata alle Twitter API ed un uso di JavaFX che mima effetto __CoverFlow__ e interfaccia zoom multitouch del tempo delle mele. Ma è passato un anno e quello che faceva saltar sulla sedia l'anno scorso, complice la sensazione che neanche più gli speaker ci credano, è già diventato sbadiglio.

![http://www.javapolis.com/confluence/display/JP07/JavaFX|JavaFX] by James Weaver!
Non posso andar via da questa conferenza senza finalmente aver capito qualcosa in più di JavaFX, ed eccomi qui a seguire uno speech sull'argomento. Il taglio è da tutorial su JavaFX come linguaggio semplice ed elegante, ma capace di sfruttare tutta la potenza di Java, e Weaver, che ha un libro in stampa ed un [http://learnjavafx.typepad.com/|weblog] con diverso materiale utile di studio, è ottimo nello spiegarne le caratteristiche:
	* è possibile dichiarare oggetti con una sintassi object literal
	* è disponibile un compilatore oltre all'interprete
	* il linguaggio fornisce closure, espressioni e iteratori interni
	* è staticamente tipato, i tipi non indicati vengono risolti in fase di compilazione tramite inferenza
	* permette - ovviamente - il binding fra modello e interfaccia utente
	* può essere pensato come una strada più facile per usare Swing
	* permette di proteggere l'integrità degli oggetti tramite trigger
Il tutto fa un ottima impressione, il linguaggio rimane semplice e chiaro, poi segue la parte dimostrativa. Peccato si nomini solamente la parte di animazione con la libreria [https://scenegraph.dev.java.net/|scenegraph] senza vedere nulla, né avere qualche indicazione sul supporto di strumenti, per programmatori ma soprattutto per grafici, che possano renderne proficua l'adozione.

![http://www.javapolis.com/confluence/display/JP07/Google+Web+Toolkit|Google Web Toolkit] by [http://dickwallsblog.blogspot.com/|Dick Wall] and [http://www.ongwt.com/|Didier Girard]!
Alcune novità dalla versione 1.4 di GWT:
	* a speed profiler is available: AJAX works only if it is fast and responsive for the user
	* increased compiler optimization

Ed ora gli esempi:
	* classica applicazione Spring-Hibernate
	* a sample GWT-based [http://code.google.com/apis/opensocial/|OpenSocial] gadget for iGoogle

e qualche consigliuccio...
	* beware that long type does not exist in __JavaScript__!

![http://www.javapolis.com/confluence/display/JP07/JSR+316+-+Java+Platform+Enterprise+Edition+6+Specification|JSR 316 - Java Platform Enterprise Edition 6 Specification] by [http://weblogs.java.net/blog/robc/|Roberto Chinnici]!
Ed ecco un po' di sviluppo enterprise che non guasta mai. Chinnici e co-lead della cosiddetta ''umbrella specification'' di Java EE 6 e ci parla delle novità che arriveranno. Parte dicendo apertamente che se abbiamo ancora J2EE 1.4 fra i piedi dobbiamo ringraziare __WebSphere__ che ancora non supporta la 5, mentre il resto del mondo ha più o meno chiuso con quel (brutto) capitolo. I feedback sulla JEE5 sono stati molto positivi circa l'obiettivo di semplificazione (EoD aka ease of development), ma le dimensioni eccessive della piattaforma rappresentano ancora un problema e provocano una sovraccarico mentale inutile a chi debba padroneggiarla. Da qui l'idea con la versione 6 di rimuovere l'obbligo da parte degli application server di implementare una valanga di specifiche e la definizione dei profile, ovvero insiemi di specifiche dei componenti necessari ad una certa classe di applicazioni. Sul contenuto dei profili si attendono feedback della community, per il momento quello che è stato possibile dettagliare, essendo un dominio facilmente definibile, è quello per le applicazioni web, altre proposte sono ad esempio un profile per le applicazioni telco ed uno per quelle di integration, e via dicendo. Si affronta anche il cosiddetto ''pruning'', ovvero API deprecate e pronte ad essere rimosse dalla piattaforma, qui il primo candidato sono gli EJB Entity in favore di JPA. Tramite il concetto di extensibility sarà possibile integrare più facilmente framework opensource non facenti parte delle API della piattaforma (vedi Spring - specie ora che __SpringSource__ fa parte del comitato di definizione delle specifiche, Struts2, ecc.) evitando configurazioni collante con la JavaEE come listener, init properties et similia. Infine una carrellata sulle novità delle singole API:
	* anche le Servlet API buon ultime si beccano il trattamento delle annotation ed il web.xml conseguentemente diventa opzionale
	* compaiono nuove API: JAX-RS per il supporto ai webservice in stile ReST, JSR303 Bean Validation, __WebBeans__ (aka i componenti di Seam)
	* l'autenticazione diventa pluggable e più flessibile a livello di specifica (c'entrerà qualcosa Acegi?)
	* ritornano le Timer e __WorkManager__ API, dormienti da lungo tempo, che vengono aggiornate per avere maggiori possibilità di gestire i thread
	* JPA 2.0 guadagna finalmente delle Criteria API, in modo da essere sempre meno distante dalle relative implementazioni come Hibernate
	* le Servlet API supporteranno esplicitamente il file upload e l'interazione asincrona stile COMET
	* JSF 2.0 guadagna AJAX ed annotations

La data di rilascio prevista è Q4 2008 e mi sembra che valga la pena iniziare a guardare le build recenti di __GlassFish__ v3 che sono il naturale campo di gioco sul quale sperimentare il tutto prima del rilascio ufficiale.

!VeryQuickWiki Meeting!
Vedi: http://www.vqwiki.org/wiki/jsp/Wiki?JavaPolis2007
New version 3.0 alpha based on:
	* spring
	* acegi security

New features we want to add:
	* real security (role-based and group-based)
	* module (plugins)
	* clean URLs for Google indexing
	* pluggable parser as module
	* bruno asks for unit testing
	* refactoring: safe rename page
	* namespaces: pages and sub-pages
	* marcello asks for topic localization support

martijin's priorities:
	# setup 3-pages wizard
	# security
	# new parser/persistence refactoring
	# stable plugin API

other issues:
	* build with anything, maven for marcello
	* jamwiki was forked at version 2.7.9.1
	* migration tools
	* new markup from wikicreole.org

!![http://www.javapolis.com/confluence/display/JP07/Conf+Day+2|13/12/07 Conference Giorno 2]!!
!Keynote!
Ed eccoci al secondo keynote, ovviamente mangiato un numero congruo di brioche nonostante ci abbian levato i tovagliolini per intimidirci!
Sul palco di nuovo '''Bruce Eckel''', in uno spot promozionale di Flex talmente sfacciato da far guadagnare anche a lui il titolo di ''former star'', come già Erich Gamma l'anno passato con gli sbadigli Jazz. Mi deprime vedere un personaggio che ha contribuito così tanto a diffondere la conoscenza su Java trattare come scimmie ammaestrate ottimi tecnici di Adobe, capaci di ben altro, alle prese con il minimo sindacale per l'effetto ''wow'', che già di sfiga ne ha già portata a sufficienza ad altri.
Altro episodio poco elegante una slide di James Ward con i tempi di risposta di varie tecnologie RIA, che fa fare pessima figura a JavaFX prendendo in considerazione il benchmark della versione interpretata al posto di quella compilata, almeno fra tecnici e ad un keynote si potrebbe evitare di ''giocare sporco''. Non tutto è però da buttare, ci sono anche ''real news'' in questo promo, ossia l'annuncio del rilascio come opensource dei Flex (o LiveCycle) Data Services con il nuovo nome '''[http://opensource.adobe.com/wiki/display/blazeds/BlazeDS|BlazeDS]''', la tecnologia di remotizzazione nativa di Flash, con tanto di data streaming RTMP. Diventano pubbliche anche le specifiche del protocollo AMF, cosa che farà contenti i progetti opensource alternativi come [http://osflash.org/red5|Red5] e [http://www.graniteds.org/|GraniteDS], che finalmente potranno evitare di lavorare di reverse engineering in una situazione legalmente a rischio.

Torna quindi sul palco il padrone di casa Stephan Janssen per la presentazione ufficiale, dopo l'anteprima all'Adobe Max di Barcellona (vedi [[ResocontoAdobeMAXEurope2007]]), del vero ''highlight'' di questa edizione di __JavaPolis__, ossia la nuova versione V2 RIA del sito '''Parleys''', sul quale vengono pubblicati i video degli interventi della conferenza e di una serie di altri eventi tecnici consociati.

Dopo aver cercato di arricchire il frontend web con ogni effetto AJAX possibile, aver inserito Flash per una distribuzione efficace del video e nell'impossibilità di usare JavaFX per fare quello che aveva in mente, Stephan ha spiegato come è approdato con successo ad un client Flex su web ed ora anche AIR su desktop. Il rilascio effettivo è in coda a quello ufficiale di Flex3 ed AIR, ma sarà comunque disponibile a breve sul sito come beta per gli utenti registrati. L'applicazione sbaraglia facilmente tutte le demo viste su Flex e fa capire come le keynote strettamente commerciali non abbiano più efficacia, quando il pubblico può vedere dei case study di questo livello. Menzione speciale per [http://www.richapps.de/|Benjamin Dobler] che ha curato lo sviluppo del client Flex e sul palco ne ha presentato le funzionalità, con la visualizzazione sincronizzata di video degli speaker e slide che avanzano, ma soprattutto il meccanismo di tagging e aggiunta commenti per gli utenti direttamente sulla timeline. In poche parole, [http://www.parleys.com/display/V21Beta/|go get it]!

Dopo che ParleysV2 ha giustificato la presenza massiccia di Adobe all'evento, ''nulla di quello che ci presenta Sun nell'intervento successivo riesce a distogliere l'attenzione da Flex''. Ci prova Tim Crater con JavaFX, quindi Angela Caceido recupera un plugin per NetBeans che aggiunge al Mobility Pack la possibilità di creare su telefono giochini 2D con supporto SVG e webdesigner che farebbero felici giusto i retrogamer. Dopo il turno del progetto Blu-Dahlia per il Java su dischi Blu-Ray, un po' di fuffa di marketing su iniziative mobili, ma in definitiva marketing noioso, poco contenuto e demo poco ispirate.

![http://www.javapolis.com/confluence/display/JP07/Scala|Scala] by Martin Odersky!
	* .NET version less developed
	* on the other end of the spectrum to c# in language evolution of Java as a starting point
	* closure as control abstraction, implemented as instances of inner classes
	* adding complex numbers to a language as a native type (benchmark from Guy Steele's growing a language)
	* eclipse tooling support
	* the running overhead is low, the startup is big because of class generation
	* in some benchmark it is faster than jdk7 due to JIT optimization
	* functions are values, and values are objects
	* how to do erlang in scala (async messages) => with partial functions (defined at a location and query if defined)
	* future: object and functional languages difference will disappear

![http://www.javapolis.com/confluence/display/JP07/ServiceMix|ServiceMix] by Bruce Snyder!
Uno dei committer principali del JBI container opensource di Apache ci parla della versione attuale rilasciata e di cosa ci riserva il futuro.

Panoramica sulla versione 3.2:
	* costruito completamente sulla specifica JBI 1.0
	* il flusso dei messaggi predefinito è SEDA, ma sono disponibili anche altri
	* per la distribuzione su più server poggia su ActiveMQ e bisogna modificare il flusso dei messaggi su JMS
	* fornisce protocolli multipli d accesso
	* fornisce motori multipli d elaborazione dei dati

Nel prossimo __ServiceMix__ 4.0:
	* viene finalmente abbandonata la libreria xbean di Apache, un terrificante wrapper di Spring capace di creare complicazioni degne di Commons Logging, superata dal nuovo supporto XSD in Spring 2
	* Il packaging non sarà più nativamente JBI, ma sarà OSGi tramite l'uso di Apache Felix come container e ci saranno utility di bridge verso JBI, con supporto per la nuova versione delle specifiche
	* la dipendenza da ActiveMQ verrà resa meno stringente e sarà possibile usare altri bus JMS (la versione non rilasciata è già stata verificato con TIBCO)

Segue una panoramica su [http://activemq.apache.org/camel/|Apache Camel], un DSL in versione doppia Java/XML secondo i gusti, che descrive una API di routing che si appoggia a vari sistemi e sostituisce il componente esistente EIP di ServiceMix, che implementava solo alcuni dei pattern di routing presenti nell'omonimo libro, bibbia dell'enterprise application integration.
Infine un esempio di routing da web service HTTP a registrazione su database tramite JPA, con tanto di percorsi di errore gestiti con una semplicissima notazione try-catch come se fosse codice Java. É inoltre in fase di integrazione nel progetto STP di Eclipse un editor di flussi visuale realizzato da Bull, Cimero.

!![http://www.javapolis.com/confluence/display/JP07/Conf+Day+3|14/12/07 Conference Giorno 3]!!
L'ultima giornata la conferenza termina poco dopo prano e tutto passa piuttosto rapidamente, complice un po' di sana stanchezza. C'è il tempo per seguire un interessante intervento sull'adozione del [http://www.javapolis.com/confluence/display/JP07/A+Kanban+System+for+Software+Engineering|Kanban System], metodo nato nell'industria manifatturiera, per la gestione del processo di produzione del software, poi i saluti e ringraziamenti a Stephan e via sul treno che ci porta all'aeroporto di Charleroi dalla splendida stazione centrale di Anversa, completamente ricostruita all'interno con un cuore modernissimo, inimmaginabile dall'esterno.

----
Le presentazioni sono scaricabili in formato PDF qui:
	* [http://www.javapolis.com/confluence/display/JP07/University+slides|Presentazioni University]
	* per le giornate della conference è necessario crearsi un account sul wiki, i PDF sono nelle pagine dell'agenda giornaliera
	* i video invece si trovano ovviamente su [http://www.parleys.com/|Parleys]
