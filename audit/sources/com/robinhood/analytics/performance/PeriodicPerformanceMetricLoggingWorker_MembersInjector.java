package com.robinhood.analytics.performance;

import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.dao.PerformanceMetricDatabase;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PeriodicPerformanceMetricLoggingWorker_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/analytics/performance/PeriodicPerformanceMetricLoggingWorker_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/analytics/performance/PeriodicPerformanceMetricLoggingWorker;", "database", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PeriodicPerformanceMetricLoggingWorker_MembersInjector implements MembersInjector<PeriodicPerformanceMetricLoggingWorker> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PerformanceMetricDatabase> database;
    private final Provider<EventLogger> eventLogger;

    @JvmStatic
    public static final MembersInjector<PeriodicPerformanceMetricLoggingWorker> create(Provider<PerformanceMetricDatabase> provider, Provider<EventLogger> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectDatabase(PeriodicPerformanceMetricLoggingWorker periodicPerformanceMetricLoggingWorker, PerformanceMetricDatabase performanceMetricDatabase) {
        INSTANCE.injectDatabase(periodicPerformanceMetricLoggingWorker, performanceMetricDatabase);
    }

    @JvmStatic
    public static final void injectEventLogger(PeriodicPerformanceMetricLoggingWorker periodicPerformanceMetricLoggingWorker, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(periodicPerformanceMetricLoggingWorker, eventLogger);
    }

    public PeriodicPerformanceMetricLoggingWorker_MembersInjector(Provider<PerformanceMetricDatabase> database, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.database = database;
        this.eventLogger = eventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PeriodicPerformanceMetricLoggingWorker instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        PerformanceMetricDatabase performanceMetricDatabase = this.database.get();
        Intrinsics.checkNotNullExpressionValue(performanceMetricDatabase, "get(...)");
        companion.injectDatabase(instance, performanceMetricDatabase);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
    }

    /* compiled from: PeriodicPerformanceMetricLoggingWorker_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/analytics/performance/PeriodicPerformanceMetricLoggingWorker_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/analytics/performance/PeriodicPerformanceMetricLoggingWorker;", "database", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "injectDatabase", "", "instance", "injectEventLogger", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PeriodicPerformanceMetricLoggingWorker> create(Provider<PerformanceMetricDatabase> database, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new PeriodicPerformanceMetricLoggingWorker_MembersInjector(database, eventLogger);
        }

        @JvmStatic
        public final void injectDatabase(PeriodicPerformanceMetricLoggingWorker instance, PerformanceMetricDatabase database) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(database, "database");
            instance.setDatabase(database);
        }

        @JvmStatic
        public final void injectEventLogger(PeriodicPerformanceMetricLoggingWorker instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }
    }
}
