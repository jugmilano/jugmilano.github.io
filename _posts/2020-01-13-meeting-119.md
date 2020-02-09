---
layout: old_meeting
uid: meeting119
title: "JUG Milano Meeting #119"
date: 2020-01-19 00:00
meetingdate: 2020-02-06
description: "Java at Speed: Building a Better JVM"
speaker: "Simon Ritter"
abstract: "Getting the best performance out of your Java applications can often be a
challenge due to the managed environment nature of the JVM and the non-
deterministic behaviour that this introduces.
This session will start by looking at what we mean by speed and how the JVM,
whilst extremely powerful, means we don’t always get the performance
characteristics we want. We’ll then move on to discuss the three key features of
the Zing JVM that address these issues:
<ol>
<li>The Falcon JIT compiler that leverages the LLVM open source project to
provide optimisations specific to the newest CPU architectures using
features like AVX2.
</li><li>ReadyNow, which allows details of speculative optimisations and JIT
profiling to be logged on production systems. ReadyNow! profiles can then
be used to substantially reduce the warm up and deoptimisation issues that
affect performance when restarting an application.
</li><li>The C4 garbage collector, which eliminates GC pauses that affect the
performance of an application even after all hot code paths have been
compiled and optimised.
</li></ol>"
bio: "Simon Ritter is the Deputy CTO of Azul Systems. Simon has been in the IT
business since 1984 and holds a Bachelor of Science degree in Physics from
Brunel University in the U.K.
Simon joined Sun Microsystems in 1996 and started working with Java
technology from JDK 1.0; he has spent time working in both Java development
and consultancy. Having moved to Oracle as part of the Sun acquisition, he
managed the Java Evangelism team for the Core Java platform. Now at Azul, he
continues to help people understand Java as well as Azul’s JVM technologies and
products. Simon has twice been awarded Java Rockstar status at JavaOne and is a
Java Champion. He currently represents Azul on the JCP Executive Committee
and on the Java SE Expert Group (9, 10, 11 and 12)."
location: lo Spazio Venini42
thanks: grazie all'ospitalità di Mikamai e LinkMe, e supporto logistico di Credimi
address: Via Venini 42
map: https://www.google.it/maps/place/Venini42/@45.490556,9.2131888,17z/data=!3m1!4b1!4m5!3m4!1s0x4786c6de20e6362f:0xc95afb6f555f4ed6!8m2!3d45.490556!4d9.2153775
slides: 
video: https://youtu.be/ce3BDcLKgSY
code:  
---
