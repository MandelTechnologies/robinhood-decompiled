package com.robinhood.analytics.performance.startup;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.analytics.performance.ColdStartDetector;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: StartupPerformanceLogger_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/ColdStartDetector;", "coldStartDetector", "Lcom/robinhood/android/util/LockscreenManager;", "lockscreenManager", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "Ljavax/inject/Provider;", "Companion", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class StartupPerformanceLogger_Factory implements Factory<StartupPerformanceLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<ColdStartDetector> coldStartDetector;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<LockscreenManager> lockscreenManager;
    private final Provider<PerformanceLogger> performanceLogger;

    @JvmStatic
    public static final StartupPerformanceLogger_Factory create(Provider<PerformanceLogger> provider, Provider<Clock> provider2, Provider<ColdStartDetector> provider3, Provider<LockscreenManager> provider4, Provider<SharedEventLogger> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final StartupPerformanceLogger newInstance(PerformanceLogger performanceLogger, Clock clock, ColdStartDetector coldStartDetector, LockscreenManager lockscreenManager, SharedEventLogger sharedEventLogger) {
        return INSTANCE.newInstance(performanceLogger, clock, coldStartDetector, lockscreenManager, sharedEventLogger);
    }

    public StartupPerformanceLogger_Factory(Provider<PerformanceLogger> performanceLogger, Provider<Clock> clock, Provider<ColdStartDetector> coldStartDetector, Provider<LockscreenManager> lockscreenManager, Provider<SharedEventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(coldStartDetector, "coldStartDetector");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.performanceLogger = performanceLogger;
        this.clock = clock;
        this.coldStartDetector = coldStartDetector;
        this.lockscreenManager = lockscreenManager;
        this.eventLogger = eventLogger;
    }

    @Override // javax.inject.Provider
    public StartupPerformanceLogger get() {
        Companion companion = INSTANCE;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        ColdStartDetector coldStartDetector = this.coldStartDetector.get();
        Intrinsics.checkNotNullExpressionValue(coldStartDetector, "get(...)");
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        return companion.newInstance(performanceLogger, clock, coldStartDetector, lockscreenManager, sharedEventLogger);
    }

    /* compiled from: StartupPerformanceLogger_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/ColdStartDetector;", "coldStartDetector", "Lcom/robinhood/android/util/LockscreenManager;", "lockscreenManager", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger_Factory;", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "newInstance", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;Lj$/time/Clock;Lcom/robinhood/analytics/performance/ColdStartDetector;Lcom/robinhood/android/util/LockscreenManager;Lcom/robinhood/analytics/SharedEventLogger;)Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StartupPerformanceLogger_Factory create(Provider<PerformanceLogger> performanceLogger, Provider<Clock> clock, Provider<ColdStartDetector> coldStartDetector, Provider<LockscreenManager> lockscreenManager, Provider<SharedEventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(coldStartDetector, "coldStartDetector");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new StartupPerformanceLogger_Factory(performanceLogger, clock, coldStartDetector, lockscreenManager, eventLogger);
        }

        @JvmStatic
        public final StartupPerformanceLogger newInstance(PerformanceLogger performanceLogger, Clock clock, ColdStartDetector coldStartDetector, LockscreenManager lockscreenManager, SharedEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(coldStartDetector, "coldStartDetector");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new StartupPerformanceLogger(performanceLogger, clock, coldStartDetector, lockscreenManager, eventLogger);
        }
    }
}
