package com.robinhood.android.analytics.provisions;

import com.robinhood.analytics.EventLogBundle;
import com.robinhood.analytics.EventLogManager;
import com.robinhood.analytics.RealEventLogger;
import com.robinhood.analytics.RealSessionManager;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.analytics.models.EventLog;
import com.robinhood.analytics.net.NetworkInfoProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.LoggingEvent;
import com.robinhood.rosetta.eventlogging.LoggingEventBatch;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: EventLoggerModule_ProvideRealEventLoggerFactory.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B¸\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012#\u0010\r\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R1\u0010\r\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/EventLoggerModule_ProvideRealEventLoggerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/RealEventLogger;", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "rootCoroutineScope", "Lcom/robinhood/analytics/EventLogBundle;", "eventLogBundle", "Lcom/robinhood/analytics/EventLogManager;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/analytics/models/EventLog;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;", "Lkotlin/jvm/JvmSuppressWildcards;", "eventLogManager", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "networkInfoProvider", "Lcom/robinhood/analytics/RealSessionManager;", "sessionManager", "Lcom/robinhood/prefs/StringPreference;", "usernamePref", "userUuidPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/analytics/RealEventLogger;", "Ljavax/inject/Provider;", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventLoggerModule_ProvideRealEventLoggerFactory implements Factory<RealEventLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<EventLogBundle> eventLogBundle;
    private final Provider<EventLogManager<LoggingEvent, EventLog, LoggingEventBatch>> eventLogManager;
    private final Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider;
    private final Provider<LazyMoshi> moshi;
    private final Provider<NetworkInfoProvider> networkInfoProvider;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<RealSessionManager> sessionManager;
    private final Provider<StringPreference> userUuidPref;
    private final Provider<StringPreference> usernamePref;

    @JvmStatic
    public static final EventLoggerModule_ProvideRealEventLoggerFactory create(Provider<CoroutineScope> provider, Provider<EventLogBundle> provider2, Provider<EventLogManager<LoggingEvent, EventLog, LoggingEventBatch>> provider3, Provider<FirebaseAppInstanceIdProvider> provider4, Provider<NetworkInfoProvider> provider5, Provider<RealSessionManager> provider6, Provider<StringPreference> provider7, Provider<StringPreference> provider8, Provider<Clock> provider9, Provider<PerformanceLogger> provider10, Provider<LazyMoshi> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final RealEventLogger provideRealEventLogger(CoroutineScope coroutineScope, EventLogBundle eventLogBundle, EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, NetworkInfoProvider networkInfoProvider, RealSessionManager realSessionManager, StringPreference stringPreference, StringPreference stringPreference2, Clock clock, PerformanceLogger performanceLogger, LazyMoshi lazyMoshi) {
        return INSTANCE.provideRealEventLogger(coroutineScope, eventLogBundle, eventLogManager, firebaseAppInstanceIdProvider, networkInfoProvider, realSessionManager, stringPreference, stringPreference2, clock, performanceLogger, lazyMoshi);
    }

    public EventLoggerModule_ProvideRealEventLoggerFactory(Provider<CoroutineScope> rootCoroutineScope, Provider<EventLogBundle> eventLogBundle, Provider<EventLogManager<LoggingEvent, EventLog, LoggingEventBatch>> eventLogManager, Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider, Provider<NetworkInfoProvider> networkInfoProvider, Provider<RealSessionManager> sessionManager, Provider<StringPreference> usernamePref, Provider<StringPreference> userUuidPref, Provider<Clock> clock, Provider<PerformanceLogger> performanceLogger, Provider<LazyMoshi> moshi) {
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
        this.rootCoroutineScope = rootCoroutineScope;
        this.eventLogBundle = eventLogBundle;
        this.eventLogManager = eventLogManager;
        this.firebaseAppInstanceIdProvider = firebaseAppInstanceIdProvider;
        this.networkInfoProvider = networkInfoProvider;
        this.sessionManager = sessionManager;
        this.usernamePref = usernamePref;
        this.userUuidPref = userUuidPref;
        this.clock = clock;
        this.performanceLogger = performanceLogger;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public RealEventLogger get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        EventLogBundle eventLogBundle = this.eventLogBundle.get();
        Intrinsics.checkNotNullExpressionValue(eventLogBundle, "get(...)");
        EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager = this.eventLogManager.get();
        Intrinsics.checkNotNullExpressionValue(eventLogManager, "get(...)");
        FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider = this.firebaseAppInstanceIdProvider.get();
        Intrinsics.checkNotNullExpressionValue(firebaseAppInstanceIdProvider, "get(...)");
        NetworkInfoProvider networkInfoProvider = this.networkInfoProvider.get();
        Intrinsics.checkNotNullExpressionValue(networkInfoProvider, "get(...)");
        RealSessionManager realSessionManager = this.sessionManager.get();
        Intrinsics.checkNotNullExpressionValue(realSessionManager, "get(...)");
        StringPreference stringPreference = this.usernamePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.userUuidPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideRealEventLogger(coroutineScope, eventLogBundle, eventLogManager, firebaseAppInstanceIdProvider, networkInfoProvider, realSessionManager, stringPreference, stringPreference2, clock, performanceLogger, lazyMoshi);
    }

    /* compiled from: EventLoggerModule_ProvideRealEventLoggerFactory.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÀ\u0001\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042#\u0010\u000e\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J~\u0010\"\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/EventLoggerModule_ProvideRealEventLoggerFactory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "rootCoroutineScope", "Lcom/robinhood/analytics/EventLogBundle;", "eventLogBundle", "Lcom/robinhood/analytics/EventLogManager;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/analytics/models/EventLog;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;", "Lkotlin/jvm/JvmSuppressWildcards;", "eventLogManager", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "networkInfoProvider", "Lcom/robinhood/analytics/RealSessionManager;", "sessionManager", "Lcom/robinhood/prefs/StringPreference;", "usernamePref", "userUuidPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/analytics/provisions/EventLoggerModule_ProvideRealEventLoggerFactory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/analytics/provisions/EventLoggerModule_ProvideRealEventLoggerFactory;", "Lcom/robinhood/analytics/RealEventLogger;", "provideRealEventLogger", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/EventLogBundle;Lcom/robinhood/analytics/EventLogManager;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;Lcom/robinhood/analytics/net/NetworkInfoProvider;Lcom/robinhood/analytics/RealSessionManager;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lj$/time/Clock;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/utils/moshi/LazyMoshi;)Lcom/robinhood/analytics/RealEventLogger;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventLoggerModule_ProvideRealEventLoggerFactory create(Provider<CoroutineScope> rootCoroutineScope, Provider<EventLogBundle> eventLogBundle, Provider<EventLogManager<LoggingEvent, EventLog, LoggingEventBatch>> eventLogManager, Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider, Provider<NetworkInfoProvider> networkInfoProvider, Provider<RealSessionManager> sessionManager, Provider<StringPreference> usernamePref, Provider<StringPreference> userUuidPref, Provider<Clock> clock, Provider<PerformanceLogger> performanceLogger, Provider<LazyMoshi> moshi) {
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
            return new EventLoggerModule_ProvideRealEventLoggerFactory(rootCoroutineScope, eventLogBundle, eventLogManager, firebaseAppInstanceIdProvider, networkInfoProvider, sessionManager, usernamePref, userUuidPref, clock, performanceLogger, moshi);
        }

        @JvmStatic
        public final RealEventLogger provideRealEventLogger(CoroutineScope rootCoroutineScope, EventLogBundle eventLogBundle, EventLogManager<LoggingEvent, EventLog, LoggingEventBatch> eventLogManager, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, NetworkInfoProvider networkInfoProvider, RealSessionManager sessionManager, StringPreference usernamePref, StringPreference userUuidPref, Clock clock, PerformanceLogger performanceLogger, LazyMoshi moshi) {
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
            Object objCheckNotNull = Preconditions.checkNotNull(EventLoggerModule.INSTANCE.provideRealEventLogger(rootCoroutineScope, eventLogBundle, eventLogManager, firebaseAppInstanceIdProvider, networkInfoProvider, sessionManager, usernamePref, userUuidPref, clock, performanceLogger, moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RealEventLogger) objCheckNotNull;
        }
    }
}
