package com.robinhood.android.eventcontracts.trade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.store.event.ProposalData;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: EventsOrderContextFactory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/EventsOrderContextFactory;", "", "<init>", "()V", "Ljava/util/UUID;", "refId", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "account", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "quote", "Lcom/robinhood/store/event/ProposalData;", "comboProposal", "contractId", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "orderSide", "Ljava/math/BigDecimal;", "limitPrice", "quantity", "enteredNotionalAmount", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "timeInForce", "j$/time/Instant", "gtdExpirationTime", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/event/db/marketdata/EventQuote;Lcom/robinhood/store/event/ProposalData;Ljava/util/UUID;Lcom/robinhood/android/models/event/db/order/EventOrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lj$/time/Instant;)Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventsOrderContextFactory {
    public static final EventsOrderContextFactory INSTANCE = new EventsOrderContextFactory();

    private EventsOrderContextFactory() {
    }

    public final UiEventOrderContext create(UUID refId, FuturesAccount account, EventQuote quote, ProposalData comboProposal, UUID contractId, EventOrderSide orderSide, BigDecimal limitPrice, BigDecimal quantity, BigDecimal enteredNotionalAmount, FuturesTimeInForce timeInForce, Instant gtdExpirationTime) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        return new UiEventOrderContext(new UiEventOrderContext.OrderRequest(refId, quantity, limitPrice, CollectionsKt.listOf(new UiEventOrderContext.Leg(contractId, orderSide)), enteredNotionalAmount, timeInForce, gtdExpirationTime), new UiEventOrderContext.RequestContext(account, quote, comboProposal));
    }
}
