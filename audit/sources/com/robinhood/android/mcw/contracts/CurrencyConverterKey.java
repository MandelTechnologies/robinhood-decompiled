package com.robinhood.android.mcw.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterKey.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003Je\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/CurrencyConverterKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "direction", "Lkotlin/Pair;", "Ljava/util/Currency;", "amountFrom", "Ljava/math/BigDecimal;", "amountTo", "useAchromaticTheme", "", "skipReceiptScreen", "source", "Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;", "<init>", "(Ljava/lang/String;Lkotlin/Pair;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;)V", "getAccountNumber", "()Ljava/lang/String;", "getDirection", "()Lkotlin/Pair;", "getAmountFrom", "()Ljava/math/BigDecimal;", "getAmountTo", "getUseAchromaticTheme", "()Z", "getSkipReceiptScreen", "getSource", "()Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CurrencyConverterKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CurrencyConverterKey> CREATOR = new Creator();
    private final String accountNumber;
    private final BigDecimal amountFrom;
    private final BigDecimal amountTo;
    private final Tuples2<Currency, Currency> direction;
    private final boolean skipReceiptScreen;
    private final CurrencyConversionDeeplinkSource source;
    private final boolean useAchromaticTheme;

    /* compiled from: CurrencyConverterKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrencyConverterKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyConverterKey createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Tuples2 tuples2 = (Tuples2) parcel.readSerializable();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new CurrencyConverterKey(string2, tuples2, bigDecimal, bigDecimal2, z2, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : CurrencyConversionDeeplinkSource.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyConverterKey[] newArray(int i) {
            return new CurrencyConverterKey[i];
        }
    }

    public CurrencyConverterKey() {
        this(null, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ CurrencyConverterKey copy$default(CurrencyConverterKey currencyConverterKey, String str, Tuples2 tuples2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyConverterKey.accountNumber;
        }
        if ((i & 2) != 0) {
            tuples2 = currencyConverterKey.direction;
        }
        if ((i & 4) != 0) {
            bigDecimal = currencyConverterKey.amountFrom;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = currencyConverterKey.amountTo;
        }
        if ((i & 16) != 0) {
            z = currencyConverterKey.useAchromaticTheme;
        }
        if ((i & 32) != 0) {
            z2 = currencyConverterKey.skipReceiptScreen;
        }
        if ((i & 64) != 0) {
            currencyConversionDeeplinkSource = currencyConverterKey.source;
        }
        boolean z3 = z2;
        CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource2 = currencyConversionDeeplinkSource;
        boolean z4 = z;
        BigDecimal bigDecimal3 = bigDecimal;
        return currencyConverterKey.copy(str, tuples2, bigDecimal3, bigDecimal2, z4, z3, currencyConversionDeeplinkSource2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Tuples2<Currency, Currency> component2() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getAmountFrom() {
        return this.amountFrom;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmountTo() {
        return this.amountTo;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseAchromaticTheme() {
        return this.useAchromaticTheme;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSkipReceiptScreen() {
        return this.skipReceiptScreen;
    }

    /* renamed from: component7, reason: from getter */
    public final CurrencyConversionDeeplinkSource getSource() {
        return this.source;
    }

    public final CurrencyConverterKey copy(String accountNumber, Tuples2<Currency, Currency> direction, BigDecimal amountFrom, BigDecimal amountTo, boolean useAchromaticTheme, boolean skipReceiptScreen, CurrencyConversionDeeplinkSource source) {
        return new CurrencyConverterKey(accountNumber, direction, amountFrom, amountTo, useAchromaticTheme, skipReceiptScreen, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyConverterKey)) {
            return false;
        }
        CurrencyConverterKey currencyConverterKey = (CurrencyConverterKey) other;
        return Intrinsics.areEqual(this.accountNumber, currencyConverterKey.accountNumber) && Intrinsics.areEqual(this.direction, currencyConverterKey.direction) && Intrinsics.areEqual(this.amountFrom, currencyConverterKey.amountFrom) && Intrinsics.areEqual(this.amountTo, currencyConverterKey.amountTo) && this.useAchromaticTheme == currencyConverterKey.useAchromaticTheme && this.skipReceiptScreen == currencyConverterKey.skipReceiptScreen && this.source == currencyConverterKey.source;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Tuples2<Currency, Currency> tuples2 = this.direction;
        int iHashCode2 = (iHashCode + (tuples2 == null ? 0 : tuples2.hashCode())) * 31;
        BigDecimal bigDecimal = this.amountFrom;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.amountTo;
        int iHashCode4 = (((((iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.useAchromaticTheme)) * 31) + Boolean.hashCode(this.skipReceiptScreen)) * 31;
        CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource = this.source;
        return iHashCode4 + (currencyConversionDeeplinkSource != null ? currencyConversionDeeplinkSource.hashCode() : 0);
    }

    public String toString() {
        return "CurrencyConverterKey(accountNumber=" + this.accountNumber + ", direction=" + this.direction + ", amountFrom=" + this.amountFrom + ", amountTo=" + this.amountTo + ", useAchromaticTheme=" + this.useAchromaticTheme + ", skipReceiptScreen=" + this.skipReceiptScreen + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.direction);
        dest.writeSerializable(this.amountFrom);
        dest.writeSerializable(this.amountTo);
        dest.writeInt(this.useAchromaticTheme ? 1 : 0);
        dest.writeInt(this.skipReceiptScreen ? 1 : 0);
        CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource = this.source;
        if (currencyConversionDeeplinkSource == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(currencyConversionDeeplinkSource.name());
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CurrencyConverterKey(String str, Tuples2<Currency, Currency> tuples2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource) {
        this.accountNumber = str;
        this.direction = tuples2;
        this.amountFrom = bigDecimal;
        this.amountTo = bigDecimal2;
        this.useAchromaticTheme = z;
        this.skipReceiptScreen = z2;
        this.source = currencyConversionDeeplinkSource;
    }

    public /* synthetic */ CurrencyConverterKey(String str, Tuples2 tuples2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : tuples2, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : bigDecimal2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : currencyConversionDeeplinkSource);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Tuples2<Currency, Currency> getDirection() {
        return this.direction;
    }

    public final BigDecimal getAmountFrom() {
        return this.amountFrom;
    }

    public final BigDecimal getAmountTo() {
        return this.amountTo;
    }

    public final boolean getUseAchromaticTheme() {
        return this.useAchromaticTheme;
    }

    public final boolean getSkipReceiptScreen() {
        return this.skipReceiptScreen;
    }

    public final CurrencyConversionDeeplinkSource getSource() {
        return this.source;
    }
}
