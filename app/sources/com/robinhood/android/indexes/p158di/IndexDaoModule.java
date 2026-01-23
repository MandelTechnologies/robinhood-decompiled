package com.robinhood.android.indexes.p158di;

import com.robinhood.android.indexes.dao.IndexFundamentalsDao;
import com.robinhood.android.indexes.p157db.IndexDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDaoModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/indexes/di/IndexDaoModule;", "", "<init>", "()V", "provideFundamentalsDao", "Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "indexDatabase", "Lcom/robinhood/android/indexes/db/IndexDatabase;", "lib-models-indexes-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDaoModule {
    public static final IndexDaoModule INSTANCE = new IndexDaoModule();

    private IndexDaoModule() {
    }

    public final IndexFundamentalsDao provideFundamentalsDao(IndexDatabase indexDatabase) {
        Intrinsics.checkNotNullParameter(indexDatabase, "indexDatabase");
        return indexDatabase.indexFundamentalsDao();
    }
}
