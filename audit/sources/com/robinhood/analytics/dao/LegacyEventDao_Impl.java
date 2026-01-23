package com.robinhood.analytics.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.ConnectionUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.models.LegacyEvent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.room.CommonRoomConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p479j$.time.Instant;

/* compiled from: LegacyEventDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\f\u0010\u0011J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(¨\u0006*"}, m3636d2 = {"Lcom/robinhood/analytics/dao/LegacyEventDao_Impl;", "Lcom/robinhood/analytics/dao/LegacyEventDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/robinhood/utils/room/CommonRoomConverters;", "__commonRoomConverters", "()Lcom/robinhood/utils/room/CommonRoomConverters;", "Lcom/robinhood/analytics/models/LegacyEvent;", "event", "", "insert", "(Lcom/robinhood/analytics/models/LegacyEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "j$/time/Instant", "timestamp", "(Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "minTimestamp", "Ljava/util/UUID;", "afterId", "", "get", "(ILj$/time/Instant;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ids", AnalyticsStrings.BUTTON_LIST_DELETE, "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "before", "deleteOldItems", "(Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/room/RoomDatabase;", "Landroidx/room/EntityInsertAdapter;", "__insertAdapterOfLegacyEvent", "Landroidx/room/EntityInsertAdapter;", "Lkotlin/Lazy;", "Lkotlin/Lazy;", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class LegacyEventDao_Impl extends LegacyEventDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<LegacyEvent> __insertAdapterOfLegacyEvent;

    public LegacyEventDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.LegacyEventDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LegacyEventDao_Impl.__commonRoomConverters$lambda$0(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfLegacyEvent = new EntityInsertAdapter<LegacyEvent>() { // from class: com.robinhood.analytics.dao.LegacyEventDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `LegacyEvent` (`id`,`requestJson`,`timestamp`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, LegacyEvent entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = LegacyEventDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                statement.bindText(2, entity.getRequestJson());
                String strInstantToString = LegacyEventDao_Impl.this.__commonRoomConverters().instantToString(entity.getTimestamp());
                if (strInstantToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strInstantToString);
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

    @Override // com.robinhood.analytics.dao.SharedLegacyEventDao
    public Object insert(final LegacyEvent legacyEvent, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.LegacyEventDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LegacyEventDao_Impl.insert$lambda$1(this.f$0, legacyEvent, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(LegacyEventDao_Impl legacyEventDao_Impl, LegacyEvent legacyEvent, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        legacyEventDao_Impl.__insertAdapterOfLegacyEvent.insert(_connection, (SQLiteConnection) legacyEvent);
        return Unit.INSTANCE;
    }

    /* compiled from: LegacyEventDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.LegacyEventDao_Impl$insert$4", m3645f = "LegacyEventDao_Impl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.LegacyEventDao_Impl$insert$4 */
    static final class C73194 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $event;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73194(String str, Instant instant, Continuation<? super C73194> continuation) {
            super(1, continuation);
            this.$event = str;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LegacyEventDao_Impl.this.new C73194(this.$event, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73194) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LegacyEventDao_Impl legacyEventDao_Impl = LegacyEventDao_Impl.this;
                String str = this.$event;
                Instant instant = this.$timestamp;
                this.label = 1;
                if (LegacyEventDao_Impl.super.insert(str, instant, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.analytics.dao.SharedLegacyEventDao
    public Object insert(String str, Instant instant, Continuation<? super Unit> continuation) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.__db, new C73194(str, instant, null), continuation);
        return objPerformInTransactionSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformInTransactionSuspending : Unit.INSTANCE;
    }

    @Override // com.robinhood.analytics.dao.SharedLegacyEventDao
    public Object get(final int i, final Instant instant, final UUID uuid, Continuation<? super List<LegacyEvent>> continuation) {
        final String str = "\n        SELECT * FROM LegacyEvent\n        WHERE timestamp > ?\n        AND id != ?\n        ORDER BY timestamp ASC, id ASC\n        LIMIT ?\n        ";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.LegacyEventDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LegacyEventDao_Impl.get$lambda$2(str, this, instant, uuid, i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List get$lambda$2(String str, LegacyEventDao_Impl legacyEventDao_Impl, Instant instant, UUID uuid, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strInstantToString = legacyEventDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strInstantToString);
            }
            String strUuidToString = legacyEventDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strUuidToString);
            }
            sQLiteStatementPrepare.bindLong(3, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestJson");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                UUID uuidStringToUuid = legacyEventDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                Instant instantStringToInstant = legacyEventDao_Impl.__commonRoomConverters().stringToInstant(text);
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                arrayList.add(new LegacyEvent(uuidStringToUuid, text2, instantStringToInstant));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.SharedLegacyEventDao
    public Object delete(final Set<UUID> set, Continuation<? super Integer> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM LegacyEvent WHERE id IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(")");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.LegacyEventDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(LegacyEventDao_Impl.delete$lambda$3(string2, set, this, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int delete$lambda$3(String str, Set set, LegacyEventDao_Impl legacyEventDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i = 1;
            while (it.hasNext()) {
                String strUuidToString = legacyEventDao_Impl.__commonRoomConverters().uuidToString((UUID) it.next());
                if (strUuidToString == null) {
                    sQLiteStatementPrepare.bindNull(i);
                } else {
                    sQLiteStatementPrepare.bindText(i, strUuidToString);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.SharedLegacyEventDao
    public Object deleteOldItems(final Instant instant, Continuation<? super Integer> continuation) {
        final String str = "DELETE FROM LegacyEvent WHERE timestamp < ?";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.LegacyEventDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(LegacyEventDao_Impl.deleteOldItems$lambda$4(str, this, instant, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteOldItems$lambda$4(String str, LegacyEventDao_Impl legacyEventDao_Impl, Instant instant, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strInstantToString = legacyEventDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strInstantToString);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = ConnectionUtil.getTotalChangedRows(_connection);
            sQLiteStatementPrepare.close();
            return totalChangedRows;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.SharedLegacyEventDao
    public Object deleteAll(Continuation<? super Integer> continuation) {
        final String str = "DELETE FROM LegacyEvent";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.LegacyEventDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(LegacyEventDao_Impl.deleteAll$lambda$5(str, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteAll$lambda$5(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            return ConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* compiled from: LegacyEventDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/analytics/dao/LegacyEventDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
