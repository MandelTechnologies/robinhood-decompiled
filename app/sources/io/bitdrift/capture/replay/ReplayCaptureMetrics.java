package io.bitdrift.capture.replay;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;

/* compiled from: ReplayCaptureMetrics.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u001dR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u001dR(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayCaptureMetrics;", "", "", "viewCount", "composeViewCount", "errorViewCount", "exceptionCausingViewCount", "viewCountAfterFilter", "Lkotlin/time/Duration;", "parseDuration", "", "encodingTimeMs", "<init>", "(IIIIIJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "toMap", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getViewCount", "setViewCount", "(I)V", "getComposeViewCount", "setComposeViewCount", "getErrorViewCount", "setErrorViewCount", "getExceptionCausingViewCount", "setExceptionCausingViewCount", "getViewCountAfterFilter", "setViewCountAfterFilter", "J", "getParseDuration-UwyO8pc", "()J", "setParseDuration-LRDsOJo", "(J)V", "getEncodingTimeMs", "setEncodingTimeMs", "getTotalDurationMs", "totalDurationMs", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ReplayCaptureMetrics {
    private int composeViewCount;
    private long encodingTimeMs;
    private int errorViewCount;
    private int exceptionCausingViewCount;
    private long parseDuration;
    private int viewCount;
    private int viewCountAfterFilter;

    public /* synthetic */ ReplayCaptureMetrics(int i, int i2, int i3, int i4, int i5, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, j, j2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplayCaptureMetrics)) {
            return false;
        }
        ReplayCaptureMetrics replayCaptureMetrics = (ReplayCaptureMetrics) other;
        return this.viewCount == replayCaptureMetrics.viewCount && this.composeViewCount == replayCaptureMetrics.composeViewCount && this.errorViewCount == replayCaptureMetrics.errorViewCount && this.exceptionCausingViewCount == replayCaptureMetrics.exceptionCausingViewCount && this.viewCountAfterFilter == replayCaptureMetrics.viewCountAfterFilter && Duration.m28733equalsimpl0(this.parseDuration, replayCaptureMetrics.parseDuration) && this.encodingTimeMs == replayCaptureMetrics.encodingTimeMs;
    }

    public int hashCode() {
        return (((((((((((this.viewCount * 31) + this.composeViewCount) * 31) + this.errorViewCount) * 31) + this.exceptionCausingViewCount) * 31) + this.viewCountAfterFilter) * 31) + Duration.m28747hashCodeimpl(this.parseDuration)) * 31) + D8$$SyntheticClass6.m3324m(this.encodingTimeMs);
    }

    public String toString() {
        return "ReplayCaptureMetrics(viewCount=" + this.viewCount + ", composeViewCount=" + this.composeViewCount + ", errorViewCount=" + this.errorViewCount + ", exceptionCausingViewCount=" + this.exceptionCausingViewCount + ", viewCountAfterFilter=" + this.viewCountAfterFilter + ", parseDuration=" + ((Object) Duration.m28761toStringimpl(this.parseDuration)) + ", encodingTimeMs=" + this.encodingTimeMs + ')';
    }

    private ReplayCaptureMetrics(int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.viewCount = i;
        this.composeViewCount = i2;
        this.errorViewCount = i3;
        this.exceptionCausingViewCount = i4;
        this.viewCountAfterFilter = i5;
        this.parseDuration = j;
        this.encodingTimeMs = j2;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final void setViewCount(int i) {
        this.viewCount = i;
    }

    public final int getComposeViewCount() {
        return this.composeViewCount;
    }

    public final void setComposeViewCount(int i) {
        this.composeViewCount = i;
    }

    public final int getExceptionCausingViewCount() {
        return this.exceptionCausingViewCount;
    }

    public final void setExceptionCausingViewCount(int i) {
        this.exceptionCausingViewCount = i;
    }

    public final void setViewCountAfterFilter(int i) {
        this.viewCountAfterFilter = i;
    }

    public /* synthetic */ ReplayCaptureMetrics(int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? Duration.INSTANCE.m28767getZEROUwyO8pc() : j, (i6 & 64) != 0 ? 0L : j2, null);
    }

    /* renamed from: getParseDuration-UwyO8pc, reason: not valid java name and from getter */
    public final long getParseDuration() {
        return this.parseDuration;
    }

    /* renamed from: setParseDuration-LRDsOJo, reason: not valid java name */
    public final void m28463setParseDurationLRDsOJo(long j) {
        this.parseDuration = j;
    }

    public final void setEncodingTimeMs(long j) {
        this.encodingTimeMs = j;
    }

    private final long getTotalDurationMs() {
        return Duration.m28738getInWholeMillisecondsimpl(this.parseDuration) + this.encodingTimeMs;
    }

    public final Map<String, String> toMap() {
        return MapsKt.mapOf(Tuples4.m3642to("view_count", String.valueOf(this.viewCount)), Tuples4.m3642to("compose_view_count", String.valueOf(this.composeViewCount)), Tuples4.m3642to("view_count_after_filter", String.valueOf(this.viewCountAfterFilter)), Tuples4.m3642to("error_view_count", String.valueOf(this.errorViewCount)), Tuples4.m3642to("exception_causing_view_count", String.valueOf(this.exceptionCausingViewCount)), Tuples4.m3642to("parse_duration_ms", String.valueOf(Duration.m28738getInWholeMillisecondsimpl(this.parseDuration))), Tuples4.m3642to("encoding_time_ms", String.valueOf(this.encodingTimeMs)), Tuples4.m3642to("total_duration_ms", String.valueOf(getTotalDurationMs())));
    }
}
