package com.robinhood.android.indexes.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.indexes.models.p159db.IndexFundamentals;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.LocalDate;

/* compiled from: IndexFundamentalsDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0016J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0016J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao_Impl;", "Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfIndexFundamentals", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/indexes/models/db/IndexFundamentals;", "__commonRoomConverters", "Lkotlin/Lazy;", "Lcom/robinhood/utils/room/CommonRoomConverters;", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "items", "", "getIndexFundamentalsById", "Lkotlinx/coroutines/flow/Flow;", "id", "Ljava/util/UUID;", "getIndexFundamentalsByIds", "", "ids", "getIndexFundamentalsBySymbols", "symbols", "", "Companion", "lib-models-indexes-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexFundamentalsDao_Impl implements IndexFundamentalsDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<IndexFundamentals> __insertAdapterOfIndexFundamentals;

    public IndexFundamentalsDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.indexes.dao.IndexFundamentalsDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndexFundamentalsDao_Impl.__commonRoomConverters$lambda$0(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfIndexFundamentals = new EntityInsertAdapter<IndexFundamentals>() { // from class: com.robinhood.android.indexes.dao.IndexFundamentalsDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `IndexFundamentals` (`id`,`symbol`,`high52Weeks`,`low52Weeks`,`marketCap`,`peRatio`,`high`,`low`,`open`,`previousClose`,`previousCloseDate`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, IndexFundamentals entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = IndexFundamentalsDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                statement.bindText(2, entity.getSymbol());
                String strBigDecimalToString = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getHigh52Weeks());
                if (strBigDecimalToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strBigDecimalToString);
                }
                String strBigDecimalToString2 = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getLow52Weeks());
                if (strBigDecimalToString2 == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strBigDecimalToString2);
                }
                String strBigDecimalToString3 = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getMarketCap());
                if (strBigDecimalToString3 == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strBigDecimalToString3);
                }
                String strBigDecimalToString4 = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getPeRatio());
                if (strBigDecimalToString4 == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, strBigDecimalToString4);
                }
                String strBigDecimalToString5 = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getHigh());
                if (strBigDecimalToString5 == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindText(7, strBigDecimalToString5);
                }
                String strBigDecimalToString6 = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getLow());
                if (strBigDecimalToString6 == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindText(8, strBigDecimalToString6);
                }
                String strBigDecimalToString7 = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getOpen());
                if (strBigDecimalToString7 == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindText(9, strBigDecimalToString7);
                }
                String strBigDecimalToString8 = IndexFundamentalsDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getPreviousClose());
                if (strBigDecimalToString8 == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindText(10, strBigDecimalToString8);
                }
                String strLocalDateToString = IndexFundamentalsDao_Impl.this.__commonRoomConverters().localDateToString(entity.getPreviousCloseDate());
                if (strLocalDateToString == null) {
                    statement.bindNull(11);
                } else {
                    statement.bindText(11, strLocalDateToString);
                }
                String strInstantToString = IndexFundamentalsDao_Impl.this.__commonRoomConverters().instantToString(entity.getUpdatedAt());
                if (strInstantToString == null) {
                    statement.bindNull(12);
                } else {
                    statement.bindText(12, strInstantToString);
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

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final IndexFundamentals item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.indexes.dao.IndexFundamentalsDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexFundamentalsDao_Impl.insert$lambda$1(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(IndexFundamentalsDao_Impl indexFundamentalsDao_Impl, IndexFundamentals indexFundamentals, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        indexFundamentalsDao_Impl.__insertAdapterOfIndexFundamentals.insert(_connection, (SQLiteConnection) indexFundamentals);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos2
    public void insert(final Iterable<IndexFundamentals> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.indexes.dao.IndexFundamentalsDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexFundamentalsDao_Impl.insert$lambda$2(this.f$0, items, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$2(IndexFundamentalsDao_Impl indexFundamentalsDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        indexFundamentalsDao_Impl.__insertAdapterOfIndexFundamentals.insert(_connection, (Iterable<? extends IndexFundamentals>) iterable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.indexes.dao.IndexFundamentalsDao
    public Flow<IndexFundamentals> getIndexFundamentalsById(final UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "\n        SELECT * FROM IndexFundamentals\n        WHERE id = ?\n        LIMIT 1\n        ";
        return FlowBuilder.createFlow(this.__db, true, new String[]{"IndexFundamentals"}, new Function1() { // from class: com.robinhood.android.indexes.dao.IndexFundamentalsDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexFundamentalsDao_Impl.getIndexFundamentalsById$lambda$3(str, this, id, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndexFundamentals getIndexFundamentalsById$lambda$3(String str, IndexFundamentalsDao_Impl indexFundamentalsDao_Impl, UUID uuid, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = indexFundamentalsDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "high52Weeks");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "low52Weeks");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "marketCap");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "peRatio");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "high");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "low");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "open");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousClose");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousCloseDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            IndexFundamentals indexFundamentals = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = indexFundamentalsDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                BigDecimal bigDecimalStringToBigDecimal = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                BigDecimal bigDecimalStringToBigDecimal2 = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                BigDecimal bigDecimalStringToBigDecimal3 = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                BigDecimal bigDecimalStringToBigDecimal4 = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                BigDecimal bigDecimalStringToBigDecimal5 = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                BigDecimal bigDecimalStringToBigDecimal6 = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                BigDecimal bigDecimalStringToBigDecimal7 = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                BigDecimal bigDecimalStringToBigDecimal8 = indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                LocalDate localDateStringToLocalDate = indexFundamentalsDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                }
                indexFundamentals = new IndexFundamentals(uuidStringToUuid, text2, bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal2, bigDecimalStringToBigDecimal3, bigDecimalStringToBigDecimal4, bigDecimalStringToBigDecimal5, bigDecimalStringToBigDecimal6, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, localDateStringToLocalDate, indexFundamentalsDao_Impl.__commonRoomConverters().stringToInstant(text));
            }
            sQLiteStatementPrepare.close();
            return indexFundamentals;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.indexes.dao.IndexFundamentalsDao
    public Flow<List<IndexFundamentals>> getIndexFundamentalsByIds(final List<UUID> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT * FROM IndexFundamentals");
        sb.append("\n");
        sb.append("        WHERE id IN (");
        StringUtil.appendPlaceholders(sb, ids.size());
        sb.append(")");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"IndexFundamentals"}, new Function1() { // from class: com.robinhood.android.indexes.dao.IndexFundamentalsDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexFundamentalsDao_Impl.getIndexFundamentalsByIds$lambda$4(string2, ids, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getIndexFundamentalsByIds$lambda$4(String str, List list, IndexFundamentalsDao_Impl indexFundamentalsDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                String strUuidToString = indexFundamentalsDao_Impl.__commonRoomConverters().uuidToString((UUID) it.next());
                if (strUuidToString == null) {
                    sQLiteStatementPrepare.bindNull(i);
                } else {
                    sQLiteStatementPrepare.bindText(i, strUuidToString);
                }
                i++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "high52Weeks");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "low52Weeks");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "marketCap");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "peRatio");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "high");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "low");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "open");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousClose");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousCloseDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = indexFundamentalsDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                arrayList.add(new IndexFundamentals(uuidStringToUuid, sQLiteStatementPrepare.getText(columnIndexOrThrow2), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12))));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.indexes.dao.IndexFundamentalsDao
    public Flow<List<IndexFundamentals>> getIndexFundamentalsBySymbols(final List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT * FROM IndexFundamentals");
        sb.append("\n");
        sb.append("        WHERE symbol IN (");
        StringUtil.appendPlaceholders(sb, symbols.size());
        sb.append(")");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"IndexFundamentals"}, new Function1() { // from class: com.robinhood.android.indexes.dao.IndexFundamentalsDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexFundamentalsDao_Impl.getIndexFundamentalsBySymbols$lambda$5(string2, symbols, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getIndexFundamentalsBySymbols$lambda$5(String str, List list, IndexFundamentalsDao_Impl indexFundamentalsDao_Impl, SQLiteConnection _connection) {
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
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "high52Weeks");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "low52Weeks");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "marketCap");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "peRatio");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "high");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "low");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "open");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousClose");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousCloseDate");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = indexFundamentalsDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                arrayList.add(new IndexFundamentals(uuidStringToUuid, sQLiteStatementPrepare.getText(columnIndexOrThrow2), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)), indexFundamentalsDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12))));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* compiled from: IndexFundamentalsDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-indexes-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
