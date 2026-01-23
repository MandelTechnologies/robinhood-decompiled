package com.robinhood.shared.analytics.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.work.PeriodicWorker;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsModule_ProvidePeriodicPerformanceMetricLoggingWorkerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvidePeriodicPerformanceMetricLoggingWorkerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/work/PeriodicWorker;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "providePeriodicPerformanceMetricLoggingWorker", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.analytics.provisions.AnalyticsModule_ProvidePeriodicPerformanceMetricLoggingWorkerFactory */
/* loaded from: classes21.dex */
public final class C37342xc173327e implements Factory<PeriodicWorker> {
    public static final C37342xc173327e INSTANCE = new C37342xc173327e();

    private C37342xc173327e() {
    }

    @Override // javax.inject.Provider
    public PeriodicWorker get() {
        return providePeriodicPerformanceMetricLoggingWorker();
    }

    @JvmStatic
    public static final C37342xc173327e create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final PeriodicWorker providePeriodicPerformanceMetricLoggingWorker() {
        Object objCheckNotNull = Preconditions.checkNotNull(AnalyticsModule.INSTANCE.providePeriodicPerformanceMetricLoggingWorker(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (PeriodicWorker) objCheckNotNull;
    }
}
