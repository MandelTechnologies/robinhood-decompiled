package com.robinhood.analytics.dao;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: PerformanceMetricDatabase_Impl.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00100\u000eH\u0014J\u0016\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f0\u0012H\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/analytics/dao/PerformanceMetricDatabase_Impl;", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "<init>", "()V", "_performanceMetricDao", "Lkotlin/Lazy;", "Lcom/robinhood/analytics/dao/PerformanceMetricDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "performanceMetricDao", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PerformanceMetricDatabase_Impl extends PerformanceMetricDatabase {
    private final Lazy<PerformanceMetricDao> _performanceMetricDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.PerformanceMetricDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PerformanceMetricDatabase_Impl._performanceMetricDao$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceMetricDao_Impl _performanceMetricDao$lambda$0(PerformanceMetricDatabase_Impl performanceMetricDatabase_Impl) {
        return new PerformanceMetricDao_Impl(performanceMetricDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.robinhood.analytics.dao.PerformanceMetricDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(2, "b06497d3762c561af1d5140c4ad480e0", "86970259bc87a60b935d05060925efbe");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PerformanceMetric` (`id` TEXT NOT NULL, `source` INTEGER NOT NULL, `context` BLOB NOT NULL, `networkConnection` BLOB NOT NULL, `status` INTEGER NOT NULL, `startTimestamp` TEXT NOT NULL, `endTimestamp` TEXT, `pauses` TEXT NOT NULL, `key_sessionId` TEXT NOT NULL, `key_metricName` INTEGER NOT NULL, `key_contextualId` TEXT, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceMetric_key_sessionId` ON `PerformanceMetric` (`key_sessionId`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceMetric_key_metricName` ON `PerformanceMetric` (`key_metricName`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceMetric_key_contextualId` ON `PerformanceMetric` (`key_contextualId`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceMetric_status` ON `PerformanceMetric` (`status`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceMetric_startTimestamp` ON `PerformanceMetric` (`startTimestamp`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceMetric_endTimestamp` ON `PerformanceMetric` (`endTimestamp`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PerformanceSpan` (`status` INTEGER NOT NULL, `context` BLOB NOT NULL, `startTimestamp` TEXT NOT NULL, `endTimestamp` TEXT, `key_metricId` TEXT NOT NULL, `key_spanName` TEXT NOT NULL, PRIMARY KEY(`key_metricId`, `key_spanName`), FOREIGN KEY(`key_metricId`) REFERENCES `PerformanceMetric`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceSpan_status` ON `PerformanceSpan` (`status`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceSpan_startTimestamp` ON `PerformanceSpan` (`startTimestamp`)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_PerformanceSpan_endTimestamp` ON `PerformanceSpan` (`endTimestamp`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b06497d3762c561af1d5140c4ad480e0')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PerformanceMetric`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PerformanceSpan`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "PRAGMA foreign_keys = ON");
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
                linkedHashMap.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap.put("source", new TableInfo.Column("source", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("context", new TableInfo.Column("context", "BLOB", true, 0, null, 1));
                linkedHashMap.put("networkConnection", new TableInfo.Column("networkConnection", "BLOB", true, 0, null, 1));
                linkedHashMap.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("startTimestamp", new TableInfo.Column("startTimestamp", "TEXT", true, 0, null, 1));
                linkedHashMap.put("endTimestamp", new TableInfo.Column("endTimestamp", "TEXT", false, 0, null, 1));
                linkedHashMap.put("pauses", new TableInfo.Column("pauses", "TEXT", true, 0, null, 1));
                linkedHashMap.put("key_sessionId", new TableInfo.Column("key_sessionId", "TEXT", true, 0, null, 1));
                linkedHashMap.put("key_metricName", new TableInfo.Column("key_metricName", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("key_contextualId", new TableInfo.Column("key_contextualId", "TEXT", false, 0, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new TableInfo.Index("index_PerformanceMetric_key_sessionId", false, CollectionsKt.listOf("key_sessionId"), CollectionsKt.listOf("ASC")));
                linkedHashSet2.add(new TableInfo.Index("index_PerformanceMetric_key_metricName", false, CollectionsKt.listOf("key_metricName"), CollectionsKt.listOf("ASC")));
                linkedHashSet2.add(new TableInfo.Index("index_PerformanceMetric_key_contextualId", false, CollectionsKt.listOf("key_contextualId"), CollectionsKt.listOf("ASC")));
                linkedHashSet2.add(new TableInfo.Index("index_PerformanceMetric_status", false, CollectionsKt.listOf("status"), CollectionsKt.listOf("ASC")));
                linkedHashSet2.add(new TableInfo.Index("index_PerformanceMetric_startTimestamp", false, CollectionsKt.listOf("startTimestamp"), CollectionsKt.listOf("ASC")));
                linkedHashSet2.add(new TableInfo.Index("index_PerformanceMetric_endTimestamp", false, CollectionsKt.listOf("endTimestamp"), CollectionsKt.listOf("ASC")));
                TableInfo tableInfo = new TableInfo("PerformanceMetric", linkedHashMap, linkedHashSet, linkedHashSet2);
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "PerformanceMetric");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "PerformanceMetric(com.robinhood.analytics.models.PerformanceMetric).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("context", new TableInfo.Column("context", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("startTimestamp", new TableInfo.Column("startTimestamp", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("endTimestamp", new TableInfo.Column("endTimestamp", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("key_metricId", new TableInfo.Column("key_metricId", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("key_spanName", new TableInfo.Column("key_spanName", "TEXT", true, 2, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new TableInfo.ForeignKey("PerformanceMetric", "CASCADE", "CASCADE", CollectionsKt.listOf("key_metricId"), CollectionsKt.listOf("id")));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new TableInfo.Index("index_PerformanceSpan_status", false, CollectionsKt.listOf("status"), CollectionsKt.listOf("ASC")));
                linkedHashSet4.add(new TableInfo.Index("index_PerformanceSpan_startTimestamp", false, CollectionsKt.listOf("startTimestamp"), CollectionsKt.listOf("ASC")));
                linkedHashSet4.add(new TableInfo.Index("index_PerformanceSpan_endTimestamp", false, CollectionsKt.listOf("endTimestamp"), CollectionsKt.listOf("ASC")));
                TableInfo tableInfo3 = new TableInfo("PerformanceSpan", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                TableInfo tableInfo4 = companion.read(connection, "PerformanceSpan");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "PerformanceSpan(com.robinhood.analytics.models.PerformanceSpan).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "PerformanceMetric", "PerformanceSpan");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(true, "PerformanceMetric", "PerformanceSpan");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(PerformanceMetricDao.class), PerformanceMetricDao_Impl.INSTANCE.getRequiredConverters());
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

    @Override // com.robinhood.analytics.dao.PerformanceMetricDatabase
    public PerformanceMetricDao performanceMetricDao() {
        return this._performanceMetricDao.getValue();
    }
}
