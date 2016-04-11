all: compile jar

compile:
	javac -classpath hadoop-core-1.2.1.jar -d bin src/wikisockpuppets/WikiSockPuppetsHisto.java

jar: 
	jar -cvf wikisp.jar -C bin/ .
