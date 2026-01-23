package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashDestinations.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;", "Landroid/os/Parcelable;", "fromAccount", "Lcom/robinhood/models/db/AchRelationship;", "amount", "Ljava/math/BigDecimal;", "toAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/AchRelationship;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getFromAccount", "()Lcom/robinhood/models/db/AchRelationship;", "getAmount", "()Ljava/math/BigDecimal;", "getToAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringExtraCashData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringExtraCashData> CREATOR = new Creator();
    private final BigDecimal amount;
    private final AchRelationship fromAccount;
    private final TransferAccount toAccount;

    /* compiled from: RecurringDepositExtraCashDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringExtraCashData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringExtraCashData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringExtraCashData((AchRelationship) parcel.readParcelable(RecurringExtraCashData.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (TransferAccount) parcel.readParcelable(RecurringExtraCashData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringExtraCashData[] newArray(int i) {
            return new RecurringExtraCashData[i];
        }
    }

    public RecurringExtraCashData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RecurringExtraCashData copy$default(RecurringExtraCashData recurringExtraCashData, AchRelationship achRelationship, BigDecimal bigDecimal, TransferAccount transferAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            achRelationship = recurringExtraCashData.fromAccount;
        }
        if ((i & 2) != 0) {
            bigDecimal = recurringExtraCashData.amount;
        }
        if ((i & 4) != 0) {
            transferAccount = recurringExtraCashData.toAccount;
        }
        return recurringExtraCashData.copy(achRelationship, bigDecimal, transferAccount);
    }

    /* renamed from: component1, reason: from getter */
    public final AchRelationship getFromAccount() {
        return this.fromAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    public final RecurringExtraCashData copy(AchRelationship fromAccount, BigDecimal amount, TransferAccount toAccount) {
        return new RecurringExtraCashData(fromAccount, amount, toAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringExtraCashData)) {
            return false;
        }
        RecurringExtraCashData recurringExtraCashData = (RecurringExtraCashData) other;
        return Intrinsics.areEqual(this.fromAccount, recurringExtraCashData.fromAccount) && Intrinsics.areEqual(this.amount, recurringExtraCashData.amount) && Intrinsics.areEqual(this.toAccount, recurringExtraCashData.toAccount);
    }

    public int hashCode() {
        AchRelationship achRelationship = this.fromAccount;
        int iHashCode = (achRelationship == null ? 0 : achRelationship.hashCode()) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        TransferAccount transferAccount = this.toAccount;
        return iHashCode2 + (transferAccount != null ? transferAccount.hashCode() : 0);
    }

    public String toString() {
        return "RecurringExtraCashData(fromAccount=" + this.fromAccount + ", amount=" + this.amount + ", toAccount=" + this.toAccount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.fromAccount, flags);
        dest.writeSerializable(this.amount);
        dest.writeParcelable(this.toAccount, flags);
    }

    public RecurringExtraCashData(AchRelationship achRelationship, BigDecimal bigDecimal, TransferAccount transferAccount) {
        this.fromAccount = achRelationship;
        this.amount = bigDecimal;
        this.toAccount = transferAccount;
    }

    public /* synthetic */ RecurringExtraCashData(AchRelationship achRelationship, BigDecimal bigDecimal, TransferAccount transferAccount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : achRelationship, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : transferAccount);
    }

    public final AchRelationship getFromAccount() {
        return this.fromAccount;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferAccount getToAccount() {
        return this.toAccount;
    }
}
