package com.robinhood.android.recurring.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDialogFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/RecurringInvestmentsInfo;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "hasCrypto", "", "<init>", "(Z)V", "getHasCrypto", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecurringInvestmentsInfo implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<RecurringInvestmentsInfo> CREATOR = new Creator();
    private final boolean hasCrypto;

    /* compiled from: RecurringDialogFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<RecurringInvestmentsInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringInvestmentsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringInvestmentsInfo(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringInvestmentsInfo[] newArray(int i) {
            return new RecurringInvestmentsInfo[i];
        }
    }

    public static /* synthetic */ RecurringInvestmentsInfo copy$default(RecurringInvestmentsInfo recurringInvestmentsInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recurringInvestmentsInfo.hasCrypto;
        }
        return recurringInvestmentsInfo.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasCrypto() {
        return this.hasCrypto;
    }

    public final RecurringInvestmentsInfo copy(boolean hasCrypto) {
        return new RecurringInvestmentsInfo(hasCrypto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecurringInvestmentsInfo) && this.hasCrypto == ((RecurringInvestmentsInfo) other).hasCrypto;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasCrypto);
    }

    public String toString() {
        return "RecurringInvestmentsInfo(hasCrypto=" + this.hasCrypto + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hasCrypto ? 1 : 0);
    }

    public RecurringInvestmentsInfo(boolean z) {
        this.hasCrypto = z;
    }

    public final boolean getHasCrypto() {
        return this.hasCrypto;
    }
}
