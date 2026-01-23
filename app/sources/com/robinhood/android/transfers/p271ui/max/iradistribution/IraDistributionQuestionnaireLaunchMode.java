package com.robinhood.android.transfers.p271ui.max.iradistribution;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IraDistributionQuestionnaireLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "Landroid/os/Parcelable;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "FullQuestionnaire", "EditDistributionType", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode$EditDistributionType;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode$FullQuestionnaire;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface IraDistributionQuestionnaireLaunchMode extends Parcelable {
    TransferAccount getTransferAccount();

    /* compiled from: IraDistributionQuestionnaireLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode$FullQuestionnaire;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FullQuestionnaire implements IraDistributionQuestionnaireLaunchMode {
        public static final int $stable = 8;
        public static final Parcelable.Creator<FullQuestionnaire> CREATOR = new Creator();
        private final TransferAccount transferAccount;

        /* compiled from: IraDistributionQuestionnaireLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FullQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullQuestionnaire createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullQuestionnaire((TransferAccount) parcel.readParcelable(FullQuestionnaire.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullQuestionnaire[] newArray(int i) {
                return new FullQuestionnaire[i];
            }
        }

        public static /* synthetic */ FullQuestionnaire copy$default(FullQuestionnaire fullQuestionnaire, TransferAccount transferAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = fullQuestionnaire.transferAccount;
            }
            return fullQuestionnaire.copy(transferAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        public final FullQuestionnaire copy(TransferAccount transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            return new FullQuestionnaire(transferAccount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FullQuestionnaire) && Intrinsics.areEqual(this.transferAccount, ((FullQuestionnaire) other).transferAccount);
        }

        public int hashCode() {
            return this.transferAccount.hashCode();
        }

        public String toString() {
            return "FullQuestionnaire(transferAccount=" + this.transferAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferAccount, flags);
        }

        public FullQuestionnaire(TransferAccount transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            this.transferAccount = transferAccount;
        }

        @Override // com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode
        public TransferAccount getTransferAccount() {
            return this.transferAccount;
        }
    }

    /* compiled from: IraDistributionQuestionnaireLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode$EditDistributionType;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditDistributionType implements IraDistributionQuestionnaireLaunchMode {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EditDistributionType> CREATOR = new Creator();
        private final TransferAccount transferAccount;

        /* compiled from: IraDistributionQuestionnaireLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EditDistributionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditDistributionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditDistributionType((TransferAccount) parcel.readParcelable(EditDistributionType.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditDistributionType[] newArray(int i) {
                return new EditDistributionType[i];
            }
        }

        public static /* synthetic */ EditDistributionType copy$default(EditDistributionType editDistributionType, TransferAccount transferAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = editDistributionType.transferAccount;
            }
            return editDistributionType.copy(transferAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        public final EditDistributionType copy(TransferAccount transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            return new EditDistributionType(transferAccount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditDistributionType) && Intrinsics.areEqual(this.transferAccount, ((EditDistributionType) other).transferAccount);
        }

        public int hashCode() {
            return this.transferAccount.hashCode();
        }

        public String toString() {
            return "EditDistributionType(transferAccount=" + this.transferAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferAccount, flags);
        }

        public EditDistributionType(TransferAccount transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            this.transferAccount = transferAccount;
        }

        @Override // com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode
        public TransferAccount getTransferAccount() {
            return this.transferAccount;
        }
    }
}
