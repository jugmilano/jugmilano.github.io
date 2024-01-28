# Istruzioni per l'organizzazione di un nuovo meeting

Per definire la data del meeting, bisogna fare riferimento al calendario dello spazio Venini 42:

[http://meeting.venini42.it/venini42](http://meeting.venini42.it/venini42)

Quando la proposta di un relatore viene accettata, bisogna chiedere al relatore di fornire titolo e abstract dell'intervento oltre a una sua breve bio.
Per pubblicare l'evento bisogna:
  * verificare libro Manning sull'argomento
  * creare la pagina relativa al meeting sul sito www.jugmilano.it
  * attivare il form di registrazione
  * mandare una mail alla mailing list it-milano-java-jug@yahoogroups.com
  * pubblicizzare l'evento su
     * Twitter
     * Linkedin
     * MilanoTechScene
     * ..e altri social (vedi sotto)

Dopo l'evento, bisogna aggiornare il dettaglio del meeting.

## Verifica libro Manning
Manning offre gratuitamente al JUG Milano un libro in formato elettronico da estrarre fra i partecipanti all'incontro; il libro da estrarre deve essere in tema con il contenuto dell'intervento, e va scelto fra i titoli di Manning presenti in catalogo.
Per info, scrivere a usergroup@manning.com una mail tipo questa:

    Hi,
    on ???, ??th it will be held a talk at JUG Milano about ???
    ( http://www.jugmilano.it/meeting-??.html ), and I was wondering
    if we could have a free copy of the "???" ebook to raffle
    for the participants of the meeting.

    Thanks in advance and regards,




## Creazione nuovo meeting sul sito
Per creare un nuovo meeting sul sito, è necessario creare un nuovo file nella directory /_posts del repository github del nostro sito. Il nome del file ha formato YYYY-MM-DD-meeting-NN.md, dove i placeholder Y, M e D hanno i soliti valori e N indica il numero del meeting: **la data nel nome file dev'essere quella di creazione del file e non del meeting**.

Il sito è basato su templating framework Jekyll; il contenuto del nuovo file dovrà essere strutturato come gli altri:

```
layout: old_meeting
uid: meetingNN
title: "JUG Milano Meeting #NN"
date: YYYY-MM-DD 00:00
meetingdate: YYYY-MM-DD
description: foo
speaker: bar
abstract: foobar
bio: barfoo
location: lo Spazio Venini42
thanks: grazie all'ospitalità di LinkMe e Mikamai
address: Via Venini 42
map: https://www.google.it/maps/place/Venini42/@45.490556,9.2131888,17z/data=!3m1!4b1!4m5!3m4!1s0x4786c6de20e6362f:0xc95afb6f555f4ed6!8m2!3d45.490556!4d9.2153775
slides:
video:
code:
```
I campi hanno questi valori/formati:
  * `layout` può avere valore `old_generic` oppure `new_generic`; dopo che il meeting è stato tenuto, il valore va spostato da `new_generic` a `old_generic`, il ché significa che il template utilizzato per visualizzarlo passerà da `templates/new_generic.flt` a `templates/old_generic.ftl`.
  * `uid` contiene l'identificativo del meeting, nella forma `meeting##` dove il caratter '#' è un numero. Era stato introdotto per testare l'integrazione e generazione dei vCal direttamente con Jekyll, ma attualmente non viene usato per altri scopi e non è mandatory.
  * `title` contiene la scritta che verrà visualizzata in alto sopra il tito del meeting nella pagina di dettaglio del meeting
  * `date` deve essere uguale alla date del nome del file, e quindi la data di creazione del file del nuovo meeting (perché Jekyll dalla versione 3 non permette di visualizzare post che abbiano data antecedente alla data corrente)
  * `meetingdate` è la data in cui si terrà il meeting
  * `description` è il titolo dell'intervento
  * `speaker` è il nome (o i nomi nel caso ci sia più di un relatore) dello speaker
  * `abstract` è l'absrtact dell'intervento
  * `bio` è la bio del relatore; nel caso ci sia più di un relatore, si usa dell'HTML nella bio per separare le bio di ogni relatore (si veda il [meeting89](https://raw.githubusercontent.com/jugmilano/jugmilano.github.io/master/_posts/2017-03-01-meeting-89.md) per un esempio)
  * `location` si può copincollare dal meeting precedente (a meno che non si sia cambiata sede dell'incontro)
  * `thanks` si può copincollare dal meeting precedente (a meno che non si sia cambiata sede dell'incontro)
  * `address` si può copincollare dal meeting precedente (a meno che non si sia cambiata sede dell'incontro)
  * `map` si può copincollare dal meeting precedente (a meno che non si sia cambiata sede dell'incontro)
  * `slides` l'URL delle slide dell'intervento; nel caso il relatore fornisca un file PDF (e non un URL), il file si può committare/pushare nella directory `/_site/pdf` e linkare direttamente da github
  * `video` l'URL del video della registrazione
  * `code` il link al repository dei sorgenti del codice utilizzato/visualizzato nell'intervento

**Nessuno dei valori di questi campi può contenere il carattere ':', che è un carattere riservato di Jekyll.** ma si può usare dentro una string-literal nello YAML.

### Testing del nuovo incontro
Vedi README.md nella root di questo repositori per l'esecuzione del rendering del sito in locale.

Quando il rendering è completo, si può pushare sul repo e nel giro di pochi secondi il nuovo meeting sarà visualizzato sul sito http://www.jugmilano.it .


## Mail alla ML

Si può fare riferimento all'ultima email di announce sulla mailing list.

La mail alla mailing list ha solitamente questo formato:


    Ciao a tutti,
    siamo lieti di annunciarvi che il prossimo incontro del JUG Milano si terrà $DATE.

    Questo il programma:
    h 19:00 - JUG news e attività in corso
    h 19:10 - "$TITLE", a cura di $SPEAKER
    h 20:30 (circa) - Estrazione licenza per IntelliJ Idea

    Potete trovare maggiori dettagli e registrarvi per l'incontro direttamente sul nostro sito:
    http://www.jugmilano.it/meeting-$MEETING_NUMBER.html

    Dopo l'incontro, per chi vorrà, ci mangeremo una pizza condita da chiacchiere tecnologiche.

    Vi aspettiamo!


## Pubblicizzare l'evento
Per pubblicizzare l'evento, solitamente pubblichiamo la notizia au alcuni social network

### Twitter
L'unica difficoltà su Twitter è far stare qualcosa di comprensibile in 140 caratteri

### LinkedIn
Qui Matteo è più esperto di me su come fare per dargli più visibilita. Grazie!
Crare il post come "announce"

### Calendario MilanoTechScene
In questo momento è il mio indirizzo a essere associato al calendario di MTS, per cui posso farlo solo io. Non sono sicuro si possa fare con l'indirizzo `info@jugmilano.it` perché è un alias.
Attualmente è associato a ciascun account google personale.

### Calendario jugmilano
Sto segnando gli appuntamenti su un calendario pubblico ad-hoc.

### Facebook (sperimentale)
Una pagina Facebook era stata create via sperimentale ed in seguito a feedback ricevuti durante il boot a Codemotion, ho aperto una pagina su Facebook per il JUG Milano e sto inserendo i vari announce, similmente a LinkedIn, come "note".
Ora contiene un ["pinned" post](https://www.facebook.com/JUGMilano/posts/pfbid0TzNjk8VbsKrqDZjBAda3W2t51W7wTvXHgdmcQRteb3GK4RtG7oFGWdYev5TjjgAzl) che invita a far riferimento al sito/mailing-list/canale youtube.

### Eventbrite
Abbiamo iniziato ad usare con forti ritorni positivi Eventbrite ancor prima del dilagare del human malware del 2020.
È utile continuare ad usarlo anche per eventi completamente online, sia per promozione, sia come utile reminder per gli attendees.
Il nostro gruppo si trova a: https://www.eventbrite.com/o/jug-milano-28234569107

### Codemotion Communities agenda meetups "aperitech"
Sul sito Codemotion communities vengono promossi gli eventi: https://community.codemotion.com
e rilanciati nella loro newsletter.
Per aprire un evento si usa il pannello di gestione: https://my.codemotion.com/#/communities#management

## Aggiornamento del sito dopo l'incontro
Dopo che il meeting si è tenuto, bisogna ricordarsi di modificare il campo `layout` del file dell'incontro da `new_generic` a `old_generic`. Inoltre, se disponibili, vanno aggiunti anche i riferimenti alle slide, al sorgente e al video dell'intervento.

