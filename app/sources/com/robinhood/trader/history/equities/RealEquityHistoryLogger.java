package com.robinhood.trader.history.equities;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.shared.history.equities.EquityHistoryLogger;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealEquityHistoryLogger.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/trader/history/equities/RealEquityHistoryLogger;", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "traderEventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "<init>", "(Lcom/robinhood/analytics/TraderEventLogger;)V", "getTraderEventLogger", "()Lcom/robinhood/analytics/TraderEventLogger;", "logCancelOrderTap", "", "orderId", "Ljava/util/UUID;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "logReplaceOrderTap", "lib-equity-history-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealEquityHistoryLogger implements EquityHistoryLogger {
    private final TraderEventLogger traderEventLogger;

    public RealEquityHistoryLogger(TraderEventLogger traderEventLogger) {
        Intrinsics.checkNotNullParameter(traderEventLogger, "traderEventLogger");
        this.traderEventLogger = traderEventLogger;
    }

    public final TraderEventLogger getTraderEventLogger() {
        return this.traderEventLogger;
    }

    @Override // com.robinhood.shared.history.equities.EquityHistoryLogger
    public void logCancelOrderTap(UUID orderId, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(this.traderEventLogger, OrderFormStep.CANCEL_ORDER, null, accountType, null, null, null, orderId, 56, null);
    }

    @Override // com.robinhood.shared.history.equities.EquityHistoryLogger
    public void logReplaceOrderTap(UUID orderId, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(this.traderEventLogger, OrderFormStep.REPLACE_ORDER, null, accountType, null, null, null, orderId, 56, null);
    }
}
