package com.robinhood.android.internalassettransfer.p161db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.robinhood.models.internalassettransfer.p328db.dao.InternalAssetTransferDao;
import com.robinhood.models.internalassettransfer.p328db.dao.InternalAssetTransferDao_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: InternalAssetTransferDatabase_Impl.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00100\u000eH\u0014J\u0016\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f0\u0012H\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfer/db/InternalAssetTransferDatabase_Impl;", "Lcom/robinhood/android/internalassettransfer/db/InternalAssetTransferDatabase;", "<init>", "()V", "_internalAssetTransferDao", "Lkotlin/Lazy;", "Lcom/robinhood/models/internalassettransfer/db/dao/InternalAssetTransferDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "internalAssetTransferDao", "lib-internal-asset-transfers-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InternalAssetTransferDatabase_Impl extends InternalAssetTransferDatabase {
    private final Lazy<InternalAssetTransferDao> _internalAssetTransferDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.internalassettransfer.db.InternalAssetTransferDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InternalAssetTransferDatabase_Impl._internalAssetTransferDao$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalAssetTransferDao_Impl _internalAssetTransferDao$lambda$0(InternalAssetTransferDatabase_Impl internalAssetTransferDatabase_Impl) {
        return new InternalAssetTransferDao_Impl(internalAssetTransferDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.robinhood.android.internalassettransfer.db.InternalAssetTransferDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(2, "e1b049637f08a4cd66995e091761c89c", "5fcf4d2d919cec602b107d528e0bbbd5");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `DbAssetTransferRecord` (`assetTransferUuid` TEXT NOT NULL, `sourceRhfAccountNumber` TEXT NOT NULL, `destinationRhfAccountNumber` TEXT NOT NULL, `historyState` TEXT NOT NULL, `initiatedAt` TEXT NOT NULL, `uuid` TEXT NOT NULL, `availableCash` REAL NOT NULL, `unavailableCash` REAL NOT NULL, `equityPositions` TEXT NOT NULL, PRIMARY KEY(`assetTransferUuid`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `DbEligibleAsset` (`eligibleAssetUuid` TEXT NOT NULL, `instrumentId` TEXT NOT NULL, `instrument` TEXT NOT NULL, `symbol` TEXT NOT NULL, `availableShares` TEXT NOT NULL, `unavailableShares` TEXT NOT NULL, PRIMARY KEY(`eligibleAssetUuid`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e1b049637f08a4cd66995e091761c89c')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `DbAssetTransferRecord`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `DbEligibleAsset`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                this.this$0.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("assetTransferUuid", new TableInfo.Column("assetTransferUuid", "TEXT", true, 1, null, 1));
                linkedHashMap.put("sourceRhfAccountNumber", new TableInfo.Column("sourceRhfAccountNumber", "TEXT", true, 0, null, 1));
                linkedHashMap.put("destinationRhfAccountNumber", new TableInfo.Column("destinationRhfAccountNumber", "TEXT", true, 0, null, 1));
                linkedHashMap.put("historyState", new TableInfo.Column("historyState", "TEXT", true, 0, null, 1));
                linkedHashMap.put("initiatedAt", new TableInfo.Column("initiatedAt", "TEXT", true, 0, null, 1));
                linkedHashMap.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 0, null, 1));
                linkedHashMap.put("availableCash", new TableInfo.Column("availableCash", "REAL", true, 0, null, 1));
                linkedHashMap.put("unavailableCash", new TableInfo.Column("unavailableCash", "REAL", true, 0, null, 1));
                linkedHashMap.put("equityPositions", new TableInfo.Column("equityPositions", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("DbAssetTransferRecord", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "DbAssetTransferRecord");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "DbAssetTransferRecord(com.robinhood.models.internalassettransfer.db.bonfire.DbAssetTransferRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("eligibleAssetUuid", new TableInfo.Column("eligibleAssetUuid", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("instrumentId", new TableInfo.Column("instrumentId", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("instrument", new TableInfo.Column("instrument", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("availableShares", new TableInfo.Column("availableShares", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("unavailableShares", new TableInfo.Column("unavailableShares", "TEXT", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("DbEligibleAsset", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "DbEligibleAsset");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "DbEligibleAsset(com.robinhood.models.internalassettransfer.db.bonfire.DbEligibleAsset).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "DbAssetTransferRecord", "DbEligibleAsset");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "DbAssetTransferRecord", "DbEligibleAsset");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InternalAssetTransferDao.class), InternalAssetTransferDao_Impl.INSTANCE.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // com.robinhood.android.internalassettransfer.p161db.InternalAssetTransferDatabase
    public InternalAssetTransferDao internalAssetTransferDao() {
        return this._internalAssetTransferDao.getValue();
    }
}
