package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import com.robinhood.models.p325fx.p326db.FxOrder;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterReceiptDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptDataState;", "", "fxOrder", "Lcom/robinhood/models/fx/db/FxOrder;", "toBalance", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/fx/db/FxOrder;Lcom/robinhood/models/util/Money;)V", "getFxOrder", "()Lcom/robinhood/models/fx/db/FxOrder;", "getToBalance", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CurrencyConverterReceiptDataState {
    public static final int $stable = 8;
    private final FxOrder fxOrder;
    private final Money toBalance;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyConverterReceiptDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CurrencyConverterReceiptDataState copy$default(CurrencyConverterReceiptDataState currencyConverterReceiptDataState, FxOrder fxOrder, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            fxOrder = currencyConverterReceiptDataState.fxOrder;
        }
        if ((i & 2) != 0) {
            money = currencyConverterReceiptDataState.toBalance;
        }
        return currencyConverterReceiptDataState.copy(fxOrder, money);
    }

    /* renamed from: component1, reason: from getter */
    public final FxOrder getFxOrder() {
        return this.fxOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getToBalance() {
        return this.toBalance;
    }

    public final CurrencyConverterReceiptDataState copy(FxOrder fxOrder, Money toBalance) {
        return new CurrencyConverterReceiptDataState(fxOrder, toBalance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyConverterReceiptDataState)) {
            return false;
        }
        CurrencyConverterReceiptDataState currencyConverterReceiptDataState = (CurrencyConverterReceiptDataState) other;
        return Intrinsics.areEqual(this.fxOrder, currencyConverterReceiptDataState.fxOrder) && Intrinsics.areEqual(this.toBalance, currencyConverterReceiptDataState.toBalance);
    }

    public int hashCode() {
        FxOrder fxOrder = this.fxOrder;
        int iHashCode = (fxOrder == null ? 0 : fxOrder.hashCode()) * 31;
        Money money = this.toBalance;
        return iHashCode + (money != null ? money.hashCode() : 0);
    }

    public String toString() {
        return "CurrencyConverterReceiptDataState(fxOrder=" + this.fxOrder + ", toBalance=" + this.toBalance + ")";
    }

    public CurrencyConverterReceiptDataState(FxOrder fxOrder, Money money) {
        this.fxOrder = fxOrder;
        this.toBalance = money;
    }

    public /* synthetic */ CurrencyConverterReceiptDataState(FxOrder fxOrder, Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fxOrder, (i & 2) != 0 ? null : money);
    }

    public final FxOrder getFxOrder() {
        return this.fxOrder;
    }

    public final Money getToBalance() {
        return this.toBalance;
    }
}
