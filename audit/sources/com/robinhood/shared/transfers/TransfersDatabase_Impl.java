package com.robinhood.shared.transfers;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.robinhood.models.dao.PaymentIntentDao;
import com.robinhood.models.dao.PaymentIntentDao_Impl;
import com.robinhood.models.paymentinstrument.dao.PaymentInstrumentV2Dao;
import com.robinhood.models.paymentinstrument.dao.PaymentInstrumentV2Dao_Impl;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: TransfersDatabase_Impl.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00120\u0010H\u0014J\u0016\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00110\u0014H\u0016J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0011\u0012\u0004\u0012\u00020\u00150\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/transfers/TransfersDatabase_Impl;", "Lcom/robinhood/shared/transfers/TransfersDatabase;", "<init>", "()V", "_paymentInstrumentV2Dao", "Lkotlin/Lazy;", "Lcom/robinhood/models/paymentinstrument/dao/PaymentInstrumentV2Dao;", "_paymentIntentDao", "Lcom/robinhood/models/dao/PaymentIntentDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "paymentInstrumentV2Dao", "paymentIntentDao", "lib-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TransfersDatabase_Impl extends TransfersDatabase {
    private final Lazy<PaymentInstrumentV2Dao> _paymentInstrumentV2Dao = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.transfers.TransfersDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransfersDatabase_Impl._paymentInstrumentV2Dao$lambda$0(this.f$0);
        }
    });
    private final Lazy<PaymentIntentDao> _paymentIntentDao = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.transfers.TransfersDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransfersDatabase_Impl._paymentIntentDao$lambda$1(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentInstrumentV2Dao_Impl _paymentInstrumentV2Dao$lambda$0(TransfersDatabase_Impl transfersDatabase_Impl) {
        return new PaymentInstrumentV2Dao_Impl(transfersDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentIntentDao_Impl _paymentIntentDao$lambda$1(TransfersDatabase_Impl transfersDatabase_Impl) {
        return new PaymentIntentDao_Impl(transfersDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.robinhood.shared.transfers.TransfersDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(4, "5a229455ef6c383b045cf6aa07ae14d0", "987492d2d29f4bb8bee8facffb29ebc0");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PaymentInstrumentV2` (`instrumentId` TEXT NOT NULL, `status` TEXT NOT NULL, `type` TEXT NOT NULL, `details` TEXT NOT NULL, PRIMARY KEY(`instrumentId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PaymentIntent` (`id` TEXT NOT NULL, `direction` TEXT NOT NULL, `state` TEXT NOT NULL, `purpose` TEXT NOT NULL, `rhAccountId` TEXT NOT NULL, `rhAccountType` TEXT NOT NULL, `paymentInstrumentId` TEXT NOT NULL, `paymentInstrumentType` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `currency` TEXT NOT NULL, `decimalValue` TEXT NOT NULL, `receivedAmount_currency` TEXT NOT NULL, `receivedAmount_decimalValue` TEXT NOT NULL, `baseAmount` TEXT, `baseCurrency` TEXT, `targetAmount` TEXT, `targetCurrency` TEXT, `targetFxRate` TEXT, `actualTargetAmount` TEXT, `actualTargetFxRate` TEXT, `serviceFee_currency` TEXT, `serviceFee_decimalValue` TEXT, `taxAmount_currency` TEXT, `taxAmount_decimalValue` TEXT, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5a229455ef6c383b045cf6aa07ae14d0')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PaymentInstrumentV2`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PaymentIntent`");
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
                linkedHashMap.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
                linkedHashMap.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                linkedHashMap.put(ErrorBundle.DETAIL_ENTRY, new TableInfo.Column(ErrorBundle.DETAIL_ENTRY, "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("PaymentInstrumentV2", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "PaymentInstrumentV2");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "PaymentInstrumentV2(com.robinhood.models.paymentinstrument.db.PaymentInstrumentV2).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("direction", new TableInfo.Column("direction", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("purpose", new TableInfo.Column("purpose", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("rhAccountId", new TableInfo.Column("rhAccountId", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("rhAccountType", new TableInfo.Column("rhAccountType", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("paymentInstrumentId", new TableInfo.Column("paymentInstrumentId", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("paymentInstrumentType", new TableInfo.Column("paymentInstrumentType", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("decimalValue", new TableInfo.Column("decimalValue", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("receivedAmount_currency", new TableInfo.Column("receivedAmount_currency", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("receivedAmount_decimalValue", new TableInfo.Column("receivedAmount_decimalValue", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("baseAmount", new TableInfo.Column("baseAmount", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("baseCurrency", new TableInfo.Column("baseCurrency", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("targetAmount", new TableInfo.Column("targetAmount", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("targetCurrency", new TableInfo.Column("targetCurrency", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("targetFxRate", new TableInfo.Column("targetFxRate", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("actualTargetAmount", new TableInfo.Column("actualTargetAmount", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("actualTargetFxRate", new TableInfo.Column("actualTargetFxRate", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("serviceFee_currency", new TableInfo.Column("serviceFee_currency", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("serviceFee_decimalValue", new TableInfo.Column("serviceFee_decimalValue", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("taxAmount_currency", new TableInfo.Column("taxAmount_currency", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("taxAmount_decimalValue", new TableInfo.Column("taxAmount_decimalValue", "TEXT", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("PaymentIntent", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "PaymentIntent");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "PaymentIntent(com.robinhood.models.db.bff.PaymentIntent).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "PaymentInstrumentV2", "PaymentIntent");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "PaymentInstrumentV2", "PaymentIntent");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(PaymentInstrumentV2Dao.class), PaymentInstrumentV2Dao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(PaymentIntentDao.class), PaymentIntentDao_Impl.INSTANCE.getRequiredConverters());
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

    @Override // com.robinhood.shared.transfers.TransfersDatabase
    public PaymentInstrumentV2Dao paymentInstrumentV2Dao() {
        return this._paymentInstrumentV2Dao.getValue();
    }

    @Override // com.robinhood.shared.transfers.TransfersDatabase
    public PaymentIntentDao paymentIntentDao() {
        return this._paymentIntentDao.getValue();
    }
}
