# Communication with Java & Cpp

Here, we are calling cpp method in java class which will have params and return boolean. 

#To generate .h file from java class

javac -h . HelloJNI.java

#To run the C or Cpp file

gcc -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/darwin" -dynamiclib -o libhello.dylib HelloJNI.c

g++ for .cpp file 


#To run the java file:

java -Djava.library.path=. HelloJNI

Or

javac -h . HelloJNI.java  //compile

Java java HelloJNI //run 

