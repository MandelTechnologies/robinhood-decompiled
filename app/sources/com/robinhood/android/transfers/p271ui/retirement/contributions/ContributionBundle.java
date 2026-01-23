package com.robinhood.android.transfers.p271ui.retirement.contributions;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.TransferData;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContributionDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "Landroid/os/Parcelable;", "transferRequest", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "transferData", "Lcom/robinhood/android/transfers/ui/max/TransferData;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "refId", "Ljava/util/UUID;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "<init>", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lcom/robinhood/android/transfers/ui/max/TransferData;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;Ljava/util/UUID;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getTransferRequest", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "getTransferData", "()Lcom/robinhood/android/transfers/ui/max/TransferData;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "getRefId", "()Ljava/util/UUID;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContributionBundle implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContributionBundle> CREATOR = new Creator();
    private final MAXTransferContext loggingContext;
    private final UUID refId;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;
    private final TransferData transferData;
    private final ApiCreateTransferRequest transferRequest;

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ContributionBundle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContributionBundle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContributionBundle((ApiCreateTransferRequest) parcel.readParcelable(ContributionBundle.class.getClassLoader()), TransferData.CREATOR.createFromParcel(parcel), (MAXTransferContext) parcel.readSerializable(), (UUID) parcel.readSerializable(), (TransferAccount) parcel.readParcelable(ContributionBundle.class.getClassLoader()), (TransferAccount) parcel.readParcelable(ContributionBundle.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContributionBundle[] newArray(int i) {
            return new ContributionBundle[i];
        }
    }

    public static /* synthetic */ ContributionBundle copy$default(ContributionBundle contributionBundle, ApiCreateTransferRequest apiCreateTransferRequest, TransferData transferData, MAXTransferContext mAXTransferContext, UUID uuid, TransferAccount transferAccount, TransferAccount transferAccount2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiCreateTransferRequest = contributionBundle.transferRequest;
        }
        if ((i & 2) != 0) {
            transferData = contributionBundle.transferData;
        }
        if ((i & 4) != 0) {
            mAXTransferContext = contributionBundle.loggingContext;
        }
        if ((i & 8) != 0) {
            uuid = contributionBundle.refId;
        }
        if ((i & 16) != 0) {
            transferAccount = contributionBundle.sourceAccount;
        }
        if ((i & 32) != 0) {
            transferAccount2 = contributionBundle.sinkAccount;
        }
        TransferAccount transferAccount3 = transferAccount;
        TransferAccount transferAccount4 = transferAccount2;
        return contributionBundle.copy(apiCreateTransferRequest, transferData, mAXTransferContext, uuid, transferAccount3, transferAccount4);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiCreateTransferRequest getTransferRequest() {
        return this.transferRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferData getTransferData() {
        return this.transferData;
    }

    /* renamed from: component3, reason: from getter */
    public final MAXTransferContext getLoggingContext() {
        return this.loggingContext;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component5, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final ContributionBundle copy(ApiCreateTransferRequest transferRequest, TransferData transferData, MAXTransferContext loggingContext, UUID refId, TransferAccount sourceAccount, TransferAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(transferRequest, "transferRequest");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        return new ContributionBundle(transferRequest, transferData, loggingContext, refId, sourceAccount, sinkAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionBundle)) {
            return false;
        }
        ContributionBundle contributionBundle = (ContributionBundle) other;
        return Intrinsics.areEqual(this.transferRequest, contributionBundle.transferRequest) && Intrinsics.areEqual(this.transferData, contributionBundle.transferData) && Intrinsics.areEqual(this.loggingContext, contributionBundle.loggingContext) && Intrinsics.areEqual(this.refId, contributionBundle.refId) && Intrinsics.areEqual(this.sourceAccount, contributionBundle.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, contributionBundle.sinkAccount);
    }

    public int hashCode() {
        return (((((((((this.transferRequest.hashCode() * 31) + this.transferData.hashCode()) * 31) + this.loggingContext.hashCode()) * 31) + this.refId.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + this.sinkAccount.hashCode();
    }

    public String toString() {
        return "ContributionBundle(transferRequest=" + this.transferRequest + ", transferData=" + this.transferData + ", loggingContext=" + this.loggingContext + ", refId=" + this.refId + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.transferRequest, flags);
        this.transferData.writeToParcel(dest, flags);
        dest.writeSerializable(this.loggingContext);
        dest.writeSerializable(this.refId);
        dest.writeParcelable(this.sourceAccount, flags);
        dest.writeParcelable(this.sinkAccount, flags);
    }

    public ContributionBundle(ApiCreateTransferRequest transferRequest, TransferData transferData, MAXTransferContext loggingContext, UUID refId, TransferAccount sourceAccount, TransferAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(transferRequest, "transferRequest");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        this.transferRequest = transferRequest;
        this.transferData = transferData;
        this.loggingContext = loggingContext;
        this.refId = refId;
        this.sourceAccount = sourceAccount;
        this.sinkAccount = sinkAccount;
    }

    public final ApiCreateTransferRequest getTransferRequest() {
        return this.transferRequest;
    }

    public final TransferData getTransferData() {
        return this.transferData;
    }

    public final MAXTransferContext getLoggingContext() {
        return this.loggingContext;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }
}
