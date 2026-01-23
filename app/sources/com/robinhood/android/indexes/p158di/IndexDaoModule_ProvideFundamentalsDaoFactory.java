package com.robinhood.android.indexes.p158di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.dao.IndexFundamentalsDao;
import com.robinhood.android.indexes.p157db.IndexDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDaoModule_ProvideFundamentalsDaoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/indexes/di/IndexDaoModule_ProvideFundamentalsDaoFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "indexDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/db/IndexDatabase;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-models-indexes-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDaoModule_ProvideFundamentalsDaoFactory implements Factory<IndexFundamentalsDao> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IndexDatabase> indexDatabase;

    @JvmStatic
    public static final IndexDaoModule_ProvideFundamentalsDaoFactory create(Provider<IndexDatabase> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final IndexFundamentalsDao provideFundamentalsDao(IndexDatabase indexDatabase) {
        return INSTANCE.provideFundamentalsDao(indexDatabase);
    }

    public IndexDaoModule_ProvideFundamentalsDaoFactory(Provider<IndexDatabase> indexDatabase) {
        Intrinsics.checkNotNullParameter(indexDatabase, "indexDatabase");
        this.indexDatabase = indexDatabase;
    }

    @Override // javax.inject.Provider
    public IndexFundamentalsDao get() {
        Companion companion = INSTANCE;
        IndexDatabase indexDatabase = this.indexDatabase.get();
        Intrinsics.checkNotNullExpressionValue(indexDatabase, "get(...)");
        return companion.provideFundamentalsDao(indexDatabase);
    }

    /* compiled from: IndexDaoModule_ProvideFundamentalsDaoFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/indexes/di/IndexDaoModule_ProvideFundamentalsDaoFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/di/IndexDaoModule_ProvideFundamentalsDaoFactory;", "indexDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/db/IndexDatabase;", "provideFundamentalsDao", "Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "lib-models-indexes-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexDaoModule_ProvideFundamentalsDaoFactory create(Provider<IndexDatabase> indexDatabase) {
            Intrinsics.checkNotNullParameter(indexDatabase, "indexDatabase");
            return new IndexDaoModule_ProvideFundamentalsDaoFactory(indexDatabase);
        }

        @JvmStatic
        public final IndexFundamentalsDao provideFundamentalsDao(IndexDatabase indexDatabase) {
            Intrinsics.checkNotNullParameter(indexDatabase, "indexDatabase");
            Object objCheckNotNull = Preconditions.checkNotNull(IndexDaoModule.INSTANCE.provideFundamentalsDao(indexDatabase), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (IndexFundamentalsDao) objCheckNotNull;
        }
    }
}
