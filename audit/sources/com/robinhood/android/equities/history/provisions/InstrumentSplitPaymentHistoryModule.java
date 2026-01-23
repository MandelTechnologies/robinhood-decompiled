package com.robinhood.android.equities.history.provisions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore;
import com.robinhood.models.p355ui.UiInstrumentSplitPayment;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentSplitPaymentHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equities/history/provisions/InstrumentSplitPaymentHistoryModule;", "", "<init>", "()V", "provideHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/InstrumentSplitPaymentStore;", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class InstrumentSplitPaymentHistoryModule {
    public static final InstrumentSplitPaymentHistoryModule INSTANCE = new InstrumentSplitPaymentHistoryModule();

    private InstrumentSplitPaymentHistoryModule() {
    }

    public final HistoryLoaderV2 provideHistoryLoaderCallbacks(InstrumentSplitPaymentStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        HistoryLoader.Callbacks<UiInstrumentSplitPayment> historyLoaderCallbacks = store.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT)
    public final HistoryTransactionLoader provideHistoryTransactionLoader(InstrumentSplitPaymentStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }
}
