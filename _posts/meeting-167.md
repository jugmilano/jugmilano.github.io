---
layout: new_generic
uid: meeting167
title: "JUG Milano Meeting #167"
date: 2025-12-21 00:00
meetingdate: 2026-01-15
description: "The ART of Running Wasm: A Tale of Three Bytecodes"
speaker: "Edoardo Vacchi"
abstract: "What happens when JVM bytecode, Dalvik bytecode, and WebAssembly bytecode walk into the same library? 
Chicory is a pure-Java WebAssembly runtime that can both interpret Wasm binaries and compile them into Java bytecode: either at build-time for efficiency or at runtime for dynamic loading. This works perfectly on the JVM, but Android's ART runtime runs Dalvik bytecode. 
So what happens when you need to dynamically load Wasm modules on Android?
In this talk, we'll explore our journey writing a new Android backend for the Chicory compiler. We'll dive into the architectural differences between stack-based JVM bytecode and register-based Dalvik bytecode, show how we generate DEX files at runtime using DexMaker, and reveal the other technical challenges we found along the way.
We'll also discover the surprising similarities between these VMs and how to exploit them: did you know that the ART VM can be started like a regular JVM?
Through practical examples and live demonstrations, this tale of three bytecodes will give you a unique perspective on how different runtimes really work under the hood."
bio: "Edoardo is a Principal Machine Learning Engineer at Red Hat. During his PhD he researched language design and implementation at University of Milan. 
He have worked at UniCredit Bank’s R&D department; at Red Hat he worked on Drools and Kogito; he joined Tetrate as a core team member of the wazero WebAssembly runtime, and at Dylibso he contributed to both Chicory and wazero. 
He is currently back at Red Hat in the AI department, working on LLM-D."
location: eDream ODIGEO Via Fara 26 20124 Milano - evento gratuito previa registrazione OBBLIGATORIA (vedi dettagli)
thanks:  
address: Via Gustavo Fara, 26, 20124 Milano MI - ATTENZIONE causa lavori entrare dalla porta di servizio del RETRO del palazzo di Via Fara 26, ecco la 
map: "https://maps.app.goo.gl/Fd2LvYb7nVYGGiG66" 
slides: 
video: 
code: <a href="https://github.com/jugmilano/jugmilano.github.io/blob/master/assets/images/RH-map.jpg"> mappa dei lavori in corso</a>
language: italiano
miscdetails: |
    <b>
    Evento ibrido online ed in presenza.
    <br/><br/>
    La partecipazione **in presenza** è gratuita e libera, ma è OBBLIGATORIA la registrazione su:
    <a href="https://www.eventbrite.com/">form di registrazione per partecipare a JUG Milano in presenza</a>
    </b><br/>
---
