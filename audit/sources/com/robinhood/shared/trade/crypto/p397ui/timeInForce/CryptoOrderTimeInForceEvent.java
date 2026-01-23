package com.robinhood.shared.trade.crypto.p397ui.timeInForce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTimeInForceEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceEvent;", "", "<init>", "()V", "ConfirmTimeInForce", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceEvent$ConfirmTimeInForce;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderTimeInForceEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderTimeInForceEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderTimeInForceEvent() {
    }

    /* compiled from: CryptoOrderTimeInForceEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceEvent$ConfirmTimeInForce;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceEvent;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;)V", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getOrderPrices", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ConfirmTimeInForce extends CryptoOrderTimeInForceEvent {
        public static final int $stable = 0;
        private final CryptoOrderPrices orderPrices;
        private final OrderTimeInForce timeInForce;

        public static /* synthetic */ ConfirmTimeInForce copy$default(ConfirmTimeInForce confirmTimeInForce, OrderTimeInForce orderTimeInForce, CryptoOrderPrices cryptoOrderPrices, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTimeInForce = confirmTimeInForce.timeInForce;
            }
            if ((i & 2) != 0) {
                cryptoOrderPrices = confirmTimeInForce.orderPrices;
            }
            return confirmTimeInForce.copy(orderTimeInForce, cryptoOrderPrices);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        public final ConfirmTimeInForce copy(OrderTimeInForce timeInForce, CryptoOrderPrices orderPrices) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            return new ConfirmTimeInForce(timeInForce, orderPrices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmTimeInForce)) {
                return false;
            }
            ConfirmTimeInForce confirmTimeInForce = (ConfirmTimeInForce) other;
            return this.timeInForce == confirmTimeInForce.timeInForce && Intrinsics.areEqual(this.orderPrices, confirmTimeInForce.orderPrices);
        }

        public int hashCode() {
            return (this.timeInForce.hashCode() * 31) + this.orderPrices.hashCode();
        }

        public String toString() {
            return "ConfirmTimeInForce(timeInForce=" + this.timeInForce + ", orderPrices=" + this.orderPrices + ")";
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmTimeInForce(OrderTimeInForce timeInForce, CryptoOrderPrices orderPrices) {
            super(null);
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            this.timeInForce = timeInForce;
            this.orderPrices = orderPrices;
        }
    }
}
