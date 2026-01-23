package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public interface SessionProcessor {

    public interface CaptureCallback {
    }

    void deInitSession();

    SessionConfig initSession(CameraInfo cameraInfo, OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(RequestProcessor requestProcessor);

    void setParameters(Config config);

    int startCapture(boolean z, TagBundle tagBundle, CaptureCallback captureCallback);

    int startRepeating(TagBundle tagBundle, CaptureCallback captureCallback);

    default int startTrigger(Config config, TagBundle tagBundle, CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();

    default Map<Integer, List<Size>> getSupportedPostviewSize(Size size) {
        return Collections.EMPTY_MAP;
    }

    default Set<Integer> getSupportedCameraOperations() {
        return Collections.EMPTY_SET;
    }
}
