package com.robinhood.android.recurring.history.provisions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/recurring/history/provisions/InvestmentScheduleHistoryModule;", "", "<init>", "()V", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "provideWithAccountTypeHistoryTransactionLoader", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class InvestmentScheduleHistoryModule {
    public static final InvestmentScheduleHistoryModule INSTANCE = new InvestmentScheduleHistoryModule();

    private InvestmentScheduleHistoryModule() {
    }

    @HistoryTransactionLoader2(HistoryTransactionType.INVESTMENT_SCHEDULE)
    public final HistoryTransactionLoader provideHistoryTransactionLoader(TraderInvestmentScheduleStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getInvestmentScheduleTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.INVESTMENT_SCHEDULE_WITH_ACCOUNT_TYPE)
    public final HistoryTransactionLoader provideWithAccountTypeHistoryTransactionLoader(TraderInvestmentScheduleStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getInvestmentScheduleWithAccountTypeTransactionLoader();
    }
}
