package com.robinhood.shared.stepupverification.challenge;

import com.robinhood.models.api.pathfinder.UserViewInput;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "", "<init>", "()V", "Loading", "Error", "Exit", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState$Error;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState$Exit;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState$Loading;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeState, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class ChallengeDataState2 {
    public static final int $stable = 0;

    public /* synthetic */ ChallengeDataState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChallengeDataState2() {
    }

    /* compiled from: ChallengeDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeState$Loading;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeState$Loading */
    public static final /* data */ class Loading extends ChallengeDataState2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1993270271;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: ChallengeDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeState$Error;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "input", "Lcom/robinhood/models/api/pathfinder/UserViewInput;", "<init>", "(Lcom/robinhood/models/api/pathfinder/UserViewInput;)V", "getInput", "()Lcom/robinhood/models/api/pathfinder/UserViewInput;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeState$Error, reason: from toString */
    public static final /* data */ class Error extends ChallengeDataState2 {
        public static final int $stable = 8;
        private final UserViewInput input;

        public static /* synthetic */ Error copy$default(Error error, UserViewInput userViewInput, int i, Object obj) {
            if ((i & 1) != 0) {
                userViewInput = error.input;
            }
            return error.copy(userViewInput);
        }

        /* renamed from: component1, reason: from getter */
        public final UserViewInput getInput() {
            return this.input;
        }

        public final Error copy(UserViewInput input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new Error(input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.input, ((Error) other).input);
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return "Error(input=" + this.input + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(UserViewInput input) {
            super(null);
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
        }

        public final UserViewInput getInput() {
            return this.input;
        }
    }

    /* compiled from: ChallengeDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeState$Exit;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeState$Exit */
    public static final /* data */ class Exit extends ChallengeDataState2 {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Exit);
        }

        public int hashCode() {
            return 592405819;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
            super(null);
        }
    }
}
