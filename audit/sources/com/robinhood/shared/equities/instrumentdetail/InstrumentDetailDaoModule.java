package com.robinhood.shared.equities.instrumentdetail;

import com.robinhood.shared.equities.models.instrumentdetails.dao.EarningDao;
import com.robinhood.shared.equities.models.instrumentdetails.dao.FundamentalDao;
import com.robinhood.shared.equities.models.instrumentdetails.dao.InstrumentRatingsDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailDaoModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDaoModule;", "", "<init>", "()V", "provideEarningDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/EarningDao;", "instrumentDetailDatabase", "Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDatabase;", "provideFundamentalDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/FundamentalDao;", "provideInstrumentRatingsDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/InstrumentRatingsDao;", "lib-instrument-detail-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InstrumentDetailDaoModule {
    public static final InstrumentDetailDaoModule INSTANCE = new InstrumentDetailDaoModule();

    private InstrumentDetailDaoModule() {
    }

    public final EarningDao provideEarningDao(InstrumentDetailDatabase instrumentDetailDatabase) {
        Intrinsics.checkNotNullParameter(instrumentDetailDatabase, "instrumentDetailDatabase");
        return instrumentDetailDatabase.earningDao();
    }

    public final FundamentalDao provideFundamentalDao(InstrumentDetailDatabase instrumentDetailDatabase) {
        Intrinsics.checkNotNullParameter(instrumentDetailDatabase, "instrumentDetailDatabase");
        return instrumentDetailDatabase.fundamentalDao();
    }

    public final InstrumentRatingsDao provideInstrumentRatingsDao(InstrumentDetailDatabase instrumentDetailDatabase) {
        Intrinsics.checkNotNullParameter(instrumentDetailDatabase, "instrumentDetailDatabase");
        return instrumentDetailDatabase.instrumentRatingsDao();
    }
}
