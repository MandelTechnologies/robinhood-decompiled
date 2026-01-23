package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterReceiptViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState;", "", "Loading", "Complete", "Pending", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Complete;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Loading;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Pending;", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface CurrencyConverterReceiptViewState {

    /* compiled from: CurrencyConverterReceiptViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Loading;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements CurrencyConverterReceiptViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1099376052;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: CurrencyConverterReceiptViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Complete;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState;", "fromAmount", "Lcom/robinhood/models/util/Money;", "toAmount", "forwardRate", "Ljava/math/BigDecimal;", "toBalance", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;)V", "getFromAmount", "()Lcom/robinhood/models/util/Money;", "getToAmount", "getForwardRate", "()Ljava/math/BigDecimal;", "getToBalance", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Complete implements CurrencyConverterReceiptViewState {
        private final BigDecimal forwardRate;
        private final Money fromAmount;
        private final Money toAmount;
        private final Money toBalance;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public static /* synthetic */ Complete copy$default(Complete complete, Money money, Money money2, BigDecimal bigDecimal, Money money3, int i, Object obj) {
            if ((i & 1) != 0) {
                money = complete.fromAmount;
            }
            if ((i & 2) != 0) {
                money2 = complete.toAmount;
            }
            if ((i & 4) != 0) {
                bigDecimal = complete.forwardRate;
            }
            if ((i & 8) != 0) {
                money3 = complete.toBalance;
            }
            return complete.copy(money, money2, bigDecimal, money3);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getFromAmount() {
            return this.fromAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getToAmount() {
            return this.toAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getForwardRate() {
            return this.forwardRate;
        }

        /* renamed from: component4, reason: from getter */
        public final Money getToBalance() {
            return this.toBalance;
        }

        public final Complete copy(Money fromAmount, Money toAmount, BigDecimal forwardRate, Money toBalance) {
            Intrinsics.checkNotNullParameter(fromAmount, "fromAmount");
            Intrinsics.checkNotNullParameter(toAmount, "toAmount");
            Intrinsics.checkNotNullParameter(forwardRate, "forwardRate");
            Intrinsics.checkNotNullParameter(toBalance, "toBalance");
            return new Complete(fromAmount, toAmount, forwardRate, toBalance);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.areEqual(this.fromAmount, complete.fromAmount) && Intrinsics.areEqual(this.toAmount, complete.toAmount) && Intrinsics.areEqual(this.forwardRate, complete.forwardRate) && Intrinsics.areEqual(this.toBalance, complete.toBalance);
        }

        public int hashCode() {
            return (((((this.fromAmount.hashCode() * 31) + this.toAmount.hashCode()) * 31) + this.forwardRate.hashCode()) * 31) + this.toBalance.hashCode();
        }

        public String toString() {
            return "Complete(fromAmount=" + this.fromAmount + ", toAmount=" + this.toAmount + ", forwardRate=" + this.forwardRate + ", toBalance=" + this.toBalance + ")";
        }

        public Complete(Money fromAmount, Money toAmount, BigDecimal forwardRate, Money toBalance) {
            Intrinsics.checkNotNullParameter(fromAmount, "fromAmount");
            Intrinsics.checkNotNullParameter(toAmount, "toAmount");
            Intrinsics.checkNotNullParameter(forwardRate, "forwardRate");
            Intrinsics.checkNotNullParameter(toBalance, "toBalance");
            this.fromAmount = fromAmount;
            this.toAmount = toAmount;
            this.forwardRate = forwardRate;
            this.toBalance = toBalance;
        }

        public final Money getFromAmount() {
            return this.fromAmount;
        }

        public final Money getToAmount() {
            return this.toAmount;
        }

        public final BigDecimal getForwardRate() {
            return this.forwardRate;
        }

        public final Money getToBalance() {
            return this.toBalance;
        }

        /* compiled from: CurrencyConverterReceiptViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Complete$Companion;", "", "<init>", "()V", "placeholder", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Complete;", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Complete placeholder() {
                Currency currency = Currencies.USD;
                return new Complete(new Money(currency, new BigDecimal("500.00")), new Money(currency, new BigDecimal("500.00")), new BigDecimal("1.000"), new Money(currency, new BigDecimal("100000.00")));
            }
        }
    }

    /* compiled from: CurrencyConverterReceiptViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Pending;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState;", "fromAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getFromAmount", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Pending implements CurrencyConverterReceiptViewState {
        public static final int $stable = 8;
        private final Money fromAmount;

        public static /* synthetic */ Pending copy$default(Pending pending, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = pending.fromAmount;
            }
            return pending.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getFromAmount() {
            return this.fromAmount;
        }

        public final Pending copy(Money fromAmount) {
            Intrinsics.checkNotNullParameter(fromAmount, "fromAmount");
            return new Pending(fromAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pending) && Intrinsics.areEqual(this.fromAmount, ((Pending) other).fromAmount);
        }

        public int hashCode() {
            return this.fromAmount.hashCode();
        }

        public String toString() {
            return "Pending(fromAmount=" + this.fromAmount + ")";
        }

        public Pending(Money fromAmount) {
            Intrinsics.checkNotNullParameter(fromAmount, "fromAmount");
            this.fromAmount = fromAmount;
        }

        public final Money getFromAmount() {
            return this.fromAmount;
        }
    }
}
