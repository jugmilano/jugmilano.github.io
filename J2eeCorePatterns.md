I J2ee core pattern rappresentano la 'best practice' suggerita da Sun per l'implementazione della classica architettura a tre livelli tramite J2ee.
La rappresentazione classica è la seguente (è tratta dalla prima edizione, nella seconda ci sono diversi pattern in piu')


[<html>]<img src="http://java.sun.com/blueprints/corej2eepatterns/images06/figure06_02.gif"/>[</html>]

Tutti i pattern, oltre che essere illustrati nello stesso sito della Sun, sono raccolti nel libro [<html>]<a href="http://java.sun.com/blueprints/corej2eepatterns/AboutTheBook.html">Core J2EE Patterns: Best Practices and Design Strategies</a>[</html>]

----

FilippoDiotalevi:
Dopo le discussioni avute durante la pizza post-secondo meeting ho pensato che sarebbe interessante cercare di presentare i pattern con un approccio alternativo, al prossimo WebbIt.

Infatti i pattern sono spesso presentati come ricette di cucina: "prima fai il front controller, poi l'application controller. Mettici qualche filtro. Prepara un context object." Tutto questo perché è best practice.

Siamo stati d'accordo (penso) su un punto. Il pattern è una buona soluzione ad un problema ricorrente. Il punto è capire SE hai quel problema. Perche' se non ce l'hai, il pattern sovraccarica il design dell'applicazione.

Quindi l'approccio alternativo che vorrei usare è: non usiamo pattern. Partiamo da una pagina HTML che al submit richiama una servlet.
Quindi chiediamoci: quand'e' che questa soluzione ci crea problemi?
Se la risposta è: mai, ci fermiamo. Altrimenti, iniziamo a camminare... (rifattorizzare, Bruno?)

Che ne dite?