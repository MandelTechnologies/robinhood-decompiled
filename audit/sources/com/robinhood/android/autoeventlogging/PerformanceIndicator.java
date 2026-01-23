package com.robinhood.android.autoeventlogging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceIndicator.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/PerformanceIndicator;", "", "identifier", "", "state", "Lcom/robinhood/android/autoeventlogging/PerformanceIndicator$State;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/autoeventlogging/PerformanceIndicator$State;)V", "getIdentifier", "()Ljava/lang/String;", "getState", "()Lcom/robinhood/android/autoeventlogging/PerformanceIndicator$State;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PerformanceIndicator {
    private final String identifier;
    private final State state;

    public static /* synthetic */ PerformanceIndicator copy$default(PerformanceIndicator performanceIndicator, String str, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performanceIndicator.identifier;
        }
        if ((i & 2) != 0) {
            state = performanceIndicator.state;
        }
        return performanceIndicator.copy(str, state);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final PerformanceIndicator copy(String identifier, State state) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(state, "state");
        return new PerformanceIndicator(identifier, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformanceIndicator)) {
            return false;
        }
        PerformanceIndicator performanceIndicator = (PerformanceIndicator) other;
        return Intrinsics.areEqual(this.identifier, performanceIndicator.identifier) && this.state == performanceIndicator.state;
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.state.hashCode();
    }

    public String toString() {
        return "PerformanceIndicator(identifier=" + this.identifier + ", state=" + this.state + ")";
    }

    public PerformanceIndicator(String identifier, State state) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(state, "state");
        this.identifier = identifier;
        this.state = state;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final State getState() {
        return this.state;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceIndicator.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/PerformanceIndicator$State;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "FAILED", "COMPLETED", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State LOADING = new State("LOADING", 0);
        public static final State FAILED = new State("FAILED", 1);
        public static final State COMPLETED = new State("COMPLETED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{LOADING, FAILED, COMPLETED};
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
