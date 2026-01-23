package com.robinhood.shared.unverifiedaccountrecovery;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UarContactSelfieVerificationInitiateViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState;", "", "state", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State;", "<init>", "(Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State;)V", "getState", "()Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "State", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UarContactSelfieVerificationInitiateViewState {
    public static final int $stable = 0;
    private final State state;

    public static /* synthetic */ UarContactSelfieVerificationInitiateViewState copy$default(UarContactSelfieVerificationInitiateViewState uarContactSelfieVerificationInitiateViewState, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            state = uarContactSelfieVerificationInitiateViewState.state;
        }
        return uarContactSelfieVerificationInitiateViewState.copy(state);
    }

    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final UarContactSelfieVerificationInitiateViewState copy(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new UarContactSelfieVerificationInitiateViewState(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UarContactSelfieVerificationInitiateViewState) && Intrinsics.areEqual(this.state, ((UarContactSelfieVerificationInitiateViewState) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "UarContactSelfieVerificationInitiateViewState(state=" + this.state + ")";
    }

    public UarContactSelfieVerificationInitiateViewState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    public final State getState() {
        return this.state;
    }

    /* compiled from: UarContactSelfieVerificationInitiateViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State;", "", "<init>", "()V", "InFlow", "Submitting", "SubmitNetworkError", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State$InFlow;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State$SubmitNetworkError;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State$Submitting;", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: UarContactSelfieVerificationInitiateViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State$InFlow;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class InFlow extends State {
            public static final int $stable = 0;
            public static final InFlow INSTANCE = new InFlow();

            private InFlow() {
                super(null);
            }
        }

        private State() {
        }

        /* compiled from: UarContactSelfieVerificationInitiateViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State$Submitting;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Submitting extends State {
            public static final int $stable = 0;
            public static final Submitting INSTANCE = new Submitting();

            private Submitting() {
                super(null);
            }
        }

        /* compiled from: UarContactSelfieVerificationInitiateViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State$SubmitNetworkError;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState$State;", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubmitNetworkError extends State {
            public static final int $stable = 0;
            private final boolean success;

            public static /* synthetic */ SubmitNetworkError copy$default(SubmitNetworkError submitNetworkError, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = submitNetworkError.success;
                }
                return submitNetworkError.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSuccess() {
                return this.success;
            }

            public final SubmitNetworkError copy(boolean success) {
                return new SubmitNetworkError(success);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitNetworkError) && this.success == ((SubmitNetworkError) other).success;
            }

            public int hashCode() {
                return Boolean.hashCode(this.success);
            }

            public String toString() {
                return "SubmitNetworkError(success=" + this.success + ")";
            }

            public SubmitNetworkError(boolean z) {
                super(null);
                this.success = z;
            }

            public final boolean getSuccess() {
                return this.success;
            }
        }
    }
}
