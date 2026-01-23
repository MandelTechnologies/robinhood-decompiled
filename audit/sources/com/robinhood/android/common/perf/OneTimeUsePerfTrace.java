package com.robinhood.android.common.perf;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: OneTimeUsePerfTrace.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/perf/OneTimeUsePerfTrace;", "", "traceName", "", "<init>", "(Ljava/lang/String;)V", "trace", "Lcom/google/firebase/perf/metrics/Trace;", "state", "Lcom/robinhood/android/common/perf/OneTimeUsePerfTrace$State;", "start", "", "stop", "State", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OneTimeUsePerfTrace {
    public static final int $stable = 8;
    private State state;
    private final Trace trace;

    public OneTimeUsePerfTrace(String traceName) {
        Trace traceNewTrace;
        Intrinsics.checkNotNullParameter(traceName, "traceName");
        try {
            traceNewTrace = FirebasePerformance.getInstance().newTrace(traceName);
        } catch (IllegalStateException e) {
            Timber.INSTANCE.mo3355e(e, "Could not initialize OneTimeUsePerfTrace", new Object[0]);
            traceNewTrace = null;
        }
        this.trace = traceNewTrace;
        this.state = State.IDLE;
    }

    public final synchronized void start() {
        if (this.state == State.IDLE) {
            this.state = State.RUNNING;
            Trace trace = this.trace;
            if (trace != null) {
                trace.start();
            }
        }
    }

    public final synchronized void stop() {
        if (this.state == State.RUNNING) {
            this.state = State.STOPPED;
            Trace trace = this.trace;
            if (trace != null) {
                trace.stop();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneTimeUsePerfTrace.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/perf/OneTimeUsePerfTrace$State;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "RUNNING", "STOPPED", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State RUNNING = new State("RUNNING", 1);
        public static final State STOPPED = new State("STOPPED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, RUNNING, STOPPED};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }
}
