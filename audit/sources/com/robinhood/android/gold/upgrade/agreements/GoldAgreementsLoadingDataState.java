package com.robinhood.android.gold.upgrade.agreements;

import com.robinhood.android.gold.lib.upgrade.api.ApiGoldAgreementsProgressBar;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GoldSwitchPlanUpsellAction;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldAgreementsLoadingState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDataState;", "", "fresh", "", "firstPlan", "Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "subscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "postSuccessActionSheet", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldSwitchPlanUpsellAction;", "onlyShowGoldAgreement", "goldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "promotion", "", "isTitleCenterAlignment", "titleProgressBar", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "disableSparkleButtonStyling", "<init>", "(ZLcom/robinhood/models/subscription/api/MarginUpgradePlan;Lcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;ZLcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Ljava/lang/String;ZLcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;Z)V", "getFresh", "()Z", "getFirstPlan", "()Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "getSubscription", "()Lcom/robinhood/models/subscription/db/MarginSubscription;", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getPostSuccessActionSheet", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "getOnlyShowGoldAgreement", "getGoldSweepAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "getPromotion", "()Ljava/lang/String;", "getTitleProgressBar", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "getDisableSparkleButtonStyling", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldAgreementsLoadingDataState {
    public static final int $stable = 8;
    private final boolean disableSparkleButtonStyling;
    private final MarginUpgradePlans2 firstPlan;
    private final boolean fresh;
    private final ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements;
    private final boolean isTitleCenterAlignment;
    private final boolean onlyShowGoldAgreement;
    private final AlertAction<GoldSwitchPlanUpsellAction> postSuccessActionSheet;
    private final String promotion;
    private final MarginSubscription subscription;
    private final ApiGoldAgreementsProgressBar titleProgressBar;
    private final UnifiedAccountV2 unifiedAccount;

    public static /* synthetic */ GoldAgreementsLoadingDataState copy$default(GoldAgreementsLoadingDataState goldAgreementsLoadingDataState, boolean z, MarginUpgradePlans2 marginUpgradePlans2, MarginSubscription marginSubscription, UnifiedAccountV2 unifiedAccountV2, AlertAction alertAction, boolean z2, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, String str, boolean z3, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = goldAgreementsLoadingDataState.fresh;
        }
        if ((i & 2) != 0) {
            marginUpgradePlans2 = goldAgreementsLoadingDataState.firstPlan;
        }
        if ((i & 4) != 0) {
            marginSubscription = goldAgreementsLoadingDataState.subscription;
        }
        if ((i & 8) != 0) {
            unifiedAccountV2 = goldAgreementsLoadingDataState.unifiedAccount;
        }
        if ((i & 16) != 0) {
            alertAction = goldAgreementsLoadingDataState.postSuccessActionSheet;
        }
        if ((i & 32) != 0) {
            z2 = goldAgreementsLoadingDataState.onlyShowGoldAgreement;
        }
        if ((i & 64) != 0) {
            apiGoldSweepAgreements = goldAgreementsLoadingDataState.goldSweepAgreements;
        }
        if ((i & 128) != 0) {
            str = goldAgreementsLoadingDataState.promotion;
        }
        if ((i & 256) != 0) {
            z3 = goldAgreementsLoadingDataState.isTitleCenterAlignment;
        }
        if ((i & 512) != 0) {
            apiGoldAgreementsProgressBar = goldAgreementsLoadingDataState.titleProgressBar;
        }
        if ((i & 1024) != 0) {
            z4 = goldAgreementsLoadingDataState.disableSparkleButtonStyling;
        }
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar2 = apiGoldAgreementsProgressBar;
        boolean z5 = z4;
        String str2 = str;
        boolean z6 = z3;
        boolean z7 = z2;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements2 = apiGoldSweepAgreements;
        AlertAction alertAction2 = alertAction;
        MarginSubscription marginSubscription2 = marginSubscription;
        return goldAgreementsLoadingDataState.copy(z, marginUpgradePlans2, marginSubscription2, unifiedAccountV2, alertAction2, z7, apiGoldSweepAgreements2, str2, z6, apiGoldAgreementsProgressBar2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFresh() {
        return this.fresh;
    }

    /* renamed from: component10, reason: from getter */
    public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
        return this.titleProgressBar;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getDisableSparkleButtonStyling() {
        return this.disableSparkleButtonStyling;
    }

    /* renamed from: component2, reason: from getter */
    public final MarginUpgradePlans2 getFirstPlan() {
        return this.firstPlan;
    }

    /* renamed from: component3, reason: from getter */
    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    /* renamed from: component4, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final AlertAction<GoldSwitchPlanUpsellAction> component5() {
        return this.postSuccessActionSheet;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOnlyShowGoldAgreement() {
        return this.onlyShowGoldAgreement;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPromotion() {
        return this.promotion;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsTitleCenterAlignment() {
        return this.isTitleCenterAlignment;
    }

    public final GoldAgreementsLoadingDataState copy(boolean fresh, MarginUpgradePlans2 firstPlan, MarginSubscription subscription, UnifiedAccountV2 unifiedAccount, AlertAction<? extends GoldSwitchPlanUpsellAction> postSuccessActionSheet, boolean onlyShowGoldAgreement, ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements, String promotion, boolean isTitleCenterAlignment, ApiGoldAgreementsProgressBar titleProgressBar, boolean disableSparkleButtonStyling) {
        return new GoldAgreementsLoadingDataState(fresh, firstPlan, subscription, unifiedAccount, postSuccessActionSheet, onlyShowGoldAgreement, goldSweepAgreements, promotion, isTitleCenterAlignment, titleProgressBar, disableSparkleButtonStyling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldAgreementsLoadingDataState)) {
            return false;
        }
        GoldAgreementsLoadingDataState goldAgreementsLoadingDataState = (GoldAgreementsLoadingDataState) other;
        return this.fresh == goldAgreementsLoadingDataState.fresh && Intrinsics.areEqual(this.firstPlan, goldAgreementsLoadingDataState.firstPlan) && Intrinsics.areEqual(this.subscription, goldAgreementsLoadingDataState.subscription) && Intrinsics.areEqual(this.unifiedAccount, goldAgreementsLoadingDataState.unifiedAccount) && Intrinsics.areEqual(this.postSuccessActionSheet, goldAgreementsLoadingDataState.postSuccessActionSheet) && this.onlyShowGoldAgreement == goldAgreementsLoadingDataState.onlyShowGoldAgreement && Intrinsics.areEqual(this.goldSweepAgreements, goldAgreementsLoadingDataState.goldSweepAgreements) && Intrinsics.areEqual(this.promotion, goldAgreementsLoadingDataState.promotion) && this.isTitleCenterAlignment == goldAgreementsLoadingDataState.isTitleCenterAlignment && Intrinsics.areEqual(this.titleProgressBar, goldAgreementsLoadingDataState.titleProgressBar) && this.disableSparkleButtonStyling == goldAgreementsLoadingDataState.disableSparkleButtonStyling;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.fresh) * 31;
        MarginUpgradePlans2 marginUpgradePlans2 = this.firstPlan;
        int iHashCode2 = (iHashCode + (marginUpgradePlans2 == null ? 0 : marginUpgradePlans2.hashCode())) * 31;
        MarginSubscription marginSubscription = this.subscription;
        int iHashCode3 = (iHashCode2 + (marginSubscription == null ? 0 : marginSubscription.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode4 = (iHashCode3 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        AlertAction<GoldSwitchPlanUpsellAction> alertAction = this.postSuccessActionSheet;
        int iHashCode5 = (((iHashCode4 + (alertAction == null ? 0 : alertAction.hashCode())) * 31) + Boolean.hashCode(this.onlyShowGoldAgreement)) * 31;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements = this.goldSweepAgreements;
        int iHashCode6 = (iHashCode5 + (apiGoldSweepAgreements == null ? 0 : apiGoldSweepAgreements.hashCode())) * 31;
        String str = this.promotion;
        int iHashCode7 = (((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isTitleCenterAlignment)) * 31;
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = this.titleProgressBar;
        return ((iHashCode7 + (apiGoldAgreementsProgressBar != null ? apiGoldAgreementsProgressBar.hashCode() : 0)) * 31) + Boolean.hashCode(this.disableSparkleButtonStyling);
    }

    public String toString() {
        return "GoldAgreementsLoadingDataState(fresh=" + this.fresh + ", firstPlan=" + this.firstPlan + ", subscription=" + this.subscription + ", unifiedAccount=" + this.unifiedAccount + ", postSuccessActionSheet=" + this.postSuccessActionSheet + ", onlyShowGoldAgreement=" + this.onlyShowGoldAgreement + ", goldSweepAgreements=" + this.goldSweepAgreements + ", promotion=" + this.promotion + ", isTitleCenterAlignment=" + this.isTitleCenterAlignment + ", titleProgressBar=" + this.titleProgressBar + ", disableSparkleButtonStyling=" + this.disableSparkleButtonStyling + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoldAgreementsLoadingDataState(boolean z, MarginUpgradePlans2 marginUpgradePlans2, MarginSubscription marginSubscription, UnifiedAccountV2 unifiedAccountV2, AlertAction<? extends GoldSwitchPlanUpsellAction> alertAction, boolean z2, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, String str, boolean z3, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, boolean z4) {
        this.fresh = z;
        this.firstPlan = marginUpgradePlans2;
        this.subscription = marginSubscription;
        this.unifiedAccount = unifiedAccountV2;
        this.postSuccessActionSheet = alertAction;
        this.onlyShowGoldAgreement = z2;
        this.goldSweepAgreements = apiGoldSweepAgreements;
        this.promotion = str;
        this.isTitleCenterAlignment = z3;
        this.titleProgressBar = apiGoldAgreementsProgressBar;
        this.disableSparkleButtonStyling = z4;
    }

    public /* synthetic */ GoldAgreementsLoadingDataState(boolean z, MarginUpgradePlans2 marginUpgradePlans2, MarginSubscription marginSubscription, UnifiedAccountV2 unifiedAccountV2, AlertAction alertAction, boolean z2, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, String str, boolean z3, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : marginUpgradePlans2, (i & 4) != 0 ? null : marginSubscription, (i & 8) != 0 ? null : unifiedAccountV2, (i & 16) != 0 ? null : alertAction, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : apiGoldSweepAgreements, (i & 128) != 0 ? null : str, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : apiGoldAgreementsProgressBar, (i & 1024) != 0 ? false : z4);
    }

    public final boolean getFresh() {
        return this.fresh;
    }

    public final MarginUpgradePlans2 getFirstPlan() {
        return this.firstPlan;
    }

    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final AlertAction<GoldSwitchPlanUpsellAction> getPostSuccessActionSheet() {
        return this.postSuccessActionSheet;
    }

    public final boolean getOnlyShowGoldAgreement() {
        return this.onlyShowGoldAgreement;
    }

    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    public final String getPromotion() {
        return this.promotion;
    }

    public final boolean isTitleCenterAlignment() {
        return this.isTitleCenterAlignment;
    }

    public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
        return this.titleProgressBar;
    }

    public final boolean getDisableSparkleButtonStyling() {
        return this.disableSparkleButtonStyling;
    }
}
