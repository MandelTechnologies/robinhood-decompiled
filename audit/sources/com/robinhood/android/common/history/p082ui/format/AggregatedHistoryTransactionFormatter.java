package com.robinhood.android.common.history.p082ui.format;

import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import kotlin.Metadata;

/* compiled from: AggregatedHistoryTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\b\b\u0000\u0010\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "get", "T", "transaction", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;", "getPlaceholderSummary", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "getSummary", "withholding", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface AggregatedHistoryTransactionFormatter extends HistoryTransactionFormatter<MinervaTransaction> {
    <T extends MinervaTransaction> HistoryTransactionFormatter<T> get(T transaction);

    TransactionSummary getPlaceholderSummary(HistoryEvent historyEvent);

    TransactionSummary getSummary(MinervaTransaction transaction, WithholdingAmount withholding);
}
