package com.robinhood.analytics.dao;

import com.robinhood.analytics.models.EventLog;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: EventLogDao.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fH§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/analytics/dao/EventLogDao;", "Lcom/robinhood/analytics/dao/SharedEventLogDao;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/analytics/models/EventLog;", "<init>", "()V", "event", "j$/time/Instant", "timestamp", "", "insert", "(Lcom/robinhood/rosetta/eventlogging/LoggingEvent;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "", "get", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/util/UUID;", "ids", AnalyticsStrings.BUTTON_LIST_DELETE, "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "before", "deleteOldItems", "(Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class EventLogDao implements SharedEventLogDao<LoggingEvent, EventLog> {
    @Override // com.robinhood.analytics.dao.SharedEventLogDao
    public abstract Object delete(Set<UUID> set, Continuation<? super Integer> continuation);

    @Override // com.robinhood.analytics.dao.SharedEventLogDao
    public abstract Object deleteAll(Continuation<? super Integer> continuation);

    @Override // com.robinhood.analytics.dao.SharedEventLogDao
    public abstract Object deleteOldItems(Instant instant, Continuation<? super Integer> continuation);

    @Override // com.robinhood.analytics.dao.SharedEventLogDao
    public abstract Object get(int i, Continuation<? super List<? extends EventLog>> continuation);

    /* renamed from: insert, reason: avoid collision after fix types in other method */
    public Object insert2(LoggingEvent loggingEvent, Instant instant, Continuation<? super Unit> continuation) {
        return insert$suspendImpl(this, loggingEvent, instant, continuation);
    }

    @Override // com.robinhood.analytics.dao.SharedEventLogDao
    public /* bridge */ /* synthetic */ Object insert(LoggingEvent loggingEvent, Instant instant, Continuation continuation) {
        return insert2(loggingEvent, instant, (Continuation<? super Unit>) continuation);
    }

    static /* synthetic */ Object insert$suspendImpl(EventLogDao eventLogDao, LoggingEvent loggingEvent, Instant instant, Continuation<? super Unit> continuation) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        eventLogDao.insert((EventLogDao) new EventLog(uuidRandomUUID, loggingEvent, instant));
        return Unit.INSTANCE;
    }
}
