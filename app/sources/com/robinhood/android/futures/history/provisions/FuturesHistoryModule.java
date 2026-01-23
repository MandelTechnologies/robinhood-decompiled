package com.robinhood.android.futures.history.provisions;

import com.robinhood.android.models.event.p186db.ceres.EventCashSettlement;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import com.robinhood.android.models.futures.p189db.FuturesCashSettlement;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.store.event.EventCashSettlementStore;
import com.robinhood.store.futures.FuturesCashCorrectionStore;
import com.robinhood.store.futures.FuturesCashSettlementStore;
import com.robinhood.store.futures.FuturesOrderStore;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0007J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/futures/history/provisions/FuturesHistoryModule;", "", "<init>", "()V", "provideCashCorrectionsHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "cashCorrectionStore", "Lcom/robinhood/store/futures/FuturesCashCorrectionStore;", "provideEventsCashCorrectionsHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideFuturesCashCorrectionsHistoryTransactionLoader", "provideExecutionsHistoryLoaderCallbacks", "executionStore", "Lcom/robinhood/store/futures/FuturesCashSettlementStore;", "provideEventCashSettlementHistoryLoaderCallbacks", "eventCashSettlementStore", "Lcom/robinhood/store/event/EventCashSettlementStore;", "provideEventCashSettlementHistoryTransactionLoader", "loader", "Lcom/robinhood/android/futures/history/provisions/EventCashSettlementHistoryTransactionLoader;", "provideFuturesCashSettlementHistoryLoaderCallbacks", "futuresCashSettlementStore", "provideFuturesCashSettlementHistoryTransactionLoader", "Lcom/robinhood/android/futures/history/provisions/FuturesCashSettlementHistoryTransactionLoader;", "provideFuturesOrderHistoryLoaderCallbacks", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "provideFuturesHistoryTransactionLoader", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesHistoryModule {
    public static final FuturesHistoryModule INSTANCE = new FuturesHistoryModule();

    @HistoryTransactionLoader2(HistoryTransactionType.EVENT_EXECUTION)
    public final HistoryTransactionLoader provideEventCashSettlementHistoryTransactionLoader(EventCashSettlementHistoryTransactionLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        return loader;
    }

    @HistoryTransactionLoader2(HistoryTransactionType.FUTURES_EXECUTION)
    public final HistoryTransactionLoader provideFuturesCashSettlementHistoryTransactionLoader(FuturesCashSettlementHistoryTransactionLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        return loader;
    }

    private FuturesHistoryModule() {
    }

    public final HistoryLoaderV2 provideCashCorrectionsHistoryLoaderCallbacks(FuturesCashCorrectionStore cashCorrectionStore) {
        Intrinsics.checkNotNullParameter(cashCorrectionStore, "cashCorrectionStore");
        HistoryLoader.Callbacks<FuturesCashCorrection> historyLoaderCallbacks = cashCorrectionStore.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.EVENT_CASH_CORRECTION)
    public final HistoryTransactionLoader provideEventsCashCorrectionsHistoryTransactionLoader(FuturesCashCorrectionStore cashCorrectionStore) {
        Intrinsics.checkNotNullParameter(cashCorrectionStore, "cashCorrectionStore");
        return cashCorrectionStore.getHistoryTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.FUTURES_CASH_CORRECTION)
    public final HistoryTransactionLoader provideFuturesCashCorrectionsHistoryTransactionLoader(FuturesCashCorrectionStore cashCorrectionStore) {
        Intrinsics.checkNotNullParameter(cashCorrectionStore, "cashCorrectionStore");
        return cashCorrectionStore.getHistoryTransactionLoader();
    }

    public final HistoryLoaderV2 provideExecutionsHistoryLoaderCallbacks(FuturesCashSettlementStore executionStore) {
        Intrinsics.checkNotNullParameter(executionStore, "executionStore");
        HistoryLoader.Callbacks<FuturesCashSettlement> historyLoaderCallbacks = executionStore.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    public final HistoryLoaderV2 provideEventCashSettlementHistoryLoaderCallbacks(EventCashSettlementStore eventCashSettlementStore) {
        Intrinsics.checkNotNullParameter(eventCashSettlementStore, "eventCashSettlementStore");
        HistoryLoader.Callbacks<EventCashSettlement> historyLoaderCallbacks = eventCashSettlementStore.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    public final HistoryLoaderV2 provideFuturesCashSettlementHistoryLoaderCallbacks(FuturesCashSettlementStore futuresCashSettlementStore) {
        Intrinsics.checkNotNullParameter(futuresCashSettlementStore, "futuresCashSettlementStore");
        HistoryLoader.Callbacks<FuturesCashSettlement> historyLoaderCallbacks = futuresCashSettlementStore.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    public final HistoryLoaderV2 provideFuturesOrderHistoryLoaderCallbacks(FuturesOrderStore futuresOrderStore) {
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        HistoryLoader.Callbacks<UiFuturesOrder> historyLoaderCallbacks = futuresOrderStore.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.FUTURES_ORDER)
    public final HistoryTransactionLoader provideFuturesHistoryTransactionLoader(FuturesOrderStore futuresOrderStore) {
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        return futuresOrderStore.getHistoryTransactionLoader();
    }
}
