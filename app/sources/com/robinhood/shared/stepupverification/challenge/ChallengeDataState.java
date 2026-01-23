package com.robinhood.shared.stepupverification.challenge;

import com.robinhood.shared.stepupverification.challenge.ChallengeDataState2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeDataState;", "", "state", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "<init>", "(Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;)V", "getState", "()Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "showLoadingView", "", "getShowLoadingView", "()Z", "showErrorView", "getShowErrorView", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeDataState {
    public static final int $stable = 0;
    private final ChallengeDataState2 state;

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChallengeDataState copy$default(ChallengeDataState challengeDataState, ChallengeDataState2 challengeDataState2, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeDataState2 = challengeDataState.state;
        }
        return challengeDataState.copy(challengeDataState2);
    }

    /* renamed from: component1, reason: from getter */
    public final ChallengeDataState2 getState() {
        return this.state;
    }

    public final ChallengeDataState copy(ChallengeDataState2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new ChallengeDataState(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChallengeDataState) && Intrinsics.areEqual(this.state, ((ChallengeDataState) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "ChallengeDataState(state=" + this.state + ")";
    }

    public ChallengeDataState(ChallengeDataState2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    public /* synthetic */ ChallengeDataState(ChallengeDataState2 challengeDataState2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ChallengeDataState2.Loading.INSTANCE : challengeDataState2);
    }

    public final ChallengeDataState2 getState() {
        return this.state;
    }

    public final boolean getShowLoadingView() {
        return !getShowErrorView();
    }

    public final boolean getShowErrorView() {
        return this.state instanceof ChallengeDataState2.Error;
    }
}
