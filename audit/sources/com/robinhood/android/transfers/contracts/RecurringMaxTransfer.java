package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.ApiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringMaxTransfers.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/RecurringMaxTransfer;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "to", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "<init>", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;)V", "getFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getTo", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringMaxTransfer implements IntentKey, Parcelable {
    public static final Parcelable.Creator<RecurringMaxTransfer> CREATOR = new Creator();
    private final ApiAutomaticDeposit.Frequency frequency;
    private final TransferConfiguration.TransferAccountSelection to;

    /* compiled from: RecurringMaxTransfers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringMaxTransfer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringMaxTransfer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringMaxTransfer(parcel.readInt() == 0 ? null : ApiAutomaticDeposit.Frequency.valueOf(parcel.readString()), parcel.readInt() != 0 ? TransferConfiguration.TransferAccountSelection.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringMaxTransfer[] newArray(int i) {
            return new RecurringMaxTransfer[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringMaxTransfer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecurringMaxTransfer copy$default(RecurringMaxTransfer recurringMaxTransfer, ApiAutomaticDeposit.Frequency frequency, TransferConfiguration.TransferAccountSelection transferAccountSelection, int i, Object obj) {
        if ((i & 1) != 0) {
            frequency = recurringMaxTransfer.frequency;
        }
        if ((i & 2) != 0) {
            transferAccountSelection = recurringMaxTransfer.to;
        }
        return recurringMaxTransfer.copy(frequency, transferAccountSelection);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAutomaticDeposit.Frequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferConfiguration.TransferAccountSelection getTo() {
        return this.to;
    }

    public final RecurringMaxTransfer copy(ApiAutomaticDeposit.Frequency frequency, TransferConfiguration.TransferAccountSelection to) {
        return new RecurringMaxTransfer(frequency, to);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringMaxTransfer)) {
            return false;
        }
        RecurringMaxTransfer recurringMaxTransfer = (RecurringMaxTransfer) other;
        return this.frequency == recurringMaxTransfer.frequency && Intrinsics.areEqual(this.to, recurringMaxTransfer.to);
    }

    public int hashCode() {
        ApiAutomaticDeposit.Frequency frequency = this.frequency;
        int iHashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
        TransferConfiguration.TransferAccountSelection transferAccountSelection = this.to;
        return iHashCode + (transferAccountSelection != null ? transferAccountSelection.hashCode() : 0);
    }

    public String toString() {
        return "RecurringMaxTransfer(frequency=" + this.frequency + ", to=" + this.to + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ApiAutomaticDeposit.Frequency frequency = this.frequency;
        if (frequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(frequency.name());
        }
        TransferConfiguration.TransferAccountSelection transferAccountSelection = this.to;
        if (transferAccountSelection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferAccountSelection.writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public RecurringMaxTransfer(ApiAutomaticDeposit.Frequency frequency, TransferConfiguration.TransferAccountSelection transferAccountSelection) {
        this.frequency = frequency;
        this.to = transferAccountSelection;
    }

    public /* synthetic */ RecurringMaxTransfer(ApiAutomaticDeposit.Frequency frequency, TransferConfiguration.TransferAccountSelection transferAccountSelection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : frequency, (i & 2) != 0 ? null : transferAccountSelection);
    }

    public final ApiAutomaticDeposit.Frequency getFrequency() {
        return this.frequency;
    }

    public final TransferConfiguration.TransferAccountSelection getTo() {
        return this.to;
    }
}
