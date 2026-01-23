package com.robinhood.android.event.history.p131ui.settlement;

import com.robinhood.android.event.history.p131ui.settlement.EventCashSettlementDetailDuxo3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.EventCashSettlement;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateTimeFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventCashSettlementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailDataState;", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.settlement.EventCashSettlementStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventCashSettlementDetailDuxo4 implements StateProvider<EventCashSettlementDetailDataState, EventCashSettlementDetailDuxo3> {
    public static final int $stable = 0;
    public static final EventCashSettlementDetailDuxo4 INSTANCE = new EventCashSettlementDetailDuxo4();

    private EventCashSettlementDetailDuxo4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [j$.time.ZoneId, java.lang.Object] */
    @Override // com.robinhood.android.udf.StateProvider
    public EventCashSettlementDetailDuxo3 reduce(EventCashSettlementDetailDataState dataState) {
        UUID eventId;
        Object obj;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getCashSettlement() == null) {
            return EventCashSettlementDetailDuxo3.Loading.INSTANCE;
        }
        EventCashSettlement cashSettlement = dataState.getCashSettlement();
        EventContract eventContract = dataState.getEventContract();
        if (eventContract != null) {
            eventId = eventContract.getEventId();
            obj = null;
        } else {
            eventId = null;
            obj = null;
        }
        StringResource pageTitle = dataState.getPageTitle();
        ?? r5 = obj;
        StringResource pageSubtitle = dataState.getPageSubtitle();
        EventContract eventContract2 = dataState.getEventContract();
        return new EventCashSettlementDetailDuxo3.Loaded(eventId, pageTitle, pageSubtitle, eventContract2 != null ? eventContract2.getDescription() : r5, LocalDateTimeFormatter.LONG.format(Instants.toLocalDateTime$default(cashSettlement.getEventTime(), r5, 1, r5)), dataState.getSettlementPrice(), Formats.getIntegerFormat().format(cashSettlement.getQuantity()), dataState.getRealizedPnlLabel(), dataState.getRealizedPnlValue());
    }
}
