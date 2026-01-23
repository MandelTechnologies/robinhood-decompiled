package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2EligibleInstantBundle.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2EligibleInstantBundle;", "", "amount", "Ljava/math/BigDecimal;", "fromAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "toAccount", "isCreatingTransfer", "", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Z)V", "getAmount", "()Ljava/math/BigDecimal;", "getFromAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getToAccount", "()Z", "shouldQueryForInstantAmount", "getShouldQueryForInstantAmount", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateTransferV2EligibleInstantBundle {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final TransferAccount fromAccount;
    private final boolean isCreatingTransfer;
    private final TransferAccount toAccount;

    public static /* synthetic */ CreateTransferV2EligibleInstantBundle copy$default(CreateTransferV2EligibleInstantBundle createTransferV2EligibleInstantBundle, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = createTransferV2EligibleInstantBundle.amount;
        }
        if ((i & 2) != 0) {
            transferAccount = createTransferV2EligibleInstantBundle.fromAccount;
        }
        if ((i & 4) != 0) {
            transferAccount2 = createTransferV2EligibleInstantBundle.toAccount;
        }
        if ((i & 8) != 0) {
            z = createTransferV2EligibleInstantBundle.isCreatingTransfer;
        }
        return createTransferV2EligibleInstantBundle.copy(bigDecimal, transferAccount, transferAccount2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferAccount getFromAccount() {
        return this.fromAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    public final CreateTransferV2EligibleInstantBundle copy(BigDecimal amount, TransferAccount fromAccount, TransferAccount toAccount, boolean isCreatingTransfer) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new CreateTransferV2EligibleInstantBundle(amount, fromAccount, toAccount, isCreatingTransfer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferV2EligibleInstantBundle)) {
            return false;
        }
        CreateTransferV2EligibleInstantBundle createTransferV2EligibleInstantBundle = (CreateTransferV2EligibleInstantBundle) other;
        return Intrinsics.areEqual(this.amount, createTransferV2EligibleInstantBundle.amount) && Intrinsics.areEqual(this.fromAccount, createTransferV2EligibleInstantBundle.fromAccount) && Intrinsics.areEqual(this.toAccount, createTransferV2EligibleInstantBundle.toAccount) && this.isCreatingTransfer == createTransferV2EligibleInstantBundle.isCreatingTransfer;
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        TransferAccount transferAccount = this.fromAccount;
        int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        TransferAccount transferAccount2 = this.toAccount;
        return ((iHashCode2 + (transferAccount2 != null ? transferAccount2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCreatingTransfer);
    }

    public String toString() {
        return "CreateTransferV2EligibleInstantBundle(amount=" + this.amount + ", fromAccount=" + this.fromAccount + ", toAccount=" + this.toAccount + ", isCreatingTransfer=" + this.isCreatingTransfer + ")";
    }

    public CreateTransferV2EligibleInstantBundle(BigDecimal amount, TransferAccount transferAccount, TransferAccount transferAccount2, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.amount = amount;
        this.fromAccount = transferAccount;
        this.toAccount = transferAccount2;
        this.isCreatingTransfer = z;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferAccount getFromAccount() {
        return this.fromAccount;
    }

    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    public final boolean isCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    public final boolean getShouldQueryForInstantAmount() {
        if (this.isCreatingTransfer) {
            return false;
        }
        TransferAccount transferAccount = this.fromAccount;
        if ((transferAccount != null ? transferAccount.getType() : null) != ApiTransferAccount.TransferAccountType.ACH) {
            return false;
        }
        TransferAccount transferAccount2 = this.toAccount;
        if ((transferAccount2 != null ? transferAccount2.getType() : null) == ApiTransferAccount.TransferAccountType.RHS) {
            return true;
        }
        TransferAccount transferAccount3 = this.toAccount;
        return (transferAccount3 != null ? transferAccount3.getType() : null) == ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS;
    }
}
