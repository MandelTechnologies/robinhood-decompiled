package com.robinhood.android.internalassettransfer.p161db;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.internalassettransfer.p328db.dao.InternalAssetTransferDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferDaoModule_ProvideInternalAssetTransferDaoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfer/db/InternalAssetTransferDaoModule_ProvideInternalAssetTransferDaoFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/models/internalassettransfer/db/dao/InternalAssetTransferDao;", "internalAssetTransferDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/android/internalassettransfer/db/InternalAssetTransferDatabase;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-internal-asset-transfers-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfer.db.InternalAssetTransferDaoModule_ProvideInternalAssetTransferDaoFactory */
/* loaded from: classes17.dex */
public final class C18954xb4260634 implements Factory<InternalAssetTransferDao> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InternalAssetTransferDatabase> internalAssetTransferDatabase;

    @JvmStatic
    public static final C18954xb4260634 create(Provider<InternalAssetTransferDatabase> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final InternalAssetTransferDao provideInternalAssetTransferDao(InternalAssetTransferDatabase internalAssetTransferDatabase) {
        return INSTANCE.provideInternalAssetTransferDao(internalAssetTransferDatabase);
    }

    public C18954xb4260634(Provider<InternalAssetTransferDatabase> internalAssetTransferDatabase) {
        Intrinsics.checkNotNullParameter(internalAssetTransferDatabase, "internalAssetTransferDatabase");
        this.internalAssetTransferDatabase = internalAssetTransferDatabase;
    }

    @Override // javax.inject.Provider
    public InternalAssetTransferDao get() {
        Companion companion = INSTANCE;
        InternalAssetTransferDatabase internalAssetTransferDatabase = this.internalAssetTransferDatabase.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransferDatabase, "get(...)");
        return companion.provideInternalAssetTransferDao(internalAssetTransferDatabase);
    }

    /* compiled from: InternalAssetTransferDaoModule_ProvideInternalAssetTransferDaoFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfer/db/InternalAssetTransferDaoModule_ProvideInternalAssetTransferDaoFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/internalassettransfer/db/InternalAssetTransferDaoModule_ProvideInternalAssetTransferDaoFactory;", "internalAssetTransferDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/android/internalassettransfer/db/InternalAssetTransferDatabase;", "provideInternalAssetTransferDao", "Lcom/robinhood/models/internalassettransfer/db/dao/InternalAssetTransferDao;", "lib-internal-asset-transfers-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfer.db.InternalAssetTransferDaoModule_ProvideInternalAssetTransferDaoFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C18954xb4260634 create(Provider<InternalAssetTransferDatabase> internalAssetTransferDatabase) {
            Intrinsics.checkNotNullParameter(internalAssetTransferDatabase, "internalAssetTransferDatabase");
            return new C18954xb4260634(internalAssetTransferDatabase);
        }

        @JvmStatic
        public final InternalAssetTransferDao provideInternalAssetTransferDao(InternalAssetTransferDatabase internalAssetTransferDatabase) {
            Intrinsics.checkNotNullParameter(internalAssetTransferDatabase, "internalAssetTransferDatabase");
            Object objCheckNotNull = Preconditions.checkNotNull(InternalAssetTransferDaoModule.INSTANCE.provideInternalAssetTransferDao(internalAssetTransferDatabase), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (InternalAssetTransferDao) objCheckNotNull;
        }
    }
}
