package com.robinhood.android.trade.directipo.p260ui.order;

import com.robinhood.models.api.IpoOrderUpdateRequest;
import com.robinhood.models.api.OrderRequest;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.converters.stocktrading.EquityOrders2;
import com.robinhood.rosetta.eventlogging.EquityOrderPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.MarketHours;
import rosetta.order.OrderType;
import rosetta.order.Side;
import rosetta.order.TimeInForce;
import rosetta.order.Trigger;

/* compiled from: IpoRosettaConverters.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"toIpoOrderPayload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "Lcom/robinhood/models/api/OrderRequest;", "Lcom/robinhood/models/api/IpoOrderUpdateRequest;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.directipo.ui.order.IpoRosettaConvertersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IpoRosettaConverters {
    public static final EquityOrderPayload toIpoOrderPayload(OrderRequest orderRequest) {
        Intrinsics.checkNotNullParameter(orderRequest, "<this>");
        String string2 = orderRequest.getRef_id().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String account_url = orderRequest.getAccount_url();
        String instrument_url = orderRequest.getInstrument_url();
        String symbol = orderRequest.getSymbol();
        String protobuf = Securities.toProtobuf(orderRequest.getQuantity());
        String protobuf2 = Securities.toProtobuf(orderRequest.getIpo_access_lower_collared_price());
        String protobuf3 = Securities.toProtobuf(orderRequest.getIpo_access_upper_collared_price());
        String protobuf4 = Securities.toProtobuf(orderRequest.getIpo_access_lower_price());
        String protobuf5 = Securities.toProtobuf(orderRequest.getIpo_access_upper_price());
        boolean zIs_ipo_access_order = orderRequest.is_ipo_access_order();
        Side protobuf6 = Orders2.toProtobuf(orderRequest.getSide());
        String protobuf7 = Securities.toProtobuf(orderRequest.getPrice());
        String protobuf8 = Securities.toProtobuf(orderRequest.getStop_price());
        OrderType protobuf9 = Orders2.toProtobuf(orderRequest.getType());
        Trigger protobuf10 = Orders2.toProtobuf(orderRequest.getTrigger());
        TimeInForce protobuf11 = Orders2.toProtobuf(orderRequest.getTime_in_force());
        boolean zAllowExtendedHours = orderRequest.allowExtendedHours();
        MarketHours protobuf12 = Orders2.toProtobuf(orderRequest.getMarket_hours());
        Money dollar_based_amount = orderRequest.getDollar_based_amount();
        com.robinhood.rosetta.eventlogging.Money protobuf13 = dollar_based_amount != null ? Securities.toProtobuf(dollar_based_amount) : null;
        OrderTrailingPeg trailing_peg = orderRequest.getTrailing_peg();
        return new EquityOrderPayload(string2, account_url, instrument_url, symbol, protobuf, protobuf6, protobuf7, protobuf8, protobuf9, protobuf10, protobuf11, zAllowExtendedHours, protobuf13, trailing_peg != null ? EquityOrders2.toProtobuf(trailing_peg) : null, false, false, zIs_ipo_access_order, protobuf2, protobuf4, protobuf3, protobuf5, false, orderRequest.getCheck_overrides(), Securities.toProtobuf(orderRequest.getPreset_percent_limit()), Securities.toProtobuf(orderRequest.getOrder_form_version()), protobuf12, null, null, null, null, null, null, null, null, null, null, null, -64962560, 31, null);
    }

    public static final EquityOrderPayload toIpoOrderPayload(IpoOrderUpdateRequest ipoOrderUpdateRequest) {
        Intrinsics.checkNotNullParameter(ipoOrderUpdateRequest, "<this>");
        String string2 = ipoOrderUpdateRequest.getRef_id().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String protobuf = Securities.toProtobuf(ipoOrderUpdateRequest.getIpo_access_lower_collared_price());
        String protobuf2 = Securities.toProtobuf(ipoOrderUpdateRequest.getIpo_access_upper_collared_price());
        return new EquityOrderPayload(string2, null, null, null, Securities.toProtobuf(ipoOrderUpdateRequest.getQuantity()), null, Securities.toProtobuf(ipoOrderUpdateRequest.getPrice()), null, null, null, null, false, null, null, false, false, false, protobuf, Securities.toProtobuf(ipoOrderUpdateRequest.getIpo_access_lower_price()), protobuf2, Securities.toProtobuf(ipoOrderUpdateRequest.getIpo_access_upper_price()), false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, -1966162, 31, null);
    }
}
