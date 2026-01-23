package com.robinhood.android.iav.p154ui;

import com.robinhood.models.api.IavAccount;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidConnectionDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jr\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0006HÖ\u0001J\t\u00101\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoVS;", "", "showPopup", "", "shouldFinishActivity", "disclosureId", "", "disclosureFee", "Ljava/math/BigDecimal;", "popupWasShown", "iavAccountAccessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "hasShownGoldNativeFundingUpsell", "<init>", "(ZZLjava/lang/Integer;Ljava/math/BigDecimal;ZLjava/lang/String;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;Z)V", "getShowPopup", "()Z", "getShouldFinishActivity", "getDisclosureId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisclosureFee", "()Ljava/math/BigDecimal;", "getPopupWasShown", "getIavAccountAccessToken", "()Ljava/lang/String;", "getIavAccount", "()Lcom/robinhood/models/api/IavAccount;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "getHasShownGoldNativeFundingUpsell", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/lang/Integer;Ljava/math/BigDecimal;ZLjava/lang/String;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;Z)Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoVS;", "equals", "other", "hashCode", "toString", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PlaidConnectionDuxoVS {
    public static final int $stable = 8;
    private final BigDecimal disclosureFee;
    private final Integer disclosureId;
    private final boolean hasShownGoldNativeFundingUpsell;
    private final IavAccount iavAccount;
    private final String iavAccountAccessToken;
    private final PlaidIavMetadata plaidIavMetadata;
    private final boolean popupWasShown;
    private final boolean shouldFinishActivity;
    private final boolean showPopup;

    public static /* synthetic */ PlaidConnectionDuxoVS copy$default(PlaidConnectionDuxoVS plaidConnectionDuxoVS, boolean z, boolean z2, Integer num, BigDecimal bigDecimal, boolean z3, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = plaidConnectionDuxoVS.showPopup;
        }
        if ((i & 2) != 0) {
            z2 = plaidConnectionDuxoVS.shouldFinishActivity;
        }
        if ((i & 4) != 0) {
            num = plaidConnectionDuxoVS.disclosureId;
        }
        if ((i & 8) != 0) {
            bigDecimal = plaidConnectionDuxoVS.disclosureFee;
        }
        if ((i & 16) != 0) {
            z3 = plaidConnectionDuxoVS.popupWasShown;
        }
        if ((i & 32) != 0) {
            str = plaidConnectionDuxoVS.iavAccountAccessToken;
        }
        if ((i & 64) != 0) {
            iavAccount = plaidConnectionDuxoVS.iavAccount;
        }
        if ((i & 128) != 0) {
            plaidIavMetadata = plaidConnectionDuxoVS.plaidIavMetadata;
        }
        if ((i & 256) != 0) {
            z4 = plaidConnectionDuxoVS.hasShownGoldNativeFundingUpsell;
        }
        PlaidIavMetadata plaidIavMetadata2 = plaidIavMetadata;
        boolean z5 = z4;
        String str2 = str;
        IavAccount iavAccount2 = iavAccount;
        boolean z6 = z3;
        Integer num2 = num;
        return plaidConnectionDuxoVS.copy(z, z2, num2, bigDecimal, z6, str2, iavAccount2, plaidIavMetadata2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowPopup() {
        return this.showPopup;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldFinishActivity() {
        return this.shouldFinishActivity;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDisclosureId() {
        return this.disclosureId;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getDisclosureFee() {
        return this.disclosureFee;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPopupWasShown() {
        return this.popupWasShown;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIavAccountAccessToken() {
        return this.iavAccountAccessToken;
    }

    /* renamed from: component7, reason: from getter */
    public final IavAccount getIavAccount() {
        return this.iavAccount;
    }

    /* renamed from: component8, reason: from getter */
    public final PlaidIavMetadata getPlaidIavMetadata() {
        return this.plaidIavMetadata;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasShownGoldNativeFundingUpsell() {
        return this.hasShownGoldNativeFundingUpsell;
    }

    public final PlaidConnectionDuxoVS copy(boolean showPopup, boolean shouldFinishActivity, Integer disclosureId, BigDecimal disclosureFee, boolean popupWasShown, String iavAccountAccessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean hasShownGoldNativeFundingUpsell) {
        return new PlaidConnectionDuxoVS(showPopup, shouldFinishActivity, disclosureId, disclosureFee, popupWasShown, iavAccountAccessToken, iavAccount, plaidIavMetadata, hasShownGoldNativeFundingUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaidConnectionDuxoVS)) {
            return false;
        }
        PlaidConnectionDuxoVS plaidConnectionDuxoVS = (PlaidConnectionDuxoVS) other;
        return this.showPopup == plaidConnectionDuxoVS.showPopup && this.shouldFinishActivity == plaidConnectionDuxoVS.shouldFinishActivity && Intrinsics.areEqual(this.disclosureId, plaidConnectionDuxoVS.disclosureId) && Intrinsics.areEqual(this.disclosureFee, plaidConnectionDuxoVS.disclosureFee) && this.popupWasShown == plaidConnectionDuxoVS.popupWasShown && Intrinsics.areEqual(this.iavAccountAccessToken, plaidConnectionDuxoVS.iavAccountAccessToken) && Intrinsics.areEqual(this.iavAccount, plaidConnectionDuxoVS.iavAccount) && Intrinsics.areEqual(this.plaidIavMetadata, plaidConnectionDuxoVS.plaidIavMetadata) && this.hasShownGoldNativeFundingUpsell == plaidConnectionDuxoVS.hasShownGoldNativeFundingUpsell;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.showPopup) * 31) + Boolean.hashCode(this.shouldFinishActivity)) * 31;
        Integer num = this.disclosureId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal = this.disclosureFee;
        int iHashCode3 = (((iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.popupWasShown)) * 31;
        String str = this.iavAccountAccessToken;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        IavAccount iavAccount = this.iavAccount;
        int iHashCode5 = (iHashCode4 + (iavAccount == null ? 0 : iavAccount.hashCode())) * 31;
        PlaidIavMetadata plaidIavMetadata = this.plaidIavMetadata;
        return ((iHashCode5 + (plaidIavMetadata != null ? plaidIavMetadata.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasShownGoldNativeFundingUpsell);
    }

    public String toString() {
        return "PlaidConnectionDuxoVS(showPopup=" + this.showPopup + ", shouldFinishActivity=" + this.shouldFinishActivity + ", disclosureId=" + this.disclosureId + ", disclosureFee=" + this.disclosureFee + ", popupWasShown=" + this.popupWasShown + ", iavAccountAccessToken=" + this.iavAccountAccessToken + ", iavAccount=" + this.iavAccount + ", plaidIavMetadata=" + this.plaidIavMetadata + ", hasShownGoldNativeFundingUpsell=" + this.hasShownGoldNativeFundingUpsell + ")";
    }

    public PlaidConnectionDuxoVS(boolean z, boolean z2, Integer num, BigDecimal bigDecimal, boolean z3, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean z4) {
        this.showPopup = z;
        this.shouldFinishActivity = z2;
        this.disclosureId = num;
        this.disclosureFee = bigDecimal;
        this.popupWasShown = z3;
        this.iavAccountAccessToken = str;
        this.iavAccount = iavAccount;
        this.plaidIavMetadata = plaidIavMetadata;
        this.hasShownGoldNativeFundingUpsell = z4;
    }

    public /* synthetic */ PlaidConnectionDuxoVS(boolean z, boolean z2, Integer num, BigDecimal bigDecimal, boolean z3, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, num, bigDecimal, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : iavAccount, (i & 128) != 0 ? null : plaidIavMetadata, (i & 256) != 0 ? false : z4);
    }

    public final boolean getShowPopup() {
        return this.showPopup;
    }

    public final boolean getShouldFinishActivity() {
        return this.shouldFinishActivity;
    }

    public final Integer getDisclosureId() {
        return this.disclosureId;
    }

    public final BigDecimal getDisclosureFee() {
        return this.disclosureFee;
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
}
