package com.robinhood.librobinhood.data.store.rhy;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyInternalTransferHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhyInternalTransferHistoryModule;", "", "<init>", "()V", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/rhy/RhyInternalTransferHistoryStore;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyInternalTransferHistoryModule {
    public static final RhyInternalTransferHistoryModule INSTANCE = new RhyInternalTransferHistoryModule();

    private RhyInternalTransferHistoryModule() {
    }

    @HistoryTransactionLoader2(HistoryTransactionType.INTERNAL_TRANSFER)
    public final HistoryTransactionLoader provideHistoryTransactionLoader(RhyInternalTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }
}
