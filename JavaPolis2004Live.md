Ed eccoci qui, il buon RenzoBorgatti ed il buon FilippoDiotalevi nonche' la gradita presenza di due illustri rappresentanti del JUG Torino, Daniele Galluccio e Simone Bordet. La connessione wireless ci permettera' di scrivere qualcosa live sul JUG su come stanno andando le cose.

attach:DSCN0875_640x480.jpg
''Ed eccoci qui, ritratti nella hall.''

!!Martedi' 14!!

!Spring in Action!
di Rod Johnson e Jurgen Hoeller

'''filippo''' Confesso di essere un fan di Spring. Rod e Jurgen non deludono sul palco, sono competenti e abili nello spiegare le caratteristiche ed i punti di forza dell'approccio lightweight di Spring. Peccato che restano sulle caratteristiche base, ma la cosa è giustificata perchè la platea è digiuna dell'argomento.
Il tutorial copre quindi solo le basi (dependency injection, aop, service abstraction); in particolare è solo accennato il discorso sui framework MVC, forse perche' loro stessi sentono che Spring è un po' debole su questo versante?
!Hibernate in Action!
di Gavin King e Christian Bauer

'''filippo''' Un mega speech di quasi tre ore per presentare Hibernate. A differenza del precedente su Spring, questo è piu' tecnico perche' il pubblico in effetti era preparato sull'argomento.
Devo dire che Gavin King, un mito dal punto di vista tecnico ed anche un ottimo bloggatore, delude abbastanza sul palco. Il suo balbettio e il continuo intercalare di "you know.." rende difficile l'ascolto. Comunque sulla sua conoscenza dell'argomento (cosi' come su quella di Christian) non c'e' nessun dubbio..
Gavin illustra anche le nuove funzionalità di Hibernate 3:
	* Supporto delle annotazione, come da specifica Ejb 3 
	* possibilità di inserire statement SQL nei file di configurazione (un po' sul modello di iBatis)
	* Filtri
	* Statistiche via JMX 


!BOF Session: Dependency Injection!
'''Renzo''' Oggi e' stata anche la serata del BOF. Le Birth Of a Feather session sono speech da un'ora ma molto piu' informali. C'e' un canovaccio su cui discutere, uno o piu' moderatori ed il pubblico si spaparanza come puo' nella stanza senza sedie. 
attach:javapolis2004_bof_dip1.jpg
Ma devo dire che l'esperienza e' davvero accattivante. Essere cosi' vicini ai grandi della programmazione mondiale, farsi quattro risate, interrompere senza problemi ne fanno un'esperienza coinvolgente. Tanto per dare un'idea di chi c'era in quella stanza in quel momento a parlare di dependency injection ecco una sommaria lista:
	* Rod Jonson, autore di "J2EE programming without EJB" nonche' project lead di Spring
	* Howard Lewis Ship, project lead Tapestry e HiveMind
	* Mike Cannon Brooks, project lead ad Atlassian, autore di Confluence
	* Eamonn McManus, SUN, JMX spec lead

attach:javapolis2004_bof_dip2.jpg
''Nella foto un po' scura si vedono di fronte in piedi Howard Lewis Ship, HiveMind con la barba e di spalla in piedi Rod Jonson, Spring con la camicia rosso scuro''.

E chissa' quanti altri che non sono stato in grado riconoscere. Con questa folla abbiamo parlato di Dependency Injection e per la maggiorparte di Spring e HiveMind dato che che i due spec lead erano i protagonisti di questa discussione. Devo dire che non mi e' sembrata una promozione di prodotti ma semplicemente uno scambio di idee su cosa siano oggi i framework per l'inversione delle dipendenze.
La mia impressione e' che questi framework siano l'emanazione delle buone pratiche di design ad oggetti e soprattutto della pratica TDD. Se si fa TDD e' difficile non sviluppare con inversione della dipendenza per via del fatto che il componente sotto test dev'essere configurabile dal punto di vista delle dipendenze. Tuttavia ho avuto modo di notare almeno due vantaggi per adottare un framework del genere anche se sviluppa TDD e si conoscono i principi (DIP, OCP ecc):
	* Ci sono vari modi di applicare l'inversione della dipendenza. Un framework aiuta nello stabilire uno standard
	* Un framework arriva di solito con una serie di servizi a corredo (thread pooling, connection pooling, AOP, messaging, ecc) che quindi non vanno reinventati o riscritti

Riassumendo: si puo' applicare dependency injection senza framework con buoni risultati. Il framework aggiunge standardizzazione e servizi.
!!Mercoledi' 15!!

attach:DSCN0876_640x480.jpg
''Beh che dire, la colazione era decisamente aggressiva... ricordo di aver fatto fuori 4 girelle con l'uvetta una dietro l'altra. Poi le sessioni filavano via lisce come la glassa :)''

!Keynote1!
'''filippo''' Parlano Stephan Janssen del BeJug e Rick Ross di JavaLobby. Dopo le dovute presentazioni e ringraziamenti, Rick Ross presenta il network di siti di JavaLobby (JDocs.com, JRoller. MyJavaServer e JavaLobby). C'e' una novità interessante per noi data da un nuovo portale http://www.jugcentral.com dedicato ai jug di tutto il mondo. Sarà il caso di darci una occhiata....
'''renzo''' Rick Ross ha espresso un concetto importante: la partecipazione nella comunita' Java non dev'essere passiva ma attiva. Non semplicemente seguire, leggere e studiare ma fare attivamente qualcosa in qualsivoglia forma: rispondere ad un quesito su un forum, scrivere un piccolo articolo su un sito, condividere con gli altri i propri bookmarks (vedi delicious) sono tutte forme attive di partecipazione alla comunita' Java (ed in generale a qualsiasi comunita'). Senza questo interesse attivo, che puo' essere piccolo a piacere, non ci puo' essere crescita collettiva. Sharare, sharare, sharare...
!keynote2!
'''renzo''' E' stato poi il turno di Tim Bray che ci ha portato la visione di SUN. Una presentazione in qualche modo sorprendente. SUN crede nei linguaggio non strettamente tipati perche' sono piu' espressivi in meno righe di codice rispetto a Java stesso. E fin qui... Ma la visione generale e' quella di riprodurre un modello .NET dove i vari linguaggi producono alla fine bytecode (CLR in casa M$). Cosi' Tim Bray si e' prodotto in una serie di apprezzamenti verso Perl, Python o Groovy arrivando poi a farci vedere esempi in Jython, confermando il mio sospetto: programmate in Perl, Python o Groovy perche' a breve vi troverete una shell in grado di accedere alle librerie del JDK ed essere eseguito come bytecode. L'apice e' stato raggiunto nella finale e nostalgica slide che declamava la potenza dei linguaggi loosely typed. Riassumendo:
	* I linguaggi loosely typed sono piu' espressivi di Java in meno righe di codice
	* L'approccio TDD permette di garantire la coerenza a run-time di un'applicazione anche nel caso sia stata scritta in un linguaggio senza controllo sui tipi a static time.
	* Il bytecode sara' lo stesso al di la' del linguaggio originante
