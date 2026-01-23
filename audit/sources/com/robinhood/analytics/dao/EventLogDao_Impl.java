package com.robinhood.analytics.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.ConnectionUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.analytics.converter.LoggingEventConverter;
import com.robinhood.analytics.models.EventLog;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
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

/* compiled from: EventLogDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\f\u0010\u0015J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001e\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0013H\u0096@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/analytics/dao/EventLogDao_Impl;", "Lcom/robinhood/analytics/dao/EventLogDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/robinhood/utils/room/CommonRoomConverters;", "__commonRoomConverters", "()Lcom/robinhood/utils/room/CommonRoomConverters;", "Lcom/robinhood/analytics/models/EventLog;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "insert", "(Lcom/robinhood/analytics/models/EventLog;)V", "", "items", "(Ljava/lang/Iterable;)V", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "event", "j$/time/Instant", "timestamp", "(Lcom/robinhood/rosetta/eventlogging/LoggingEvent;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "", "get", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/util/UUID;", "ids", AnalyticsStrings.BUTTON_LIST_DELETE, "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "before", "deleteOldItems", "(Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/room/RoomDatabase;", "Landroidx/room/EntityInsertAdapter;", "__insertAdapterOfEventLog", "Landroidx/room/EntityInsertAdapter;", "Lkotlin/Lazy;", "Lkotlin/Lazy;", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventLogDao_Impl extends EventLogDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<EventLog> __insertAdapterOfEventLog;

    @Override // com.robinhood.analytics.dao.EventLogDao, com.robinhood.analytics.dao.SharedEventLogDao
    public /* bridge */ /* synthetic */ Object insert(LoggingEvent loggingEvent, Instant instant, Continuation continuation) {
        return insert(loggingEvent, instant, (Continuation<? super Unit>) continuation);
    }

    public EventLogDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventLogDao_Impl.__commonRoomConverters$lambda$0(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfEventLog = new EntityInsertAdapter<EventLog>() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `EventLog` (`id`,`loggingEvent`,`timestamp`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, EventLog entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = EventLogDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                byte[] bArrLoggingEventToByteArray = LoggingEventConverter.loggingEventToByteArray(entity.getLoggingEvent());
                if (bArrLoggingEventToByteArray == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindBlob(2, bArrLoggingEventToByteArray);
                }
                String strInstantToString = EventLogDao_Impl.this.__commonRoomConverters().instantToString(entity.getTimestamp());
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

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final EventLog item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventLogDao_Impl.insert$lambda$1(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(EventLogDao_Impl eventLogDao_Impl, EventLog eventLog, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        eventLogDao_Impl.__insertAdapterOfEventLog.insert(_connection, (SQLiteConnection) eventLog);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos2
    public void insert(final Iterable<EventLog> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventLogDao_Impl.insert$lambda$2(this.f$0, items, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$2(EventLogDao_Impl eventLogDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        eventLogDao_Impl.__insertAdapterOfEventLog.insert(_connection, (Iterable<? extends EventLog>) iterable);
        return Unit.INSTANCE;
    }

    /* compiled from: EventLogDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.dao.EventLogDao_Impl$insert$4", m3645f = "EventLogDao_Impl.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.dao.EventLogDao_Impl$insert$4 */
    /* loaded from: classes24.dex */
    static final class C73174 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ LoggingEvent $event;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73174(LoggingEvent loggingEvent, Instant instant, Continuation<? super C73174> continuation) {
            super(1, continuation);
            this.$event = loggingEvent;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return EventLogDao_Impl.this.new C73174(this.$event, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73174) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventLogDao_Impl eventLogDao_Impl = EventLogDao_Impl.this;
                LoggingEvent loggingEvent = this.$event;
                Instant instant = this.$timestamp;
                this.label = 1;
                if (EventLogDao_Impl.super.insert2(loggingEvent, instant, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.analytics.dao.EventLogDao
    public Object insert(LoggingEvent loggingEvent, Instant instant, Continuation<? super Unit> continuation) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.__db, new C73174(loggingEvent, instant, null), continuation);
        return objPerformInTransactionSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformInTransactionSuspending : Unit.INSTANCE;
    }

    @Override // com.robinhood.analytics.dao.EventLogDao, com.robinhood.analytics.dao.SharedEventLogDao
    public Object get(final int i, Continuation<? super List<? extends EventLog>> continuation) {
        final String str = "SELECT * FROM EventLog LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventLogDao_Impl.get$lambda$3(str, i, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List get$lambda$3(String str, int i, EventLogDao_Impl eventLogDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loggingEvent");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                UUID uuidStringToUuid = eventLogDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                LoggingEvent loggingEventByteArrayToLoggingEvent = LoggingEventConverter.byteArrayToLoggingEvent(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                if (loggingEventByteArrayToLoggingEvent == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.rosetta.eventlogging.LoggingEvent', but it was NULL.");
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                Instant instantStringToInstant = eventLogDao_Impl.__commonRoomConverters().stringToInstant(text);
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                arrayList.add(new EventLog(uuidStringToUuid, loggingEventByteArrayToLoggingEvent, instantStringToInstant));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.analytics.dao.EventLogDao, com.robinhood.analytics.dao.SharedEventLogDao
    public Object delete(final Set<UUID> set, Continuation<? super Integer> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM EventLog WHERE id IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(")");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(EventLogDao_Impl.delete$lambda$4(string2, set, this, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int delete$lambda$4(String str, Set set, EventLogDao_Impl eventLogDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i = 1;
            while (it.hasNext()) {
                String strUuidToString = eventLogDao_Impl.__commonRoomConverters().uuidToString((UUID) it.next());
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

    @Override // com.robinhood.analytics.dao.EventLogDao, com.robinhood.analytics.dao.SharedEventLogDao
    public Object deleteOldItems(final Instant instant, Continuation<? super Integer> continuation) {
        final String str = "DELETE FROM EventLog WHERE timestamp < ?";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(EventLogDao_Impl.deleteOldItems$lambda$5(str, this, instant, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteOldItems$lambda$5(String str, EventLogDao_Impl eventLogDao_Impl, Instant instant, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strInstantToString = eventLogDao_Impl.__commonRoomConverters().instantToString(instant);
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

    @Override // com.robinhood.analytics.dao.EventLogDao, com.robinhood.analytics.dao.SharedEventLogDao
    public Object deleteAll(Continuation<? super Integer> continuation) {
        final String str = "DELETE FROM EventLog";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.analytics.dao.EventLogDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(EventLogDao_Impl.deleteAll$lambda$6(str, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteAll$lambda$6(String str, SQLiteConnection _connection) {
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

    /* compiled from: EventLogDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/analytics/dao/EventLogDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
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
