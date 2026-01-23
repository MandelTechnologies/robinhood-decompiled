package androidx.camera.core.concurrent;

/* loaded from: classes4.dex */
public interface CameraCoordinator {

    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int i, int i2);
    }

    void addListener(ConcurrentCameraModeListener concurrentCameraModeListener);

    int getCameraOperatingMode();

    String getPairedConcurrentCameraId(String str);

    void setCameraOperatingMode(int i);
}
