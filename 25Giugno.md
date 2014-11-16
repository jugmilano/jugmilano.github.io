[[LiveFromJazoon2007]]

Non senza qualche difficoltà raggiungiamo in macchina il centro commerciale dove si svolge l'evento. Parcheggiamo a 4 CHF l'ora e ci dirigiamo verso il cinema che ospiterà le sale delle conferenze.
attach:img_6370.jpg
Di primo acchito l'impatto è molto fichetto e modaiolo, pure un po' troppo per dei '''geek''' come noi: colazione in uno spazio drink pieno di fibre ottiche con brioche salate, buone ma nulla a confronto di quelle bombe di crema di Javapolis06. 
La buona notizia è che abbiamo trovato subito tanti amici italiani. 
attach:img_6336.jpg

attach:img_6338.jpg
Ma non distraiamoci che abbiamo quattro giorni di conferenze da affrontare. Per cui come dicono da queste parti: "'The show begins... NOW!"'

!!Welcome note!!
!Andreas Knopfli!
''Managing director (Sw) AG Platinum Sponsor.''

In una lingua tedeschinglese biascicata ci ricorda come la svizzera sia un posto fico con un sacco di gente fica che fa cose fiche. Noi facciamo Java a Zurigo per cui siamo fichi. Poi qualche parola
su Java GPL, sulle nuove aperture al Mobile e sul fatto che è stata un percorsa molta strada da quando si è partiti nel 1995. Sì insomma lo sapevamo. O no?
Bla bla bla che abbiamo scelto la tecnologia giusta. Certo! Con quello che costa sta conferenza cosa mai dovrebbe dire?

!Christian Hunziker!
Marketing and Sales Director 
''Elka informatic AG, Platinum Sposnor''

Il tipo ha il vestito da marchettaro,  la faccia da marchettaro e a tutti gli effetti... è un marchettaro. Come sempre succede ci fa notare che la sua società ha versato un sacco di soldi per contribuire a JAZOON e oltre a questo proprio non va. Marketing way of life, guys!

!Farley Duvall!
''VP EMEA, Red Herring Inc.''

Parla del Red Harring magazine ed inizia a bullarsi una cifra sul fatto che un tempo era ayeha il più grande magazine worldwide per quel che riguarda la tecnologia. 
Adesso finalizzato alla tecnologia globale. Ok lo ammetto. ''ho dormito (noia)''.

