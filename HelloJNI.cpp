// Save as "HelloJNI.c"
#include <jni.h>        // JNI header provided by JDK
#include <iostream>

#include "HelloJNI.h"   // generated header from java class
 
using namespace std;
// Implementation of the native method sayHello()
JNIEXPORT jboolean JNICALL Java_HelloJNI_CheckDone(JNIEnv *env, jobject thisObj) {
   cout << "Hello From Cpp";
   return 1;
}