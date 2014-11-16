	* Prima di tutto e' necessaria l'iscrizione alla comunita' JavaDotNet:@@https://www.dev.java.net/servlets/Join
	* Una volta ottenuto uno username per la login, richiedere la ''membership'' al progetto del JUG Milano:@@https://jugmilano.dev.java.net/servlets/ProjectMembershipRequest@@con ruolo 'developer'
	* In alternativa, inviare una mail con la richiesta ed il proprio username su JavaDotNet all'indirizzo: info[at]jugmilano[dot]it

Dopo aver avuto i necessari diritti, si ha accesso in scrittura a CVS e tutti gli altri servizi destinati agli sviluppatori. La root directory cvs del jugmilano contiene una serie di sottodirectory organizzate come progetti indipendenti:

cvs/jugmilano/progetto1
cvs/jugmilano/progetto2
cvs/jugmilano/progetto-N

Per accedere in lettura non c'e' necessita' di login/registrazione, per la scrittura ovviamente si'. Le operazioni da compiere usando cvs da linea di comando sono:
	* Portarsi in una directory adatta sul proprio HD
	* Immettere il comando {{{cvs -d :pserver:''proprio-nick''@cvs.dev.java.net:/cvs login}}} dove ''proprio-nick'' e' il nome di registrazione su java.net. Per l'accesso in sola lettura anonimo utilizzare ''guest''
	* Immettere la propria password quando richiesto oppure lasciare vuoto in caso di login ''guest''
	* Immettere il comando {{{cvs -d :pserver:''proprio-nick''@cvs.dev.java.net:/cvs checkout jugmilano}}} per farsi creare in locale la directory di tutti i progetti gestiti dal jug oppure {{{cvs -d :pserver:''proprio-nick''@cvs.dev.java.net:/cvs checkout jugmilano/progetto-N}}} per scaricare semplicemente un progetto della lista (visibile qui: https://jugmilano.dev.java.net/source/browse/jugmilano/)

ATTENZIONE all'accesso in SCRITTURA: cvs non permette la cancellazione di directory. Quindi tutto le directory immesse erroneamente sotto source control rimarranno nel limbo cvs visibili per sempre (e pensare che lo sapevo ma sono caduto nella trappola di nuovo :( )

