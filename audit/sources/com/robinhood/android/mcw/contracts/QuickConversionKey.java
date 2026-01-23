package com.robinhood.android.mcw.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.serverdriven.p347db.OrderCheckCta;
import com.robinhood.models.util.Money;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickConversionKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "title", "message", "placeholder", "sourceCurrency", "Ljava/util/Currency;", "amountNeeded", "Lcom/robinhood/models/util/Money;", "currentBuyingPower", "secondaryCta", "Lcom/robinhood/models/serverdriven/db/OrderCheckCta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Currency;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/serverdriven/db/OrderCheckCta;)V", "getAccountNumber", "()Ljava/lang/String;", "getTitle", "getMessage", "getPlaceholder", "getSourceCurrency", "()Ljava/util/Currency;", "getAmountNeeded", "()Lcom/robinhood/models/util/Money;", "getCurrentBuyingPower", "getSecondaryCta", "()Lcom/robinhood/models/serverdriven/db/OrderCheckCta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class QuickConversionKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<QuickConversionKey> CREATOR = new Creator();
    private final String accountNumber;
    private final Money amountNeeded;
    private final Money currentBuyingPower;
    private final String message;
    private final String placeholder;
    private final OrderCheckCta secondaryCta;
    private final Currency sourceCurrency;
    private final String title;

    /* compiled from: QuickConversionKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuickConversionKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickConversionKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuickConversionKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Currency) parcel.readSerializable(), (Money) parcel.readParcelable(QuickConversionKey.class.getClassLoader()), (Money) parcel.readParcelable(QuickConversionKey.class.getClassLoader()), (OrderCheckCta) parcel.readParcelable(QuickConversionKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickConversionKey[] newArray(int i) {
            return new QuickConversionKey[i];
        }
    }

    public static /* synthetic */ QuickConversionKey copy$default(QuickConversionKey quickConversionKey, String str, String str2, String str3, String str4, Currency currency, Money money, Money money2, OrderCheckCta orderCheckCta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quickConversionKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = quickConversionKey.title;
        }
        if ((i & 4) != 0) {
            str3 = quickConversionKey.message;
        }
        if ((i & 8) != 0) {
            str4 = quickConversionKey.placeholder;
        }
        if ((i & 16) != 0) {
            currency = quickConversionKey.sourceCurrency;
        }
        if ((i & 32) != 0) {
            money = quickConversionKey.amountNeeded;
        }
        if ((i & 64) != 0) {
            money2 = quickConversionKey.currentBuyingPower;
        }
        if ((i & 128) != 0) {
            orderCheckCta = quickConversionKey.secondaryCta;
        }
        Money money3 = money2;
        OrderCheckCta orderCheckCta2 = orderCheckCta;
        Currency currency2 = currency;
        Money money4 = money;
        return quickConversionKey.copy(str, str2, str3, str4, currency2, money4, money3, orderCheckCta2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component5, reason: from getter */
    public final Currency getSourceCurrency() {
        return this.sourceCurrency;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getAmountNeeded() {
        return this.amountNeeded;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getCurrentBuyingPower() {
        return this.currentBuyingPower;
    }

    /* renamed from: component8, reason: from getter */
    public final OrderCheckCta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final QuickConversionKey copy(String accountNumber, String title, String message, String placeholder, Currency sourceCurrency, Money amountNeeded, Money currentBuyingPower, OrderCheckCta secondaryCta) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(amountNeeded, "amountNeeded");
        Intrinsics.checkNotNullParameter(currentBuyingPower, "currentBuyingPower");
        return new QuickConversionKey(accountNumber, title, message, placeholder, sourceCurrency, amountNeeded, currentBuyingPower, secondaryCta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickConversionKey)) {
            return false;
        }
        QuickConversionKey quickConversionKey = (QuickConversionKey) other;
        return Intrinsics.areEqual(this.accountNumber, quickConversionKey.accountNumber) && Intrinsics.areEqual(this.title, quickConversionKey.title) && Intrinsics.areEqual(this.message, quickConversionKey.message) && Intrinsics.areEqual(this.placeholder, quickConversionKey.placeholder) && Intrinsics.areEqual(this.sourceCurrency, quickConversionKey.sourceCurrency) && Intrinsics.areEqual(this.amountNeeded, quickConversionKey.amountNeeded) && Intrinsics.areEqual(this.currentBuyingPower, quickConversionKey.currentBuyingPower) && Intrinsics.areEqual(this.secondaryCta, quickConversionKey.secondaryCta);
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.placeholder.hashCode()) * 31) + this.sourceCurrency.hashCode()) * 31) + this.amountNeeded.hashCode()) * 31) + this.currentBuyingPower.hashCode()) * 31;
        OrderCheckCta orderCheckCta = this.secondaryCta;
        return iHashCode2 + (orderCheckCta != null ? orderCheckCta.hashCode() : 0);
    }

    public String toString() {
        return "QuickConversionKey(accountNumber=" + this.accountNumber + ", title=" + this.title + ", message=" + this.message + ", placeholder=" + this.placeholder + ", sourceCurrency=" + this.sourceCurrency + ", amountNeeded=" + this.amountNeeded + ", currentBuyingPower=" + this.currentBuyingPower + ", secondaryCta=" + this.secondaryCta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.title);
        dest.writeString(this.message);
        dest.writeString(this.placeholder);
        dest.writeSerializable(this.sourceCurrency);
        dest.writeParcelable(this.amountNeeded, flags);
        dest.writeParcelable(this.currentBuyingPower, flags);
        dest.writeParcelable(this.secondaryCta, flags);
    }

    public QuickConversionKey(String accountNumber, String title, String str, String placeholder, Currency sourceCurrency, Money amountNeeded, Money currentBuyingPower, OrderCheckCta orderCheckCta) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(amountNeeded, "amountNeeded");
        Intrinsics.checkNotNullParameter(currentBuyingPower, "currentBuyingPower");
        this.accountNumber = accountNumber;
        this.title = title;
        this.message = str;
        this.placeholder = placeholder;
        this.sourceCurrency = sourceCurrency;
        this.amountNeeded = amountNeeded;
        this.currentBuyingPower = currentBuyingPower;
        this.secondaryCta = orderCheckCta;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Currency getSourceCurrency() {
        return this.sourceCurrency;
    }

    public final Money getAmountNeeded() {
        return this.amountNeeded;
    }

    public final Money getCurrentBuyingPower() {
        return this.currentBuyingPower;
    }

    public final OrderCheckCta getSecondaryCta() {
        return this.secondaryCta;
    }
}
