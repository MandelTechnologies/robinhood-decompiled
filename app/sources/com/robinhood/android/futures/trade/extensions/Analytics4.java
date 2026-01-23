package com.robinhood.android.futures.trade.extensions;

import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Analytics.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toLoggingType", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.extensions.AnalyticsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Analytics4 {
    public static final FuturesOrderButtonContext.OrderType toLoggingType(FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig) {
        Intrinsics.checkNotNullParameter(orderConfig, "<this>");
        if (orderConfig.getType() == FuturesOrderType.LIMIT && orderConfig.getTrigger() == FuturesOrderTrigger.IMMEDIATE) {
            return FuturesOrderButtonContext.OrderType.LIMIT;
        }
        FuturesOrderType type2 = orderConfig.getType();
        FuturesOrderType futuresOrderType = FuturesOrderType.MARKET;
        if (type2 == futuresOrderType && orderConfig.getTrigger() == FuturesOrderTrigger.IMMEDIATE) {
            return FuturesOrderButtonContext.OrderType.MARKET;
        }
        if (orderConfig.getType() == futuresOrderType && orderConfig.getTrigger() == FuturesOrderTrigger.STOP) {
            return FuturesOrderButtonContext.OrderType.STOP;
        }
        throw new IllegalStateException("Stop limit orders are not supported at the moment");
    }
}
