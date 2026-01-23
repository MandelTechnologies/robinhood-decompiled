package com.robinhood.android.internalassettransfers.cashselection;

import com.robinhood.android.internalassettransfers.AssetSelection;
import com.robinhood.android.internalassettransfers.cashselection.models.CashBalanceQuantity;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InternalAssetTransferCashSelectionDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;", "", "source", "", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "initialAssetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "isMarginBalance", "", "currency", "Ljava/util/Currency;", "cashBalanceQuantity", "Lcom/robinhood/android/internalassettransfers/cashselection/models/CashBalanceQuantity;", "cashInput", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/AssetSelection;ZLjava/util/Currency;Lcom/robinhood/android/internalassettransfers/cashselection/models/CashBalanceQuantity;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getInitialAssetSelection", "()Lcom/robinhood/android/internalassettransfers/AssetSelection;", "()Z", "getCurrency", "()Ljava/util/Currency;", "getCashBalanceQuantity", "()Lcom/robinhood/android/internalassettransfers/cashselection/models/CashBalanceQuantity;", "getCashInput", "cashTextValue", "getCashTextValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferCashSelectionDataState {
    public static final int $stable = 8;
    private final CashBalanceQuantity cashBalanceQuantity;
    private final String cashInput;
    private final Currency currency;
    private final EligibleAssets eligibleAssets;
    private final AssetSelection initialAssetSelection;
    private final boolean isMarginBalance;
    private final String source;

    public static /* synthetic */ InternalAssetTransferCashSelectionDataState copy$default(InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState, String str, EligibleAssets eligibleAssets, AssetSelection assetSelection, boolean z, Currency currency, CashBalanceQuantity cashBalanceQuantity, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalAssetTransferCashSelectionDataState.source;
        }
        if ((i & 2) != 0) {
            eligibleAssets = internalAssetTransferCashSelectionDataState.eligibleAssets;
        }
        if ((i & 4) != 0) {
            assetSelection = internalAssetTransferCashSelectionDataState.initialAssetSelection;
        }
        if ((i & 8) != 0) {
            z = internalAssetTransferCashSelectionDataState.isMarginBalance;
        }
        if ((i & 16) != 0) {
            currency = internalAssetTransferCashSelectionDataState.currency;
        }
        if ((i & 32) != 0) {
            cashBalanceQuantity = internalAssetTransferCashSelectionDataState.cashBalanceQuantity;
        }
        if ((i & 64) != 0) {
            str2 = internalAssetTransferCashSelectionDataState.cashInput;
        }
        CashBalanceQuantity cashBalanceQuantity2 = cashBalanceQuantity;
        String str3 = str2;
        Currency currency2 = currency;
        AssetSelection assetSelection2 = assetSelection;
        return internalAssetTransferCashSelectionDataState.copy(str, eligibleAssets, assetSelection2, z, currency2, cashBalanceQuantity2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    /* renamed from: component3, reason: from getter */
    public final AssetSelection getInitialAssetSelection() {
        return this.initialAssetSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMarginBalance() {
        return this.isMarginBalance;
    }

    /* renamed from: component5, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component6, reason: from getter */
    public final CashBalanceQuantity getCashBalanceQuantity() {
        return this.cashBalanceQuantity;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCashInput() {
        return this.cashInput;
    }

    public final InternalAssetTransferCashSelectionDataState copy(String source, EligibleAssets eligibleAssets, AssetSelection initialAssetSelection, boolean isMarginBalance, Currency currency, CashBalanceQuantity cashBalanceQuantity, String cashInput) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(initialAssetSelection, "initialAssetSelection");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(cashBalanceQuantity, "cashBalanceQuantity");
        Intrinsics.checkNotNullParameter(cashInput, "cashInput");
        return new InternalAssetTransferCashSelectionDataState(source, eligibleAssets, initialAssetSelection, isMarginBalance, currency, cashBalanceQuantity, cashInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferCashSelectionDataState)) {
            return false;
        }
        InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState = (InternalAssetTransferCashSelectionDataState) other;
        return Intrinsics.areEqual(this.source, internalAssetTransferCashSelectionDataState.source) && Intrinsics.areEqual(this.eligibleAssets, internalAssetTransferCashSelectionDataState.eligibleAssets) && Intrinsics.areEqual(this.initialAssetSelection, internalAssetTransferCashSelectionDataState.initialAssetSelection) && this.isMarginBalance == internalAssetTransferCashSelectionDataState.isMarginBalance && Intrinsics.areEqual(this.currency, internalAssetTransferCashSelectionDataState.currency) && Intrinsics.areEqual(this.cashBalanceQuantity, internalAssetTransferCashSelectionDataState.cashBalanceQuantity) && Intrinsics.areEqual(this.cashInput, internalAssetTransferCashSelectionDataState.cashInput);
    }

    public int hashCode() {
        return (((((((((((this.source.hashCode() * 31) + this.eligibleAssets.hashCode()) * 31) + this.initialAssetSelection.hashCode()) * 31) + Boolean.hashCode(this.isMarginBalance)) * 31) + this.currency.hashCode()) * 31) + this.cashBalanceQuantity.hashCode()) * 31) + this.cashInput.hashCode();
    }

    public String toString() {
        return "InternalAssetTransferCashSelectionDataState(source=" + this.source + ", eligibleAssets=" + this.eligibleAssets + ", initialAssetSelection=" + this.initialAssetSelection + ", isMarginBalance=" + this.isMarginBalance + ", currency=" + this.currency + ", cashBalanceQuantity=" + this.cashBalanceQuantity + ", cashInput=" + this.cashInput + ")";
    }

    public InternalAssetTransferCashSelectionDataState(String source, EligibleAssets eligibleAssets, AssetSelection initialAssetSelection, boolean z, Currency currency, CashBalanceQuantity cashBalanceQuantity, String cashInput) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
        Intrinsics.checkNotNullParameter(initialAssetSelection, "initialAssetSelection");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(cashBalanceQuantity, "cashBalanceQuantity");
        Intrinsics.checkNotNullParameter(cashInput, "cashInput");
        this.source = source;
        this.eligibleAssets = eligibleAssets;
        this.initialAssetSelection = initialAssetSelection;
        this.isMarginBalance = z;
        this.currency = currency;
        this.cashBalanceQuantity = cashBalanceQuantity;
        this.cashInput = cashInput;
    }

    public final String getSource() {
        return this.source;
    }

    public final EligibleAssets getEligibleAssets() {
        return this.eligibleAssets;
    }

    public final AssetSelection getInitialAssetSelection() {
        return this.initialAssetSelection;
    }

    public final boolean isMarginBalance() {
        return this.isMarginBalance;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InternalAssetTransferCashSelectionDataState(String str, EligibleAssets eligibleAssets, AssetSelection assetSelection, boolean z, Currency currency, CashBalanceQuantity cashBalanceQuantity, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        String string2;
        CashBalanceQuantity cashBalanceQuantity2;
        Currency currency2 = (i & 16) != 0 ? Currencies.USD : currency;
        if ((i & 32) != 0) {
            BigDecimal cash = assetSelection.getCash();
            if (Intrinsics.areEqual(cash, eligibleAssets.getAvailableCash()) || Intrinsics.areEqual(cash, BigDecimal.ZERO)) {
                cashBalanceQuantity2 = CashBalanceQuantity.EntireBalance.INSTANCE;
            } else {
                cashBalanceQuantity2 = CashBalanceQuantity.SpecificAmount.INSTANCE;
            }
            cashBalanceQuantity = cashBalanceQuantity2;
        }
        CashBalanceQuantity cashBalanceQuantity3 = cashBalanceQuantity;
        if ((i & 64) != 0) {
            if (cashBalanceQuantity3 instanceof CashBalanceQuantity.EntireBalance) {
                string2 = "0";
            } else {
                string2 = assetSelection.getCash().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            }
            str3 = string2;
        } else {
            str3 = str2;
        }
        this(str, eligibleAssets, assetSelection, z, currency2, cashBalanceQuantity3, str3);
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final CashBalanceQuantity getCashBalanceQuantity() {
        return this.cashBalanceQuantity;
    }

    public final String getCashInput() {
        return this.cashInput;
    }

    public final String getCashTextValue() {
        if (this.isMarginBalance) {
            return "-" + this.currency.getSymbol() + StringsKt.removePrefix(this.cashInput, "-");
        }
        return this.currency.getSymbol() + this.cashInput;
    }
}
