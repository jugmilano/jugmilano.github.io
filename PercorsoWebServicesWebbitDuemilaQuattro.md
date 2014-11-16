Ciao a tutti,

sto meditando da qualche tempo un percorso sui Web Services ... un
piano "onesto" potrebbe essere (def w3c, perche stanno esplodendo
adesso, architetture orientate ai servizi, caratteristiche, soap,
wsdl, uddi, supporto java per ws, aspetti ancora immaturi dello
standard) ...

CHI E' INTERESSATO?

In particolare mi interesserebbe un taglio che mettesse in luce quali
aspetti dello standard dovrebbero essere meglio definiti e supportati
affinchè, come dicono in IBM, sia effettivamente la "prossima
rivoluzione" (con casi reali? ... )


!!Alcuni suggerimenti!!

	* GT: al fine di non generare dei contenuti troppo massicci (il gc non funziona ancora :) suggerirei di inserire solatnto i link, se facilemente raggiungibili via web. 

	* GT: per aggiungere una sezione tra la A.1 e la A.2 suggerirei di etichettarla A.12 (di default, A.1 sta per A.11, A.111, ... )



!!A.1 Definizione!!

	* "a substrate for building distributed applications using software running on different operating systems and devices (Tim Ewald, The Web Services Idea, July 12, 2002, Microsoft.com)

	* self-contained, self-describing, modular applications that can be published, located, and invoked across the Web (Doug Tidwell, Web services -- the Web's next revolution, November 29, 2000, IBM.com)

	* '''a software application identified by a URI, whose interface and bindings are capable of being identified, described and discovered by XML artifacts and supports direct interactions with other software applications using XML based messages via Internet-based protocols''' (W3C).


!!B.1  Le motivazioni dei Web Services!!
''Questa sezione andrebbe aggiornata ... chiediamo però se ha senso fare un'introduzione di questo tipo ... ''

	* Secondo IDC Corp. le vendite in tutta lindustria del SW saliranno del 6.3% world-wide questanno, fino a $194 bilioni di dollari, sebbene nel 2002 tale industria sia cresciuta meno del 1%. 

	* Ma quale settore sarà privilegiato a scapito di quale altro?

	* Secondo Goldman, Sachs &Co. la priorità principale dei CIOs questanno resterà il taglio dei costi, ma subito dopo lintegrazione delle tecnologie, spesso eterogenee, che si sono acquistate negli anni: si stima che le vendite di SW nel solo settore dellintegrazione cresca il doppio più veloce che nel resto del mercato, secondo Gartner Group. 

	* Viceversa, le vendite nel settore nelle-commerce scenderanno dell8% rispetto al 2002 e del 45.6% rispetto a due anni fa, secondo Gartner. 


	* Giganti come IBM, Microsoft, Oracle e BEA stanno aumentando il loro interesse nel settore dellintegration (in cui il maggior vendor è appunto IBM) a scapito di piccoli ma storici player come Tibco Software e Vitria Technology

	* Secondo Gartner entro la fine del 2004 la metà delle società nel settore del SW verranno acquisite o chiuderanno.	

	* Chi compra, al fine di evitare processi di integrazione troppo onerosi e poco mantenibili, preferisce una scelta tra un set ridotto di fornitori maggiori, che offrano non una tecnologia di integrazione proprietaria (peggio ancora se intrusiva) ma piuttosto limplementazione di uno standard comune (non intrusivo)  unimplementazione, appunto, dei Web Services.	  


!!C.1 Problemi prima dei Web Services  !!
'' Anche qui occorrerebbe esplodere i punti raccogliendo del materiale (i fatti) ... chiediamoci però se ha senso ... dobbiamo convincere chi ascolta che prima dei wb ci fosse qualche problema?''

	* Guerra dei componenti
	* Guerra dei linguaggi 
	* Firewalls
	* Mancanza di consenso


!!C.2 Paradigma!!

	* Architettura orientata ai servizi --- ''todo: occorre sicuramente dire qualcosa in più ... io sono interessato, chi altro lo è?''

	* Concetto di Catena di montaggio --- ''todo: come sopra''

!Il trasporto è (tipicamente) XML su HTTP!
	* XML perché tutti lo utilizzano
	* HTTP perché passa attraverso i firewall

!!C.4 Caratteristiche dei Web Services in dettaglio!!
''todo: ogni punto va sicuramente spiegato ... io sono interessato, chi altro lo è?''

	#Possono essere scoperti a run-time e supportano il dynamic binding dello stub
	#Self-Contained e modulari
	#Favoriscono linteroperabilità mediante protocolli standard
	#Favoriscono unaccoppiamento lasco dei servizi 
	#Espongono interfacce indirizzabili via rete
	#Suggeriscono interfacce a granularità grossa o, al più, multi-granularità
	#Sono trasparenti rispetto alla locazione
	#Sono componibili
	#Possono gestire errori senza intervento umano

!!C.5 Lo stack delle tecnologie dei Web Services!!
'' ... grrrunc ... ''

####
Descrizione##Implementazione##Altri aspetti##
Standard Messaging##ebXML RosettaNet##QoS Management Security Service Development ##

Service Composition##BPEL4WB, XLANG, WSFL##
Service Registry##UDDI, spec ebXML##

####
Service Description##WSDL##
Service Messaging##SOAP	## 
####
####
Trasporto##HTTP, SMTP, FTP##
####





!!D.1 Le tecnologie dei Web Services: SOAP!!
''todo: ogni punto va sicuramente spiegato ... si potrebbero usare direttamente le specifiche w3c, o qualche buona sintesi :) ''

	*Protocollo che descrive il formato dei messaggi: XML
	*Elementi esterni: ENVELOPE e ATTACHMENTS
	*Elementi interni: lheader
	*Info su: sicurezza, routing, formati, ecc
	*Elementi interni: il body
	*Contenuto vero e proprio del msg (richiesta o risposta)

