package com.robinhood.android.common.modelsfxdb.dao;

import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.utils.room.dao.BaseDaos2;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: McwFxRatesDao.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H'J\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH'J\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/modelsfxdb/dao/McwFxRatesDao;", "Lcom/robinhood/utils/room/dao/MultiInsertDao;", "Lcom/robinhood/models/fx/db/McwFxRate;", "getMcwFxRate", "symbol", "", "streamMcwFxRates", "Lkotlinx/coroutines/flow/Flow;", "", "symbols", "streamMcwFxRate", "lib-models-fx-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface McwFxRatesDao extends BaseDaos2<McwFxRate> {
    McwFxRate getMcwFxRate(String symbol);

    Flow<McwFxRate> streamMcwFxRate(String symbol);

    Flow<List<McwFxRate>> streamMcwFxRates(List<String> symbols);
}
