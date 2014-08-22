.SUFFIXES: .java .class

JAVAC = javac
JAR = jar cvf
sources = $(wildcard *.java)
classes = $(sources:.java=.class)
jar = helloRJava.jar


all: jar clean 

%.class: %.java
	$(JAVAC) $<

jar: $(classes)
	$(JAR) $(jar) $(classes)

clean:
	mv $(jar) ../java
	rm -f $(classes)
