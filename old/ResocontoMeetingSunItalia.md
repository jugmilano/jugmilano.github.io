Il meeting in casa SUN di sabato 14 maggio 2005 ha riscosso innaspettato interesse tra i membri del JUG ed ha avuto l'importante effetto collaterale di farci conoscere molte persone nuove che si spera diventino ben presto nostri iscritti. Il meet e' iniziato piu' o meno alle 9:30 dopo che Marco Colombo (nella foto) ha intrattenuto a piu' riprese il pubblico che si presentava alla spicciolata con una demo di ''Looking Glass'' ( http://www.sun.com/software/looking_glass/ ). I 35-40 partecipanti hanno quindi assistito alla presentazione della comunita' JOB come da ProgrammaMeetingSunItalia.

''Ecco Marco Colombo all'opera''
attach:PICT0010.jpg

!Java Open Business!
Al di la' dei commenti dei singoli (che si vedranno sulla mailing list) questi sono stati gli argomenti portati come dati di fatto da Marco Colombo:
	* La realta' aziendale italiana e' composta per la maggioranza da imprese di piccole-medie dimensioni. Che apporto danno all'innovazione? Quante aziende sono in grado di costruire da zero un gestionale? Il software Open Source costituisce probabilmente la soluzione per permettere alle piccole aziende di gestire al meglio il proprio business senza l'onere di licenze milionarie, spostando così gli investimenti IT dalle licenze ai servizi e verosimilmente facendoli in questo modo rimanere in Italia. 
	* Si calcola che il 54% del codice scritto nel software commerciale sia di provenienza Open Source 
	* Statisticamente solo il 40% del software in commercio e' scritto in Java, C#, Python, PHP ecc. mentre il 60% e' su linguaggi legacy come il Cobol
	* L'Open Source e' legato ai linguaggi di ultima generazione. Non esiste un ''Open Cobol''
	* SUN ha accordi con testate giornalistiche del calibro del Sole 24 Ore o con il ministero dell'Innovazione affinche' gli annunci che compaiano sul sito JOB (http://www.javaopenbusiness.it/) abbiano risonanza immediata sui media.
	* Scopo: convincere alcune aziende ad ''adottare'' un software open source che sia d'aiuto nello sviluppo delle piccole medie imprese. Tale azienda diventera' il referente per una versione localizzata del software, compresa la documentazione e l'assistenza. SUN dara' il necessario rilievo a tale azienda per farla conoscere alla propria rete di clienti.
	* Statisticamente le ''killer app'' nascono all'interno delle community Open Source, non nelle aziende.

Conclusioni:
	* Parlo a voi JUG perche' so che dietro ognuno di voi si nasconde un'azienda
	* Tornate a casa dalle vostre aziende e comunicate il verbo di SUN: convincete la vostra software house a diventare maintainer della localizzazione e documentazione di un software Open e SUN pensera' al marketing.
	* Raccontate le vostre esperienze, fatevi conoscere come sviluppatori individuali, consulenti e aziende in relazione al vostro coinvolgimento nell'Open Source, proponendo articoli, interviste o indicando il vostro profilo su JOB.
	* SUN indichera' l'azienda X come mantainer e responsabile del software e guagagnera' sul supporto
	* Esempio ''Compiere'': il diffuso gestionale Open Source è uno dei primi progetti promossi tramite JOB
	* Il software che gestisce il portale JOB è uno dei progetti ospitati, ''OpenPSF''


''Pausa durante gli speech''
attach:PICT0011.jpg

!Open Solaris!
http://www.opensolaris.org/
	* Attualmente e' disponibile solo DTrace, un profiler real-time parte integrante del sistema operativo al costo di un 2% di CPU, particolarmente adatto per raccogliere dati su sistemi in produzione 
	* Entro la fine del 2006 il sorgente di Solaris sara' liberamente scaricabile con licenza CDDL, una semplificazione della MPL priva degli obblighi della GPL, appositamente studiata dai legali di Sun
	* Solaris 10 e' invece gia' disponibile in versione binaria
	* Il ritardo è principalmente dovuto alla finalizzazione degli accordi con i produttori di device driver per Solaris, che devono decidere se rilasciare il proprio codice in CDDL o mantenerlo proprietario 
	* Colombo ha detto: Linux non e' sufficientemente maturo per applicazioni enterprise. Solo ultimamente lo sforzo della comunita' Linux si sta rivolgendo in questa direzione.	* Open Solaris e' maturo ed e' pronto per le aziende, in quanto raccoglie l'eredità di Solaris
	* Il progetto Janus permetterà di eseguire codice binario per linux nativamente su Solaris
	* Agli sviluppatori: scaricate e fate beta testing o sottomettete nuove feature

!SUN ed il digitale terrestre!
E' il turno di Luca Barbieri che per introdurci la relazione fra Java e il Digitale Terrestre (DVB-T) ci racconta un gustoso aneddoto sulla nascita di Java, con James Gosling che si rovescia addosso il suo caffè preferito nel 1993 mentre lavora su un linguaggio per supportare la ''interactive television'' di Time Warner.

Si passa poi ai dettagli tecnologici relativi alla piattaforma Java MHP (Multimedia Home Platform), presente nei decoder DVB-T:
	* il segnale video è codificato in MPEG2, con previsione di passaggio ad HDTV nel 2010
	* ci sono canali audio multipli
	* il canale dati contiene la parte interattiva o uno stream IP vero e proprio
	* il segnale DVB-T è generato da un multiplexer che unisce i canali video, audio e dati
	* MHP è una sorta di J2ME, ma la versione 1.0.x presente nei decoder attuali ha API più vicine a PersonalJava
	* è possibile l'accesso alla Smart Card in lettura, la quale abilita ad esempio l'identificazione dell'utente per i servizi di e-government
	* le applicazioni vengono inviate in una modalità a ciclo continuo analoga al testo del televideo, denominata ''Object Carousel''
	* c'è un classloader diverso per bouquet di canali

Ed ora i contro, legati principalmente ai limiti dei decoder attuali, i quali non implementano ancora la versione 1.1 delle specifiche MHP, che si basa su J2ME e non su PersonalJava:
	* le applicazioni devono essere scaricate ogni volta, non esiste cache, per cui è necessario limitarne le dimensioni
	* non sono supportate le connessioni HTTP/HTTPS, bisogna scaricare librerie apposite
	* ci sono problemi di adattamento alle dimensioni dello schermo e differenze di visualizzazione fra i diversi set-top-box 

Per favorire lo sviluppo del Digitale Terrestre Sun ha attivato un laboratorio a Torino ( http://www.dttlab.it/ ) che fornisce servizi di certificazione terminali e verifica applicazioni.