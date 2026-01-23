package com.robinhood.android.common.modelsfxdb.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.utils.room.CommonRoomConverters;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: McwFxRatesDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/modelsfxdb/dao/McwFxRatesDao_Impl;", "Lcom/robinhood/android/common/modelsfxdb/dao/McwFxRatesDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMcwFxRate", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/models/fx/db/McwFxRate;", "__commonRoomConverters", "Lkotlin/Lazy;", "Lcom/robinhood/utils/room/CommonRoomConverters;", "insert", "", "items", "", "getMcwFxRate", "symbol", "", "streamMcwFxRates", "Lkotlinx/coroutines/flow/Flow;", "", "symbols", "streamMcwFxRate", "Companion", "lib-models-fx-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class McwFxRatesDao_Impl implements McwFxRatesDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<McwFxRate> __insertAdapterOfMcwFxRate;

    public McwFxRatesDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return McwFxRatesDao_Impl.__commonRoomConverters$lambda$0(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfMcwFxRate = new EntityInsertAdapter<McwFxRate>() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `McwFxRate` (`id`,`symbol`,`bidPrice`,`askPrice`,`markPrice`,`basisPoint`,`lastUpdated`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, McwFxRate entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getId());
                statement.bindText(2, entity.getSymbol());
                String strBigDecimalToString = McwFxRatesDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getBidPrice());
                if (strBigDecimalToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strBigDecimalToString);
                }
                String strBigDecimalToString2 = McwFxRatesDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getAskPrice());
                if (strBigDecimalToString2 == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strBigDecimalToString2);
                }
                String strBigDecimalToString3 = McwFxRatesDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getMarkPrice());
                if (strBigDecimalToString3 == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strBigDecimalToString3);
                }
                String strBigDecimalToString4 = McwFxRatesDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getBasisPoint());
                if (strBigDecimalToString4 == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, strBigDecimalToString4);
                }
                String strInstantToString = McwFxRatesDao_Impl.this.__commonRoomConverters().instantToString(entity.getLastUpdated());
                if (strInstantToString == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindText(7, strInstantToString);
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

    @Override // com.robinhood.utils.room.dao.BaseDaos2
    public void insert(final Iterable<? extends McwFxRate> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwFxRatesDao_Impl.insert$lambda$1(this.f$0, items, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(McwFxRatesDao_Impl mcwFxRatesDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        mcwFxRatesDao_Impl.__insertAdapterOfMcwFxRate.insert(_connection, (Iterable<? extends McwFxRate>) iterable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao
    public McwFxRate getMcwFxRate(final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        final String str = "SELECT * FROM McwFxRate WHERE symbol = ? LIMIT 1";
        return (McwFxRate) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwFxRatesDao_Impl.getMcwFxRate$lambda$2(str, symbol, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final McwFxRate getMcwFxRate$lambda$2(String str, String str2, McwFxRatesDao_Impl mcwFxRatesDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bidPrice");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "askPrice");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "markPrice");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "basisPoint");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastUpdated");
            McwFxRate mcwFxRate = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                BigDecimal bigDecimalStringToBigDecimal = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal2 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal3 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal4 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (bigDecimalStringToBigDecimal4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                }
                Instant instantStringToInstant = mcwFxRatesDao_Impl.__commonRoomConverters().stringToInstant(text);
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                mcwFxRate = new McwFxRate(text2, text3, bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal2, bigDecimalStringToBigDecimal3, bigDecimalStringToBigDecimal4, instantStringToInstant);
            }
            sQLiteStatementPrepare.close();
            return mcwFxRate;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao
    public Flow<List<McwFxRate>> streamMcwFxRates(final List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM McwFxRate WHERE symbol IN (");
        StringUtil.appendPlaceholders(sb, symbols.size());
        sb.append(")");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, false, new String[]{"McwFxRate"}, new Function1() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwFxRatesDao_Impl.streamMcwFxRates$lambda$3(string2, symbols, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List streamMcwFxRates$lambda$3(String str, List list, McwFxRatesDao_Impl mcwFxRatesDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.bindText(i, (String) it.next());
                i++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bidPrice");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "askPrice");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "markPrice");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "basisPoint");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastUpdated");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                BigDecimal bigDecimalStringToBigDecimal = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal2 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal3 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i2 = columnIndexOrThrow;
                BigDecimal bigDecimalStringToBigDecimal4 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (bigDecimalStringToBigDecimal4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                Instant instantStringToInstant = mcwFxRatesDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                arrayList.add(new McwFxRate(text, text2, bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal2, bigDecimalStringToBigDecimal3, bigDecimalStringToBigDecimal4, instantStringToInstant));
                columnIndexOrThrow = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao
    public Flow<McwFxRate> streamMcwFxRate(final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        final String str = "SELECT * FROM McwFxRate WHERE symbol = ? LIMIT 1";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"McwFxRate"}, new Function1() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwFxRatesDao_Impl.streamMcwFxRate$lambda$4(str, symbol, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final McwFxRate streamMcwFxRate$lambda$4(String str, String str2, McwFxRatesDao_Impl mcwFxRatesDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bidPrice");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "askPrice");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "markPrice");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "basisPoint");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastUpdated");
            McwFxRate mcwFxRate = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                BigDecimal bigDecimalStringToBigDecimal = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal2 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal3 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal4 = mcwFxRatesDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (bigDecimalStringToBigDecimal4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                }
                Instant instantStringToInstant = mcwFxRatesDao_Impl.__commonRoomConverters().stringToInstant(text);
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                mcwFxRate = new McwFxRate(text2, text3, bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal2, bigDecimalStringToBigDecimal3, bigDecimalStringToBigDecimal4, instantStringToInstant);
            }
            sQLiteStatementPrepare.close();
            return mcwFxRate;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* compiled from: McwFxRatesDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/modelsfxdb/dao/McwFxRatesDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-fx-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(CommonRoomConverters.class));
        }
    }
}
