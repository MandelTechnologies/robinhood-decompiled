package com.robinhood.android.transfers.international.p266ui.currencyselection;

import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositCurrencyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyEvent;", "", "CurrencySelected", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyEvent$CurrencySelected;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.currencyselection.DepositCurrencyEvent, reason: use source file name */
/* loaded from: classes9.dex */
public interface DepositCurrencyDuxo3 {

    /* compiled from: DepositCurrencyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyEvent$CurrencySelected;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyEvent;", "currency", "Ljava/util/Currency;", "<init>", "(Ljava/util/Currency;)V", "getCurrency", "()Ljava/util/Currency;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.currencyselection.DepositCurrencyEvent$CurrencySelected, reason: from toString */
    public static final /* data */ class CurrencySelected implements DepositCurrencyDuxo3 {
        public static final int $stable = 8;
        private final Currency currency;

        public static /* synthetic */ CurrencySelected copy$default(CurrencySelected currencySelected, Currency currency, int i, Object obj) {
            if ((i & 1) != 0) {
                currency = currencySelected.currency;
            }
            return currencySelected.copy(currency);
        }

        /* renamed from: component1, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        public final CurrencySelected copy(Currency currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new CurrencySelected(currency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CurrencySelected) && Intrinsics.areEqual(this.currency, ((CurrencySelected) other).currency);
        }

        public int hashCode() {
            return this.currency.hashCode();
        }

        public String toString() {
            return "CurrencySelected(currency=" + this.currency + ")";
        }

        public CurrencySelected(Currency currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.currency = currency;
        }

        public final Currency getCurrency() {
            return this.currency;
        }
    }
}
