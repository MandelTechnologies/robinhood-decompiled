package com.robinhood.util.migrations;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: MigrationsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H'¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/util/migrations/MigrationsMultimapModule;", "", "provideMigrations", "", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.util.migrations.MigrationsMultimapModule, reason: use source file name */
/* loaded from: classes12.dex */
public interface MigrationsModule2 {
    Set<LastUpdatedAtMigrations> provideMigrations();
}
