package com.robinhood.shared.equities.instrumentdetail;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.shared.equities.models.instrumentdetails.dao.EarningDao;
import com.robinhood.shared.equities.models.instrumentdetails.dao.EarningDao_Impl;
import com.robinhood.shared.equities.models.instrumentdetails.dao.FundamentalDao;
import com.robinhood.shared.equities.models.instrumentdetails.dao.FundamentalDao_Impl;
import com.robinhood.shared.equities.models.instrumentdetails.dao.InstrumentRatingsDao;
import com.robinhood.shared.equities.models.instrumentdetails.dao.InstrumentRatingsDao_Impl;
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

/* compiled from: InstrumentDetailDatabase_Impl.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00140\u0012H\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00130\u0016H\u0016J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u001a\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0013\u0012\u0004\u0012\u00020\u00170\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDatabase_Impl;", "Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDatabase;", "<init>", "()V", "_earningDao", "Lkotlin/Lazy;", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/EarningDao;", "_fundamentalDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/FundamentalDao;", "_instrumentRatingsDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/InstrumentRatingsDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "earningDao", "fundamentalDao", "instrumentRatingsDao", "lib-instrument-detail-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class InstrumentDetailDatabase_Impl extends InstrumentDetailDatabase {
    private final Lazy<EarningDao> _earningDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstrumentDetailDatabase_Impl._earningDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<FundamentalDao> _fundamentalDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstrumentDetailDatabase_Impl._fundamentalDao$lambda$1(this.f$0);
        }
    });
    private final Lazy<InstrumentRatingsDao> _instrumentRatingsDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstrumentDetailDatabase_Impl._instrumentRatingsDao$lambda$2(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarningDao_Impl _earningDao$lambda$0(InstrumentDetailDatabase_Impl instrumentDetailDatabase_Impl) {
        return new EarningDao_Impl(instrumentDetailDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FundamentalDao_Impl _fundamentalDao$lambda$1(InstrumentDetailDatabase_Impl instrumentDetailDatabase_Impl) {
        return new FundamentalDao_Impl(instrumentDetailDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentRatingsDao_Impl _instrumentRatingsDao$lambda$2(InstrumentDetailDatabase_Impl instrumentDetailDatabase_Impl) {
        return new InstrumentRatingsDao_Impl(instrumentDetailDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(1, "d34364b0cc778397a5b7cc183b90bb99", "726365071465d7af17eeb49cfaef3411");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Earning` (`instrumentId` TEXT NOT NULL, `symbol` TEXT NOT NULL, `yearQuarter` TEXT NOT NULL, `call_datetime` TEXT, `call_broadcastUrl` TEXT, `call_replayUrl` TEXT, `eps_actual` TEXT, `eps_estimate` TEXT, `report_date` TEXT, `report_timing` TEXT, `report_verified` INTEGER, PRIMARY KEY(`instrumentId`, `yearQuarter`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Fundamental` (`averageVolume` TEXT, `averageVolume30Days` TEXT, `ceo` TEXT, `description` TEXT, `dividendYield` TEXT, `headquartersCity` TEXT, `headquartersState` TEXT, `high` TEXT, `high52Weeks` TEXT, `instrumentId` TEXT NOT NULL, `low` TEXT, `low52Weeks` TEXT, `marketCap` TEXT, `numEmployees` INTEGER, `open` TEXT, `overnightVolume` TEXT, `peRatio` TEXT, `volume` TEXT, `yearFounded` TEXT, PRIMARY KEY(`instrumentId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `InstrumentRatings` (`instrumentId` TEXT NOT NULL, `ratings` TEXT NOT NULL, `ratingsPublishedAt` TEXT, `summary_numBuyRatings` INTEGER, `summary_numHoldRatings` INTEGER, `summary_numSellRatings` INTEGER, PRIMARY KEY(`instrumentId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd34364b0cc778397a5b7cc183b90bb99')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Earning`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Fundamental`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `InstrumentRatings`");
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
                linkedHashMap.put("instrumentId", new TableInfo.Column("instrumentId", "TEXT", true, 1, null, 1));
                linkedHashMap.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
                linkedHashMap.put("yearQuarter", new TableInfo.Column("yearQuarter", "TEXT", true, 2, null, 1));
                linkedHashMap.put("call_datetime", new TableInfo.Column("call_datetime", "TEXT", false, 0, null, 1));
                linkedHashMap.put("call_broadcastUrl", new TableInfo.Column("call_broadcastUrl", "TEXT", false, 0, null, 1));
                linkedHashMap.put("call_replayUrl", new TableInfo.Column("call_replayUrl", "TEXT", false, 0, null, 1));
                linkedHashMap.put("eps_actual", new TableInfo.Column("eps_actual", "TEXT", false, 0, null, 1));
                linkedHashMap.put("eps_estimate", new TableInfo.Column("eps_estimate", "TEXT", false, 0, null, 1));
                linkedHashMap.put("report_date", new TableInfo.Column("report_date", "TEXT", false, 0, null, 1));
                linkedHashMap.put("report_timing", new TableInfo.Column("report_timing", "TEXT", false, 0, null, 1));
                linkedHashMap.put("report_verified", new TableInfo.Column("report_verified", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("Earning", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "Earning");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Earning(com.robinhood.shared.equities.models.instrumentdetails.db.Earning).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("averageVolume", new TableInfo.Column("averageVolume", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("averageVolume30Days", new TableInfo.Column("averageVolume30Days", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("ceo", new TableInfo.Column("ceo", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("dividendYield", new TableInfo.Column("dividendYield", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("headquartersCity", new TableInfo.Column("headquartersCity", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("headquartersState", new TableInfo.Column("headquartersState", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("high", new TableInfo.Column("high", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("high52Weeks", new TableInfo.Column("high52Weeks", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("instrumentId", new TableInfo.Column("instrumentId", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("low", new TableInfo.Column("low", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("low52Weeks", new TableInfo.Column("low52Weeks", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("marketCap", new TableInfo.Column("marketCap", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("numEmployees", new TableInfo.Column("numEmployees", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("open", new TableInfo.Column("open", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("overnightVolume", new TableInfo.Column("overnightVolume", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("peRatio", new TableInfo.Column("peRatio", "TEXT", false, 0, null, 1));
                linkedHashMap2.put(SduiChartZoomTransformer.VOLUME_IDENTIFIER, new TableInfo.Column(SduiChartZoomTransformer.VOLUME_IDENTIFIER, "TEXT", false, 0, null, 1));
                linkedHashMap2.put("yearFounded", new TableInfo.Column("yearFounded", "TEXT", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("Fundamental", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "Fundamental");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Fundamental(com.robinhood.shared.equities.models.instrumentdetails.db.Fundamental).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("instrumentId", new TableInfo.Column("instrumentId", "TEXT", true, 1, null, 1));
                linkedHashMap3.put("ratings", new TableInfo.Column("ratings", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("ratingsPublishedAt", new TableInfo.Column("ratingsPublishedAt", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("summary_numBuyRatings", new TableInfo.Column("summary_numBuyRatings", "INTEGER", false, 0, null, 1));
                linkedHashMap3.put("summary_numHoldRatings", new TableInfo.Column("summary_numHoldRatings", "INTEGER", false, 0, null, 1));
                linkedHashMap3.put("summary_numSellRatings", new TableInfo.Column("summary_numSellRatings", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("InstrumentRatings", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo6 = companion.read(connection, "InstrumentRatings");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "InstrumentRatings(com.robinhood.shared.equities.models.instrumentdetails.db.InstrumentRatings).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "Earning", "Fundamental", "InstrumentRatings");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "Earning", "Fundamental", "InstrumentRatings");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(EarningDao.class), EarningDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(FundamentalDao.class), FundamentalDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InstrumentRatingsDao.class), InstrumentRatingsDao_Impl.INSTANCE.getRequiredConverters());
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

    @Override // com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDatabase
    public EarningDao earningDao() {
        return this._earningDao.getValue();
    }

    @Override // com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDatabase
    public FundamentalDao fundamentalDao() {
        return this._fundamentalDao.getValue();
    }

    @Override // com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDatabase
    public InstrumentRatingsDao instrumentRatingsDao() {
        return this._instrumentRatingsDao.getValue();
    }
}
