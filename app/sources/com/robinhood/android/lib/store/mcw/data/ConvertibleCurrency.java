package com.robinhood.android.lib.store.mcw.data;

import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConvertibleCurrency.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "", "currency", "Ljava/util/Currency;", "balance", "Ljava/math/BigDecimal;", "transactionMin", "transactionMax", "<init>", "(Ljava/util/Currency;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/util/Currency;", "getBalance", "()Ljava/math/BigDecimal;", "getTransactionMin", "getTransactionMax", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConvertibleCurrency {
    public static final int $stable = 8;
    private final BigDecimal balance;
    private final Currency currency;
    private final BigDecimal transactionMax;
    private final BigDecimal transactionMin;

    public static /* synthetic */ ConvertibleCurrency copy$default(ConvertibleCurrency convertibleCurrency, Currency currency, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = convertibleCurrency.currency;
        }
        if ((i & 2) != 0) {
            bigDecimal = convertibleCurrency.balance;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = convertibleCurrency.transactionMin;
        }
        if ((i & 8) != 0) {
            bigDecimal3 = convertibleCurrency.transactionMax;
        }
        return convertibleCurrency.copy(currency, bigDecimal, bigDecimal2, bigDecimal3);
    }

    /* renamed from: component1, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getTransactionMin() {
        return this.transactionMin;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getTransactionMax() {
        return this.transactionMax;
    }

    public final ConvertibleCurrency copy(Currency currency, BigDecimal balance, BigDecimal transactionMin, BigDecimal transactionMax) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(transactionMin, "transactionMin");
        Intrinsics.checkNotNullParameter(transactionMax, "transactionMax");
        return new ConvertibleCurrency(currency, balance, transactionMin, transactionMax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConvertibleCurrency)) {
            return false;
        }
        ConvertibleCurrency convertibleCurrency = (ConvertibleCurrency) other;
        return Intrinsics.areEqual(this.currency, convertibleCurrency.currency) && Intrinsics.areEqual(this.balance, convertibleCurrency.balance) && Intrinsics.areEqual(this.transactionMin, convertibleCurrency.transactionMin) && Intrinsics.areEqual(this.transactionMax, convertibleCurrency.transactionMax);
    }

    public int hashCode() {
        return (((((this.currency.hashCode() * 31) + this.balance.hashCode()) * 31) + this.transactionMin.hashCode()) * 31) + this.transactionMax.hashCode();
    }

    public String toString() {
        return "ConvertibleCurrency(currency=" + this.currency + ", balance=" + this.balance + ", transactionMin=" + this.transactionMin + ", transactionMax=" + this.transactionMax + ")";
    }

    public ConvertibleCurrency(Currency currency, BigDecimal balance, BigDecimal transactionMin, BigDecimal transactionMax) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(transactionMin, "transactionMin");
        Intrinsics.checkNotNullParameter(transactionMax, "transactionMax");
        this.currency = currency;
        this.balance = balance;
        this.transactionMin = transactionMin;
        this.transactionMax = transactionMax;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final BigDecimal getBalance() {
        return this.balance;
    }

    public final BigDecimal getTransactionMin() {
        return this.transactionMin;
    }

    public final BigDecimal getTransactionMax() {
        return this.transactionMax;
    }
}
