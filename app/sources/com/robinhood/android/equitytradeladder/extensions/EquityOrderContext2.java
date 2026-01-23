package com.robinhood.android.equitytradeladder.extensions;

import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.equity.ordercheck.Logging5;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.EquityOrderPayload;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.MarketHours;
import rosetta.order.OrderEntryPoint;
import rosetta.order.OrderInputFormat;
import rosetta.order.OrderType;
import rosetta.order.PositionEffect;
import rosetta.order.Side;
import rosetta.order.Trigger;

/* compiled from: EquityOrderContext.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u001a\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t¨\u0006\n"}, m3636d2 = {"toPerformanceContext", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "autosendEnabled", "", "marketBuysEnabled", "subzeroEnabled", "toEquityOrderContext", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.extensions.EquityOrderContextKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderContext2 {
    public static final PerformanceMetricEventData.Context toPerformanceContext(EquityOrderIntent equityOrderIntent, boolean z, boolean z2, boolean z3) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(equityOrderIntent, "<this>");
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.TAP;
        Screen.Name name = Screen.Name.EQUITIES_TRADING_LADDER;
        String string2 = equityOrderIntent.getInstrument().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, null, string2, null, 10, null);
        Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, toEquityOrderContext(equityOrderIntent, z2, z3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
        if (z) {
            action = UserInteractionEventData.Action.SUBMIT_ORDER;
        } else {
            action = UserInteractionEventData.Action.TRADE;
        }
        return new PerformanceMetricEventData.Context(false, false, false, null, null, null, new PerformanceMetricEventData.Context.Action(new UserInteractionEventData(eventType, screen, null, action, context, null, null, 100, null), null, 2, null), null, null, null, null, null, 4031, null);
    }

    public static final EquityOrderContext toEquityOrderContext(EquityOrderIntent equityOrderIntent, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "<this>");
        return toEquityOrderContext(equityOrderIntent.createDirectDraft(z, z2));
    }

    public static final EquityOrderContext toEquityOrderContext(DirectOrderRequestDraft directOrderRequestDraft) {
        String protobuf;
        Intrinsics.checkNotNullParameter(directOrderRequestDraft, "<this>");
        EquityOrderPayload orderPayload = Logging5.toOrderPayload(directOrderRequestDraft);
        String string2 = directOrderRequestDraft.getInstrument().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String symbol = directOrderRequestDraft.getInstrument().getSymbol();
        Side protobuf2 = Orders2.toProtobuf(directOrderRequestDraft.getSide());
        PositionEffect position_effect = orderPayload.getPosition_effect();
        OrderType type2 = orderPayload.getType();
        Trigger trigger = orderPayload.getTrigger();
        Boolean protobuf3 = Booleans2.toProtobuf(Boolean.valueOf(directOrderRequestDraft.getDollarBasedAmount() != null));
        Boolean protobuf4 = Booleans2.toProtobuf(Boolean.valueOf(directOrderRequestDraft.getTrailingPeg() != null));
        Boolean protobuf5 = Booleans2.toProtobuf(Boolean.valueOf(directOrderRequestDraft.getPresetPercentLimit() != null));
        MarketHours market_hours = orderPayload.getMarket_hours();
        BigDecimal estimatedTotalFeeAndTaxes = directOrderRequestDraft.getEstimatedTotalFeeAndTaxes();
        if (estimatedTotalFeeAndTaxes == null || (protobuf = Securities.toProtobuf(estimatedTotalFeeAndTaxes)) == null) {
            protobuf = "";
        }
        return new EquityOrderContext(string2, symbol, protobuf2, type2, trigger, protobuf3, protobuf4, protobuf5, market_hours, null, null, null, null, null, null, protobuf, position_effect, OrderEntryPoint.ORDER_ENTRY_POINT_LADDER, OrderInputFormat.ORDER_INPUT_FORMAT_LADDER, null, 556544, null);
    }
}
