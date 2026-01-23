package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransfer.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/InternationalTransfer;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "amount", "Ljava/math/BigDecimal;", "externalAccountId", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Lcom/robinhood/models/db/TransferDirection;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getTransferDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getAmount", "()Ljava/math/BigDecimal;", "getExternalAccountId", "()Ljava/lang/String;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class InternationalTransfer implements IntentKey, Parcelable {
    public static final Parcelable.Creator<InternationalTransfer> CREATOR = new Creator();
    private final BigDecimal amount;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final String externalAccountId;
    private final TransferDirection transferDirection;

    /* compiled from: InternationalTransfer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<InternationalTransfer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternationalTransfer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InternationalTransfer(TransferDirection.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString(), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternationalTransfer[] newArray(int i) {
            return new InternationalTransfer[i];
        }
    }

    public static /* synthetic */ InternationalTransfer copy$default(InternationalTransfer internationalTransfer, TransferDirection transferDirection, BigDecimal bigDecimal, String str, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            transferDirection = internationalTransfer.transferDirection;
        }
        if ((i & 2) != 0) {
            bigDecimal = internationalTransfer.amount;
        }
        if ((i & 4) != 0) {
            str = internationalTransfer.externalAccountId;
        }
        if ((i & 8) != 0) {
            entryPoint = internationalTransfer.entryPoint;
        }
        return internationalTransfer.copy(transferDirection, bigDecimal, str, entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferDirection getTransferDirection() {
        return this.transferDirection;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    /* renamed from: component4, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final InternationalTransfer copy(TransferDirection transferDirection, BigDecimal amount, String externalAccountId, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new InternationalTransfer(transferDirection, amount, externalAccountId, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransfer)) {
            return false;
        }
        InternationalTransfer internationalTransfer = (InternationalTransfer) other;
        return this.transferDirection == internationalTransfer.transferDirection && Intrinsics.areEqual(this.amount, internationalTransfer.amount) && Intrinsics.areEqual(this.externalAccountId, internationalTransfer.externalAccountId) && this.entryPoint == internationalTransfer.entryPoint;
    }

    public int hashCode() {
        int iHashCode = this.transferDirection.hashCode() * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.externalAccountId;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "InternationalTransfer(transferDirection=" + this.transferDirection + ", amount=" + this.amount + ", externalAccountId=" + this.externalAccountId + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transferDirection.name());
        dest.writeSerializable(this.amount);
        dest.writeString(this.externalAccountId);
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public InternationalTransfer(TransferDirection transferDirection, BigDecimal bigDecimal, String str, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.transferDirection = transferDirection;
        this.amount = bigDecimal;
        this.externalAccountId = str;
        this.entryPoint = entryPoint;
    }

    public final TransferDirection getTransferDirection() {
        return this.transferDirection;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    public /* synthetic */ InternationalTransfer(TransferDirection transferDirection, BigDecimal bigDecimal, String str, MAXTransferContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferDirection, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : str, (i & 8) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
