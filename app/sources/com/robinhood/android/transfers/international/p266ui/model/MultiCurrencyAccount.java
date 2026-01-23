package com.robinhood.android.transfers.international.p266ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.currencybalance.api.CurrencyBalance;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiCurrencyAccount.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "Landroid/os/Parcelable;", "currency", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "Internal", "External", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount$External;", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount$Internal;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface MultiCurrencyAccount extends Parcelable {
    Currency getCurrency();

    String getIdentifier();

    /* compiled from: MultiCurrencyAccount.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount$Internal;", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "accountNumber", "", "currencyBalance", "Lcom/robinhood/android/models/currencybalance/api/CurrencyBalance;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/currencybalance/api/CurrencyBalance;)V", "getAccountNumber", "()Ljava/lang/String;", "getCurrencyBalance", "()Lcom/robinhood/android/models/currencybalance/api/CurrencyBalance;", "currency", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "identifier", "getIdentifier", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Internal implements MultiCurrencyAccount {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Internal> CREATOR = new Creator();
        private final String accountNumber;
        private final CurrencyBalance currencyBalance;

        /* compiled from: MultiCurrencyAccount.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Internal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Internal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Internal(parcel.readString(), (CurrencyBalance) parcel.readParcelable(Internal.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Internal[] newArray(int i) {
                return new Internal[i];
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, String str, CurrencyBalance currencyBalance, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internal.accountNumber;
            }
            if ((i & 2) != 0) {
                currencyBalance = internal.currencyBalance;
            }
            return internal.copy(str, currencyBalance);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final CurrencyBalance getCurrencyBalance() {
            return this.currencyBalance;
        }

        public final Internal copy(String accountNumber, CurrencyBalance currencyBalance) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(currencyBalance, "currencyBalance");
            return new Internal(accountNumber, currencyBalance);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return Intrinsics.areEqual(this.accountNumber, internal.accountNumber) && Intrinsics.areEqual(this.currencyBalance, internal.currencyBalance);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.currencyBalance.hashCode();
        }

        public String toString() {
            return "Internal(accountNumber=" + this.accountNumber + ", currencyBalance=" + this.currencyBalance + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.currencyBalance, flags);
        }

        public Internal(String accountNumber, CurrencyBalance currencyBalance) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(currencyBalance, "currencyBalance");
            this.accountNumber = accountNumber;
            this.currencyBalance = currencyBalance;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final CurrencyBalance getCurrencyBalance() {
            return this.currencyBalance;
        }

        @Override // com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount
        public Currency getCurrency() {
            return this.currencyBalance.getCurrency();
        }

        @Override // com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount
        public String getIdentifier() {
            return this.accountNumber;
        }
    }

    /* compiled from: MultiCurrencyAccount.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\rHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount$External;", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "instrument", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "currency", "Ljava/util/Currency;", "<init>", "(Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;Ljava/util/Currency;)V", "getInstrument", "()Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "getCurrency", "()Ljava/util/Currency;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class External implements MultiCurrencyAccount {
        public static final int $stable = 8;
        public static final Parcelable.Creator<External> CREATOR = new Creator();
        private final Currency currency;
        private final PaymentInstrumentV2 instrument;

        /* compiled from: MultiCurrencyAccount.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<External> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new External((PaymentInstrumentV2) parcel.readParcelable(External.class.getClassLoader()), (Currency) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External[] newArray(int i) {
                return new External[i];
            }
        }

        public static /* synthetic */ External copy$default(External external, PaymentInstrumentV2 paymentInstrumentV2, Currency currency, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentInstrumentV2 = external.instrument;
            }
            if ((i & 2) != 0) {
                currency = external.currency;
            }
            return external.copy(paymentInstrumentV2, currency);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentInstrumentV2 getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        public final External copy(PaymentInstrumentV2 instrument, Currency currency) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new External(instrument, currency);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof External)) {
                return false;
            }
            External external = (External) other;
            return Intrinsics.areEqual(this.instrument, external.instrument) && Intrinsics.areEqual(this.currency, external.currency);
        }

        public int hashCode() {
            return (this.instrument.hashCode() * 31) + this.currency.hashCode();
        }

        public String toString() {
            return "External(instrument=" + this.instrument + ", currency=" + this.currency + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.instrument, flags);
            dest.writeSerializable(this.currency);
        }

        public External(PaymentInstrumentV2 instrument, Currency currency) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.instrument = instrument;
            this.currency = currency;
        }

        public final PaymentInstrumentV2 getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount
        public String getIdentifier() {
            String string2 = this.instrument.getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }
}
