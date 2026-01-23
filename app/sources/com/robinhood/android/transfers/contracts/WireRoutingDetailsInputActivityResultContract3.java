package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputActivityResultContract.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult;", "Landroid/os/Parcelable;", "Failure", "Success", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Failure;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.contracts.WireRoutingDetailsInputResult, reason: use source file name */
/* loaded from: classes9.dex */
public interface WireRoutingDetailsInputActivityResultContract3 extends Parcelable {

    /* compiled from: WireRoutingDetailsInputActivityResultContract.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Failure;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.contracts.WireRoutingDetailsInputResult$Failure */
    public static final /* data */ class Failure implements WireRoutingDetailsInputActivityResultContract3 {
        public static final Failure INSTANCE = new Failure();
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();

        /* compiled from: WireRoutingDetailsInputActivityResultContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.contracts.WireRoutingDetailsInputResult$Failure$Creator */
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Failure.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Failure);
        }

        public int hashCode() {
            return -1956588997;
        }

        public String toString() {
            return "Failure";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Failure() {
        }
    }

    /* compiled from: WireRoutingDetailsInputActivityResultContract.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "routingNumber", "", "accountNumber", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/lang/String;Ljava/lang/String;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getRoutingNumber", "()Ljava/lang/String;", "getAccountNumber", "isFilled", "", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.contracts.WireRoutingDetailsInputResult$Success, reason: from toString */
    public static final /* data */ class Success implements WireRoutingDetailsInputActivityResultContract3 {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final String accountNumber;
        private final String routingNumber;
        private final TransferAccount transferAccount;

        /* compiled from: WireRoutingDetailsInputActivityResultContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.contracts.WireRoutingDetailsInputResult$Success$Creator */
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((TransferAccount) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public static /* synthetic */ Success copy$default(Success success, TransferAccount transferAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = success.transferAccount;
            }
            if ((i & 2) != 0) {
                str = success.routingNumber;
            }
            if ((i & 4) != 0) {
                str2 = success.accountNumber;
            }
            return success.copy(transferAccount, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Success copy(TransferAccount transferAccount, String routingNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            return new Success(transferAccount, routingNumber, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.transferAccount, success.transferAccount) && Intrinsics.areEqual(this.routingNumber, success.routingNumber) && Intrinsics.areEqual(this.accountNumber, success.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.transferAccount.hashCode() * 31;
            String str = this.routingNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accountNumber;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Success(transferAccount=" + this.transferAccount + ", routingNumber=" + this.routingNumber + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferAccount, flags);
            dest.writeString(this.routingNumber);
            dest.writeString(this.accountNumber);
        }

        public Success(TransferAccount transferAccount, String str, String str2) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            this.transferAccount = transferAccount;
            this.routingNumber = str;
            this.accountNumber = str2;
        }

        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isFilled() {
            return (this.routingNumber == null || this.accountNumber == null) ? false : true;
        }
    }
}
