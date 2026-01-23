package com.robinhood.shared.tradeladder.p398ui.ladder.extensions;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPills.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010!\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Jd\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/extensions/PendingOrderPillData;", "T", "", Card.Icon.ORDER, "orderId", "Ljava/util/UUID;", "displayQuantity", "Ljava/math/BigDecimal;", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "isPlaceholder", "", "isEditable", "orderType", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "orderTrigger", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "<init>", "(Ljava/lang/Object;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;ZZLcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;)V", "getOrder", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOrderId", "()Ljava/util/UUID;", "getDisplayQuantity", "()Ljava/math/BigDecimal;", "getSide", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "()Z", "getOrderType", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "getOrderTrigger", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Object;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;ZZLcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;)Lcom/robinhood/shared/tradeladder/ui/ladder/extensions/PendingOrderPillData;", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PendingOrderPillData<T> {
    public static final int $stable = 8;
    private final BigDecimal displayQuantity;
    private final boolean isEditable;
    private final boolean isPlaceholder;
    private final T order;
    private final UUID orderId;
    private final OrderTrigger orderTrigger;
    private final OrderType orderType;
    private final Side side;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingOrderPillData copy$default(PendingOrderPillData pendingOrderPillData, Object obj, UUID uuid, BigDecimal bigDecimal, Side side, boolean z, boolean z2, OrderType orderType, OrderTrigger orderTrigger, int i, Object obj2) {
        T t = obj;
        if ((i & 1) != 0) {
            t = pendingOrderPillData.order;
        }
        if ((i & 2) != 0) {
            uuid = pendingOrderPillData.orderId;
        }
        if ((i & 4) != 0) {
            bigDecimal = pendingOrderPillData.displayQuantity;
        }
        if ((i & 8) != 0) {
            side = pendingOrderPillData.side;
        }
        if ((i & 16) != 0) {
            z = pendingOrderPillData.isPlaceholder;
        }
        if ((i & 32) != 0) {
            z2 = pendingOrderPillData.isEditable;
        }
        if ((i & 64) != 0) {
            orderType = pendingOrderPillData.orderType;
        }
        if ((i & 128) != 0) {
            orderTrigger = pendingOrderPillData.orderTrigger;
        }
        OrderType orderType2 = orderType;
        OrderTrigger orderTrigger2 = orderTrigger;
        boolean z3 = z;
        boolean z4 = z2;
        return pendingOrderPillData.copy(t, uuid, bigDecimal, side, z3, z4, orderType2, orderTrigger2);
    }

    public final T component1() {
        return this.order;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getDisplayQuantity() {
        return this.displayQuantity;
    }

    /* renamed from: component4, reason: from getter */
    public final Side getSide() {
        return this.side;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPlaceholder() {
        return this.isPlaceholder;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    /* renamed from: component7, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component8, reason: from getter */
    public final OrderTrigger getOrderTrigger() {
        return this.orderTrigger;
    }

    public final PendingOrderPillData<T> copy(T order, UUID orderId, BigDecimal displayQuantity, Side side, boolean isPlaceholder, boolean isEditable, OrderType orderType, OrderTrigger orderTrigger) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(displayQuantity, "displayQuantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
        return new PendingOrderPillData<>(order, orderId, displayQuantity, side, isPlaceholder, isEditable, orderType, orderTrigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingOrderPillData)) {
            return false;
        }
        PendingOrderPillData pendingOrderPillData = (PendingOrderPillData) other;
        return Intrinsics.areEqual(this.order, pendingOrderPillData.order) && Intrinsics.areEqual(this.orderId, pendingOrderPillData.orderId) && Intrinsics.areEqual(this.displayQuantity, pendingOrderPillData.displayQuantity) && this.side == pendingOrderPillData.side && this.isPlaceholder == pendingOrderPillData.isPlaceholder && this.isEditable == pendingOrderPillData.isEditable && this.orderType == pendingOrderPillData.orderType && this.orderTrigger == pendingOrderPillData.orderTrigger;
    }

    public int hashCode() {
        T t = this.order;
        return ((((((((((((((t == null ? 0 : t.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.displayQuantity.hashCode()) * 31) + this.side.hashCode()) * 31) + Boolean.hashCode(this.isPlaceholder)) * 31) + Boolean.hashCode(this.isEditable)) * 31) + this.orderType.hashCode()) * 31) + this.orderTrigger.hashCode();
    }

    public String toString() {
        return "PendingOrderPillData(order=" + this.order + ", orderId=" + this.orderId + ", displayQuantity=" + this.displayQuantity + ", side=" + this.side + ", isPlaceholder=" + this.isPlaceholder + ", isEditable=" + this.isEditable + ", orderType=" + this.orderType + ", orderTrigger=" + this.orderTrigger + ")";
    }

    public PendingOrderPillData(T t, UUID orderId, BigDecimal displayQuantity, Side side, boolean z, boolean z2, OrderType orderType, OrderTrigger orderTrigger) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(displayQuantity, "displayQuantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
        this.order = t;
        this.orderId = orderId;
        this.displayQuantity = displayQuantity;
        this.side = side;
        this.isPlaceholder = z;
        this.isEditable = z2;
        this.orderType = orderType;
        this.orderTrigger = orderTrigger;
    }

    public final T getOrder() {
        return this.order;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final BigDecimal getDisplayQuantity() {
        return this.displayQuantity;
    }

    public final Side getSide() {
        return this.side;
    }

    public final boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public final OrderType getOrderType() {
        return this.orderType;
    }

    public final OrderTrigger getOrderTrigger() {
        return this.orderTrigger;
    }
}
