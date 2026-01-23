package com.robinhood.android.transfers.international.p266ui.currencyselection;

import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositCurrencyViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState;", "", "Loading", "Loaded", "CurrencyRow", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState$Loaded;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState$Loading;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface DepositCurrencyViewState {

    /* compiled from: DepositCurrencyViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState$Loading;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements DepositCurrencyViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -138536578;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: DepositCurrencyViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState$Loaded;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState;", "title", "", "currencyRows", "", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState$CurrencyRow;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getCurrencyRows", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements DepositCurrencyViewState {
        public static final int $stable = 8;
        private final List<CurrencyRow> currencyRows;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                list = loaded.currencyRows;
            }
            return loaded.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<CurrencyRow> component2() {
            return this.currencyRows;
        }

        public final Loaded copy(String title, List<CurrencyRow> currencyRows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(currencyRows, "currencyRows");
            return new Loaded(title, currencyRows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.currencyRows, loaded.currencyRows);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.currencyRows.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", currencyRows=" + this.currencyRows + ")";
        }

        public Loaded(String title, List<CurrencyRow> currencyRows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(currencyRows, "currencyRows");
            this.title = title;
            this.currencyRows = currencyRows;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<CurrencyRow> getCurrencyRows() {
            return this.currencyRows;
        }
    }

    /* compiled from: DepositCurrencyViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState$CurrencyRow;", "", "currency", "Ljava/util/Currency;", "countryCode", "", "primaryText", "secondaryText", "<init>", "(Ljava/util/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/util/Currency;", "getCountryCode", "()Ljava/lang/String;", "getPrimaryText", "getSecondaryText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CurrencyRow {
        public static final int $stable = 8;
        private final String countryCode;
        private final Currency currency;
        private final String primaryText;
        private final String secondaryText;

        public static /* synthetic */ CurrencyRow copy$default(CurrencyRow currencyRow, Currency currency, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                currency = currencyRow.currency;
            }
            if ((i & 2) != 0) {
                str = currencyRow.countryCode;
            }
            if ((i & 4) != 0) {
                str2 = currencyRow.primaryText;
            }
            if ((i & 8) != 0) {
                str3 = currencyRow.secondaryText;
            }
            return currencyRow.copy(currency, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final CurrencyRow copy(Currency currency, String countryCode, String primaryText, String secondaryText) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            return new CurrencyRow(currency, countryCode, primaryText, secondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrencyRow)) {
                return false;
            }
            CurrencyRow currencyRow = (CurrencyRow) other;
            return Intrinsics.areEqual(this.currency, currencyRow.currency) && Intrinsics.areEqual(this.countryCode, currencyRow.countryCode) && Intrinsics.areEqual(this.primaryText, currencyRow.primaryText) && Intrinsics.areEqual(this.secondaryText, currencyRow.secondaryText);
        }

        public int hashCode() {
            return (((((this.currency.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode();
        }

        public String toString() {
            return "CurrencyRow(currency=" + this.currency + ", countryCode=" + this.countryCode + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
        }

        public CurrencyRow(Currency currency, String countryCode, String primaryText, String secondaryText) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            this.currency = currency;
            this.countryCode = countryCode;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }
    }
}
