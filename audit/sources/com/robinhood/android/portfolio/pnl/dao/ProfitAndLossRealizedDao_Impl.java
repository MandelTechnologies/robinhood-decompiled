package com.robinhood.android.portfolio.pnl.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubRoomConverters;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized;
import com.robinhood.models.converter.MoneyTypeConverter;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.utils.room.CommonRoomConverters;
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
import p479j$.time.Instant;

/* compiled from: ProfitAndLossRealizedDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao_Impl;", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfProfitAndLossRealized", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "__moneyTypeConverter", "Lkotlin/Lazy;", "Lcom/robinhood/models/converter/MoneyTypeConverter;", "__commonRoomConverters", "Lcom/robinhood/utils/room/CommonRoomConverters;", "__profitAndLossHubRoomConverters", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubRoomConverters;", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "streamRealized", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "displayCurrency", "Lcom/robinhood/rosetta/common/Currency;", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossRealizedDao_Impl implements ProfitAndLossRealizedDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ProfitAndLossRealized> __insertAdapterOfProfitAndLossRealized;
    private final Lazy<MoneyTypeConverter> __moneyTypeConverter;
    private final Lazy<ProfitAndLossHubRoomConverters> __profitAndLossHubRoomConverters;

    public ProfitAndLossRealizedDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__moneyTypeConverter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossRealizedDao_Impl.__moneyTypeConverter$lambda$0(__db);
            }
        });
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossRealizedDao_Impl.__commonRoomConverters$lambda$1(__db);
            }
        });
        this.__profitAndLossHubRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossRealizedDao_Impl.__profitAndLossHubRoomConverters$lambda$2(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfProfitAndLossRealized = new EntityInsertAdapter<ProfitAndLossRealized>() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ProfitAndLossRealized` (`accountNumber`,`pastMonth`,`yearToDate`,`receivedAt`,`displayCurrency`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ProfitAndLossRealized entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getAccountNumber());
                String strMoneyToString = ProfitAndLossRealizedDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getPastMonth());
                if (strMoneyToString == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, strMoneyToString);
                }
                String strMoneyToString2 = ProfitAndLossRealizedDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getYearToDate());
                if (strMoneyToString2 == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strMoneyToString2);
                }
                String strInstantToString = ProfitAndLossRealizedDao_Impl.this.__commonRoomConverters().instantToString(entity.getReceivedAt());
                if (strInstantToString == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strInstantToString);
                }
                if (ProfitAndLossRealizedDao_Impl.this.__profitAndLossHubRoomConverters().rosettaCurrencyToInt(entity.getDisplayCurrency()) == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindLong(5, r5.intValue());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonRoomConverters __commonRoomConverters$lambda$1(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(CommonRoomConverters.class));
        if (typeConverter != null) {
            return (CommonRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfitAndLossHubRoomConverters __profitAndLossHubRoomConverters$lambda$2(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(ProfitAndLossHubRoomConverters.class));
        if (typeConverter != null) {
            return (ProfitAndLossHubRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final ProfitAndLossRealized item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossRealizedDao_Impl.insert$lambda$3(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$3(ProfitAndLossRealizedDao_Impl profitAndLossRealizedDao_Impl, ProfitAndLossRealized profitAndLossRealized, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        profitAndLossRealizedDao_Impl.__insertAdapterOfProfitAndLossRealized.insert(_connection, (SQLiteConnection) profitAndLossRealized);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao
    public Flow<ProfitAndLossRealized> streamRealized(final String accountNumber, final Currency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        final String str = "\n        SELECT * FROM ProfitAndLossRealized \n        WHERE accountNumber = ? \n        AND displayCurrency = ? \n        LIMIT 1\n        ";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"ProfitAndLossRealized"}, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossRealizedDao_Impl.streamRealized$lambda$4(str, accountNumber, this, displayCurrency, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfitAndLossRealized streamRealized$lambda$4(String str, String str2, ProfitAndLossRealizedDao_Impl profitAndLossRealizedDao_Impl, Currency currency, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            if (profitAndLossRealizedDao_Impl.__profitAndLossHubRoomConverters().rosettaCurrencyToInt(currency) == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindLong(2, r11.intValue());
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pastMonth");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "yearToDate");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receivedAt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayCurrency");
            ProfitAndLossRealized profitAndLossRealized = null;
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                Money moneyStringToMoney = profitAndLossRealizedDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (moneyStringToMoney == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                }
                Money moneyStringToMoney2 = profitAndLossRealizedDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (moneyStringToMoney2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                }
                Instant instantStringToInstant = profitAndLossRealizedDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                }
                Currency currencyIntToRosettaCurrency = profitAndLossRealizedDao_Impl.__profitAndLossHubRoomConverters().intToRosettaCurrency(numValueOf);
                if (currencyIntToRosettaCurrency == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.common.Currency', but it was NULL.");
                }
                profitAndLossRealized = new ProfitAndLossRealized(text, moneyStringToMoney, moneyStringToMoney2, instantStringToInstant, currencyIntToRosettaCurrency);
            }
            sQLiteStatementPrepare.close();
            return profitAndLossRealized;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MoneyTypeConverter __moneyTypeConverter() {
        return this.__moneyTypeConverter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfitAndLossHubRoomConverters __profitAndLossHubRoomConverters() {
        return this.__profitAndLossHubRoomConverters.getValue();
    }

    /* compiled from: ProfitAndLossRealizedDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossRealizedDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(MoneyTypeConverter.class), Reflection.getOrCreateKotlinClass(CommonRoomConverters.class), Reflection.getOrCreateKotlinClass(ProfitAndLossHubRoomConverters.class)});
        }
    }
}
