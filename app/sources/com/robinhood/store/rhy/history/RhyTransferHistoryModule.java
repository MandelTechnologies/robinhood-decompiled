package com.robinhood.store.rhy.history;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTransferHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/rhy/history/RhyTransferHistoryModule;", "", "<init>", "()V", "provideCheckTransferHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", PlaceTypes.STORE, "Lcom/robinhood/store/rhy/history/RhyTransferHistoryStore;", "provideRhyOriginatedAchTransferHistoryTransactionLoader", "provideRhyNonOriginatedAchTransferHistoryTransactionLoader", "provideRhyInterEntityTransferHistoryTransactionLoader", "provideIncomingWireHistoryTransactionLoader", "provideOutgoingWireHistoryTransactionLoader", "provideUkBankTransferHistoryTransactionLoader", "provideUkOpenBankingTransferHistoryTransactionLoader", "provideRolloverTransferHistoryTransactionLoader", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RhyTransferHistoryModule {
    public static final RhyTransferHistoryModule INSTANCE = new RhyTransferHistoryModule();

    private RhyTransferHistoryModule() {
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CHECK_TRANSFER)
    public final HistoryTransactionLoader provideCheckTransferHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER)
    public final HistoryTransactionLoader provideRhyOriginatedAchTransferHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER)
    public final HistoryTransactionLoader provideRhyNonOriginatedAchTransferHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER)
    public final HistoryTransactionLoader provideRhyInterEntityTransferHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.INCOMING_WIRE)
    public final HistoryTransactionLoader provideIncomingWireHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.OUTGOING_WIRE)
    public final HistoryTransactionLoader provideOutgoingWireHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.UK_BANK_TRANSFER)
    public final HistoryTransactionLoader provideUkBankTransferHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.UK_OPEN_BANKING_TRANSFER)
    public final HistoryTransactionLoader provideUkOpenBankingTransferHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.ROLLOVER_ACH)
    public final HistoryTransactionLoader provideRolloverTransferHistoryTransactionLoader(RhyTransferHistoryStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }
}
