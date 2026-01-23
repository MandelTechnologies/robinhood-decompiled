package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountRange.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\rR\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/stripe/android/model/AccountRange;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/BinRange;", "binRange", "", "panLength", "Lcom/stripe/android/model/AccountRange$BrandInfo;", "brandInfo", "", PlaceTypes.COUNTRY, "<init>", "(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/BinRange;", "getBinRange", "()Lcom/stripe/android/model/BinRange;", "I", "getPanLength", "Lcom/stripe/android/model/AccountRange$BrandInfo;", "getBrandInfo", "()Lcom/stripe/android/model/AccountRange$BrandInfo;", "Ljava/lang/String;", "getCountry", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "brand", "BrandInfo", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AccountRange implements StripeModel {
    public static final Parcelable.Creator<AccountRange> CREATOR = new Creator();
    private final BinRange binRange;
    private final BrandInfo brandInfo;
    private final String country;
    private final int panLength;

    /* compiled from: AccountRange.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountRange(BinRange.CREATOR.createFromParcel(parcel), parcel.readInt(), BrandInfo.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange[] newArray(int i) {
            return new AccountRange[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRange)) {
            return false;
        }
        AccountRange accountRange = (AccountRange) other;
        return Intrinsics.areEqual(this.binRange, accountRange.binRange) && this.panLength == accountRange.panLength && this.brandInfo == accountRange.brandInfo && Intrinsics.areEqual(this.country, accountRange.country);
    }

    public int hashCode() {
        int iHashCode = ((((this.binRange.hashCode() * 31) + Integer.hashCode(this.panLength)) * 31) + this.brandInfo.hashCode()) * 31;
        String str = this.country;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AccountRange(binRange=" + this.binRange + ", panLength=" + this.panLength + ", brandInfo=" + this.brandInfo + ", country=" + this.country + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.binRange.writeToParcel(parcel, flags);
        parcel.writeInt(this.panLength);
        parcel.writeString(this.brandInfo.name());
        parcel.writeString(this.country);
    }

    public AccountRange(BinRange binRange, int i, BrandInfo brandInfo, String str) {
        Intrinsics.checkNotNullParameter(binRange, "binRange");
        Intrinsics.checkNotNullParameter(brandInfo, "brandInfo");
        this.binRange = binRange;
        this.panLength = i;
        this.brandInfo = brandInfo;
        this.country = str;
    }

    public /* synthetic */ AccountRange(BinRange binRange, int i, BrandInfo brandInfo, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(binRange, i, brandInfo, (i2 & 8) != 0 ? null : str);
    }

    public final BinRange getBinRange() {
        return this.binRange;
    }

    public final int getPanLength() {
        return this.panLength;
    }

    public final CardBrand getBrand() {
        return this.brandInfo.getBrand();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountRange.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/model/AccountRange$BrandInfo;", "", "brandName", "", "brand", "Lcom/stripe/android/model/CardBrand;", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getBrandName", "()Ljava/lang/String;", "Visa", "Mastercard", "AmericanExpress", "JCB", "DinersClub", "Discover", "UnionPay", "CartesBancaires", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class BrandInfo {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BrandInfo[] $VALUES;
        private final CardBrand brand;
        private final String brandName;
        public static final BrandInfo Visa = new BrandInfo("Visa", 0, "VISA", CardBrand.Visa);
        public static final BrandInfo Mastercard = new BrandInfo("Mastercard", 1, "MASTERCARD", CardBrand.MasterCard);
        public static final BrandInfo AmericanExpress = new BrandInfo("AmericanExpress", 2, "AMERICAN_EXPRESS", CardBrand.AmericanExpress);
        public static final BrandInfo JCB = new BrandInfo("JCB", 3, "JCB", CardBrand.JCB);
        public static final BrandInfo DinersClub = new BrandInfo("DinersClub", 4, "DINERS_CLUB", CardBrand.DinersClub);
        public static final BrandInfo Discover = new BrandInfo("Discover", 5, "DISCOVER", CardBrand.Discover);
        public static final BrandInfo UnionPay = new BrandInfo("UnionPay", 6, "UNIONPAY", CardBrand.UnionPay);
        public static final BrandInfo CartesBancaires = new BrandInfo("CartesBancaires", 7, "CARTES_BANCAIRES", CardBrand.CartesBancaires);

        private static final /* synthetic */ BrandInfo[] $values() {
            return new BrandInfo[]{Visa, Mastercard, AmericanExpress, JCB, DinersClub, Discover, UnionPay, CartesBancaires};
        }

        public static EnumEntries<BrandInfo> getEntries() {
            return $ENTRIES;
        }

        public static BrandInfo valueOf(String str) {
            return (BrandInfo) Enum.valueOf(BrandInfo.class, str);
        }

        public static BrandInfo[] values() {
            return (BrandInfo[]) $VALUES.clone();
        }

        private BrandInfo(String str, int i, String str2, CardBrand cardBrand) {
            this.brandName = str2;
            this.brand = cardBrand;
        }

        public final String getBrandName() {
            return this.brandName;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        static {
            BrandInfo[] brandInfoArr$values = $values();
            $VALUES = brandInfoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(brandInfoArr$values);
        }
    }
}
