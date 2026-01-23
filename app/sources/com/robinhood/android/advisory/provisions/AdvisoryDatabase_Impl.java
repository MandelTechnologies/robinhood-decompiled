package com.robinhood.android.advisory.provisions;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.robinhood.models.advisory.dao.AdvisorInsightsDao;
import com.robinhood.models.advisory.dao.AdvisorInsightsDao_Impl;
import com.robinhood.models.advisory.dao.AdvisorTradesDao;
import com.robinhood.models.advisory.dao.AdvisorTradesDao_Impl;
import com.robinhood.models.advisory.dao.AdvisoryFeeDao;
import com.robinhood.models.advisory.dao.AdvisoryFeeDao_Impl;
import com.robinhood.models.advisory.dao.ManagedReturnsBreakdownDao;
import com.robinhood.models.advisory.dao.ManagedReturnsBreakdownDao_Impl;
import com.robinhood.models.advisory.dao.RestrictStocksDao;
import com.robinhood.models.advisory.dao.RestrictStocksDao_Impl;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: AdvisoryDatabase_Impl.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00180\u0016H\u0014J\u0016\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00170\u001aH\u0016J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\u001a\u0010\u001e\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u001b0\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase_Impl;", "Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase;", "<init>", "()V", "_advisorTradesDao", "Lkotlin/Lazy;", "Lcom/robinhood/models/advisory/dao/AdvisorTradesDao;", "_advisoryFeeDao", "Lcom/robinhood/models/advisory/dao/AdvisoryFeeDao;", "_restrictStocksDao", "Lcom/robinhood/models/advisory/dao/RestrictStocksDao;", "_managedReturnsBreakdownDao", "Lcom/robinhood/models/advisory/dao/ManagedReturnsBreakdownDao;", "_advisorInsightsDao", "Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "advisorTradesDao", "advisoryFeeDao", "restrictStocksDao", "managedReturnsBreakdownDao", "advisorInsightsDao", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryDatabase_Impl extends AdvisoryDatabase {
    private final Lazy<AdvisorTradesDao> _advisorTradesDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.advisory.provisions.AdvisoryDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdvisoryDatabase_Impl._advisorTradesDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<AdvisoryFeeDao> _advisoryFeeDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.advisory.provisions.AdvisoryDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdvisoryDatabase_Impl._advisoryFeeDao$lambda$1(this.f$0);
        }
    });
    private final Lazy<RestrictStocksDao> _restrictStocksDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.advisory.provisions.AdvisoryDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdvisoryDatabase_Impl._restrictStocksDao$lambda$2(this.f$0);
        }
    });
    private final Lazy<ManagedReturnsBreakdownDao> _managedReturnsBreakdownDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.advisory.provisions.AdvisoryDatabase_Impl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdvisoryDatabase_Impl._managedReturnsBreakdownDao$lambda$3(this.f$0);
        }
    });
    private final Lazy<AdvisorInsightsDao> _advisorInsightsDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.advisory.provisions.AdvisoryDatabase_Impl$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdvisoryDatabase_Impl._advisorInsightsDao$lambda$4(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisorTradesDao_Impl _advisorTradesDao$lambda$0(AdvisoryDatabase_Impl advisoryDatabase_Impl) {
        return new AdvisorTradesDao_Impl(advisoryDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisoryFeeDao_Impl _advisoryFeeDao$lambda$1(AdvisoryDatabase_Impl advisoryDatabase_Impl) {
        return new AdvisoryFeeDao_Impl(advisoryDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RestrictStocksDao_Impl _restrictStocksDao$lambda$2(AdvisoryDatabase_Impl advisoryDatabase_Impl) {
        return new RestrictStocksDao_Impl(advisoryDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManagedReturnsBreakdownDao_Impl _managedReturnsBreakdownDao$lambda$3(AdvisoryDatabase_Impl advisoryDatabase_Impl) {
        return new ManagedReturnsBreakdownDao_Impl(advisoryDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisorInsightsDao_Impl _advisorInsightsDao$lambda$4(AdvisoryDatabase_Impl advisoryDatabase_Impl) {
        return new AdvisorInsightsDao_Impl(advisoryDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.robinhood.android.advisory.provisions.AdvisoryDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(2, "b7ed2066dedb0ee62543ec96a9bc5c68", "4804fb337e29821ffa154dc31d6072bf");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `AdvisorTrade` (`id` TEXT NOT NULL, `initiatedAt` TEXT NOT NULL, `accountNumber` TEXT NOT NULL, `orderGroups` TEXT NOT NULL, `state` TEXT NOT NULL, `totalBought` TEXT, `totalSold` TEXT, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `AdvisoryFee` (`id` TEXT NOT NULL, `amount` TEXT NOT NULL, `transactionTime` TEXT NOT NULL, `accountNumber` TEXT NOT NULL, `state` TEXT NOT NULL, `data` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `AdvisoryInsight` (`id` TEXT NOT NULL, `accountNumber` TEXT NOT NULL, `contentViewModel` TEXT NOT NULL, `createAt` TEXT NOT NULL, `isSeen` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `insightType` TEXT NOT NULL, `pageType` TEXT NOT NULL, `parentId` TEXT, `sortOrder` INTEGER NOT NULL, PRIMARY KEY(`id`, `accountNumber`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `RestrictedStocksResponse` (`accountNumber` TEXT NOT NULL, `restrictedAssets` TEXT NOT NULL, `disclosureTitle` TEXT NOT NULL, `disclosureSubtitle` TEXT NOT NULL, `disclosureCtaText` TEXT NOT NULL, `maxRestrictedAssetsAllowed` INTEGER NOT NULL, PRIMARY KEY(`accountNumber`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `ReturnsBreakdown` (`accountNumber` TEXT NOT NULL, `span` TEXT NOT NULL, `spanDescription` TEXT NOT NULL, `income` TEXT NOT NULL, `advisoryFee` TEXT NOT NULL, `totalReturns` TEXT NOT NULL, `appreciation` TEXT NOT NULL, `showBottomSheet` INTEGER NOT NULL, `learnMore` TEXT, PRIMARY KEY(`accountNumber`, `span`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b7ed2066dedb0ee62543ec96a9bc5c68')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `AdvisorTrade`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `AdvisoryFee`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `AdvisoryInsight`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `RestrictedStocksResponse`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `ReturnsBreakdown`");
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
                linkedHashMap.put("initiatedAt", new TableInfo.Column("initiatedAt", "TEXT", true, 0, null, 1));
                linkedHashMap.put("accountNumber", new TableInfo.Column("accountNumber", "TEXT", true, 0, null, 1));
                linkedHashMap.put("orderGroups", new TableInfo.Column("orderGroups", "TEXT", true, 0, null, 1));
                linkedHashMap.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
                linkedHashMap.put("totalBought", new TableInfo.Column("totalBought", "TEXT", false, 0, null, 1));
                linkedHashMap.put("totalSold", new TableInfo.Column("totalSold", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("AdvisorTrade", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "AdvisorTrade");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "AdvisorTrade(com.robinhood.models.advisory.db.trade.AdvisorTrade).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("amount", new TableInfo.Column("amount", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("transactionTime", new TableInfo.Column("transactionTime", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("accountNumber", new TableInfo.Column("accountNumber", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
                linkedHashMap2.put(WebsocketGatewayConstants.DATA_KEY, new TableInfo.Column(WebsocketGatewayConstants.DATA_KEY, "TEXT", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("AdvisoryFee", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "AdvisoryFee");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "AdvisoryFee(com.robinhood.models.advisory.db.fee.AdvisoryFee).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap3.put("accountNumber", new TableInfo.Column("accountNumber", "TEXT", true, 2, null, 1));
                linkedHashMap3.put("contentViewModel", new TableInfo.Column("contentViewModel", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("createAt", new TableInfo.Column("createAt", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("isSeen", new TableInfo.Column("isSeen", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("insightType", new TableInfo.Column("insightType", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("pageType", new TableInfo.Column("pageType", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("parentId", new TableInfo.Column("parentId", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("sortOrder", new TableInfo.Column("sortOrder", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("AdvisoryInsight", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo6 = companion.read(connection, "AdvisoryInsight");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "AdvisoryInsight(com.robinhood.models.advisory.db.insights.AdvisoryInsight).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("accountNumber", new TableInfo.Column("accountNumber", "TEXT", true, 1, null, 1));
                linkedHashMap4.put("restrictedAssets", new TableInfo.Column("restrictedAssets", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("disclosureTitle", new TableInfo.Column("disclosureTitle", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("disclosureSubtitle", new TableInfo.Column("disclosureSubtitle", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("disclosureCtaText", new TableInfo.Column("disclosureCtaText", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("maxRestrictedAssetsAllowed", new TableInfo.Column("maxRestrictedAssetsAllowed", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("RestrictedStocksResponse", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo8 = companion.read(connection, "RestrictedStocksResponse");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "RestrictedStocksResponse(com.robinhood.models.advisory.db.portfolio.RestrictedStocksResponse).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("accountNumber", new TableInfo.Column("accountNumber", "TEXT", true, 1, null, 1));
                linkedHashMap5.put("span", new TableInfo.Column("span", "TEXT", true, 2, null, 1));
                linkedHashMap5.put("spanDescription", new TableInfo.Column("spanDescription", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("income", new TableInfo.Column("income", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("advisoryFee", new TableInfo.Column("advisoryFee", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("totalReturns", new TableInfo.Column("totalReturns", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("appreciation", new TableInfo.Column("appreciation", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("showBottomSheet", new TableInfo.Column("showBottomSheet", "INTEGER", true, 0, null, 1));
                linkedHashMap5.put("learnMore", new TableInfo.Column("learnMore", "TEXT", false, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("ReturnsBreakdown", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo10 = companion.read(connection, "ReturnsBreakdown");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "ReturnsBreakdown(com.robinhood.models.advisory.db.returns.ReturnsBreakdown).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "AdvisorTrade", "AdvisoryFee", "AdvisoryInsight", "RestrictedStocksResponse", "ReturnsBreakdown");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "AdvisorTrade", "AdvisoryFee", "AdvisoryInsight", "RestrictedStocksResponse", "ReturnsBreakdown");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(AdvisorTradesDao.class), AdvisorTradesDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(AdvisoryFeeDao.class), AdvisoryFeeDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(RestrictStocksDao.class), RestrictStocksDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(ManagedReturnsBreakdownDao.class), ManagedReturnsBreakdownDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(AdvisorInsightsDao.class), AdvisorInsightsDao_Impl.INSTANCE.getRequiredConverters());
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
        arrayList.add(new AdvisoryDatabase_AutoMigration_1_2_Impl());
        return arrayList;
    }

    @Override // com.robinhood.android.advisory.provisions.AdvisoryDatabase
    public AdvisorTradesDao advisorTradesDao() {
        return this._advisorTradesDao.getValue();
    }

    @Override // com.robinhood.android.advisory.provisions.AdvisoryDatabase
    public AdvisoryFeeDao advisoryFeeDao() {
        return this._advisoryFeeDao.getValue();
    }

    @Override // com.robinhood.android.advisory.provisions.AdvisoryDatabase
    public RestrictStocksDao restrictStocksDao() {
        return this._restrictStocksDao.getValue();
    }

    @Override // com.robinhood.android.advisory.provisions.AdvisoryDatabase
    public ManagedReturnsBreakdownDao managedReturnsBreakdownDao() {
        return this._managedReturnsBreakdownDao.getValue();
    }

    @Override // com.robinhood.android.advisory.provisions.AdvisoryDatabase
    public AdvisorInsightsDao advisorInsightsDao() {
        return this._advisorInsightsDao.getValue();
    }
}
