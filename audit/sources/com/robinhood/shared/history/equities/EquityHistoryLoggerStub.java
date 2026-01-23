package com.robinhood.shared.history.equities;

import com.robinhood.models.api.BrokerageAccountType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityHistoryLoggerStub.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/history/equities/EquityHistoryLoggerStub;", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "<init>", "()V", "logCancelOrderTap", "", "orderId", "Ljava/util/UUID;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "logReplaceOrderTap", "lib-equity-history-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EquityHistoryLoggerStub implements EquityHistoryLogger {
    @Override // com.robinhood.shared.history.equities.EquityHistoryLogger
    public void logCancelOrderTap(UUID orderId, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
    }

    @Override // com.robinhood.shared.history.equities.EquityHistoryLogger
    public void logReplaceOrderTap(UUID orderId, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
    }
}