Mio commento: anche se forse la ragione dell'orientamento di SUN verso questi linguaggi e' commerciale, si ritorna a parlare dopo 20 anni di tutto cio' che ha rappresentato un linguaggio come SmallTalk. Un certo passo avanti.

!Open Source Programming by Mike Cannon Brooks!
'''renzo''' Mike e' project lead di alcune famose applicazioni open source: Confluence e Jira. In questo speech ci ha parlato di alcune soluzioni tecniche adottate in Confluence e come e' stata gestita la coesistenza di una serie impressionante di librerie e framework open source (una sessantina). In sostanza molto del lavoro in Confluence e' stato di customizzazione ed estensione dei vari tool, framework. librerie:
	* WebWork interceptors
	* Filtri servlet
	* Appenders Log4J

ed il messaggio sottinteso e' quello di non limitarsi ad usare un tool open source al 4% delle sue possibilita' ma di esplorare a fondo cio' che puo' essere fatto. In questo modo Confluence gestisce un profiler che misura i tempi d'esecuzione dei vari componenti sfruttando interceptors che si frappongono alla richiesta dinamicamente. E molto altro ancora. 
'''filippo''' L'intervento di Mike ha scatenato qualche discussione tra di noi. In effetti non mi sembra di poter mettere la mano sul fuoco sulla qualità delle soluzioni tecniche che ha presentato; pero' mi è piaciuto molto suo "credo" sull'adozione dell'open source in azienda, riassumibile in alcuni principi
	* non scrivere troppo codice; "incolla" diverse librerie
	* usare molte librerie non è un problema, il problema è se non gestisce le dipendenze tra librerie
	* non usarle librerie superficialmente, ma studiale a fondo
	* trova e sfrutta gli extension point delle librerie
	* preferisci cio' che è lightweight e non intrusivo
	* estendi le librerie, cambiale, stravolgile, abusane.... (occhio alle licene pero')

!Event Driven Architectures by Gregor Hohpe!
'''renzo''' Gregor Hohpe e' una delle brillanti menti che thoughworks ha arruolato nella propria squadra. Visto il suo curriculum mi sarei aspettato qualcosa di piu' innovativo o perlomeno qualche idea non ancora sentita. In verita' c'e' sempre da imparare! Ma questo speech mi e' parso noiso. Il modello architetturale proprosto da Gregor e' frutto dell'esperienza sul campo nella costruzione di un'applicazione per il calcolo statistico sulla compilazione di questionari online. Dato che il calcolo dev'essere reso disponibile alla sottomissione del form da parte dell'utente, e' stato deciso di utilizzare un'architettura loosely coupled o in altri termini event driven (c'e' anche un altro sinonimo ancora, asincrono).
Questo modello ricalca nel JDK 1.4 cio' che e stato fatto con l'integrazione "Doug Lea" nel JDK 1.5. I concetti chiave da guardarsi sono:
	* Future: un riferimento al risultato di una computazione che avviene nel futuro
	* Callable: qualcosa che puo' essere richiamato e fatto partire e che restituira' quel risultato nel futuro
	* Executor: chi si occupa di riconcialiare cio' che e' stato eseguito con il Future a lui dedicato.
Si tratta infatti di un classico modello asincrono sul quale e' possibile agganciare politiche diverse (PointToPoint, PublisherSubcriber) e canali per il trasferimento dell'evento (una richiesta in ingresso) verso il thread pool pronto a lavorarci sopra. L'architettura e' stata poi farcita di altre amenita' come la sottoscrizione gerarchica by name ai topic (foo.bar.baz). Daniele mi ha fatto notare che in RendezVous di Tibco ci sono gli stessi concetti. Quindi, nulla di nuovo sotto il sole se non che in certi casi un'applicazione puo' beneficiare di un modello asincrono di computazione. Altre informazioni qui: http://www.eaipatterns.com/index.html.
!TestNG by Cedric Beust!
'''renzo''' Ho seguito lo speech di Cedric un po' per conoscerlo un po' perche' in effetti non avevo ancora avuto modo di approfondire il nuovo tool. L'impressione e' globalmente positiva. Non ho apprezzato alcune ragioni che Cedric ha dato per dimostrare l'inefficacia di JUnit:
	* La classe viene reinstanziata per ogni test
	* Non c'e' modo di dare ordinamento ai test

Io dico dipende dai requisiti. Quali erano i requisiti di JUnit? Un framework che permettesse l'esecuzione di unit test. Uno unit test e' una unita' di codice locale, non e' l'integrazione fra componenti che fanno parte di applicazioni differenti, non e' un test end-to-end. Per questi requisiti Junit va ancora bene. Se i requisiti sono: voglio poter fare tutto quello che Junit fa ma con in piu' la possibilita' di fare test d'integrazione ed acceptance test allora Junit ti ostacola. E' infatti questa la ragione per non volere la reinstanziazione ad ogni test. Avere stato tra un test e l'altro significa poterli ordinare e fare dei ragionamenti del tipo: se questo test che si connette al DB fallisce, allora salta tutti i test che dipendono da questo test, oppure settare una volta per tutte l'URL del web server a cui connettersi senza tirar fuori attributi statici.
Al di la' di questa critica, TestNG e' un framework innovativo, comodo e customizzabile, che si puo' utilizzare contemporaneamente per unit, integration ed acceptance test. Tra le funzioni piu' interessanti:

	* Se una classe eredita da una classe annotata come test, diventa anch'essa un test
	* Annotazioni JDK 1.5 come marker per i test (non piu' noiose convenzioni sui nomi)
	* Il concetto di gruppo di test
	* In futuro: test paralleli


!Make More Money by Mary Poppendieck!
'''renzo''' Beh che dire: ho conosciuto una donna battagliera, una che ha voluto capire come aumentare la propria produttivita' e quella del team guardando ai modelli industriali e macro-economici. Perche' certi modelli di produttivita' hanno successo? Quali sono gli aspetti sui quali intervenire? Da chi o da cosa prendere esempio?

attach:javapolis2004_poppend1.jpg
''Ecco la Poppendieck sfocata. Questa volta con le foto non me la sono cavata troppo bene. Perdono.''

attach:DSCN0866_640x480.jpg
''Da notare che tutte le presentazioni sono state tenute in un vero cinema multisala. Inutile dire che la comodita' delle poltrone e di visione panoramica, nonche' dell'audio erano il massimo che si puo' ottenere. Complimenti per l'idea.''

Da questo lavoro di ricerca negli anni scaturisce il Lean Software Development come insieme di pratiche agili (Lean = magro, scarno e quindi agile). Difficile ora riassumere le 4 ore di speech (questo era un sunto della university del primo giorno) in poche parole. Cerco di riassumere cosa mi ha colpito di piu':
	* La metafora del quotidiano: un quotidiano deve uscire la mattina seguente alle 5 dalle rotative, non importa come il team ce la fara' ma deve farcela. Allo stesso modo devono essere prese le deadline dal team.
	* Un'altra metafora: come deve subentrare una figura leader del gruppo?  Come deve scalare un team agile?
		* Per un piccolo quartetto Jazz il gruppo si autorganizza c'e' "Interplay" in gergo tecnico, tutti sono protagonisti. 
		* La big band ha bisogno di un direttore che indichi gli arrangiamenti, le linee guida, ma esiste ancora il concetto di solo da parte dei componenti che sono ancora liberi di  condurre.
		* L'orchestra non puo' permettersi di non accentrare la conduzione nel direttore d'orchestra e le parti per i componenti sono completamente scritte.
	* Quale implicazione ha produrre velocemente un risultato? Ha il non trascurabile effetto di impedire al cliente di cambiare idea! Se consegno l'ordine in 24 ore, il cliente si trovera' sull'uscio della porta cio' che ha richiesto senza aver avuto il tempo di decidere diversamente. Questo ha l'effetto di manetere il team concentrato, senza cambiamenti di contesto che producono spreco di tempo. Come regola: normalemente si passa l'80% del tempo in attesa di decisioni che altri devono prendere, aggiustare qualcosa che si rompe, correggere errori ecc. ed il 20% effettivamente a scrivere codice. Invertire queste percentuali!
	* Eliminare le perdite di tempo. Le sette cose da evitare: lavoro non finito, troppi documenti, features non richieste, cambiare continuamente attivita', troppe persone entrano ed escono dal team, ritardi, difetti.

Spero di aver reso l'idea. La cosa piu' interessante e' stato vedere come dai processi industriali e manifatturieri (toyota e' l'esempio piu' lampante) la Poppendieck abbia estratto un comportamento di produttivita' per lo sviluppo software.
!Apache Beehive by Eddie O'Neil!
'''renzo''' Apache non poteva mancare l'appuntamento con i light weight framework e l'ha fatto in questo caso in maniera originale. E complessa (allora e' heavy o light?). Beehive non e' solo un container nel quale immergere i componenti e lasciare a qualcun'altro la responsabilita' delle dipendenze. Fornisce anche una serie di componenti dipendenti standard alcuni dei quali forniscono servizi complessi come connettivita' database, oggetti Web, interfacce web services, frizzi, lazzi ecc. Mi perdonino i conoscitori "seri" di beehive, ma io ho potuto solo cogliere i seguenti aspetti rilevanti:
	* Un quarto tipo di IOC container: dopo constructor injection, setter ed interface alla Avalon, si possono usare gli attributi JDK 1.5 per evidenziare dipendenze esterne che spettano al container. In effetti l'idea e' bella: nello step di precompilazione vengono automaticamente generati i setter.
	* Il componente PageFlow permette di generare web application MVC basate su Struts e JSF, ma, piu' importante, applica il principio delle web continuations.

Attualmente non riesco a farmi un'idea piu' precisa per dire con tono sicuro di scrivere le proprie applicazioni usando beehive. Mi piacerebbe approfondire l'argomento.
!!Giovedi' 16!!
!The Viagra Thing by Greg Bollella!
Forse qualcuno di voi avra' gia' visto questa dimostrazione di cosa puo' fare la specifica Real Time for Java, magari a JavaOne. Per noi era la prima volta... perche' si chiama la viagra things? Semplice esperimento di fisica: calcolare in che modo far rimanere in equilibrio un asta mobile agganciata ad un perno che prima e' moscia e attraverso una serie di bottarelle arriva ad essere perfettamente dritta verso il soffitto.... mi sembra chiaro :)
A parte la simpatia della demo, e' stato interessante seguire cosa e' necessario fare per ottenere una latenza determinabile affinche' il programma abbia dei timing prestabiliti ai quali non si puo' sottrarre. [da finire]
!Java Puzzlers!
di Joshua Bloch e Neal Gafter
'''filippo''' Tra tutti gli speech di JavaPolis, questo è stato a mio parere il piu' divertente. Incredibile come due mostri sacri dello sviluppo di Java sappiano trasformarsi sul palco in una coppia di comici affiatati come pochi.
Il pretesto è di spiegare alcune stranezze e feature poco conosciute di Java attraverso 8 quiz... se volete mettervi alla prova non vi resta che registrarvi sul wiki del JavaPolis e saricare le slide...
!JBoss Party!
Abbiamo fatto un salto al JBoss party. E' stato proprio un mordi e fuggi. Fleury era impegnato nei convenevoli e tutti sembravano aver qualcosa di importante da dirsi. Filippo ha comunque fatto in tempo a scolarsi un cocktail ('''filippo''' Renzo.. era analcolico! '''renzo''' eccolo qua a cercare scuse... nessuno lo ha assaggiato :) come se fosse un latte macchiato! Dopo aver visto tutto cio' ci siamo avviati alla proiezione del film.
!The Incredibles!
E Perche' no? In un cinema si proiettano film. Ci siamo visti "Gli incredibili" con corredo di popcorn nell'ultima (per noi) serata a Javapolis, gentilmente offerto dall'organizzazione. Dato che la programmazione iniziava alle 15, qualcuno ha azzardato l'ipotesi che potevamo andarci a vedere i film invece delle conferenze!
!A cena con Eamonn McManus!
'''renzo''' Ci e' anche capitato, grazie all'intercessione di Simone Bordet, di fare una gradevole cena in compagnia di Eamonn McManus, JMX spec lead in SUN, Grenoble, FR. Erano presenti anche Filippo e Daniele Galluccio. La cena non era tecnica sebbene di tanto in tanto si sia parlato anche di lavoro. Ho avuto occasione di discutere di pratiche agili con Eamonn e sentire la sua. Una cosa su cui non avevo mai riflettuto e su cui Eamonn mi ha fatto riflettere e' stata l'applicazione di pratiche agile come il TDD per lo sviluppo di una specifica. Una specifica e' un qualcosa di particolare rispetto ad un'applicazione qualunque: si tratta di definire dei contratti a cui qualcun'altro dovra' poi aderire. Ovvio che posso usare TDD per le parti comprese sotto il nome di reference implementation, ma cosa fare per il resto? C'e' una parte alta di astrazione e poca concretezza. C'e' inoltre da considerare che le specifiche nella loro parte di interfaccia possono cambiare con molta cautela e non devono rompere la compatibilita' binaria. Con questa restrizione, al refactoring bisogna stare attenti. 
Abbiamo poi dovuto salutare perche' ci attendeva l'alzataccia per l'aereporto e il ritorno a Brussels in nottata. Finita l'omlette e l'ottima birra trappista, abbiamo detto arrivederci a Javapolis 2005.
!!Le conclusioni!!
Esperienza assolutamente consigliabile. Spanne sopra una Java Conference e qualcuno che e' stato a JavaOne ha detto che sono sicuramente paragonabili. Penso che la spesa dei 200 sia irrisoria rispetto a quello che ci si puo' portar via da JavaPolis in termini di esperienza, divertimento e motivazione. Un must.
L'anno prossimo: 
	# Mini-interviste audio-video con i protagonisti degli speech
	# Una BOF Session per conoscere tutti i JUG a livello europeo e scambiarci esperienze

