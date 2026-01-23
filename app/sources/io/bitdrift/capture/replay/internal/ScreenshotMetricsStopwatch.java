package io.bitdrift.capture.replay.internal;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.bitdrift.capture.common.DefaultClock;
import io.bitdrift.capture.common.IClock;
import io.bitdrift.capture.replay.ScreenshotCaptureMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenshotMetricsStopwatch.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ScreenshotMetricsStopwatch;", "", Card.Icon.CLOCK, "Lio/bitdrift/capture/common/IClock;", "(Lio/bitdrift/capture/common/IClock;)V", "compressionByteCount", "", "compressionTimeMs", "", "screenshotAllocationByteCount", "screenshotByteCount", "screenshotTimeMs", "startMs", "compression", "", WebsocketGatewayConstants.DATA_KEY, "Lio/bitdrift/capture/replay/ScreenshotCaptureMetrics;", "screenshot", "start", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ScreenshotMetricsStopwatch {
    private final IClock clock;
    private int compressionByteCount;
    private long compressionTimeMs;
    private int screenshotAllocationByteCount;
    private int screenshotByteCount;
    private long screenshotTimeMs;
    private long startMs;

    public ScreenshotMetricsStopwatch(IClock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    public /* synthetic */ ScreenshotMetricsStopwatch(IClock iClock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DefaultClock.INSTANCE.getInstance() : iClock);
    }

    public final void start() {
        this.startMs = this.clock.elapsedRealtime();
        this.screenshotTimeMs = 0L;
        this.screenshotAllocationByteCount = 0;
        this.screenshotByteCount = 0;
        this.compressionTimeMs = 0L;
        this.compressionByteCount = 0;
    }

    public final void screenshot(int screenshotAllocationByteCount, int screenshotByteCount) {
        this.screenshotTimeMs = this.clock.elapsedRealtime() - this.startMs;
        this.screenshotAllocationByteCount = screenshotAllocationByteCount;
        this.screenshotByteCount = screenshotByteCount;
    }

    public final void compression(int compressionByteCount) {
        this.compressionTimeMs = (this.clock.elapsedRealtime() - this.startMs) - this.screenshotTimeMs;
        this.compressionByteCount = compressionByteCount;
    }

    public final ScreenshotCaptureMetrics data() {
        return new ScreenshotCaptureMetrics(this.screenshotTimeMs, this.screenshotAllocationByteCount, this.screenshotByteCount, this.compressionTimeMs, this.compressionByteCount);
    }
}
