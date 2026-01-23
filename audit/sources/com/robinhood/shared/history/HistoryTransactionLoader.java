package com.robinhood.shared.history;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: HistoryTransactionLoader.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/history/HistoryTransactionLoader;", "", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "event", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface HistoryTransactionLoader {
    Flow<MinervaTransaction> load(HistoryEvent event);

    Flow<MinervaTransaction> load(TransactionReference reference);

    /* compiled from: HistoryTransactionLoader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Flow<MinervaTransaction> load(HistoryTransactionLoader historyTransactionLoader, HistoryEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return historyTransactionLoader.load(event.getTransactionReference());
        }
    }
}
