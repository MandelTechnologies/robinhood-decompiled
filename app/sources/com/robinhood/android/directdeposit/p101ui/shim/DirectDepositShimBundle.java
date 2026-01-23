package com.robinhood.android.directdeposit.p101ui.shim;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimBundle;", "", "hasRhyAccount", "", "transferAccounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "hasRhsDirectDepositRelationship", "accountDeactivated", "<init>", "(ZLjava/util/List;ZZ)V", "getHasRhyAccount", "()Z", "getTransferAccounts", "()Ljava/util/List;", "getHasRhsDirectDepositRelationship", "getAccountDeactivated", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class DirectDepositShimBundle {
    public static final int $stable = 8;
    private final boolean accountDeactivated;
    private final boolean hasRhsDirectDepositRelationship;
    private final boolean hasRhyAccount;
    private final List<TransferAccount> transferAccounts;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectDepositShimBundle copy$default(DirectDepositShimBundle directDepositShimBundle, boolean z, List list, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = directDepositShimBundle.hasRhyAccount;
        }
        if ((i & 2) != 0) {
            list = directDepositShimBundle.transferAccounts;
        }
        if ((i & 4) != 0) {
            z2 = directDepositShimBundle.hasRhsDirectDepositRelationship;
        }
        if ((i & 8) != 0) {
            z3 = directDepositShimBundle.accountDeactivated;
        }
        return directDepositShimBundle.copy(z, list, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasRhyAccount() {
        return this.hasRhyAccount;
    }

    public final List<TransferAccount> component2() {
        return this.transferAccounts;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasRhsDirectDepositRelationship() {
        return this.hasRhsDirectDepositRelationship;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAccountDeactivated() {
        return this.accountDeactivated;
    }

    public final DirectDepositShimBundle copy(boolean hasRhyAccount, List<TransferAccount> transferAccounts, boolean hasRhsDirectDepositRelationship, boolean accountDeactivated) {
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        return new DirectDepositShimBundle(hasRhyAccount, transferAccounts, hasRhsDirectDepositRelationship, accountDeactivated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDepositShimBundle)) {
            return false;
        }
        DirectDepositShimBundle directDepositShimBundle = (DirectDepositShimBundle) other;
        return this.hasRhyAccount == directDepositShimBundle.hasRhyAccount && Intrinsics.areEqual(this.transferAccounts, directDepositShimBundle.transferAccounts) && this.hasRhsDirectDepositRelationship == directDepositShimBundle.hasRhsDirectDepositRelationship && this.accountDeactivated == directDepositShimBundle.accountDeactivated;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.hasRhyAccount) * 31) + this.transferAccounts.hashCode()) * 31) + Boolean.hashCode(this.hasRhsDirectDepositRelationship)) * 31) + Boolean.hashCode(this.accountDeactivated);
    }

    public String toString() {
        return "DirectDepositShimBundle(hasRhyAccount=" + this.hasRhyAccount + ", transferAccounts=" + this.transferAccounts + ", hasRhsDirectDepositRelationship=" + this.hasRhsDirectDepositRelationship + ", accountDeactivated=" + this.accountDeactivated + ")";
    }

    public DirectDepositShimBundle(boolean z, List<TransferAccount> transferAccounts, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        this.hasRhyAccount = z;
        this.transferAccounts = transferAccounts;
        this.hasRhsDirectDepositRelationship = z2;
        this.accountDeactivated = z3;
    }

    public final boolean getHasRhyAccount() {
        return this.hasRhyAccount;
    }

    public final List<TransferAccount> getTransferAccounts() {
        return this.transferAccounts;
    }

    public final boolean getHasRhsDirectDepositRelationship() {
        return this.hasRhsDirectDepositRelationship;
    }

    public final boolean getAccountDeactivated() {
        return this.accountDeactivated;
    }
}
