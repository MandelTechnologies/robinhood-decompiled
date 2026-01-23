package com.robinhood.android.analytics.provisions;

import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.analytics.EventLogBundle;
import com.robinhood.analytics.EventLogManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.RealEventLogger;
import com.robinhood.analytics.RealSessionManager;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.analytics.models.EventLog;
import com.robinhood.analytics.net.NetworkInfoProvider;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.prefs.annotation.UsernamePref;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
import com.robinhood.rosetta.eventlogging.LoggingEventBatch;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: EventLoggerModule.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/EventLoggerModule;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "rootCoroutineScope", "Lcom/robinhood/analytics/EventLogBundle;", "eventLogBundle", "Lcom/robinhood/analytics/EventLogManager;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/analytics/models/EventLog;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;", "eventLogManager", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "networkInfoProvider", "Lcom/robinhood/analytics/RealSessionManager;", "sessionManager", "Lcom/robinhood/prefs/StringPreference;", "usernamePref", "userUuidPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/analytics/RealEventLogger;", "provideRealEventLogger", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/EventLogBundle;Lcom/robinhood/analytics/EventLogManager;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;Lcom/robinhood/analytics/net/NetworkInfoProvider;Lcom/robinhood/analytics/RealSessionManager;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lj$/time/Clock;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/utils/moshi/LazyMoshi;)Lcom/robinhood/analytics/RealEventLogger;", "realEventLogger", "Lcom/robinhood/analytics/EventLogger;", "provideEventLogger", "(Lcom/robinhood/analytics/RealEventLogger;)Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/analytics/TraderEventLogger;", "provideTraderEventLogger", "(Lcom/robinhood/analytics/RealEventLogger;)Lcom/robinhood/analytics/TraderEventLogger;", "Lcom/robinhood/analytics/CryptoEventLogger;", "provideCryptoEventLogger", "(Lcom/robinhood/analytics/RealEventLogger;)Lcom/robinhood/analytics/CryptoEventLogger;", "Lcom/robinhood/analytics/SharedEventLogger;", "provideSharedEventLogger", "(Lcom/robinhood/analytics/RealEventLogger;)Lcom/robinhood/analytics/SharedEventLogger;", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "provideDeeplinkEventLogger", "(Lcom/robinhood/analytics/RealEventLogger;)Lcom/robinhood/analytics/DeeplinkEventLogger;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventLoggerModule {
    public static final EventLoggerModule INSTANCE = new EventLoggerModule();

    public final CryptoEventLogger provideCryptoEventLogger(RealEventLogger realEventLogger) {
        Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
        return realEventLogger;
    }

    public final DeeplinkEventLogger provideDeeplinkEventLogger(RealEventLogger realEventLogger) {
        Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
        return realEventLogger;
    }

    public final EventLogger provideEventLogger(RealEventLogger realEventLogger) {
        Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
        return realEventLogger;
    }

    public final SharedEventLogger provideSharedEventLogger(RealEventLogger realEventLogger) {
        Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
        return realEventLogger;
    }

    public final TraderEventLogger provideTraderEventLogger(RealEventLogger realEventLogger) {
        Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
        return realEventLogger;
    }

    private EventLoggerModule() {
    }

    public final RealEventLogger provideRealEventLogger(@RootCoroutineScope CoroutineScope rootCoroutineScope, EventLogBundle eventLogBundle, EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, NetworkInfoProvider networkInfoProvider, RealSessionManager sessionManager, @UsernamePref StringPreference usernamePref, @UserUuidPref StringPreference userUuidPref, Clock clock, PerformanceLogger performanceLogger, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(eventLogBundle, "eventLogBundle");
        Intrinsics.checkNotNullParameter(eventLogManager, "eventLogManager");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new RealEventLogger(rootCoroutineScope, eventLogBundle, firebaseAppInstanceIdProvider, eventLogManager, networkInfoProvider, sessionManager, usernamePref, userUuidPref, clock, performanceLogger, moshi);
    }
}
