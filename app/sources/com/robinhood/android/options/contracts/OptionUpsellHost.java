package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionUpsellHost.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u0018¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionUpsellHost;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode;", "eligibilitySource", "refId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode;Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode;", "getEligibilitySource", "getRefId", "()Ljava/util/UUID;", "isRetirement", "", "isRetirement$annotations", "()V", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionUpsellHost implements IntentKey, Parcelable {
    public static final Parcelable.Creator<OptionUpsellHost> CREATOR = new Creator();
    private final String accountNumber;
    private final BrokerageAccountType brokerageAccountType;
    private final String eligibilitySource;
    private final boolean isRetirement;
    private final OptionUpsellHostLaunchMode launchMode;
    private final UUID refId;

    /* compiled from: OptionUpsellHost.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionUpsellHost> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionUpsellHost createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionUpsellHost(parcel.readString(), parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString()), (OptionUpsellHostLaunchMode) parcel.readParcelable(OptionUpsellHost.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionUpsellHost[] newArray(int i) {
            return new OptionUpsellHost[i];
        }
    }

    public static /* synthetic */ OptionUpsellHost copy$default(OptionUpsellHost optionUpsellHost, String str, BrokerageAccountType brokerageAccountType, OptionUpsellHostLaunchMode optionUpsellHostLaunchMode, String str2, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionUpsellHost.accountNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = optionUpsellHost.brokerageAccountType;
        }
        if ((i & 4) != 0) {
            optionUpsellHostLaunchMode = optionUpsellHost.launchMode;
        }
        if ((i & 8) != 0) {
            str2 = optionUpsellHost.eligibilitySource;
        }
        if ((i & 16) != 0) {
            uuid = optionUpsellHost.refId;
        }
        UUID uuid2 = uuid;
        OptionUpsellHostLaunchMode optionUpsellHostLaunchMode2 = optionUpsellHostLaunchMode;
        return optionUpsellHost.copy(str, brokerageAccountType, optionUpsellHostLaunchMode2, str2, uuid2);
    }

    public static /* synthetic */ void isRetirement$annotations() {
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
    public final OptionUpsellHostLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEligibilitySource() {
        return this.eligibilitySource;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    public final OptionUpsellHost copy(String accountNumber, BrokerageAccountType brokerageAccountType, OptionUpsellHostLaunchMode launchMode, String eligibilitySource, UUID refId) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new OptionUpsellHost(accountNumber, brokerageAccountType, launchMode, eligibilitySource, refId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionUpsellHost)) {
            return false;
        }
        OptionUpsellHost optionUpsellHost = (OptionUpsellHost) other;
        return Intrinsics.areEqual(this.accountNumber, optionUpsellHost.accountNumber) && this.brokerageAccountType == optionUpsellHost.brokerageAccountType && Intrinsics.areEqual(this.launchMode, optionUpsellHost.launchMode) && Intrinsics.areEqual(this.eligibilitySource, optionUpsellHost.eligibilitySource) && Intrinsics.areEqual(this.refId, optionUpsellHost.refId);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode2 = (((iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31) + this.launchMode.hashCode()) * 31;
        String str2 = this.eligibilitySource;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UUID uuid = this.refId;
        return iHashCode3 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "OptionUpsellHost(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", launchMode=" + this.launchMode + ", eligibilitySource=" + this.eligibilitySource + ", refId=" + this.refId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(brokerageAccountType.name());
        }
        dest.writeParcelable(this.launchMode, flags);
        dest.writeString(this.eligibilitySource);
        dest.writeSerializable(this.refId);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public OptionUpsellHost(String str, BrokerageAccountType brokerageAccountType, OptionUpsellHostLaunchMode launchMode, String str2, UUID uuid) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.accountNumber = str;
        this.brokerageAccountType = brokerageAccountType;
        this.launchMode = launchMode;
        this.eligibilitySource = str2;
        this.refId = uuid;
        boolean z = false;
        if (brokerageAccountType != null && brokerageAccountType.isRetirement()) {
            z = true;
        }
        this.isRetirement = z;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final OptionUpsellHostLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final String getEligibilitySource() {
        return this.eligibilitySource;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: isRetirement, reason: from getter */
    public final boolean getIsRetirement() {
        return this.isRetirement;
    }
}
