package com.robinhood.android.analytics.provisions;

import com.robinhood.analytics.RealSessionManager;
import com.robinhood.analytics.dao.PerformanceMetricDatabase;
import com.robinhood.analytics.net.NetworkInfoProvider;
import com.robinhood.analytics.performance.SharedPerformanceLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: PerformanceModule_ProvideSharedPerformanceLoggerFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/PerformanceModule_ProvideSharedPerformanceLoggerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/performance/SharedPerformanceLogger;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "database", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "networkInfoProvider", "Lcom/robinhood/analytics/RealSessionManager;", "sessionManager", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/analytics/performance/SharedPerformanceLogger;", "Ljavax/inject/Provider;", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PerformanceModule_ProvideSharedPerformanceLoggerFactory implements Factory<SharedPerformanceLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<PerformanceMetricDatabase> database;
    private final Provider<NetworkInfoProvider> networkInfoProvider;
    private final Provider<RealSessionManager> sessionManager;

    @JvmStatic
    public static final PerformanceModule_ProvideSharedPerformanceLoggerFactory create(Provider<Clock> provider, Provider<CoroutineScope> provider2, Provider<PerformanceMetricDatabase> provider3, Provider<NetworkInfoProvider> provider4, Provider<RealSessionManager> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final SharedPerformanceLogger provideSharedPerformanceLogger(Clock clock, CoroutineScope coroutineScope, PerformanceMetricDatabase performanceMetricDatabase, NetworkInfoProvider networkInfoProvider, RealSessionManager realSessionManager) {
        return INSTANCE.provideSharedPerformanceLogger(clock, coroutineScope, performanceMetricDatabase, networkInfoProvider, realSessionManager);
    }

    public PerformanceModule_ProvideSharedPerformanceLoggerFactory(Provider<Clock> clock, Provider<CoroutineScope> coroutineScope, Provider<PerformanceMetricDatabase> database, Provider<NetworkInfoProvider> networkInfoProvider, Provider<RealSessionManager> sessionManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.clock = clock;
        this.coroutineScope = coroutineScope;
        this.database = database;
        this.networkInfoProvider = networkInfoProvider;
        this.sessionManager = sessionManager;
    }

    @Override // javax.inject.Provider
    public SharedPerformanceLogger get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        PerformanceMetricDatabase performanceMetricDatabase = this.database.get();
        Intrinsics.checkNotNullExpressionValue(performanceMetricDatabase, "get(...)");
        NetworkInfoProvider networkInfoProvider = this.networkInfoProvider.get();
        Intrinsics.checkNotNullExpressionValue(networkInfoProvider, "get(...)");
        RealSessionManager realSessionManager = this.sessionManager.get();
        Intrinsics.checkNotNullExpressionValue(realSessionManager, "get(...)");
        return companion.provideSharedPerformanceLogger(clock, coroutineScope, performanceMetricDatabase, networkInfoProvider, realSessionManager);
    }

    /* compiled from: PerformanceModule_ProvideSharedPerformanceLoggerFactory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/PerformanceModule_ProvideSharedPerformanceLoggerFactory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "database", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "networkInfoProvider", "Lcom/robinhood/analytics/RealSessionManager;", "sessionManager", "Lcom/robinhood/android/analytics/provisions/PerformanceModule_ProvideSharedPerformanceLoggerFactory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/analytics/provisions/PerformanceModule_ProvideSharedPerformanceLoggerFactory;", "Lcom/robinhood/analytics/performance/SharedPerformanceLogger;", "provideSharedPerformanceLogger", "(Lj$/time/Clock;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;Lcom/robinhood/analytics/net/NetworkInfoProvider;Lcom/robinhood/analytics/RealSessionManager;)Lcom/robinhood/analytics/performance/SharedPerformanceLogger;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PerformanceModule_ProvideSharedPerformanceLoggerFactory create(Provider<Clock> clock, Provider<CoroutineScope> coroutineScope, Provider<PerformanceMetricDatabase> database, Provider<NetworkInfoProvider> networkInfoProvider, Provider<RealSessionManager> sessionManager) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
            Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
            return new PerformanceModule_ProvideSharedPerformanceLoggerFactory(clock, coroutineScope, database, networkInfoProvider, sessionManager);
        }

        @JvmStatic
        public final SharedPerformanceLogger provideSharedPerformanceLogger(Clock clock, CoroutineScope coroutineScope, PerformanceMetricDatabase database, NetworkInfoProvider networkInfoProvider, RealSessionManager sessionManager) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
            Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
            Object objCheckNotNull = Preconditions.checkNotNull(PerformanceModule.INSTANCE.provideSharedPerformanceLogger(clock, coroutineScope, database, networkInfoProvider, sessionManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (SharedPerformanceLogger) objCheckNotNull;
        }
    }
}
