package com.robinhood.android.futures.history.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.futures.FuturesCashSettlementStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesCashSettlementHistoryTransactionLoader.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/history/provisions/FuturesCashSettlementHistoryTransactionLoader;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "cashSettlementStore", "Lcom/robinhood/store/futures/FuturesCashSettlementStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "<init>", "(Lcom/robinhood/store/futures/FuturesCashSettlementStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesCashSettlementHistoryTransactionLoader implements HistoryTransactionLoader {
    private final FuturesCashSettlementStore cashSettlementStore;
    private final FuturesContractStore futuresContractStore;

    @Override // com.robinhood.shared.history.HistoryTransactionLoader
    public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
        return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
    }

    public FuturesCashSettlementHistoryTransactionLoader(FuturesCashSettlementStore cashSettlementStore, FuturesContractStore futuresContractStore) {
        Intrinsics.checkNotNullParameter(cashSettlementStore, "cashSettlementStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        this.cashSettlementStore = cashSettlementStore;
        this.futuresContractStore = futuresContractStore;
    }

    @Override // com.robinhood.shared.history.HistoryTransactionLoader
    public Flow<MinervaTransaction> load(TransactionReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf(HistoryTransactionType.FUTURES_EXECUTION));
        return FlowKt.transformLatest(this.cashSettlementStore.streamExecution(reference.getSourceId()), new C17233x64873d1d(null, this));
    }
}
