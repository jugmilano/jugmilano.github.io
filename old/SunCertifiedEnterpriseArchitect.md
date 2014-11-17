Vedi: http://www.sun.com/training/certification/java/scea.xml

Come ben sapete lo SCEA è l'esamone Sun per diventare Certified Architect.

La certificazione è composta da 3 parti/esami:
	# Quiz aka [http://www.sun.com/training/catalog/courses/CX-310-052.xml|Sun Certified Enterprise Architect for the Java Platform, Enterprise Edition 5 (Step 1 of 3) (CX-310-052)]
	# Progetto aka [http://www.sun.com/training/catalog/courses/CX-310-301A.xml|Sun Certified Enterprise Architect for the Java Platform, Enterprise Edition 5: Assignment (Step 2 of 3) (CX-310-301A)]
	# Essay aka [http://www.sun.com/training/catalog/courses/CX-310-062.xml|Sun Certified Enterprise Architect for the Java Platform, Enterprise Edition 5: Essay (Step 3 of 3) (CX-310-062)]

Il quiz è obbligatorio per il progetto, mentre il progetto e la essay vengono valutate insieme, per evitare scopiazzature globali.

Una volta lo SCEA era l'apice di un cammino professionale/educativo che avveniva solo dopo aver preso altre certificazioni, se non sbaglio SCJP e una a scelta tra SCJD, SCWCD, SCBCD, SCDJWS,SCMAD oggi la certificazione SCEA non ha vincoli particolari, solo un botto si soldi da versare a mamma Sun (senza sconto JUG, circa 1000 euri in totale).

Lo spettro degli argomenti toccati è molto molto ampio:
	* Application Design Concepts and Principles 
	* Common Architectures 
	* Integration and Messaging 
	* Business Tier Technologies 
	* Web Tier Technologies 
	* Applicability of Java EE Technology 
	* Patterns 
	* Security 

il livello richiesto non è particolarmente approfondito, l'ideale sarebbe avere avuto un esperienza professionale diretta su ciascuno di questi aspetti. Io che mi sono sucato un intero libro su EJB 3 lo ritengo eccessivamente teorico per la preparazione dell'esame e insufficiente per inquadrare gli EJB nel contesto richiesto dall'esame visto che sono solo un tassello del mosaico che è poi l'obiettivo dell'esame.

Io mi sono infilato nel fantastico mondo SCEA proprio nel momento di transizione da J2EE a JEE, mi sono quindi preparato per l'esame nella vecchia versione EJB2.1 e UML oriented per poi dare l'esame su EJB 3.0 e niente UML. Quello che mi ha disorientato di più è stata la totale mancanza di un testo di riferimento. Uno dei pochi libri che millantano copertura totale degli argomenti è [http://www.amazon.com/Certified-Enterprise-Architect-310-051-Certification/dp/0071488618/ref=pd_bbs_sr_1?ie=UTF8&s=books&qid=1231352193&sr=8-1|Certified-Enterprise-Architect-310-051-Certification] che di bello non ha neanche la copertina, le 2,5/5 stellette di Amazon sono meritatissime, in più come evidenzia il titolo è rivolto alla vecchia certificazione, per la CX-310-052 al momento sul mercato non esiste nessun libro, ma tante frattaglie disperse nella rete.
Uno dei documenti più centrati è disponibile sul sito ibm dopo doverosa registrazione all'indirizzo:
	* http://www.ibm.com/developerworks/edu/j-dw-java-scea-i.html

Scopro solo verso la fine della certificazione questo libro che a questo indirizzo:
	* http://java.sun.com/blueprints/guidelines/designing_enterprise_applications_2e/
è scaricabile un libretto completamente gratuito che copre buona parte degli argomenti SCEA.

Un altro elemento di costo credo di tutti i programmi di certificazione sono i simulatori di test, ce ne sono un po' di questi aggeggi
	* [http://epractizelabs.com/|Epractize]
	* [http://www.whizlabs.com/|Whizlab]

Ritengo che siano realmente utili solo quelli relativi al quiz. C'è di bello che se non passi il test ti ridanno i soldi... così dicono.

Una parte piuttosto impegnativa per me è stata il progetto che, ovviamente, non si trova mai il tempo di fare. L'impostazione farebbe rabbrividire qualunque agilista: è il festival Big design upfront, con specifiche approssimative senza nessuno a cui chiedere a parte il forum su [http://www.javaranch.com/|javaranch] ma come esercizio puramente intellettuale consente di affrontare problematiche che nell'ambito lavorativo abituale (almeno il mio) non si affronterebbero.

Uno degli scogli più fetenti che si incontrano tipicamente nel progetto è la scelta del tool UML da utilizzare. Apparentemente questa scelta banale può mandare gambe per aria il progetto,  ma soprattutto la vostra pazienza.
Vi racconto brevemente cosa ho combinato: prima scelta: Argouml 0.26, fico! open source! funziona! Faccio tutti i class diagram ... e i sequence ... ca##@ i sequence non funzionano, allora ti frego io ah! ah! uso Poseidon che si importa i file di Argo ... fiko! Non se lo fila nessuno dal 2007 ... mah, ottimo Poseidon l'ha fatto, ha importato i file di argouml, cià che aggiungo i sequence, poi i deployment ... argh! perchè non apre più il progetto?! É corrotto? Tua sorella quella z@ @	@##! Mi sono veramene rotto ora prendo un prodotto commerciale con trial di 30 gg e uso quello ... uso Visual Paradigm. Uff! Finalmente ho finito sti benedetti diagrammi ... scriviamo la relazione con le immagini generate ... ma che schifezze sono 'sti watermark?! Quanto pesa un'immagine?! 2 Mega?! Vabbè compro la licenza (altro centinaio di euri).

Insomma che di tool UML che non costino migliaia di euro non ce ne sono molti. Al momento scarterei:
	* [http://argouml.tigris.org/|ArgoUML] 0.26.2
	* [http://www.gentleware.com/products.html|Poseidon]

mentre promuoverei:
	* [http://www.visual-paradigm.com/product/vpuml/|VisualParadigm] con licenza pagata
	* [http://www.umlet.com/|UMLet] (che ho visto solo dopo e non ho sperimentato, ma sembrerebbe buono)

Nella preparazione del progetto sono particolarmente graditi - quasi obbligatori direi anche se non c'è scritto da nessuna parte - gli enterprise design pattern, il sito di riferimento è: http://java.sun.com/blueprints/corej2eepatterns/

ma esiste anche la versione riveduta e corretta e decisamente più utile e moderna all'indirizzo: http://www.corej2eepatterns.com/

Ultimo capitolo della saga riguarda la comunicazione dell'esito. La comunicazione avviene attraverso il sito: http://www.certmanager.net/sun

dopo dalle 4 alle 6 settimane dall'ultimo esame scritto. Ho aspettato 6 settimane e il sito continuava a dire che nessun utente esisteva con le mie credenziali a questo punto mi sono fatto avanti con l'assistenza, la quale mi risponde:

There is a technical issue in Prometrics testing system that is preventing exam scores from being transferred to our database for many candidates.  Until the issue is resolved, we have verified your passing exam result and manually granted your certification.  The exam results will not appear until a later date.  This will cause no problems with your certified status.

... a quanto pare sono '''Sun Certified Enterprise Architect'''! --PaoloBalzarotti

!Altri Riferimenti!
	* [http://java.sun.com/developer/Quizzes/ejb/ejb3.0_simplified_api.html|Enterprise JavaBeans 3.0 Simplified API Quiz]
