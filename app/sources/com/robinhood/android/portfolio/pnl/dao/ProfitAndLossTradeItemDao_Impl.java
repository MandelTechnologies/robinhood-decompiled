package com.robinhood.android.portfolio.pnl.dao;

import androidx.paging.PagingSource;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl;
import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubRoomConverters;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.models.converter.MoneyTypeConverter;
import com.robinhood.models.util.Money;
import com.robinhood.utils.room.CommonRoomConverters;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p479j$.time.Instant;

/* compiled from: ProfitAndLossTradeItemDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u0016H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0013H\u0016J\u000e\u0010\u001e\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u001fJ\b\u0010\t\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao_Impl;", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfProfitAndLossTradeItem", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "__commonRoomConverters", "Lkotlin/Lazy;", "Lcom/robinhood/utils/room/CommonRoomConverters;", "__moneyTypeConverter", "Lcom/robinhood/models/converter/MoneyTypeConverter;", "__profitAndLossHubRoomConverters", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubRoomConverters;", "insertAll", "", "users", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTradeItemsPagingSource", "Landroidx/paging/PagingSource;", "", "getTradeItemsPagingSourceWithSymbol", "requestSymbol", "", "getTradeItemsPagingSourceWithSymbolAndAssetClasses", "assetClasses", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossTradeItemDao_Impl implements ProfitAndLossTradeItemDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ProfitAndLossTradeItem> __insertAdapterOfProfitAndLossTradeItem;
    private final Lazy<MoneyTypeConverter> __moneyTypeConverter;
    private final Lazy<ProfitAndLossHubRoomConverters> __profitAndLossHubRoomConverters;

    public ProfitAndLossTradeItemDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossTradeItemDao_Impl.__commonRoomConverters$lambda$0(__db);
            }
        });
        this.__moneyTypeConverter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossTradeItemDao_Impl.__moneyTypeConverter$lambda$1(__db);
            }
        });
        this.__profitAndLossHubRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossTradeItemDao_Impl.__profitAndLossHubRoomConverters$lambda$2(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfProfitAndLossTradeItem = new EntityInsertAdapter<ProfitAndLossTradeItem>() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ProfitAndLossTradeItem` (`id`,`assetClass`,`symbol`,`closeTimestamp`,`displayName`,`realizedReturn`,`realizedReturnPercentage`,`firstExecutionTimeStamp`,`quantity`,`openingAmount`,`closingAmount`,`openAveragePrice`,`closeAveragePrice`,`detailDisplayName`,`orderDetails`,`requestSymbol`,`nextCursor`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ProfitAndLossTradeItem entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = ProfitAndLossTradeItemDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                String serverValue = AssetClass.INSTANCE.toServerValue(entity.getAssetClass());
                if (serverValue == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, serverValue);
                }
                statement.bindText(3, entity.getSymbol());
                String strInstantToString = ProfitAndLossTradeItemDao_Impl.this.__commonRoomConverters().instantToString(entity.getCloseTimestamp());
                if (strInstantToString == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strInstantToString);
                }
                statement.bindText(5, entity.getDisplayName());
                String strMoneyToString = ProfitAndLossTradeItemDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getRealizedReturn());
                if (strMoneyToString == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, strMoneyToString);
                }
                String strBigDecimalToString = ProfitAndLossTradeItemDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getRealizedReturnPercentage());
                if (strBigDecimalToString == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindText(7, strBigDecimalToString);
                }
                String strInstantToString2 = ProfitAndLossTradeItemDao_Impl.this.__commonRoomConverters().instantToString(entity.getFirstExecutionTimeStamp());
                if (strInstantToString2 == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindText(8, strInstantToString2);
                }
                String strBigDecimalToString2 = ProfitAndLossTradeItemDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getQuantity());
                if (strBigDecimalToString2 == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindText(9, strBigDecimalToString2);
                }
                String strMoneyToString2 = ProfitAndLossTradeItemDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getOpeningAmount());
                if (strMoneyToString2 == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindText(10, strMoneyToString2);
                }
                String strMoneyToString3 = ProfitAndLossTradeItemDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getClosingAmount());
                if (strMoneyToString3 == null) {
                    statement.bindNull(11);
                } else {
                    statement.bindText(11, strMoneyToString3);
                }
                String strMoneyToString4 = ProfitAndLossTradeItemDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getOpenAveragePrice());
                if (strMoneyToString4 == null) {
                    statement.bindNull(12);
                } else {
                    statement.bindText(12, strMoneyToString4);
                }
                String strMoneyToString5 = ProfitAndLossTradeItemDao_Impl.this.__moneyTypeConverter().moneyToString(entity.getCloseAveragePrice());
                if (strMoneyToString5 == null) {
                    statement.bindNull(13);
                } else {
                    statement.bindText(13, strMoneyToString5);
                }
                statement.bindText(14, entity.getDetailDisplayName());
                String strProfitAndLossOrderDetailsToString = ProfitAndLossTradeItemDao_Impl.this.__profitAndLossHubRoomConverters().profitAndLossOrderDetailsToString(entity.getOrderDetails());
                if (strProfitAndLossOrderDetailsToString == null) {
                    statement.bindNull(15);
                } else {
                    statement.bindText(15, strProfitAndLossOrderDetailsToString);
                }
                String requestSymbol = entity.getRequestSymbol();
                if (requestSymbol == null) {
                    statement.bindNull(16);
                } else {
                    statement.bindText(16, requestSymbol);
                }
                String nextCursor = entity.getNextCursor();
                if (nextCursor == null) {
                    statement.bindNull(17);
                } else {
                    statement.bindText(17, nextCursor);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonRoomConverters __commonRoomConverters$lambda$0(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(CommonRoomConverters.class));
        if (typeConverter != null) {
            return (CommonRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MoneyTypeConverter __moneyTypeConverter$lambda$1(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(MoneyTypeConverter.class));
        if (typeConverter != null) {
            return (MoneyTypeConverter) typeConverter;
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

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao
    public Object insertAll(final List<ProfitAndLossTradeItem> list, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossTradeItemDao_Impl.insertAll$lambda$3(this.f$0, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertAll$lambda$3(ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl, List list, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        profitAndLossTradeItemDao_Impl.__insertAdapterOfProfitAndLossTradeItem.insert(_connection, list);
        return Unit.INSTANCE;
    }

    /* compiled from: ProfitAndLossTradeItemDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"com/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSource$1", "Landroidx/room/paging/LimitOffsetPagingSource;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "convertRows", "", "limitOffsetQuery", "Landroidx/room/RoomRawQuery;", "itemCount", "", "(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSource$1 */
    /* loaded from: classes11.dex */
    public static final class C257131 extends LimitOffsetPagingSource<ProfitAndLossTradeItem> {
        final /* synthetic */ ProfitAndLossTradeItemDao_Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257131(RoomRawQuery roomRawQuery, ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl, RoomDatabase roomDatabase, String[] strArr) {
            super(roomRawQuery, roomDatabase, strArr);
            this.this$0 = profitAndLossTradeItemDao_Impl;
        }

        @Override // androidx.room.paging.LimitOffsetPagingSource
        protected Object convertRows(final RoomRawQuery roomRawQuery, int i, Continuation<? super List<? extends ProfitAndLossTradeItem>> continuation) {
            RoomDatabase roomDatabase = this.this$0.__db;
            final ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl = this.this$0;
            return DBUtil.performSuspending(roomDatabase, true, false, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSource$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfitAndLossTradeItemDao_Impl.C257131.convertRows$lambda$0(roomRawQuery, profitAndLossTradeItemDao_Impl, (SQLiteConnection) obj);
                }
            }, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List convertRows$lambda$0(RoomRawQuery roomRawQuery, ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl, SQLiteConnection _connection) {
            int i;
            String text;
            Intrinsics.checkNotNullParameter(_connection, "_connection");
            SQLiteStatement sQLiteStatementPrepare = _connection.prepare(roomRawQuery.getSql());
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            try {
                int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetClass");
                int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closeTimestamp");
                int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayName");
                int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "realizedReturn");
                int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "realizedReturnPercentage");
                int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstExecutionTimeStamp");
                int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
                int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingAmount");
                int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingAmount");
                int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openAveragePrice");
                int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closeAveragePrice");
                int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detailDisplayName");
                int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderDetails");
                int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestSymbol");
                int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextCursor");
                ArrayList arrayList = new ArrayList();
                while (sQLiteStatementPrepare.step()) {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                        i = columnIndexOrThrow;
                        text = null;
                    } else {
                        i = columnIndexOrThrow;
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    }
                    ArrayList arrayList2 = arrayList;
                    UUID uuidStringToUuid = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToUuid(text);
                    if (uuidStringToUuid == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                    }
                    AssetClass assetClassFromServerValue = AssetClass.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                    if (assetClassFromServerValue == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.models.portfolio.api.AssetClass', but it was NULL.");
                    }
                    String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    Instant instantStringToInstant = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                    if (instantStringToInstant == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                    }
                    String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                    int i2 = columnIndexOrThrow2;
                    Money moneyStringToMoney = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                    BigDecimal bigDecimalStringToBigDecimal = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                    if (bigDecimalStringToBigDecimal != null) {
                        int i3 = columnIndexOrThrow3;
                        Instant instantStringToInstant2 = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        if (instantStringToInstant2 != null) {
                            BigDecimal bigDecimalStringToBigDecimal2 = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                            if (bigDecimalStringToBigDecimal2 != null) {
                                Money moneyStringToMoney2 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                                Money moneyStringToMoney3 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                if (moneyStringToMoney3 != null) {
                                    Money moneyStringToMoney4 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                                    Money moneyStringToMoney5 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                    if (moneyStringToMoney5 == null) {
                                        throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                                    }
                                    int i4 = columnIndexOrThrow15;
                                    int i5 = columnIndexOrThrow16;
                                    int i6 = columnIndexOrThrow17;
                                    columnIndexOrThrow15 = i4;
                                    arrayList2.add(new ProfitAndLossTradeItem(uuidStringToUuid, assetClassFromServerValue, text2, instantStringToInstant, text3, moneyStringToMoney, bigDecimalStringToBigDecimal, instantStringToInstant2, bigDecimalStringToBigDecimal2, moneyStringToMoney2, moneyStringToMoney3, moneyStringToMoney4, moneyStringToMoney5, sQLiteStatementPrepare.getText(columnIndexOrThrow14), profitAndLossTradeItemDao_Impl.__profitAndLossHubRoomConverters().stringToProfitAndLossOrderDetails(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4)), sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6)));
                                    arrayList = arrayList2;
                                    columnIndexOrThrow16 = i5;
                                    columnIndexOrThrow17 = i6;
                                    columnIndexOrThrow = i;
                                    columnIndexOrThrow2 = i2;
                                    columnIndexOrThrow3 = i3;
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                    }
                }
                ArrayList arrayList3 = arrayList;
                sQLiteStatementPrepare.close();
                return arrayList3;
            } catch (Throwable th) {
                sQLiteStatementPrepare.close();
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao
    public PagingSource<Integer, ProfitAndLossTradeItem> getTradeItemsPagingSource() {
        return new C257131(new RoomRawQuery("SELECT * FROM ProfitAndLossTradeItem", null, 2, null), this, this.__db, new String[]{"ProfitAndLossTradeItem"});
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao
    public PagingSource<Integer, ProfitAndLossTradeItem> getTradeItemsPagingSourceWithSymbol(final String requestSymbol) {
        Intrinsics.checkNotNullParameter(requestSymbol, "requestSymbol");
        return new C257141(new RoomRawQuery("SELECT * FROM ProfitAndLossTradeItem WHERE requestSymbol = ?", new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossTradeItemDao_Impl.getTradeItemsPagingSourceWithSymbol$lambda$4(requestSymbol, (SQLiteStatement) obj);
            }
        }), this, this.__db, new String[]{"ProfitAndLossTradeItem"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTradeItemsPagingSourceWithSymbol$lambda$4(String str, SQLiteStatement _stmt) {
        Intrinsics.checkNotNullParameter(_stmt, "_stmt");
        _stmt.bindText(1, str);
        return Unit.INSTANCE;
    }

    /* compiled from: ProfitAndLossTradeItemDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"com/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSourceWithSymbol$1", "Landroidx/room/paging/LimitOffsetPagingSource;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "convertRows", "", "limitOffsetQuery", "Landroidx/room/RoomRawQuery;", "itemCount", "", "(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSourceWithSymbol$1 */
    /* loaded from: classes11.dex */
    public static final class C257141 extends LimitOffsetPagingSource<ProfitAndLossTradeItem> {
        final /* synthetic */ ProfitAndLossTradeItemDao_Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257141(RoomRawQuery roomRawQuery, ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl, RoomDatabase roomDatabase, String[] strArr) {
            super(roomRawQuery, roomDatabase, strArr);
            this.this$0 = profitAndLossTradeItemDao_Impl;
        }

        @Override // androidx.room.paging.LimitOffsetPagingSource
        protected Object convertRows(final RoomRawQuery roomRawQuery, int i, Continuation<? super List<? extends ProfitAndLossTradeItem>> continuation) {
            RoomDatabase roomDatabase = this.this$0.__db;
            final ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl = this.this$0;
            return DBUtil.performSuspending(roomDatabase, true, false, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSourceWithSymbol$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfitAndLossTradeItemDao_Impl.C257141.convertRows$lambda$0(roomRawQuery, profitAndLossTradeItemDao_Impl, (SQLiteConnection) obj);
                }
            }, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List convertRows$lambda$0(RoomRawQuery roomRawQuery, ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl, SQLiteConnection _connection) {
            int i;
            String text;
            Intrinsics.checkNotNullParameter(_connection, "_connection");
            SQLiteStatement sQLiteStatementPrepare = _connection.prepare(roomRawQuery.getSql());
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            try {
                int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetClass");
                int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closeTimestamp");
                int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayName");
                int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "realizedReturn");
                int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "realizedReturnPercentage");
                int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstExecutionTimeStamp");
                int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
                int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingAmount");
                int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingAmount");
                int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openAveragePrice");
                int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closeAveragePrice");
                int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detailDisplayName");
                int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderDetails");
                int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestSymbol");
                int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextCursor");
                ArrayList arrayList = new ArrayList();
                while (sQLiteStatementPrepare.step()) {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                        i = columnIndexOrThrow;
                        text = null;
                    } else {
                        i = columnIndexOrThrow;
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    }
                    ArrayList arrayList2 = arrayList;
                    UUID uuidStringToUuid = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToUuid(text);
                    if (uuidStringToUuid == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                    }
                    AssetClass assetClassFromServerValue = AssetClass.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                    if (assetClassFromServerValue == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.models.portfolio.api.AssetClass', but it was NULL.");
                    }
                    String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    Instant instantStringToInstant = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                    if (instantStringToInstant == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                    }
                    String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                    int i2 = columnIndexOrThrow2;
                    Money moneyStringToMoney = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                    BigDecimal bigDecimalStringToBigDecimal = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                    if (bigDecimalStringToBigDecimal != null) {
                        int i3 = columnIndexOrThrow3;
                        Instant instantStringToInstant2 = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        if (instantStringToInstant2 != null) {
                            BigDecimal bigDecimalStringToBigDecimal2 = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                            if (bigDecimalStringToBigDecimal2 != null) {
                                Money moneyStringToMoney2 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                                Money moneyStringToMoney3 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                if (moneyStringToMoney3 != null) {
                                    Money moneyStringToMoney4 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                                    Money moneyStringToMoney5 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                    if (moneyStringToMoney5 == null) {
                                        throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                                    }
                                    int i4 = columnIndexOrThrow15;
                                    int i5 = columnIndexOrThrow16;
                                    int i6 = columnIndexOrThrow17;
                                    columnIndexOrThrow15 = i4;
                                    arrayList2.add(new ProfitAndLossTradeItem(uuidStringToUuid, assetClassFromServerValue, text2, instantStringToInstant, text3, moneyStringToMoney, bigDecimalStringToBigDecimal, instantStringToInstant2, bigDecimalStringToBigDecimal2, moneyStringToMoney2, moneyStringToMoney3, moneyStringToMoney4, moneyStringToMoney5, sQLiteStatementPrepare.getText(columnIndexOrThrow14), profitAndLossTradeItemDao_Impl.__profitAndLossHubRoomConverters().stringToProfitAndLossOrderDetails(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4)), sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6)));
                                    arrayList = arrayList2;
                                    columnIndexOrThrow16 = i5;
                                    columnIndexOrThrow17 = i6;
                                    columnIndexOrThrow = i;
                                    columnIndexOrThrow2 = i2;
                                    columnIndexOrThrow3 = i3;
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                    }
                }
                ArrayList arrayList3 = arrayList;
                sQLiteStatementPrepare.close();
                return arrayList3;
            } catch (Throwable th) {
                sQLiteStatementPrepare.close();
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao
    public PagingSource<Integer, ProfitAndLossTradeItem> getTradeItemsPagingSourceWithSymbolAndAssetClasses(final String requestSymbol, final List<? extends AssetClass> assetClasses) {
        Intrinsics.checkNotNullParameter(requestSymbol, "requestSymbol");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ProfitAndLossTradeItem WHERE requestSymbol = ");
        sb.append("?");
        sb.append(" AND assetClass IN (");
        StringUtil.appendPlaceholders(sb, assetClasses == null ? 1 : assetClasses.size());
        sb.append(") ");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new C257151(new RoomRawQuery(string2, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossTradeItemDao_Impl.getTradeItemsPagingSourceWithSymbolAndAssetClasses$lambda$5(requestSymbol, assetClasses, (SQLiteStatement) obj);
            }
        }), this, this.__db, new String[]{"ProfitAndLossTradeItem"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTradeItemsPagingSourceWithSymbolAndAssetClasses$lambda$5(String str, List list, SQLiteStatement _stmt) {
        Intrinsics.checkNotNullParameter(_stmt, "_stmt");
        _stmt.bindText(1, str);
        int i = 2;
        if (list == null) {
            _stmt.bindNull(2);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String serverValue = AssetClass.INSTANCE.toServerValue((AssetClass) it.next());
                if (serverValue == null) {
                    _stmt.bindNull(i);
                } else {
                    _stmt.bindText(i, serverValue);
                }
                i++;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ProfitAndLossTradeItemDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"com/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSourceWithSymbolAndAssetClasses$1", "Landroidx/room/paging/LimitOffsetPagingSource;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "convertRows", "", "limitOffsetQuery", "Landroidx/room/RoomRawQuery;", "itemCount", "", "(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSourceWithSymbolAndAssetClasses$1 */
    /* loaded from: classes11.dex */
    public static final class C257151 extends LimitOffsetPagingSource<ProfitAndLossTradeItem> {
        final /* synthetic */ ProfitAndLossTradeItemDao_Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257151(RoomRawQuery roomRawQuery, ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl, RoomDatabase roomDatabase, String[] strArr) {
            super(roomRawQuery, roomDatabase, strArr);
            this.this$0 = profitAndLossTradeItemDao_Impl;
        }

        @Override // androidx.room.paging.LimitOffsetPagingSource
        protected Object convertRows(final RoomRawQuery roomRawQuery, int i, Continuation<? super List<? extends ProfitAndLossTradeItem>> continuation) {
            RoomDatabase roomDatabase = this.this$0.__db;
            final ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl = this.this$0;
            return DBUtil.performSuspending(roomDatabase, true, false, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$getTradeItemsPagingSourceWithSymbolAndAssetClasses$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfitAndLossTradeItemDao_Impl.C257151.convertRows$lambda$0(roomRawQuery, profitAndLossTradeItemDao_Impl, (SQLiteConnection) obj);
                }
            }, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List convertRows$lambda$0(RoomRawQuery roomRawQuery, ProfitAndLossTradeItemDao_Impl profitAndLossTradeItemDao_Impl, SQLiteConnection _connection) {
            int i;
            String text;
            Intrinsics.checkNotNullParameter(_connection, "_connection");
            SQLiteStatement sQLiteStatementPrepare = _connection.prepare(roomRawQuery.getSql());
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            try {
                int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetClass");
                int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closeTimestamp");
                int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayName");
                int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "realizedReturn");
                int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "realizedReturnPercentage");
                int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstExecutionTimeStamp");
                int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
                int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingAmount");
                int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingAmount");
                int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openAveragePrice");
                int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closeAveragePrice");
                int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detailDisplayName");
                int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderDetails");
                int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestSymbol");
                int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextCursor");
                ArrayList arrayList = new ArrayList();
                while (sQLiteStatementPrepare.step()) {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                        i = columnIndexOrThrow;
                        text = null;
                    } else {
                        i = columnIndexOrThrow;
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    }
                    ArrayList arrayList2 = arrayList;
                    UUID uuidStringToUuid = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToUuid(text);
                    if (uuidStringToUuid == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                    }
                    AssetClass assetClassFromServerValue = AssetClass.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                    if (assetClassFromServerValue == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.models.portfolio.api.AssetClass', but it was NULL.");
                    }
                    String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    Instant instantStringToInstant = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                    if (instantStringToInstant == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                    }
                    String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                    int i2 = columnIndexOrThrow2;
                    Money moneyStringToMoney = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                    BigDecimal bigDecimalStringToBigDecimal = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                    if (bigDecimalStringToBigDecimal != null) {
                        int i3 = columnIndexOrThrow3;
                        Instant instantStringToInstant2 = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        if (instantStringToInstant2 != null) {
                            BigDecimal bigDecimalStringToBigDecimal2 = profitAndLossTradeItemDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                            if (bigDecimalStringToBigDecimal2 != null) {
                                Money moneyStringToMoney2 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                                Money moneyStringToMoney3 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                if (moneyStringToMoney3 != null) {
                                    Money moneyStringToMoney4 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                                    Money moneyStringToMoney5 = profitAndLossTradeItemDao_Impl.__moneyTypeConverter().stringToMoney(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                    if (moneyStringToMoney5 == null) {
                                        throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                                    }
                                    int i4 = columnIndexOrThrow15;
                                    int i5 = columnIndexOrThrow16;
                                    int i6 = columnIndexOrThrow17;
                                    columnIndexOrThrow15 = i4;
                                    arrayList2.add(new ProfitAndLossTradeItem(uuidStringToUuid, assetClassFromServerValue, text2, instantStringToInstant, text3, moneyStringToMoney, bigDecimalStringToBigDecimal, instantStringToInstant2, bigDecimalStringToBigDecimal2, moneyStringToMoney2, moneyStringToMoney3, moneyStringToMoney4, moneyStringToMoney5, sQLiteStatementPrepare.getText(columnIndexOrThrow14), profitAndLossTradeItemDao_Impl.__profitAndLossHubRoomConverters().stringToProfitAndLossOrderDetails(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4)), sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6)));
                                    arrayList = arrayList2;
                                    columnIndexOrThrow16 = i5;
                                    columnIndexOrThrow17 = i6;
                                    columnIndexOrThrow = i;
                                    columnIndexOrThrow2 = i2;
                                    columnIndexOrThrow3 = i3;
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.util.Money', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                    }
                }
                ArrayList arrayList3 = arrayList;
                sQLiteStatementPrepare.close();
                return arrayList3;
            } catch (Throwable th) {
                sQLiteStatementPrepare.close();
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao
    public Object clearAll(Continuation<? super Unit> continuation) {
        final String str = "DELETE FROM ProfitAndLossTradeItem";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossTradeItemDao_Impl.clearAll$lambda$6(str, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearAll$lambda$6(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MoneyTypeConverter __moneyTypeConverter() {
        return this.__moneyTypeConverter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfitAndLossHubRoomConverters __profitAndLossHubRoomConverters() {
        return this.__profitAndLossHubRoomConverters.getValue();
    }

    /* compiled from: ProfitAndLossTradeItemDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(CommonRoomConverters.class), Reflection.getOrCreateKotlinClass(MoneyTypeConverter.class), Reflection.getOrCreateKotlinClass(ProfitAndLossHubRoomConverters.class)});
        }
    }
}
