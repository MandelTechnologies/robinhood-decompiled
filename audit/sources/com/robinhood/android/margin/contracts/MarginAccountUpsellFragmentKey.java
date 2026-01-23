package com.robinhood.android.margin.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginAccountUpsellFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "creditAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/util/Money;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getCreditAmount", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginAccountUpsellFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<MarginAccountUpsellFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final BrokerageAccountType brokerageAccountType;
    private final Money creditAmount;

    /* compiled from: MarginAccountUpsellFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginAccountUpsellFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginAccountUpsellFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginAccountUpsellFragmentKey(parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()), (Money) parcel.readParcelable(MarginAccountUpsellFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginAccountUpsellFragmentKey[] newArray(int i) {
            return new MarginAccountUpsellFragmentKey[i];
        }
    }

    public static /* synthetic */ MarginAccountUpsellFragmentKey copy$default(MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey, String str, BrokerageAccountType brokerageAccountType, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginAccountUpsellFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = marginAccountUpsellFragmentKey.brokerageAccountType;
        }
        if ((i & 4) != 0) {
            money = marginAccountUpsellFragmentKey.creditAmount;
        }
        return marginAccountUpsellFragmentKey.copy(str, brokerageAccountType, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getCreditAmount() {
        return this.creditAmount;
    }

    public final MarginAccountUpsellFragmentKey copy(String accountNumber, BrokerageAccountType brokerageAccountType, Money creditAmount) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(creditAmount, "creditAmount");
        return new MarginAccountUpsellFragmentKey(accountNumber, brokerageAccountType, creditAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginAccountUpsellFragmentKey)) {
            return false;
        }
        MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey = (MarginAccountUpsellFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, marginAccountUpsellFragmentKey.accountNumber) && this.brokerageAccountType == marginAccountUpsellFragmentKey.brokerageAccountType && Intrinsics.areEqual(this.creditAmount, marginAccountUpsellFragmentKey.creditAmount);
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.creditAmount.hashCode();
    }

    public String toString() {
        return "MarginAccountUpsellFragmentKey(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", creditAmount=" + this.creditAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.brokerageAccountType.name());
        dest.writeParcelable(this.creditAmount, flags);
    }

    public MarginAccountUpsellFragmentKey(String accountNumber, BrokerageAccountType brokerageAccountType, Money creditAmount) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(creditAmount, "creditAmount");
        this.accountNumber = accountNumber;
        this.brokerageAccountType = brokerageAccountType;
        this.creditAmount = creditAmount;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final Money getCreditAmount() {
        return this.creditAmount;
    }
}
