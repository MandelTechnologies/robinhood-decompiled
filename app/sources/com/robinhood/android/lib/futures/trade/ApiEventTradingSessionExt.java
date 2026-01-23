package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventTradingSession;
import kotlin.Metadata;

/* compiled from: ApiEventTradingSessionExt.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toUiSession", "Lcom/robinhood/android/lib/futures/trade/Session;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventTradingSession;", "lib-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.futures.trade.ApiEventTradingSessionExtKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ApiEventTradingSessionExt {
    public static final Session toUiSession(ApiEventTradingSession apiEventTradingSession) {
        if (apiEventTradingSession != null) {
            return new Session(apiEventTradingSession.getStartTime(), apiEventTradingSession.getEndTime());
        }
        return null;
    }
}
