package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.rosetta.eventlogging.Boolean;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantTransferAnalyticsStateMachine.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine;", "", "<init>", "()V", "state", "Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine$State;", "getState", "()Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine$State;", "setState", "(Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine$State;)V", "sinkAccountChosenInstantDefaultSelected", "", "transferTypeChanged", "selectInstantTransferSelected", "State", "Result", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InstantTransferAnalyticsStateMachine {
    public static final int $stable = 8;
    private State state = State.NEITHER;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InstantTransferAnalyticsStateMachine.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine$State;", "", "causedByDefault", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "Lcom/robinhood/android/transfers/ui/max/AnalyticsBoolean;", "causedByUpsell", "<init>", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;)V", "getCausedByDefault", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getCausedByUpsell", "NEITHER", "DEFAULTED", "UPSOLD", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DEFAULTED;
        public static final State NEITHER;
        public static final State UPSOLD;
        private final Boolean causedByDefault;
        private final Boolean causedByUpsell;

        private static final /* synthetic */ State[] $values() {
            return new State[]{NEITHER, DEFAULTED, UPSOLD};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i, Boolean r3, Boolean r4) {
            this.causedByDefault = r3;
            this.causedByUpsell = r4;
        }

        public final Boolean getCausedByDefault() {
            return this.causedByDefault;
        }

        public final Boolean getCausedByUpsell() {
            return this.causedByUpsell;
        }

        static {
            Boolean r1 = Boolean.FALSE;
            NEITHER = new State("NEITHER", 0, r1, r1);
            Boolean r2 = Boolean.TRUE;
            DEFAULTED = new State("DEFAULTED", 1, r2, r1);
            UPSOLD = new State("UPSOLD", 2, r1, r2);
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

    public final State getState() {
        return this.state;
    }

    public final void setState(State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.state = state;
    }

    public final void sinkAccountChosenInstantDefaultSelected() {
        this.state = State.DEFAULTED;
    }

    public final void transferTypeChanged() {
        this.state = State.NEITHER;
    }

    public final void selectInstantTransferSelected() {
        this.state = State.UPSOLD;
    }

    /* compiled from: InstantTransferAnalyticsStateMachine.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J%\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine$Result;", "", "causedByDefault", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "Lcom/robinhood/android/transfers/ui/max/AnalyticsBoolean;", "causedByUpsell", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;)V", "getCausedByDefault", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getCausedByUpsell", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 0;
        private final Boolean causedByDefault;
        private final Boolean causedByUpsell;

        public static /* synthetic */ Result copy$default(Result result, Boolean r1, Boolean r2, int i, Object obj) {
            if ((i & 1) != 0) {
                r1 = result.causedByDefault;
            }
            if ((i & 2) != 0) {
                r2 = result.causedByUpsell;
            }
            return result.copy(r1, r2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getCausedByDefault() {
            return this.causedByDefault;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getCausedByUpsell() {
            return this.causedByUpsell;
        }

        public final Result copy(Boolean causedByDefault, Boolean causedByUpsell) {
            Intrinsics.checkNotNullParameter(causedByDefault, "causedByDefault");
            Intrinsics.checkNotNullParameter(causedByUpsell, "causedByUpsell");
            return new Result(causedByDefault, causedByUpsell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.causedByDefault == result.causedByDefault && this.causedByUpsell == result.causedByUpsell;
        }

        public int hashCode() {
            return (this.causedByDefault.hashCode() * 31) + this.causedByUpsell.hashCode();
        }

        public String toString() {
            return "Result(causedByDefault=" + this.causedByDefault + ", causedByUpsell=" + this.causedByUpsell + ")";
        }

        public Result(Boolean causedByDefault, Boolean causedByUpsell) {
            Intrinsics.checkNotNullParameter(causedByDefault, "causedByDefault");
            Intrinsics.checkNotNullParameter(causedByUpsell, "causedByUpsell");
            this.causedByDefault = causedByDefault;
            this.causedByUpsell = causedByUpsell;
        }

        public final Boolean getCausedByDefault() {
            return this.causedByDefault;
        }

        public final Boolean getCausedByUpsell() {
            return this.causedByUpsell;
        }
    }
}
