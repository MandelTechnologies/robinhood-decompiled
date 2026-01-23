package com.robinhood.android.investFlow.frequency;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowFrequencyArgs.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyArgs;", "Landroid/os/Parcelable;", "isCrypto", "", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "recurringOnly", "accountNumber", "", "<init>", "(ZLcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;ZLjava/lang/String;)V", "()Z", "getSelectedFrequency", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "getRecurringOnly", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowFrequencyArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowFrequencyArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean isCrypto;
    private final boolean recurringOnly;
    private final InvestFlowFrequency selectedFrequency;

    /* compiled from: InvestFlowFrequencyArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowFrequencyArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowFrequencyArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestFlowFrequencyArgs(parcel.readInt() != 0, (InvestFlowFrequency) parcel.readParcelable(InvestFlowFrequencyArgs.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowFrequencyArgs[] newArray(int i) {
            return new InvestFlowFrequencyArgs[i];
        }
    }

    public static /* synthetic */ InvestFlowFrequencyArgs copy$default(InvestFlowFrequencyArgs investFlowFrequencyArgs, boolean z, InvestFlowFrequency investFlowFrequency, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investFlowFrequencyArgs.isCrypto;
        }
        if ((i & 2) != 0) {
            investFlowFrequency = investFlowFrequencyArgs.selectedFrequency;
        }
        if ((i & 4) != 0) {
            z2 = investFlowFrequencyArgs.recurringOnly;
        }
        if ((i & 8) != 0) {
            str = investFlowFrequencyArgs.accountNumber;
        }
        return investFlowFrequencyArgs.copy(z, investFlowFrequency, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InvestFlowFrequencyArgs copy(boolean isCrypto, InvestFlowFrequency selectedFrequency, boolean recurringOnly, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowFrequencyArgs(isCrypto, selectedFrequency, recurringOnly, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowFrequencyArgs)) {
            return false;
        }
        InvestFlowFrequencyArgs investFlowFrequencyArgs = (InvestFlowFrequencyArgs) other;
        return this.isCrypto == investFlowFrequencyArgs.isCrypto && Intrinsics.areEqual(this.selectedFrequency, investFlowFrequencyArgs.selectedFrequency) && this.recurringOnly == investFlowFrequencyArgs.recurringOnly && Intrinsics.areEqual(this.accountNumber, investFlowFrequencyArgs.accountNumber);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCrypto) * 31;
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        return ((((iHashCode + (investFlowFrequency == null ? 0 : investFlowFrequency.hashCode())) * 31) + Boolean.hashCode(this.recurringOnly)) * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "InvestFlowFrequencyArgs(isCrypto=" + this.isCrypto + ", selectedFrequency=" + this.selectedFrequency + ", recurringOnly=" + this.recurringOnly + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeParcelable(this.selectedFrequency, flags);
        dest.writeInt(this.recurringOnly ? 1 : 0);
        dest.writeString(this.accountNumber);
    }

    public InvestFlowFrequencyArgs(boolean z, InvestFlowFrequency investFlowFrequency, boolean z2, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.isCrypto = z;
        this.selectedFrequency = investFlowFrequency;
        this.recurringOnly = z2;
        this.accountNumber = accountNumber;
    }

    public /* synthetic */ InvestFlowFrequencyArgs(boolean z, InvestFlowFrequency investFlowFrequency, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : investFlowFrequency, (i & 4) != 0 ? false : z2, str);
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
