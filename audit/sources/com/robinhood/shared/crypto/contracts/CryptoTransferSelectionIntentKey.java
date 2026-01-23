package com.robinhood.shared.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferSelectionIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "action", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "checkForUpsell", "", "entryPointIdentifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;ZLjava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "getCheckForUpsell", "()Z", "getEntryPointIdentifier", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class CryptoTransferSelectionIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CryptoTransferSelectionIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final CryptoTransferIntentKey.Action action;
    private final boolean checkForUpsell;
    private final String entryPointIdentifier;

    /* compiled from: CryptoTransferIntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CryptoTransferSelectionIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTransferSelectionIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTransferSelectionIntentKey(parcel.readString(), parcel.readInt() == 0 ? null : CryptoTransferIntentKey.Action.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTransferSelectionIntentKey[] newArray(int i) {
            return new CryptoTransferSelectionIntentKey[i];
        }
    }

    public static /* synthetic */ CryptoTransferSelectionIntentKey copy$default(CryptoTransferSelectionIntentKey cryptoTransferSelectionIntentKey, String str, CryptoTransferIntentKey.Action action, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoTransferSelectionIntentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            action = cryptoTransferSelectionIntentKey.action;
        }
        if ((i & 4) != 0) {
            z = cryptoTransferSelectionIntentKey.checkForUpsell;
        }
        if ((i & 8) != 0) {
            str2 = cryptoTransferSelectionIntentKey.entryPointIdentifier;
        }
        return cryptoTransferSelectionIntentKey.copy(str, action, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoTransferIntentKey.Action getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final CryptoTransferSelectionIntentKey copy(String accountNumber, CryptoTransferIntentKey.Action action, boolean checkForUpsell, String entryPointIdentifier) {
        return new CryptoTransferSelectionIntentKey(accountNumber, action, checkForUpsell, entryPointIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSelectionIntentKey)) {
            return false;
        }
        CryptoTransferSelectionIntentKey cryptoTransferSelectionIntentKey = (CryptoTransferSelectionIntentKey) other;
        return Intrinsics.areEqual(this.accountNumber, cryptoTransferSelectionIntentKey.accountNumber) && this.action == cryptoTransferSelectionIntentKey.action && this.checkForUpsell == cryptoTransferSelectionIntentKey.checkForUpsell && Intrinsics.areEqual(this.entryPointIdentifier, cryptoTransferSelectionIntentKey.entryPointIdentifier);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CryptoTransferIntentKey.Action action = this.action;
        int iHashCode2 = (((iHashCode + (action == null ? 0 : action.hashCode())) * 31) + Boolean.hashCode(this.checkForUpsell)) * 31;
        String str2 = this.entryPointIdentifier;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTransferSelectionIntentKey(accountNumber=" + this.accountNumber + ", action=" + this.action + ", checkForUpsell=" + this.checkForUpsell + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        CryptoTransferIntentKey.Action action = this.action;
        if (action == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(action.name());
        }
        dest.writeInt(this.checkForUpsell ? 1 : 0);
        dest.writeString(this.entryPointIdentifier);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CryptoTransferSelectionIntentKey(String str, CryptoTransferIntentKey.Action action, boolean z, String str2) {
        this.accountNumber = str;
        this.action = action;
        this.checkForUpsell = z;
        this.entryPointIdentifier = str2;
    }

    public /* synthetic */ CryptoTransferSelectionIntentKey(String str, CryptoTransferIntentKey.Action action, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, action, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str2);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final CryptoTransferIntentKey.Action getAction() {
        return this.action;
    }

    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }
}
