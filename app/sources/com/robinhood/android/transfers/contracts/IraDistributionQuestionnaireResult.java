package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IraDistributionQuestionnaireResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult;", "Landroid/os/Parcelable;", "IraDistribution", "UpdateDistributionType", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$UpdateDistributionType;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface IraDistributionQuestionnaireResult extends Parcelable {

    /* compiled from: IraDistributionQuestionnaireResult.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "distributionType", "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/IraDistributionType;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getDistributionType", "()Lcom/robinhood/models/api/bonfire/IraDistributionType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IraDistribution implements IraDistributionQuestionnaireResult {
        public static final Parcelable.Creator<IraDistribution> CREATOR = new Creator();
        private final IraDistributionType distributionType;
        private final TransferAccount transferAccount;

        /* compiled from: IraDistributionQuestionnaireResult.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IraDistribution> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IraDistribution createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IraDistribution((TransferAccount) parcel.readParcelable(IraDistribution.class.getClassLoader()), IraDistributionType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IraDistribution[] newArray(int i) {
                return new IraDistribution[i];
            }
        }

        public static /* synthetic */ IraDistribution copy$default(IraDistribution iraDistribution, TransferAccount transferAccount, IraDistributionType iraDistributionType, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = iraDistribution.transferAccount;
            }
            if ((i & 2) != 0) {
                iraDistributionType = iraDistribution.distributionType;
            }
            return iraDistribution.copy(transferAccount, iraDistributionType);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final IraDistributionType getDistributionType() {
            return this.distributionType;
        }

        public final IraDistribution copy(TransferAccount transferAccount, IraDistributionType distributionType) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            Intrinsics.checkNotNullParameter(distributionType, "distributionType");
            return new IraDistribution(transferAccount, distributionType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IraDistribution)) {
                return false;
            }
            IraDistribution iraDistribution = (IraDistribution) other;
            return Intrinsics.areEqual(this.transferAccount, iraDistribution.transferAccount) && this.distributionType == iraDistribution.distributionType;
        }

        public int hashCode() {
            return (this.transferAccount.hashCode() * 31) + this.distributionType.hashCode();
        }

        public String toString() {
            return "IraDistribution(transferAccount=" + this.transferAccount + ", distributionType=" + this.distributionType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferAccount, flags);
            dest.writeString(this.distributionType.name());
        }

        public IraDistribution(TransferAccount transferAccount, IraDistributionType distributionType) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            Intrinsics.checkNotNullParameter(distributionType, "distributionType");
            this.transferAccount = transferAccount;
            this.distributionType = distributionType;
        }

        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        public final IraDistributionType getDistributionType() {
            return this.distributionType;
        }
    }

    /* compiled from: IraDistributionQuestionnaireResult.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$UpdateDistributionType;", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult;", "distributionType", "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "<init>", "(Lcom/robinhood/models/api/bonfire/IraDistributionType;)V", "getDistributionType", "()Lcom/robinhood/models/api/bonfire/IraDistributionType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateDistributionType implements IraDistributionQuestionnaireResult {
        public static final Parcelable.Creator<UpdateDistributionType> CREATOR = new Creator();
        private final IraDistributionType distributionType;

        /* compiled from: IraDistributionQuestionnaireResult.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpdateDistributionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateDistributionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateDistributionType(IraDistributionType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateDistributionType[] newArray(int i) {
                return new UpdateDistributionType[i];
            }
        }

        public static /* synthetic */ UpdateDistributionType copy$default(UpdateDistributionType updateDistributionType, IraDistributionType iraDistributionType, int i, Object obj) {
            if ((i & 1) != 0) {
                iraDistributionType = updateDistributionType.distributionType;
            }
            return updateDistributionType.copy(iraDistributionType);
        }

        /* renamed from: component1, reason: from getter */
        public final IraDistributionType getDistributionType() {
            return this.distributionType;
        }

        public final UpdateDistributionType copy(IraDistributionType distributionType) {
            Intrinsics.checkNotNullParameter(distributionType, "distributionType");
            return new UpdateDistributionType(distributionType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateDistributionType) && this.distributionType == ((UpdateDistributionType) other).distributionType;
        }

        public int hashCode() {
            return this.distributionType.hashCode();
        }

        public String toString() {
            return "UpdateDistributionType(distributionType=" + this.distributionType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.distributionType.name());
        }

        public UpdateDistributionType(IraDistributionType distributionType) {
            Intrinsics.checkNotNullParameter(distributionType, "distributionType");
            this.distributionType = distributionType;
        }

        public final IraDistributionType getDistributionType() {
            return this.distributionType;
        }
    }
}
