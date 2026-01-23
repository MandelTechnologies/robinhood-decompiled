package io.bitdrift.capture.replay;

import io.bitdrift.capture.replay.internal.ReplayRect;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IReplayLogger.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lio/bitdrift/capture/replay/IReplayLogger;", "Lio/bitdrift/capture/replay/IInternalLogger;", "onScreenCaptured", "", "encodedScreen", "", "screen", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "Lio/bitdrift/capture/replay/internal/FilteredCapture;", "metrics", "Lio/bitdrift/capture/replay/ReplayCaptureMetrics;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IReplayLogger extends IInternalLogger {
    void onScreenCaptured(byte[] encodedScreen, List<ReplayRect> screen, ReplayCaptureMetrics metrics);
}
