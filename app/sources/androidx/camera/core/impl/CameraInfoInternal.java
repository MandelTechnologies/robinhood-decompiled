package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public interface CameraInfoInternal extends CameraInfo {
    void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    String getCameraId();

    Quirks getCameraQuirks();

    EncoderProfilesProvider getEncoderProfilesProvider();

    default CameraInfoInternal getImplementation() {
        return this;
    }

    Set<DynamicRange> getSupportedDynamicRanges();

    List<Size> getSupportedHighResolutions(int i);

    List<Size> getSupportedResolutions(int i);

    Timebase getTimebase();

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback);
}
