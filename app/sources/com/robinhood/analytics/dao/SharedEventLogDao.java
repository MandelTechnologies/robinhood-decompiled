package com.robinhood.analytics.dao;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.room.dao.BaseDaos;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p479j$.time.Instant;

/* compiled from: SharedEventLogDao.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nH¦@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/analytics/dao/SharedEventLogDao;", "LoggingEvent", "EventLog", "Lcom/robinhood/utils/room/dao/InsertDao;", "event", "j$/time/Instant", "timestamp", "", "insert", "(Ljava/lang/Object;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "", "get", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/util/UUID;", "ids", AnalyticsStrings.BUTTON_LIST_DELETE, "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "before", "deleteOldItems", "(Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface SharedEventLogDao<LoggingEvent, EventLog> extends BaseDaos<EventLog> {
    Object delete(Set<UUID> set, Continuation<? super Integer> continuation);

    Object deleteAll(Continuation<? super Integer> continuation);

    Object deleteOldItems(Instant instant, Continuation<? super Integer> continuation);

    Object get(int i, Continuation<? super List<? extends EventLog>> continuation);

    Object insert(LoggingEvent loggingevent, Instant instant, Continuation<? super Unit> continuation);
}
