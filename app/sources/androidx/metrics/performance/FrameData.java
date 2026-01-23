package androidx.metrics.performance;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrameDataApi31.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, m3636d2 = {"Landroidx/metrics/performance/FrameDataApi31;", "Landroidx/metrics/performance/FrameDataApi24;", "", "frameStartNanos", "frameDurationUiNanos", "frameDurationCpuNanos", "frameDurationTotalNanos", "frameOverrunNanos", "", "isJank", "", "Landroidx/metrics/performance/StateInfo;", "states", "<init>", "(JJJJJZLjava/util/List;)V", "", "update$metrics_performance_release", "(JJJJJZ)V", "update", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "<set-?>", "J", "getFrameDurationTotalNanos", "()J", "getFrameOverrunNanos", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.metrics.performance.FrameDataApi31, reason: from toString */
/* loaded from: classes4.dex */
public final class FrameData extends androidx.metrics.performance.FrameData {
    private long frameDurationTotalNanos;
    private long frameOverrunNanos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameData(long j, long j2, long j3, long j4, long j5, boolean z, List<FrameData2> states) {
        super(j, j2, j3, z, states);
        Intrinsics.checkNotNullParameter(states, "states");
        this.frameDurationTotalNanos = j4;
        this.frameOverrunNanos = j5;
    }

    public final long getFrameDurationTotalNanos() {
        return this.frameDurationTotalNanos;
    }

    public final void update$metrics_performance_release(long frameStartNanos, long frameDurationUiNanos, long frameDurationCpuNanos, long frameDurationTotalNanos, long frameOverrunNanos, boolean isJank) {
        super.update$metrics_performance_release(frameStartNanos, frameDurationUiNanos, frameDurationCpuNanos, isJank);
        this.frameDurationTotalNanos = frameDurationTotalNanos;
        this.frameOverrunNanos = frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameData, androidx.metrics.performance.FrameData
    public boolean equals(Object other) {
        if (!(other instanceof FrameData) || !super.equals(other)) {
            return false;
        }
        FrameData frameData = (FrameData) other;
        return this.frameDurationTotalNanos == frameData.frameDurationTotalNanos && this.frameOverrunNanos == frameData.frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameData, androidx.metrics.performance.FrameData
    public int hashCode() {
        return (super.hashCode() * 31) + (Long.hashCode(this.frameDurationTotalNanos) * 31) + Long.hashCode(this.frameOverrunNanos);
    }

    @Override // androidx.metrics.performance.FrameData, androidx.metrics.performance.FrameData
    public String toString() {
        return "FrameData(frameStartNanos=" + getFrameStartNanos() + ", frameDurationUiNanos=" + getFrameDurationUiNanos() + ", frameDurationCpuNanos=" + getFrameDurationCpuNanos() + ", frameDurationTotalNanos=" + this.frameDurationTotalNanos + ", frameOverrunNanos=" + this.frameOverrunNanos + ", isJank=" + getIsJank() + ", states=" + getStates() + ')';
    }
}
