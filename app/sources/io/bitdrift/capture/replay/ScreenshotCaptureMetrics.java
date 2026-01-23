package io.bitdrift.capture.replay;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;

/* compiled from: ScreenshotCaptureMetrics.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lio/bitdrift/capture/replay/ScreenshotCaptureMetrics;", "", "", "screenshotTimeMs", "", "screenshotAllocationByteCount", "screenshotByteCount", "compressionTimeMs", "compressionByteCount", "<init>", "(JIIJI)V", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "toMap", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getScreenshotTimeMs", "()J", "I", "getTotalDurationMs", "totalDurationMs", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ScreenshotCaptureMetrics {
    private int compressionByteCount;
    private long compressionTimeMs;
    private final int screenshotAllocationByteCount;
    private final int screenshotByteCount;
    private final long screenshotTimeMs;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenshotCaptureMetrics)) {
            return false;
        }
        ScreenshotCaptureMetrics screenshotCaptureMetrics = (ScreenshotCaptureMetrics) other;
        return this.screenshotTimeMs == screenshotCaptureMetrics.screenshotTimeMs && this.screenshotAllocationByteCount == screenshotCaptureMetrics.screenshotAllocationByteCount && this.screenshotByteCount == screenshotCaptureMetrics.screenshotByteCount && this.compressionTimeMs == screenshotCaptureMetrics.compressionTimeMs && this.compressionByteCount == screenshotCaptureMetrics.compressionByteCount;
    }

    public int hashCode() {
        return (((((((D8$$SyntheticClass7.m3325m(this.screenshotTimeMs) * 31) + this.screenshotAllocationByteCount) * 31) + this.screenshotByteCount) * 31) + D8$$SyntheticClass7.m3325m(this.compressionTimeMs)) * 31) + this.compressionByteCount;
    }

    public String toString() {
        return "ScreenshotCaptureMetrics(screenshotTimeMs=" + this.screenshotTimeMs + ", screenshotAllocationByteCount=" + this.screenshotAllocationByteCount + ", screenshotByteCount=" + this.screenshotByteCount + ", compressionTimeMs=" + this.compressionTimeMs + ", compressionByteCount=" + this.compressionByteCount + ')';
    }

    public ScreenshotCaptureMetrics(long j, int i, int i2, long j2, int i3) {
        this.screenshotTimeMs = j;
        this.screenshotAllocationByteCount = i;
        this.screenshotByteCount = i2;
        this.compressionTimeMs = j2;
        this.compressionByteCount = i3;
    }

    public final long getScreenshotTimeMs() {
        return this.screenshotTimeMs;
    }

    private final long getTotalDurationMs() {
        return this.screenshotTimeMs + this.compressionTimeMs;
    }

    public final Map<String, String> toMap() {
        return MapsKt.mapOf(Tuples4.m3642to("screenshot_time_ms", String.valueOf(this.screenshotTimeMs)), Tuples4.m3642to("screenshot_allocation_byte_count", String.valueOf(this.screenshotAllocationByteCount)), Tuples4.m3642to("screenshot_byte_count", String.valueOf(this.screenshotByteCount)), Tuples4.m3642to("compression_time_ms", String.valueOf(this.compressionTimeMs)), Tuples4.m3642to("compression_byte_count", String.valueOf(this.compressionByteCount)), Tuples4.m3642to("total_duration_ms", String.valueOf(getTotalDurationMs())));
    }
}
