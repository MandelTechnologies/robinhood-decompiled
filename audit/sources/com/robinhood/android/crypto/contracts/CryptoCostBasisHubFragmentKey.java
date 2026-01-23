package com.robinhood.android.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisHubFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoCostBasisHubFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "currencyPairId", "Ljava/util/UUID;", "accountId", "entryPointIdentifier", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getAccountId", "getEntryPointIdentifier", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisHubFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<CryptoCostBasisHubFragmentKey> CREATOR = new Creator();
    private final UUID accountId;
    private final UUID currencyPairId;
    private final String entryPointIdentifier;

    /* compiled from: CryptoCostBasisHubFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoCostBasisHubFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCostBasisHubFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCostBasisHubFragmentKey((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCostBasisHubFragmentKey[] newArray(int i) {
            return new CryptoCostBasisHubFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoCostBasisHubFragmentKey copy$default(CryptoCostBasisHubFragmentKey cryptoCostBasisHubFragmentKey, UUID uuid, UUID uuid2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoCostBasisHubFragmentKey.currencyPairId;
        }
        if ((i & 2) != 0) {
            uuid2 = cryptoCostBasisHubFragmentKey.accountId;
        }
        if ((i & 4) != 0) {
            str = cryptoCostBasisHubFragmentKey.entryPointIdentifier;
        }
        return cryptoCostBasisHubFragmentKey.copy(uuid, uuid2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getAccountId() {
        return this.accountId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final CryptoCostBasisHubFragmentKey copy(UUID currencyPairId, UUID accountId, String entryPointIdentifier) {
        return new CryptoCostBasisHubFragmentKey(currencyPairId, accountId, entryPointIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisHubFragmentKey)) {
            return false;
        }
        CryptoCostBasisHubFragmentKey cryptoCostBasisHubFragmentKey = (CryptoCostBasisHubFragmentKey) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoCostBasisHubFragmentKey.currencyPairId) && Intrinsics.areEqual(this.accountId, cryptoCostBasisHubFragmentKey.accountId) && Intrinsics.areEqual(this.entryPointIdentifier, cryptoCostBasisHubFragmentKey.entryPointIdentifier);
    }

    public int hashCode() {
        UUID uuid = this.currencyPairId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UUID uuid2 = this.accountId;
        int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str = this.entryPointIdentifier;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoCostBasisHubFragmentKey(currencyPairId=" + this.currencyPairId + ", accountId=" + this.accountId + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
        dest.writeSerializable(this.accountId);
        dest.writeString(this.entryPointIdentifier);
    }

    public CryptoCostBasisHubFragmentKey(UUID uuid, UUID uuid2, String str) {
        this.currencyPairId = uuid;
        this.accountId = uuid2;
        this.entryPointIdentifier = str;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final UUID getAccountId() {
        return this.accountId;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.CURRENT_TAB;
    }
}
