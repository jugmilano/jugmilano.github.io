JUG Milano website
======

This is the website of JVM User Group Milano.

## Build website

Maven-based build of JBake extensions, and programmatic website generation.

``` 
mvn clean compile exec:java
```

## Preview website locally

This launch an embedded server that serves the generated website from step above.

```
mvn exec:java -Pserve
```