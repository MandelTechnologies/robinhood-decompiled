package com.robinhood.android.investFlow.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderConfirmationArgs.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "loggingParams", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;)V", "getAccountNumber", "()Ljava/lang/String;", "getLoggingParams", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowOrderConfirmationArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFlowOrderConfirmationArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final InvestFlowLoggingParams loggingParams;

    /* compiled from: InvestFlowOrderConfirmationArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowOrderConfirmationArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowOrderConfirmationArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestFlowOrderConfirmationArgs(parcel.readString(), (InvestFlowLoggingParams) parcel.readParcelable(InvestFlowOrderConfirmationArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowOrderConfirmationArgs[] newArray(int i) {
            return new InvestFlowOrderConfirmationArgs[i];
        }
    }

    public static /* synthetic */ InvestFlowOrderConfirmationArgs copy$default(InvestFlowOrderConfirmationArgs investFlowOrderConfirmationArgs, String str, InvestFlowLoggingParams investFlowLoggingParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investFlowOrderConfirmationArgs.accountNumber;
        }
        if ((i & 2) != 0) {
            investFlowLoggingParams = investFlowOrderConfirmationArgs.loggingParams;
        }
        return investFlowOrderConfirmationArgs.copy(str, investFlowLoggingParams);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final InvestFlowOrderConfirmationArgs copy(String accountNumber, InvestFlowLoggingParams loggingParams) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        return new InvestFlowOrderConfirmationArgs(accountNumber, loggingParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowOrderConfirmationArgs)) {
            return false;
        }
        InvestFlowOrderConfirmationArgs investFlowOrderConfirmationArgs = (InvestFlowOrderConfirmationArgs) other;
        return Intrinsics.areEqual(this.accountNumber, investFlowOrderConfirmationArgs.accountNumber) && Intrinsics.areEqual(this.loggingParams, investFlowOrderConfirmationArgs.loggingParams);
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + this.loggingParams.hashCode();
    }

    public String toString() {
        return "InvestFlowOrderConfirmationArgs(accountNumber=" + this.accountNumber + ", loggingParams=" + this.loggingParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeParcelable(this.loggingParams, flags);
    }

    public InvestFlowOrderConfirmationArgs(String accountNumber, InvestFlowLoggingParams loggingParams) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        this.accountNumber = accountNumber;
        this.loggingParams = loggingParams;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }
}
