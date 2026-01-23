package com.robinhood.android.newsfeed.p200ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetNewsFeedView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AssetNewsFeedView_MembersInjector implements MembersInjector<AssetNewsFeedView> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<EventLogger> eventLogger;
    private final Provider<LoggedCustomTabs> loggedCustomTabs;
    private final Provider<Navigator> navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<AssetNewsFeedView> create(Provider<AnalyticsLogger> provider, Provider<EventLogger> provider2, Provider<LoggedCustomTabs> provider3, Provider<Navigator> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAnalytics(AssetNewsFeedView assetNewsFeedView, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(assetNewsFeedView, analyticsLogger);
    }

    @JvmStatic
    public static final void injectEventLogger(AssetNewsFeedView assetNewsFeedView, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(assetNewsFeedView, eventLogger);
    }

    @JvmStatic
    public static final void injectLoggedCustomTabs(AssetNewsFeedView assetNewsFeedView, LoggedCustomTabs loggedCustomTabs) {
        INSTANCE.injectLoggedCustomTabs(assetNewsFeedView, loggedCustomTabs);
    }

    @JvmStatic
    public static final void injectNavigator(AssetNewsFeedView assetNewsFeedView, Navigator navigator) {
        INSTANCE.injectNavigator(assetNewsFeedView, navigator);
    }

    public AssetNewsFeedView_MembersInjector(Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<LoggedCustomTabs> loggedCustomTabs, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.loggedCustomTabs = loggedCustomTabs;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AssetNewsFeedView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
        LoggedCustomTabs loggedCustomTabs = this.loggedCustomTabs.get();
        Intrinsics.checkNotNullExpressionValue(loggedCustomTabs, "get(...)");
        companion.injectLoggedCustomTabs(instance, loggedCustomTabs);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
    }

    /* compiled from: AssetNewsFeedView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectAnalytics", "", "instance", "injectEventLogger", "injectLoggedCustomTabs", "injectNavigator", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<AssetNewsFeedView> create(Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<LoggedCustomTabs> loggedCustomTabs, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new AssetNewsFeedView_MembersInjector(analytics, eventLogger, loggedCustomTabs, navigator);
        }

        @JvmStatic
        public final void injectAnalytics(AssetNewsFeedView instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(AssetNewsFeedView instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectLoggedCustomTabs(AssetNewsFeedView instance, LoggedCustomTabs loggedCustomTabs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
            instance.setLoggedCustomTabs(loggedCustomTabs);
        }

        @JvmStatic
        public final void injectNavigator(AssetNewsFeedView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
