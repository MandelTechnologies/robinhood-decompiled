package com.robinhood.android.cash.rewards.p074ui.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/AssetSelectionContentIds;", "", "selectionActivityContent", "Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "brokerageOptionContent", "brokerageTitleContent", "<init>", "(Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;)V", "getSelectionActivityContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "getBrokerageOptionContent", "getBrokerageTitleContent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AssetSelectionContentIds {
    public static final int $stable = 0;
    private final RewardsOnboardingActivityViewState3 brokerageOptionContent;
    private final RewardsOnboardingActivityViewState3 brokerageTitleContent;
    private final RewardsOnboardingActivityViewState3 selectionActivityContent;

    public static /* synthetic */ AssetSelectionContentIds copy$default(AssetSelectionContentIds assetSelectionContentIds, RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState3, RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState32, RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState33, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsOnboardingActivityViewState3 = assetSelectionContentIds.selectionActivityContent;
        }
        if ((i & 2) != 0) {
            rewardsOnboardingActivityViewState32 = assetSelectionContentIds.brokerageOptionContent;
        }
        if ((i & 4) != 0) {
            rewardsOnboardingActivityViewState33 = assetSelectionContentIds.brokerageTitleContent;
        }
        return assetSelectionContentIds.copy(rewardsOnboardingActivityViewState3, rewardsOnboardingActivityViewState32, rewardsOnboardingActivityViewState33);
    }

    /* renamed from: component1, reason: from getter */
    public final RewardsOnboardingActivityViewState3 getSelectionActivityContent() {
        return this.selectionActivityContent;
    }

    /* renamed from: component2, reason: from getter */
    public final RewardsOnboardingActivityViewState3 getBrokerageOptionContent() {
        return this.brokerageOptionContent;
    }

    /* renamed from: component3, reason: from getter */
    public final RewardsOnboardingActivityViewState3 getBrokerageTitleContent() {
        return this.brokerageTitleContent;
    }

    public final AssetSelectionContentIds copy(RewardsOnboardingActivityViewState3 selectionActivityContent, RewardsOnboardingActivityViewState3 brokerageOptionContent, RewardsOnboardingActivityViewState3 brokerageTitleContent) {
        Intrinsics.checkNotNullParameter(selectionActivityContent, "selectionActivityContent");
        return new AssetSelectionContentIds(selectionActivityContent, brokerageOptionContent, brokerageTitleContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetSelectionContentIds)) {
            return false;
        }
        AssetSelectionContentIds assetSelectionContentIds = (AssetSelectionContentIds) other;
        return this.selectionActivityContent == assetSelectionContentIds.selectionActivityContent && this.brokerageOptionContent == assetSelectionContentIds.brokerageOptionContent && this.brokerageTitleContent == assetSelectionContentIds.brokerageTitleContent;
    }

    public int hashCode() {
        int iHashCode = this.selectionActivityContent.hashCode() * 31;
        RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState3 = this.brokerageOptionContent;
        int iHashCode2 = (iHashCode + (rewardsOnboardingActivityViewState3 == null ? 0 : rewardsOnboardingActivityViewState3.hashCode())) * 31;
        RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState32 = this.brokerageTitleContent;
        return iHashCode2 + (rewardsOnboardingActivityViewState32 != null ? rewardsOnboardingActivityViewState32.hashCode() : 0);
    }

    public String toString() {
        return "AssetSelectionContentIds(selectionActivityContent=" + this.selectionActivityContent + ", brokerageOptionContent=" + this.brokerageOptionContent + ", brokerageTitleContent=" + this.brokerageTitleContent + ")";
    }

    public AssetSelectionContentIds(RewardsOnboardingActivityViewState3 selectionActivityContent, RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState3, RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState32) {
        Intrinsics.checkNotNullParameter(selectionActivityContent, "selectionActivityContent");
        this.selectionActivityContent = selectionActivityContent;
        this.brokerageOptionContent = rewardsOnboardingActivityViewState3;
        this.brokerageTitleContent = rewardsOnboardingActivityViewState32;
    }

    public final RewardsOnboardingActivityViewState3 getSelectionActivityContent() {
        return this.selectionActivityContent;
    }

    public final RewardsOnboardingActivityViewState3 getBrokerageOptionContent() {
        return this.brokerageOptionContent;
    }

    public final RewardsOnboardingActivityViewState3 getBrokerageTitleContent() {
        return this.brokerageTitleContent;
    }
}
