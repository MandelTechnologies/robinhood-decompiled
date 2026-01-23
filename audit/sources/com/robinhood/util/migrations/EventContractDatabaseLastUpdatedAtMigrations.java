package com.robinhood.util.migrations;

import com.robinhood.android.models.event.p186db.EventDatabase;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.database.ForDatabase;
import com.robinhood.util.LastUpdatedAtManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: EventContractDatabaseLastUpdatedAtMigrations.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/util/migrations/EventContractDatabaseLastUpdatedAtMigrations;", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "eventDbVersion", "", "<init>", "(I)V", "getEventDbVersion", "()I", "versionKey", "", "getVersionKey", "()Ljava/lang/String;", "currentDbVersion", "getCurrentDbVersion", "onUpgrade", "", "lastUpdatedAtManager", "Lcom/robinhood/util/LastUpdatedAtManager;", "oldVersion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventContractDatabaseLastUpdatedAtMigrations implements LastUpdatedAtMigrations {
    private final int currentDbVersion;
    private final int eventDbVersion;
    private final String versionKey = "event_contract_version";

    public EventContractDatabaseLastUpdatedAtMigrations(@ForDatabase(EventDatabase.class) int i) {
        this.eventDbVersion = i;
        this.currentDbVersion = i;
    }

    public final int getEventDbVersion() {
        return this.eventDbVersion;
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
        Timber.INSTANCE.mo3356i("lastUpdatedAt event db onUpgrade: oldVersion = " + oldVersion, new Object[0]);
        if (oldVersion < 0 || oldVersion >= 31) {
            if (oldVersion == 31) {
                lastUpdatedAtManager.clear(EventOrder.class);
                return;
            }
            if (32 > oldVersion || oldVersion >= 41) {
                if (oldVersion == 41) {
                    lastUpdatedAtManager.clear(EventOrder.class);
                    return;
                }
                if (42 > oldVersion || oldVersion >= 44) {
                    if (oldVersion == 44) {
                        lastUpdatedAtManager.clear(EventOrder.class);
                        return;
                    }
                    if (45 > oldVersion || oldVersion >= 58) {
                        if (oldVersion == 58) {
                            lastUpdatedAtManager.clear(EventOrder.class);
                            return;
                        }
                        if (59 > oldVersion || oldVersion >= 76) {
                            throw new IllegalStateException(("No migration in EventContractDatabaseLastUpdatedAtMigrations for DB version " + oldVersion + ".").toString());
                        }
                    }
                }
            }
        }
    }
}
