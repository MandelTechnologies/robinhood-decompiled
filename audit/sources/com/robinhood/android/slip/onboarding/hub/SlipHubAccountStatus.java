package com.robinhood.android.slip.onboarding.hub;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipHubAccountStatus.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubAccountStatus;", "Landroid/os/Parcelable;", "accountName", "", "accountNumber", "isEnabled", "", "isLoading", "enableDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "getAccountNumber", "()Z", "getEnableDeeplink", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipHubAccountStatus implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SlipHubAccountStatus> CREATOR = new Creator();
    private final String accountName;
    private final String accountNumber;
    private final String enableDeeplink;
    private final boolean isEnabled;
    private final boolean isLoading;

    /* compiled from: SlipHubAccountStatus.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SlipHubAccountStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlipHubAccountStatus createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new SlipHubAccountStatus(string2, string3, z2, parcel.readInt() == 0 ? z : true, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlipHubAccountStatus[] newArray(int i) {
            return new SlipHubAccountStatus[i];
        }
    }

    public static /* synthetic */ SlipHubAccountStatus copy$default(SlipHubAccountStatus slipHubAccountStatus, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slipHubAccountStatus.accountName;
        }
        if ((i & 2) != 0) {
            str2 = slipHubAccountStatus.accountNumber;
        }
        if ((i & 4) != 0) {
            z = slipHubAccountStatus.isEnabled;
        }
        if ((i & 8) != 0) {
            z2 = slipHubAccountStatus.isLoading;
        }
        if ((i & 16) != 0) {
            str3 = slipHubAccountStatus.enableDeeplink;
        }
        String str4 = str3;
        boolean z3 = z;
        return slipHubAccountStatus.copy(str, str2, z3, z2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEnableDeeplink() {
        return this.enableDeeplink;
    }

    public final SlipHubAccountStatus copy(String accountName, String accountNumber, boolean isEnabled, boolean isLoading, String enableDeeplink) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new SlipHubAccountStatus(accountName, accountNumber, isEnabled, isLoading, enableDeeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipHubAccountStatus)) {
            return false;
        }
        SlipHubAccountStatus slipHubAccountStatus = (SlipHubAccountStatus) other;
        return Intrinsics.areEqual(this.accountName, slipHubAccountStatus.accountName) && Intrinsics.areEqual(this.accountNumber, slipHubAccountStatus.accountNumber) && this.isEnabled == slipHubAccountStatus.isEnabled && this.isLoading == slipHubAccountStatus.isLoading && Intrinsics.areEqual(this.enableDeeplink, slipHubAccountStatus.enableDeeplink);
    }

    public int hashCode() {
        int iHashCode = ((((((this.accountName.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.enableDeeplink;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SlipHubAccountStatus(accountName=" + this.accountName + ", accountNumber=" + this.accountNumber + ", isEnabled=" + this.isEnabled + ", isLoading=" + this.isLoading + ", enableDeeplink=" + this.enableDeeplink + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountName);
        dest.writeString(this.accountNumber);
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.enableDeeplink);
    }

    public SlipHubAccountStatus(String accountName, String accountNumber, boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.isEnabled = z;
        this.isLoading = z2;
        this.enableDeeplink = str;
    }

    public /* synthetic */ SlipHubAccountStatus(String str, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2, (i & 16) != 0 ? null : str3);
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getEnableDeeplink() {
        return this.enableDeeplink;
    }
}
