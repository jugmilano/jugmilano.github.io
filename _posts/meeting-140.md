---
layout: old_meeting
uid: meeting140
title: "JUG Milano Meeting #140"
date: 2022-11-24 00:00
meetingdate: 2022-12-15
description: "Game of Loom: implementation patterns and performance implications playing with virtual threads"
speaker: "Mario Fusco"
abstract: |
    I virtual thread saranno molto probabilmente il prossimo grande punto di svolta nell'ecosistema Java, consentendo di avere la scalabilità dei modelli di programmazione asincrona con la semplicità del codice sincrono. La loro caratteristica principale, a differenza dei thread nativi che sono una risorsa costosa e quindi scarsa, consiste nella possibilità di creare tutti i virtual thread che si desidera con un impatto sul consumo di memoria e sulle prestazioni molto più limitato rispetto a quelli nativi. Ma è sempre vero? Quali sono i costi della schedulazione di migliaia o addirittura milioni di virtual thread? Il context switch più frequente ha implicazioni sulle prestazioni? Che dire dei cache miss che questi context switch potrebbero potenzialmente implicare? Durante questo intervento cercheremo di rispondere a queste domande in modo divertente, analizzando un'implementazione del tradizionale Conway's Game of Life basato sul modello dei processi sequenziali comunicanti (CSP) e utilizzando sia thread virtuali che nativi con diversi algoritmi per confrontare le loro prestazioni. Sulla base di questa analisi cercheremo anche di derivare alcune regole empiriche su quando e come utilizzare i virtual thread.
bio: |
    Mario is a senior principal software engineer at Red Hat working as Drools project lead. Among his interests there are also functional programming and Domain Specific Languages. He is also a Java Champion, the JUG Milano coordinator, a frequent speaker and the co-author of "Modern Java in Action" published by Manning.
location: Wellio Dante Milán Sala Hidden Garden - evento gratuito previa registrazione OBBLIGATORIA (vedi dettagli)
thanks: grazie alla co-organizzazione con Red Hat
address: Via Dante, 7 - 20123 Milano
map: "https://goo.gl/maps/cbCwx1igdB79uMgEA"
slides: 
video: 
code:
miscdetails: |
    <b>
    La partecipazione in presenza è gratuita e libera, ma è OBBLIGATORIA la registrazione su:
    <a href="https://www.eventbrite.com/e/biglietti-game-of-loom-implementation-patternsperformance-implications-w-virtual-t-474549699927">form di registrazione per partecipare a JUG Milano in presenza</a>
    </b><br/>
    Prevediamo di effettuare la diretta streaming su YouTube (con VOD a seguire) dell'evento.
---
