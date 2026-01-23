package com.robinhood.android.lib.margin.p167db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao_Impl;
import com.robinhood.android.lib.margin.p167db.dao.MarginUpgradeRestrictionDao;
import com.robinhood.android.lib.margin.p167db.dao.MarginUpgradeRestrictionDao_Impl;
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

/* compiled from: MarginDatabase_Impl.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00120\u0010H\u0014J\u0016\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00110\u0014H\u0016J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0011\u0012\u0004\u0012\u00020\u00150\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/MarginDatabase_Impl;", "Lcom/robinhood/android/lib/margin/db/MarginDatabase;", "<init>", "()V", "_marginUpgradeRestrictionDao", "Lkotlin/Lazy;", "Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao;", "_leveredMarginSettingsDao", "Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "marginUpgradeRestrictionDao", "marginSettingsDao", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginDatabase_Impl extends MarginDatabase {
    private final Lazy<MarginUpgradeRestrictionDao> _marginUpgradeRestrictionDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lib.margin.db.MarginDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDatabase_Impl._marginUpgradeRestrictionDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<LeveredMarginSettingsDao> _leveredMarginSettingsDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lib.margin.db.MarginDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDatabase_Impl._leveredMarginSettingsDao$lambda$1(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginUpgradeRestrictionDao_Impl _marginUpgradeRestrictionDao$lambda$0(MarginDatabase_Impl marginDatabase_Impl) {
        return new MarginUpgradeRestrictionDao_Impl(marginDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeveredMarginSettingsDao_Impl _leveredMarginSettingsDao$lambda$1(MarginDatabase_Impl marginDatabase_Impl) {
        return new LeveredMarginSettingsDao_Impl(marginDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.robinhood.android.lib.margin.db.MarginDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(2, "749407fce616cc41f73a8ea233de847c", "ae60dec0048e347efa7c9b25e82d97ae");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `MarginUpgradeRestriction` (`accountNumber` TEXT NOT NULL, `type` TEXT, PRIMARY KEY(`accountNumber`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `MarginSettings` (`accountNumber` TEXT NOT NULL, `isMarginInvestingEnabled` INTEGER NOT NULL, `userSetMarginInvestingLimit` TEXT, `isMarginSpendingEnabled` INTEGER NOT NULL, `userSetMarginSpendingLimit` TEXT, PRIMARY KEY(`accountNumber`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '749407fce616cc41f73a8ea233de847c')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `MarginUpgradeRestriction`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `MarginSettings`");
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
                linkedHashMap.put("accountNumber", new TableInfo.Column("accountNumber", "TEXT", true, 1, null, 1));
                linkedHashMap.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("MarginUpgradeRestriction", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "MarginUpgradeRestriction");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "MarginUpgradeRestriction(com.robinhood.android.lib.margin.db.models.MarginUpgradeRestriction).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("accountNumber", new TableInfo.Column("accountNumber", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("isMarginInvestingEnabled", new TableInfo.Column("isMarginInvestingEnabled", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("userSetMarginInvestingLimit", new TableInfo.Column("userSetMarginInvestingLimit", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("isMarginSpendingEnabled", new TableInfo.Column("isMarginSpendingEnabled", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("userSetMarginSpendingLimit", new TableInfo.Column("userSetMarginSpendingLimit", "TEXT", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("MarginSettings", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "MarginSettings");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "MarginSettings(com.robinhood.android.lib.margin.db.models.MarginSettings).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "MarginUpgradeRestriction", "MarginSettings");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "MarginUpgradeRestriction", "MarginSettings");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(MarginUpgradeRestrictionDao.class), MarginUpgradeRestrictionDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(LeveredMarginSettingsDao.class), LeveredMarginSettingsDao_Impl.INSTANCE.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MarginDatabase_AutoMigration_1_2_Impl());
        return arrayList;
    }

    @Override // com.robinhood.android.lib.margin.p167db.MarginDatabase
    public MarginUpgradeRestrictionDao marginUpgradeRestrictionDao() {
        return this._marginUpgradeRestrictionDao.getValue();
    }

    @Override // com.robinhood.android.lib.margin.p167db.MarginDatabase
    public LeveredMarginSettingsDao marginSettingsDao() {
        return this._leveredMarginSettingsDao.getValue();
    }
}
