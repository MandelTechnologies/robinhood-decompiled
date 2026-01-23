package com.robinhood.analytics.dao;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.robinhood.analytics.models.EventLog;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
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

/* compiled from: EventLogDatabase_Impl.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00120\u0010H\u0014J\u0016\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00110\u0014H\u0016J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0011\u0012\u0004\u0012\u00020\u00150\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/analytics/dao/EventLogDatabase_Impl;", "Lcom/robinhood/analytics/dao/EventLogDatabase;", "<init>", "()V", "_eventLogDao", "Lkotlin/Lazy;", "Lcom/robinhood/analytics/dao/EventLogDao;", "_legacyEventDao", "Lcom/robinhood/analytics/dao/LegacyEventDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "eventLogDao", "legacyEventDao", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventLogDatabase_Impl extends EventLogDatabase {
    private final Lazy<EventLogDao> _eventLogDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.EventLogDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EventLogDatabase_Impl._eventLogDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<LegacyEventDao> _legacyEventDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.EventLogDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EventLogDatabase_Impl._legacyEventDao$lambda$1(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventLogDao_Impl _eventLogDao$lambda$0(EventLogDatabase_Impl eventLogDatabase_Impl) {
        return new EventLogDao_Impl(eventLogDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyEventDao_Impl _legacyEventDao$lambda$1(EventLogDatabase_Impl eventLogDatabase_Impl) {
        return new LegacyEventDao_Impl(eventLogDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.robinhood.analytics.dao.EventLogDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(10, "d4030c90a983c06f2b63514175481f7a", "268aaac425e15ba12f9c28bf5dc1cb76");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `EventLog` (`id` TEXT NOT NULL, `loggingEvent` BLOB NOT NULL, `timestamp` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `LegacyEvent` (`id` TEXT NOT NULL, `requestJson` TEXT NOT NULL, `timestamp` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_LegacyEvent_timestamp` ON `LegacyEvent` (`timestamp`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd4030c90a983c06f2b63514175481f7a')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `EventLog`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `LegacyEvent`");
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
                linkedHashMap.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap.put("loggingEvent", new TableInfo.Column("loggingEvent", "BLOB", true, 0, null, 1));
                linkedHashMap.put("timestamp", new TableInfo.Column("timestamp", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("EventLog", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "EventLog");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "EventLog(com.robinhood.analytics.models.EventLog).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("requestJson", new TableInfo.Column("requestJson", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("timestamp", new TableInfo.Column("timestamp", "TEXT", true, 0, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new TableInfo.Index("index_LegacyEvent_timestamp", false, CollectionsKt.listOf("timestamp"), CollectionsKt.listOf("ASC")));
                TableInfo tableInfo3 = new TableInfo("LegacyEvent", linkedHashMap2, linkedHashSet, linkedHashSet2);
                TableInfo tableInfo4 = companion.read(connection, "LegacyEvent");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "LegacyEvent(com.robinhood.analytics.models.LegacyEvent).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "EventLog", "LegacyEvent");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "EventLog", "LegacyEvent");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(EventLogDao.class), EventLogDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(LegacyEventDao.class), LegacyEventDao_Impl.INSTANCE.getRequiredConverters());
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

    @Override // com.robinhood.analytics.dao.SharedEventLogDatabase
    /* renamed from: eventLogDao, reason: merged with bridge method [inline-methods] */
    public SharedEventLogDao<LoggingEvent, EventLog> eventLogDao2() {
        return this._eventLogDao.getValue();
    }

    @Override // com.robinhood.analytics.dao.SharedEventLogDatabase
    public LegacyEventDao legacyEventDao() {
        return this._legacyEventDao.getValue();
    }
}
