package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositsListKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/RecurringDepositsListKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "accountNumber", "", "to", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;)V", "getAccountNumber", "()Ljava/lang/String;", "getTo", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RecurringDepositsListKey implements TabFragmentKey {
    public static final Parcelable.Creator<RecurringDepositsListKey> CREATOR = new Creator();
    private final String accountNumber;
    private final TransferConfiguration.TransferAccountSelection to;

    /* compiled from: RecurringDepositsListKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<RecurringDepositsListKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringDepositsListKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringDepositsListKey(parcel.readString(), parcel.readInt() == 0 ? null : TransferConfiguration.TransferAccountSelection.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringDepositsListKey[] newArray(int i) {
            return new RecurringDepositsListKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositsListKey() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecurringDepositsListKey copy$default(RecurringDepositsListKey recurringDepositsListKey, String str, TransferConfiguration.TransferAccountSelection transferAccountSelection, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringDepositsListKey.accountNumber;
        }
        if ((i & 2) != 0) {
            transferAccountSelection = recurringDepositsListKey.to;
        }
        return recurringDepositsListKey.copy(str, transferAccountSelection);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferConfiguration.TransferAccountSelection getTo() {
        return this.to;
    }

    public final RecurringDepositsListKey copy(String accountNumber, TransferConfiguration.TransferAccountSelection to) {
        return new RecurringDepositsListKey(accountNumber, to);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDepositsListKey)) {
            return false;
        }
        RecurringDepositsListKey recurringDepositsListKey = (RecurringDepositsListKey) other;
        return Intrinsics.areEqual(this.accountNumber, recurringDepositsListKey.accountNumber) && Intrinsics.areEqual(this.to, recurringDepositsListKey.to);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TransferConfiguration.TransferAccountSelection transferAccountSelection = this.to;
        return iHashCode + (transferAccountSelection != null ? transferAccountSelection.hashCode() : 0);
    }

    public String toString() {
        return "RecurringDepositsListKey(accountNumber=" + this.accountNumber + ", to=" + this.to + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        TransferConfiguration.TransferAccountSelection transferAccountSelection = this.to;
        if (transferAccountSelection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferAccountSelection.writeToParcel(dest, flags);
        }
    }

    public RecurringDepositsListKey(String str, TransferConfiguration.TransferAccountSelection transferAccountSelection) {
        this.accountNumber = str;
        this.to = transferAccountSelection;
    }

    public /* synthetic */ RecurringDepositsListKey(String str, TransferConfiguration.TransferAccountSelection transferAccountSelection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : transferAccountSelection);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final TransferConfiguration.TransferAccountSelection getTo() {
        return this.to;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