!!D.12 Le tecnologie dei Web Services: SOAP!!
!La struttura del messaggio SOAP!

Ad esempio, un messaggio SOAP (RPC style) corrispondente all'invocazione del metodo ''getBookPrice'' su http potrebbe essere: 



[<java>]
POST /eBooks/price HTTP/1.1
Content-Type: text/xml; charset="utf-8"
Content-Length: 513
SOAPAction: "" 
User-Agent: Java1.3.1_04
Host: localhost:8080
Accept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2 
Connection: keep-alive  

<?xml version="1.0" encoding="UTF-8"?>
	<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/" 
	xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:enc="http://schemas.xmlsoap.org/soap/encoding/" 
	xmlns:ns0="http://www.xyz.com/xml" 
	env:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
	<env:Body>
		<ns0:getBookPrice>			
		<String_2 xsi:type="xsd:string">The Art of Computer Programming</String_2>		
		</ns0:getBookPrice>
	</env:Body>
</env:Envelope>
[</java>]


La cui risposta potrebbe essere: 



[<java>]
HTTP/1.1 200 OK 
Content-Type: text/xml; charset="utf-8"
SOAPAction: "" 
Date: ...
Server: Apache Coyote ...  

<?xml version="1.0" encoding="UTF-8"?>
	<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/" 
	xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:enc="http://schemas.xmlsoap.org/soap/encoding/" 
	xmlns:ns0="http://www.xyz.com/xml" 
	env:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
	<env:Body>
		<ns0:getBookPriceResponse>			
			<result xsi:type="xsd:double">190.0</result>			</ns0:getBookPriceResponse>
	</env:Body>
</env:Envelope> 
[</java>]

