package com.robinhood.android.settings.settings;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.feature.lib.daytrade.util.SeenDayTradeInfoPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.settings.iibsettings.BaseSettingsFragment_MembersInjector;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderSettingsFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/settings/settings/TraderSettingsFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "seenDayTradeInfoPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TraderSettingsFragment_MembersInjector implements MembersInjector<TraderSettingsFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<BooleanPreference> seenDayTradeInfoPref;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<TraderSettingsFragment> create(Provider<BaseFragmentSingletons> provider, Provider<EventLogger> provider2, Provider<SurveyManager3> provider3, Provider<BooleanPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @SeenDayTradeInfoPref
    @JvmStatic
    public static final void injectSeenDayTradeInfoPref(TraderSettingsFragment traderSettingsFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectSeenDayTradeInfoPref(traderSettingsFragment, booleanPreference);
    }

    @JvmStatic
    public static final void injectUserLeapManager(TraderSettingsFragment traderSettingsFragment, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(traderSettingsFragment, surveyManager3);
    }

    public TraderSettingsFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<SurveyManager3> userLeapManager, Provider<BooleanPreference> seenDayTradeInfoPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(seenDayTradeInfoPref, "seenDayTradeInfoPref");
        this.singletons = singletons;
        this.eventLogger = eventLogger;
        this.userLeapManager = userLeapManager;
        this.seenDayTradeInfoPref = seenDayTradeInfoPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TraderSettingsFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        BaseSettingsFragment_MembersInjector.Companion companion2 = BaseSettingsFragment_MembersInjector.INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        Companion companion3 = INSTANCE;
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion3.injectUserLeapManager(instance, surveyManager3);
        BooleanPreference booleanPreference = this.seenDayTradeInfoPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion3.injectSeenDayTradeInfoPref(instance, booleanPreference);
    }

    /* compiled from: TraderSettingsFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/settings/settings/TraderSettingsFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "seenDayTradeInfoPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectUserLeapManager", "", "instance", "injectSeenDayTradeInfoPref", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TraderSettingsFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<SurveyManager3> userLeapManager, Provider<BooleanPreference> seenDayTradeInfoPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(seenDayTradeInfoPref, "seenDayTradeInfoPref");
            return new TraderSettingsFragment_MembersInjector(singletons, eventLogger, userLeapManager, seenDayTradeInfoPref);
        }

        @JvmStatic
        public final void injectUserLeapManager(TraderSettingsFragment instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }

        @SeenDayTradeInfoPref
        @JvmStatic
        public final void injectSeenDayTradeInfoPref(TraderSettingsFragment instance, BooleanPreference seenDayTradeInfoPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(seenDayTradeInfoPref, "seenDayTradeInfoPref");
            instance.setSeenDayTradeInfoPref(seenDayTradeInfoPref);
        }
    }
}
