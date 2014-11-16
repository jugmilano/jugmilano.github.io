Resoconto dal vivo dal  [http://www.javapolis.com|Javapolis 2005] di Anversa

!Mercoledi' 14 Dicembre!
----

Incontro con [http://wiki.javapolis.com/confluence/display/JP05/Jeff+Jackson|Jeff Jackson] di Sun.
Il nostro primo impegno ufficiale e' stato un incontro con il Vice President of Java Developer Platforms Group di Sun per parlare della nuova iniziativa denominata [https://java-champions.dev.java.net/|Java Champions Project]. L'iniziativa, in fase di partenza ed ancora poco pubblicizzata, e' un tentativo da parte di Sun di avvicinarsi alle community e, piu' in generale, a tutte le persone che in qualche maniera tentano di diffondere la conoscenza di Java verso gli sviluppatori.

attach:20051712100311913-0-JavaChampions.jpg

''JBoss Seam'' by Thomas Heute
----
Una presentazione abbastanza piatta e con pochi esempi per quello che si propone come uno dei primi framework web basati su Java EE 5, nelle parole dell'autore l'anello mancante fra JSF ed EJB3, completamente basato su annotation. La connessione viene effettuata sfruttando i backing bean di JSF anche come facade di accesso ''stateless session'' agli entity bean, cosa che richiama le prime critiche nelle domande finali sulla rimozione di una corretta separazione dei layer applicativi.
Purtroppo l'inglese un po' stentato dello speaker non gli ha permesso di controbattere in modo adeguato, ma il framework sembra essere interessante, anche perche' introduce due ulteriori context a quelli gia' presenti nelle Servlet API, cioè ''conversation'' e ''process'', che fanno riferimento rispettivamente ad un automa a stati finiti e ad un business process, quest'ultimo implementato con jBPM sempre di area JBoss.


''Java Enterprise Edition 5''	 by Inderjeet Singh
----
Una preview delle novita' di Java EE 5 da parte di Inderjeet Singh, architetto di Sun ed autore delle __BluePrints__. Si parla molto ovviamente di EJB 3, con una puntatina a JSF e si continua a ripetere come un mantra quello che è l'obiettivo della nuova versione: ''ease of development''.
I descrittori XML sono ora opzionali e sostituiti da analoghe annotation, che ne rappresentano in qualche modo i valori di default. Le lookup delle risorse su JNDI vengono sostituite da ''dependency injection''. Le Persistence API non sono piu' legate al container EJB e sono disponibili anche in Java SE.
Le API per i web services confluiscono nella specifica JAX-WS che supportera' anche ReST.
Si conclude con una demo del solito Java __PetStore__, arricchito per l'occasione di un po' di funzionalita' in stile AJAX, come una lista delle categorie animata come il Dock di Mac OS X ed una visualizzazione master-detail senza page refresh.
Il rilascio previsto per Java EE 5 sembra essere slittato alla primavera del 2006.


''What's new in JSF 1.2'' by Roger Kitain
----
Sembra di capire che ci saranno discrete novita' con la nuova release di JavaServerFaces. Che sia giunta l'ora di mettere alla prova questa tecnologia ancora poco adottata?
Tra le novita' piu' grosse l'Unified Expression Language, un tentativo di dare una visione unitaria al caos creato dalla coesistenza degli expression language JSTL e JSF nelle stesse pagine.
E poi Ajax ovunque...componenti Ajax, integrazione Ajax, demo Ajax.

Un paio di link per iniziare:
	*https://bpcatalog.dev.java.net/  un repository di best practices, componenti e demo
	*https://javaserverfaces.dev.java.net/  l'home page di JSF


''Agile software development on large projects - Lessons learned'' by Johan Lybaert
----
Una presentazione di processo anziche' tecnologica, molto ben fatta, con tanto di video nelle slide, metafore varie, speaker che gironzola in bici prima di iniziare e bei fumetti dal tipico stile belga, ma che lascia grandi dubbi. I metodi agili per il program manager di Ardatis sembrano funzionare a meraviglia anche su progetti di grandi dimensioni... ma possibile che non abbiano avuto neanche un problema e che gia' alla prima riunione abbiano deciso di utilizzare Scrum ed XP al posto di RUP tanto per provare? Anche nei video tutti se la ridono, dai programmatori ai tester, tutti felici di lavorare insieme, utilizzano un orsetto (del cuore?) come token di sincronizzazione per integrare, vanno d'amore e d'accordo con la societa' che ha in outsourcing testing e Q&A, fanno gli scrum di scrum di scrum... ma dov'e' questo paradiso, nel paese dei Puffi? 


''Wicket''  by Eelco Hillenius and Martijn Dashorst
----
Yet another revolutionary web framework... a me sembra un Tapestry con meno XML e piu' Java, ma potrei sbagliarmi. Nessuno sembra aver fatto un balzo sulla sedia. Da rivedere.
In ogni caso sembra che l'approccio presentato sia particolarmente valido per avvicinare alla programmazione web chi abbia esperienza solo di Java SE e componenti AWT/Swing, ma soprattutto mal ''digerisca'' markup vari o altro. L'invasività di Java sul codice HTML è infatti ridotta al minimo, dato un prototipo esistente per renderlo dinamico è sufficiente inserire nei vari element un attributo ''wicket:id'' e poi il binding viene completamente gestito da Wicket in modo trasparente. 


Jug Leader BOF
----
Un breve incontro tra "attivisti" dei vari Jug presenti, con il BeJug che l'ha fatta da padrone raccontando un po' cosa succede dietro le quinte di un evento che ha richiamato quest'anno 2100 partecipanti.

Birreria Hollywood
----
Non poteva mancare il party in una delle birrerie adiacenti ai locali di Javapolis.

attach:20051712100312020-1-Birreria.jpg

!Giovedi 15 Dicembre!
----

''Spring Update'' by Rod Johnson
----
Confrontando il numero di partecipanti agli speech su Spring tra l'anno scorso e quest'anno appare chiaro che la popolarita' di Spring  e' oramai un fatto assodato. La sala e' letteralmente piena, con molta gente in piedi.
Due le cose che emergono
1 - Il team di Spring sta lavorando molto sul marketing del prodotto: nuovi case study vengono annunciati per il prossimo futuro, cosi come accordi con BEA e IBM per lo sviluppo di nuove tecnologie.
2 - Spring 2.0 (Marzo 2006) promette diverse interessanti novita':
	* semplificazione del XML con l'affiancamento di nuovi tag specifici accanto al classico <bean>
	* integrazione totale con AspectJ
	* miglioramento dell'infrastruttura per l'esecuzione di task asincroni
	* un nuovo portlet MVC framework

''Declarative Caching with Spring''by Steven Devijver and Alex Rui
----
Ancora Spring, ma meno pubblico. Si parla del modulo di cache di Spring Framework, attualmente facente parte del progetto Spring Framework:Modules
Non penso che passera' alla storia delle presentazioni.. si parla un po' di caching e un po' di aop, senza dire niente di nuovo. 
Sara' che Spring rende tutto cosi facile, sara' che sono argomenti abbastanza noti... il risultato e' che la gente pensa piu' al pranzo imminente che alla presentazione (PS: tutte le aspettative del pubblico sul pranzo verranno deluse miseramente entro pochi minuti, alla consegna della scodella di pastasciutta belga accompagnata da *cucchiaio* di ordinanza)

''Advanced EJB 3 Persistence'' by Linda __DeMichiel__ and Mike Keith
----
Tutte le feature relative alla Java Persistence API (JPA) raccontate dalla spec-leader di EJB3 (Linda __DeMichiel__) e da Mike Keith di Oracle.

''Architectural Challenges in the Design of an Application Server'' by Scott Ferguson
----
Purtroppo, nonostante il titolo altisonante, la presentazione e' stata tutt'altro che brillante, ma comunque con alcuni spunti interessanti. Si parla di Resin, piu' web container che application server di Caucho, società dello stesso Ferguson. La prima parte ha dettagliato la transizione fra le linee 2.* e 3.* di Resin, con l'introduzione di un meccanismo fatto in casa di dependency injection per gestire configurazioni sempre più complesse e motivazioni non troppo oltre il "facciamo una cosa piccola in casa che ci gestiamo noi" per non aver utilizzato uno Spring. Piu' interessante il modulo Quercus, in GPL come la versione base pure Java di Resin, che implementa PHP come linguaggio di scripting in Java con performance dichiarate di 4 volte mod_php ed alcune applicazioni note ''certificate'' come __MediaWiki__ e Mantis.

''Maven 2.0'' by Vincent Massol
----
"C'e' Hani nella sala?... per chi non lo sapesse, Hani e' quello che scrive il [http://www.jroller.com/page/fate|BileBlog]... penso che mi ami"
Effettivamente Maven o si ama o si odia (o si usa Ant, come il sottoscritto). Maven 2 promette di essere ordini di grandezza piu' veloce e di gestire al meglio una serie di problematiche emerse con le versioni 1.x.
Saltano all'occhio del profano il nuovissimo plugin per Eclipse che sembra essere veramente semplice da utilizzare ed il fatto che Vincent Massol ed altri stiano scrivendo un libro su Maven 2 che sara' scaricabile gratuitamente da Internet.

''Reliable open source ESB with Mule'' by Jos Dirksen
----
Delle due l'una: o il relatore ha tenuto nascosti diversi particolari dell'applicazione d'esempio, oppure Mule e' un prodotto veramente interessante. Anche per chi come me avesse gia' letto la presentazione sul sito, la demo ha avuto un effetto notevole.


!Venerdi 16 Dicembre!
----

''Agile Model Driven Development'' by Scott W. Ambler
----
Scott Ambler tiene benissimo il palco... è forse il migliore dei relatori che ho incontrato quest'anno, anche se il suo slang è meno semplice del linguaggio di altri.
Il suo speech è ovviamente molto provocatorio, e sottolinea le ipocrisie e le stranezze del mercato dell'informatica. Si parla principalmente di 'Agile Modeling' ed 'Agile Documentation', ma senza scendere troppo nei dettagli pratici, specialmente nel secondo caso. Comunque non mancano gli spunti interessanti.

''Database Refactoring'' by Scott W. Ambler
----
Dopo il primo speech mi sono convinto a seguire anche questo secondo sul ''database refactoring''. Il nome in effetti trae in inganno, visto che siamo oramai abituati a pensare al refactoring come ad una operazione semplice, a basso rischio e totalemente effettuata dall'ambiente di sviluppo. Con il termine ''database refactoring'' Scott intende invece una sorta di best practices per evolvere lo schema di un database verso una nuova struttura senza fare troppi danni. Meno interessante del previsto insomma, anche se non mancano mai le battute ad effetto che fanno riflettere.

!Le interviste!
Armati di webcam abbiamo provato a raccogliere alcune interviste a caldo ad un po' di personaggi visti in questi giorni! Perdonate la qualità non ottimale, purtroppo la folla non era poca e trovare un posto tranquillo davvero complicato!
	* [http://www.javapolis.com/confluence/display/JP05/Fabrizio+Giudici|Fabrizio Giudici] e [http://www.javapolis.com/confluence/display/JP05/Cristian+Colonello|Cristian Colonello] su [http://www.javapolis.com/confluence/display/JP05/Formula+One+Telemetry+with+Java|Formula One Telemetry with Java]:@@[http://www.jugmilano.it/media/IntervistaFGiudiciCColonelloJP05.mp3|audio MP3], [http://www.jugmilano.it/media/IntervistaFGiudiciCColonelloJP05.mp4|filmato MPEG4], [http://video.google.com/videoplay?docid=-534795405658425328|visualizza su Google Video]
	* intervista di RenzoBorgatti a Eamonn __McManus__, specification lead JMX@@ @@
[<html>]<embed style="width:400px; height:326px;" id="VideoPlayback" type="application/x-shockwave-flash" src="http://video.google.com/googleplayer.swf?docId=768201905078232887&hl=en-CA" flashvars=""> </embed>[</html>]
