package com.robinhood.android.analytics;

import com.robinhood.analytics.EventLogManager;
import com.robinhood.analytics.ExternalReleaseEventLogManager;
import com.robinhood.analytics.models.EventLog;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
import com.robinhood.rosetta.eventlogging.LoggingEventBatch;
import kotlin.Metadata;

/* compiled from: ExternalReleaseEventLogManagerModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/analytics/ExternalReleaseEventLogManagerModule;", "", "provideEventLogManager", "Lcom/robinhood/analytics/EventLogManager;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/analytics/models/EventLog;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;", "externalReleaseEventLogManager", "Lcom/robinhood/analytics/ExternalReleaseEventLogManager;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ExternalReleaseEventLogManagerModule {
    EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> provideEventLogManager(ExternalReleaseEventLogManager externalReleaseEventLogManager);
}
