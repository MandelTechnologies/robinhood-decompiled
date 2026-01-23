package com.robinhood.trader.history.equities;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.shared.history.equities.EquityHistoryLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityHistoryLoggerProviderModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/trader/history/equities/EquityHistoryLoggerProviderModule;", "", "<init>", "()V", "providesEquityHistoryLogger", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "traderEventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "lib-equity-history-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EquityHistoryLoggerProviderModule {
    public static final EquityHistoryLoggerProviderModule INSTANCE = new EquityHistoryLoggerProviderModule();

    private EquityHistoryLoggerProviderModule() {
    }

    public final EquityHistoryLogger providesEquityHistoryLogger(TraderEventLogger traderEventLogger) {
        Intrinsics.checkNotNullParameter(traderEventLogger, "traderEventLogger");
        return new RealEquityHistoryLogger(traderEventLogger);
    }
}
