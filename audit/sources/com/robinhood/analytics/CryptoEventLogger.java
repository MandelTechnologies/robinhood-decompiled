package com.robinhood.analytics;

import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.rosetta.eventlogging.CryptoOrderMeta;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import kotlin.Metadata;

/* compiled from: CryptoEventLogger.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/analytics/CryptoEventLogger;", "Lcom/robinhood/analytics/SharedEventLogger;", "logCryptoOrderEvent", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "orderRequest", "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "monetizationModel", "Lcom/robinhood/models/api/fee/MonetizationModel;", "cryptoOrderMeta", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta;", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface CryptoEventLogger extends SharedEventLogger {
    void logCryptoOrderEvent(OrderFormStep step, ApiCryptoOrderRequest orderRequest, MonetizationModel monetizationModel, CryptoOrderMeta cryptoOrderMeta);

    /* compiled from: CryptoEventLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void logCryptoOrderEvent$default(CryptoEventLogger cryptoEventLogger, OrderFormStep orderFormStep, ApiCryptoOrderRequest apiCryptoOrderRequest, MonetizationModel monetizationModel, CryptoOrderMeta cryptoOrderMeta, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logCryptoOrderEvent");
            }
            if ((i & 8) != 0) {
                cryptoOrderMeta = null;
            }
            cryptoEventLogger.logCryptoOrderEvent(orderFormStep, apiCryptoOrderRequest, monetizationModel, cryptoOrderMeta);
        }
    }
}
