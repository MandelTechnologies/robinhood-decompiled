package io.bitdrift.capture.replay;

import kotlin.Metadata;

/* compiled from: IScreenshotLogger.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lio/bitdrift/capture/replay/IScreenshotLogger;", "Lio/bitdrift/capture/replay/IInternalLogger;", "onScreenshotCaptured", "", "compressedScreen", "", "metrics", "Lio/bitdrift/capture/replay/ScreenshotCaptureMetrics;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IScreenshotLogger extends IInternalLogger {
    void onScreenshotCaptured(byte[] compressedScreen, ScreenshotCaptureMetrics metrics);
}
