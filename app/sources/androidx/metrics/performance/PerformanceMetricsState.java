package androidx.metrics.performance;

import android.view.View;
import android.view.ViewParent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceMetricsState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0003)*+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0016J-\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\fH\u0000¢\u0006\u0004\b!\u0010\u0003R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#¨\u0006,"}, m3636d2 = {"Landroidx/metrics/performance/PerformanceMetricsState;", "", "<init>", "()V", "", "frameStartTime", "frameEndTime", "", "Landroidx/metrics/performance/StateInfo;", "frameStates", "Landroidx/metrics/performance/PerformanceMetricsState$StateData;", "activeStates", "", "addFrameState", "(JJLjava/util/List;Ljava/util/List;)V", "", "key", "", "states", "removalTime", "markStateForRemoval", "(Ljava/lang/String;Ljava/util/List;J)V", "(Ljava/lang/String;)V", "stateData", "returnStateDataToPool$metrics_performance_release", "(Landroidx/metrics/performance/PerformanceMetricsState$StateData;)V", "returnStateDataToPool", "removeState", "startTime", "endTime", "getIntervalStates$metrics_performance_release", "(JJLjava/util/List;)V", "getIntervalStates", "cleanupSingleFrameStates$metrics_performance_release", "cleanupSingleFrameStates", "Ljava/util/List;", "singleFrameStates", "statesHolder", "", "statesToBeCleared", "stateDataPool", "Companion", "Holder", "StateData", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class PerformanceMetricsState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<StateData> singleFrameStates;
    private final List<StateData> stateDataPool;
    private List<StateData> states;
    private final List<StateData> statesHolder;
    private final List<Integer> statesToBeCleared;

    public /* synthetic */ PerformanceMetricsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PerformanceMetricsState() {
        this.states = new ArrayList();
        this.singleFrameStates = new ArrayList();
        this.statesHolder = new ArrayList();
        this.statesToBeCleared = new ArrayList();
        this.stateDataPool = new ArrayList();
    }

    private final void addFrameState(long frameStartTime, long frameEndTime, List<FrameData2> frameStates, List<StateData> activeStates) {
        int size = activeStates.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                StateData stateData = activeStates.get(size);
                if (stateData.getTimeRemoved() > 0 && stateData.getTimeRemoved() < frameStartTime) {
                    returnStateDataToPool$metrics_performance_release(activeStates.remove(size));
                } else if (stateData.getTimeAdded() < frameEndTime) {
                    this.statesHolder.add(stateData);
                    if (Intrinsics.areEqual(activeStates, this.singleFrameStates) && stateData.getTimeRemoved() == -1) {
                        stateData.setTimeRemoved(System.nanoTime());
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (this.statesHolder.size() > 0) {
            int size2 = this.statesHolder.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!this.statesToBeCleared.contains(Integer.valueOf(i2))) {
                    StateData stateData2 = this.statesHolder.get(i2);
                    int size3 = this.statesHolder.size();
                    for (int i3 = i2 + 1; i3 < size3; i3++) {
                        StateData stateData3 = this.statesHolder.get(i3);
                        if (Intrinsics.areEqual(stateData2.getState().getKey(), stateData3.getState().getKey())) {
                            if (stateData2.getTimeAdded() < stateData3.getTimeAdded()) {
                                this.statesToBeCleared.add(Integer.valueOf(i2));
                            } else {
                                this.statesToBeCleared.add(Integer.valueOf(i3));
                            }
                        }
                    }
                }
            }
            for (int size4 = this.statesToBeCleared.size() - 1; -1 < size4; size4--) {
                this.statesHolder.remove(this.statesToBeCleared.get(size4).intValue());
            }
            int size5 = this.statesHolder.size();
            for (int i4 = 0; i4 < size5; i4++) {
                frameStates.add(this.statesHolder.get(i4).getState());
            }
            this.statesHolder.clear();
            this.statesToBeCleared.clear();
        }
    }

    private final void markStateForRemoval(String key, List<StateData> states, long removalTime) {
        synchronized (this.singleFrameStates) {
            try {
                int size = states.size();
                for (int i = 0; i < size; i++) {
                    StateData stateData = states.get(i);
                    if (Intrinsics.areEqual(stateData.getState().getKey(), key) && stateData.getTimeRemoved() < 0) {
                        stateData.setTimeRemoved(removalTime);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void markStateForRemoval(String key) {
        markStateForRemoval(key, this.states, System.nanoTime());
    }

    /* compiled from: PerformanceMetricsState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Landroidx/metrics/performance/PerformanceMetricsState$StateData;", "", "", "timeAdded", "J", "getTimeAdded", "()J", "setTimeAdded", "(J)V", "timeRemoved", "getTimeRemoved", "setTimeRemoved", "Landroidx/metrics/performance/StateInfo;", "state", "Landroidx/metrics/performance/StateInfo;", "getState", "()Landroidx/metrics/performance/StateInfo;", "setState", "(Landroidx/metrics/performance/StateInfo;)V", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class StateData {
        private FrameData2 state;
        private long timeAdded;
        private long timeRemoved;

        public final long getTimeAdded() {
            return this.timeAdded;
        }

        public final long getTimeRemoved() {
            return this.timeRemoved;
        }

        public final void setTimeRemoved(long j) {
            this.timeRemoved = j;
        }

        public final FrameData2 getState() {
            return this.state;
        }
    }

    public final void returnStateDataToPool$metrics_performance_release(StateData stateData) {
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        synchronized (this.stateDataPool) {
            try {
                this.stateDataPool.add(stateData);
            } catch (OutOfMemoryError unused) {
                this.stateDataPool.clear();
                this.stateDataPool.add(stateData);
            }
        }
    }

    public final void removeState(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        markStateForRemoval(key);
    }

    public final void getIntervalStates$metrics_performance_release(long startTime, long endTime, List<FrameData2> frameStates) {
        Intrinsics.checkNotNullParameter(frameStates, "frameStates");
        synchronized (this.singleFrameStates) {
            frameStates.clear();
            addFrameState(startTime, endTime, frameStates, this.states);
            addFrameState(startTime, endTime, frameStates, this.singleFrameStates);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void cleanupSingleFrameStates$metrics_performance_release() {
        synchronized (this.singleFrameStates) {
            try {
                for (int size = this.singleFrameStates.size() - 1; -1 < size; size--) {
                    if (this.singleFrameStates.get(size).getTimeRemoved() != -1) {
                        returnStateDataToPool$metrics_performance_release(this.singleFrameStates.remove(size));
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: PerformanceMetricsState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Landroidx/metrics/performance/PerformanceMetricsState$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "view", "Landroid/view/View;", "create$metrics_performance_release", "getHolderForHierarchy", "getRootView", "getRootView$metrics_performance_release", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Holder getHolderForHierarchy(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            View rootView$metrics_performance_release = getRootView$metrics_performance_release(view);
            Object tag = rootView$metrics_performance_release.getTag(R$id.metricsStateHolder);
            if (tag == null) {
                tag = new Holder();
                rootView$metrics_performance_release.setTag(R$id.metricsStateHolder, tag);
            }
            return (Holder) tag;
        }

        @JvmStatic
        public final Holder create$metrics_performance_release(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Holder holderForHierarchy = getHolderForHierarchy(view);
            if (holderForHierarchy.getState() == null) {
                holderForHierarchy.setState$metrics_performance_release(new PerformanceMetricsState(null));
            }
            return holderForHierarchy;
        }

        public final View getRootView$metrics_performance_release(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                view = parent;
                parent = view.getParent();
            }
            return view;
        }
    }

    /* compiled from: PerformanceMetricsState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "", "()V", "<set-?>", "Landroidx/metrics/performance/PerformanceMetricsState;", "state", "getState", "()Landroidx/metrics/performance/PerformanceMetricsState;", "setState$metrics_performance_release", "(Landroidx/metrics/performance/PerformanceMetricsState;)V", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Holder {
        private PerformanceMetricsState state;

        public final PerformanceMetricsState getState() {
            return this.state;
        }

        public final void setState$metrics_performance_release(PerformanceMetricsState performanceMetricsState) {
            this.state = performanceMetricsState;
        }
    }
}
