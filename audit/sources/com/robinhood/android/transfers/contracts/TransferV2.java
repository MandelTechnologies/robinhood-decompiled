package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferV2.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferV2;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "deepLinkMetadata", "Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;)V", "getDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getDeepLinkMetadata", "()Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TransferV2 implements IntentKey, Parcelable {
    public static final Parcelable.Creator<TransferV2> CREATOR = new Creator();
    private final TransfersDeepLinkMetadata deepLinkMetadata;
    private final TransferDirectionV2 direction;
    private final TransferConfiguration transferConfiguration;

    /* compiled from: TransferV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TransferV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferV2(TransferDirectionV2.valueOf(parcel.readString()), (TransferConfiguration) parcel.readParcelable(TransferV2.class.getClassLoader()), parcel.readInt() == 0 ? null : TransfersDeepLinkMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferV2[] newArray(int i) {
            return new TransferV2[i];
        }
    }

    public static /* synthetic */ TransferV2 copy$default(TransferV2 transferV2, TransferDirectionV2 transferDirectionV2, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata transfersDeepLinkMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            transferDirectionV2 = transferV2.direction;
        }
        if ((i & 2) != 0) {
            transferConfiguration = transferV2.transferConfiguration;
        }
        if ((i & 4) != 0) {
            transfersDeepLinkMetadata = transferV2.deepLinkMetadata;
        }
        return transferV2.copy(transferDirectionV2, transferConfiguration, transfersDeepLinkMetadata);
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

    public final TransferV2 copy(TransferDirectionV2 direction, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata deepLinkMetadata) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        return new TransferV2(direction, transferConfiguration, deepLinkMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferV2)) {
            return false;
        }
        TransferV2 transferV2 = (TransferV2) other;
        return this.direction == transferV2.direction && Intrinsics.areEqual(this.transferConfiguration, transferV2.transferConfiguration) && Intrinsics.areEqual(this.deepLinkMetadata, transferV2.deepLinkMetadata);
    }

    public int hashCode() {
        int iHashCode = ((this.direction.hashCode() * 31) + this.transferConfiguration.hashCode()) * 31;
        TransfersDeepLinkMetadata transfersDeepLinkMetadata = this.deepLinkMetadata;
        return iHashCode + (transfersDeepLinkMetadata == null ? 0 : transfersDeepLinkMetadata.hashCode());
    }

    public String toString() {
        return "TransferV2(direction=" + this.direction + ", transferConfiguration=" + this.transferConfiguration + ", deepLinkMetadata=" + this.deepLinkMetadata + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.direction.name());
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

    public TransferV2(TransferDirectionV2 direction, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata transfersDeepLinkMetadata) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        this.direction = direction;
        this.transferConfiguration = transferConfiguration;
        this.deepLinkMetadata = transfersDeepLinkMetadata;
    }

    public /* synthetic */ TransferV2(TransferDirectionV2 transferDirectionV2, TransferConfiguration transferConfiguration, TransfersDeepLinkMetadata transfersDeepLinkMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferDirectionV2, transferConfiguration, (i & 4) != 0 ? null : transfersDeepLinkMetadata);
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
