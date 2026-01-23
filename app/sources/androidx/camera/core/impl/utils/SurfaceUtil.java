package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes4.dex */
public class SurfaceUtil {

    public static class SurfaceInfo {

        /* renamed from: format, reason: collision with root package name */
        public int f9662format = 0;
        public int width = 0;
        public int height = 0;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static SurfaceInfo getSurfaceInfo(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.f9662format = iArrNativeGetSurfaceInfo[0];
        surfaceInfo.width = iArrNativeGetSurfaceInfo[1];
        surfaceInfo.height = iArrNativeGetSurfaceInfo[2];
        return surfaceInfo;
    }
}
