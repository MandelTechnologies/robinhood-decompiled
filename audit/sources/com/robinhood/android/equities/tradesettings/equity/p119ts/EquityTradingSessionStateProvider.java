package com.robinhood.android.equities.tradesettings.equity.p119ts;

import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EquityTradingSessionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionViewState;", "<init>", "()V", "reduce", "dataState", "generateDisclosure", "Lcom/robinhood/utils/resource/StringResource;", "generateDisclosure$lib_trade_settings_externalDebug", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityTradingSessionStateProvider implements StateProvider<EquityTradingSessionDataState, EquityTradingSessionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EquityTradingSessionViewState reduce(EquityTradingSessionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new EquityTradingSessionViewState(dataState.getLongOrderTradingSession(), dataState.getLongSelectionOptions(), dataState.getShortingEnabled(), dataState.getShortOrderTradingSession(), dataState.getShortSelectionOptions(), generateDisclosure$lib_trade_settings_externalDebug(dataState), true);
    }

    public final StringResource generateDisclosure$lib_trade_settings_externalDebug(EquityTradingSessionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OrderMarketHours longOrderTradingSession = dataState.getLongOrderTradingSession();
        OrderMarketHours orderMarketHours = OrderMarketHours.EXTENDED_HOURS;
        boolean z = true;
        boolean z2 = longOrderTradingSession == orderMarketHours;
        boolean z3 = dataState.getLongOrderTradingSession() == OrderMarketHours.ALL_DAY_HOURS;
        boolean z4 = dataState.getShortOrderTradingSession() == orderMarketHours;
        if (!z2 && (!dataState.getShortingEnabled() || !z4)) {
            z = false;
        }
        if (!z && !z3) {
            return null;
        }
        ImmutableList<SelectionRowState<OrderMarketHours>> longSelectionOptions = dataState.getLongSelectionOptions();
        if (longSelectionOptions == null || !longSelectionOptions.isEmpty()) {
            Iterator<SelectionRowState<OrderMarketHours>> it = longSelectionOptions.iterator();
            while (it.hasNext()) {
                if (it.next().getOption() == OrderMarketHours.ALL_DAY_HOURS) {
                    return StringResource.INSTANCE.invoke(C14990R.string.trading_session_eh_24_disclosure, new Object[0]);
                }
            }
        }
        if (z) {
            return StringResource.INSTANCE.invoke(C14990R.string.trading_session_eh_disclosure, new Object[0]);
        }
        return null;
    }
}
