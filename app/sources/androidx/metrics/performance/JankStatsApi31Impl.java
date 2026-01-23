package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JankStatsApi31Impl.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Landroidx/metrics/performance/JankStatsApi31Impl;", "Landroidx/metrics/performance/JankStatsApi26Impl;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroid/view/View;", "view", "Landroid/view/Window;", "window", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "", "startTime", "expectedDuration", "Landroid/view/FrameMetrics;", "frameMetrics", "Landroidx/metrics/performance/FrameDataApi31;", "getFrameData$metrics_performance_release", "(JJLandroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameDataApi31;", "getFrameData", "metrics", "getExpectedFrameDuration", "(Landroid/view/FrameMetrics;)J", "frameData", "Landroidx/metrics/performance/FrameDataApi31;", "()Landroidx/metrics/performance/FrameDataApi31;", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class JankStatsApi31Impl extends JankStatsApi26Impl {
    private final FrameData frameData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi31Impl(JankStats jankStats, View view, Window window) {
        super(jankStats, view, window);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        this.frameData = new FrameData(0L, 0L, 0L, 0L, 0L, false, getStateInfo());
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public FrameData getFrameData$metrics_performance_release(long startTime, long expectedDuration, FrameMetrics frameMetrics) {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        setPrevEnd(startTime + metric);
        PerformanceMetricsState state = getMetricsStateHolder().getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(startTime, getPrevEnd(), getStateInfo());
        }
        boolean z = metric > expectedDuration;
        long metric2 = frameMetrics.getMetric(8);
        this.frameData.update$metrics_performance_release(startTime, metric, (metric2 - frameMetrics.getMetric(12)) + frameMetrics.getMetric(7), metric2, metric2 - frameMetrics.getMetric(13), z);
        return this.frameData;
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public long getExpectedFrameDuration(FrameMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return metrics.getMetric(13);
    }
}