... oppure in caso di errore (interno all'applicazione): 



[<java>]
HTTP/1.1 500 Internal Server Error 
Content-Type: text/xml; charset="utf-8"
SOAPAction: "" 
Date: ...
Server: Apache Coyote ...  

<?xml version="1.0" encoding="UTF-8"?>
	<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/" 
	xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:enc="http://schemas.xmlsoap.org/soap/encoding/" 
	xmlns:ns0="http://www.xyz.com/xml" 
	env:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
	<env:Fault>
		<faultcode>env:Server</faultcode>
					 <faulstring>java.lang.RuntimeException .... </faulstring>
	</env:Fault>
</env:Envelope> 
[</java>]

	* XMl namespace sono analoghi a Java package (es. http://schemas.xmlsoap.org/soap/envelope/ specifica SOAP 1.1)

	* ''Vertical extendibility'' è quel meccanismo di estensione di un messaggio SOAP che consiste nell'aggiungere header che non inficino quelle applicazioni che non siano in grado di processarle

	*  In caso di errore l'elemento obbligatorio '''faultcode''' può valere ''versionMismatch'' (il messaggio non può essere processato da nodi con SOAP engine che non supportino almeno la versione indicata nell'header), ''mustUnderstand'' (il nodo non capisce la semantica di un header obbligatorio),  ''client'' (il fault occorre client side), ''server'' (il fault occorre server side).	

!!D.13 Le tecnologie dei Web Services: SOAP!!
!SOAP processing Model!

Tipicamente, tra sender e receiver di un messaggio SOAP ci sono uno o più intermediari. Nota che '''un nodo intermediario può soltanto aggiungere, modificare o cancellare header ma non può modificare il body. ''' In particolare, ci si riferisce alla cosiddetta '''horizontal extendibility''' come alla possibilità di indirizzare differenti parti di un messaggio SOAP a differenti riceventi. 

!SOAP Bindings!

...

!HTTP Bindings!

...

!SMTP-POP Bindings!

...


!!D.14 Le tecnologie dei Web Services: SOAP!!
!SOAP Encoding!

...

!!D.15 Le tecnologie dei Web Services: SOAP!!
!SAAJ!

...



!!D.2 Le tecnologie dei Web Services: WSDL!!
''todo: ogni punto va sicuramente spiegato ... ... si potrebbero usare direttamente le specifiche w3c, o qualche buona sintesi :) ''

	*Protocollo che descrive linterfaccia di un Web Service
	*Tipi: platform & language independent definizione XML del vocabolario del servizio 
	*Messaggi: definiti come composizione o aggregazione dei tipi (elementari)
	*Porte: definizione di operazioni come messaggi di input e di output
	*Binding: assegnamento delle operazioni e dei tipi referenziati messaggi a degli indirizzi fisici (URL) 
	*Servizi: dove le porte sono fisicamente deployate 

!!D.22 Le tecnologie dei Web Services: WSDL!!

!L'elemento ''types''!
...

!L'elemento ''message''!
...

!!D.23 Le tecnologie dei Web Services: WSDL!!
!L'elemento ''operation''!
...

!1 One-way!
...

!2 Request-response!
...

!3 Solicit-response!
...

!4 Notification!
...

!!D.24 Le tecnologie dei Web Services: WSDL!!
!L'elemento binding!
...

!SOAP binding!
...

!HTTP binding!
...

!MIME binding!
...

!!D.25 Le tecnologie dei Web Services: WSDL!!
!Style/Use!
...

!1 RPC/encoded!
...

!2 RPC/literal!
...

!3 Document/encoded!
...

!4 Document/literal!
...

!!D.26 Le tecnologie dei Web Services: WSDL!!
!Descrizione del servizio fisico: gli elementi port e service!

...

!l'elemento ''import''!

...

!!D.27 Le tecnologie dei Web Services: WSDL!!
!Early/Late Binding!

...



!!D.3 Come funzionano i Web Services!!

!Paradigma "find, bind and execute"!
	*Si realizza e si pubblica un WS in un registro UDDI :
	*Il client ricerca il WS nel registro
	*Il client costruisce dinamicamente il proxy
	*Il client invoca il servizio e riceve la risposta
	*Le API di ricerca e di pubblicazione di UDDI sono anchesse web services!

''Qui un bel disegnino ci starebbe proprio bene ... ''

!!E.1 Prodotti e Strumenti per i web services!!
''todo: si potrebbe dire molto di più ... chi è interessato a questo di indagine?''

!Piattaforme di Esecuzione e Strumenti di Sviluppo!

	*BEA Systems: WLS Server e Weblogic Workshop 
	*IBM: WebSphere A.S. e WebSphere Studio, con WSTK (Web Services ToolKit)
	*Microsoft: .NET framework e Visual Studio .NET

!!E.2 Supporto Java per Web Services!!

	* JAX-RPC (Java API for XML-RPC) è di fatto Java RMI over SOAP; fornisce uninterfaccia remota per RPC-style SOAP messaging. 

	* SAAJ (SOAP API with Attachments for Java) è unAPI che modella la struttura di un messaggio SOAP e anche qualche limitata message-delivery capability.
 
	* JAXM (Java API for XML Messaging) è simile a JMS (Java Message Service); fornisce una robusta infrastruttura di messaging per spedire e ricevere messaggi SOAP.


!SOAP Toolkits: API- vs. Stub-based Toolkits!
''todo: si potrebbe dire molto di più ... chi è interessato a questo di indagine?''
	* Un toolkit SOAP è un API usata per spedire e ricevere messaggi SOAP. Ci sono dozzine di SOAP toolkit in molti linguaggi: Java, C e C++, C#, VB.NET, Perl, etc.
 
	* Un toolkit stub-based usa il tradizionale RPC programming model, quindi uno stub RPC per comunicare con un Web service. Client-side si modella un Web service come un oggetto (remoto) che espone dei metodi. JAX-RPC è lo standard stub-based programming model di EJB 2.1.

	* Un toolkit API-based è usato per costruire messaggi SOAP (Envelope, Header, Body, etc.) esplicitamente. SAAJ è lo standard SOAP API in EJB 2.1. 
 

!Modelli di Programmazione!
	* JAX-RPC definisce tre modelli di programmazione: '''generated stub, dynamic proxy e DII (Dynamic Invocato Interface)'''. 


!Generated stub!
''todo: si potrebbe dire molto di più ... chi è interessato? ''

	* Il toolkit JAX-RPC, che è fornito dal vendor EJB, genera linterfaccia java RMI e il relativo stub in accordo con la descrizione WSDL, che verranno poi pubblicati in un JNDI ENC (Environment Naming Context). In questo modello lo stub è generato a deployment time.

!Dynamic proxy!
''todo: si potrebbe dire molto di più ... chi è interessato? ''

	* Un dynamic proxy è usato nello stesso modo di generated stub, tranne che limplementazione dello stub e linterfaccia remota è generata dinamicamente a run-time. 
	* Come sopra la generazione dellinterfaccia remota avviene in accordo con il documento WSDL, che  descrive le interfacce come porte; ogni porta può avere uno o più operazioni. Porte e operazioni sono analoghi a interfacce Java e metodi. 

!DII!
''todo: si potrebbe dire molto di più ... chi è interessato? ''

	* JAX-RPC supporta unaltra, ancora più dinamica API, chiamata DII (Dynamic Invocation Interface). DII permette di assemblare chiamate a metodi SOAP dinamicamente a run time. 
	* Lidea è la stessa di CORBA Dynamic Invocation Interface.
	*JAX-RPC DII permette di creare oggetti che rappresentano singole operazioni di Web Service, altrimenti modellati come metodi di uninterfaccia remota, e di invocare tali operazioni senza la necessità di accedere ad un service factory o di usare uno stub e uninterfaccia remota.



''todo: che altro ha senso chiedersi sui wb?  ... ''


!!T.1 I veri benefici dei web services!!

!Benefici di paradigma!
	* Scarso accoppiamento delle applicazioni
	* Evoluzione indipendente delle applicazioni

!Interoperabilità!
	* Stop a guerre di linguaggio e di componenti
	* Standardizzazione delle tecnologie di integrazione

!B2B!
	* Sfruttano Internet  Meno costosi delle VAN
	* Estensibilità

!EAI!
	* Integrazione non intrusiva


!!T.2 La realtà (secondo noi)! !!
''Questa è la nostra ipotesi iniziale (IH) ...  '' 

!I web services racchiudono vecchie idee sotto un cappello tutto nuovo!
	* XML può essere trasmesso anche con i socket
	* IDL è un ottimo linguaggio per descrivere interfacce
	* Si possono registrare servizi con JNDI o Active Directory

!Allora perché i web service avranno successo?!
	* Sono semplici
	* Cè interesse e accordo
	* Tutti i vendor li stanno spingendo in modo massiccio
	* Cominciano ad essere utilizzati nei progetti
 







 




attach:SoapMessageStructure.png
