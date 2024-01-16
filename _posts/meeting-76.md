---
layout: old_meeting
title: "JUG Meeting #76"
date: 2016-01-21 00:00
meetingdate: 2016-01-21
description: Enabling Fast Data using in memory-centric computing with Tachyon
speaker: Saverio Veltri
abstract: Today's massive growth in data sets means that storage is increasingly becoming a bottleneck for system workloads. Memory becomes more important and popular because its cost is dropping, which makes possible to handle huge amount of data in it. Many frameworks like Spark take advantage of memory for fast access and processing. Anyway, there are some limitations; for example, data must be replicated for achieving fault-tolerance, garbage collector might drastically reduce performances or even cause failures and data can be shared across different frameworks or jobs. Tachyon, a project of UC-Berkeley’s AMPLab, is a good solution for getting rid of those limitations. In this talk we are going to discover why Tachyon helps to achieve memory throughput without unnecessary replication and still provides reliability. For instance, we are going do see how it can re-computes data using lineage If a computation fails, or how the system is able to manage data which exceeds memory capacity and how RDD can be stored in order to reduce garbage collector overhead. 
bio: Saverio took his master degree in computer science engineer at 'Politecnico di Milano' in 2006.  After that, he gained a strong experience in Java and mobile technologies (iOs and Android) working either in small environments or big companies. Afterwards, he bumped into reactive world and he became a certified Scala and Akka engineer. Not completely satisfied about that stuff, he is currently working in the fast data area at <a target="#blank" href="http://radicalbit.io/">Radicalbit</a>.
location: Veespo
address: Via S. Maria alla Porta, 9 - Milano
map: https://www.google.it/maps/place/Via+Santa+Maria+alla+Porta,+9,+20123+Milano/@45.4664129,9.1817829,17z/data=!4m2!3m1!1s0x4786c153a8292d05:0x4c6f0a73c08286b9
slides: http://saveveltri.github.io/FastDataWithTachyon/
---
