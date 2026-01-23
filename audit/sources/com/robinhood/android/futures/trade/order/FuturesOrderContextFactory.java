package com.robinhood.android.futures.trade.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderContextFactory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/order/FuturesOrderContextFactory;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "refId", "Ljava/util/UUID;", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "staticInputs", "Lcom/robinhood/android/futures/trade/order/FuturesOrderContextFactory$StaticInputs;", "requestInputs", "Lcom/robinhood/android/futures/trade/order/FuturesOrderContextFactory$RequestInputs;", "quantity", "Ljava/math/BigDecimal;", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "StaticInputs", "RequestInputs", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FuturesOrderContextFactory {
    public static final int $stable = 0;
    public static final FuturesOrderContextFactory INSTANCE = new FuturesOrderContextFactory();

    /* compiled from: FuturesOrderContextFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/order/FuturesOrderContextFactory$StaticInputs;", "", "contractId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StaticInputs {
        public static final int $stable = 8;
        private final UUID contractId;

        public StaticInputs(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            this.contractId = contractId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }

    private FuturesOrderContextFactory() {
    }

    /* compiled from: FuturesOrderContextFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/order/FuturesOrderContextFactory$RequestInputs;", "", "orderSide", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "limitPrice", "Ljava/math/BigDecimal;", "stopPrice", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getOrderSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getLimitPrice", "()Ljava/math/BigDecimal;", "getStopPrice", "orderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "getOrderType", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "orderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getOrderTrigger", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RequestInputs {
        public static final int $stable = 8;
        private final BigDecimal limitPrice;
        private final FuturesOrderSide orderSide;
        private final BigDecimal stopPrice;

        public RequestInputs(FuturesOrderSide orderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            this.orderSide = orderSide;
            this.limitPrice = bigDecimal;
            this.stopPrice = bigDecimal2;
        }

        public final FuturesOrderSide getOrderSide() {
            return this.orderSide;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public final FuturesOrderType getOrderType() {
            if (this.limitPrice != null) {
                return FuturesOrderType.LIMIT;
            }
            return FuturesOrderType.MARKET;
        }

        public final FuturesOrderTrigger getOrderTrigger() {
            if (this.stopPrice != null) {
                return FuturesOrderTrigger.STOP;
            }
            return FuturesOrderTrigger.IMMEDIATE;
        }
    }

    public final UiFuturesOrderContext create(UUID refId, FuturesAccount account, StaticInputs staticInputs, RequestInputs requestInputs, BigDecimal quantity, FuturesTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        return new UiFuturesOrderContext(new UiFuturesOrderContext.OrderRequest(refId, requestInputs.getOrderType(), quantity, requestInputs.getOrderTrigger(), timeInForce, requestInputs.getStopPrice(), requestInputs.getLimitPrice(), CollectionsKt.listOf(new UiFuturesOrderContext.Leg(FuturesContractType.OUTRIGHTS, staticInputs.getContractId(), 1, requestInputs.getOrderSide()))), new UiFuturesOrderContext.RequestContext(account));
    }
}
