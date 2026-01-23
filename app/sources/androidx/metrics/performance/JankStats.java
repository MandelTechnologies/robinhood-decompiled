package androidx.metrics.performance;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.PerformanceMetricsState;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JankStats.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, m3636d2 = {"Landroidx/metrics/performance/JankStats;", "", "Landroid/view/Window;", "window", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "frameListener", "<init>", "(Landroid/view/Window;Landroidx/metrics/performance/JankStats$OnFrameListener;)V", "Landroidx/metrics/performance/FrameData;", "volatileFrameData", "", "logFrameData$metrics_performance_release", "(Landroidx/metrics/performance/FrameData;)V", "logFrameData", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "holder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "Landroidx/metrics/performance/JankStatsBaseImpl;", "implementation", "Landroidx/metrics/performance/JankStatsBaseImpl;", "getImplementation$metrics_performance_release", "()Landroidx/metrics/performance/JankStatsBaseImpl;", "", "value", "isTrackingEnabled", "Z", "()Z", "setTrackingEnabled", "(Z)V", "", "jankHeuristicMultiplier", "F", "getJankHeuristicMultiplier", "()F", "setJankHeuristicMultiplier", "(F)V", "Companion", "OnFrameListener", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class JankStats {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final OnFrameListener frameListener;
    private final PerformanceMetricsState.Holder holder;
    private final JankStatsBaseImpl implementation;
    private boolean isTrackingEnabled;
    private float jankHeuristicMultiplier;

    /* compiled from: JankStats.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m3636d2 = {"Landroidx/metrics/performance/JankStats$OnFrameListener;", "", "onFrame", "", "volatileFrameData", "Landroidx/metrics/performance/FrameData;", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface OnFrameListener {
        void onFrame(FrameData volatileFrameData);
    }

    public /* synthetic */ JankStats(Window window, OnFrameListener onFrameListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(window, onFrameListener);
    }

    private JankStats(Window window, OnFrameListener onFrameListener) {
        JankStatsBaseImpl jankStatsApi24Impl;
        this.frameListener = onFrameListener;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        this.holder = PerformanceMetricsState.INSTANCE.create$metrics_performance_release(viewPeekDecorView);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            jankStatsApi24Impl = new JankStatsApi31Impl(this, viewPeekDecorView, window);
        } else if (i >= 26) {
            jankStatsApi24Impl = new JankStatsApi26Impl(this, viewPeekDecorView, window);
        } else {
            jankStatsApi24Impl = new JankStatsApi24Impl(this, viewPeekDecorView, window);
        }
        this.implementation = jankStatsApi24Impl;
        jankStatsApi24Impl.setupFrameTimer(true);
        this.isTrackingEnabled = true;
        this.jankHeuristicMultiplier = 2.0f;
    }

    public final void setTrackingEnabled(boolean z) {
        this.implementation.setupFrameTimer(z);
        this.isTrackingEnabled = z;
    }

    public final float getJankHeuristicMultiplier() {
        return this.jankHeuristicMultiplier;
    }

    public final void setJankHeuristicMultiplier(float f) {
        JankStatsBaseImpl.INSTANCE.setFrameDuration(-1L);
        this.jankHeuristicMultiplier = f;
    }

    public final void logFrameData$metrics_performance_release(FrameData volatileFrameData) {
        Intrinsics.checkNotNullParameter(volatileFrameData, "volatileFrameData");
        this.frameListener.onFrame(volatileFrameData);
    }

    /* compiled from: JankStats.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m3636d2 = {"Landroidx/metrics/performance/JankStats$Companion;", "", "()V", "createAndTrack", "Landroidx/metrics/performance/JankStats;", "window", "Landroid/view/Window;", "frameListener", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final JankStats createAndTrack(Window window, OnFrameListener frameListener) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(frameListener, "frameListener");
            return new JankStats(window, frameListener, null);
        }
    }
}
