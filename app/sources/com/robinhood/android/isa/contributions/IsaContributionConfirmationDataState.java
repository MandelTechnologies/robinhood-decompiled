package com.robinhood.android.isa.contributions;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDataState;", "", "transfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "contributions", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;", "<init>", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;)V", "getTransfer", "()Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getContributions", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionConfirmationDataState {
    public static final int $stable = 8;
    private final IsaContributions contributions;
    private final PaymentTransfer transfer;

    /* JADX WARN: Multi-variable type inference failed */
    public IsaContributionConfirmationDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IsaContributionConfirmationDataState copy$default(IsaContributionConfirmationDataState isaContributionConfirmationDataState, PaymentTransfer paymentTransfer, IsaContributions isaContributions, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentTransfer = isaContributionConfirmationDataState.transfer;
        }
        if ((i & 2) != 0) {
            isaContributions = isaContributionConfirmationDataState.contributions;
        }
        return isaContributionConfirmationDataState.copy(paymentTransfer, isaContributions);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentTransfer getTransfer() {
        return this.transfer;
    }

    /* renamed from: component2, reason: from getter */
    public final IsaContributions getContributions() {
        return this.contributions;
    }

    public final IsaContributionConfirmationDataState copy(PaymentTransfer transfer, IsaContributions contributions) {
        return new IsaContributionConfirmationDataState(transfer, contributions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaContributionConfirmationDataState)) {
            return false;
        }
        IsaContributionConfirmationDataState isaContributionConfirmationDataState = (IsaContributionConfirmationDataState) other;
        return Intrinsics.areEqual(this.transfer, isaContributionConfirmationDataState.transfer) && Intrinsics.areEqual(this.contributions, isaContributionConfirmationDataState.contributions);
    }

    public int hashCode() {
        PaymentTransfer paymentTransfer = this.transfer;
        int iHashCode = (paymentTransfer == null ? 0 : paymentTransfer.hashCode()) * 31;
        IsaContributions isaContributions = this.contributions;
        return iHashCode + (isaContributions != null ? isaContributions.hashCode() : 0);
    }

    public String toString() {
        return "IsaContributionConfirmationDataState(transfer=" + this.transfer + ", contributions=" + this.contributions + ")";
    }

    public IsaContributionConfirmationDataState(PaymentTransfer paymentTransfer, IsaContributions isaContributions) {
        this.transfer = paymentTransfer;
        this.contributions = isaContributions;
    }

    public /* synthetic */ IsaContributionConfirmationDataState(PaymentTransfer paymentTransfer, IsaContributions isaContributions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentTransfer, (i & 2) != 0 ? null : isaContributions);
    }

    public final PaymentTransfer getTransfer() {
        return this.transfer;
    }

    public final IsaContributions getContributions() {
        return this.contributions;
    }
}
