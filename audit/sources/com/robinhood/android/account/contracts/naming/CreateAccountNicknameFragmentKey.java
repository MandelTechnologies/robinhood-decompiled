package com.robinhood.android.account.contracts.naming;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameKeys.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/naming/CreateAccountNicknameFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class CreateAccountNicknameFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<CreateAccountNicknameFragmentKey> CREATOR = new Creator();
    private final BrokerageAccountType brokerageAccountType;
    private final ManagementType managementType;
    private final String source;

    /* compiled from: AccountNicknameKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateAccountNicknameFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateAccountNicknameFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateAccountNicknameFragmentKey(BrokerageAccountType.valueOf(parcel.readString()), ManagementType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateAccountNicknameFragmentKey[] newArray(int i) {
            return new CreateAccountNicknameFragmentKey[i];
        }
    }

    public static /* synthetic */ CreateAccountNicknameFragmentKey copy$default(CreateAccountNicknameFragmentKey createAccountNicknameFragmentKey, BrokerageAccountType brokerageAccountType, ManagementType managementType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = createAccountNicknameFragmentKey.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            managementType = createAccountNicknameFragmentKey.managementType;
        }
        if ((i & 4) != 0) {
            str = createAccountNicknameFragmentKey.source;
        }
        return createAccountNicknameFragmentKey.copy(brokerageAccountType, managementType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component2, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final CreateAccountNicknameFragmentKey copy(BrokerageAccountType brokerageAccountType, ManagementType managementType, String source) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        return new CreateAccountNicknameFragmentKey(brokerageAccountType, managementType, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAccountNicknameFragmentKey)) {
            return false;
        }
        CreateAccountNicknameFragmentKey createAccountNicknameFragmentKey = (CreateAccountNicknameFragmentKey) other;
        return this.brokerageAccountType == createAccountNicknameFragmentKey.brokerageAccountType && this.managementType == createAccountNicknameFragmentKey.managementType && Intrinsics.areEqual(this.source, createAccountNicknameFragmentKey.source);
    }

    public int hashCode() {
        int iHashCode = ((this.brokerageAccountType.hashCode() * 31) + this.managementType.hashCode()) * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CreateAccountNicknameFragmentKey(brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.brokerageAccountType.name());
        dest.writeString(this.managementType.name());
        dest.writeString(this.source);
    }

    public CreateAccountNicknameFragmentKey(BrokerageAccountType brokerageAccountType, ManagementType managementType, String str) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        this.brokerageAccountType = brokerageAccountType;
        this.managementType = managementType;
        this.source = str;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ManagementType getManagementType() {
        return this.managementType;
    }

    public final String getSource() {
        return this.source;
    }
}
