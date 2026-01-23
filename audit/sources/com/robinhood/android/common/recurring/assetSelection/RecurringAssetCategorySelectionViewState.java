package com.robinhood.android.common.recurring.assetSelection;

import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringAssetCategorySelectionViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u008d\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionViewState;", "", "sweepsStatus", "Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "hasGoldSubscription", "", "retirementMatchRate", "Ljava/math/BigDecimal;", "retirementRemainingToLimit", "Lcom/robinhood/models/util/Money;", "hasRothIraAccount", "hasTraditionalIraAccount", "brokerageCashOptionEnabled", "retirementCashOptionEnabled", "investmentOptionEnabled", "brokerageAccountNumber", "", "rothIraAccountNumber", "traditionalIraAccountNumber", "<init>", "(Lcom/robinhood/librobinhood/data/store/SweepsStatus;ZLjava/math/BigDecimal;Lcom/robinhood/models/util/Money;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSweepsStatus", "()Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "getHasGoldSubscription", "()Z", "getRetirementMatchRate", "()Ljava/math/BigDecimal;", "getRetirementRemainingToLimit", "()Lcom/robinhood/models/util/Money;", "getHasRothIraAccount", "getHasTraditionalIraAccount", "getBrokerageCashOptionEnabled", "getRetirementCashOptionEnabled", "getInvestmentOptionEnabled", "getBrokerageAccountNumber", "()Ljava/lang/String;", "getRothIraAccountNumber", "getTraditionalIraAccountNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringAssetCategorySelectionViewState {
    public static final int $stable = 8;
    private final String brokerageAccountNumber;
    private final boolean brokerageCashOptionEnabled;
    private final boolean hasGoldSubscription;
    private final boolean hasRothIraAccount;
    private final boolean hasTraditionalIraAccount;
    private final boolean investmentOptionEnabled;
    private final boolean retirementCashOptionEnabled;
    private final BigDecimal retirementMatchRate;
    private final Money retirementRemainingToLimit;
    private final String rothIraAccountNumber;
    private final SweepsStatus sweepsStatus;
    private final String traditionalIraAccountNumber;

    public static /* synthetic */ RecurringAssetCategorySelectionViewState copy$default(RecurringAssetCategorySelectionViewState recurringAssetCategorySelectionViewState, SweepsStatus sweepsStatusStore2, boolean z, BigDecimal bigDecimal, Money money, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            sweepsStatusStore2 = recurringAssetCategorySelectionViewState.sweepsStatus;
        }
        if ((i & 2) != 0) {
            z = recurringAssetCategorySelectionViewState.hasGoldSubscription;
        }
        if ((i & 4) != 0) {
            bigDecimal = recurringAssetCategorySelectionViewState.retirementMatchRate;
        }
        if ((i & 8) != 0) {
            money = recurringAssetCategorySelectionViewState.retirementRemainingToLimit;
        }
        if ((i & 16) != 0) {
            z2 = recurringAssetCategorySelectionViewState.hasRothIraAccount;
        }
        if ((i & 32) != 0) {
            z3 = recurringAssetCategorySelectionViewState.hasTraditionalIraAccount;
        }
        if ((i & 64) != 0) {
            z4 = recurringAssetCategorySelectionViewState.brokerageCashOptionEnabled;
        }
        if ((i & 128) != 0) {
            z5 = recurringAssetCategorySelectionViewState.retirementCashOptionEnabled;
        }
        if ((i & 256) != 0) {
            z6 = recurringAssetCategorySelectionViewState.investmentOptionEnabled;
        }
        if ((i & 512) != 0) {
            str = recurringAssetCategorySelectionViewState.brokerageAccountNumber;
        }
        if ((i & 1024) != 0) {
            str2 = recurringAssetCategorySelectionViewState.rothIraAccountNumber;
        }
        if ((i & 2048) != 0) {
            str3 = recurringAssetCategorySelectionViewState.traditionalIraAccountNumber;
        }
        String str4 = str2;
        String str5 = str3;
        boolean z7 = z6;
        String str6 = str;
        boolean z8 = z4;
        boolean z9 = z5;
        boolean z10 = z2;
        boolean z11 = z3;
        return recurringAssetCategorySelectionViewState.copy(sweepsStatusStore2, z, bigDecimal, money, z10, z11, z8, z9, z7, str6, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final SweepsStatus getSweepsStatus() {
        return this.sweepsStatus;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBrokerageAccountNumber() {
        return this.brokerageAccountNumber;
    }

    /* renamed from: component11, reason: from getter */
    public final String getRothIraAccountNumber() {
        return this.rothIraAccountNumber;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTraditionalIraAccountNumber() {
        return this.traditionalIraAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasGoldSubscription() {
        return this.hasGoldSubscription;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getRetirementRemainingToLimit() {
        return this.retirementRemainingToLimit;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasRothIraAccount() {
        return this.hasRothIraAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasTraditionalIraAccount() {
        return this.hasTraditionalIraAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getBrokerageCashOptionEnabled() {
        return this.brokerageCashOptionEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getRetirementCashOptionEnabled() {
        return this.retirementCashOptionEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getInvestmentOptionEnabled() {
        return this.investmentOptionEnabled;
    }

    public final RecurringAssetCategorySelectionViewState copy(SweepsStatus sweepsStatus, boolean hasGoldSubscription, BigDecimal retirementMatchRate, Money retirementRemainingToLimit, boolean hasRothIraAccount, boolean hasTraditionalIraAccount, boolean brokerageCashOptionEnabled, boolean retirementCashOptionEnabled, boolean investmentOptionEnabled, String brokerageAccountNumber, String rothIraAccountNumber, String traditionalIraAccountNumber) {
        return new RecurringAssetCategorySelectionViewState(sweepsStatus, hasGoldSubscription, retirementMatchRate, retirementRemainingToLimit, hasRothIraAccount, hasTraditionalIraAccount, brokerageCashOptionEnabled, retirementCashOptionEnabled, investmentOptionEnabled, brokerageAccountNumber, rothIraAccountNumber, traditionalIraAccountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringAssetCategorySelectionViewState)) {
            return false;
        }
        RecurringAssetCategorySelectionViewState recurringAssetCategorySelectionViewState = (RecurringAssetCategorySelectionViewState) other;
        return Intrinsics.areEqual(this.sweepsStatus, recurringAssetCategorySelectionViewState.sweepsStatus) && this.hasGoldSubscription == recurringAssetCategorySelectionViewState.hasGoldSubscription && Intrinsics.areEqual(this.retirementMatchRate, recurringAssetCategorySelectionViewState.retirementMatchRate) && Intrinsics.areEqual(this.retirementRemainingToLimit, recurringAssetCategorySelectionViewState.retirementRemainingToLimit) && this.hasRothIraAccount == recurringAssetCategorySelectionViewState.hasRothIraAccount && this.hasTraditionalIraAccount == recurringAssetCategorySelectionViewState.hasTraditionalIraAccount && this.brokerageCashOptionEnabled == recurringAssetCategorySelectionViewState.brokerageCashOptionEnabled && this.retirementCashOptionEnabled == recurringAssetCategorySelectionViewState.retirementCashOptionEnabled && this.investmentOptionEnabled == recurringAssetCategorySelectionViewState.investmentOptionEnabled && Intrinsics.areEqual(this.brokerageAccountNumber, recurringAssetCategorySelectionViewState.brokerageAccountNumber) && Intrinsics.areEqual(this.rothIraAccountNumber, recurringAssetCategorySelectionViewState.rothIraAccountNumber) && Intrinsics.areEqual(this.traditionalIraAccountNumber, recurringAssetCategorySelectionViewState.traditionalIraAccountNumber);
    }

    public int hashCode() {
        SweepsStatus sweepsStatusStore2 = this.sweepsStatus;
        int iHashCode = (((sweepsStatusStore2 == null ? 0 : sweepsStatusStore2.hashCode()) * 31) + Boolean.hashCode(this.hasGoldSubscription)) * 31;
        BigDecimal bigDecimal = this.retirementMatchRate;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Money money = this.retirementRemainingToLimit;
        int iHashCode3 = (((((((((((iHashCode2 + (money == null ? 0 : money.hashCode())) * 31) + Boolean.hashCode(this.hasRothIraAccount)) * 31) + Boolean.hashCode(this.hasTraditionalIraAccount)) * 31) + Boolean.hashCode(this.brokerageCashOptionEnabled)) * 31) + Boolean.hashCode(this.retirementCashOptionEnabled)) * 31) + Boolean.hashCode(this.investmentOptionEnabled)) * 31;
        String str = this.brokerageAccountNumber;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rothIraAccountNumber;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.traditionalIraAccountNumber;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "RecurringAssetCategorySelectionViewState(sweepsStatus=" + this.sweepsStatus + ", hasGoldSubscription=" + this.hasGoldSubscription + ", retirementMatchRate=" + this.retirementMatchRate + ", retirementRemainingToLimit=" + this.retirementRemainingToLimit + ", hasRothIraAccount=" + this.hasRothIraAccount + ", hasTraditionalIraAccount=" + this.hasTraditionalIraAccount + ", brokerageCashOptionEnabled=" + this.brokerageCashOptionEnabled + ", retirementCashOptionEnabled=" + this.retirementCashOptionEnabled + ", investmentOptionEnabled=" + this.investmentOptionEnabled + ", brokerageAccountNumber=" + this.brokerageAccountNumber + ", rothIraAccountNumber=" + this.rothIraAccountNumber + ", traditionalIraAccountNumber=" + this.traditionalIraAccountNumber + ")";
    }

    public RecurringAssetCategorySelectionViewState(SweepsStatus sweepsStatusStore2, boolean z, BigDecimal bigDecimal, Money money, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3) {
        this.sweepsStatus = sweepsStatusStore2;
        this.hasGoldSubscription = z;
        this.retirementMatchRate = bigDecimal;
        this.retirementRemainingToLimit = money;
        this.hasRothIraAccount = z2;
        this.hasTraditionalIraAccount = z3;
        this.brokerageCashOptionEnabled = z4;
        this.retirementCashOptionEnabled = z5;
        this.investmentOptionEnabled = z6;
        this.brokerageAccountNumber = str;
        this.rothIraAccountNumber = str2;
        this.traditionalIraAccountNumber = str3;
    }

    public /* synthetic */ RecurringAssetCategorySelectionViewState(SweepsStatus sweepsStatusStore2, boolean z, BigDecimal bigDecimal, Money money, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sweepsStatusStore2, z, bigDecimal, money, z2, z3, z4, z5, z6, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3);
    }

    public final SweepsStatus getSweepsStatus() {
        return this.sweepsStatus;
    }

    public final boolean getHasGoldSubscription() {
        return this.hasGoldSubscription;
    }

    public final BigDecimal getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    public final Money getRetirementRemainingToLimit() {
        return this.retirementRemainingToLimit;
    }

    public final boolean getHasRothIraAccount() {
        return this.hasRothIraAccount;
    }

    public final boolean getHasTraditionalIraAccount() {
        return this.hasTraditionalIraAccount;
    }

    public final boolean getBrokerageCashOptionEnabled() {
        return this.brokerageCashOptionEnabled;
    }

    public final boolean getRetirementCashOptionEnabled() {
        return this.retirementCashOptionEnabled;
    }

    public final boolean getInvestmentOptionEnabled() {
        return this.investmentOptionEnabled;
    }

    public final String getBrokerageAccountNumber() {
        return this.brokerageAccountNumber;
    }

    public final String getRothIraAccountNumber() {
        return this.rothIraAccountNumber;
    }

    public final String getTraditionalIraAccountNumber() {
        return this.traditionalIraAccountNumber;
    }
}
