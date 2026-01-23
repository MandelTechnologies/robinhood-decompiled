package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes4.dex */
public class ApiCompat$Api26Impl {
    public static void onCaptureQueueEmpty(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
