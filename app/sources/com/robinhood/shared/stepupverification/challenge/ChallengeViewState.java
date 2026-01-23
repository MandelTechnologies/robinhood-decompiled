package com.robinhood.shared.stepupverification.challenge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeViewState;", "", "state", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "showLoadingView", "", "showErrorView", "<init>", "(Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;ZZ)V", "getState", "()Lcom/robinhood/shared/stepupverification/challenge/ChallengeState;", "getShowLoadingView", "()Z", "getShowErrorView", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeViewState {
    public static final int $stable = 0;
    private final boolean showErrorView;
    private final boolean showLoadingView;
    private final ChallengeDataState2 state;

    public static /* synthetic */ ChallengeViewState copy$default(ChallengeViewState challengeViewState, ChallengeDataState2 challengeDataState2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeDataState2 = challengeViewState.state;
        }
        if ((i & 2) != 0) {
            z = challengeViewState.showLoadingView;
        }
        if ((i & 4) != 0) {
            z2 = challengeViewState.showErrorView;
        }
        return challengeViewState.copy(challengeDataState2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ChallengeDataState2 getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowErrorView() {
        return this.showErrorView;
    }

    public final ChallengeViewState copy(ChallengeDataState2 state, boolean showLoadingView, boolean showErrorView) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new ChallengeViewState(state, showLoadingView, showErrorView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeViewState)) {
            return false;
        }
        ChallengeViewState challengeViewState = (ChallengeViewState) other;
        return Intrinsics.areEqual(this.state, challengeViewState.state) && this.showLoadingView == challengeViewState.showLoadingView && this.showErrorView == challengeViewState.showErrorView;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + Boolean.hashCode(this.showLoadingView)) * 31) + Boolean.hashCode(this.showErrorView);
    }

    public String toString() {
        return "ChallengeViewState(state=" + this.state + ", showLoadingView=" + this.showLoadingView + ", showErrorView=" + this.showErrorView + ")";
    }

    public ChallengeViewState(ChallengeDataState2 state, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.showLoadingView = z;
        this.showErrorView = z2;
    }

    public final ChallengeDataState2 getState() {
        return this.state;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final boolean getShowErrorView() {
        return this.showErrorView;
    }
}
