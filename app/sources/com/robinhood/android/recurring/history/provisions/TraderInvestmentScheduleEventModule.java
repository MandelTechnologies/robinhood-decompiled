package com.robinhood.android.recurring.history.provisions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderInvestmentScheduleEventModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/recurring/history/provisions/TraderInvestmentScheduleEventModule;", "", "<init>", "()V", "provideInvestmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleEventStore;", "provideInvestmentScheduleEventHistoryCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "investmentScheduleEventStore", "provideInvestmentScheduleEventWithBuyingPowerHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideInvestmentScheduleEventWithAchHistoryTransactionLoader", "provideCryptoInvestmentScheduleWithBuyingPowerHistoryTransactionLoader", "provideCryptoInvestmentScheduleWithAchHistoryTransactionLoader", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TraderInvestmentScheduleEventModule {
    public static final TraderInvestmentScheduleEventModule INSTANCE = new TraderInvestmentScheduleEventModule();

    public final InvestmentScheduleEventStore provideInvestmentScheduleEventStore(TraderInvestmentScheduleEventStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store;
    }

    private TraderInvestmentScheduleEventModule() {
    }

    public final HistoryLoaderV2 provideInvestmentScheduleEventHistoryCallbacks(TraderInvestmentScheduleEventStore investmentScheduleEventStore) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        return new HistoryLoaderV2(investmentScheduleEventStore.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER)
    /* renamed from: provideInvestmentScheduleEventWithBuyingPowerHistoryTransactionLoader */
    public final HistoryTransactionLoader m2395x44ec4e51(TraderInvestmentScheduleEventStore investmentScheduleEventStore) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        return investmentScheduleEventStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH)
    public final HistoryTransactionLoader provideInvestmentScheduleEventWithAchHistoryTransactionLoader(TraderInvestmentScheduleEventStore investmentScheduleEventStore) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        return investmentScheduleEventStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER)
    /* renamed from: provideCryptoInvestmentScheduleWithBuyingPowerHistoryTransactionLoader */
    public final HistoryTransactionLoader m2394x50276914(TraderInvestmentScheduleEventStore investmentScheduleEventStore) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        return investmentScheduleEventStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH)
    public final HistoryTransactionLoader provideCryptoInvestmentScheduleWithAchHistoryTransactionLoader(TraderInvestmentScheduleEventStore investmentScheduleEventStore) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        return investmentScheduleEventStore.getTransactionLoader();
    }
}
