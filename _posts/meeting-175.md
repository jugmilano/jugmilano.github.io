---
layout: new_generic
uid: meeting175
title: "JUG Milano Meeting #175"
date: 2026-11-10 00:00
meetingdate: 2026-11-19
description: "Flights, Failures and Forks: Structured Concurrency and Algebraic Data Types in Java"
speaker: "Riccardo Cardin"
abstract: |
    Asking five airlines for a price at the same time sounds easy. Then one provider hangs, another fails, the user gives up, and your ExecutorService keeps running threads that nobody is waiting for anymore.
    <br/><br/>
    In this live coding session, we build a flight search aggregator from scratch in modern Java. First we model what can happen. Using records, sealed interfaces, and exhaustive pattern matching, every provider answer becomes a type (an offer, sold out, service down, too slow), and the compiler won't let us forget a case. Then we make the runtime respect that model. With StructuredTaskScope, still a preview API in JDK 27, concurrent calls start and end inside their parent: when one fails, the others are canceled; when time runs out, nothing is left behind; and the stack trace still tells a coherent story.
    <br/><br/>
    Along the way, we look inside structured concurrency to see how it works: scopes, subtasks, joiners, cancellation, and why virtual threads make it cheap. We finish by writing our own Joiner, where algebraic data types and structured concurrency meet to pick the best offer.
    <br/><br/>
    You will leave with a way to write concurrent Java where types make illegal states unrepresentable, and scope makes leaked threads impossible.
bio: |
    WHO AM I<br/>
    - Senior Software Engineer, Lastminute.com<br/>
    - Main lecturer at the University of Padua (Software Engineering)<br/>
    - Passionate blogger at Rock The JVM<br/>
    - Maintainer of many OS projects both in Scala and Kotlin<br/>
location: eDream ODIGEO Via Fara 26 20124 Milano - evento gratuito previa registrazione OBBLIGATORIA (vedi dettagli)
thanks:  
address: Via Gustavo Fara, 26, 20124 Milano MI 
map: "https://maps.app.goo.gl/Fd2LvYb7nVYGGiG66" 
slides: 
video:
code: 
language: Italiano
miscdetails: |
    <b>
    Evento ibrido online ed in presenza.
    <br/><br/>
    La partecipazione **in presenza** è gratuita e libera, ma è OBBLIGATORIA la registrazione su:
    <a href="https://www.eventbrite.com/e/flights-failures-and-forks-structured-concurrency-and-adt-in-java-tickets-2004669055108?aff=oddtdtcreator">form di registrazione per partecipare a JUG Milano in presenza</a>
    </b><br/>
eventbrite: 
---
