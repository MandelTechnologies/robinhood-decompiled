package com.robinhood.android.search.newsfeed.view;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.data.prefs.VideoAutoplaySettingPref;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.user.agent.UserAgentProvider;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "autoplaySettingPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NewsFeedFragment_MembersInjector implements MembersInjector<NewsFeedFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<StringPreference> autoplaySettingPref;
    private final Provider<CrossSellLaunchManager> crossSellLaunchManager;
    private final Provider<EventLogger> eventLogger;
    private final Provider<LoggedCustomTabs> loggedCustomTabs;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<UserAgentProvider> userAgentProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<NewsFeedFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<EventLogger> provider3, Provider<LoggedCustomTabs> provider4, Provider<UserAgentProvider> provider5, Provider<CrossSellLaunchManager> provider6, Provider<StringPreference> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final void injectAnalytics(NewsFeedFragment newsFeedFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(newsFeedFragment, analyticsLogger);
    }

    @JvmStatic
    @VideoAutoplaySettingPref
    public static final void injectAutoplaySettingPref(NewsFeedFragment newsFeedFragment, StringPreference stringPreference) {
        INSTANCE.injectAutoplaySettingPref(newsFeedFragment, stringPreference);
    }

    @JvmStatic
    public static final void injectCrossSellLaunchManager(NewsFeedFragment newsFeedFragment, CrossSellLaunchManager crossSellLaunchManager) {
        INSTANCE.injectCrossSellLaunchManager(newsFeedFragment, crossSellLaunchManager);
    }

    @JvmStatic
    public static final void injectEventLogger(NewsFeedFragment newsFeedFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(newsFeedFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectLoggedCustomTabs(NewsFeedFragment newsFeedFragment, LoggedCustomTabs loggedCustomTabs) {
        INSTANCE.injectLoggedCustomTabs(newsFeedFragment, loggedCustomTabs);
    }

    @JvmStatic
    public static final void injectUserAgentProvider(NewsFeedFragment newsFeedFragment, UserAgentProvider userAgentProvider) {
        INSTANCE.injectUserAgentProvider(newsFeedFragment, userAgentProvider);
    }

    public NewsFeedFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<LoggedCustomTabs> loggedCustomTabs, Provider<UserAgentProvider> userAgentProvider, Provider<CrossSellLaunchManager> crossSellLaunchManager, Provider<StringPreference> autoplaySettingPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
        Intrinsics.checkNotNullParameter(autoplaySettingPref, "autoplaySettingPref");
        this.singletons = singletons;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.loggedCustomTabs = loggedCustomTabs;
        this.userAgentProvider = userAgentProvider;
        this.crossSellLaunchManager = crossSellLaunchManager;
        this.autoplaySettingPref = autoplaySettingPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedFragment instance) {
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
        LoggedCustomTabs loggedCustomTabs = this.loggedCustomTabs.get();
        Intrinsics.checkNotNullExpressionValue(loggedCustomTabs, "get(...)");
        companion2.injectLoggedCustomTabs(instance, loggedCustomTabs);
        UserAgentProvider userAgentProvider = this.userAgentProvider.get();
        Intrinsics.checkNotNullExpressionValue(userAgentProvider, "get(...)");
        companion2.injectUserAgentProvider(instance, userAgentProvider);
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager.get();
        Intrinsics.checkNotNullExpressionValue(crossSellLaunchManager, "get(...)");
        companion2.injectCrossSellLaunchManager(instance, crossSellLaunchManager);
        StringPreference stringPreference = this.autoplaySettingPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectAutoplaySettingPref(instance, stringPreference);
    }

    /* compiled from: NewsFeedFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "autoplaySettingPref", "Lcom/robinhood/prefs/StringPreference;", "injectAnalytics", "", "instance", "injectEventLogger", "injectLoggedCustomTabs", "injectUserAgentProvider", "injectCrossSellLaunchManager", "injectAutoplaySettingPref", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<NewsFeedFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<LoggedCustomTabs> loggedCustomTabs, Provider<UserAgentProvider> userAgentProvider, Provider<CrossSellLaunchManager> crossSellLaunchManager, Provider<StringPreference> autoplaySettingPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
            Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            Intrinsics.checkNotNullParameter(autoplaySettingPref, "autoplaySettingPref");
            return new NewsFeedFragment_MembersInjector(singletons, analytics, eventLogger, loggedCustomTabs, userAgentProvider, crossSellLaunchManager, autoplaySettingPref);
        }

        @JvmStatic
        public final void injectAnalytics(NewsFeedFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(NewsFeedFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectLoggedCustomTabs(NewsFeedFragment instance, LoggedCustomTabs loggedCustomTabs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
            instance.setLoggedCustomTabs(loggedCustomTabs);
        }

        @JvmStatic
        public final void injectUserAgentProvider(NewsFeedFragment instance, UserAgentProvider userAgentProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
            instance.setUserAgentProvider(userAgentProvider);
        }

        @JvmStatic
        public final void injectCrossSellLaunchManager(NewsFeedFragment instance, CrossSellLaunchManager crossSellLaunchManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            instance.setCrossSellLaunchManager(crossSellLaunchManager);
        }

        @JvmStatic
        @VideoAutoplaySettingPref
        public final void injectAutoplaySettingPref(NewsFeedFragment instance, StringPreference autoplaySettingPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(autoplaySettingPref, "autoplaySettingPref");
            instance.setAutoplaySettingPref(autoplaySettingPref);
        }
    }
}
