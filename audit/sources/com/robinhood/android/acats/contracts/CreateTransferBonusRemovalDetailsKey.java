package com.robinhood.android.acats.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/CreateTransferBonusRemovalDetailsKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "clawbackId", "", "accountNumber", "transferAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getClawbackId", "()Ljava/lang/String;", "getAccountNumber", "getTransferAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/robinhood/android/acats/contracts/CreateTransferBonusRemovalDetailsKey;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class CreateTransferBonusRemovalDetailsKey implements FragmentKey {
    public static final Parcelable.Creator<CreateTransferBonusRemovalDetailsKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String clawbackId;
    private final Double transferAmount;

    /* compiled from: AcatsFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateTransferBonusRemovalDetailsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateTransferBonusRemovalDetailsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateTransferBonusRemovalDetailsKey(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateTransferBonusRemovalDetailsKey[] newArray(int i) {
            return new CreateTransferBonusRemovalDetailsKey[i];
        }
    }

    public static /* synthetic */ CreateTransferBonusRemovalDetailsKey copy$default(CreateTransferBonusRemovalDetailsKey createTransferBonusRemovalDetailsKey, String str, String str2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createTransferBonusRemovalDetailsKey.clawbackId;
        }
        if ((i & 2) != 0) {
            str2 = createTransferBonusRemovalDetailsKey.accountNumber;
        }
        if ((i & 4) != 0) {
            d = createTransferBonusRemovalDetailsKey.transferAmount;
        }
        return createTransferBonusRemovalDetailsKey.copy(str, str2, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClawbackId() {
        return this.clawbackId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getTransferAmount() {
        return this.transferAmount;
    }

    public final CreateTransferBonusRemovalDetailsKey copy(String clawbackId, String accountNumber, Double transferAmount) {
        return new CreateTransferBonusRemovalDetailsKey(clawbackId, accountNumber, transferAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferBonusRemovalDetailsKey)) {
            return false;
        }
        CreateTransferBonusRemovalDetailsKey createTransferBonusRemovalDetailsKey = (CreateTransferBonusRemovalDetailsKey) other;
        return Intrinsics.areEqual(this.clawbackId, createTransferBonusRemovalDetailsKey.clawbackId) && Intrinsics.areEqual(this.accountNumber, createTransferBonusRemovalDetailsKey.accountNumber) && Intrinsics.areEqual((Object) this.transferAmount, (Object) createTransferBonusRemovalDetailsKey.transferAmount);
    }

    public int hashCode() {
        String str = this.clawbackId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.transferAmount;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "CreateTransferBonusRemovalDetailsKey(clawbackId=" + this.clawbackId + ", accountNumber=" + this.accountNumber + ", transferAmount=" + this.transferAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.clawbackId);
        dest.writeString(this.accountNumber);
        Double d = this.transferAmount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
    }

    public CreateTransferBonusRemovalDetailsKey(String str, String str2, Double d) {
        this.clawbackId = str;
        this.accountNumber = str2;
        this.transferAmount = d;
    }

    public final String getClawbackId() {
        return this.clawbackId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Double getTransferAmount() {
        return this.transferAmount;
    }
}
