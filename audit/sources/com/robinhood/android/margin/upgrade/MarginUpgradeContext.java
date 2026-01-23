package com.robinhood.android.margin.upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.margin.p083ui.MarginSpendingProduct;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.api.ApiMarginOnboardingSplash;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeContext.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003J\t\u0010K\u001a\u00020\rHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010M\u001a\u00020\u0011HÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\t\u0010O\u001a\u00020\u0014HÆ\u0003J\t\u0010P\u001a\u00020\u0014HÆ\u0003J\t\u0010Q\u001a\u00020\u0017HÆ\u0003J\t\u0010R\u001a\u00020\u0017HÆ\u0003J\t\u0010S\u001a\u00020\u0014HÆ\u0003J\t\u0010T\u001a\u00020\u0014HÆ\u0003J\t\u0010U\u001a\u00020\u001cHÆ\u0003J«\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0006\u0010W\u001a\u00020\u0017J\u0013\u0010X\u001a\u00020\u00142\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020\u0017HÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001J\u0016\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00100R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00100R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\u001a\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00100R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u00107\u001a\u00020\u00148F¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b7\u00100R\u0017\u0010:\u001a\u00020\u00148F¢\u0006\f\u0012\u0004\b;\u00109\u001a\u0004\b:\u00100R\u0017\u0010<\u001a\u00020\u00148F¢\u0006\f\u0012\u0004\b=\u00109\u001a\u0004\b<\u00100R\u0017\u0010>\u001a\u00020?8F¢\u0006\f\u0012\u0004\b@\u00109\u001a\u0004\bA\u0010BR\u0017\u0010C\u001a\u00020\u00148F¢\u0006\f\u0012\u0004\bD\u00109\u001a\u0004\bE\u00100¨\u0006b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;", "Landroid/os/Parcelable;", "accountNumber", "", "accountType", "Lcom/robinhood/models/api/AccountType;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "splash", "Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "gainsContent", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "lossesContent", "isGoldFeatureSupportedInRegion", "", "isSlipFeatureSupportedInRegion", "marginDisclosureUrlRes", "", "marginReviewHelperRes", "showSlipDisclaimerOnSplash", "isEligible", "marginFlowType", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/AccountType;Lcom/robinhood/android/account/strings/DisplayName;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;Lcom/robinhood/staticcontent/model/OtherMarkdown;Lcom/robinhood/staticcontent/model/OtherMarkdown;ZZIIZZLcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountType", "()Lcom/robinhood/models/api/AccountType;", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSplash", "()Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getProduct", "()Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "getGainsContent", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "getLossesContent", "()Z", "getMarginDisclosureUrlRes", "()I", "getMarginReviewHelperRes", "getShowSlipDisclaimerOnSplash", "getMarginFlowType", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "isGold", "isGold$annotations", "()V", "isCash", "isCash$annotations", "isJointAccount", "isJointAccount$annotations", "toAccountTypeForTransfer", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "getToAccountTypeForTransfer$annotations", "getToAccountTypeForTransfer", "()Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "showGoldUpsell", "getShowGoldUpsell$annotations", "getShowGoldUpsell", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginUpgradeContext implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MarginUpgradeContext> CREATOR = new Creator();
    private final String accountNumber;
    private final AccountType accountType;
    private final BrokerageAccountType brokerageAccountType;
    private final DisplayName displayName;
    private final OtherMarkdown gainsContent;
    private final boolean isEligible;
    private final boolean isGoldFeatureSupportedInRegion;
    private final boolean isSlipFeatureSupportedInRegion;
    private final OtherMarkdown lossesContent;
    private final int marginDisclosureUrlRes;
    private final MarginEligibilityChecklistViewState4 marginFlowType;
    private final ApiMarginInvestingInfo marginInvestingInfo;
    private final int marginReviewHelperRes;
    private final MarginSpendingProduct product;
    private final boolean showSlipDisclaimerOnSplash;
    private final ApiMarginOnboardingSplash splash;

    /* compiled from: MarginUpgradeContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginUpgradeContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginUpgradeContext createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            AccountType accountTypeValueOf = AccountType.valueOf(parcel.readString());
            DisplayName displayName = (DisplayName) parcel.readParcelable(MarginUpgradeContext.class.getClassLoader());
            BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
            ApiMarginOnboardingSplash apiMarginOnboardingSplash = (ApiMarginOnboardingSplash) parcel.readParcelable(MarginUpgradeContext.class.getClassLoader());
            ApiMarginInvestingInfo apiMarginInvestingInfo = (ApiMarginInvestingInfo) parcel.readParcelable(MarginUpgradeContext.class.getClassLoader());
            MarginSpendingProduct marginSpendingProduct = (MarginSpendingProduct) parcel.readParcelable(MarginUpgradeContext.class.getClassLoader());
            OtherMarkdown otherMarkdown = (OtherMarkdown) parcel.readParcelable(MarginUpgradeContext.class.getClassLoader());
            OtherMarkdown otherMarkdown2 = (OtherMarkdown) parcel.readParcelable(MarginUpgradeContext.class.getClassLoader());
            boolean z4 = false;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            int i = parcel.readInt();
            boolean z6 = z;
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z6;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
            }
            return new MarginUpgradeContext(string2, accountTypeValueOf, displayName, brokerageAccountTypeValueOf, apiMarginOnboardingSplash, apiMarginInvestingInfo, marginSpendingProduct, otherMarkdown, otherMarkdown2, z5, z4, i, i2, z2, z6, (MarginEligibilityChecklistViewState4) parcel.readParcelable(MarginUpgradeContext.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginUpgradeContext[] newArray(int i) {
            return new MarginUpgradeContext[i];
        }
    }

    public static /* synthetic */ void getShowGoldUpsell$annotations() {
    }

    public static /* synthetic */ void getToAccountTypeForTransfer$annotations() {
    }

    public static /* synthetic */ void isCash$annotations() {
    }

    public static /* synthetic */ void isGold$annotations() {
    }

    public static /* synthetic */ void isJointAccount$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsGoldFeatureSupportedInRegion() {
        return this.isGoldFeatureSupportedInRegion;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsSlipFeatureSupportedInRegion() {
        return this.isSlipFeatureSupportedInRegion;
    }

    /* renamed from: component12, reason: from getter */
    public final int getMarginDisclosureUrlRes() {
        return this.marginDisclosureUrlRes;
    }

    /* renamed from: component13, reason: from getter */
    public final int getMarginReviewHelperRes() {
        return this.marginReviewHelperRes;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowSlipDisclaimerOnSplash() {
        return this.showSlipDisclaimerOnSplash;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component16, reason: from getter */
    public final MarginEligibilityChecklistViewState4 getMarginFlowType() {
        return this.marginFlowType;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component3, reason: from getter */
    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiMarginOnboardingSplash getSplash() {
        return this.splash;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final MarginSpendingProduct getProduct() {
        return this.product;
    }

    /* renamed from: component8, reason: from getter */
    public final OtherMarkdown getGainsContent() {
        return this.gainsContent;
    }

    /* renamed from: component9, reason: from getter */
    public final OtherMarkdown getLossesContent() {
        return this.lossesContent;
    }

    public final MarginUpgradeContext copy(String accountNumber, AccountType accountType, DisplayName displayName, BrokerageAccountType brokerageAccountType, ApiMarginOnboardingSplash splash, ApiMarginInvestingInfo marginInvestingInfo, MarginSpendingProduct product, OtherMarkdown gainsContent, OtherMarkdown lossesContent, boolean isGoldFeatureSupportedInRegion, boolean isSlipFeatureSupportedInRegion, int marginDisclosureUrlRes, int marginReviewHelperRes, boolean showSlipDisclaimerOnSplash, boolean isEligible, MarginEligibilityChecklistViewState4 marginFlowType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(splash, "splash");
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        Intrinsics.checkNotNullParameter(gainsContent, "gainsContent");
        Intrinsics.checkNotNullParameter(lossesContent, "lossesContent");
        Intrinsics.checkNotNullParameter(marginFlowType, "marginFlowType");
        return new MarginUpgradeContext(accountNumber, accountType, displayName, brokerageAccountType, splash, marginInvestingInfo, product, gainsContent, lossesContent, isGoldFeatureSupportedInRegion, isSlipFeatureSupportedInRegion, marginDisclosureUrlRes, marginReviewHelperRes, showSlipDisclaimerOnSplash, isEligible, marginFlowType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeContext)) {
            return false;
        }
        MarginUpgradeContext marginUpgradeContext = (MarginUpgradeContext) other;
        return Intrinsics.areEqual(this.accountNumber, marginUpgradeContext.accountNumber) && this.accountType == marginUpgradeContext.accountType && Intrinsics.areEqual(this.displayName, marginUpgradeContext.displayName) && this.brokerageAccountType == marginUpgradeContext.brokerageAccountType && Intrinsics.areEqual(this.splash, marginUpgradeContext.splash) && Intrinsics.areEqual(this.marginInvestingInfo, marginUpgradeContext.marginInvestingInfo) && this.product == marginUpgradeContext.product && Intrinsics.areEqual(this.gainsContent, marginUpgradeContext.gainsContent) && Intrinsics.areEqual(this.lossesContent, marginUpgradeContext.lossesContent) && this.isGoldFeatureSupportedInRegion == marginUpgradeContext.isGoldFeatureSupportedInRegion && this.isSlipFeatureSupportedInRegion == marginUpgradeContext.isSlipFeatureSupportedInRegion && this.marginDisclosureUrlRes == marginUpgradeContext.marginDisclosureUrlRes && this.marginReviewHelperRes == marginUpgradeContext.marginReviewHelperRes && this.showSlipDisclaimerOnSplash == marginUpgradeContext.showSlipDisclaimerOnSplash && this.isEligible == marginUpgradeContext.isEligible && Intrinsics.areEqual(this.marginFlowType, marginUpgradeContext.marginFlowType);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.accountNumber.hashCode() * 31) + this.accountType.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.splash.hashCode()) * 31) + this.marginInvestingInfo.hashCode()) * 31;
        MarginSpendingProduct marginSpendingProduct = this.product;
        return ((((((((((((((((((iHashCode + (marginSpendingProduct == null ? 0 : marginSpendingProduct.hashCode())) * 31) + this.gainsContent.hashCode()) * 31) + this.lossesContent.hashCode()) * 31) + Boolean.hashCode(this.isGoldFeatureSupportedInRegion)) * 31) + Boolean.hashCode(this.isSlipFeatureSupportedInRegion)) * 31) + Integer.hashCode(this.marginDisclosureUrlRes)) * 31) + Integer.hashCode(this.marginReviewHelperRes)) * 31) + Boolean.hashCode(this.showSlipDisclaimerOnSplash)) * 31) + Boolean.hashCode(this.isEligible)) * 31) + this.marginFlowType.hashCode();
    }

    public String toString() {
        return "MarginUpgradeContext(accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ", displayName=" + this.displayName + ", brokerageAccountType=" + this.brokerageAccountType + ", splash=" + this.splash + ", marginInvestingInfo=" + this.marginInvestingInfo + ", product=" + this.product + ", gainsContent=" + this.gainsContent + ", lossesContent=" + this.lossesContent + ", isGoldFeatureSupportedInRegion=" + this.isGoldFeatureSupportedInRegion + ", isSlipFeatureSupportedInRegion=" + this.isSlipFeatureSupportedInRegion + ", marginDisclosureUrlRes=" + this.marginDisclosureUrlRes + ", marginReviewHelperRes=" + this.marginReviewHelperRes + ", showSlipDisclaimerOnSplash=" + this.showSlipDisclaimerOnSplash + ", isEligible=" + this.isEligible + ", marginFlowType=" + this.marginFlowType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.accountType.name());
        dest.writeParcelable(this.displayName, flags);
        dest.writeString(this.brokerageAccountType.name());
        dest.writeParcelable(this.splash, flags);
        dest.writeParcelable(this.marginInvestingInfo, flags);
        dest.writeParcelable(this.product, flags);
        dest.writeParcelable(this.gainsContent, flags);
        dest.writeParcelable(this.lossesContent, flags);
        dest.writeInt(this.isGoldFeatureSupportedInRegion ? 1 : 0);
        dest.writeInt(this.isSlipFeatureSupportedInRegion ? 1 : 0);
        dest.writeInt(this.marginDisclosureUrlRes);
        dest.writeInt(this.marginReviewHelperRes);
        dest.writeInt(this.showSlipDisclaimerOnSplash ? 1 : 0);
        dest.writeInt(this.isEligible ? 1 : 0);
        dest.writeParcelable(this.marginFlowType, flags);
    }

    public MarginUpgradeContext(String accountNumber, AccountType accountType, DisplayName displayName, BrokerageAccountType brokerageAccountType, ApiMarginOnboardingSplash splash, ApiMarginInvestingInfo marginInvestingInfo, MarginSpendingProduct marginSpendingProduct, OtherMarkdown gainsContent, OtherMarkdown lossesContent, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, MarginEligibilityChecklistViewState4 marginFlowType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(splash, "splash");
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        Intrinsics.checkNotNullParameter(gainsContent, "gainsContent");
        Intrinsics.checkNotNullParameter(lossesContent, "lossesContent");
        Intrinsics.checkNotNullParameter(marginFlowType, "marginFlowType");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.displayName = displayName;
        this.brokerageAccountType = brokerageAccountType;
        this.splash = splash;
        this.marginInvestingInfo = marginInvestingInfo;
        this.product = marginSpendingProduct;
        this.gainsContent = gainsContent;
        this.lossesContent = lossesContent;
        this.isGoldFeatureSupportedInRegion = z;
        this.isSlipFeatureSupportedInRegion = z2;
        this.marginDisclosureUrlRes = i;
        this.marginReviewHelperRes = i2;
        this.showSlipDisclaimerOnSplash = z3;
        this.isEligible = z4;
        this.marginFlowType = marginFlowType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final AccountType getAccountType() {
        return this.accountType;
    }

    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ApiMarginOnboardingSplash getSplash() {
        return this.splash;
    }

    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    public final MarginSpendingProduct getProduct() {
        return this.product;
    }

    public final OtherMarkdown getGainsContent() {
        return this.gainsContent;
    }

    public final OtherMarkdown getLossesContent() {
        return this.lossesContent;
    }

    public final boolean isGoldFeatureSupportedInRegion() {
        return this.isGoldFeatureSupportedInRegion;
    }

    public final boolean isSlipFeatureSupportedInRegion() {
        return this.isSlipFeatureSupportedInRegion;
    }

    public final int getMarginDisclosureUrlRes() {
        return this.marginDisclosureUrlRes;
    }

    public final int getMarginReviewHelperRes() {
        return this.marginReviewHelperRes;
    }

    public final boolean getShowSlipDisclaimerOnSplash() {
        return this.showSlipDisclaimerOnSplash;
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public /* synthetic */ MarginUpgradeContext(String str, AccountType accountType, DisplayName displayName, BrokerageAccountType brokerageAccountType, ApiMarginOnboardingSplash apiMarginOnboardingSplash, ApiMarginInvestingInfo apiMarginInvestingInfo, MarginSpendingProduct marginSpendingProduct, OtherMarkdown otherMarkdown, OtherMarkdown otherMarkdown2, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, accountType, displayName, brokerageAccountType, apiMarginOnboardingSplash, apiMarginInvestingInfo, marginSpendingProduct, otherMarkdown, otherMarkdown2, z, z2, i, i2, z3, z4, (i3 & 32768) != 0 ? MarginEligibilityChecklistViewState4.Default.INSTANCE : marginEligibilityChecklistViewState4);
    }

    public final MarginEligibilityChecklistViewState4 getMarginFlowType() {
        return this.marginFlowType;
    }

    public final boolean isGold() {
        return this.splash.isGold();
    }

    public final boolean isCash() {
        return this.accountType == AccountType.CASH;
    }

    public final boolean isJointAccount() {
        return this.brokerageAccountType == BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
    }

    public final TransferFundsDeepLinkAccountType getToAccountTypeForTransfer() {
        if (isJointAccount()) {
            return TransferFundsDeepLinkAccountType.JOINT_TENANCY_WITH_ROS;
        }
        return TransferFundsDeepLinkAccountType.BROKERAGE;
    }

    public final boolean getShowGoldUpsell() {
        return (isGold() || !this.isGoldFeatureSupportedInRegion || isJointAccount()) ? false : true;
    }
}
