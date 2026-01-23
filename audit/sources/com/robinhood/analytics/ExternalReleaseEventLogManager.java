package com.robinhood.analytics;

import com.robinhood.analytics.api.TraderAnalyticsApi;
import com.robinhood.analytics.api.TraderAnalyticsApi2;
import com.robinhood.analytics.dao.EventLogDatabase;
import com.robinhood.analytics.models.EventLog;
import com.robinhood.analytics.models.SharedEventLog;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
import com.robinhood.rosetta.eventlogging.LoggingEventBatch;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExternalReleaseEventLogManager.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/analytics/ExternalReleaseEventLogManager;", "Lcom/robinhood/analytics/EventLogManager;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/analytics/models/EventLog;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "eventLogDatabase", "Lcom/robinhood/analytics/dao/EventLogDatabase;", "analyticsApi", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/dao/EventLogDatabase;Lcom/robinhood/analytics/api/TraderAnalyticsApi;)V", "createEventBatch", "eventLogs", "", "Lcom/robinhood/analytics/models/SharedEventLog;", "getBatchSize", "", "batch", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ExternalReleaseEventLogManager extends EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalReleaseEventLogManager(@RootCoroutineScope CoroutineScope coroutineScope, EventLogDatabase eventLogDatabase, TraderAnalyticsApi analyticsApi) {
        super(coroutineScope, eventLogDatabase, TraderAnalyticsApi2.wrapped(analyticsApi));
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogDatabase, "eventLogDatabase");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
    }

    @Override // com.robinhood.analytics.EventLogManager
    /* renamed from: createEventBatch, reason: merged with bridge method [inline-methods] */
    public LoggingEventBatch createEventBatch2(List<? extends SharedEventLog<? extends LoggingEvent>> eventLogs) {
        Intrinsics.checkNotNullParameter(eventLogs, "eventLogs");
        List<? extends SharedEventLog<? extends LoggingEvent>> list = eventLogs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((LoggingEvent) ((SharedEventLog) it.next()).getLoggingEvent());
        }
        return new LoggingEventBatch(arrayList, null, 2, null);
    }

    @Override // com.robinhood.analytics.EventLogManager
    public int getBatchSize(LoggingEventBatch batch) {
        Intrinsics.checkNotNullParameter(batch, "batch");
        return LoggingEventBatch.ADAPTER.encodedSize(batch);
    }
}
