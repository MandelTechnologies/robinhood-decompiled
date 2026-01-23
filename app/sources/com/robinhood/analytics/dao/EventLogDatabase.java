package com.robinhood.analytics.dao;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.robinhood.analytics.models.EventLog;
import com.robinhood.database.FeatureRoomDatabase;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventLogDatabase.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u0014B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/analytics/dao/EventLogDatabase;", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/analytics/models/EventLog;", "Landroidx/room/RoomDatabase;", "Lcom/robinhood/database/FeatureRoomDatabase;", "<init>", "()V", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "closeAndDelete", "", "context", "Landroid/content/Context;", "eventLogDao", "Lcom/robinhood/analytics/dao/EventLogDao;", "legacyEventDao", "Lcom/robinhood/analytics/dao/LegacyEventDao;", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class EventLogDatabase extends RoomDatabase implements SharedEventLogDatabase<LoggingEvent, EventLog>, FeatureRoomDatabase {
    public static final String ROOM_DB_NAME = "robinhood-event-log.db";
    public static final int VERSION = 10;

    @Override // com.robinhood.analytics.dao.SharedEventLogDatabase
    public abstract SharedEventLogDao<LoggingEvent, EventLog> eventLogDao();

    @Override // com.robinhood.analytics.dao.SharedEventLogDatabase
    public abstract LegacyEventDao legacyEventDao();

    @Override // com.robinhood.database.FeatureRoomDatabase
    public String getDatabaseName() {
        return ROOM_DB_NAME;
    }

    @Override // com.robinhood.database.FeatureRoomDatabase
    public void closeAndDelete(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        close();
        context.deleteDatabase(getDatabaseName());
    }
}
