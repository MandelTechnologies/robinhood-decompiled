package com.robinhood.util.migrations;

import com.robinhood.util.LastUpdatedAtManager;
import kotlin.Metadata;

/* compiled from: LastUpdatedAtMigrations.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "", "versionKey", "", "getVersionKey", "()Ljava/lang/String;", "currentDbVersion", "", "getCurrentDbVersion", "()I", "onUpgrade", "", "lastUpdatedAtManager", "Lcom/robinhood/util/LastUpdatedAtManager;", "oldVersion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface LastUpdatedAtMigrations {
    int getCurrentDbVersion();

    String getVersionKey();

    void onUpgrade(LastUpdatedAtManager lastUpdatedAtManager, int oldVersion);
}
