package com.robinhood.android.cash.rewards.p074ui.onboarding.account;

import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingAccountCreatedViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedViewState;", "", "isLoading", "", "sortingHatUserStateUiEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;", "<init>", "(ZLcom/robinhood/udf/UiEvent;)V", "()Z", "showBrokerageAccountCreatedFragmentUiEvent", "getShowBrokerageAccountCreatedFragmentUiEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOnboardingAccountCreatedViewState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final UiEvent<SortingHatUserState> sortingHatUserStateUiEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOnboardingAccountCreatedViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final UiEvent<SortingHatUserState> component2() {
        return this.sortingHatUserStateUiEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardsOnboardingAccountCreatedViewState copy$default(RewardsOnboardingAccountCreatedViewState rewardsOnboardingAccountCreatedViewState, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rewardsOnboardingAccountCreatedViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiEvent = rewardsOnboardingAccountCreatedViewState.sortingHatUserStateUiEvent;
        }
        return rewardsOnboardingAccountCreatedViewState.copy(z, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final RewardsOnboardingAccountCreatedViewState copy(boolean isLoading, UiEvent<SortingHatUserState> sortingHatUserStateUiEvent) {
        return new RewardsOnboardingAccountCreatedViewState(isLoading, sortingHatUserStateUiEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOnboardingAccountCreatedViewState)) {
            return false;
        }
        RewardsOnboardingAccountCreatedViewState rewardsOnboardingAccountCreatedViewState = (RewardsOnboardingAccountCreatedViewState) other;
        return this.isLoading == rewardsOnboardingAccountCreatedViewState.isLoading && Intrinsics.areEqual(this.sortingHatUserStateUiEvent, rewardsOnboardingAccountCreatedViewState.sortingHatUserStateUiEvent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiEvent<SortingHatUserState> uiEvent = this.sortingHatUserStateUiEvent;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "RewardsOnboardingAccountCreatedViewState(isLoading=" + this.isLoading + ", sortingHatUserStateUiEvent=" + this.sortingHatUserStateUiEvent + ")";
    }

    public RewardsOnboardingAccountCreatedViewState(boolean z, UiEvent<SortingHatUserState> uiEvent) {
        this.isLoading = z;
        this.sortingHatUserStateUiEvent = uiEvent;
    }

    public /* synthetic */ RewardsOnboardingAccountCreatedViewState(boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : uiEvent);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Boolean> getShowBrokerageAccountCreatedFragmentUiEvent() {
        SortingHatUserState sortingHatUserStateConsume;
        UiEvent<SortingHatUserState> uiEvent = this.sortingHatUserStateUiEvent;
        if (uiEvent == null || (sortingHatUserStateConsume = uiEvent.consume()) == null) {
            return null;
        }
        return new UiEvent<>(Boolean.valueOf(sortingHatUserStateConsume.getBrokerage().isApproved()));
    }
}
