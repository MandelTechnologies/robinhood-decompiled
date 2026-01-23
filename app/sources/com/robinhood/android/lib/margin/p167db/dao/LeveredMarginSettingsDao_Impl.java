package com.robinhood.android.lib.margin.p167db.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.lib.margin.api.ApiMarginSettings;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.models.converter.MoneyTypeConverter;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: LeveredMarginSettingsDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao_Impl;", "Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMarginSettings", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "__moneyTypeConverter", "Lkotlin/Lazy;", "Lcom/robinhood/models/converter/MoneyTypeConverter;", "insert", "", "marginSettings", "apiMarginSettings", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettings;", "getLeveredMarginSettings", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "Companion", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LeveredMarginSettingsDao_Impl implements LeveredMarginSettingsDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MarginSettings> __insertAdapterOfMarginSettings;
    private final Lazy<MoneyTypeConverter> __moneyTypeConverter;

    public LeveredMarginSettingsDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__moneyTypeConverter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lib.margin.db.dao.LeveredMarginSettingsDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeveredMarginSettingsDao_Impl.__moneyTypeConverter$lambda$0(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfMarginSettings = new EntityInsertAdapter<MarginSettings>() { // from class: com.robinhood.android.lib.margin.db.dao.LeveredMarginSettingsDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `MarginSettings` (`accountNumber`,`isMarginInvestingEnabled`,`userSetMarginInvestingLimit`,`isMarginSpendingEnabled`,`userSetMarginSpendingLimit`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, MarginSettings entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getAccountNumber());
                statement.bindLong(2, entity.isMarginInvestingEnabled() ? 1L : 0L);
                String strMoneyToString = LeveredMarginSettingsDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getUserSetMarginInvestingLimit());
                if (strMoneyToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strMoneyToString);
                }
                statement.bindLong(4, entity.isMarginSpendingEnabled() ? 1L : 0L);
                String strMoneyToString2 = LeveredMarginSettingsDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getUserSetMarginSpendingLimit());
                if (strMoneyToString2 == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strMoneyToString2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MoneyTypeConverter __moneyTypeConverter$lambda$0(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(MoneyTypeConverter.class));
        if (typeConverter != null) {
            return (MoneyTypeConverter) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao
    public void insert(final MarginSettings marginSettings) {
        Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.lib.margin.db.dao.LeveredMarginSettingsDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeveredMarginSettingsDao_Impl.insert$lambda$1(this.f$0, marginSettings, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(LeveredMarginSettingsDao_Impl leveredMarginSettingsDao_Impl, MarginSettings marginSettings, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        leveredMarginSettingsDao_Impl.__insertAdapterOfMarginSettings.insert(_connection, (SQLiteConnection) marginSettings);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao
    public void insert(final ApiMarginSettings apiMarginSettings) {
        Intrinsics.checkNotNullParameter(apiMarginSettings, "apiMarginSettings");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.lib.margin.db.dao.LeveredMarginSettingsDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeveredMarginSettingsDao_Impl.insert$lambda$2(this.f$0, apiMarginSettings, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$2(LeveredMarginSettingsDao_Impl leveredMarginSettingsDao_Impl, ApiMarginSettings apiMarginSettings, SQLiteConnection sQLiteConnection) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "<unused var>");
        LeveredMarginSettingsDao.DefaultImpls.insert(leveredMarginSettingsDao_Impl, apiMarginSettings);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao
    public Flow<MarginSettings> getLeveredMarginSettings(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final String str = "SELECT * FROM MarginSettings WHERE accountNumber = ? LIMIT 1";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"MarginSettings"}, new Function1() { // from class: com.robinhood.android.lib.margin.db.dao.LeveredMarginSettingsDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeveredMarginSettingsDao_Impl.getLeveredMarginSettings$lambda$3(str, accountNumber, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginSettings getLeveredMarginSettings$lambda$3(String str, String str2, LeveredMarginSettingsDao_Impl leveredMarginSettingsDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isMarginInvestingEnabled");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userSetMarginInvestingLimit");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isMarginSpendingEnabled");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userSetMarginSpendingLimit");
            MarginSettings marginSettings = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0;
                Money moneyStringToMoney = leveredMarginSettingsDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0;
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                marginSettings = new MarginSettings(text2, z, moneyStringToMoney, z2, leveredMarginSettingsDao_Impl.__moneyTypeConverter().stringToMoney(text));
            }
            return marginSettings;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MoneyTypeConverter __moneyTypeConverter() {
        return this.__moneyTypeConverter.getValue();
    }

    /* compiled from: LeveredMarginSettingsDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(MoneyTypeConverter.class));
        }
    }
}
