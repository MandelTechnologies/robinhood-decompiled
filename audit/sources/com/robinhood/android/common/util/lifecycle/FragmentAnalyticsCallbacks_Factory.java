package com.robinhood.android.common.util.lifecycle;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentAnalyticsCallbacks_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsCallbacks_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsCallbacks;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "sourceScreenAnalytics", "Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FragmentAnalyticsCallbacks_Factory implements Factory<FragmentAnalyticsCallbacks> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<SourceScreenAnalytics> sourceScreenAnalytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FragmentAnalyticsCallbacks_Factory create(Provider<AnalyticsLogger> provider, Provider<SourceScreenAnalytics> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final FragmentAnalyticsCallbacks newInstance(AnalyticsLogger analyticsLogger, SourceScreenAnalytics sourceScreenAnalytics) {
        return INSTANCE.newInstance(analyticsLogger, sourceScreenAnalytics);
    }

    public FragmentAnalyticsCallbacks_Factory(Provider<AnalyticsLogger> analytics, Provider<SourceScreenAnalytics> sourceScreenAnalytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(sourceScreenAnalytics, "sourceScreenAnalytics");
        this.analytics = analytics;
        this.sourceScreenAnalytics = sourceScreenAnalytics;
    }

    @Override // javax.inject.Provider
    public FragmentAnalyticsCallbacks get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        SourceScreenAnalytics sourceScreenAnalytics = this.sourceScreenAnalytics.get();
        Intrinsics.checkNotNullExpressionValue(sourceScreenAnalytics, "get(...)");
        return companion.newInstance(analyticsLogger, sourceScreenAnalytics);
    }

    /* compiled from: FragmentAnalyticsCallbacks_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsCallbacks_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsCallbacks_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "sourceScreenAnalytics", "Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics;", "newInstance", "Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsCallbacks;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FragmentAnalyticsCallbacks_Factory create(Provider<AnalyticsLogger> analytics, Provider<SourceScreenAnalytics> sourceScreenAnalytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(sourceScreenAnalytics, "sourceScreenAnalytics");
            return new FragmentAnalyticsCallbacks_Factory(analytics, sourceScreenAnalytics);
        }

        @JvmStatic
        public final FragmentAnalyticsCallbacks newInstance(AnalyticsLogger analytics, SourceScreenAnalytics sourceScreenAnalytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(sourceScreenAnalytics, "sourceScreenAnalytics");
            return new FragmentAnalyticsCallbacks(analytics, sourceScreenAnalytics);
        }
    }
}
