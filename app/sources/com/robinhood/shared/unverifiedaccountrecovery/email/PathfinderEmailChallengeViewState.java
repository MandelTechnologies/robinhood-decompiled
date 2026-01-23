package com.robinhood.shared.unverifiedaccountrecovery.email;

import com.robinhood.models.api.pathfinder.UserViewInput;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderEmailChallengeViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState;", "", "state", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State;", "<init>", "(Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State;)V", "getState", "()Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "State", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PathfinderEmailChallengeViewState {
    public static final int $stable = 0;
    private final State state;

    /* JADX WARN: Multi-variable type inference failed */
    public PathfinderEmailChallengeViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PathfinderEmailChallengeViewState copy$default(PathfinderEmailChallengeViewState pathfinderEmailChallengeViewState, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            state = pathfinderEmailChallengeViewState.state;
        }
        return pathfinderEmailChallengeViewState.copy(state);
    }

    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final PathfinderEmailChallengeViewState copy(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new PathfinderEmailChallengeViewState(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PathfinderEmailChallengeViewState) && Intrinsics.areEqual(this.state, ((PathfinderEmailChallengeViewState) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "PathfinderEmailChallengeViewState(state=" + this.state + ")";
    }

    public PathfinderEmailChallengeViewState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    public /* synthetic */ PathfinderEmailChallengeViewState(State state, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? State.VerifyingEmail.INSTANCE : state);
    }

    public final State getState() {
        return this.state;
    }

    /* compiled from: PathfinderEmailChallengeViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State;", "", "<init>", "()V", "VerifyingEmail", "SubmittingChallenge", "SubmitChallengeNetworkError", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State$SubmitChallengeNetworkError;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State$SubmittingChallenge;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State$VerifyingEmail;", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PathfinderEmailChallengeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State$VerifyingEmail;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class VerifyingEmail extends State {
            public static final int $stable = 0;
            public static final VerifyingEmail INSTANCE = new VerifyingEmail();

            private VerifyingEmail() {
                super(null);
            }
        }

        private State() {
        }

        /* compiled from: PathfinderEmailChallengeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State$SubmittingChallenge;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SubmittingChallenge extends State {
            public static final int $stable = 0;
            public static final SubmittingChallenge INSTANCE = new SubmittingChallenge();

            private SubmittingChallenge() {
                super(null);
            }
        }

        /* compiled from: PathfinderEmailChallengeViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State$SubmitChallengeNetworkError;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState$State;", "input", "Lcom/robinhood/models/api/pathfinder/UserViewInput;", "<init>", "(Lcom/robinhood/models/api/pathfinder/UserViewInput;)V", "getInput", "()Lcom/robinhood/models/api/pathfinder/UserViewInput;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubmitChallengeNetworkError extends State {
            public static final int $stable = 8;
            private final UserViewInput input;

            public static /* synthetic */ SubmitChallengeNetworkError copy$default(SubmitChallengeNetworkError submitChallengeNetworkError, UserViewInput userViewInput, int i, Object obj) {
                if ((i & 1) != 0) {
                    userViewInput = submitChallengeNetworkError.input;
                }
                return submitChallengeNetworkError.copy(userViewInput);
            }

            /* renamed from: component1, reason: from getter */
            public final UserViewInput getInput() {
                return this.input;
            }

            public final SubmitChallengeNetworkError copy(UserViewInput input) {
                Intrinsics.checkNotNullParameter(input, "input");
                return new SubmitChallengeNetworkError(input);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitChallengeNetworkError) && Intrinsics.areEqual(this.input, ((SubmitChallengeNetworkError) other).input);
            }

            public int hashCode() {
                return this.input.hashCode();
            }

            public String toString() {
                return "SubmitChallengeNetworkError(input=" + this.input + ")";
            }

            public final UserViewInput getInput() {
                return this.input;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubmitChallengeNetworkError(UserViewInput input) {
                super(null);
                Intrinsics.checkNotNullParameter(input, "input");
                this.input = input;
            }
        }
    }
}
