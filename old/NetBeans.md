NetBeans è un IDE Java acquisito da Sun quindi reso OpenSource ed ora gestito dalla community omonima, composta principalmente da dipendenti Sun: http://www.netbeans.org/

Con la versione 4.0 è stato operato un efficace refactoring che ha permesso a NetBeans di recuperare  interesse da parte degli sviluppatori, precedentemente minato da una pessima fama di strumento lento, pesante e divoratore di risorse.
In particolare l'integrazione di `Ant` a livello di gestione dei progetti ne semplifica particolarmente l'uso per i progetti che già usano tale strumento di build (in pratica la quasi totalità del software OpenSource sviluppato in Java).

Come Eclipse è composto da una RichClientPlatform ed una serie di plugin (NBM - NetBeans Module) che compongono le funzionalità dell'IDE con supporto per ''automatic update'':
::NetBeans Platform + plugin IDE = NetBeans IDE::

Questo modello ha due vantaggi:
	* rende l'IDE estensibile
	* mette a disposizione un toolkit RAD per realizzare applicazioni Swing complesse

L'offerta commerciale degli strumenti di sviluppo di Sun era infatti composta fino a qualche tempo fa da ''distribuzioni'' di NetBeans contenenti plugin proprietari, Java Studio Enterprise e Creator, analogamente a quanto fa IBM con WSAD. Attualmente tali prodotti sono stati dismessi e resi disponibili in opensource come plugin.

Ottimi articoli introduttivi e tutorial si possono trovare sul [<html>]<a href="http://www.netbeans.org">sito web della community</a>[</html>] e sul weblog del principale autore dell'help integrato nell'IDE: http://blogs.sun.com/roller/page/geertjan

Su quest'ultimo in particolare si trovano molte informazioni sullo sviluppo di plugin, per i quali la documentazione ufficiale risulta ancora carente, specialmente se paragonata alla ricchezza di quanto disponibile invece per Eclipse.

Qui invece un esempio di applicazione costruita su NetBeans Platform:
http://www.netbeans.org/kb/articles/feedreader-tutorial.html

!! Altre risorse !!
	* community su Java.net dedicata specificatamente a NetBeans: http://community.java.net/netbeans/
	* il wiki di NetBeans: http://wiki.netbeans.org/

!! Risorse in Italiano !!
	* mailing list italiana su ''netbeans.org'' [http://www.netbeans.org/servlets/SummarizeList?listName=nbdiscuss_it|nbdiscuss_it]. Dal sito: ''Discussione generica su NetBeans - uso, comunità, sviluppo - in italiano.  Suggerito per: Chiunque sia interessato a NetBeans e parli italiano.''
	* [http://translatedfiles.netbeans.org/index_it.html|progetto di localizazione in italiano] diretto da GiorgioFranceschetti@@se vuoi provare che effetto faccia NetBeans in italiano, puoi già scaricare la traduzione in corso dall'update center di sviluppo delle build localizzate: [http://deadlock.netbeans.org/hudson/job/nb6-community-ml/lastSuccessfulBuild/artifact/nbbuild/dist/nbms/catalog_all.xml.gz|L10N Dev Update Center]. Qui invece [http://blogs.sun.com/janicec/entry/worldwide_tour|un momento giustamente celebrativo] per l'avvio del progetto dal weblog di Janice, riferimento in Sun per le traduzioni effettuate dalla community.
