package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/event/EstimatedFeesParams;", "", "swapsAccountId", "Ljava/util/UUID;", "contractIds", "", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "quantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/util/Set;Lcom/robinhood/android/models/event/db/order/EventOrderSide;Ljava/math/BigDecimal;)V", "getSwapsAccountId", "()Ljava/util/UUID;", "getContractIds", "()Ljava/util/Set;", "getSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getQuantity", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EstimatedFeesParams {
    private final Set<UUID> contractIds;
    private final BigDecimal quantity;
    private final EventOrderSide side;
    private final UUID swapsAccountId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EstimatedFeesParams copy$default(EstimatedFeesParams estimatedFeesParams, UUID uuid, Set set, EventOrderSide eventOrderSide, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = estimatedFeesParams.swapsAccountId;
        }
        if ((i & 2) != 0) {
            set = estimatedFeesParams.contractIds;
        }
        if ((i & 4) != 0) {
            eventOrderSide = estimatedFeesParams.side;
        }
        if ((i & 8) != 0) {
            bigDecimal = estimatedFeesParams.quantity;
        }
        return estimatedFeesParams.copy(uuid, set, eventOrderSide, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSwapsAccountId() {
        return this.swapsAccountId;
    }

    public final Set<UUID> component2() {
        return this.contractIds;
    }

    /* renamed from: component3, reason: from getter */
    public final EventOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final EstimatedFeesParams copy(UUID swapsAccountId, Set<UUID> contractIds, EventOrderSide side, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return new EstimatedFeesParams(swapsAccountId, contractIds, side, quantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EstimatedFeesParams)) {
            return false;
        }
        EstimatedFeesParams estimatedFeesParams = (EstimatedFeesParams) other;
        return Intrinsics.areEqual(this.swapsAccountId, estimatedFeesParams.swapsAccountId) && Intrinsics.areEqual(this.contractIds, estimatedFeesParams.contractIds) && this.side == estimatedFeesParams.side && Intrinsics.areEqual(this.quantity, estimatedFeesParams.quantity);
    }

    public int hashCode() {
        UUID uuid = this.swapsAccountId;
        return ((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.contractIds.hashCode()) * 31) + this.side.hashCode()) * 31) + this.quantity.hashCode();
    }

    public String toString() {
        return "EstimatedFeesParams(swapsAccountId=" + this.swapsAccountId + ", contractIds=" + this.contractIds + ", side=" + this.side + ", quantity=" + this.quantity + ")";
    }

    public EstimatedFeesParams(UUID uuid, Set<UUID> contractIds, EventOrderSide side, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.swapsAccountId = uuid;
        this.contractIds = contractIds;
        this.side = side;
        this.quantity = quantity;
    }

    public final UUID getSwapsAccountId() {
        return this.swapsAccountId;
    }

    public final Set<UUID> getContractIds() {
        return this.contractIds;
    }

    public final EventOrderSide getSide() {
        return this.side;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }
}
