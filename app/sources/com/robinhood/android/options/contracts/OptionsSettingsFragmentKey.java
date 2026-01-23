package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSettingsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsSettingsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "accountInfo", "Lcom/robinhood/android/options/contracts/OptionsSettingsAccountInfo;", "isFromDeeplink", "", "<init>", "(Lcom/robinhood/android/options/contracts/OptionsSettingsAccountInfo;Z)V", "getAccountInfo", "()Lcom/robinhood/android/options/contracts/OptionsSettingsAccountInfo;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSettingsFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<OptionsSettingsFragmentKey> CREATOR = new Creator();
    private final OptionsSettingsFragmentKey2 accountInfo;
    private final boolean isFromDeeplink;

    /* compiled from: OptionsSettingsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionsSettingsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsSettingsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionsSettingsFragmentKey((OptionsSettingsFragmentKey2) parcel.readParcelable(OptionsSettingsFragmentKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsSettingsFragmentKey[] newArray(int i) {
            return new OptionsSettingsFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionsSettingsFragmentKey copy$default(OptionsSettingsFragmentKey optionsSettingsFragmentKey, OptionsSettingsFragmentKey2 optionsSettingsFragmentKey2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsSettingsFragmentKey2 = optionsSettingsFragmentKey.accountInfo;
        }
        if ((i & 2) != 0) {
            z = optionsSettingsFragmentKey.isFromDeeplink;
        }
        return optionsSettingsFragmentKey.copy(optionsSettingsFragmentKey2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsSettingsFragmentKey2 getAccountInfo() {
        return this.accountInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFromDeeplink() {
        return this.isFromDeeplink;
    }

    public final OptionsSettingsFragmentKey copy(OptionsSettingsFragmentKey2 accountInfo, boolean isFromDeeplink) {
        return new OptionsSettingsFragmentKey(accountInfo, isFromDeeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSettingsFragmentKey)) {
            return false;
        }
        OptionsSettingsFragmentKey optionsSettingsFragmentKey = (OptionsSettingsFragmentKey) other;
        return Intrinsics.areEqual(this.accountInfo, optionsSettingsFragmentKey.accountInfo) && this.isFromDeeplink == optionsSettingsFragmentKey.isFromDeeplink;
    }

    public int hashCode() {
        OptionsSettingsFragmentKey2 optionsSettingsFragmentKey2 = this.accountInfo;
        return ((optionsSettingsFragmentKey2 == null ? 0 : optionsSettingsFragmentKey2.hashCode()) * 31) + Boolean.hashCode(this.isFromDeeplink);
    }

    public String toString() {
        return "OptionsSettingsFragmentKey(accountInfo=" + this.accountInfo + ", isFromDeeplink=" + this.isFromDeeplink + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.accountInfo, flags);
        dest.writeInt(this.isFromDeeplink ? 1 : 0);
    }

    public OptionsSettingsFragmentKey(OptionsSettingsFragmentKey2 optionsSettingsFragmentKey2, boolean z) {
        this.accountInfo = optionsSettingsFragmentKey2;
        this.isFromDeeplink = z;
    }

    public final OptionsSettingsFragmentKey2 getAccountInfo() {
        return this.accountInfo;
    }

    public final boolean isFromDeeplink() {
        return this.isFromDeeplink;
    }
}
