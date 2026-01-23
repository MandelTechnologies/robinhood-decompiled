package com.robinhood.android.acats.history.provisions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore;
import com.robinhood.models.acats.p299db.LegacyAcatsTransfer;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyAcatsTransferHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acats/history/provisions/LegacyAcatsTransferHistoryModule;", "", "<init>", "()V", "provideHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class LegacyAcatsTransferHistoryModule {
    public static final LegacyAcatsTransferHistoryModule INSTANCE = new LegacyAcatsTransferHistoryModule();

    private LegacyAcatsTransferHistoryModule() {
    }

    public final HistoryLoaderV2 provideHistoryLoaderCallbacks(LegacyAcatsTransferStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        HistoryLoader.Callbacks<LegacyAcatsTransfer> historyLoaderCallbacks = store.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.LEGACY_ACATS_TRANSFER)
    public final HistoryTransactionLoader provideHistoryTransactionLoader(LegacyAcatsTransferStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }
}
