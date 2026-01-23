package com.robinhood.analytics.dao;

import kotlin.Metadata;

/* compiled from: SharedEventLogDatabase.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "LoggingEvent", "EventLog", "", "eventLogDao", "Lcom/robinhood/analytics/dao/SharedEventLogDao;", "legacyEventDao", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface SharedEventLogDatabase<LoggingEvent, EventLog> {
    SharedEventLogDao<LoggingEvent, EventLog> eventLogDao();

    SharedLegacyEventDao legacyEventDao();
}
