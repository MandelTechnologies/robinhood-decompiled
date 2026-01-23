package com.robinhood.analytics.dao;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedLegacyEventDaoModule_ProvideDaoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\"\u0012\u0019\u0010\u0003\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R!\u0010\u0003\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/analytics/dao/SharedLegacyEventDaoModule_ProvideDaoFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "db", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class SharedLegacyEventDaoModule_ProvideDaoFactory implements Factory<SharedLegacyEventDao> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SharedEventLogDatabase<?, ?>> db;

    @JvmStatic
    public static final SharedLegacyEventDaoModule_ProvideDaoFactory create(Provider<SharedEventLogDatabase<?, ?>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final SharedLegacyEventDao provideDao(SharedEventLogDatabase<?, ?> sharedEventLogDatabase) {
        return INSTANCE.provideDao(sharedEventLogDatabase);
    }

    public SharedLegacyEventDaoModule_ProvideDaoFactory(Provider<SharedEventLogDatabase<?, ?>> db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
    }

    @Override // javax.inject.Provider
    public SharedLegacyEventDao get() {
        Companion companion = INSTANCE;
        SharedEventLogDatabase<?, ?> sharedEventLogDatabase = this.db.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogDatabase, "get(...)");
        return companion.provideDao(sharedEventLogDatabase);
    }

    /* compiled from: SharedLegacyEventDaoModule_ProvideDaoFactory.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\u0019\u0010\u0006\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b¢\u0006\u0002\b\t0\u0007H\u0007J\u001d\u0010\n\u001a\u00020\u000b2\u0013\u0010\u0006\u001a\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b¢\u0006\u0002\b\tH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/analytics/dao/SharedLegacyEventDaoModule_ProvideDaoFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/analytics/dao/SharedLegacyEventDaoModule_ProvideDaoFactory;", "db", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideDao", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SharedLegacyEventDaoModule_ProvideDaoFactory create(Provider<SharedEventLogDatabase<?, ?>> db) {
            Intrinsics.checkNotNullParameter(db, "db");
            return new SharedLegacyEventDaoModule_ProvideDaoFactory(db);
        }

        @JvmStatic
        public final SharedLegacyEventDao provideDao(SharedEventLogDatabase<?, ?> db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Object objCheckNotNull = Preconditions.checkNotNull(SharedLegacyEventDaoModule.INSTANCE.provideDao(db), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (SharedLegacyEventDao) objCheckNotNull;
        }
    }
}
