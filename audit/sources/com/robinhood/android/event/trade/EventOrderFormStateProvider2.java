package com.robinhood.android.event.trade;

import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
import com.robinhood.utils.extensions.Uuids;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EventOrderFormStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, m3636d2 = {"createLoggingContext", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;", "toProtoLoggingModel", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.EventOrderFormStateProviderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderFormStateProvider2 {

    /* compiled from: EventOrderFormStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EventOrderSide.values().length];
            try {
                iArr[EventOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventOrderPositionEffect.values().length];
            try {
                iArr2[EventOrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EventOrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventContractOrderContext createLoggingContext(EventOrderFormDataState eventOrderFormDataState) {
        String strSafeToString = Uuids.safeToString(eventOrderFormDataState.getEventContractId());
        EventContractOrderContext.OrderSide protoLoggingModel = toProtoLoggingModel(eventOrderFormDataState.getSide());
        EventContractOrderContext.EventOrderPositionEffect protoLoggingModel2 = toProtoLoggingModel(eventOrderFormDataState.getPositionEffect());
        BigDecimal quantity$feature_event_trade_externalDebug = eventOrderFormDataState.getQuantity$feature_event_trade_externalDebug();
        long jLongValue = quantity$feature_event_trade_externalDebug != null ? quantity$feature_event_trade_externalDebug.longValue() : 0L;
        String strSafeToString2 = Uuids.safeToString(eventOrderFormDataState.getRefId());
        BigDecimal submissionPrice$feature_event_trade_externalDebug = eventOrderFormDataState.getSubmissionPrice$feature_event_trade_externalDebug();
        return new EventContractOrderContext(strSafeToString, protoLoggingModel, protoLoggingModel2, new EventContractOrderContext.OrderRequestContext(jLongValue, strSafeToString2, submissionPrice$feature_event_trade_externalDebug != null ? submissionPrice$feature_event_trade_externalDebug.doubleValue() : 0.0d, null, 8, null), null, 16, null);
    }

    private static final EventContractOrderContext.OrderSide toProtoLoggingModel(EventOrderSide eventOrderSide) {
        int i = WhenMappings.$EnumSwitchMapping$0[eventOrderSide.ordinal()];
        if (i == 1) {
            return EventContractOrderContext.OrderSide.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return EventContractOrderContext.OrderSide.SELL;
    }

    private static final EventContractOrderContext.EventOrderPositionEffect toProtoLoggingModel(EventOrderPositionEffect eventOrderPositionEffect) {
        int i = WhenMappings.$EnumSwitchMapping$1[eventOrderPositionEffect.ordinal()];
        if (i == 1) {
            return EventContractOrderContext.EventOrderPositionEffect.OPEN;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return EventContractOrderContext.EventOrderPositionEffect.CLOSE;
    }
}
