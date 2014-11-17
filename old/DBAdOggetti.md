NB: Questa pagina e' ancora in fieri... Autore: GiovanniGiorgi

	 Discutendo il creatore di Magma (un db ad oggetti per Smalltalk), 
e' venuta fuori la seguente idea interessante sull'uso dei db ad oggetti 
rispetto a quelli relazionali:


>>Many ODBMS's don't have a query language, but are still better-suited for
>>"object-centric" domains where much of the query-requirements are handled via
>>object-navigation of an *even-grained* model.
>>
>>Try to make your object-model deeper/taller rather than so flattened, which is
>>the natural tendency for those accustomed to interfacing to relational
>>databases.  Try to avoid large, global Collections where you constantly "look
>>up" the objects you want.  Instead, reference multiple, smaller collections of
>>Agreements from within your domain that reference the relevant instances.  The
>>same Agreement will be in multiple of these smaller collections.
>>  
>>

Io ci ho pensato un po' ma non mi pare sia cosi' semplice.
Prendiamo come esempio un Personal Information Manager con un insieme di 
contatti.
Ora se io voglio cercare tutti i contatti della categoria "JUG" e 
ordinarli per cognome,
devo fare una query bruttissima, molto E-R oriented:

	 select contat where contat.category='JUG' order by contact.surname 
form ContactClasses

Come potrei risolvere il problema invece usando un "even-grained model"?
Posso ordinare questi oggetti in sub collezioni, per es inventarmi una 
struttura ricorsiva ad hoc ma... mi pare che sarebbe un caos poi da 
gestire...insomma se volessi cambiare la categoria di un contatto o il 
suo cognome magari dovrei aggiornare 2 o tre collezioni.

Voi che esperienza avete?
Ve lo chiedo perche' sto usando sia Squeak che hibernate, e questo 
problema mi ri(n)corre e... ...magari esiste una soluzione migliore ma 
non riesco a vederla...
;))