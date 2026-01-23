package androidx.camera.core;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public interface CameraControl {
    ListenableFuture<Void> enableTorch(boolean z);

    ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }
    }
}
