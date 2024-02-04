JUG Milano website
======

This is the website of JVM User Group Milano.

> [!IMPORTANT]  
> Per le procedure, processi per l'organizzazione dei talks, meetings fare riferimento alla guida [new_meeting_instructions.md](/misc/new_meeting_instructions.md).

## Build website

Maven-based build of JBake extensions, and programmatic website generation.

``` 
mvn clean compile test exec:java
```

## Preview website locally

This launch an embedded server that serves the generated website from step above.

```
mvn exec:java -Pserve
```