package com.robinhood.android.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisDetailsIntentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoCostBasisDetailsIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "depositId", "Ljava/util/UUID;", "accountId", "entryPointIdentifier", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "getDepositId", "()Ljava/util/UUID;", "getAccountId", "getEntryPointIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisDetailsIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CryptoCostBasisDetailsIntentKey> CREATOR = new Creator();
    private final UUID accountId;
    private final UUID depositId;
    private final String entryPointIdentifier;

    /* compiled from: CryptoCostBasisDetailsIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoCostBasisDetailsIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCostBasisDetailsIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCostBasisDetailsIntentKey((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCostBasisDetailsIntentKey[] newArray(int i) {
            return new CryptoCostBasisDetailsIntentKey[i];
        }
    }

    public static /* synthetic */ CryptoCostBasisDetailsIntentKey copy$default(CryptoCostBasisDetailsIntentKey cryptoCostBasisDetailsIntentKey, UUID uuid, UUID uuid2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoCostBasisDetailsIntentKey.depositId;
        }
        if ((i & 2) != 0) {
            uuid2 = cryptoCostBasisDetailsIntentKey.accountId;
        }
        if ((i & 4) != 0) {
            str = cryptoCostBasisDetailsIntentKey.entryPointIdentifier;
        }
        return cryptoCostBasisDetailsIntentKey.copy(uuid, uuid2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getDepositId() {
        return this.depositId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getAccountId() {
        return this.accountId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final CryptoCostBasisDetailsIntentKey copy(UUID depositId, UUID accountId, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(depositId, "depositId");
        return new CryptoCostBasisDetailsIntentKey(depositId, accountId, entryPointIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisDetailsIntentKey)) {
            return false;
        }
        CryptoCostBasisDetailsIntentKey cryptoCostBasisDetailsIntentKey = (CryptoCostBasisDetailsIntentKey) other;
        return Intrinsics.areEqual(this.depositId, cryptoCostBasisDetailsIntentKey.depositId) && Intrinsics.areEqual(this.accountId, cryptoCostBasisDetailsIntentKey.accountId) && Intrinsics.areEqual(this.entryPointIdentifier, cryptoCostBasisDetailsIntentKey.entryPointIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.depositId.hashCode() * 31;
        UUID uuid = this.accountId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.entryPointIdentifier;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoCostBasisDetailsIntentKey(depositId=" + this.depositId + ", accountId=" + this.accountId + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.depositId);
        dest.writeSerializable(this.accountId);
        dest.writeString(this.entryPointIdentifier);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CryptoCostBasisDetailsIntentKey(UUID depositId, UUID uuid, String str) {
        Intrinsics.checkNotNullParameter(depositId, "depositId");
        this.depositId = depositId;
        this.accountId = uuid;
        this.entryPointIdentifier = str;
    }

    public final UUID getDepositId() {
        return this.depositId;
    }

    public final UUID getAccountId() {
        return this.accountId;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }
}
