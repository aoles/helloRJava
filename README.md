helloRJava
==========

A dummy package interfacing a jar file that resides inside an R package.

Compile Java code
---

To compile the `.jar` library from the sources in `inst/javasrc` use

```sh
javac HelloRJava.java
jar cvf helloRJava.jar HelloRJava.class
```