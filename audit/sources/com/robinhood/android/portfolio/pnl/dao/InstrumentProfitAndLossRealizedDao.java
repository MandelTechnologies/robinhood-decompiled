package com.robinhood.android.portfolio.pnl.dao;

import com.robinhood.android.portfolio.pnl.p214db.InstrumentProfitAndLossRealized;
import com.robinhood.utils.room.dao.BaseDaos3;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InstrumentProfitAndLossRealizedDao.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "Lcom/robinhood/utils/room/dao/SingleInsertDao;", "Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "streamRealized", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface InstrumentProfitAndLossRealizedDao extends BaseDaos3<InstrumentProfitAndLossRealized> {
    Flow<InstrumentProfitAndLossRealized> streamRealized(String accountNumber, UUID instrumentId);
}
