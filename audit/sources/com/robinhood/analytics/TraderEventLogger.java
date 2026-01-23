package com.robinhood.analytics;

import com.adjust.sdk.Constants;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.EquityOrderExecutionData;
import com.robinhood.rosetta.eventlogging.EquityOrderMeta;
import com.robinhood.rosetta.eventlogging.EquityOrderPayload;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OptionOrderPayload;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: TraderEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J&\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0010H&J2\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&J$\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&J \u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH&¨\u0006 "}, m3636d2 = {"Lcom/robinhood/analytics/TraderEventLogger;", "Lcom/robinhood/analytics/SharedEventLogger;", "logEquityOrderEvent", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "equityOrderPayload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "alertType", "", "loggingIdentifier", "orderToReplaceId", "Ljava/util/UUID;", "logEquityOrderExecution", "final", "", "executionData", "", "Lcom/robinhood/rosetta/eventlogging/EquityOrderExecutionData;", "existingOrderId", "logEquityOrderUpdateEvent", "logOptionOrderEvent", "orderRequest", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "optionOrderPayload", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface TraderEventLogger extends SharedEventLogger {
    void logEquityOrderEvent(OrderFormStep step, EquityOrderPayload equityOrderPayload, BrokerageAccountType brokerageAccountType, EquityOrderMeta.Source source, String alertType, String loggingIdentifier, UUID orderToReplaceId);

    void logEquityOrderExecution(boolean z, List<EquityOrderExecutionData> executionData, UUID existingOrderId);

    void logEquityOrderUpdateEvent(OrderFormStep step, UUID existingOrderId, EquityOrderPayload equityOrderPayload, BrokerageAccountType brokerageAccountType, EquityOrderMeta.Source source);

    void logOptionOrderEvent(OrderFormStep step, ApiOptionOrderRequest orderRequest, OptionOrderMeta meta);

    void logOptionOrderEvent(OrderFormStep step, OptionOrderPayload optionOrderPayload, OptionOrderMeta meta);

    /* compiled from: TraderEventLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void logEquityOrderEvent$default(TraderEventLogger traderEventLogger, OrderFormStep orderFormStep, EquityOrderPayload equityOrderPayload, BrokerageAccountType brokerageAccountType, EquityOrderMeta.Source source, String str, String str2, UUID uuid, int i, Object obj) {
            UUID uuid2;
            TraderEventLogger traderEventLogger2;
            OrderFormStep orderFormStep2;
            EquityOrderPayload equityOrderPayload2;
            BrokerageAccountType brokerageAccountType2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEquityOrderEvent");
            }
            if ((i & 8) != 0) {
                source = EquityOrderMeta.Source.SOURCE_UNSPECIFIED;
            }
            EquityOrderMeta.Source source2 = source;
            String str3 = (i & 16) != 0 ? null : str;
            String str4 = (i & 32) != 0 ? null : str2;
            if ((i & 64) != 0) {
                uuid2 = null;
                orderFormStep2 = orderFormStep;
                equityOrderPayload2 = equityOrderPayload;
                brokerageAccountType2 = brokerageAccountType;
                traderEventLogger2 = traderEventLogger;
            } else {
                uuid2 = uuid;
                traderEventLogger2 = traderEventLogger;
                orderFormStep2 = orderFormStep;
                equityOrderPayload2 = equityOrderPayload;
                brokerageAccountType2 = brokerageAccountType;
            }
            traderEventLogger2.logEquityOrderEvent(orderFormStep2, equityOrderPayload2, brokerageAccountType2, source2, str3, str4, uuid2);
        }

        public static /* synthetic */ void logEquityOrderUpdateEvent$default(TraderEventLogger traderEventLogger, OrderFormStep orderFormStep, UUID uuid, EquityOrderPayload equityOrderPayload, BrokerageAccountType brokerageAccountType, EquityOrderMeta.Source source, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEquityOrderUpdateEvent");
            }
            if ((i & 16) != 0) {
                source = EquityOrderMeta.Source.SOURCE_UNSPECIFIED;
            }
            traderEventLogger.logEquityOrderUpdateEvent(orderFormStep, uuid, equityOrderPayload, brokerageAccountType, source);
        }

        public static /* synthetic */ void logOptionOrderEvent$default(TraderEventLogger traderEventLogger, OrderFormStep orderFormStep, ApiOptionOrderRequest apiOptionOrderRequest, OptionOrderMeta optionOrderMeta, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logOptionOrderEvent");
            }
            if ((i & 2) != 0) {
                apiOptionOrderRequest = null;
            }
            traderEventLogger.logOptionOrderEvent(orderFormStep, apiOptionOrderRequest, optionOrderMeta);
        }
    }
}
