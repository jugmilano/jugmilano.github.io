[[LiveFromJazoon2007]]

Cominciamo la seconda giornata portandoci nelle gambe la stanchezza del vino della sera prima ma dopo aver sistemato una volta per tutte il problema ''parcheggiamo la macchina a poco prezzo in una città che vanta i parcheggi più cari del mondo''. 

attach:img_6367.jpg

Arriviamo al nuovissimo centro commerciale multinegozio, multisala, multieffetto 

!Roy T. Fielding - A little REST and Relaxation!
''Day Software''

attach:_mg_6372.jpg

L'argomento REST. Il relatore è il più qualificato che ci sia e se non mi credete controllate nella wikipedia wp:REST. '''REpresentational State Transfer'''  non tratta solo di un modo per fare RPC ma di uno stile architetturale software che si fonda su vincoli e su principi: il primo è la centralità della '''risorsa''' che è referenziata univocamente da una URI. 
Roy Fielding racconta poi di come l'industria non lo abbia compreso, tanto da etichettare come RESTafarian i sostenitori di rest più zeolti. Però puntualizza anche come la stessa l'industria abbia appreso da REST il valore delle URI e dei possibili mashup che l'architettura REST mette a disposizione (un esempio per tutti le google maps).
Fielding termina con una chicca che tutti noi dovremmo tenere sempre presente e che probabilmente nasce da molta esperienza e buon senso: '''don't design by buzzword!'''

!Philipp H. Oser - Fighting the Java heterogeneity - a system integrator's perspective!
''ELCA Zurich''

attach:_mg_6375.jpg

La fuori c'e' tutto un mondo di stupenda tecnologia da utilizzare. Ma quando come architetti ci troviamo a dover iniziare una nuova applicazione da zero ci assalgono mille domande. Come far fronte all'eterogeneità dei sistemi da integrare? Quali tecnologie scegliere? In breve le opzioni che ci presenta Oser sono cinque: la dittatura di prendersi in casa la tecnologia di un solo vendor (modello Micro$oft), utilizzare un MDA che modellizzi ad un livello più alto la nostra applicazione. Utilizzare l'ultimo nuovo framework o un framework autoprodotto, utilizzare integration frameworks come spring e jMaki, adottare tutto uno stack tecnologico. Le soluzioni più sensate si scoprono essere la quarta e la quinta. 

!Burr Sutter - A Developer's Guide to SOA!
JBoss, a division of Red Hat

Burr Sutter corre come un treno. Parla a macchinetta e ci racconta ancora quanto la struttura ''Silo'' (ovvero con una interoperabilità tra i sistemi limitata) sia poco efficiente rispetto alle nuove architetture SOA. Il problema nasce dal fatto che i sistemi presenti nelle grandi aziende spesso siano molto eterogenei sia nella struttura che nella tecnologia. Per passare da silo a SOA occorre quindi inividuare all'interno della dominio applicativo quali siano i servizi che occorre offrire (ad esempio, accounting utente, fatturazione, reportistica, etc) e passare attraverso i cinque stadi di adozione (da lui definiti): il design del servizio (e meno male, ndr), enablement, la creazione infrastrutturale, l'orchestrazione, e la possibilità di creare un discovery dinamico. Il talk termina con una demo di molto effetto in cui semplicemente modificando un diagramma (sotteso da bpel e visto con rcp di eclipse) viene modificato la logica di business del solito "Pet Clinic". Unico neo di una presentazione brillante: ha pronunciato l'acronimo WSDL.

!Emmanuel Bernard - Hibernate Search: Unstructured Search for Hibernate!
''JBoss, a division of Red Hat''
attach:_mg_6379.jpg
La presentazione non è per nulla pretenziosa e lo speaker è molto WYSIWYG. Il tema è un add on di Hibernate nato per creare delle ricerce che siano degne di questo nome. Niente di nuovissimo, certo,  ma giusto per dare l'idea questo tool permette, dato un domain model creato con hibernate, di aggiungere criteri di ricerca che tengano in conto di cose come la prossimità dei nomi (i.e. scrivere "Betman" e trovare comunque il film "Batman begins"), la rilevanza del risultato, la non invasività di dover aggiornare la sincronia con indici full text. E scusate se è poco. Il tutto si basa su Apache Lucene e supporta architetture in cluster. Se siete HB8-addicted vi consiglio vivamente di dargli un occhio (http://search.hibernate.org).

