package com.robinhood.android.trade.equity.p261ui.configuration.price.validation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.validation.BaseOrderPriceContext;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPriceContext.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceContext;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "lastTradePrice", "instrument", "Lcom/robinhood/models/db/Instrument;", "orderPriceStep", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceStep;", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/models/db/Order$Configuration;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceStep;)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getPrice", "()Ljava/math/BigDecimal;", "getLastTradePrice", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getOrderPriceStep", "()Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceStep;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderPriceContext implements BaseOrderPriceContext {
    public static final int $stable = 8;
    private final Order.Configuration configuration;
    private final Instrument instrument;
    private final BigDecimal lastTradePrice;
    private final OrderPriceStep orderPriceStep;
    private final BigDecimal price;
    private final EquityOrderSide side;

    public static /* synthetic */ OrderPriceContext copy$default(OrderPriceContext orderPriceContext, EquityOrderSide equityOrderSide, Order.Configuration configuration, BigDecimal bigDecimal, BigDecimal bigDecimal2, Instrument instrument, OrderPriceStep orderPriceStep, int i, Object obj) {
        if ((i & 1) != 0) {
            equityOrderSide = orderPriceContext.side;
        }
        if ((i & 2) != 0) {
            configuration = orderPriceContext.configuration;
        }
        if ((i & 4) != 0) {
            bigDecimal = orderPriceContext.price;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = orderPriceContext.lastTradePrice;
        }
        if ((i & 16) != 0) {
            instrument = orderPriceContext.instrument;
        }
        if ((i & 32) != 0) {
            orderPriceStep = orderPriceContext.orderPriceStep;
        }
        Instrument instrument2 = instrument;
        OrderPriceStep orderPriceStep2 = orderPriceStep;
        return orderPriceContext.copy(equityOrderSide, configuration, bigDecimal, bigDecimal2, instrument2, orderPriceStep2);
    }

    /* renamed from: component1, reason: from getter */
    public final EquityOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final Order.Configuration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getLastTradePrice() {
        return this.lastTradePrice;
    }

    /* renamed from: component5, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderPriceStep getOrderPriceStep() {
        return this.orderPriceStep;
    }

    public final OrderPriceContext copy(EquityOrderSide side, Order.Configuration configuration, BigDecimal price, BigDecimal lastTradePrice, Instrument instrument, OrderPriceStep orderPriceStep) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(price, "price");
        return new OrderPriceContext(side, configuration, price, lastTradePrice, instrument, orderPriceStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPriceContext)) {
            return false;
        }
        OrderPriceContext orderPriceContext = (OrderPriceContext) other;
        return this.side == orderPriceContext.side && this.configuration == orderPriceContext.configuration && Intrinsics.areEqual(this.price, orderPriceContext.price) && Intrinsics.areEqual(this.lastTradePrice, orderPriceContext.lastTradePrice) && Intrinsics.areEqual(this.instrument, orderPriceContext.instrument) && this.orderPriceStep == orderPriceContext.orderPriceStep;
    }

    public int hashCode() {
        int iHashCode = ((((this.side.hashCode() * 31) + this.configuration.hashCode()) * 31) + this.price.hashCode()) * 31;
        BigDecimal bigDecimal = this.lastTradePrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        OrderPriceStep orderPriceStep = this.orderPriceStep;
        return iHashCode3 + (orderPriceStep != null ? orderPriceStep.hashCode() : 0);
    }

    public String toString() {
        return "OrderPriceContext(side=" + this.side + ", configuration=" + this.configuration + ", price=" + this.price + ", lastTradePrice=" + this.lastTradePrice + ", instrument=" + this.instrument + ", orderPriceStep=" + this.orderPriceStep + ")";
    }

    public OrderPriceContext(EquityOrderSide side, Order.Configuration configuration, BigDecimal price, BigDecimal bigDecimal, Instrument instrument, OrderPriceStep orderPriceStep) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(price, "price");
        this.side = side;
        this.configuration = configuration;
        this.price = price;
        this.lastTradePrice = bigDecimal;
        this.instrument = instrument;
        this.orderPriceStep = orderPriceStep;
    }

    @Override // com.robinhood.android.lib.trade.validation.BaseOrderPriceContext
    public EquityOrderSide getSide() {
        return this.side;
    }

    @Override // com.robinhood.android.lib.trade.validation.BaseOrderPriceContext
    public Order.Configuration getConfiguration() {
        return this.configuration;
    }

    @Override // com.robinhood.android.lib.trade.validation.BaseOrderPriceContext
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override // com.robinhood.android.lib.trade.validation.BaseOrderPriceContext
    public BigDecimal getLastTradePrice() {
        return this.lastTradePrice;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final OrderPriceStep getOrderPriceStep() {
        return this.orderPriceStep;
    }
}
