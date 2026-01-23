package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "applicationId", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountNumber", "()Ljava/lang/String;", "getApplicationId", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryUpdatePortfolioFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<AdvisoryUpdatePortfolioFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String applicationId;
    private final BrokerageAccountType brokerageAccountType;

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey$Callbacks;", "", "onInvestorProfileUpdateComplete", "", "nextScreenTitle", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onInvestorProfileUpdateComplete(String nextScreenTitle);
    }

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvisoryUpdatePortfolioFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryUpdatePortfolioFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryUpdatePortfolioFragmentKey(parcel.readString(), parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryUpdatePortfolioFragmentKey[] newArray(int i) {
            return new AdvisoryUpdatePortfolioFragmentKey[i];
        }
    }

    public static /* synthetic */ AdvisoryUpdatePortfolioFragmentKey copy$default(AdvisoryUpdatePortfolioFragmentKey advisoryUpdatePortfolioFragmentKey, String str, String str2, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryUpdatePortfolioFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = advisoryUpdatePortfolioFragmentKey.applicationId;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = advisoryUpdatePortfolioFragmentKey.brokerageAccountType;
        }
        return advisoryUpdatePortfolioFragmentKey.copy(str, str2, brokerageAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final AdvisoryUpdatePortfolioFragmentKey copy(String accountNumber, String applicationId, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new AdvisoryUpdatePortfolioFragmentKey(accountNumber, applicationId, brokerageAccountType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryUpdatePortfolioFragmentKey)) {
            return false;
        }
        AdvisoryUpdatePortfolioFragmentKey advisoryUpdatePortfolioFragmentKey = (AdvisoryUpdatePortfolioFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, advisoryUpdatePortfolioFragmentKey.accountNumber) && Intrinsics.areEqual(this.applicationId, advisoryUpdatePortfolioFragmentKey.applicationId) && this.brokerageAccountType == advisoryUpdatePortfolioFragmentKey.brokerageAccountType;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applicationId;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.brokerageAccountType.hashCode();
    }

    public String toString() {
        return "AdvisoryUpdatePortfolioFragmentKey(accountNumber=" + this.accountNumber + ", applicationId=" + this.applicationId + ", brokerageAccountType=" + this.brokerageAccountType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.applicationId);
        dest.writeString(this.brokerageAccountType.name());
    }

    public AdvisoryUpdatePortfolioFragmentKey(String str, String str2, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.accountNumber = str;
        this.applicationId = str2;
        this.brokerageAccountType = brokerageAccountType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }
}
