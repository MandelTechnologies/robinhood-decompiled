package com.robinhood.android.analytics.provisions;

import com.robinhood.analytics.RealSessionManager;
import com.robinhood.analytics.dao.PerformanceMetricDatabase;
import com.robinhood.analytics.net.NetworkInfoProvider;
import com.robinhood.analytics.performance.SharedPerformanceLogger;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: PerformanceModule.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/PerformanceModule;", "", "<init>", "()V", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "database", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "networkInfoProvider", "Lcom/robinhood/analytics/RealSessionManager;", "sessionManager", "Lcom/robinhood/analytics/performance/SharedPerformanceLogger;", "provideSharedPerformanceLogger", "(Lj$/time/Clock;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;Lcom/robinhood/analytics/net/NetworkInfoProvider;Lcom/robinhood/analytics/RealSessionManager;)Lcom/robinhood/analytics/performance/SharedPerformanceLogger;", "sharedPerformanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "providePerformanceLogger", "(Lcom/robinhood/analytics/performance/SharedPerformanceLogger;)Lcom/robinhood/android/performancelogger/PerformanceLogger;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PerformanceModule {
    public static final PerformanceModule INSTANCE = new PerformanceModule();

    public final PerformanceLogger providePerformanceLogger(SharedPerformanceLogger sharedPerformanceLogger) {
        Intrinsics.checkNotNullParameter(sharedPerformanceLogger, "sharedPerformanceLogger");
        return sharedPerformanceLogger;
    }

    private PerformanceModule() {
    }

    public final SharedPerformanceLogger provideSharedPerformanceLogger(@ElapsedRealtime Clock clock, @RootCoroutineScope CoroutineScope coroutineScope, PerformanceMetricDatabase database, NetworkInfoProvider networkInfoProvider, RealSessionManager sessionManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        return new SharedPerformanceLogger(clock, coroutineScope, database.performanceMetricDao(), networkInfoProvider, sessionManager);
    }
}
