package com.robinhood.shared.store.history;

import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: UnknownHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/store/history/UnknownHistoryStore;", "", "<init>", "()V", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "streamUnknownTransaction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class UnknownHistoryStore {
    public static final UnknownHistoryStore INSTANCE = new UnknownHistoryStore();
    private static final HistoryTransactionLoader historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.shared.store.history.UnknownHistoryStore$historyTransactionLoader$1
        @Override // com.robinhood.shared.history.HistoryTransactionLoader
        public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
            return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
        }

        @Override // com.robinhood.shared.history.HistoryTransactionLoader
        public final Flow<MinervaTransaction> load(TransactionReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return UnknownHistoryStore.INSTANCE.streamUnknownTransaction(it);
        }
    };

    private UnknownHistoryStore() {
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return historyTransactionLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<MinervaTransaction> streamUnknownTransaction(TransactionReference reference) {
        HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.UNKNOWN);
        return FlowKt.emptyFlow();
    }
}
