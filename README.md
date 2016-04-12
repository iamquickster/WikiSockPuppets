# WikiSockPuppets
Histogram of Sock Puppets investigations in Wikipedia using Apache Hadoop

This application creates the jar to be used in a Hadoop MapReduce Application. It can be used as a template for simple implementations.

make compile: to compile the classes

make jar: creates a jar from the compiled classes

If ran as is with hadoop, the application will search all lines with "sockpuppet investigations" and count them. This allows to tabulate the amount of sockpuppet investigations are open every month in the Wikipedia Dumps:

https://dumps.wikimedia.org/enwiki/

WikiSockPuppetsHisto.java can easily be modifier to search a different string or change the logic of the MapReduce Job.

For more information on launchign Hadoop Jobs see https://hadoop.apache.org/docs/r1.2.1/mapred_tutorial.html

