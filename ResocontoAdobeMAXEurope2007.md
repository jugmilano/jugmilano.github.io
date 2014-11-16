Grazie alla neonata collaborazione con [http://www.adobe.com/it/|Adobe Italia], JugMilano ha la possibilità di esplorare nuovi orizzonti e fare un bel giretto a Barcellona per la prima edizione di '''Adobe MAX Europe'''!
Il nome MAX richiama l'eredità di Macromedia, MAX era infatti l'acronimo della conferenza ''Macromedia Exchange'', e JugMilano è qui proprio per saperne di più sul loro prodotto '''Flex''', toolchain per Flash basata su Java, ora diventato ''una delle tecnologie cardini di Adobe'' dopo l'acquisizione della società a fine 2005.

Clima splendido per ottobre, eccoci all'arrivo nel ''Barcelona International Convention Centre'', la location per la conferenza si presenta ottimamente, comoda e spaziosa, con accesso Wi-Fi libero ovunque. Rispetto alle conferenze viste finora l'organizzazione degli spazi è un po' diversa, poche sale grandi, giusto quelle per gli interventi principali e '''tantissimi interventi in sale piccole o laboratori''' perfettamente organizzati con dei bei iMac tutti in fila, che anche fossero solo arredo fanno la lora figura! Ampio spazio per la zona off-conference e cibo con una qualità tale da lasciar subito perdere __JavaPolis__, con tutto il rispetto per il low-cost dell'organizzazione belga.
Lascia perplessi invece lo scarsissimo numero di stand di espositori.
Ed ora ''un sano resoconto di quanto visto''!

!Keynote!
----
L'inizio della keynote è spettacolare, la scelta di avere sullo sfondo una proiezione su due schermi panoramici 16:9 affiancati ha una resa cinematografica eccezionale. Contenuti e stile sono quanto ci si aspetta da una società per creativi, con buona pace di quanto visto a tutte le java conference finora. Fra animazioni e interventi video, il nuovo CEO di Adobe, Shantanu Narayen, sforna un kit di concetti affatto nuovi ma sicuramente efficaci e in qualche modo universali, in quanto validi tanto per i creativi quanto per gli sviluppatori, un ottimo modo per inquadrare il contesto ed iniziare i lavori:
	* ''content is king''
	* ''make it personal''
	* ''less is (still) more''
	* ''movement has meaning''
	* ''create an experience, not a UI (like cinema does''
	* ''the internet, remixed''

Seguono le parti dedicate a showcase, con ogni sorta di applicazione ad effetto: il limite fra applicazione desktop con interazione dell'utente, contenuti su siti internet, esperienze al confine fra cinema e televisione, sembra costantemente svanire in un gran polpettone che può risultare un presente appetitoso o stucchevole a seconda di quanto vi piaccia Nelly Furtado, costante presenza di queste demo! Scherzi a parte, la parte dimostrative non fa che dar maggior significato al discorso a punti introduttivo del keynote su cosa con strumenti così potenti a disposizione faccia la qualità delle applicazioni.

Lato news dei prodotti, Flex Builder cresce ed inizia a fornire su Flash strumenti sempre più sofisticati quanto necessari come refactoring e profiling, ma che in ambiente Java sono ormai realtà consolidate, dando indicazione di quanto la maturità degli strumenti per Flash/Flex rispetto a quelli esistenti su Java sia ancora lontana. Il prossimo Flash player invece includerà API grafiche 3D ed un motore per effetti grafici 2D (''hydra''). Interessante anche la sezione sulle acquisizioni, con Buzzword, che produce un word processor in Flex, e Scene7, che ha tecnologia e servizi di publishing audio/video real-time su web, visti entrambi come prodotti che avranno impatto come tecnologie su tutta l'offerta esistente e non come semplici scatole da aggiungere allo scaffale (sarà vero? vedremo...)
Viene infine puntualizzato il ruolo della rinnovata [http://www.adobe.com/devnet/|Adobe Developer Connection] (ma si chiamano tutte ADC?) come fonte principale di informazioni tecniche e punto di contatto con la comunità gli sviluppatori.

!AIR Overview by [http://www.webkitchen.be/|Serge Jespers]!
----
La prima scelta di speech da seguire nelle sale piccole è piuttosto sfortunata. Lo speaker designato non arriva per tempo e dopo un minimo di attesa a vuoto viene sostituito al volo da Serge Jasper, che fortunatamente riesce a tirar su un intervento decoroso e spesso interessante. Viene presentata una panoramica su '''AIR''', un ''analogo Flash/Flex di Java __WebStart__''.

Si parte dall'analisi del business case di eBay, che pur non desiderando modificare l'interfaccia del proprio sito web per non confondere gli utenti pi fedeli e di vecchia data, ha sperimentato AIR come modalità alternativa di accesso al sito che permettesse un'interazione più ricca in modo tale da soddisfare un target di utenti più esigente.

La panoramica segue un po' di demo prese dal sito Adobe, con indicazione delle funzionalità che intendono mostrare:
	* uso di effetti, canali alfa ed animazioni sulle finestre
	* z-ordering e bordi irregolari
	* un'animazione con una palla che sembra passare da una finestra all'altra
	* un esempio di applicazione mashup fra google e una rubrica indirizzi aziendale

Tutto sommato un buon antipasto, semplice ed efficace.

!Flex Roadmap by [http://quietlyscheming.com/blog/|Ely Greenfield]!
----
Le evoluzioni di Flex come linea di prodotto prendono strade diverse a seconda del target, designer o sviluppatori, per i primi c'è Thermo, per i secondi c'è Flex Builder. Le direzioni dell'SDK sono invece principalmente rivolte a supportare primitive grafiche di basso livello con MXML Graphics, al posto dello standard SVG che risulta scartato come opzione in quanto troppo complesso e poco supportato. Per migliorare le possibilità personalizzazione dei componenti vengono distinte le operazioni di skinning (modifica look) e styling (modifica parametri di un dato look) e l'evoluzione è verso un modello MVC a la Swing. 
Nessuna news sull'eventuale supporto a Flash Lite, cosa che purtroppo dalle dichiarazioni raccolte anche fra gli stand risulta ancora molto lontano e comunque vincolato al lavoro del team del Flash Lite Player che deve prima ultimare un corrispondente Lite del Flash Player 8 (ora siamo al 7 con FL 2.1), cosa che dipende a sua volta dalla disponibilità di adeguata potenza di calcolo offerta dai telefoni.

!__LiveCycle__ ES Seminar by [http://christophrooms.com/|Christoph Rooms]!
----
Finora associavo il nome __LiveCycle__ alla componente server-side di Flex - gli ex Flex Data Services rinominati poi  __LiveCycle__ Data Services - invece in questo seminario hands-on scopro che [http://www.adobe.com/products/livecycle/|LiveCycle ES] è in realtà l'offerta SOA di Adobe, sicuramente orientata ai workflow PDF, ma il prodotto è probabilmente la cosa più interessante vista finora con l'occhio da architetto o programmatore Java. In realtà l'occasione per scoprirlo è stata piuttosto fortuita, facendo comunella con i pochi Javisti all'orizzonte ritrovo Stephan Janssen (BeJUG, __JavaPolis__, ecc.), si va a bere in compagnia, si conosce lo speaker e si scopre tramite sano networking qualcosa che era completamente sfuggito tramite i tradizionali canali di marketing e news IT. Il prodotto server è un ESB basato su Java EE, non supporta standard come JBI, ma ha un suo packaging come JAR più descrittori XML decisamente più semplice, ha un insieme ricchissimo di bridge verso protocolli e tecnologie note (EJB, file system, FTP, mail, ecc.) come ogni strumento di questo tipo che si rispetti, più una serie componenti pre-confezionati, fra cui quelli citati per i workflow PDF, che rappresentano la funzionalità principale per la quale viene proposto uno strumento che comunque nasce come ESB general-purpose. Non mancano delle ottime interfacce web, sia di amministrazione che per utenti finali, quest'ultima realizzata con Flex. Entrambe sono personalizzabili tramite IDE dedicati che sono delle estensioni di Eclipse, quindi analogamente al Flex Builder caricabili come plugin su un Eclipse esistente, con design grafico dei workflow e delle relative interfacce utente per le parti con interazione umana.

Non contento, incuriosito dalla rapidità di realizzazione di un esempio reale di workflow PDF e dalla qualità del risultato, vado anche a seguire la presentazione di [http://charltonb.typepad.com/|Charlton Barreto], che tratta l'argomento SOA più da architetti, che mi conferma la qualità della proposta e quanto Adobe, come outsider in questo campo, possa offrire, principalmente grazie all'uso di Flex a ad una visione più ad ampio spettro, rispetto alle soluzioni più note di BEA, TIBCO ed IBM.

!AIR Local DB Access & __DataSync__ by [http://coenraets.org/|Christophe Coenraets]!
----
Avevo già avuto modo di conoscere ed apprezzare lo speaker in precedenza per gli ottimi tutorial sul suo weblog, ma soprattutto per l'idea di rendere disponibile un utilissimo bundle flex+tomcat, probabilmente il modo più semplice per mettere in piedi un ambiente di esecuzione flex, ed anche come speaker si dimostra all'altezza. Preciso, ma spesso anche ironico, illustra l'uso del database embedded SQLite in AIR e le relative API di accesso. SQLite è un db embedded su file singolo, supporta SQL-92 e permette connessioni multiple. Le API di AIR sono semplicissime e ricordano molto JDBC, ma trattandosi di API ottimizzate per un ambiente GUI supportano anche l'accesso asincrono, con la possibilità di accodare richieste al database e ricevere un evento quanto queste vengono completate, in modo da non bloccare l'interazione con l'utente. Sono supportati ''prepared statement'' (con paremetri per nome e posizione esattamente come in JDBC), ''transazioni'' e ''metadata'' per il caricamento dinamico della struttura del database: uno degli esempi di applicazione proposti sul weblog è proprio un SQLite Admin realizzato in AIR.

Segue una discussione sulle tipiche strategie di accesso ai dati applicabili a Java come a AIR/Flex, in ordine di complessità:
	# SQL embedded in view
	# DAO (scherzosamente definito come ''built on cut-and-paste technology''!)
	# ORM (qui sembra che anche in AIR ci sia qualcosa di disponibile che sfrutta un analogo delle annotations in __ActionScript__)

Da questa si prosegue con un esempio di implementazione di DAO che usa le __DataSync__ API, in grado di rendersi conto quando l'applicazione è o meno connesso e accodare le richieste su un SQLite locale fino a renderle persistenti lato server non appena la connessione ritorna disponibile. In tal caso però la parte server richiede la presenza dei Flex Data Services.

!Parleys V2 by Stephan Janssen!
----
L'intervento più rilevante per chi sviluppa in Java non poteva che venir fuori da uno sviluppatore Java. Ed ecco che Stephan, dopo una brevissima introduzione nella quale riassume il suo inarrivabile CV con la modestia cui è abituato chi lo conosca, va subito al sodo e racconta la sfida dell'evoluzione di Parleys, sito lanciato in occasione di __JavaPolis2006__ (vedi [[LiveFromJavapolis2006]]) per la pubblicazione del materiale delle conferenze.

La prima versione di Parleys è un'applicazione che nasce dalle competenze maturate su Confluence, usato come base per implementare quello che sostanzialmente è un sito web 2.0 su tecnologie Java EE ''lightweight'', cioè:
	* Resin come servlet container veloce
	* __WebWork__ come framwork web con Velocity come motore di templating
	* Spring e Hibernate DAO per la persistenza su database

Ma non è la parte server ad essere l'aspetto rilevante, quanto il client HTML+__JavaScript__, che durante la sua evoluzione, si è trovato a dover affrontare i seguenti problemi:
	# [http://dojotoolkit.org/|DOJO]: problemi nel supporto ad Internet Explorer, difficoltà di aggiornamento dalla versione 0.4 a 0.9 che ha reso gran parte delle API incompatibili
	# passaggio a Prototype + Scriptaculous per gli effetti grafici, problemi nel marshaling su JSON (più veloce di XML)
	# problemi nel supporto al pulsante back e alla cronologia del browser
	# __XmlHttpRequest__ non è supportato lato server da __WebWork__ e lato client non è disponiile su tutti i browser e non è una API standard
	# necessità di sincronizzare Flash e __JavaScript__ per l'indice dei video tramite la External Interface che richiede Flash 8
	# sicurezza (un utente è riuscito a votare una presentazione 1000 in una scala da 1 a 5!)

Sembrava di essere giunti ai limiti fisiologici delle tecnologie AJAX, e da qui è nata l'idea di inserire una tecnologia RIA più potente in modo da risolvere quanto emerso ed aggiungere qualcosa di nuovo:
	* modalità full-screen
	* possibilità di fruire i contenuti video in modalità offline
	* uploading di video e presentazioni
	* maggiori possibilità di interazione per l'utente

La prima scelta era ovviamente caduta su JavaFX, ma dopo aver contattato le sue fonti in Sun, Stephan ha dovuto ammettere a malincuore quanto la tecnologia non fosse ancora matura per i tempi richiesti. Invece, dopo un primo prototipo promettente, nel quale Flex ha dimostrato di essere un ottimo compromesso fra risultati e possibilità di riciclare competenze esistenti su Java, è ora in fase di completamento Parleys V2, client Flex su web ed AIR su desktop per Parleys, del quale viene presentata un'anteprima notevole, in vista del lancio ufficiale a __JavaPolis2007__ (vedi [[ResocontoJavaPolis2007]]).

Segue una descrizione di Stephan, che come sviluppatore Java non è certo il primo arrivato, sul suo personale approccio da Javista a Flex e su come abbia sfruttato le sue competenze Java, cercando analoghi soddisfacenti in ambito Flex degli strumenti con cui siamo abituati a lavorare. Qui la situazione non è sempre rosea, se una libreria come Cairgornm può render bene in Flex il paradigma MVC, per annotazioni ORM, AOP, Inversion of Control/Dependency Injection non sembrano esserci o poterci essere ancora analoghi utilizzabili. In ottica di un processo di sviluppo test-driven, ci sono librerie come AS2Unit o __FlexUnit__, ma manca poi per la parte di test funzionale un analogo di un Selenium, a parte alcuni prodotti commerciali che sono stati annunciati. Mancano inoltre strumenti di analisi del codice, come __FindBugs__ e __CheckStyle__, che possano rendere più semplice il controllo di team di sviluppo grandi e magari distribuiti. Da questo punto di vista Stephan non considera ancora Flex adatto ad un uso industriale su larga scala (qui fa un esempio di un ERP da 500 schermate), ma ne guarda con interesse l'evoluzione visti i risultati ottenuti con Parleys v2, che peraltro si candida facilmente come l'applicazione Flex migliore vista finora. Ciò che risulta particolarmente interessante è come lato server non sia cambiato molto da AJAX a Flex, infatti tramite la libreria as3corelib anche Flex è in grado di digerire JSON. In prospettiva l'unica evoluzione sul server sarà l'eliminazione di Confluence in vista di una soluzione più semplice basata su POJO/EJB3 e JSR-311 per avere URL ReST e JSONObject per la serializzazione da Java a JSON: uno stack applicativo decisamente interessante.

----
Le presentazioni della conferenza sono scaricabili in formato PDF (ma và!) al seguente indirizzo:
http://adobemax2007.com/europe/sessions/library/

Un grazie ancora a Marco Casario e Federica Gilardi.
--MarcelloTeodori
