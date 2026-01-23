package com.robinhood.android.trade.options;

import com.robinhood.android.equities.tradesettings.TradingSessionViewState;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo4;
import com.robinhood.android.trade.options.extensions.TradingSessionExtensions;
import com.robinhood.android.trade.options.util.OptionOrderTradingSessionVisualizerUtil;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;

/* compiled from: OptionOrderTradingSessionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDataState;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "dataState", "reduce", "(Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDataState;)Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState;", "Lj$/time/Clock;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionStateProvider, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderTradingSessionDuxo3 implements StateProvider<OptionOrderTradingSessionDataState, OptionOrderTradingSessionDuxo4> {
    public static final int $stable = 8;
    private final Clock clock;

    public OptionOrderTradingSessionDuxo3(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionOrderTradingSessionDuxo4 reduce(OptionOrderTradingSessionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getTradingSession() == null || dataState.getMarketHours() == null) {
            return OptionOrderTradingSessionDuxo4.Loading.INSTANCE;
        }
        OrderMarketHours tradingSession = dataState.getTradingSession();
        OrderMarketHours orderMarketHours = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new OptionOrderTradingSessionDuxo4.Loaded(new TradingSessionViewState(tradingSession, extensions2.persistentListOf(new SelectionRowState(orderMarketHours, companion.invoke(C29757R.string.option_order_trading_session_regular_hours_label, new Object[0]), TradingSessionExtensions.getRegularHoursDetailText(dataState.getMarketHours()), false, 8, null), new SelectionRowState(OrderMarketHours.REGULAR_CURB_HOURS, companion.invoke(C29757R.string.option_order_trading_session_extended_hours_label, new Object[0]), TradingSessionExtensions.getCurbHoursDetailText(dataState.getMarketHours()), dataState.getShouldShowNewTagOnExtendedHours())), OptionOrderTradingSessionVisualizerUtil.INSTANCE.getVisualizerArg(dataState.getTradingSession(), dataState.getMarketHours(), this.clock), false, false));
    }
}
