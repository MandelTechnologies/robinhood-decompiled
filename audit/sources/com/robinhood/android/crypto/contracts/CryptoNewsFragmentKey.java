package com.robinhood.android.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoNewsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoNewsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoNewsFragmentKey implements FragmentKey, TabFragmentKey {
    public static final CryptoNewsFragmentKey INSTANCE = new CryptoNewsFragmentKey();
    public static final Parcelable.Creator<CryptoNewsFragmentKey> CREATOR = new Creator();

    /* compiled from: CryptoNewsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CryptoNewsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoNewsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoNewsFragmentKey.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoNewsFragmentKey[] newArray(int i) {
            return new CryptoNewsFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private CryptoNewsFragmentKey() {
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.CRYPTO;
    }
}
