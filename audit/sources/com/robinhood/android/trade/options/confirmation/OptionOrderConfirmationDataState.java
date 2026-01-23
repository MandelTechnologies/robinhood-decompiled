package com.robinhood.android.trade.options.confirmation;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderFee;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderConfirmationState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003Jy\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bHÆ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001a¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;", "", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "uiOptionOrderToReplace", "singleUiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "shouldIncludeCatFee", "", "shouldShowCatFeeNewCopy", "uiOptionOrderFee", "Lcom/robinhood/models/ui/UiOptionOrderFee;", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "account", "Lcom/robinhood/models/db/Account;", "isEligibleToShowL3EntryPoint", "isEligibleToShowMarginAccountUpsell", "<init>", "(Lcom/robinhood/models/ui/UiOptionOrder;Lcom/robinhood/models/ui/UiOptionOrder;Lcom/robinhood/models/ui/UiOptionChain;ZZLcom/robinhood/models/ui/UiOptionOrderFee;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/models/db/Account;ZZ)V", "getUiOptionOrder", "()Lcom/robinhood/models/ui/UiOptionOrder;", "getUiOptionOrderToReplace", "getSingleUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getShouldIncludeCatFee", "()Z", "getShouldShowCatFeeNewCopy", "getUiOptionOrderFee", "()Lcom/robinhood/models/ui/UiOptionOrderFee;", "getUserLocale", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getAccount", "()Lcom/robinhood/models/db/Account;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderConfirmationDataState {
    public static final int $stable = 8;
    private final Account account;
    private final boolean isEligibleToShowL3EntryPoint;
    private final boolean isEligibleToShowMarginAccountUpsell;
    private final boolean shouldIncludeCatFee;
    private final boolean shouldShowCatFeeNewCopy;
    private final UiOptionChain singleUiOptionChain;
    private final UiOptionOrder uiOptionOrder;
    private final UiOptionOrderFee uiOptionOrderFee;
    private final UiOptionOrder uiOptionOrderToReplace;
    private final CountryCode.Supported userLocale;

    public OptionOrderConfirmationDataState() {
        this(null, null, null, false, false, null, null, null, false, false, 1023, null);
    }

    public static /* synthetic */ OptionOrderConfirmationDataState copy$default(OptionOrderConfirmationDataState optionOrderConfirmationDataState, UiOptionOrder uiOptionOrder, UiOptionOrder uiOptionOrder2, UiOptionChain uiOptionChain, boolean z, boolean z2, UiOptionOrderFee uiOptionOrderFee, CountryCode.Supported supported, Account account, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            uiOptionOrder = optionOrderConfirmationDataState.uiOptionOrder;
        }
        if ((i & 2) != 0) {
            uiOptionOrder2 = optionOrderConfirmationDataState.uiOptionOrderToReplace;
        }
        if ((i & 4) != 0) {
            uiOptionChain = optionOrderConfirmationDataState.singleUiOptionChain;
        }
        if ((i & 8) != 0) {
            z = optionOrderConfirmationDataState.shouldIncludeCatFee;
        }
        if ((i & 16) != 0) {
            z2 = optionOrderConfirmationDataState.shouldShowCatFeeNewCopy;
        }
        if ((i & 32) != 0) {
            uiOptionOrderFee = optionOrderConfirmationDataState.uiOptionOrderFee;
        }
        if ((i & 64) != 0) {
            supported = optionOrderConfirmationDataState.userLocale;
        }
        if ((i & 128) != 0) {
            account = optionOrderConfirmationDataState.account;
        }
        if ((i & 256) != 0) {
            z3 = optionOrderConfirmationDataState.isEligibleToShowL3EntryPoint;
        }
        if ((i & 512) != 0) {
            z4 = optionOrderConfirmationDataState.isEligibleToShowMarginAccountUpsell;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        CountryCode.Supported supported2 = supported;
        Account account2 = account;
        boolean z7 = z2;
        UiOptionOrderFee uiOptionOrderFee2 = uiOptionOrderFee;
        return optionOrderConfirmationDataState.copy(uiOptionOrder, uiOptionOrder2, uiOptionChain, z, z7, uiOptionOrderFee2, supported2, account2, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final UiOptionOrder getUiOptionOrder() {
        return this.uiOptionOrder;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsEligibleToShowMarginAccountUpsell() {
        return this.isEligibleToShowMarginAccountUpsell;
    }

    /* renamed from: component2, reason: from getter */
    public final UiOptionOrder getUiOptionOrderToReplace() {
        return this.uiOptionOrderToReplace;
    }

    /* renamed from: component3, reason: from getter */
    public final UiOptionChain getSingleUiOptionChain() {
        return this.singleUiOptionChain;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldIncludeCatFee() {
        return this.shouldIncludeCatFee;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldShowCatFeeNewCopy() {
        return this.shouldShowCatFeeNewCopy;
    }

    /* renamed from: component6, reason: from getter */
    public final UiOptionOrderFee getUiOptionOrderFee() {
        return this.uiOptionOrderFee;
    }

    /* renamed from: component7, reason: from getter */
    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }

    /* renamed from: component8, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsEligibleToShowL3EntryPoint() {
        return this.isEligibleToShowL3EntryPoint;
    }

    public final OptionOrderConfirmationDataState copy(UiOptionOrder uiOptionOrder, UiOptionOrder uiOptionOrderToReplace, UiOptionChain singleUiOptionChain, boolean shouldIncludeCatFee, boolean shouldShowCatFeeNewCopy, UiOptionOrderFee uiOptionOrderFee, CountryCode.Supported userLocale, Account account, boolean isEligibleToShowL3EntryPoint, boolean isEligibleToShowMarginAccountUpsell) {
        return new OptionOrderConfirmationDataState(uiOptionOrder, uiOptionOrderToReplace, singleUiOptionChain, shouldIncludeCatFee, shouldShowCatFeeNewCopy, uiOptionOrderFee, userLocale, account, isEligibleToShowL3EntryPoint, isEligibleToShowMarginAccountUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderConfirmationDataState)) {
            return false;
        }
        OptionOrderConfirmationDataState optionOrderConfirmationDataState = (OptionOrderConfirmationDataState) other;
        return Intrinsics.areEqual(this.uiOptionOrder, optionOrderConfirmationDataState.uiOptionOrder) && Intrinsics.areEqual(this.uiOptionOrderToReplace, optionOrderConfirmationDataState.uiOptionOrderToReplace) && Intrinsics.areEqual(this.singleUiOptionChain, optionOrderConfirmationDataState.singleUiOptionChain) && this.shouldIncludeCatFee == optionOrderConfirmationDataState.shouldIncludeCatFee && this.shouldShowCatFeeNewCopy == optionOrderConfirmationDataState.shouldShowCatFeeNewCopy && Intrinsics.areEqual(this.uiOptionOrderFee, optionOrderConfirmationDataState.uiOptionOrderFee) && Intrinsics.areEqual(this.userLocale, optionOrderConfirmationDataState.userLocale) && Intrinsics.areEqual(this.account, optionOrderConfirmationDataState.account) && this.isEligibleToShowL3EntryPoint == optionOrderConfirmationDataState.isEligibleToShowL3EntryPoint && this.isEligibleToShowMarginAccountUpsell == optionOrderConfirmationDataState.isEligibleToShowMarginAccountUpsell;
    }

    public int hashCode() {
        UiOptionOrder uiOptionOrder = this.uiOptionOrder;
        int iHashCode = (uiOptionOrder == null ? 0 : uiOptionOrder.hashCode()) * 31;
        UiOptionOrder uiOptionOrder2 = this.uiOptionOrderToReplace;
        int iHashCode2 = (iHashCode + (uiOptionOrder2 == null ? 0 : uiOptionOrder2.hashCode())) * 31;
        UiOptionChain uiOptionChain = this.singleUiOptionChain;
        int iHashCode3 = (((((iHashCode2 + (uiOptionChain == null ? 0 : uiOptionChain.hashCode())) * 31) + Boolean.hashCode(this.shouldIncludeCatFee)) * 31) + Boolean.hashCode(this.shouldShowCatFeeNewCopy)) * 31;
        UiOptionOrderFee uiOptionOrderFee = this.uiOptionOrderFee;
        int iHashCode4 = (iHashCode3 + (uiOptionOrderFee == null ? 0 : uiOptionOrderFee.hashCode())) * 31;
        CountryCode.Supported supported = this.userLocale;
        int iHashCode5 = (iHashCode4 + (supported == null ? 0 : supported.hashCode())) * 31;
        Account account = this.account;
        return ((((iHashCode5 + (account != null ? account.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEligibleToShowL3EntryPoint)) * 31) + Boolean.hashCode(this.isEligibleToShowMarginAccountUpsell);
    }

    public String toString() {
        return "OptionOrderConfirmationDataState(uiOptionOrder=" + this.uiOptionOrder + ", uiOptionOrderToReplace=" + this.uiOptionOrderToReplace + ", singleUiOptionChain=" + this.singleUiOptionChain + ", shouldIncludeCatFee=" + this.shouldIncludeCatFee + ", shouldShowCatFeeNewCopy=" + this.shouldShowCatFeeNewCopy + ", uiOptionOrderFee=" + this.uiOptionOrderFee + ", userLocale=" + this.userLocale + ", account=" + this.account + ", isEligibleToShowL3EntryPoint=" + this.isEligibleToShowL3EntryPoint + ", isEligibleToShowMarginAccountUpsell=" + this.isEligibleToShowMarginAccountUpsell + ")";
    }

    public OptionOrderConfirmationDataState(UiOptionOrder uiOptionOrder, UiOptionOrder uiOptionOrder2, UiOptionChain uiOptionChain, boolean z, boolean z2, UiOptionOrderFee uiOptionOrderFee, CountryCode.Supported supported, Account account, boolean z3, boolean z4) {
        this.uiOptionOrder = uiOptionOrder;
        this.uiOptionOrderToReplace = uiOptionOrder2;
        this.singleUiOptionChain = uiOptionChain;
        this.shouldIncludeCatFee = z;
        this.shouldShowCatFeeNewCopy = z2;
        this.uiOptionOrderFee = uiOptionOrderFee;
        this.userLocale = supported;
        this.account = account;
        this.isEligibleToShowL3EntryPoint = z3;
        this.isEligibleToShowMarginAccountUpsell = z4;
    }

    public /* synthetic */ OptionOrderConfirmationDataState(UiOptionOrder uiOptionOrder, UiOptionOrder uiOptionOrder2, UiOptionChain uiOptionChain, boolean z, boolean z2, UiOptionOrderFee uiOptionOrderFee, CountryCode.Supported supported, Account account, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiOptionOrder, (i & 2) != 0 ? null : uiOptionOrder2, (i & 4) != 0 ? null : uiOptionChain, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : uiOptionOrderFee, (i & 64) != 0 ? null : supported, (i & 128) != 0 ? null : account, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? false : z4);
    }

    public final UiOptionOrder getUiOptionOrder() {
        return this.uiOptionOrder;
    }

    public final UiOptionOrder getUiOptionOrderToReplace() {
        return this.uiOptionOrderToReplace;
    }

    public final UiOptionChain getSingleUiOptionChain() {
        return this.singleUiOptionChain;
    }

    public final boolean getShouldIncludeCatFee() {
        return this.shouldIncludeCatFee;
    }

    public final boolean getShouldShowCatFeeNewCopy() {
        return this.shouldShowCatFeeNewCopy;
    }

    public final UiOptionOrderFee getUiOptionOrderFee() {
        return this.uiOptionOrderFee;
    }

    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isEligibleToShowL3EntryPoint() {
        return this.isEligibleToShowL3EntryPoint;
    }

    public final boolean isEligibleToShowMarginAccountUpsell() {
        return this.isEligibleToShowMarginAccountUpsell;
    }
}
