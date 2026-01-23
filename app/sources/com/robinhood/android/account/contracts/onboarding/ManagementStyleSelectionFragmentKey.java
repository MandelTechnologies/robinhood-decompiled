package com.robinhood.android.account.contracts.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOnboardingKeys.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Landroid/os/Parcelable;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ManagementStyleSelectionFragmentKey implements TabFragmentKey, Parcelable {
    public static final Parcelable.Creator<ManagementStyleSelectionFragmentKey> CREATOR = new Creator();
    private final BrokerageAccountType brokerageAccountType;
    private final String source;

    /* compiled from: AccountOnboardingKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ManagementStyleSelectionFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManagementStyleSelectionFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManagementStyleSelectionFragmentKey(BrokerageAccountType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManagementStyleSelectionFragmentKey[] newArray(int i) {
            return new ManagementStyleSelectionFragmentKey[i];
        }
    }

    public static /* synthetic */ ManagementStyleSelectionFragmentKey copy$default(ManagementStyleSelectionFragmentKey managementStyleSelectionFragmentKey, BrokerageAccountType brokerageAccountType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = managementStyleSelectionFragmentKey.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            str = managementStyleSelectionFragmentKey.source;
        }
        return managementStyleSelectionFragmentKey.copy(brokerageAccountType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final ManagementStyleSelectionFragmentKey copy(BrokerageAccountType brokerageAccountType, String source) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new ManagementStyleSelectionFragmentKey(brokerageAccountType, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagementStyleSelectionFragmentKey)) {
            return false;
        }
        ManagementStyleSelectionFragmentKey managementStyleSelectionFragmentKey = (ManagementStyleSelectionFragmentKey) other;
        return this.brokerageAccountType == managementStyleSelectionFragmentKey.brokerageAccountType && Intrinsics.areEqual(this.source, managementStyleSelectionFragmentKey.source);
    }

    public int hashCode() {
        int iHashCode = this.brokerageAccountType.hashCode() * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ManagementStyleSelectionFragmentKey(brokerageAccountType=" + this.brokerageAccountType + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.brokerageAccountType.name());
        dest.writeString(this.source);
    }

    public ManagementStyleSelectionFragmentKey(BrokerageAccountType brokerageAccountType, String str) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.brokerageAccountType = brokerageAccountType;
        this.source = str;
    }

    public /* synthetic */ ManagementStyleSelectionFragmentKey(BrokerageAccountType brokerageAccountType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, (i & 2) != 0 ? null : str);
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
