#include <jni.h>
#include <stdio.h>
#include <stdlib.h>

#include <android/log.h>


#define TAG "ndk"
#define LOGV(...) __android_log_print(ANDROID_LOG_VERBOSE, TAG, __VA_ARGS__)
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, TAG, __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN, TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)

JNIEXPORT jint JNICALL
Java_perfect_android_ndk_JNIClass_add(JNIEnv *env, jobject instance, jint x, jint y) {

    LOGE("short长度为:%d", sizeof(short));
    LOGE("char长度为:%d", sizeof(char));
    LOGE("int长度为:%d", sizeof(int));
    LOGE("float长度为:%d", sizeof(float));
    LOGE("long长度为:%d", sizeof(long));
    LOGE("double长度为:%d", sizeof(double));

    printf("这是int类型的占位符:%d",10);
    printf("这是long类型的占位符:%ld",100L);
    printf("这是float类型的占位符:%f",1.1);
    printf("这是无符号数的占位符:%u",2);
    printf("这是短整型的占位符:%hd",1);
    printf("设置double类型的占位符:%lf",1.00);
    printf("十六进制输出整型数据:%x",10);
    printf("八进制输出整型数据:%o",10);
    printf("这是字符串输出类型:%s","字符串");

    // TODO
    return x + y;

}