package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferV2DataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferData;", "", "amount", "Lcom/robinhood/models/util/Money;", "transferDirection", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransferDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getSourceAccount", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "getSinkAccount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferData {
    public static final int $stable = 8;
    private final Money amount;
    private final ApiCreateTransferRequest.ApiTransferAccount sinkAccount;
    private final ApiCreateTransferRequest.ApiTransferAccount sourceAccount;
    private final TransferDirectionV2 transferDirection;

    public static /* synthetic */ TransferData copy$default(TransferData transferData, Money money, TransferDirectionV2 transferDirectionV2, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = transferData.amount;
        }
        if ((i & 2) != 0) {
            transferDirectionV2 = transferData.transferDirection;
        }
        if ((i & 4) != 0) {
            apiTransferAccount = transferData.sourceAccount;
        }
        if ((i & 8) != 0) {
            apiTransferAccount2 = transferData.sinkAccount;
        }
        return transferData.copy(money, transferDirectionV2, apiTransferAccount, apiTransferAccount2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferDirectionV2 getTransferDirection() {
        return this.transferDirection;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final TransferData copy(Money amount, TransferDirectionV2 transferDirection, ApiCreateTransferRequest.ApiTransferAccount sourceAccount, ApiCreateTransferRequest.ApiTransferAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new TransferData(amount, transferDirection, sourceAccount, sinkAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferData)) {
            return false;
        }
        TransferData transferData = (TransferData) other;
        return Intrinsics.areEqual(this.amount, transferData.amount) && this.transferDirection == transferData.transferDirection && Intrinsics.areEqual(this.sourceAccount, transferData.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, transferData.sinkAccount);
    }

    public int hashCode() {
        int iHashCode = ((this.amount.hashCode() * 31) + this.transferDirection.hashCode()) * 31;
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = this.sourceAccount;
        int iHashCode2 = (iHashCode + (apiTransferAccount == null ? 0 : apiTransferAccount.hashCode())) * 31;
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2 = this.sinkAccount;
        return iHashCode2 + (apiTransferAccount2 != null ? apiTransferAccount2.hashCode() : 0);
    }

    public String toString() {
        return "TransferData(amount=" + this.amount + ", transferDirection=" + this.transferDirection + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ")";
    }

    public TransferData(Money amount, TransferDirectionV2 transferDirection, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        this.amount = amount;
        this.transferDirection = transferDirection;
        this.sourceAccount = apiTransferAccount;
        this.sinkAccount = apiTransferAccount2;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final TransferDirectionV2 getTransferDirection() {
        return this.transferDirection;
    }

    public final ApiCreateTransferRequest.ApiTransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final ApiCreateTransferRequest.ApiTransferAccount getSinkAccount() {
        return this.sinkAccount;
    }
}
