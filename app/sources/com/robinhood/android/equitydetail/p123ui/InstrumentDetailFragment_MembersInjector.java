package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpLogger;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowDropFromRecurringCreationSurvey;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "markwon", "Lio/noties/markwon/Markwon;", "sdpLogger", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "showDropFromRecurringCreationSurvey", "Lcom/robinhood/prefs/BooleanPreference;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InstrumentDetailFragment_MembersInjector implements MembersInjector<InstrumentDetailFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CrossSellLaunchManager> crossSellLaunchManager;
    private final Provider<EventLogger> eventLogger;
    private final Provider<Markwon> markwon;
    private final Provider<SdpLogger> sdpLogger;
    private final Provider<BooleanPreference> showDropFromRecurringCreationSurvey;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<InstrumentDetailFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<EventLogger> provider3, Provider<Markwon> provider4, Provider<SdpLogger> provider5, Provider<SurveyManager3> provider6, Provider<BooleanPreference> provider7, Provider<CrossSellLaunchManager> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final void injectAnalytics(InstrumentDetailFragment instrumentDetailFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(instrumentDetailFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectCrossSellLaunchManager(InstrumentDetailFragment instrumentDetailFragment, CrossSellLaunchManager crossSellLaunchManager) {
        INSTANCE.injectCrossSellLaunchManager(instrumentDetailFragment, crossSellLaunchManager);
    }

    @JvmStatic
    public static final void injectEventLogger(InstrumentDetailFragment instrumentDetailFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(instrumentDetailFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectMarkwon(InstrumentDetailFragment instrumentDetailFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(instrumentDetailFragment, markwon);
    }

    @JvmStatic
    public static final void injectSdpLogger(InstrumentDetailFragment instrumentDetailFragment, SdpLogger sdpLogger) {
        INSTANCE.injectSdpLogger(instrumentDetailFragment, sdpLogger);
    }

    @JvmStatic
    @ShowDropFromRecurringCreationSurvey
    public static final void injectShowDropFromRecurringCreationSurvey(InstrumentDetailFragment instrumentDetailFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShowDropFromRecurringCreationSurvey(instrumentDetailFragment, booleanPreference);
    }

    @JvmStatic
    public static final void injectUserLeapManager(InstrumentDetailFragment instrumentDetailFragment, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(instrumentDetailFragment, surveyManager3);
    }

    public InstrumentDetailFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<Markwon> markwon, Provider<SdpLogger> sdpLogger, Provider<SurveyManager3> userLeapManager, Provider<BooleanPreference> showDropFromRecurringCreationSurvey, Provider<CrossSellLaunchManager> crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(sdpLogger, "sdpLogger");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(showDropFromRecurringCreationSurvey, "showDropFromRecurringCreationSurvey");
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
        this.singletons = singletons;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.markwon = markwon;
        this.sdpLogger = sdpLogger;
        this.userLeapManager = userLeapManager;
        this.showDropFromRecurringCreationSurvey = showDropFromRecurringCreationSurvey;
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstrumentDetailFragment instance) {
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
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        SdpLogger sdpLogger = this.sdpLogger.get();
        Intrinsics.checkNotNullExpressionValue(sdpLogger, "get(...)");
        companion2.injectSdpLogger(instance, sdpLogger);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
        BooleanPreference booleanPreference = this.showDropFromRecurringCreationSurvey.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectShowDropFromRecurringCreationSurvey(instance, booleanPreference);
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager.get();
        Intrinsics.checkNotNullExpressionValue(crossSellLaunchManager, "get(...)");
        companion2.injectCrossSellLaunchManager(instance, crossSellLaunchManager);
    }

    /* compiled from: InstrumentDetailFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J~\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "markwon", "Lio/noties/markwon/Markwon;", "sdpLogger", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "showDropFromRecurringCreationSurvey", "Lcom/robinhood/prefs/BooleanPreference;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "injectAnalytics", "", "instance", "injectEventLogger", "injectMarkwon", "injectSdpLogger", "injectUserLeapManager", "injectShowDropFromRecurringCreationSurvey", "injectCrossSellLaunchManager", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<InstrumentDetailFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<Markwon> markwon, Provider<SdpLogger> sdpLogger, Provider<SurveyManager3> userLeapManager, Provider<BooleanPreference> showDropFromRecurringCreationSurvey, Provider<CrossSellLaunchManager> crossSellLaunchManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(sdpLogger, "sdpLogger");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(showDropFromRecurringCreationSurvey, "showDropFromRecurringCreationSurvey");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            return new InstrumentDetailFragment_MembersInjector(singletons, analytics, eventLogger, markwon, sdpLogger, userLeapManager, showDropFromRecurringCreationSurvey, crossSellLaunchManager);
        }

        @JvmStatic
        public final void injectAnalytics(InstrumentDetailFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(InstrumentDetailFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectMarkwon(InstrumentDetailFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectSdpLogger(InstrumentDetailFragment instance, SdpLogger sdpLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sdpLogger, "sdpLogger");
            instance.setSdpLogger(sdpLogger);
        }

        @JvmStatic
        public final void injectUserLeapManager(InstrumentDetailFragment instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }

        @JvmStatic
        @ShowDropFromRecurringCreationSurvey
        public final void injectShowDropFromRecurringCreationSurvey(InstrumentDetailFragment instance, BooleanPreference showDropFromRecurringCreationSurvey) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showDropFromRecurringCreationSurvey, "showDropFromRecurringCreationSurvey");
            instance.setShowDropFromRecurringCreationSurvey(showDropFromRecurringCreationSurvey);
        }

        @JvmStatic
        public final void injectCrossSellLaunchManager(InstrumentDetailFragment instance, CrossSellLaunchManager crossSellLaunchManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            instance.setCrossSellLaunchManager(crossSellLaunchManager);
        }
    }
}
