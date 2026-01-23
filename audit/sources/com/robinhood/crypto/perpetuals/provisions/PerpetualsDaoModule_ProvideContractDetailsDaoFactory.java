package com.robinhood.crypto.perpetuals.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDetailsDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualsDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualsDaoModule_ProvideContractDetailsDaoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/provisions/PerpetualsDaoModule_ProvideContractDetailsDaoFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDetailsDao;", "db", "Ljavax/inject/Provider;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualsDatabase;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PerpetualsDaoModule_ProvideContractDetailsDaoFactory implements Factory<PerpetualContractDetailsDao> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PerpetualsDatabase> db;

    @JvmStatic
    public static final PerpetualsDaoModule_ProvideContractDetailsDaoFactory create(Provider<PerpetualsDatabase> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final PerpetualContractDetailsDao provideContractDetailsDao(PerpetualsDatabase perpetualsDatabase) {
        return INSTANCE.provideContractDetailsDao(perpetualsDatabase);
    }

    public PerpetualsDaoModule_ProvideContractDetailsDaoFactory(Provider<PerpetualsDatabase> db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
    }

    @Override // javax.inject.Provider
    public PerpetualContractDetailsDao get() {
        Companion companion = INSTANCE;
        PerpetualsDatabase perpetualsDatabase = this.db.get();
        Intrinsics.checkNotNullExpressionValue(perpetualsDatabase, "get(...)");
        return companion.provideContractDetailsDao(perpetualsDatabase);
    }

    /* compiled from: PerpetualsDaoModule_ProvideContractDetailsDaoFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/provisions/PerpetualsDaoModule_ProvideContractDetailsDaoFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/crypto/perpetuals/provisions/PerpetualsDaoModule_ProvideContractDetailsDaoFactory;", "db", "Ljavax/inject/Provider;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualsDatabase;", "provideContractDetailsDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDetailsDao;", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PerpetualsDaoModule_ProvideContractDetailsDaoFactory create(Provider<PerpetualsDatabase> db) {
            Intrinsics.checkNotNullParameter(db, "db");
            return new PerpetualsDaoModule_ProvideContractDetailsDaoFactory(db);
        }

        @JvmStatic
        public final PerpetualContractDetailsDao provideContractDetailsDao(PerpetualsDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Object objCheckNotNull = Preconditions.checkNotNull(PerpetualsDaoModule.INSTANCE.provideContractDetailsDao(db), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (PerpetualContractDetailsDao) objCheckNotNull;
        }
    }
}
