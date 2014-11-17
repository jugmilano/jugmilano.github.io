Presentazione tenuta al Decimo Meeting del JUG in data 26 Maggio 2005

Questa presentazione è la seconda di una serie di incontri sul Semantic Web. La prima parte è stata una introduzione di tipo teorico dove si è parlato in generale di cosa sia il web semantico e di quali siano i vantaggi di questo nuovo modo di concepire il web, con particolare riferimento al mondo dei Web Service. L'obiettivo di questa presentazione è invece quello di partire con la creazione di
semplici esempi, per vedere in concreto quali siano i vantaggi e le pontenzialità di questo approccio. In particolare verranno create delle ontologie con l'editor Protégé e verrà presentata una libreria chiamata Jena per l'interazione con file RDF e OWL. Gli esempi della presentazione saranno ispirati alla creazione di semplici ontologie per i JUG di Milano e Torino e per il sito web SIForge.org.
L'obiettivo sarà quello di mostrare un semplice esempio di integrazione di sistemi di tipo eterogeneo grazie alla definizione di una comune lingua franca per lo scambio di informazioni ricche a livello semantico.

'''Materiale della presentazione'''

	*Slide della presentazione @@
attach:SemanticWebInPratica.sxi @@ attach:SemanticWebInPratica.ppt @@
	*Ontologie create con Protégé 3.1 beta @@
attach:Ontologie.rar *
	*File Java con esempi di utilizzo di Jena @@ attach:Main.java

* per aprire correttamente le ontologie da Protégé è necessario verificare che i percorsi che consentono di includere altri file OWL siano corretti, in particolare gli imports, es: 
<owl:imports rdf:resource="file:/C:/Ontologie/jug.owl"/>

Ecco il resoconto dell'incontro `ResocontoMeetingMaggio2005`