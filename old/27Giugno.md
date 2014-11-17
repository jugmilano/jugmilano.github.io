[[LiveFromJazoon2007]]

attach:img_6369.jpg

!Vedran Lerenc - Effective Java Heap Memory Analysis on Enterprise-Scale!
''SAP AG''
attach:img_6396.jpg
Un talk molto interessante che copre il territorio del ottimizzazione del memory footprint di un'applicazione java. Lo speaker ci ha mostrato con grande competenza come sia possibile creare un dump della memoria heap della JVM ed analizzarlo tramite un tool chiamato Memory Analyzer creato da SAP e liberamente scaricabile ed utilizzabile (nonostante sembri essere una trial ma ho avuto il beneplacido dell'autore). 
Il tool permette di vedere gli oggetti che sono "live" al momento del dump e quindi di riconoscere dei pattern di strutture inefficienti (alti volumi di oggetti vuoti, link ricorsivi, etc) ma anche di scoprire per ogni oggetto quale sia la sua retained size ovvero la quantità di memoria che sarebbe liberata una volta tolti tutti i riferimenti all'oggetto e lanciato il garbage collector. 
Per trovare il tool è sufficiente cercare "SAP Memory Analyzer" in google.

!Peter Walker - What's coming with JBI 2.0!
''Sun Microsystems''
attach:img_6400.jpg
Un talk non molto tecnico che scorre le novità che si stanno specificando in JBI 2.0 (JSR312). Qualche puntualizzazione iniziale sul fatto che, nonostante piccoli overlap JBI e SCA (Service Component Architecture), tali tecnologie non siano in antagonismo ma il secondo possa basarsi sul primo. Dualmente, OSGi potrebbe essere utilizzato da JBI per risolvere issues sul ciclo di vita dei componenti. Le novità di maggior rilievo sono l'utilizzo di POJOs come componenti e interfacce standard come definizione dei servizi, il nuovo concetto di interceptor che verrà utilizzato per decorare la nostra pipe di componenti con logging, validazioni, security, transazioni, you name it. Ciò che mi ha reso più felice è che chi sta redigendo le specifiche sta prendendo in considerazione di non utilizzare WSDL come default ma solo plain java. 
La specifica dovrebbe subire una revisione nell'ultimo quarter del 2007 e diventare final per il prossimo JavaONE.

!Juergen Hoeller - Dependency Injection and AOP in a Java EE 5 World!
''Interface21''

Juergen Hoeller comincia il suo speech in tedesco. L'aula rimane attonita. Juergen Hoeller continua a parlare in tedesco. Un microfonista imbarazzato lo raggiunge. Non ci è dato conoscere le parole esatte della conversazione ma vi farò una libera interpretazione come se fossi il sottotitolatore di un film muto degli anni venti.
- "ehm... mi scusi mr Hoeller..."
- "yaaa??"
- "ci troviamo ad una conferenza internazionale..."
- "sì...?"
- "...e, se non sono troppo sfacciato... le suggerirei di parlare in inglese..."
- "Perché?"
- "beh potrebbero non comprenderla tutti..."
- "davvero? non ci avevo pensato! ma non siamo in Swizzera??"
...
Con un inizio simile potete immaginare con quale spirito abbia assistito a questa presentazione che tra l'altro s è rivelata essere una vetrina di marketing per spring 2.1. A detta di Hoeller Spring 2.1 è compatibile con Java EE 5, ma anche tutte le versioni precedenti, è compatibile con OSGi spec nativamente, ha esteso l'AOP, fa autowiring con qualsiasi classe abbia un setter (and his dog) e al mattino vi porta il caffé a letto. 
Ma qualche anno fa non si parlava di LITEWEIGHT FRAMEWORK?
