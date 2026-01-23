package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccountSelectionResult.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionResult;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "Source", "Sink", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionResult$Sink;", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionResult$Source;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TransferAccountSelectionResult implements Parcelable, NavigationActivityResultContract2 {
    private final int resultCode;

    public /* synthetic */ TransferAccountSelectionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransferAccountSelectionResult() {
        this.resultCode = -1;
    }

    @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
    public int getResultCode() {
        return this.resultCode;
    }

    /* compiled from: TransferAccountSelectionResult.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionResult$Source;", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionResult;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraDistributionInfo", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getIraDistributionInfo", "()Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Source extends TransferAccountSelectionResult {
        public static final Parcelable.Creator<Source> CREATOR = new Creator();
        private final TransferAccount account;
        private final IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo;

        /* compiled from: TransferAccountSelectionResult.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Source> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Source createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Source((TransferAccount) parcel.readParcelable(Source.class.getClassLoader()), parcel.readInt() == 0 ? null : IraDistributionQuestionnaireResult.IraDistribution.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Source[] newArray(int i) {
                return new Source[i];
            }
        }

        public static /* synthetic */ Source copy$default(Source source, TransferAccount transferAccount, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = source.account;
            }
            if ((i & 2) != 0) {
                iraDistribution = source.iraDistributionInfo;
            }
            return source.copy(transferAccount, iraDistribution);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final IraDistributionQuestionnaireResult.IraDistribution getIraDistributionInfo() {
            return this.iraDistributionInfo;
        }

        public final Source copy(TransferAccount account, IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo) {
            return new Source(account, iraDistributionInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Source)) {
                return false;
            }
            Source source = (Source) other;
            return Intrinsics.areEqual(this.account, source.account) && Intrinsics.areEqual(this.iraDistributionInfo, source.iraDistributionInfo);
        }

        public int hashCode() {
            TransferAccount transferAccount = this.account;
            int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
            IraDistributionQuestionnaireResult.IraDistribution iraDistribution = this.iraDistributionInfo;
            return iHashCode + (iraDistribution != null ? iraDistribution.hashCode() : 0);
        }

        public String toString() {
            return "Source(account=" + this.account + ", iraDistributionInfo=" + this.iraDistributionInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.account, flags);
            IraDistributionQuestionnaireResult.IraDistribution iraDistribution = this.iraDistributionInfo;
            if (iraDistribution == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                iraDistribution.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Source(TransferAccount transferAccount, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(transferAccount, (i & 2) != 0 ? null : iraDistribution);
        }

        public final TransferAccount getAccount() {
            return this.account;
        }

        public final IraDistributionQuestionnaireResult.IraDistribution getIraDistributionInfo() {
            return this.iraDistributionInfo;
        }

        public Source(TransferAccount transferAccount, IraDistributionQuestionnaireResult.IraDistribution iraDistribution) {
            super(null);
            this.account = transferAccount;
            this.iraDistributionInfo = iraDistribution;
        }
    }

    /* compiled from: TransferAccountSelectionResult.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionResult$Sink;", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionResult;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getIraContributionInfo", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sink extends TransferAccountSelectionResult {
        public static final Parcelable.Creator<Sink> CREATOR = new Creator();
        private final TransferAccount account;
        private final IraContributionQuestionnaireResult.IraContribution iraContributionInfo;

        /* compiled from: TransferAccountSelectionResult.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Sink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sink((TransferAccount) parcel.readParcelable(Sink.class.getClassLoader()), (IraContributionQuestionnaireResult.IraContribution) parcel.readParcelable(Sink.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sink[] newArray(int i) {
                return new Sink[i];
            }
        }

        public static /* synthetic */ Sink copy$default(Sink sink, TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = sink.account;
            }
            if ((i & 2) != 0) {
                iraContribution = sink.iraContributionInfo;
            }
            return sink.copy(transferAccount, iraContribution);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final IraContributionQuestionnaireResult.IraContribution getIraContributionInfo() {
            return this.iraContributionInfo;
        }

        public final Sink copy(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo) {
            return new Sink(account, iraContributionInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sink)) {
                return false;
            }
            Sink sink = (Sink) other;
            return Intrinsics.areEqual(this.account, sink.account) && Intrinsics.areEqual(this.iraContributionInfo, sink.iraContributionInfo);
        }

        public int hashCode() {
            TransferAccount transferAccount = this.account;
            int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
            IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContributionInfo;
            return iHashCode + (iraContribution != null ? iraContribution.hashCode() : 0);
        }

        public String toString() {
            return "Sink(account=" + this.account + ", iraContributionInfo=" + this.iraContributionInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.account, flags);
            dest.writeParcelable(this.iraContributionInfo, flags);
        }

        public /* synthetic */ Sink(TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(transferAccount, (i & 2) != 0 ? null : iraContribution);
        }

        public final TransferAccount getAccount() {
            return this.account;
        }

        public final IraContributionQuestionnaireResult.IraContribution getIraContributionInfo() {
            return this.iraContributionInfo;
        }

        public Sink(TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution) {
            super(null);
            this.account = transferAccount;
            this.iraContributionInfo = iraContribution;
        }
    }
}
