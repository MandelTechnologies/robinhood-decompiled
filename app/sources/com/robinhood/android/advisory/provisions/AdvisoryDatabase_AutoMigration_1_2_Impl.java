package com.robinhood.android.advisory.provisions;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryDatabase_AutoMigration_1_2_Impl.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase_AutoMigration_1_2_Impl;", "Landroidx/room/migration/Migration;", "<init>", "()V", "migrate", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryDatabase_AutoMigration_1_2_Impl extends Migration {
    public AdvisoryDatabase_AutoMigration_1_2_Impl() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `AdvisoryInsight` (`id` TEXT NOT NULL, `accountNumber` TEXT NOT NULL, `contentViewModel` TEXT NOT NULL, `createAt` TEXT NOT NULL, `isSeen` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `insightType` TEXT NOT NULL, `pageType` TEXT NOT NULL, `parentId` TEXT, `sortOrder` INTEGER NOT NULL, PRIMARY KEY(`id`, `accountNumber`))");
    }
}
