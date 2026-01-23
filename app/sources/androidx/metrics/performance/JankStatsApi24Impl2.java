package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.PerformanceMetricsState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JankStatsApi24Impl.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016¨\u0006\""}, m3636d2 = {"Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "", "delegates", "<init>", "(Ljava/util/List;)V", "Landroid/view/Window;", "window", "Landroid/view/FrameMetrics;", "frameMetrics", "", "dropCount", "", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "delegate", "add", "(Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "remove", "(Landroid/view/Window$OnFrameMetricsAvailableListener;Landroid/view/Window;)V", "Ljava/util/List;", "getDelegates", "()Ljava/util/List;", "", "iterating", "Z", "getIterating", "()Z", "setIterating", "(Z)V", "toBeAdded", "getToBeAdded", "toBeRemoved", "getToBeRemoved", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.metrics.performance.DelegatingFrameMetricsListener, reason: use source file name */
/* loaded from: classes4.dex */
final class JankStatsApi24Impl2 implements Window.OnFrameMetricsAvailableListener {
    private final List<Window.OnFrameMetricsAvailableListener> delegates;
    private boolean iterating;
    private final List<Window.OnFrameMetricsAvailableListener> toBeAdded;
    private final List<Window.OnFrameMetricsAvailableListener> toBeRemoved;

    public JankStatsApi24Impl2(List<Window.OnFrameMetricsAvailableListener> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.delegates = delegates;
        this.toBeAdded = new ArrayList();
        this.toBeRemoved = new ArrayList();
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int dropCount) {
        View decorView;
        synchronized (this) {
            try {
                this.iterating = true;
                Iterator<Window.OnFrameMetricsAvailableListener> it = this.delegates.iterator();
                while (it.hasNext()) {
                    it.next().onFrameMetricsAvailable(window, frameMetrics, dropCount);
                }
                if (!this.toBeAdded.isEmpty()) {
                    Iterator<Window.OnFrameMetricsAvailableListener> it2 = this.toBeAdded.iterator();
                    while (it2.hasNext()) {
                        this.delegates.add(it2.next());
                    }
                    this.toBeAdded.clear();
                }
                if (!this.toBeRemoved.isEmpty()) {
                    boolean zIsEmpty = this.delegates.isEmpty();
                    Iterator<Window.OnFrameMetricsAvailableListener> it3 = this.toBeRemoved.iterator();
                    while (it3.hasNext()) {
                        this.delegates.remove(it3.next());
                    }
                    this.toBeRemoved.clear();
                    if (!zIsEmpty && this.delegates.isEmpty()) {
                        if (window != null) {
                            window.removeOnFrameMetricsAvailableListener(this);
                        }
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setTag(R$id.metricsDelegator, null);
                        }
                    }
                }
                this.iterating = false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (window != null) {
            PerformanceMetricsState.Companion companion = PerformanceMetricsState.INSTANCE;
            View decorView2 = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
            PerformanceMetricsState state = companion.getHolderForHierarchy(decorView2).getState();
            if (state != null) {
                state.cleanupSingleFrameStates$metrics_performance_release();
            }
        }
    }

    public final void add(Window.OnFrameMetricsAvailableListener delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        synchronized (this) {
            try {
                if (this.iterating) {
                    this.toBeAdded.add(delegate);
                } else {
                    this.delegates.add(delegate);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void remove(Window.OnFrameMetricsAvailableListener delegate, Window window) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(window, "window");
        synchronized (this) {
            try {
                if (this.iterating) {
                    this.toBeRemoved.add(delegate);
                } else {
                    boolean zIsEmpty = this.delegates.isEmpty();
                    this.delegates.remove(delegate);
                    if (!zIsEmpty && this.delegates.isEmpty()) {
                        window.removeOnFrameMetricsAvailableListener(this);
                        window.getDecorView().setTag(R$id.metricsDelegator, null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
