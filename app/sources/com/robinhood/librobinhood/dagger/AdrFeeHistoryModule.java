package com.robinhood.librobinhood.dagger;

import com.robinhood.librobinhood.data.store.AdrFeeStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdrFeeHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/AdrFeeHistoryModule;", "", "<init>", "()V", "provideHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "adrFeeStore", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AdrFeeHistoryModule {
    public static final AdrFeeHistoryModule INSTANCE = new AdrFeeHistoryModule();

    private AdrFeeHistoryModule() {
    }

    public final HistoryLoaderV2 provideHistoryLoaderCallbacks(AdrFeeStore adrFeeStore) {
        Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
        return new HistoryLoaderV2(adrFeeStore.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.ADR_FEE)
    public final HistoryTransactionLoader provideHistoryTransactionLoader(AdrFeeStore adrFeeStore) {
        Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
        return adrFeeStore.getTransactionLoader();
    }
}
