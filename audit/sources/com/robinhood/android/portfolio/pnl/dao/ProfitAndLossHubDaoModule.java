package com.robinhood.android.portfolio.pnl.dao;

import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossHubDaoModule.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossHubDaoModule;", "", "<init>", "()V", "provideProfitAndLossChartDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossChartDao;", "db", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubDatabase;", "provideProfitAndLossRealizedDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;", "provideInstrumentProfitAndLossRealizedDao", "Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "provideProfitAndLossSupportedAssetTypesDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;", "provideProfitAndLossTradeItemDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossHubDaoModule {
    public static final ProfitAndLossHubDaoModule INSTANCE = new ProfitAndLossHubDaoModule();

    private ProfitAndLossHubDaoModule() {
    }

    public final ProfitAndLossChartDao provideProfitAndLossChartDao(ProfitAndLossHubDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.profitAndLossChartDao();
    }

    public final ProfitAndLossRealizedDao provideProfitAndLossRealizedDao(ProfitAndLossHubDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.profitAndLossRealizedDao();
    }

    public final InstrumentProfitAndLossRealizedDao provideInstrumentProfitAndLossRealizedDao(ProfitAndLossHubDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.instrumentProfitAndLossRealizedDao();
    }

    public final ProfitAndLossSupportedAssetTypesDao provideProfitAndLossSupportedAssetTypesDao(ProfitAndLossHubDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.profitAndLossSupportedAssetTypesDao();
    }

    public final ProfitAndLossTradeItemDao provideProfitAndLossTradeItemDao(ProfitAndLossHubDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.profitAndLossTradeItemDao();
    }
}
