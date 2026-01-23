package com.robinhood.android.referral.fractionalRewards.loading;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardLoadingViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingViewState;", "", "error", "Lcom/robinhood/udf/UiEvent;", "", "completedLoadedState", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadedState;", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadedState;)V", "getError", "()Lcom/robinhood/udf/UiEvent;", "getCompletedLoadedState", "()Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadedState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FractionalRewardLoadingViewState {
    public static final int $stable = 8;
    private final FractionalRewardLoadedState completedLoadedState;
    private final UiEvent<Throwable> error;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionalRewardLoadingViewState copy$default(FractionalRewardLoadingViewState fractionalRewardLoadingViewState, UiEvent uiEvent, FractionalRewardLoadedState fractionalRewardLoadedState, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = fractionalRewardLoadingViewState.error;
        }
        if ((i & 2) != 0) {
            fractionalRewardLoadedState = fractionalRewardLoadingViewState.completedLoadedState;
        }
        return fractionalRewardLoadingViewState.copy(uiEvent, fractionalRewardLoadedState);
    }

    public final UiEvent<Throwable> component1() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final FractionalRewardLoadedState getCompletedLoadedState() {
        return this.completedLoadedState;
    }

    public final FractionalRewardLoadingViewState copy(UiEvent<Throwable> error, FractionalRewardLoadedState completedLoadedState) {
        return new FractionalRewardLoadingViewState(error, completedLoadedState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionalRewardLoadingViewState)) {
            return false;
        }
        FractionalRewardLoadingViewState fractionalRewardLoadingViewState = (FractionalRewardLoadingViewState) other;
        return Intrinsics.areEqual(this.error, fractionalRewardLoadingViewState.error) && Intrinsics.areEqual(this.completedLoadedState, fractionalRewardLoadingViewState.completedLoadedState);
    }

    public int hashCode() {
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        FractionalRewardLoadedState fractionalRewardLoadedState = this.completedLoadedState;
        return iHashCode + (fractionalRewardLoadedState != null ? fractionalRewardLoadedState.hashCode() : 0);
    }

    public String toString() {
        return "FractionalRewardLoadingViewState(error=" + this.error + ", completedLoadedState=" + this.completedLoadedState + ")";
    }

    public FractionalRewardLoadingViewState(UiEvent<Throwable> uiEvent, FractionalRewardLoadedState fractionalRewardLoadedState) {
        this.error = uiEvent;
        this.completedLoadedState = fractionalRewardLoadedState;
    }

    public /* synthetic */ FractionalRewardLoadingViewState(UiEvent uiEvent, FractionalRewardLoadedState fractionalRewardLoadedState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, fractionalRewardLoadedState);
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final FractionalRewardLoadedState getCompletedLoadedState() {
        return this.completedLoadedState;
    }
}
