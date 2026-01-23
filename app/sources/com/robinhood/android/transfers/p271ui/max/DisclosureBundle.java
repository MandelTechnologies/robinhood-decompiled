package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisclosureBundle.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/DisclosureBundle;", "", "mode", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "<init>", "(Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getMode", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DisclosureBundle {
    public static final int $stable = 8;
    private final CreateTransferViewState.Mode mode;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;

    public static /* synthetic */ DisclosureBundle copy$default(DisclosureBundle disclosureBundle, CreateTransferViewState.Mode mode, TransferAccount transferAccount, TransferAccount transferAccount2, int i, Object obj) {
        if ((i & 1) != 0) {
            mode = disclosureBundle.mode;
        }
        if ((i & 2) != 0) {
            transferAccount = disclosureBundle.sourceAccount;
        }
        if ((i & 4) != 0) {
            transferAccount2 = disclosureBundle.sinkAccount;
        }
        return disclosureBundle.copy(mode, transferAccount, transferAccount2);
    }

    /* renamed from: component1, reason: from getter */
    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final DisclosureBundle copy(CreateTransferViewState.Mode mode, TransferAccount sourceAccount, TransferAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new DisclosureBundle(mode, sourceAccount, sinkAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureBundle)) {
            return false;
        }
        DisclosureBundle disclosureBundle = (DisclosureBundle) other;
        return this.mode == disclosureBundle.mode && Intrinsics.areEqual(this.sourceAccount, disclosureBundle.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, disclosureBundle.sinkAccount);
    }

    public int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        TransferAccount transferAccount2 = this.sinkAccount;
        return iHashCode2 + (transferAccount2 != null ? transferAccount2.hashCode() : 0);
    }

    public String toString() {
        return "DisclosureBundle(mode=" + this.mode + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ")";
    }

    public DisclosureBundle(CreateTransferViewState.Mode mode, TransferAccount transferAccount, TransferAccount transferAccount2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        this.sourceAccount = transferAccount;
        this.sinkAccount = transferAccount2;
    }

    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }
}
