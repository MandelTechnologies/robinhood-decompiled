package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryPostCreationFundingMethodsKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryPostCreationFundingMethodsKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryPostCreationFundingMethodsKey implements TabFragmentKey {
    public static final Parcelable.Creator<AdvisoryPostCreationFundingMethodsKey> CREATOR = new Creator();
    private final String accountNumber;
    private final BrokerageAccountType brokerageAccountType;
    private final String source;

    /* compiled from: AdvisoryPostCreationFundingMethodsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvisoryPostCreationFundingMethodsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryPostCreationFundingMethodsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryPostCreationFundingMethodsKey(parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryPostCreationFundingMethodsKey[] newArray(int i) {
            return new AdvisoryPostCreationFundingMethodsKey[i];
        }
    }

    public static /* synthetic */ AdvisoryPostCreationFundingMethodsKey copy$default(AdvisoryPostCreationFundingMethodsKey advisoryPostCreationFundingMethodsKey, String str, BrokerageAccountType brokerageAccountType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryPostCreationFundingMethodsKey.accountNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = advisoryPostCreationFundingMethodsKey.brokerageAccountType;
        }
        if ((i & 4) != 0) {
            str2 = advisoryPostCreationFundingMethodsKey.source;
        }
        return advisoryPostCreationFundingMethodsKey.copy(str, brokerageAccountType, str2);
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
    public final String getSource() {
        return this.source;
    }

    public final AdvisoryPostCreationFundingMethodsKey copy(String accountNumber, BrokerageAccountType brokerageAccountType, String source) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        return new AdvisoryPostCreationFundingMethodsKey(accountNumber, brokerageAccountType, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryPostCreationFundingMethodsKey)) {
            return false;
        }
        AdvisoryPostCreationFundingMethodsKey advisoryPostCreationFundingMethodsKey = (AdvisoryPostCreationFundingMethodsKey) other;
        return Intrinsics.areEqual(this.accountNumber, advisoryPostCreationFundingMethodsKey.accountNumber) && this.brokerageAccountType == advisoryPostCreationFundingMethodsKey.brokerageAccountType && Intrinsics.areEqual(this.source, advisoryPostCreationFundingMethodsKey.source);
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "AdvisoryPostCreationFundingMethodsKey(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.brokerageAccountType.name());
        dest.writeString(this.source);
    }

    public AdvisoryPostCreationFundingMethodsKey(String accountNumber, BrokerageAccountType brokerageAccountType, String source) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.accountNumber = accountNumber;
        this.brokerageAccountType = brokerageAccountType;
        this.source = source;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public /* synthetic */ AdvisoryPostCreationFundingMethodsKey(String str, BrokerageAccountType brokerageAccountType, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, brokerageAccountType, (i & 4) != 0 ? "" : str2);
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
