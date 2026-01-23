package com.robinhood.android.acatsin.partials.cash;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialCashAssetDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jf\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\n\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0010¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;", "", "isMarginSupported", "", "isMarginPreselected", "cashAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "isMarginInvestingEnabled", "cashType", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "isEntireBalance", "amountEntered", "Lcom/robinhood/models/util/Money;", "isMarginSupportedForCurrentRhsAccount", "<init>", "(ZZLcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;ZLcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;Ljava/lang/Boolean;Lcom/robinhood/models/util/Money;Z)V", "()Z", "getCashAsset", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "getCashType", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAmountEntered", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZZLcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;ZLcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;Ljava/lang/Boolean;Lcom/robinhood/models/util/Money;Z)Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;", "equals", "other", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInPartialCashAssetDataState {
    public static final int $stable = 8;
    private final Money amountEntered;
    private final UiAcatsAsset.CashAsset cashAsset;
    private final UiAcatsAsset.CashAsset.CashType cashType;
    private final Boolean isEntireBalance;
    private final boolean isMarginInvestingEnabled;
    private final boolean isMarginPreselected;
    private final boolean isMarginSupported;
    private final boolean isMarginSupportedForCurrentRhsAccount;

    public static /* synthetic */ AcatsInPartialCashAssetDataState copy$default(AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState, boolean z, boolean z2, UiAcatsAsset.CashAsset cashAsset, boolean z3, UiAcatsAsset.CashAsset.CashType cashType, Boolean bool, Money money, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acatsInPartialCashAssetDataState.isMarginSupported;
        }
        if ((i & 2) != 0) {
            z2 = acatsInPartialCashAssetDataState.isMarginPreselected;
        }
        if ((i & 4) != 0) {
            cashAsset = acatsInPartialCashAssetDataState.cashAsset;
        }
        if ((i & 8) != 0) {
            z3 = acatsInPartialCashAssetDataState.isMarginInvestingEnabled;
        }
        if ((i & 16) != 0) {
            cashType = acatsInPartialCashAssetDataState.cashType;
        }
        if ((i & 32) != 0) {
            bool = acatsInPartialCashAssetDataState.isEntireBalance;
        }
        if ((i & 64) != 0) {
            money = acatsInPartialCashAssetDataState.amountEntered;
        }
        if ((i & 128) != 0) {
            z4 = acatsInPartialCashAssetDataState.isMarginSupportedForCurrentRhsAccount;
        }
        Money money2 = money;
        boolean z5 = z4;
        UiAcatsAsset.CashAsset.CashType cashType2 = cashType;
        Boolean bool2 = bool;
        return acatsInPartialCashAssetDataState.copy(z, z2, cashAsset, z3, cashType2, bool2, money2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMarginSupported() {
        return this.isMarginSupported;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMarginPreselected() {
        return this.isMarginPreselected;
    }

    /* renamed from: component3, reason: from getter */
    public final UiAcatsAsset.CashAsset getCashAsset() {
        return this.cashAsset;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final UiAcatsAsset.CashAsset.CashType getCashType() {
        return this.cashType;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsEntireBalance() {
        return this.isEntireBalance;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getAmountEntered() {
        return this.amountEntered;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsMarginSupportedForCurrentRhsAccount() {
        return this.isMarginSupportedForCurrentRhsAccount;
    }

    public final AcatsInPartialCashAssetDataState copy(boolean isMarginSupported, boolean isMarginPreselected, UiAcatsAsset.CashAsset cashAsset, boolean isMarginInvestingEnabled, UiAcatsAsset.CashAsset.CashType cashType, Boolean isEntireBalance, Money amountEntered, boolean isMarginSupportedForCurrentRhsAccount) {
        return new AcatsInPartialCashAssetDataState(isMarginSupported, isMarginPreselected, cashAsset, isMarginInvestingEnabled, cashType, isEntireBalance, amountEntered, isMarginSupportedForCurrentRhsAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInPartialCashAssetDataState)) {
            return false;
        }
        AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState = (AcatsInPartialCashAssetDataState) other;
        return this.isMarginSupported == acatsInPartialCashAssetDataState.isMarginSupported && this.isMarginPreselected == acatsInPartialCashAssetDataState.isMarginPreselected && Intrinsics.areEqual(this.cashAsset, acatsInPartialCashAssetDataState.cashAsset) && this.isMarginInvestingEnabled == acatsInPartialCashAssetDataState.isMarginInvestingEnabled && this.cashType == acatsInPartialCashAssetDataState.cashType && Intrinsics.areEqual(this.isEntireBalance, acatsInPartialCashAssetDataState.isEntireBalance) && Intrinsics.areEqual(this.amountEntered, acatsInPartialCashAssetDataState.amountEntered) && this.isMarginSupportedForCurrentRhsAccount == acatsInPartialCashAssetDataState.isMarginSupportedForCurrentRhsAccount;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isMarginSupported) * 31) + Boolean.hashCode(this.isMarginPreselected)) * 31;
        UiAcatsAsset.CashAsset cashAsset = this.cashAsset;
        int iHashCode2 = (((iHashCode + (cashAsset == null ? 0 : cashAsset.hashCode())) * 31) + Boolean.hashCode(this.isMarginInvestingEnabled)) * 31;
        UiAcatsAsset.CashAsset.CashType cashType = this.cashType;
        int iHashCode3 = (iHashCode2 + (cashType == null ? 0 : cashType.hashCode())) * 31;
        Boolean bool = this.isEntireBalance;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Money money = this.amountEntered;
        return ((iHashCode4 + (money != null ? money.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMarginSupportedForCurrentRhsAccount);
    }

    public String toString() {
        return "AcatsInPartialCashAssetDataState(isMarginSupported=" + this.isMarginSupported + ", isMarginPreselected=" + this.isMarginPreselected + ", cashAsset=" + this.cashAsset + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ", cashType=" + this.cashType + ", isEntireBalance=" + this.isEntireBalance + ", amountEntered=" + this.amountEntered + ", isMarginSupportedForCurrentRhsAccount=" + this.isMarginSupportedForCurrentRhsAccount + ")";
    }

    public AcatsInPartialCashAssetDataState(boolean z, boolean z2, UiAcatsAsset.CashAsset cashAsset, boolean z3, UiAcatsAsset.CashAsset.CashType cashType, Boolean bool, Money money, boolean z4) {
        this.isMarginSupported = z;
        this.isMarginPreselected = z2;
        this.cashAsset = cashAsset;
        this.isMarginInvestingEnabled = z3;
        this.cashType = cashType;
        this.isEntireBalance = bool;
        this.amountEntered = money;
        this.isMarginSupportedForCurrentRhsAccount = z4;
    }

    public /* synthetic */ AcatsInPartialCashAssetDataState(boolean z, boolean z2, UiAcatsAsset.CashAsset cashAsset, boolean z3, UiAcatsAsset.CashAsset.CashType cashType, Boolean bool, Money money, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, cashAsset, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : cashType, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : money, (i & 128) != 0 ? false : z4);
    }

    public final boolean isMarginSupported() {
        return this.isMarginSupported;
    }

    public final boolean isMarginPreselected() {
        return this.isMarginPreselected;
    }

    public final UiAcatsAsset.CashAsset getCashAsset() {
        return this.cashAsset;
    }

    public final boolean isMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    public final UiAcatsAsset.CashAsset.CashType getCashType() {
        return this.cashType;
    }

    public final Boolean isEntireBalance() {
        return this.isEntireBalance;
    }

    public final Money getAmountEntered() {
        return this.amountEntered;
    }

    public final boolean isMarginSupportedForCurrentRhsAccount() {
        return this.isMarginSupportedForCurrentRhsAccount;
    }
}
