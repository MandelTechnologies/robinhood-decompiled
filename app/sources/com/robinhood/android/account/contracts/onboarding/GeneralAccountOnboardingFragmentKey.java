package com.robinhood.android.account.contracts.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOnboardingKeys.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/onboarding/GeneralAccountOnboardingFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Landroid/os/Parcelable;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "source", "", "<init>", "(Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;)V", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getSource", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeneralAccountOnboardingFragmentKey implements TabFragmentKey, Parcelable {
    public static final Parcelable.Creator<GeneralAccountOnboardingFragmentKey> CREATOR = new Creator();
    private final ManagementType managementType;
    private final String source;

    /* compiled from: AccountOnboardingKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<GeneralAccountOnboardingFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeneralAccountOnboardingFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GeneralAccountOnboardingFragmentKey(parcel.readInt() == 0 ? null : ManagementType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeneralAccountOnboardingFragmentKey[] newArray(int i) {
            return new GeneralAccountOnboardingFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneralAccountOnboardingFragmentKey() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GeneralAccountOnboardingFragmentKey copy$default(GeneralAccountOnboardingFragmentKey generalAccountOnboardingFragmentKey, ManagementType managementType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            managementType = generalAccountOnboardingFragmentKey.managementType;
        }
        if ((i & 2) != 0) {
            str = generalAccountOnboardingFragmentKey.source;
        }
        return generalAccountOnboardingFragmentKey.copy(managementType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final GeneralAccountOnboardingFragmentKey copy(ManagementType managementType, String source) {
        return new GeneralAccountOnboardingFragmentKey(managementType, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneralAccountOnboardingFragmentKey)) {
            return false;
        }
        GeneralAccountOnboardingFragmentKey generalAccountOnboardingFragmentKey = (GeneralAccountOnboardingFragmentKey) other;
        return this.managementType == generalAccountOnboardingFragmentKey.managementType && Intrinsics.areEqual(this.source, generalAccountOnboardingFragmentKey.source);
    }

    public int hashCode() {
        ManagementType managementType = this.managementType;
        int iHashCode = (managementType == null ? 0 : managementType.hashCode()) * 31;
        String str = this.source;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GeneralAccountOnboardingFragmentKey(managementType=" + this.managementType + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ManagementType managementType = this.managementType;
        if (managementType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(managementType.name());
        }
        dest.writeString(this.source);
    }

    public GeneralAccountOnboardingFragmentKey(ManagementType managementType, String str) {
        this.managementType = managementType;
        this.source = str;
    }

    public /* synthetic */ GeneralAccountOnboardingFragmentKey(ManagementType managementType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : managementType, (i & 2) != 0 ? null : str);
    }

    public final ManagementType getManagementType() {
        return this.managementType;
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
