---
layout: old_meeting
uid: meeting145
title: "JUG Milano Meeting #145"
date: 2023-05-01 00:00
meetingdate: 2023-05-31
description: "Your Java Application Is Slow? Check Out These Open-Source Profilers"
speaker: "Johannes Bechberger"
abstract: |
    Profilers help to analyze performance bottlenecks of your application - if you know which to use and how to work with them.
    <br/><br/>
    There are many open-source profilers, like async-profiler or JMC. This talk will give you insights into these tools, focusing on: 
    <br/>
    1. Understanding the basic concepts of profiling like flame graphs, ...<br/>
    2. Usage of async-profiler and JMC<br/>
    3. Advantages and disadvantages of the different tools<br/>
    <br/>
    I want to make profiling easier for everyone. So what I'm mostly doing is working behind the scenes in the OpenJDK, creating a new profiling API that makes it easier to develop profiling tools. This makes it safer because we've seen that the current profiling tools use an undocumented API of the OpenJDK.
    <br/><br/>
    I'm working on the OpenJDK and a proposal for a new profiling APi. Furthermore, I worked on ap-loader, which wraps the async-profiler and on a new profiling UI that is integrated into an IntelliJ plugin - so it can profile applications directly from the IntelliJ IDE without using any commercial plugins. This UI is based on Firefox Profiler and I use it almost daily to profile and to view profiling data. 
    <br/><br/>
    My motivation for this talk and for the other talks I've given is the same as the motivation for my blog posts. I want to make profiling more accessible. Currently, I see that we have many nice profiling tools like JDK Mission Control, but we have the problem that we don't have the educative resources for this.
    <br/><br/>
    We either have resources that are really top level that say, there's this tool, or we have resources that say, you need this API. I want to bridge this gap, and in my talk I want to test this top level information, but then go deeper down into the depths of OpenJDK and show you how it's really done. I think the first thing that you need to understand is that profiling isn't magic. Profiling is just a tool in your toolbox that you can use.
    <br/><br/>
    Q: How would you describe your main persona and target audience for this session?<br/>
    A: I think that the persona would be a person that knows Java quite well. It's a person that wants to know more about profiling, that wants to get into profiling and wants to see what open source offers.
    <br/><br/>
    There's also the person that wants to go down this rabbit hole, see how it's all done, and also wants to see how they could write their own profile - to see how profilers work, because that's one of the great things in the open source world. You can just look into it, modify it and even do your own.
    <br/><br/>
    It's basically people that want to know more about profiling and want to go down and see how it really is implemented.
    <br/><br/>
    Q: Is there anything specific that you'd like people to walk away with after watching your session?<br/>
    A: That profiling isn't magic. It's just another thing in your toolbox, like debuggers.
bio: |
    Johannes Bechberger is a JVM developer working on profilers and their underlying technology in the SapMachine team at SAP. This includes improvements to async-profiler and its ecosystem, a website to view the different JFR event types, and improvements to the FirefoxProfiler, making it usable in the Java world. He started at SAP last year after two years of research studies at the KIT in the field of Java security analyses. His work today is comprised of many open-source contributions and his blog, where he writes regularly on in-depth profiling and debugging topics.
location: eDreams ODIGEO Via Fara 26 20124 Milano - evento gratuito previa registrazione OBBLIGATORIA (vedi dettagli)
thanks: grazie alla co-organizzazione con eDreams ODIGEO
address: Via Gustavo Fara, 26, 20124 Milano MI
map: "https://goo.gl/maps/mYyPUpgNwAhzUJT2A"
slides: 
video: 
code:
miscdetails: |
    <b>
    La partecipazione in presenza è gratuita e libera, ma è OBBLIGATORIA la registrazione su:
    <a href="https://www.eventbrite.com/e/your-java-application-is-slow-check-out-these-open-source-profilers-tickets-628401554967">form di registrazione per partecipare a JUG Milano in presenza</a>
    </b><br/>
    Prevediamo di effettuare la diretta streaming su YouTube (con VOD a seguire) dell'evento.
---
