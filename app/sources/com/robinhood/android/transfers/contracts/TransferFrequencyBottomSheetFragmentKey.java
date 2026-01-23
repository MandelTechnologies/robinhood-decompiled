package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFrequencyBottomSheetFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "disableOnceOption", "", "selectedFrequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(ZLcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getDisableOnceOption", "()Z", "getSelectedFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TransferFrequencyBottomSheetFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<TransferFrequencyBottomSheetFragmentKey> CREATOR = new Creator();
    private final boolean disableOnceOption;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final ApiCreateTransferRequest2 selectedFrequency;

    /* compiled from: TransferFrequencyBottomSheetFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TransferFrequencyBottomSheetFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferFrequencyBottomSheetFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferFrequencyBottomSheetFragmentKey(parcel.readInt() != 0, ApiCreateTransferRequest2.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferFrequencyBottomSheetFragmentKey[] newArray(int i) {
            return new TransferFrequencyBottomSheetFragmentKey[i];
        }
    }

    public static /* synthetic */ TransferFrequencyBottomSheetFragmentKey copy$default(TransferFrequencyBottomSheetFragmentKey transferFrequencyBottomSheetFragmentKey, boolean z, ApiCreateTransferRequest2 apiCreateTransferRequest2, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transferFrequencyBottomSheetFragmentKey.disableOnceOption;
        }
        if ((i & 2) != 0) {
            apiCreateTransferRequest2 = transferFrequencyBottomSheetFragmentKey.selectedFrequency;
        }
        if ((i & 4) != 0) {
            entryPoint = transferFrequencyBottomSheetFragmentKey.entryPoint;
        }
        return transferFrequencyBottomSheetFragmentKey.copy(z, apiCreateTransferRequest2, entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDisableOnceOption() {
        return this.disableOnceOption;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiCreateTransferRequest2 getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component3, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final TransferFrequencyBottomSheetFragmentKey copy(boolean disableOnceOption, ApiCreateTransferRequest2 selectedFrequency, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        return new TransferFrequencyBottomSheetFragmentKey(disableOnceOption, selectedFrequency, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferFrequencyBottomSheetFragmentKey)) {
            return false;
        }
        TransferFrequencyBottomSheetFragmentKey transferFrequencyBottomSheetFragmentKey = (TransferFrequencyBottomSheetFragmentKey) other;
        return this.disableOnceOption == transferFrequencyBottomSheetFragmentKey.disableOnceOption && this.selectedFrequency == transferFrequencyBottomSheetFragmentKey.selectedFrequency && this.entryPoint == transferFrequencyBottomSheetFragmentKey.entryPoint;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.disableOnceOption) * 31) + this.selectedFrequency.hashCode()) * 31;
        MAXTransferContext.EntryPoint entryPoint = this.entryPoint;
        return iHashCode + (entryPoint == null ? 0 : entryPoint.hashCode());
    }

    public String toString() {
        return "TransferFrequencyBottomSheetFragmentKey(disableOnceOption=" + this.disableOnceOption + ", selectedFrequency=" + this.selectedFrequency + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.disableOnceOption ? 1 : 0);
        dest.writeString(this.selectedFrequency.name());
        MAXTransferContext.EntryPoint entryPoint = this.entryPoint;
        if (entryPoint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(entryPoint.name());
        }
    }

    public TransferFrequencyBottomSheetFragmentKey(boolean z, ApiCreateTransferRequest2 selectedFrequency, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        this.disableOnceOption = z;
        this.selectedFrequency = selectedFrequency;
        this.entryPoint = entryPoint;
    }

    public /* synthetic */ TransferFrequencyBottomSheetFragmentKey(boolean z, ApiCreateTransferRequest2 apiCreateTransferRequest2, MAXTransferContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, apiCreateTransferRequest2, (i & 4) != 0 ? null : entryPoint);
    }

    public final boolean getDisableOnceOption() {
        return this.disableOnceOption;
    }

    public final ApiCreateTransferRequest2 getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
