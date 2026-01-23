package com.robinhood.android.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityCenterTabFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/SecurityCenterTabFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "launchType", "Lcom/robinhood/android/security/contracts/SecurityCenterLaunchType;", "<init>", "(Lcom/robinhood/android/security/contracts/SecurityCenterLaunchType;)V", "getLaunchType", "()Lcom/robinhood/android/security/contracts/SecurityCenterLaunchType;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class SecurityCenterTabFragmentKey implements TabFragmentKey {
    public static final Parcelable.Creator<SecurityCenterTabFragmentKey> CREATOR = new Creator();
    private final SecurityCenterLaunchType launchType;

    /* compiled from: SecurityCenterTabFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<SecurityCenterTabFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityCenterTabFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecurityCenterTabFragmentKey(SecurityCenterLaunchType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityCenterTabFragmentKey[] newArray(int i) {
            return new SecurityCenterTabFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecurityCenterTabFragmentKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SecurityCenterTabFragmentKey copy$default(SecurityCenterTabFragmentKey securityCenterTabFragmentKey, SecurityCenterLaunchType securityCenterLaunchType, int i, Object obj) {
        if ((i & 1) != 0) {
            securityCenterLaunchType = securityCenterTabFragmentKey.launchType;
        }
        return securityCenterTabFragmentKey.copy(securityCenterLaunchType);
    }

    /* renamed from: component1, reason: from getter */
    public final SecurityCenterLaunchType getLaunchType() {
        return this.launchType;
    }

    public final SecurityCenterTabFragmentKey copy(SecurityCenterLaunchType launchType) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        return new SecurityCenterTabFragmentKey(launchType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SecurityCenterTabFragmentKey) && this.launchType == ((SecurityCenterTabFragmentKey) other).launchType;
    }

    public int hashCode() {
        return this.launchType.hashCode();
    }

    public String toString() {
        return "SecurityCenterTabFragmentKey(launchType=" + this.launchType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.launchType.name());
    }

    public SecurityCenterTabFragmentKey(SecurityCenterLaunchType launchType) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        this.launchType = launchType;
    }

    public /* synthetic */ SecurityCenterTabFragmentKey(SecurityCenterLaunchType securityCenterLaunchType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SecurityCenterLaunchType.DEFAULT : securityCenterLaunchType);
    }

    public final SecurityCenterLaunchType getLaunchType() {
        return this.launchType;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
