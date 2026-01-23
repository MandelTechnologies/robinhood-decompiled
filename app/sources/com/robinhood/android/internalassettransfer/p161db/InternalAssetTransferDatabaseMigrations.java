package com.robinhood.android.internalassettransfer.p161db;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.p015db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferDatabaseMigrations.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"INTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS", "", "Landroidx/room/migration/Migration;", "getINTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS$annotations", "()V", "getINTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS", "()[Landroidx/room/migration/Migration;", "[Landroidx/room/migration/Migration;", "lib-internal-asset-transfers-db_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfer.db.InternalAssetTransferDatabaseMigrationsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class InternalAssetTransferDatabaseMigrations {
    private static final Migration[] INTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS = {new Migration() { // from class: com.robinhood.android.internalassettransfer.db.InternalAssetTransferDatabaseMigrationsKt$INTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) throws SQLException {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("DROP TABLE IF EXISTS `DbEligibleAsset`");
            db.execSQL("DROP TABLE IF EXISTS `DbAssetTransferRecord`");
            db.execSQL("CREATE TABLE IF NOT EXISTS `DbAssetTransferRecord` (`assetTransferUuid` TEXT NOT NULL, `sourceRhfAccountNumber` TEXT NOT NULL, `destinationRhfAccountNumber` TEXT NOT NULL, `historyState` TEXT NOT NULL, `initiatedAt` TEXT NOT NULL, `uuid` TEXT NOT NULL, `availableCash` REAL NOT NULL, `unavailableCash` REAL NOT NULL, `equityPositions` TEXT NOT NULL, PRIMARY KEY(`assetTransferUuid`))");
            db.execSQL("CREATE TABLE IF NOT EXISTS `DbEligibleAsset` (`eligibleAssetUuid` TEXT NOT NULL, `instrumentId` TEXT NOT NULL, `instrument` TEXT NOT NULL, `symbol` TEXT NOT NULL, `availableShares` TEXT NOT NULL, `unavailableShares` TEXT NOT NULL, PRIMARY KEY(`eligibleAssetUuid`))");
        }
    }};

    public static /* synthetic */ void getINTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS$annotations() {
    }

    public static final Migration[] getINTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS() {
        return INTERNAL_ASSET_TRANSFER_DATABASE_MIGRATIONS;
    }
}
