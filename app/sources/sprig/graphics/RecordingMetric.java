package sprig.graphics;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\t\u0010\fR\"\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\t\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lsprig/e/j;", "", "", "toString", "", "hashCode", "other", "", "equals", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "I", "()I", "(I)V", "sampleCount", "", "b", "J", "()J", "(J)V", "total", "<init>", "(IJ)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.e.j, reason: from toString */
/* loaded from: classes28.dex */
public final /* data */ class RecordingMetric {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private int sampleCount;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private long total;

    public RecordingMetric() {
        this(0, 0L, 3, null);
    }

    public RecordingMetric(int i, long j) {
        this.sampleCount = i;
        this.total = j;
    }

    /* renamed from: a, reason: from getter */
    public final int getSampleCount() {
        return this.sampleCount;
    }

    /* renamed from: b, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordingMetric)) {
            return false;
        }
        RecordingMetric recordingMetric = (RecordingMetric) other;
        return this.sampleCount == recordingMetric.sampleCount && this.total == recordingMetric.total;
    }

    public int hashCode() {
        return (Integer.hashCode(this.sampleCount) * 31) + Long.hashCode(this.total);
    }

    public String toString() {
        return "RecordingMetric(sampleCount=" + this.sampleCount + ", total=" + this.total + ')';
    }

    public /* synthetic */ RecordingMetric(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }

    /* renamed from: a */
    public final void m4192a(int i) {
        this.sampleCount = i;
    }

    /* renamed from: a */
    public final void m4193a(long j) {
        this.total = j;
    }
}
