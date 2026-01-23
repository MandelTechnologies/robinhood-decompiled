package com.robinhood.android.common.modelsfxdb.dao;

import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import com.robinhood.utils.room.dao.BaseDaos3;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: McwDisplayCurrenciesDao.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/modelsfxdb/dao/McwDisplayCurrenciesDao;", "Lcom/robinhood/utils/room/dao/SingleInsertDao;", "Lcom/robinhood/models/fx/db/McwDisplayCurrencies;", "streamMcwDisplayCurrencies", "Lkotlinx/coroutines/flow/Flow;", "lib-models-fx-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface McwDisplayCurrenciesDao extends BaseDaos3<McwDisplayCurrencies> {
    Flow<McwDisplayCurrencies> streamMcwDisplayCurrencies();
}
