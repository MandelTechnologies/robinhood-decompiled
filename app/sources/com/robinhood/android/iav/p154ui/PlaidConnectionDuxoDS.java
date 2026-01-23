package com.robinhood.android.iav.p154ui;

import com.robinhood.models.api.IavAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidConnectionDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0016¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;", "", "hasUserExitedPlaidYet", "", "showPopup", "disclosureResponse", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "manualLinkingRequested", "serviceFeeParamRetreivalFinished", "popupWasShown", "iavAccountAccessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "hasShownGoldNativeFundingUpsell", "isGoldBackupBillingMember", "isOnboardingGoldUpsellAvailable", "<init>", "(ZZLcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;ZZZLjava/lang/String;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;ZZZ)V", "getHasUserExitedPlaidYet", "()Z", "getShowPopup", "getDisclosureResponse", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "getManualLinkingRequested", "getServiceFeeParamRetreivalFinished", "getPopupWasShown", "getIavAccountAccessToken", "()Ljava/lang/String;", "getIavAccount", "()Lcom/robinhood/models/api/IavAccount;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "getHasShownGoldNativeFundingUpsell", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PlaidConnectionDuxoDS {
    public static final int $stable = 8;
    private final ApiServiceFeeParams disclosureResponse;
    private final boolean hasShownGoldNativeFundingUpsell;
    private final boolean hasUserExitedPlaidYet;
    private final IavAccount iavAccount;
    private final String iavAccountAccessToken;
    private final boolean isGoldBackupBillingMember;
    private final boolean isOnboardingGoldUpsellAvailable;
    private final boolean manualLinkingRequested;
    private final PlaidIavMetadata plaidIavMetadata;
    private final boolean popupWasShown;
    private final boolean serviceFeeParamRetreivalFinished;
    private final boolean showPopup;

    public static /* synthetic */ PlaidConnectionDuxoDS copy$default(PlaidConnectionDuxoDS plaidConnectionDuxoDS, boolean z, boolean z2, ApiServiceFeeParams apiServiceFeeParams, boolean z3, boolean z4, boolean z5, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = plaidConnectionDuxoDS.hasUserExitedPlaidYet;
        }
        if ((i & 2) != 0) {
            z2 = plaidConnectionDuxoDS.showPopup;
        }
        if ((i & 4) != 0) {
            apiServiceFeeParams = plaidConnectionDuxoDS.disclosureResponse;
        }
        if ((i & 8) != 0) {
            z3 = plaidConnectionDuxoDS.manualLinkingRequested;
        }
        if ((i & 16) != 0) {
            z4 = plaidConnectionDuxoDS.serviceFeeParamRetreivalFinished;
        }
        if ((i & 32) != 0) {
            z5 = plaidConnectionDuxoDS.popupWasShown;
        }
        if ((i & 64) != 0) {
            str = plaidConnectionDuxoDS.iavAccountAccessToken;
        }
        if ((i & 128) != 0) {
            iavAccount = plaidConnectionDuxoDS.iavAccount;
        }
        if ((i & 256) != 0) {
            plaidIavMetadata = plaidConnectionDuxoDS.plaidIavMetadata;
        }
        if ((i & 512) != 0) {
            z6 = plaidConnectionDuxoDS.hasShownGoldNativeFundingUpsell;
        }
        if ((i & 1024) != 0) {
            z7 = plaidConnectionDuxoDS.isGoldBackupBillingMember;
        }
        if ((i & 2048) != 0) {
            z8 = plaidConnectionDuxoDS.isOnboardingGoldUpsellAvailable;
        }
        boolean z9 = z7;
        boolean z10 = z8;
        PlaidIavMetadata plaidIavMetadata2 = plaidIavMetadata;
        boolean z11 = z6;
        String str2 = str;
        IavAccount iavAccount2 = iavAccount;
        boolean z12 = z4;
        boolean z13 = z5;
        return plaidConnectionDuxoDS.copy(z, z2, apiServiceFeeParams, z3, z12, z13, str2, iavAccount2, plaidIavMetadata2, z11, z9, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasUserExitedPlaidYet() {
        return this.hasUserExitedPlaidYet;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasShownGoldNativeFundingUpsell() {
        return this.hasShownGoldNativeFundingUpsell;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsGoldBackupBillingMember() {
        return this.isGoldBackupBillingMember;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsOnboardingGoldUpsellAvailable() {
        return this.isOnboardingGoldUpsellAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowPopup() {
        return this.showPopup;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiServiceFeeParams getDisclosureResponse() {
        return this.disclosureResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getManualLinkingRequested() {
        return this.manualLinkingRequested;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getServiceFeeParamRetreivalFinished() {
        return this.serviceFeeParamRetreivalFinished;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPopupWasShown() {
        return this.popupWasShown;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIavAccountAccessToken() {
        return this.iavAccountAccessToken;
    }

    /* renamed from: component8, reason: from getter */
    public final IavAccount getIavAccount() {
        return this.iavAccount;
    }

    /* renamed from: component9, reason: from getter */
    public final PlaidIavMetadata getPlaidIavMetadata() {
        return this.plaidIavMetadata;
    }

    public final PlaidConnectionDuxoDS copy(boolean hasUserExitedPlaidYet, boolean showPopup, ApiServiceFeeParams disclosureResponse, boolean manualLinkingRequested, boolean serviceFeeParamRetreivalFinished, boolean popupWasShown, String iavAccountAccessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean hasShownGoldNativeFundingUpsell, boolean isGoldBackupBillingMember, boolean isOnboardingGoldUpsellAvailable) {
        return new PlaidConnectionDuxoDS(hasUserExitedPlaidYet, showPopup, disclosureResponse, manualLinkingRequested, serviceFeeParamRetreivalFinished, popupWasShown, iavAccountAccessToken, iavAccount, plaidIavMetadata, hasShownGoldNativeFundingUpsell, isGoldBackupBillingMember, isOnboardingGoldUpsellAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaidConnectionDuxoDS)) {
            return false;
        }
        PlaidConnectionDuxoDS plaidConnectionDuxoDS = (PlaidConnectionDuxoDS) other;
        return this.hasUserExitedPlaidYet == plaidConnectionDuxoDS.hasUserExitedPlaidYet && this.showPopup == plaidConnectionDuxoDS.showPopup && Intrinsics.areEqual(this.disclosureResponse, plaidConnectionDuxoDS.disclosureResponse) && this.manualLinkingRequested == plaidConnectionDuxoDS.manualLinkingRequested && this.serviceFeeParamRetreivalFinished == plaidConnectionDuxoDS.serviceFeeParamRetreivalFinished && this.popupWasShown == plaidConnectionDuxoDS.popupWasShown && Intrinsics.areEqual(this.iavAccountAccessToken, plaidConnectionDuxoDS.iavAccountAccessToken) && Intrinsics.areEqual(this.iavAccount, plaidConnectionDuxoDS.iavAccount) && Intrinsics.areEqual(this.plaidIavMetadata, plaidConnectionDuxoDS.plaidIavMetadata) && this.hasShownGoldNativeFundingUpsell == plaidConnectionDuxoDS.hasShownGoldNativeFundingUpsell && this.isGoldBackupBillingMember == plaidConnectionDuxoDS.isGoldBackupBillingMember && this.isOnboardingGoldUpsellAvailable == plaidConnectionDuxoDS.isOnboardingGoldUpsellAvailable;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.hasUserExitedPlaidYet) * 31) + Boolean.hashCode(this.showPopup)) * 31;
        ApiServiceFeeParams apiServiceFeeParams = this.disclosureResponse;
        int iHashCode2 = (((((((iHashCode + (apiServiceFeeParams == null ? 0 : apiServiceFeeParams.hashCode())) * 31) + Boolean.hashCode(this.manualLinkingRequested)) * 31) + Boolean.hashCode(this.serviceFeeParamRetreivalFinished)) * 31) + Boolean.hashCode(this.popupWasShown)) * 31;
        String str = this.iavAccountAccessToken;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        IavAccount iavAccount = this.iavAccount;
        int iHashCode4 = (iHashCode3 + (iavAccount == null ? 0 : iavAccount.hashCode())) * 31;
        PlaidIavMetadata plaidIavMetadata = this.plaidIavMetadata;
        return ((((((iHashCode4 + (plaidIavMetadata != null ? plaidIavMetadata.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasShownGoldNativeFundingUpsell)) * 31) + Boolean.hashCode(this.isGoldBackupBillingMember)) * 31) + Boolean.hashCode(this.isOnboardingGoldUpsellAvailable);
    }

    public String toString() {
        return "PlaidConnectionDuxoDS(hasUserExitedPlaidYet=" + this.hasUserExitedPlaidYet + ", showPopup=" + this.showPopup + ", disclosureResponse=" + this.disclosureResponse + ", manualLinkingRequested=" + this.manualLinkingRequested + ", serviceFeeParamRetreivalFinished=" + this.serviceFeeParamRetreivalFinished + ", popupWasShown=" + this.popupWasShown + ", iavAccountAccessToken=" + this.iavAccountAccessToken + ", iavAccount=" + this.iavAccount + ", plaidIavMetadata=" + this.plaidIavMetadata + ", hasShownGoldNativeFundingUpsell=" + this.hasShownGoldNativeFundingUpsell + ", isGoldBackupBillingMember=" + this.isGoldBackupBillingMember + ", isOnboardingGoldUpsellAvailable=" + this.isOnboardingGoldUpsellAvailable + ")";
    }

    public PlaidConnectionDuxoDS(boolean z, boolean z2, ApiServiceFeeParams apiServiceFeeParams, boolean z3, boolean z4, boolean z5, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean z6, boolean z7, boolean z8) {
        this.hasUserExitedPlaidYet = z;
        this.showPopup = z2;
        this.disclosureResponse = apiServiceFeeParams;
        this.manualLinkingRequested = z3;
        this.serviceFeeParamRetreivalFinished = z4;
        this.popupWasShown = z5;
        this.iavAccountAccessToken = str;
        this.iavAccount = iavAccount;
        this.plaidIavMetadata = plaidIavMetadata;
        this.hasShownGoldNativeFundingUpsell = z6;
        this.isGoldBackupBillingMember = z7;
        this.isOnboardingGoldUpsellAvailable = z8;
    }

    public /* synthetic */ PlaidConnectionDuxoDS(boolean z, boolean z2, ApiServiceFeeParams apiServiceFeeParams, boolean z3, boolean z4, boolean z5, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, apiServiceFeeParams, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : iavAccount, (i & 256) != 0 ? null : plaidIavMetadata, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? false : z7, (i & 2048) != 0 ? false : z8);
    }

    public final boolean getHasUserExitedPlaidYet() {
        return this.hasUserExitedPlaidYet;
    }

    public final boolean getShowPopup() {
        return this.showPopup;
    }

    public final ApiServiceFeeParams getDisclosureResponse() {
        return this.disclosureResponse;
    }

    public final boolean getManualLinkingRequested() {
        return this.manualLinkingRequested;
    }

    public final boolean getServiceFeeParamRetreivalFinished() {
        return this.serviceFeeParamRetreivalFinished;
    }

    public final boolean getPopupWasShown() {
        return this.popupWasShown;
    }

    public final String getIavAccountAccessToken() {
        return this.iavAccountAccessToken;
    }

    public final IavAccount getIavAccount() {
        return this.iavAccount;
    }

    public final PlaidIavMetadata getPlaidIavMetadata() {
        return this.plaidIavMetadata;
    }

    public final boolean getHasShownGoldNativeFundingUpsell() {
        return this.hasShownGoldNativeFundingUpsell;
    }

    public final boolean isGoldBackupBillingMember() {
        return this.isGoldBackupBillingMember;
    }

    public final boolean isOnboardingGoldUpsellAvailable() {
        return this.isOnboardingGoldUpsellAvailable;
    }
}
