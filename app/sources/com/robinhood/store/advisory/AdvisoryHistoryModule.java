package com.robinhood.store.advisory;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryHistoryModule;", "", "<init>", "()V", "provideAdvisorTradeHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", PlaceTypes.STORE, "Lcom/robinhood/store/advisory/AdvisorTradesStore;", "provideAdvisorTradeHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideAdvisorFeeHistoryLoaderCallbacks", "Lcom/robinhood/store/advisory/AdvisoryFeeStore;", "provideAdvisoryFeeHistoryTransactionLoader", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AdvisoryHistoryModule {
    public static final AdvisoryHistoryModule INSTANCE = new AdvisoryHistoryModule();

    private AdvisoryHistoryModule() {
    }

    public final HistoryLoaderV2 provideAdvisorTradeHistoryLoaderCallbacks(AdvisorTradesStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new HistoryLoaderV2(store.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.ADVISOR_TRADE)
    public final HistoryTransactionLoader provideAdvisorTradeHistoryTransactionLoader(AdvisorTradesStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }

    public final HistoryLoaderV2 provideAdvisorFeeHistoryLoaderCallbacks(AdvisoryFeeStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new HistoryLoaderV2(store.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.ADVISORY_FEE)
    public final HistoryTransactionLoader provideAdvisoryFeeHistoryTransactionLoader(AdvisoryFeeStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getTransactionLoader();
    }
}