!Emmanuele Sordini - Fabrizio Giudici - blueMarine - a desktop app for the open source photographic workflow!
Tidalwave s.a.s. / BloomingStars.com
attach:img_6383.jpg
attach:img_6381.jpg
Fabrizio ed Emmanuele ci presentano [http://bluemarine.tidalwave.it/|blueMarine] un software desktop Java scritto in java per quel che riguarda la gestione delle gallerie fotografiche. Lo ammetto sono rimasto piacevolmente sorpreso. In primis per l'interfaccia incredibilmente accattivante in grado di competere con prodotti analoghi commercializzati da grossi nomi. In secondo luogo per la ''responsiveness'' assolutamente ''snappy'' a cui sono poco abituato quando si parla di Java desktop. In ultimo per la quantità e qualità delle di features. Solo per rendere l'idea, dotandovi di un sistema GPS, può registrare su differenti tipi di mappe il percorso che avete compiuto durante un viaggio, renderizzarlo in 3D e mostrare esattamente dove lungo il tragitto avete scattato le foto in una mini preview!
'''Nota''': so che Fabrizio sta cercando di testare il prodotto su differenti piattaforme (soprattutto Windows e Linux dato che è stato sviluppato su di un Mac). Per cui se ci fossero dei volenterosi che fossero interessati ad aiutarlo contattatelo. I riferimenti li trovate al sito di [http://bluemarine.tidalwave.it/|blueMarine].

!Paul Sandoz - [http://jazoon.com/en/conference/presentationdetails.html?type=sid&detail=1920|Java API for RESTful Web Services]!
''Sun Microsystems, Inc''
attach:img_6390.jpg
Si basa sull'implementazione della specifica JAX-RS (JSR-311) di servizi RESTful. A me rest piace molto concettualmente anche se ho sviluppato un prodotto che utilizza REST non posso dire di conoscerlo bene. La specifica è ancora in fase di definizione e la reference implementation è abbastanza indietro da quello che ho visto ma secondo me la tecnologia promette bene proprio per la capacità di scalare tanto quanto può scalare un web server. Il talk ha trattato come creare servizi REST utilizzando [http://jersey.dev.java.net|jersey] ovvero la reference implementation (che ovviamente è ancora in stadio embrionale). Da tenere sott'occhio.

!Dean Allemang - Semantic Mash-ups using RDF, RSS and Microformats!
''TopQuadrant Inc.''
attach:img_6387.jpg
Dean Allen parla come un treno e stargli dietro è alquanto faticoso ma davvero ne vale la pena. L'argomento web semantico è sempre accattivante e lui lo tratta con la disinvoltura di chi lo frequenta da tempo. Ci mostra i meccanismi di base che si fondano sulle tecnologie RDF per la descrizione dei contenuti che permetteranno all'utente di selezionare i contenuti di cui vorrà usufruire in modo intelligente con un meccanismo simile alla Syndication. E a questo punto non ha proprio potuto fare a meno di pronunciare '''mash up''' che con Web3.0 ci sta sempre bene. L'RDF per avere un qualche valore semantico deve poi essere dato in pasto ai motori di ontologie OWL che produrranno le vere inferenze da cui estrapolare le informazioni. L'RDF può quindi essere prodotto seccamente accedendo direttamente ai dati da rendere semantici oppure utilizzando la tripletta XHTML+Microformat+GRDDL, utilizzando RDFa, oppure l'accoppiata RSS/Atom. I motori ontologici citati sono invece JENA e Oracle 10g che ne ha uno embedded.

!Marcel Waldvogel - PERFIDIX - A Generic Java Benchmarking Tool!
''University of Konstanz''

La presentazione riguarda PERFIDIX 2.0, un software che permette di creare dei benchmarking test al codice che si applicano facilmente a dei test cases creati con junit 4.x già esistenti. Il tool permette di ripetere i test in modo statistico specificando intervalli di attesa. Lo speaker sembra un poco spaesato e non troppo sicuro della materia che tratta ma forse è solo nervosismo da presentazione. In ogni caso un occhio potrebbe valer la pena di darglielo.
