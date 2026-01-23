package com.robinhood.android.iav.p154ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidSdkFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BR\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidSdkFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/iav/ui/PlaidSdkFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "linkEventListener", "Lcom/robinhood/android/iav/ui/PlaidLinkEventListener;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PlaidSdkFragment_MembersInjector implements MembersInjector<PlaidSdkFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<EventLogger> eventLogger;
    private final Provider<PlaidLinkEventListener> linkEventListener;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<PlaidSdkFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<EventLogger> provider3, Provider<PlaidLinkEventListener> provider4, Provider<RhProcessLifecycleOwner> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAnalytics(PlaidSdkFragment plaidSdkFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(plaidSdkFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectEventLogger(PlaidSdkFragment plaidSdkFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(plaidSdkFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectLinkEventListener(PlaidSdkFragment plaidSdkFragment, PlaidLinkEventListener plaidLinkEventListener) {
        INSTANCE.injectLinkEventListener(plaidSdkFragment, plaidLinkEventListener);
    }

    @JvmStatic
    public static final void injectRhProcessLifecycleOwner(PlaidSdkFragment plaidSdkFragment, Lazy<RhProcessLifecycleOwner> lazy) {
        INSTANCE.injectRhProcessLifecycleOwner(plaidSdkFragment, lazy);
    }

    public PlaidSdkFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<PlaidLinkEventListener> linkEventListener, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(linkEventListener, "linkEventListener");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.singletons = singletons;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.linkEventListener = linkEventListener;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PlaidSdkFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        PlaidLinkEventListener plaidLinkEventListener = this.linkEventListener.get();
        Intrinsics.checkNotNullExpressionValue(plaidLinkEventListener, "get(...)");
        companion2.injectLinkEventListener(instance, plaidLinkEventListener);
        Lazy<RhProcessLifecycleOwner> lazy = DoubleCheck.lazy(this.rhProcessLifecycleOwner);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        companion2.injectRhProcessLifecycleOwner(instance, lazy);
    }

    /* compiled from: PlaidSdkFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J#\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0019H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidSdkFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/iav/ui/PlaidSdkFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "linkEventListener", "Lcom/robinhood/android/iav/ui/PlaidLinkEventListener;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "Lkotlin/jvm/JvmSuppressWildcards;", "injectAnalytics", "", "instance", "injectEventLogger", "injectLinkEventListener", "injectRhProcessLifecycleOwner", "Ldagger/Lazy;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PlaidSdkFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<PlaidLinkEventListener> linkEventListener, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(linkEventListener, "linkEventListener");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new PlaidSdkFragment_MembersInjector(singletons, analytics, eventLogger, linkEventListener, rhProcessLifecycleOwner);
        }

        @JvmStatic
        public final void injectAnalytics(PlaidSdkFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(PlaidSdkFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectLinkEventListener(PlaidSdkFragment instance, PlaidLinkEventListener linkEventListener) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(linkEventListener, "linkEventListener");
            instance.setLinkEventListener(linkEventListener);
        }

        @JvmStatic
        public final void injectRhProcessLifecycleOwner(PlaidSdkFragment instance, Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            instance.setRhProcessLifecycleOwner(rhProcessLifecycleOwner);
        }
    }
}
