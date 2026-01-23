package com.robinhood.android.isa.isatransfer;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaTransfer;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaTransferWithAccountType.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransfer/IsaTransferWithAccountType;", "", "transfer", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;", "sinkAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getTransfer", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;", "getSinkAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-isa-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaTransferWithAccountType {
    private final BrokerageAccountType sinkAccountType;
    private final IsaTransfer transfer;

    public static /* synthetic */ IsaTransferWithAccountType copy$default(IsaTransferWithAccountType isaTransferWithAccountType, IsaTransfer isaTransfer, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            isaTransfer = isaTransferWithAccountType.transfer;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = isaTransferWithAccountType.sinkAccountType;
        }
        return isaTransferWithAccountType.copy(isaTransfer, brokerageAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final IsaTransfer getTransfer() {
        return this.transfer;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getSinkAccountType() {
        return this.sinkAccountType;
    }

    public final IsaTransferWithAccountType copy(IsaTransfer transfer, BrokerageAccountType sinkAccountType) {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
        return new IsaTransferWithAccountType(transfer, sinkAccountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaTransferWithAccountType)) {
            return false;
        }
        IsaTransferWithAccountType isaTransferWithAccountType = (IsaTransferWithAccountType) other;
        return Intrinsics.areEqual(this.transfer, isaTransferWithAccountType.transfer) && this.sinkAccountType == isaTransferWithAccountType.sinkAccountType;
    }

    public int hashCode() {
        return (this.transfer.hashCode() * 31) + this.sinkAccountType.hashCode();
    }

    public String toString() {
        return "IsaTransferWithAccountType(transfer=" + this.transfer + ", sinkAccountType=" + this.sinkAccountType + ")";
    }

    public IsaTransferWithAccountType(IsaTransfer transfer, BrokerageAccountType sinkAccountType) {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
        this.transfer = transfer;
        this.sinkAccountType = sinkAccountType;
    }

    public final IsaTransfer getTransfer() {
        return this.transfer;
    }

    public final BrokerageAccountType getSinkAccountType() {
        return this.sinkAccountType;
    }
}
