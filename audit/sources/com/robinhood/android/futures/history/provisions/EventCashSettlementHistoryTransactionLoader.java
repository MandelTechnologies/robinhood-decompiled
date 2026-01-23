package com.robinhood.android.futures.history.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.event.EventCashSettlementStore;
import com.robinhood.store.event.EventStore;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventCashSettlementHistoryTransactionLoader.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/history/provisions/EventCashSettlementHistoryTransactionLoader;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "cashSettlementStore", "Lcom/robinhood/store/event/EventCashSettlementStore;", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventCashSettlementStore;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventCashSettlementHistoryTransactionLoader implements HistoryTransactionLoader {
    private final EventCashSettlementStore cashSettlementStore;
    private final EventStore eventStore;

    @Override // com.robinhood.shared.history.HistoryTransactionLoader
    public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
        return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
    }

    public EventCashSettlementHistoryTransactionLoader(EventStore eventStore, EventCashSettlementStore cashSettlementStore) {
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(cashSettlementStore, "cashSettlementStore");
        this.eventStore = eventStore;
        this.cashSettlementStore = cashSettlementStore;
    }

    @Override // com.robinhood.shared.history.HistoryTransactionLoader
    public Flow<MinervaTransaction> load(TransactionReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf(HistoryTransactionType.EVENT_EXECUTION));
        return FlowKt.transformLatest(this.cashSettlementStore.streamCashSettlement(reference.getSourceId()), new C17230x8c5dd7a7(null, this));
    }
}
