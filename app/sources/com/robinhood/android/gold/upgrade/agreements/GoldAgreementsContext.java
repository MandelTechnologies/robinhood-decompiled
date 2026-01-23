package com.robinhood.android.gold.upgrade.agreements;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldAgreementsProgressBar;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GoldSwitchPlanUpsellAction;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldAgreementsLoadingState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;", "Landroid/os/Parcelable;", "plan", "Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "promotion", "", "postSuccessActionSheet", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldSwitchPlanUpsellAction;", "goldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "isTitleCenterAlignment", "", "onlyShowGoldAgreement", "disableSparkleButtonStyling", "titleProgressBar", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "<init>", "(Lcom/robinhood/models/subscription/api/MarginUpgradePlan;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;ZZZLcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;)V", "getPlan", "()Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "getPromotion", "()Ljava/lang/String;", "getPostSuccessActionSheet", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "getGoldSweepAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "()Z", "getOnlyShowGoldAgreement", "getDisableSparkleButtonStyling", "getTitleProgressBar", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldAgreementsContext implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GoldAgreementsContext> CREATOR = new Creator();
    private final boolean disableSparkleButtonStyling;
    private final ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements;
    private final boolean isTitleCenterAlignment;
    private final boolean onlyShowGoldAgreement;
    private final MarginUpgradePlans2 plan;
    private final AlertAction<GoldSwitchPlanUpsellAction> postSuccessActionSheet;
    private final String promotion;
    private final ApiGoldAgreementsProgressBar titleProgressBar;

    /* compiled from: GoldAgreementsLoadingState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldAgreementsContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldAgreementsContext createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MarginUpgradePlans2 marginUpgradePlans2 = (MarginUpgradePlans2) parcel.readParcelable(GoldAgreementsContext.class.getClassLoader());
            String string2 = parcel.readString();
            AlertAction alertAction = (AlertAction) parcel.readParcelable(GoldAgreementsContext.class.getClassLoader());
            ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements = (ApiGoldUpgradeFlow.ApiGoldSweepAgreements) parcel.readParcelable(GoldAgreementsContext.class.getClassLoader());
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new GoldAgreementsContext(marginUpgradePlans2, string2, alertAction, apiGoldSweepAgreements, z3, z2, parcel.readInt() == 0 ? z : true, (ApiGoldAgreementsProgressBar) parcel.readParcelable(GoldAgreementsContext.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldAgreementsContext[] newArray(int i) {
            return new GoldAgreementsContext[i];
        }
    }

    public static /* synthetic */ GoldAgreementsContext copy$default(GoldAgreementsContext goldAgreementsContext, MarginUpgradePlans2 marginUpgradePlans2, String str, AlertAction alertAction, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, boolean z, boolean z2, boolean z3, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, int i, Object obj) {
        if ((i & 1) != 0) {
            marginUpgradePlans2 = goldAgreementsContext.plan;
        }
        if ((i & 2) != 0) {
            str = goldAgreementsContext.promotion;
        }
        if ((i & 4) != 0) {
            alertAction = goldAgreementsContext.postSuccessActionSheet;
        }
        if ((i & 8) != 0) {
            apiGoldSweepAgreements = goldAgreementsContext.goldSweepAgreements;
        }
        if ((i & 16) != 0) {
            z = goldAgreementsContext.isTitleCenterAlignment;
        }
        if ((i & 32) != 0) {
            z2 = goldAgreementsContext.onlyShowGoldAgreement;
        }
        if ((i & 64) != 0) {
            z3 = goldAgreementsContext.disableSparkleButtonStyling;
        }
        if ((i & 128) != 0) {
            apiGoldAgreementsProgressBar = goldAgreementsContext.titleProgressBar;
        }
        boolean z4 = z3;
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar2 = apiGoldAgreementsProgressBar;
        boolean z5 = z;
        boolean z6 = z2;
        return goldAgreementsContext.copy(marginUpgradePlans2, str, alertAction, apiGoldSweepAgreements, z5, z6, z4, apiGoldAgreementsProgressBar2);
    }

    /* renamed from: component1, reason: from getter */
    public final MarginUpgradePlans2 getPlan() {
        return this.plan;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPromotion() {
        return this.promotion;
    }

    public final AlertAction<GoldSwitchPlanUpsellAction> component3() {
        return this.postSuccessActionSheet;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTitleCenterAlignment() {
        return this.isTitleCenterAlignment;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOnlyShowGoldAgreement() {
        return this.onlyShowGoldAgreement;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDisableSparkleButtonStyling() {
        return this.disableSparkleButtonStyling;
    }

    /* renamed from: component8, reason: from getter */
    public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
        return this.titleProgressBar;
    }

    public final GoldAgreementsContext copy(MarginUpgradePlans2 plan, String promotion, AlertAction<? extends GoldSwitchPlanUpsellAction> postSuccessActionSheet, ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements, boolean isTitleCenterAlignment, boolean onlyShowGoldAgreement, boolean disableSparkleButtonStyling, ApiGoldAgreementsProgressBar titleProgressBar) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(goldSweepAgreements, "goldSweepAgreements");
        return new GoldAgreementsContext(plan, promotion, postSuccessActionSheet, goldSweepAgreements, isTitleCenterAlignment, onlyShowGoldAgreement, disableSparkleButtonStyling, titleProgressBar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldAgreementsContext)) {
            return false;
        }
        GoldAgreementsContext goldAgreementsContext = (GoldAgreementsContext) other;
        return Intrinsics.areEqual(this.plan, goldAgreementsContext.plan) && Intrinsics.areEqual(this.promotion, goldAgreementsContext.promotion) && Intrinsics.areEqual(this.postSuccessActionSheet, goldAgreementsContext.postSuccessActionSheet) && Intrinsics.areEqual(this.goldSweepAgreements, goldAgreementsContext.goldSweepAgreements) && this.isTitleCenterAlignment == goldAgreementsContext.isTitleCenterAlignment && this.onlyShowGoldAgreement == goldAgreementsContext.onlyShowGoldAgreement && this.disableSparkleButtonStyling == goldAgreementsContext.disableSparkleButtonStyling && Intrinsics.areEqual(this.titleProgressBar, goldAgreementsContext.titleProgressBar);
    }

    public int hashCode() {
        int iHashCode = this.plan.hashCode() * 31;
        String str = this.promotion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AlertAction<GoldSwitchPlanUpsellAction> alertAction = this.postSuccessActionSheet;
        int iHashCode3 = (((((((((iHashCode2 + (alertAction == null ? 0 : alertAction.hashCode())) * 31) + this.goldSweepAgreements.hashCode()) * 31) + Boolean.hashCode(this.isTitleCenterAlignment)) * 31) + Boolean.hashCode(this.onlyShowGoldAgreement)) * 31) + Boolean.hashCode(this.disableSparkleButtonStyling)) * 31;
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = this.titleProgressBar;
        return iHashCode3 + (apiGoldAgreementsProgressBar != null ? apiGoldAgreementsProgressBar.hashCode() : 0);
    }

    public String toString() {
        return "GoldAgreementsContext(plan=" + this.plan + ", promotion=" + this.promotion + ", postSuccessActionSheet=" + this.postSuccessActionSheet + ", goldSweepAgreements=" + this.goldSweepAgreements + ", isTitleCenterAlignment=" + this.isTitleCenterAlignment + ", onlyShowGoldAgreement=" + this.onlyShowGoldAgreement + ", disableSparkleButtonStyling=" + this.disableSparkleButtonStyling + ", titleProgressBar=" + this.titleProgressBar + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.plan, flags);
        dest.writeString(this.promotion);
        dest.writeParcelable(this.postSuccessActionSheet, flags);
        dest.writeParcelable(this.goldSweepAgreements, flags);
        dest.writeInt(this.isTitleCenterAlignment ? 1 : 0);
        dest.writeInt(this.onlyShowGoldAgreement ? 1 : 0);
        dest.writeInt(this.disableSparkleButtonStyling ? 1 : 0);
        dest.writeParcelable(this.titleProgressBar, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoldAgreementsContext(MarginUpgradePlans2 plan, String str, AlertAction<? extends GoldSwitchPlanUpsellAction> alertAction, ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements, boolean z, boolean z2, boolean z3, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(goldSweepAgreements, "goldSweepAgreements");
        this.plan = plan;
        this.promotion = str;
        this.postSuccessActionSheet = alertAction;
        this.goldSweepAgreements = goldSweepAgreements;
        this.isTitleCenterAlignment = z;
        this.onlyShowGoldAgreement = z2;
        this.disableSparkleButtonStyling = z3;
        this.titleProgressBar = apiGoldAgreementsProgressBar;
    }

    public /* synthetic */ GoldAgreementsContext(MarginUpgradePlans2 marginUpgradePlans2, String str, AlertAction alertAction, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, boolean z, boolean z2, boolean z3, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(marginUpgradePlans2, str, (i & 4) != 0 ? null : alertAction, apiGoldSweepAgreements, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : apiGoldAgreementsProgressBar);
    }

    public final MarginUpgradePlans2 getPlan() {
        return this.plan;
    }

    public final String getPromotion() {
        return this.promotion;
    }

    public final AlertAction<GoldSwitchPlanUpsellAction> getPostSuccessActionSheet() {
        return this.postSuccessActionSheet;
    }

    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    public final boolean isTitleCenterAlignment() {
        return this.isTitleCenterAlignment;
    }

    public final boolean getOnlyShowGoldAgreement() {
        return this.onlyShowGoldAgreement;
    }

    public final boolean getDisableSparkleButtonStyling() {
        return this.disableSparkleButtonStyling;
    }

    public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
        return this.titleProgressBar;
    }
}
