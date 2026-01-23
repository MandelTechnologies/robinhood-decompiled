package com.robinhood.android.redesign.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.redesign.model.HighlightImpression;
import com.robinhood.redesign.provisions.converters.ImpressionTypeConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: HighlightImpressionDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0096@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/redesign/dao/HighlightImpressionDao_Impl;", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfHighlightImpression", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/redesign/model/HighlightImpression;", "__insertAdapterOfHighlightImpression_1", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "items", "", "createImpression", AnalyticsStrings.NOTIF_STACK_EVENT_IMPRESSION, "(Lcom/robinhood/android/redesign/model/HighlightImpression;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImpression", "impressionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBadgeImpression", "getImpressions", "", "impressionIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateImpression", "firstSeenAt", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class HighlightImpressionDao_Impl implements HighlightImpressionDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HighlightImpression> __insertAdapterOfHighlightImpression;
    private final EntityInsertAdapter<HighlightImpression> __insertAdapterOfHighlightImpression_1;

    public HighlightImpressionDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfHighlightImpression = new EntityInsertAdapter<HighlightImpression>() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `HighlightImpression` (`id`,`impressionId`,`firstSeenAt`,`firstGeneratedAt`,`impressionType`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, HighlightImpression entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, entity.getImpressionId());
                Long firstSeenAt = entity.getFirstSeenAt();
                if (firstSeenAt == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindLong(3, firstSeenAt.longValue());
                }
                statement.bindLong(4, entity.getFirstGeneratedAt());
                statement.bindText(5, ImpressionTypeConverter.INSTANCE.fromImpressionType(entity.getImpressionType()));
            }
        };
        this.__insertAdapterOfHighlightImpression_1 = new EntityInsertAdapter<HighlightImpression>() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl.2
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `HighlightImpression` (`id`,`impressionId`,`firstSeenAt`,`firstGeneratedAt`,`impressionType`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, HighlightImpression entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, entity.getImpressionId());
                Long firstSeenAt = entity.getFirstSeenAt();
                if (firstSeenAt == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindLong(3, firstSeenAt.longValue());
                }
                statement.bindLong(4, entity.getFirstGeneratedAt());
                statement.bindText(5, ImpressionTypeConverter.INSTANCE.fromImpressionType(entity.getImpressionType()));
            }
        };
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final HighlightImpression item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HighlightImpressionDao_Impl.insert$lambda$0(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(HighlightImpressionDao_Impl highlightImpressionDao_Impl, HighlightImpression highlightImpression, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        highlightImpressionDao_Impl.__insertAdapterOfHighlightImpression.insert(_connection, (SQLiteConnection) highlightImpression);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos2
    public void insert(final Iterable<HighlightImpression> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HighlightImpressionDao_Impl.insert$lambda$1(this.f$0, items, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(HighlightImpressionDao_Impl highlightImpressionDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        highlightImpressionDao_Impl.__insertAdapterOfHighlightImpression.insert(_connection, (Iterable<? extends HighlightImpression>) iterable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.redesign.dao.HighlightImpressionDao
    public Object createImpression(final HighlightImpression highlightImpression, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HighlightImpressionDao_Impl.createImpression$lambda$2(this.f$0, highlightImpression, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createImpression$lambda$2(HighlightImpressionDao_Impl highlightImpressionDao_Impl, HighlightImpression highlightImpression, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        highlightImpressionDao_Impl.__insertAdapterOfHighlightImpression_1.insert(_connection, (SQLiteConnection) highlightImpression);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.redesign.dao.HighlightImpressionDao
    public Object getImpression(final String str, Continuation<? super HighlightImpression> continuation) {
        final String str2 = "\n            SELECT * FROM HighlightImpression\n            WHERE ? = impressionId\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HighlightImpressionDao_Impl.getImpression$lambda$3(str2, str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HighlightImpression getImpression$lambda$3(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impressionId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstSeenAt");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstGeneratedAt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impressionType");
            HighlightImpression highlightImpression = null;
            if (sQLiteStatementPrepare.step()) {
                highlightImpression = new HighlightImpression(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3)), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), ImpressionTypeConverter.INSTANCE.toImpressionType(sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
            }
            return highlightImpression;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.robinhood.android.redesign.dao.HighlightImpressionDao
    public Object getBadgeImpression(final String str, Continuation<? super HighlightImpression> continuation) {
        final String str2 = "\n            SELECT * FROM HighlightImpression\n            WHERE ? = impressionId AND impressionType = 'BADGE'\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HighlightImpressionDao_Impl.getBadgeImpression$lambda$4(str2, str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HighlightImpression getBadgeImpression$lambda$4(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impressionId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstSeenAt");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstGeneratedAt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impressionType");
            HighlightImpression highlightImpression = null;
            if (sQLiteStatementPrepare.step()) {
                highlightImpression = new HighlightImpression(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3)), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), ImpressionTypeConverter.INSTANCE.toImpressionType(sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
            }
            return highlightImpression;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.robinhood.android.redesign.dao.HighlightImpressionDao
    public Object getImpressions(final List<String> list, Continuation<? super List<HighlightImpression>> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("            SELECT *");
        sb.append("\n");
        sb.append("            FROM HighlightImpression");
        sb.append("\n");
        sb.append("            WHERE impressionId IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HighlightImpressionDao_Impl.getImpressions$lambda$5(string2, list, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getImpressions$lambda$5(String str, List list, SQLiteConnection _connection) {
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
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impressionId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstSeenAt");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstGeneratedAt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impressionType");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new HighlightImpression(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3)), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), ImpressionTypeConverter.INSTANCE.toImpressionType(sQLiteStatementPrepare.getText(columnIndexOrThrow5))));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.redesign.dao.HighlightImpressionDao
    public Object updateImpression(final String str, final long j, Continuation<? super Unit> continuation) {
        final String str2 = "\n            UPDATE HighlightImpression\n            SET firstSeenAt = ?\n            WHERE impressionId = ?\n        ";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.android.redesign.dao.HighlightImpressionDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HighlightImpressionDao_Impl.updateImpression$lambda$6(str2, j, str, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateImpression$lambda$6(String str, long j, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindLong(1, j);
            sQLiteStatementPrepare.bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* compiled from: HighlightImpressionDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/redesign/dao/HighlightImpressionDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
