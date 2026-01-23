package androidx.metrics.performance;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JankStatsApi24Impl.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0011\u0018\u0000 52\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\"\u0010.\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u0014\u00101\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m3636d2 = {"Landroidx/metrics/performance/JankStatsApi24Impl;", "Landroidx/metrics/performance/JankStatsApi22Impl;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroid/view/View;", "view", "Landroid/view/Window;", "window", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "delegate", "", "removeFrameMetricsListenerDelegate", "(Landroid/view/Window;Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "getOrCreateFrameMetricsListenerDelegator", "(Landroid/view/Window;)Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "", "startTime", "expectedDuration", "Landroid/view/FrameMetrics;", "frameMetrics", "Landroidx/metrics/performance/FrameDataApi24;", "getFrameData$metrics_performance_release", "(JJLandroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameDataApi24;", "getFrameData", "getFrameStartTime$metrics_performance_release", "(Landroid/view/FrameMetrics;)J", "getFrameStartTime", "metrics", "getExpectedFrameDuration", "", "enable", "setupFrameTimer", "(Z)V", "Landroid/view/Window;", "prevStart", "J", "getPrevStart", "()J", "setPrevStart", "(J)V", "listenerAddedTime", "getListenerAddedTime", "setListenerAddedTime", "prevEnd", "getPrevEnd", "setPrevEnd", "frameData", "Landroidx/metrics/performance/FrameDataApi24;", "frameMetricsAvailableListenerDelegate", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "Companion", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public class JankStatsApi24Impl extends JankStatsApi22Impl {
    private static Handler frameMetricsHandler;
    private final FrameData frameData;
    private final Window.OnFrameMetricsAvailableListener frameMetricsAvailableListenerDelegate;
    private long listenerAddedTime;
    private long prevEnd;
    private long prevStart;
    private final Window window;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi24Impl(final JankStats jankStats, View view, Window window) {
        super(jankStats, view);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        this.window = window;
        this.frameData = new FrameData(0L, 0L, 0L, false, getStateInfo());
        this.frameMetricsAvailableListenerDelegate = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.metrics.performance.JankStatsApi24Impl$$ExternalSyntheticLambda0
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                JankStatsApi24Impl.frameMetricsAvailableListenerDelegate$lambda$0(this.f$0, jankStats, window2, frameMetrics, i);
            }
        };
    }

    public final long getPrevEnd() {
        return this.prevEnd;
    }

    public final void setPrevEnd(long j) {
        this.prevEnd = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameMetricsAvailableListenerDelegate$lambda$0(JankStatsApi24Impl this$0, JankStats jankStats, Window window, FrameMetrics frameMetrics, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jankStats, "$jankStats");
        Intrinsics.checkNotNullExpressionValue(frameMetrics, "frameMetrics");
        long jMax = Math.max(this$0.getFrameStartTime$metrics_performance_release(frameMetrics), this$0.prevEnd);
        if (jMax < this$0.listenerAddedTime || jMax == this$0.prevStart) {
            return;
        }
        jankStats.logFrameData$metrics_performance_release(this$0.getFrameData$metrics_performance_release(jMax, (long) (this$0.getExpectedFrameDuration(frameMetrics) * jankStats.getJankHeuristicMultiplier()), frameMetrics));
        this$0.prevStart = jMax;
    }

    public FrameData getFrameData$metrics_performance_release(long startTime, long expectedDuration, FrameMetrics frameMetrics) {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        this.prevEnd = startTime + metric;
        PerformanceMetricsState state = getMetricsStateHolder().getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(startTime, this.prevEnd, getStateInfo());
        }
        this.frameData.update$metrics_performance_release(startTime, metric, frameMetrics.getMetric(8), metric > expectedDuration);
        return this.frameData;
    }

    public long getFrameStartTime$metrics_performance_release(FrameMetrics frameMetrics) {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        return getFrameStartTime$metrics_performance_release();
    }

    public long getExpectedFrameDuration(FrameMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return getExpectedFrameDuration(getDecorViewRef$metrics_performance_release().get());
    }

    @Override // androidx.metrics.performance.JankStatsBaseImpl
    public void setupFrameTimer(boolean enable) {
        synchronized (this.window) {
            try {
                if (!enable) {
                    removeFrameMetricsListenerDelegate(this.window, this.frameMetricsAvailableListenerDelegate);
                    this.listenerAddedTime = 0L;
                } else if (this.listenerAddedTime == 0) {
                    getOrCreateFrameMetricsListenerDelegator(this.window).add(this.frameMetricsAvailableListenerDelegate);
                    this.listenerAddedTime = System.nanoTime();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void removeFrameMetricsListenerDelegate(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        JankStatsApi24Impl2 jankStatsApi24Impl2 = (JankStatsApi24Impl2) window.getDecorView().getTag(R$id.metricsDelegator);
        if (jankStatsApi24Impl2 != null) {
            jankStatsApi24Impl2.remove(onFrameMetricsAvailableListener, window);
        }
    }

    private final JankStatsApi24Impl2 getOrCreateFrameMetricsListenerDelegator(Window window) {
        JankStatsApi24Impl2 jankStatsApi24Impl2 = (JankStatsApi24Impl2) window.getDecorView().getTag(R$id.metricsDelegator);
        if (jankStatsApi24Impl2 != null) {
            return jankStatsApi24Impl2;
        }
        JankStatsApi24Impl2 jankStatsApi24Impl22 = new JankStatsApi24Impl2(new ArrayList());
        if (frameMetricsHandler == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            frameMetricsHandler = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(jankStatsApi24Impl22, frameMetricsHandler);
        window.getDecorView().setTag(R$id.metricsDelegator, jankStatsApi24Impl22);
        return jankStatsApi24Impl22;
    }
}
