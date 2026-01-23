package com.robinhood.librobinhood.data.store.dagger;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.librobinhood.data.store.CryptoAcatsStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/dagger/CryptoAcatsHistoryModule;", "", "<init>", "()V", "provideCryptoAcatsHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/CryptoAcatsStore;", "provideCryptoAcatsHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoAcatsHistoryModule {
    public static final CryptoAcatsHistoryModule INSTANCE = new CryptoAcatsHistoryModule();

    private CryptoAcatsHistoryModule() {
    }

    public final HistoryLoaderV2 provideCryptoAcatsHistoryLoaderCallbacks(CryptoAcatsStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new HistoryLoaderV2(store.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_ACATS_TRANSFER)
    public final HistoryTransactionLoader provideCryptoAcatsHistoryTransactionLoader(CryptoAcatsStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getHistoryTransactionLoader();
    }
}
