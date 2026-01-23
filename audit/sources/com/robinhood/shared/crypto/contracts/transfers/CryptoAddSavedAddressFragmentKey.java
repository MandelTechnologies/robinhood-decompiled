package com.robinhood.shared.crypto.contracts.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAddSavedAddressFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/transfers/CryptoAddSavedAddressFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoAddSavedAddressFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<CryptoAddSavedAddressFragmentKey> CREATOR = new Creator();
    private final UUID currencyPairId;

    /* compiled from: CryptoAddSavedAddressFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoAddSavedAddressFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAddSavedAddressFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddSavedAddressFragmentKey((UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAddSavedAddressFragmentKey[] newArray(int i) {
            return new CryptoAddSavedAddressFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoAddSavedAddressFragmentKey copy$default(CryptoAddSavedAddressFragmentKey cryptoAddSavedAddressFragmentKey, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoAddSavedAddressFragmentKey.currencyPairId;
        }
        return cryptoAddSavedAddressFragmentKey.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final CryptoAddSavedAddressFragmentKey copy(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return new CryptoAddSavedAddressFragmentKey(currencyPairId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoAddSavedAddressFragmentKey) && Intrinsics.areEqual(this.currencyPairId, ((CryptoAddSavedAddressFragmentKey) other).currencyPairId);
    }

    public int hashCode() {
        return this.currencyPairId.hashCode();
    }

    public String toString() {
        return "CryptoAddSavedAddressFragmentKey(currencyPairId=" + this.currencyPairId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
    }

    public CryptoAddSavedAddressFragmentKey(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        this.currencyPairId = currencyPairId;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }
}
