package com.robinhood.shared.history.equities;

import com.robinhood.models.api.BrokerageAccountType;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: EquityHistoryLogger.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "", "logCancelOrderTap", "", "orderId", "Ljava/util/UUID;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "logReplaceOrderTap", "lib-equity-history-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface EquityHistoryLogger {
    void logCancelOrderTap(UUID orderId, BrokerageAccountType accountType);

    void logReplaceOrderTap(UUID orderId, BrokerageAccountType accountType);
}
