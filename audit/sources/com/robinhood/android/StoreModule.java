package com.robinhood.android;

import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.librobinhood.data.store.suitability.TraderSuitabilityStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.DayTradeStore;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import com.robinhood.store.base.InvestmentScheduleStore;
import com.robinhood.store.base.MarketHoursManager;
import com.robinhood.store.base.PortfolioStore;
import com.robinhood.store.base.SuitabilityStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreModule.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/StoreModule;", "", "<init>", "()V", "provideDayTradeStore", "Lcom/robinhood/store/base/DayTradeStore;", "traderDayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "providePortfolioStore", "Lcom/robinhood/store/base/PortfolioStore;", "traderPortfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "provideInvestmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "traderInvestmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "provideInstrumentRecurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "traderRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "provideMarketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "traderMarketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "provideBackupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "traderBackupWithholdingStore", "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore;", "provideSuitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "traderSuitabilityStore", "Lcom/robinhood/librobinhood/data/store/suitability/TraderSuitabilityStore;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class StoreModule {
    public static final StoreModule INSTANCE = new StoreModule();

    public final BackupWithholdingStore provideBackupWithholdingStore(TraderBackupWithholdingStore traderBackupWithholdingStore) {
        Intrinsics.checkNotNullParameter(traderBackupWithholdingStore, "traderBackupWithholdingStore");
        return traderBackupWithholdingStore;
    }

    public final DayTradeStore provideDayTradeStore(TraderDayTradeStore traderDayTradeStore) {
        Intrinsics.checkNotNullParameter(traderDayTradeStore, "traderDayTradeStore");
        return traderDayTradeStore;
    }

    public final InstrumentRecurringTradabilityStore provideInstrumentRecurringTradabilityStore(TraderRecurringTradabilityStore traderRecurringTradabilityStore) {
        Intrinsics.checkNotNullParameter(traderRecurringTradabilityStore, "traderRecurringTradabilityStore");
        return traderRecurringTradabilityStore;
    }

    public final InvestmentScheduleStore provideInvestmentScheduleStore(TraderInvestmentScheduleStore traderInvestmentScheduleStore) {
        Intrinsics.checkNotNullParameter(traderInvestmentScheduleStore, "traderInvestmentScheduleStore");
        return traderInvestmentScheduleStore;
    }

    public final MarketHoursManager provideMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "traderMarketHoursManager");
        return traderMarketHoursManager;
    }

    public final PortfolioStore providePortfolioStore(TraderPortfolioStore traderPortfolioStore) {
        Intrinsics.checkNotNullParameter(traderPortfolioStore, "traderPortfolioStore");
        return traderPortfolioStore;
    }

    public final SuitabilityStore provideSuitabilityStore(TraderSuitabilityStore traderSuitabilityStore) {
        Intrinsics.checkNotNullParameter(traderSuitabilityStore, "traderSuitabilityStore");
        return traderSuitabilityStore;
    }

    private StoreModule() {
    }
}
