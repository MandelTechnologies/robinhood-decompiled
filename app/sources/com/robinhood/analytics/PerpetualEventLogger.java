package com.robinhood.analytics;

import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.PerpetualOrderPayloadDto;
import kotlin.Metadata;

/* compiled from: PerpetualEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/PerpetualEventLogger;", "Lcom/robinhood/analytics/SharedEventLogger;", "logPerpetualOrderEvent", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "payload", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto;", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface PerpetualEventLogger extends SharedEventLogger {
    void logPerpetualOrderEvent(OrderFormStep step, PerpetualOrderPayloadDto payload);
}
