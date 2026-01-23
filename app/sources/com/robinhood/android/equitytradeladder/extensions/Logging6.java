package com.robinhood.android.equitytradeladder.extensions;

import com.robinhood.android.equitytradeladder.EquityTradeLadderDataState;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState;
import com.robinhood.models.p320db.Position5;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.PositionEffect;

/* compiled from: Logging.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"buildSelectedRowEquityOrderContext", "", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.extensions.LoggingKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class Logging6 {

    /* compiled from: Logging.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitytradeladder.extensions.LoggingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderType.values().length];
            try {
                iArr[OrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderTrigger.values().length];
            try {
                iArr2[OrderTrigger.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderTrigger.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Map<Side, EquityOrderContext> buildSelectedRowEquityOrderContext(EquityTradeLadderDataState equityTradeLadderDataState) {
        rosetta.order.OrderType orderType;
        PositionEffect positionEffect;
        rosetta.order.Side side;
        rosetta.order.OrderType orderType2;
        PositionEffect positionEffect2;
        LadderState.LadderData.SelectedRow.OrderConfig endConfig;
        LadderState.LadderData.SelectedRow.OrderConfig startConfig;
        Intrinsics.checkNotNullParameter(equityTradeLadderDataState, "<this>");
        EquityLadderOrderState equityLadderOrderState = equityTradeLadderDataState.getEquityLadderOrderState();
        boolean z = false;
        if (equityLadderOrderState != null && equityLadderOrderState.getAllowShorting()) {
            z = true;
        }
        LadderState.LadderData.SelectedRow selectedRow$feature_equity_trade_ladder_externalDebug = equityTradeLadderDataState.getSelectedRow$feature_equity_trade_ladder_externalDebug();
        Side side2 = Side.START;
        rosetta.order.Side side3 = rosetta.order.Side.BUY;
        OrderTrigger trigger = null;
        OrderType type2 = (selectedRow$feature_equity_trade_ladder_externalDebug == null || (startConfig = selectedRow$feature_equity_trade_ladder_externalDebug.getStartConfig()) == null) ? null : startConfig.getType();
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == -1) {
            orderType = rosetta.order.OrderType.ORDER_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            orderType = rosetta.order.OrderType.LIMIT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            orderType = rosetta.order.OrderType.STOP_LOSS;
        }
        if (Position5.isShortPositionOrPending(equityTradeLadderDataState.getPosition())) {
            positionEffect = PositionEffect.CLOSE;
        } else {
            positionEffect = PositionEffect.OPEN;
        }
        Tuples2 tuples2M3642to = Tuples4.m3642to(side2, new EquityOrderContext(null, null, side3, orderType, null, null, null, null, null, null, null, null, null, null, null, null, positionEffect, null, null, null, 983027, null));
        Side side4 = Side.END;
        if (z) {
            side = rosetta.order.Side.SELL_SHORT;
        } else {
            side = rosetta.order.Side.SELL;
        }
        rosetta.order.Side side5 = side;
        if (selectedRow$feature_equity_trade_ladder_externalDebug != null && (endConfig = selectedRow$feature_equity_trade_ladder_externalDebug.getEndConfig()) != null) {
            trigger = endConfig.getTrigger();
        }
        int i2 = trigger == null ? -1 : WhenMappings.$EnumSwitchMapping$1[trigger.ordinal()];
        if (i2 == -1) {
            orderType2 = rosetta.order.OrderType.ORDER_TYPE_UNSPECIFIED;
        } else if (i2 == 1) {
            orderType2 = rosetta.order.OrderType.LIMIT;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            orderType2 = rosetta.order.OrderType.STOP_LOSS;
        }
        rosetta.order.OrderType orderType3 = orderType2;
        if (z) {
            positionEffect2 = PositionEffect.OPEN;
        } else {
            positionEffect2 = PositionEffect.CLOSE;
        }
        return MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to(side4, new EquityOrderContext(null, null, side5, orderType3, null, null, null, null, null, null, null, null, null, null, null, null, positionEffect2, null, null, null, 983027, null)));
    }
}
