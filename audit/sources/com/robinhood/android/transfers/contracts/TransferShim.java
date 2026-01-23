package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferShim.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferShim;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "deepLinkMetadata", "Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;)V", "getDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getDeepLinkMetadata", "()Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TransferShim implements IntentKey, Parcelable {
    public static final Parcelable.Creator<TransferShim> CREATOR = new Creator();
    private final TransfersDeepLinkMetadata deepLinkMetadata;
    private final TransferDirectionV2 direction;
    private final TransferConfiguration transferConfiguration;

    /* compiled from: TransferShim.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TransferShim> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferShim createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferShim(parcel.readInt() == 0 ? null : TransferDirectionV2.valueOf(parcel.readString()), (TransferConfiguration) parcel.readParcelable(TransferShim.class.getClassLoader()), parcel.readInt() != 0 ? TransfersDeepLinkMetadata.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferShim[] newArray(int i) {
            return new TransferShim[i];
        }
    }

    public static /* synthetic */ TransferShim copy$default(TransferShim transferShim, TransferDirectionV2 transferDirectionV2, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata transfersDeepLinkMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            transferDirectionV2 = transferShim.direction;
        }
        if ((i & 2) != 0) {
            transferConfiguration = transferShim.transferConfiguration;
        }
        if ((i & 4) != 0) {
            transfersDeepLinkMetadata = transferShim.deepLinkMetadata;
        }
        return transferShim.copy(transferDirectionV2, transferConfiguration, transfersDeepLinkMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferConfiguration getTransferConfiguration() {
        return this.transferConfiguration;
    }

    /* renamed from: component3, reason: from getter */
    public final TransfersDeepLinkMetadata getDeepLinkMetadata() {
        return this.deepLinkMetadata;
    }

    public final TransferShim copy(TransferDirectionV2 direction, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata deepLinkMetadata) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        return new TransferShim(direction, transferConfiguration, deepLinkMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferShim)) {
            return false;
        }
        TransferShim transferShim = (TransferShim) other;
        return this.direction == transferShim.direction && Intrinsics.areEqual(this.transferConfiguration, transferShim.transferConfiguration) && Intrinsics.areEqual(this.deepLinkMetadata, transferShim.deepLinkMetadata);
    }

    public int hashCode() {
        TransferDirectionV2 transferDirectionV2 = this.direction;
        int iHashCode = (((transferDirectionV2 == null ? 0 : transferDirectionV2.hashCode()) * 31) + this.transferConfiguration.hashCode()) * 31;
        TransfersDeepLinkMetadata transfersDeepLinkMetadata = this.deepLinkMetadata;
        return iHashCode + (transfersDeepLinkMetadata != null ? transfersDeepLinkMetadata.hashCode() : 0);
    }

    public String toString() {
        return "TransferShim(direction=" + this.direction + ", transferConfiguration=" + this.transferConfiguration + ", deepLinkMetadata=" + this.deepLinkMetadata + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TransferDirectionV2 transferDirectionV2 = this.direction;
        if (transferDirectionV2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(transferDirectionV2.name());
        }
        dest.writeParcelable(this.transferConfiguration, flags);
        TransfersDeepLinkMetadata transfersDeepLinkMetadata = this.deepLinkMetadata;
        if (transfersDeepLinkMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transfersDeepLinkMetadata.writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public TransferShim(TransferDirectionV2 transferDirectionV2, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata transfersDeepLinkMetadata) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        this.direction = transferDirectionV2;
        this.transferConfiguration = transferConfiguration;
        this.deepLinkMetadata = transfersDeepLinkMetadata;
    }

    public /* synthetic */ TransferShim(TransferDirectionV2 transferDirectionV2, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata transfersDeepLinkMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transferDirectionV2, transferConfiguration, (i & 4) != 0 ? null : transfersDeepLinkMetadata);
    }

    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    public final TransferConfiguration getTransferConfiguration() {
        return this.transferConfiguration;
    }

    public final TransfersDeepLinkMetadata getDeepLinkMetadata() {
        return this.deepLinkMetadata;
    }
}
