package com.robinhood.analytics;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LogOnceEventLogger.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015J\u0006\u0010\u0016\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/analytics/LogOnceEventLogger;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "lock", "sentAppearEvents", "", "", "logAppear", "", "id", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "reset", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class LogOnceEventLogger {
    private final EventLogger eventLogger;
    private final Object lock;
    private final Set<String> sentAppearEvents;

    public LogOnceEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
        this.lock = new Object();
        this.sentAppearEvents = new LinkedHashSet();
    }

    public static /* synthetic */ void logAppear$default(LogOnceEventLogger logOnceEventLogger, String str, UserInteractionEventData.Action action, Screen screen, Component component, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        logOnceEventLogger.logAppear(str, action, (i & 4) != 0 ? null : screen, (i & 8) != 0 ? null : component, (i & 16) != 0 ? null : context);
    }

    public final void logAppear(String id, UserInteractionEventData.Action action, Screen screen, Component component, Context context) {
        boolean zAdd;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (this.lock) {
            zAdd = this.sentAppearEvents.add(id);
        }
        if (zAdd) {
            EventLogger.DefaultImpls.logAppear$default(this.eventLogger, action, screen, component, null, context, 8, null);
        }
    }

    public final void reset() {
        synchronized (this.lock) {
            this.sentAppearEvents.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
