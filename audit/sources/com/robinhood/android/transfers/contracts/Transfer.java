package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Transfer.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/Transfer;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "deepLinkMetadata", "Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "(Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;)V", "getDeepLinkMetadata", "()Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "getTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Transfer implements IntentKey, Parcelable {
    public static final Parcelable.Creator<Transfer> CREATOR = new Creator();
    private final TransfersDeepLinkMetadata deepLinkMetadata;
    private final TransferConfiguration transferConfiguration;

    /* compiled from: Transfer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<Transfer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transfer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Transfer(parcel.readInt() == 0 ? null : TransfersDeepLinkMetadata.CREATOR.createFromParcel(parcel), (TransferConfiguration) parcel.readParcelable(Transfer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transfer[] newArray(int i) {
            return new Transfer[i];
        }
    }

    public static /* synthetic */ Transfer copy$default(Transfer transfer, TransfersDeepLinkMetadata transfersDeepLinkMetadata, TransferConfiguration transferConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            transfersDeepLinkMetadata = transfer.deepLinkMetadata;
        }
        if ((i & 2) != 0) {
            transferConfiguration = transfer.transferConfiguration;
        }
        return transfer.copy(transfersDeepLinkMetadata, transferConfiguration);
    }

    /* renamed from: component1, reason: from getter */
    public final TransfersDeepLinkMetadata getDeepLinkMetadata() {
        return this.deepLinkMetadata;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferConfiguration getTransferConfiguration() {
        return this.transferConfiguration;
    }

    public final Transfer copy(TransfersDeepLinkMetadata deepLinkMetadata, TransferConfiguration transferConfiguration) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        return new Transfer(deepLinkMetadata, transferConfiguration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transfer)) {
            return false;
        }
        Transfer transfer = (Transfer) other;
        return Intrinsics.areEqual(this.deepLinkMetadata, transfer.deepLinkMetadata) && Intrinsics.areEqual(this.transferConfiguration, transfer.transferConfiguration);
    }

    public int hashCode() {
        TransfersDeepLinkMetadata transfersDeepLinkMetadata = this.deepLinkMetadata;
        return ((transfersDeepLinkMetadata == null ? 0 : transfersDeepLinkMetadata.hashCode()) * 31) + this.transferConfiguration.hashCode();
    }

    public String toString() {
        return "Transfer(deepLinkMetadata=" + this.deepLinkMetadata + ", transferConfiguration=" + this.transferConfiguration + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TransfersDeepLinkMetadata transfersDeepLinkMetadata = this.deepLinkMetadata;
        if (transfersDeepLinkMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transfersDeepLinkMetadata.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.transferConfiguration, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public Transfer(TransfersDeepLinkMetadata transfersDeepLinkMetadata, TransferConfiguration transferConfiguration) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        this.deepLinkMetadata = transfersDeepLinkMetadata;
        this.transferConfiguration = transferConfiguration;
    }

    public final TransfersDeepLinkMetadata getDeepLinkMetadata() {
        return this.deepLinkMetadata;
    }

    public final TransferConfiguration getTransferConfiguration() {
        return this.transferConfiguration;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transfer(TransferConfiguration transferConfiguration) {
        this(null, transferConfiguration);
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transfer(TransferContext transferContext) {
        this(null, TransferContexts.toTransferConfiguration(transferContext));
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
    }
}
