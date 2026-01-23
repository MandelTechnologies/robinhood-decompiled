package com.robinhood.librobinhood.dagger;

import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/EquityOrderHistoryModule;", "", "<init>", "()V", "provideHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class EquityOrderHistoryModule {
    public static final EquityOrderHistoryModule INSTANCE = new EquityOrderHistoryModule();

    private EquityOrderHistoryModule() {
    }

    public final HistoryLoaderV2 provideHistoryLoaderCallbacks(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        return new HistoryLoaderV2(orderStore.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.EQUITY_ORDER)
    public final HistoryTransactionLoader provideHistoryTransactionLoader(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        return orderStore.getTransactionLoader();
    }
}