!Ted Neward - [http://jazoon.com/en/conference/presentationdetails.html?type=sid&detail=1842|Why the Next Five Years Will Be About Languages]!
''Neward & Associates''
attach:_mg_6344.jpg
Brillante come sempre Neward parla di come il futuro della programmazione risieda nello sviluppo dei linguaggi. Una via è quella dei DSL (Domain Specific Languages) ma oggi anche con i linguaggi general purpose si può accarezzare l'idea è di utilizzare il linguaggio giusto per la soluzione giusta anche on top della JVM grazie alle sue nuove capacità di intrerpretazione dello scripting. Termina affermando che se il linguaggio che utilzziamo non è ancora pronto alle nostre necessità occorre migliorarlo e modificarlo noi stessi dato che i tool per realizzarlo sono a nostra disposizione. Un vero showman.

!Elmar Ledergerner!
Mayor of Zurich

Ci ringrazia di essere qui e spera che facciamo il futuro di java. Mi accodo.

!Lunch time!
Il Pranzo è a base di pasta (carbonara o bolognese) ed insalata con il solito liquidino francese al posto del nostrano olio e aceto.  "Carrbonnarra!". Spiego al cuoco che la carbonara non prevede l'uso della panna. Lui si apre in un sorriso e ripete in modo ebete "carrbonnarra!". ''Desisto''. La pasta è un po' scotta ma (a mio avviso) tutto sommato mangiabile.

!Aaron Digulla - [http://jazoon.com/en/conference/presentationdetails.html?type=sid&detail=560|What's wrong with Java? A look over the horizon.]!
''Globus Shared Service Center''

attach:img_6348.jpg
Aaron mostra subito i denti parlando della propria esperienza ventennale di programmatore in oltre venti differenti linguaggi un po' come quando alla posta mostri la carta di identità per dimostrare che sei la persona giusta. Critica Java perché - parole sue - ''I care'': ovvero dato che mi interessa il linguaggio ne mostro gli evidenti limiti per spingere a superarli. Una presentazione  piuttosto tecnica e legata al codice (''e ciò mi piace''): ci mostra come creare ed ordinare liste sia molto più verboso in java rispetto a liguaggi come python o groovy. Esemplifica ancora con gli ORM e la ceazione di applicazioni CRUD che dovrebbero essere task semplici ed indolori e che invece causano alle volte grandi difficoltà e implicano troppe tecnologie da imparare. Che dire: ha ragione. Java è verboso e per adesso non include closures e properties. Ma la soluzione che suggerisce, ovvero di integrare altri linguaggi di programmazione "java compatible" anche su progetti esistenti mi convince poco. Soprattutto per progetti in produzione e di una certa dimensione dove decisioni del genere sono difficili da far digerire a chiunque. Prima di tutti a se stessi. 

!Nati Shalom - [http://jazoon.com/en/conference/presentationdetails.html?type=sid&detail=1940|Space Based Architecture - Scalable as Google, Simple as Spring]!
GigaSpaces Technologies Inc.
attach:_mg_6350.jpg
Lo ammetto è il primo giorno e sono poco pratico delle aule e delle tempistiche. Insomma mi si è scaricata la batteria del portatile ed ho dovuto prendere appunti... a mano! come a scuola negli anni '80! Per cui eccovi gli appunti sbobinati a posteriori dalla mia Moleskine (che scriverli lì fa fico).
L'argomento è '''SOA''' (ovvero Service Oriented Architecture). Si parla dei problemi tipici di applicazioni '''Silo''': la scalabilità orizzontale non viene mai garantita per davvero ed i tempi di latenza degli stadi di lavorazione del workflow applicativo si sommano degradando il throughput generale. 
Ottimizzare significa perciò minimizzare la latenza degli statdi del workflow rendendoli indipendenti gli uni dagli altri e perciò traformandoli in servizi autonomi orcherstrati da un sistema di workflow esterno. Al posto dei soliti web services per far comunicare i servizi, Nati Shalom ci chiede di utilizzare gli spaces di [http://java.sun.com/developer/products/jini/index.jsp|JavaSpaces] (di cui la sua società fornisce un'implementazione) in modo di permettere la parallelizzazione della soluzione recovery delle failure e scalabilità orizzontale.
Dato il titolo altisonante temevo in una vetrina di vendita ma non è stato così. L'architettura proposta mi sembra coerente e si può provare ad implementare anche con prodotti open. Ma soprattutto non ha pronunciato WSDL! 

!Filippo Diotalevi - [http://jazoon.com/en/conference/presentationdetails.html?type=sid&detail=402|From J2ee to JavaEE... and beyond - A reference architecture for Java EE 5 Web applications]!
''Independent consultant''

attach:img_6355.jpg

E' un presentazione che conosco bene dato che Filippo l'ha tenuta al JUG Milano e ad altre manifestazioni riscuotendo sempre molto successo dato l'interesse che attornia l'argomento e la competenza con cui lo tratta. 
attach:img_6356.jpg
Filippo spiega come passare da una struttura J2EE 2.x verso una più moderna Java EE semplificando drammaticamente i design pattern del codice che sottendono un'applicazione web application standard J2EE. Non più codice boilerplate e forse non ancora la potenza di hibernate ma sicuramente l'aderenza ad uno standard riconosciuto internazionalmente.
Un grande plauso a Filippo che con il codice in italiano proiettato a tutto schermo difende le nostre origini! :D

!Danny Coward - What's in Java SE 7!
''Sun Microsystems Inc.''

Si parla di novità della versione 7 di Java SE partendo dal passato di crescita del linguaggio. Danny è un po' soporifero ma la sua posizione in Sun merita un enorme rispetto. Lo speech, prevedibilmente, si trasforma in una TODO list ma fornisce un bel quadro di quelli che saranno i temi caldi verso cui si stanno orientando in Sun. Di maggior rilevanza ''JavaFX'' integrato nel liguaggio, migliorie nell'ambito consumer (ovvero uno start ottimizzto della JRE) ed un installer nuovo per l'utOnto medio. Argomenti molto importanti per la diffusione di Java tra i non addetti ai lavori.
Di maggior interesse, dal punto d vista dello sviluppo, la modularizzazione di tutta l'infrastruttura del JDK che prevedrà un '''kernel''' contenente solo il minimo indispensabile per far girare il solito "hello world" con in aggiunta un sistema di aggiunta moduli chiamato JAM (che si accoppia al JAR - JSR 277) che supporterà un sistema OSGi (od OSGi like). Altre features nominate sono i ''superpackages'' (JSR 294 - che fanno un po' pensare alla frinedship del C++), una evoluzione della JMX e un interprete di JavaScript incluso nela JVM ''out of the box'' (JSR 223).

!Party!
attach:_mg_6358.jpg

attach:img_6361.jpg
