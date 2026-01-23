package com.robinhood.util.migrations;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationsModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/util/migrations/MigrationsModule;", "", "<init>", "()V", "bindRhDbMigrations", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "bindFuturesDbMigrations", "futuresMigrations", "Lcom/robinhood/util/migrations/FuturesDatabaseLastUpdatedAtMigrations;", "bindEventDbMigrations", "eventMigrations", "Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations;", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MigrationsModule {
    public static final MigrationsModule INSTANCE = new MigrationsModule();

    public final LastUpdatedAtMigrations bindEventDbMigrations(EventContractDatabaseLastUpdatedAtMigrations eventMigrations) {
        Intrinsics.checkNotNullParameter(eventMigrations, "eventMigrations");
        return eventMigrations;
    }

    public final LastUpdatedAtMigrations bindFuturesDbMigrations(FuturesDatabaseLastUpdatedAtMigrations futuresMigrations) {
        Intrinsics.checkNotNullParameter(futuresMigrations, "futuresMigrations");
        return futuresMigrations;
    }

    private MigrationsModule() {
    }

    public final LastUpdatedAtMigrations bindRhDbMigrations() {
        return RhDatabaseLastUpdatedAtMigrations.INSTANCE;
    }
}
