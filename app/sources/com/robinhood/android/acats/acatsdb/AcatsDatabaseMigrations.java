package com.robinhood.android.acats.acatsdb;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.p015db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsDatabaseMigrations.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"ACATS_MIGRATIONS", "", "Landroidx/room/migration/Migration;", "getACATS_MIGRATIONS", "()[Landroidx/room/migration/Migration;", "[Landroidx/room/migration/Migration;", "lib-acats-db_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.acatsdb.AcatsDatabaseMigrationsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class AcatsDatabaseMigrations {
    private static final Migration[] ACATS_MIGRATIONS = {new Migration() { // from class: com.robinhood.android.acats.acatsdb.AcatsDatabaseMigrationsKt$ACATS_MIGRATIONS$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) throws SQLException {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("DROP TABLE IF EXISTS `AcatsReimbursement`");
            db.execSQL("CREATE TABLE IF NOT EXISTS `AcatsReimbursement` (`reimbursementId` TEXT NOT NULL, `id` TEXT NOT NULL, `accountNumber` TEXT NOT NULL, `amount` TEXT NOT NULL, `title` TEXT NOT NULL, `completionDate` TEXT NOT NULL, PRIMARY KEY(`reimbursementId`))");
        }
    }};

    public static final Migration[] getACATS_MIGRATIONS() {
        return ACATS_MIGRATIONS;
    }
}
