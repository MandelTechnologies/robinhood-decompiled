package com.robinhood.android.futures.historyformatter.p143di;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.android.futures.historyformatter.EventCashSettlementFormatter;
import com.robinhood.android.futures.historyformatter.FuturesCashCorrectionFormatter;
import com.robinhood.android.futures.historyformatter.FuturesCashSettlementFormatter;
import com.robinhood.android.futures.historyformatter.FuturesOrderFormatter;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesFormattersModule.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/futures/historyformatter/di/FuturesFormattersModule;", "", "<init>", "()V", "provideEventCashCorrectionFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/android/futures/historyformatter/FuturesCashCorrectionFormatter;", "provideFuturesCashCorrectionFormatter", "provideEventsExecutionFormatter", "Lcom/robinhood/android/futures/historyformatter/EventCashSettlementFormatter;", "provideFuturesExecutionFormatter", "Lcom/robinhood/android/futures/historyformatter/FuturesCashSettlementFormatter;", "provideOrderFormatter", "Lcom/robinhood/android/futures/historyformatter/FuturesOrderFormatter;", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesFormattersModule {
    @HistoryFormatterKey(HistoryTransactionType.EVENT_CASH_CORRECTION)
    public final HistoryFormatter provideEventCashCorrectionFormatter(FuturesCashCorrectionFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.FUTURES_CASH_CORRECTION)
    public final HistoryFormatter provideFuturesCashCorrectionFormatter(FuturesCashCorrectionFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.EVENT_EXECUTION)
    public final HistoryFormatter provideEventsExecutionFormatter(EventCashSettlementFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.FUTURES_EXECUTION)
    public final HistoryFormatter provideFuturesExecutionFormatter(FuturesCashSettlementFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.FUTURES_ORDER)
    public final HistoryFormatter provideOrderFormatter(FuturesOrderFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
