public class HelloJNI { 
   static {
      System.loadLibrary("hello"); // Load native library hello.dll
                                   //  at runtime
                                   // This library contains a native method called CheckDone()
   }
 
   // Declare an instance native method CheckDone() which receives no parameter and returns boolean
   private native boolean CheckDone();
 
   // Test Driver
   public static void main(String[] args) {
    HelloJNI hellojni = new HelloJNI();

    boolean flag = hellojni.CheckDone();

    if (flag)
      System.out.println("Hello from Java");
    else
      System.out.println("Communication Failed!");
   }
}



/*

It depends, if we want to make communication with low-level language and syncronous
 request/response then best approach would be:
  passing low volume traffic of complex data over JNI,
  and this is offline request, where as json is online as well as offline from json file.
  to pass complex data structure Protobuf is a good.

  if we looking for asynchronous then, JSON or XML would be great.

*/