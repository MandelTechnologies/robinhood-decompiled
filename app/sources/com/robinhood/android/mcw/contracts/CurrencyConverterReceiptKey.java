package com.robinhood.android.mcw.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterReceiptKey.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/CurrencyConverterReceiptKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "fromCurrency", "Ljava/util/Currency;", "toCurrency", "orderId", "Ljava/util/UUID;", "source", "Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;", "<init>", "(Ljava/lang/String;Ljava/util/Currency;Ljava/util/Currency;Ljava/util/UUID;Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;)V", "getAccountNumber", "()Ljava/lang/String;", "getFromCurrency", "()Ljava/util/Currency;", "getToCurrency", "getOrderId", "()Ljava/util/UUID;", "getSource", "()Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CurrencyConverterReceiptKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<CurrencyConverterReceiptKey> CREATOR = new Creator();
    private final String accountNumber;
    private final Currency fromCurrency;
    private final UUID orderId;
    private final CurrencyConversionDeeplinkSource source;
    private final Currency toCurrency;

    /* compiled from: CurrencyConverterReceiptKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrencyConverterReceiptKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyConverterReceiptKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyConverterReceiptKey(parcel.readString(), (Currency) parcel.readSerializable(), (Currency) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : CurrencyConversionDeeplinkSource.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyConverterReceiptKey[] newArray(int i) {
            return new CurrencyConverterReceiptKey[i];
        }
    }

    public static /* synthetic */ CurrencyConverterReceiptKey copy$default(CurrencyConverterReceiptKey currencyConverterReceiptKey, String str, Currency currency, Currency currency2, UUID uuid, CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyConverterReceiptKey.accountNumber;
        }
        if ((i & 2) != 0) {
            currency = currencyConverterReceiptKey.fromCurrency;
        }
        if ((i & 4) != 0) {
            currency2 = currencyConverterReceiptKey.toCurrency;
        }
        if ((i & 8) != 0) {
            uuid = currencyConverterReceiptKey.orderId;
        }
        if ((i & 16) != 0) {
            currencyConversionDeeplinkSource = currencyConverterReceiptKey.source;
        }
        CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource2 = currencyConversionDeeplinkSource;
        Currency currency3 = currency2;
        return currencyConverterReceiptKey.copy(str, currency, currency3, uuid, currencyConversionDeeplinkSource2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Currency getFromCurrency() {
        return this.fromCurrency;
    }

    /* renamed from: component3, reason: from getter */
    public final Currency getToCurrency() {
        return this.toCurrency;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component5, reason: from getter */
    public final CurrencyConversionDeeplinkSource getSource() {
        return this.source;
    }

    public final CurrencyConverterReceiptKey copy(String accountNumber, Currency fromCurrency, Currency toCurrency, UUID orderId, CurrencyConversionDeeplinkSource source) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new CurrencyConverterReceiptKey(accountNumber, fromCurrency, toCurrency, orderId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyConverterReceiptKey)) {
            return false;
        }
        CurrencyConverterReceiptKey currencyConverterReceiptKey = (CurrencyConverterReceiptKey) other;
        return Intrinsics.areEqual(this.accountNumber, currencyConverterReceiptKey.accountNumber) && Intrinsics.areEqual(this.fromCurrency, currencyConverterReceiptKey.fromCurrency) && Intrinsics.areEqual(this.toCurrency, currencyConverterReceiptKey.toCurrency) && Intrinsics.areEqual(this.orderId, currencyConverterReceiptKey.orderId) && this.source == currencyConverterReceiptKey.source;
    }

    public int hashCode() {
        int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.fromCurrency.hashCode()) * 31) + this.toCurrency.hashCode()) * 31) + this.orderId.hashCode()) * 31;
        CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource = this.source;
        return iHashCode + (currencyConversionDeeplinkSource == null ? 0 : currencyConversionDeeplinkSource.hashCode());
    }

    public String toString() {
        return "CurrencyConverterReceiptKey(accountNumber=" + this.accountNumber + ", fromCurrency=" + this.fromCurrency + ", toCurrency=" + this.toCurrency + ", orderId=" + this.orderId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.fromCurrency);
        dest.writeSerializable(this.toCurrency);
        dest.writeSerializable(this.orderId);
        CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource = this.source;
        if (currencyConversionDeeplinkSource == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(currencyConversionDeeplinkSource.name());
        }
    }

    public CurrencyConverterReceiptKey(String accountNumber, Currency fromCurrency, Currency toCurrency, UUID orderId, CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.accountNumber = accountNumber;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.orderId = orderId;
        this.source = currencyConversionDeeplinkSource;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Currency getFromCurrency() {
        return this.fromCurrency;
    }

    public final Currency getToCurrency() {
        return this.toCurrency;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final CurrencyConversionDeeplinkSource getSource() {
        return this.source;
    }
}
