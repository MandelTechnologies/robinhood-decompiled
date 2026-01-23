package com.robinhood.shared.analytics.provisions;

import com.robinhood.analytics.performance.ColdStartDetector;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColdStartDetectorModule_ProvideColdStartDetectorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/ColdStartDetectorModule_ProvideColdStartDetectorFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/performance/ColdStartDetector;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideColdStartDetector", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ColdStartDetectorModule_ProvideColdStartDetectorFactory implements Factory<ColdStartDetector> {
    public static final ColdStartDetectorModule_ProvideColdStartDetectorFactory INSTANCE = new ColdStartDetectorModule_ProvideColdStartDetectorFactory();

    private ColdStartDetectorModule_ProvideColdStartDetectorFactory() {
    }

    @Override // javax.inject.Provider
    public ColdStartDetector get() {
        return provideColdStartDetector();
    }

    @JvmStatic
    public static final ColdStartDetectorModule_ProvideColdStartDetectorFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ColdStartDetector provideColdStartDetector() {
        Object objCheckNotNull = Preconditions.checkNotNull(ColdStartDetectorModule.INSTANCE.provideColdStartDetector(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ColdStartDetector) objCheckNotNull;
    }
}
