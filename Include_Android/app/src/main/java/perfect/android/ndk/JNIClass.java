package perfect.android.ndk;

/**
 * @author Flower 2019/3/30
 */
public class JNIClass {
    {
        System.loadLibrary("jni_lib");
    }

    public native int add(int x,int y);
}
