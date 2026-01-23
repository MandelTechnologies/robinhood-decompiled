package androidx.camera.core;

/* loaded from: classes4.dex */
public interface CameraInfo {
    String getImplementationType();

    default int getLensFacing() {
        return -1;
    }

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i);
}
