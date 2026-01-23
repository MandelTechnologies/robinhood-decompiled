package com.robinhood.analytics.dao;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedLegacyEventDaoModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/dao/SharedLegacyEventDaoModule;", "", "<init>", "()V", "provideDao", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "db", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class SharedLegacyEventDaoModule {
    public static final SharedLegacyEventDaoModule INSTANCE = new SharedLegacyEventDaoModule();

    private SharedLegacyEventDaoModule() {
    }

    public final SharedLegacyEventDao provideDao(SharedEventLogDatabase<?, ?> db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.legacyEventDao();
    }
}
