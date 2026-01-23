package androidx.metrics.performance;

import android.view.Choreographer;
import android.view.View;
import androidx.metrics.performance.PerformanceMetricsState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JankStatsApi16Impl.kt */
@Metadata(m3635d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001&\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Landroidx/metrics/performance/JankStatsApi16Impl;", "Landroidx/metrics/performance/JankStatsBaseImpl;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroid/view/View;", "view", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;)V", "", "getFrameStartTime$metrics_performance_release", "()J", "getFrameStartTime", "getExpectedFrameDuration", "(Landroid/view/View;)J", "Ljava/lang/ref/WeakReference;", "decorViewRef", "Ljava/lang/ref/WeakReference;", "getDecorViewRef$metrics_performance_release", "()Ljava/lang/ref/WeakReference;", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "metricsStateHolder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "getMetricsStateHolder", "()Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "", "Landroidx/metrics/performance/StateInfo;", "stateInfo", "Ljava/util/List;", "getStateInfo", "()Ljava/util/List;", "Landroidx/metrics/performance/FrameData;", "frameData", "Landroidx/metrics/performance/FrameData;", "androidx/metrics/performance/JankStatsApi16Impl$onFrameListenerDelegate$1", "onFrameListenerDelegate", "Landroidx/metrics/performance/JankStatsApi16Impl$onFrameListenerDelegate$1;", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public class JankStatsApi16Impl extends JankStatsBaseImpl {
    private final Choreographer choreographer;
    private final WeakReference<View> decorViewRef;
    private final FrameData frameData;
    private final PerformanceMetricsState.Holder metricsStateHolder;
    private final JankStatsApi16Impl3 onFrameListenerDelegate;
    private final List<FrameData2> stateInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.metrics.performance.JankStatsApi16Impl$onFrameListenerDelegate$1] */
    public JankStatsApi16Impl(final JankStats jankStats, View view) {
        super(jankStats);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        this.decorViewRef = new WeakReference<>(view);
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
        this.choreographer = choreographer;
        this.metricsStateHolder = PerformanceMetricsState.INSTANCE.getHolderForHierarchy(view);
        ArrayList arrayList = new ArrayList();
        this.stateInfo = arrayList;
        this.frameData = new FrameData(0L, 0L, false, arrayList);
        this.onFrameListenerDelegate = new JankStatsApi16Impl4() { // from class: androidx.metrics.performance.JankStatsApi16Impl$onFrameListenerDelegate$1
        };
    }

    public final WeakReference<View> getDecorViewRef$metrics_performance_release() {
        return this.decorViewRef;
    }

    public final PerformanceMetricsState.Holder getMetricsStateHolder() {
        return this.metricsStateHolder;
    }

    public final List<FrameData2> getStateInfo() {
        return this.stateInfo;
    }

    public final long getFrameStartTime$metrics_performance_release() throws IllegalAccessException, IllegalArgumentException {
        Object obj = JankStatsApi16Impl2.INSTANCE.getChoreographerLastFrameTimeField().get(this.choreographer);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    public final long getExpectedFrameDuration(View view) {
        return JankStatsApi16Impl2.INSTANCE.getExpectedFrameDuration(view);
    }
}
