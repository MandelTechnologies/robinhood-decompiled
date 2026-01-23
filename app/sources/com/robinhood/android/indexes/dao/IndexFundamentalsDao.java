package com.robinhood.android.indexes.dao;

import com.robinhood.android.indexes.models.p159db.IndexFundamentals;
import com.robinhood.utils.room.dao.BaseDaos;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: IndexFundamentalsDao.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH'J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH'¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "Lcom/robinhood/utils/room/dao/InsertDao;", "Lcom/robinhood/android/indexes/models/db/IndexFundamentals;", "getIndexFundamentalsById", "Lkotlinx/coroutines/flow/Flow;", "id", "Ljava/util/UUID;", "getIndexFundamentalsByIds", "", "ids", "getIndexFundamentalsBySymbols", "symbols", "", "lib-models-indexes-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface IndexFundamentalsDao extends BaseDaos<IndexFundamentals> {
    Flow<IndexFundamentals> getIndexFundamentalsById(UUID id);

    Flow<List<IndexFundamentals>> getIndexFundamentalsByIds(List<UUID> ids);

    Flow<List<IndexFundamentals>> getIndexFundamentalsBySymbols(List<String> symbols);
}
