package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkTransfer.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/UkTransfer;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "transferDirection", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "amount", "Ljava/math/BigDecimal;", "sourceAccountId", "", "sinkAccountId", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getTransferDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccountId", "()Ljava/lang/String;", "getSinkAccountId", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkTransfer implements IntentKey, Parcelable {
    public static final Parcelable.Creator<UkTransfer> CREATOR = new Creator();
    private final BigDecimal amount;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final String sinkAccountId;
    private final String sourceAccountId;
    private final TransferDirectionV2 transferDirection;

    /* compiled from: UkTransfer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UkTransfer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UkTransfer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UkTransfer(TransferDirectionV2.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UkTransfer[] newArray(int i) {
            return new UkTransfer[i];
        }
    }

    public static /* synthetic */ UkTransfer copy$default(UkTransfer ukTransfer, TransferDirectionV2 transferDirectionV2, BigDecimal bigDecimal, String str, String str2, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            transferDirectionV2 = ukTransfer.transferDirection;
        }
        if ((i & 2) != 0) {
            bigDecimal = ukTransfer.amount;
        }
        if ((i & 4) != 0) {
            str = ukTransfer.sourceAccountId;
        }
        if ((i & 8) != 0) {
            str2 = ukTransfer.sinkAccountId;
        }
        if ((i & 16) != 0) {
            entryPoint = ukTransfer.entryPoint;
        }
        MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
        String str3 = str;
        return ukTransfer.copy(transferDirectionV2, bigDecimal, str3, str2, entryPoint2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferDirectionV2 getTransferDirection() {
        return this.transferDirection;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSourceAccountId() {
        return this.sourceAccountId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    /* renamed from: component5, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final UkTransfer copy(TransferDirectionV2 transferDirection, BigDecimal amount, String sourceAccountId, String sinkAccountId, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new UkTransfer(transferDirection, amount, sourceAccountId, sinkAccountId, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkTransfer)) {
            return false;
        }
        UkTransfer ukTransfer = (UkTransfer) other;
        return this.transferDirection == ukTransfer.transferDirection && Intrinsics.areEqual(this.amount, ukTransfer.amount) && Intrinsics.areEqual(this.sourceAccountId, ukTransfer.sourceAccountId) && Intrinsics.areEqual(this.sinkAccountId, ukTransfer.sinkAccountId) && this.entryPoint == ukTransfer.entryPoint;
    }

    public int hashCode() {
        int iHashCode = this.transferDirection.hashCode() * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.sourceAccountId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sinkAccountId;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "UkTransfer(transferDirection=" + this.transferDirection + ", amount=" + this.amount + ", sourceAccountId=" + this.sourceAccountId + ", sinkAccountId=" + this.sinkAccountId + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transferDirection.name());
        dest.writeSerializable(this.amount);
        dest.writeString(this.sourceAccountId);
        dest.writeString(this.sinkAccountId);
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public UkTransfer(TransferDirectionV2 transferDirection, BigDecimal bigDecimal, String str, String str2, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.transferDirection = transferDirection;
        this.amount = bigDecimal;
        this.sourceAccountId = str;
        this.sinkAccountId = str2;
        this.entryPoint = entryPoint;
    }

    public final TransferDirectionV2 getTransferDirection() {
        return this.transferDirection;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getSourceAccountId() {
        return this.sourceAccountId;
    }

    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    public /* synthetic */ UkTransfer(TransferDirectionV2 transferDirectionV2, BigDecimal bigDecimal, String str, String str2, MAXTransferContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferDirectionV2, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
