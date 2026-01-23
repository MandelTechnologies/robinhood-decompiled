package com.robinhood.util.migrations;

import com.robinhood.android.models.futures.p189db.FuturesDatabase;
import com.robinhood.database.ForDatabase;
import com.robinhood.util.LastUpdatedAtManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: FuturesDatabaseLastUpdatedAtMigrations.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/util/migrations/FuturesDatabaseLastUpdatedAtMigrations;", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "futuresDbVersion", "", "<init>", "(I)V", "getFuturesDbVersion", "()I", "versionKey", "", "getVersionKey", "()Ljava/lang/String;", "currentDbVersion", "getCurrentDbVersion", "onUpgrade", "", "lastUpdatedAtManager", "Lcom/robinhood/util/LastUpdatedAtManager;", "oldVersion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesDatabaseLastUpdatedAtMigrations implements LastUpdatedAtMigrations {
    private final int currentDbVersion;
    private final int futuresDbVersion;
    private final String versionKey = "futures_version";

    public FuturesDatabaseLastUpdatedAtMigrations(@ForDatabase(FuturesDatabase.class) int i) {
        this.futuresDbVersion = i;
        this.currentDbVersion = i;
    }

    public final int getFuturesDbVersion() {
        return this.futuresDbVersion;
    }

    @Override // com.robinhood.util.migrations.LastUpdatedAtMigrations
    public String getVersionKey() {
        return this.versionKey;
    }

    @Override // com.robinhood.util.migrations.LastUpdatedAtMigrations
    public int getCurrentDbVersion() {
        return this.currentDbVersion;
    }

    @Override // com.robinhood.util.migrations.LastUpdatedAtMigrations
    public void onUpgrade(LastUpdatedAtManager lastUpdatedAtManager, int oldVersion) {
        Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
        Timber.INSTANCE.mo3356i("lastUpdatedAt futures db onUpgrade: oldVersion = " + oldVersion, new Object[0]);
        if (oldVersion < 0 || oldVersion >= 31) {
            throw new IllegalStateException(("No migration in FuturesDatabaseLastUpdatedAtMigrations for DB version " + oldVersion + ".").toString());
        }
    }
}
