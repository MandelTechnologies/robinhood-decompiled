package com.robinhood.android.p273ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.data.prefs.SnowflakesConfettiLastShownDatePref;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.android.designsystem.confetti.Confetti;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.resumeapplication.ResumeApplicationManager;
import com.robinhood.librobinhood.data.prefs.HasVisitedInboxTabPref;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.shared.debug.bugbash.models.BugBashPrefModule2;
import com.robinhood.shared.home.deeplink.prompt.BlockedExternalDeeplinkPrompt;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainTabActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0080\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0017\u0010\u0012\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/MainTabActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "hasVisitedInboxTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "snowflakesConfettiLastShownDatePref", "Lcom/robinhood/prefs/StringPreference;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "mainTabActivityListeners", "", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "confetti", "Lcom/robinhood/android/designsystem/confetti/Confetti;", "notificationHandler", "Lcom/robinhood/android/common/notification/NotificationManager;", "resumeApplicationManager", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "blockedDeeplinkPrompt", "Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "bugBashDeeplinkSharedPref", "accountSelectorHomeManger", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MainTabActivity_MembersInjector implements MembersInjector<MainTabActivity> {
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManger;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AttributionManager> attributionManager;
    private final Provider<BlockedExternalDeeplinkPrompt> blockedDeeplinkPrompt;
    private final Provider<StringPreference> bugBashDeeplinkSharedPref;
    private final Provider<Confetti> confetti;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<GcmManager> gcmManager;
    private final Provider<BooleanPreference> hasVisitedInboxTabPref;
    private final Provider<InboxBadgeStore> inboxBadgeStore;
    private final Provider<Set<MainTabActivityListener>> mainTabActivityListeners;
    private final Provider<NotificationManager> notificationHandler;
    private final Provider<ResumeApplicationManager> resumeApplicationManager;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<StringPreference> snowflakesConfettiLastShownDatePref;
    private final Provider<TooltipManager> tooltipManager;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<MainTabActivity> create(Provider<BaseActivitySingletons> provider, Provider<BooleanPreference> provider2, Provider<StringPreference> provider3, Provider<SharedEventLogger> provider4, Provider<SurveyManager3> provider5, Provider<GcmManager> provider6, Provider<InboxBadgeStore> provider7, Provider<Set<MainTabActivityListener>> provider8, Provider<Confetti> provider9, Provider<NotificationManager> provider10, Provider<ResumeApplicationManager> provider11, Provider<TooltipManager> provider12, Provider<AttributionManager> provider13, Provider<BlockedExternalDeeplinkPrompt> provider14, Provider<AnalyticsLogger> provider15, Provider<StringPreference> provider16, Provider<AccountSelectorHomeManager> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final void injectAccountSelectorHomeManger(MainTabActivity mainTabActivity, AccountSelectorHomeManager accountSelectorHomeManager) {
        INSTANCE.injectAccountSelectorHomeManger(mainTabActivity, accountSelectorHomeManager);
    }

    @JvmStatic
    public static final void injectAnalytics(MainTabActivity mainTabActivity, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(mainTabActivity, analyticsLogger);
    }

    @JvmStatic
    public static final void injectAttributionManager(MainTabActivity mainTabActivity, AttributionManager attributionManager) {
        INSTANCE.injectAttributionManager(mainTabActivity, attributionManager);
    }

    @JvmStatic
    public static final void injectBlockedDeeplinkPrompt(MainTabActivity mainTabActivity, BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt) {
        INSTANCE.injectBlockedDeeplinkPrompt(mainTabActivity, blockedExternalDeeplinkPrompt);
    }

    @JvmStatic
    @BugBashPrefModule2
    public static final void injectBugBashDeeplinkSharedPref(MainTabActivity mainTabActivity, StringPreference stringPreference) {
        INSTANCE.injectBugBashDeeplinkSharedPref(mainTabActivity, stringPreference);
    }

    @JvmStatic
    public static final void injectConfetti(MainTabActivity mainTabActivity, Confetti confetti) {
        INSTANCE.injectConfetti(mainTabActivity, confetti);
    }

    @JvmStatic
    public static final void injectEventLogger(MainTabActivity mainTabActivity, SharedEventLogger sharedEventLogger) {
        INSTANCE.injectEventLogger(mainTabActivity, sharedEventLogger);
    }

    @JvmStatic
    public static final void injectGcmManager(MainTabActivity mainTabActivity, GcmManager gcmManager) {
        INSTANCE.injectGcmManager(mainTabActivity, gcmManager);
    }

    @JvmStatic
    @HasVisitedInboxTabPref
    public static final void injectHasVisitedInboxTabPref(MainTabActivity mainTabActivity, BooleanPreference booleanPreference) {
        INSTANCE.injectHasVisitedInboxTabPref(mainTabActivity, booleanPreference);
    }

    @JvmStatic
    public static final void injectInboxBadgeStore(MainTabActivity mainTabActivity, InboxBadgeStore inboxBadgeStore) {
        INSTANCE.injectInboxBadgeStore(mainTabActivity, inboxBadgeStore);
    }

    @JvmStatic
    public static final void injectMainTabActivityListeners(MainTabActivity mainTabActivity, Set<MainTabActivityListener> set) {
        INSTANCE.injectMainTabActivityListeners(mainTabActivity, set);
    }

    @JvmStatic
    public static final void injectNotificationHandler(MainTabActivity mainTabActivity, NotificationManager notificationManager) {
        INSTANCE.injectNotificationHandler(mainTabActivity, notificationManager);
    }

    @JvmStatic
    public static final void injectResumeApplicationManager(MainTabActivity mainTabActivity, ResumeApplicationManager resumeApplicationManager) {
        INSTANCE.injectResumeApplicationManager(mainTabActivity, resumeApplicationManager);
    }

    @SnowflakesConfettiLastShownDatePref
    @JvmStatic
    public static final void injectSnowflakesConfettiLastShownDatePref(MainTabActivity mainTabActivity, StringPreference stringPreference) {
        INSTANCE.injectSnowflakesConfettiLastShownDatePref(mainTabActivity, stringPreference);
    }

    @JvmStatic
    public static final void injectTooltipManager(MainTabActivity mainTabActivity, TooltipManager tooltipManager) {
        INSTANCE.injectTooltipManager(mainTabActivity, tooltipManager);
    }

    @JvmStatic
    public static final void injectUserLeapManager(MainTabActivity mainTabActivity, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(mainTabActivity, surveyManager3);
    }

    public MainTabActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<BooleanPreference> hasVisitedInboxTabPref, Provider<StringPreference> snowflakesConfettiLastShownDatePref, Provider<SharedEventLogger> eventLogger, Provider<SurveyManager3> userLeapManager, Provider<GcmManager> gcmManager, Provider<InboxBadgeStore> inboxBadgeStore, Provider<Set<MainTabActivityListener>> mainTabActivityListeners, Provider<Confetti> confetti, Provider<NotificationManager> notificationHandler, Provider<ResumeApplicationManager> resumeApplicationManager, Provider<TooltipManager> tooltipManager, Provider<AttributionManager> attributionManager, Provider<BlockedExternalDeeplinkPrompt> blockedDeeplinkPrompt, Provider<AnalyticsLogger> analytics, Provider<StringPreference> bugBashDeeplinkSharedPref, Provider<AccountSelectorHomeManager> accountSelectorHomeManger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(hasVisitedInboxTabPref, "hasVisitedInboxTabPref");
        Intrinsics.checkNotNullParameter(snowflakesConfettiLastShownDatePref, "snowflakesConfettiLastShownDatePref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(mainTabActivityListeners, "mainTabActivityListeners");
        Intrinsics.checkNotNullParameter(confetti, "confetti");
        Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
        Intrinsics.checkNotNullParameter(resumeApplicationManager, "resumeApplicationManager");
        Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
        Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
        Intrinsics.checkNotNullParameter(blockedDeeplinkPrompt, "blockedDeeplinkPrompt");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(bugBashDeeplinkSharedPref, "bugBashDeeplinkSharedPref");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManger, "accountSelectorHomeManger");
        this.singletons = singletons;
        this.hasVisitedInboxTabPref = hasVisitedInboxTabPref;
        this.snowflakesConfettiLastShownDatePref = snowflakesConfettiLastShownDatePref;
        this.eventLogger = eventLogger;
        this.userLeapManager = userLeapManager;
        this.gcmManager = gcmManager;
        this.inboxBadgeStore = inboxBadgeStore;
        this.mainTabActivityListeners = mainTabActivityListeners;
        this.confetti = confetti;
        this.notificationHandler = notificationHandler;
        this.resumeApplicationManager = resumeApplicationManager;
        this.tooltipManager = tooltipManager;
        this.attributionManager = attributionManager;
        this.blockedDeeplinkPrompt = blockedDeeplinkPrompt;
        this.analytics = analytics;
        this.bugBashDeeplinkSharedPref = bugBashDeeplinkSharedPref;
        this.accountSelectorHomeManger = accountSelectorHomeManger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainTabActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        BooleanPreference booleanPreference = this.hasVisitedInboxTabPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectHasVisitedInboxTabPref(instance, booleanPreference);
        StringPreference stringPreference = this.snowflakesConfettiLastShownDatePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectSnowflakesConfettiLastShownDatePref(instance, stringPreference);
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        companion2.injectEventLogger(instance, sharedEventLogger);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
        GcmManager gcmManager = this.gcmManager.get();
        Intrinsics.checkNotNullExpressionValue(gcmManager, "get(...)");
        companion2.injectGcmManager(instance, gcmManager);
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxBadgeStore, "get(...)");
        companion2.injectInboxBadgeStore(instance, inboxBadgeStore);
        Set<MainTabActivityListener> set = this.mainTabActivityListeners.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        companion2.injectMainTabActivityListeners(instance, set);
        Confetti confetti = this.confetti.get();
        Intrinsics.checkNotNullExpressionValue(confetti, "get(...)");
        companion2.injectConfetti(instance, confetti);
        NotificationManager notificationManager = this.notificationHandler.get();
        Intrinsics.checkNotNullExpressionValue(notificationManager, "get(...)");
        companion2.injectNotificationHandler(instance, notificationManager);
        ResumeApplicationManager resumeApplicationManager = this.resumeApplicationManager.get();
        Intrinsics.checkNotNullExpressionValue(resumeApplicationManager, "get(...)");
        companion2.injectResumeApplicationManager(instance, resumeApplicationManager);
        TooltipManager tooltipManager = this.tooltipManager.get();
        Intrinsics.checkNotNullExpressionValue(tooltipManager, "get(...)");
        companion2.injectTooltipManager(instance, tooltipManager);
        AttributionManager attributionManager = this.attributionManager.get();
        Intrinsics.checkNotNullExpressionValue(attributionManager, "get(...)");
        companion2.injectAttributionManager(instance, attributionManager);
        BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt = this.blockedDeeplinkPrompt.get();
        Intrinsics.checkNotNullExpressionValue(blockedExternalDeeplinkPrompt, "get(...)");
        companion2.injectBlockedDeeplinkPrompt(instance, blockedExternalDeeplinkPrompt);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        StringPreference stringPreference2 = this.bugBashDeeplinkSharedPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        companion2.injectBugBashDeeplinkSharedPref(instance, stringPreference2);
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManger.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        companion2.injectAccountSelectorHomeManger(instance, accountSelectorHomeManager);
    }

    /* compiled from: MainTabActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0087\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0017\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\bH\u0007J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u00101\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u00102\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J#\u00103\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0007J\u0018\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u00105\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u00106\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u00107\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u00108\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0007J\u0018\u00109\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0007J\u0018\u0010:\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0007J\u0018\u0010;\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\rH\u0007J\u0018\u0010<\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0007¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/MainTabActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "hasVisitedInboxTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "snowflakesConfettiLastShownDatePref", "Lcom/robinhood/prefs/StringPreference;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "mainTabActivityListeners", "", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "confetti", "Lcom/robinhood/android/designsystem/confetti/Confetti;", "notificationHandler", "Lcom/robinhood/android/common/notification/NotificationManager;", "resumeApplicationManager", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "blockedDeeplinkPrompt", "Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "bugBashDeeplinkSharedPref", "accountSelectorHomeManger", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "injectHasVisitedInboxTabPref", "", "instance", "injectSnowflakesConfettiLastShownDatePref", "injectEventLogger", "injectUserLeapManager", "injectGcmManager", "injectInboxBadgeStore", "injectMainTabActivityListeners", "injectConfetti", "injectNotificationHandler", "injectResumeApplicationManager", "injectTooltipManager", "injectAttributionManager", "injectBlockedDeeplinkPrompt", "injectAnalytics", "injectBugBashDeeplinkSharedPref", "injectAccountSelectorHomeManger", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<MainTabActivity> create(Provider<BaseActivitySingletons> singletons, Provider<BooleanPreference> hasVisitedInboxTabPref, Provider<StringPreference> snowflakesConfettiLastShownDatePref, Provider<SharedEventLogger> eventLogger, Provider<SurveyManager3> userLeapManager, Provider<GcmManager> gcmManager, Provider<InboxBadgeStore> inboxBadgeStore, Provider<Set<MainTabActivityListener>> mainTabActivityListeners, Provider<Confetti> confetti, Provider<NotificationManager> notificationHandler, Provider<ResumeApplicationManager> resumeApplicationManager, Provider<TooltipManager> tooltipManager, Provider<AttributionManager> attributionManager, Provider<BlockedExternalDeeplinkPrompt> blockedDeeplinkPrompt, Provider<AnalyticsLogger> analytics, Provider<StringPreference> bugBashDeeplinkSharedPref, Provider<AccountSelectorHomeManager> accountSelectorHomeManger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(hasVisitedInboxTabPref, "hasVisitedInboxTabPref");
            Intrinsics.checkNotNullParameter(snowflakesConfettiLastShownDatePref, "snowflakesConfettiLastShownDatePref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(mainTabActivityListeners, "mainTabActivityListeners");
            Intrinsics.checkNotNullParameter(confetti, "confetti");
            Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
            Intrinsics.checkNotNullParameter(resumeApplicationManager, "resumeApplicationManager");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            Intrinsics.checkNotNullParameter(blockedDeeplinkPrompt, "blockedDeeplinkPrompt");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(bugBashDeeplinkSharedPref, "bugBashDeeplinkSharedPref");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManger, "accountSelectorHomeManger");
            return new MainTabActivity_MembersInjector(singletons, hasVisitedInboxTabPref, snowflakesConfettiLastShownDatePref, eventLogger, userLeapManager, gcmManager, inboxBadgeStore, mainTabActivityListeners, confetti, notificationHandler, resumeApplicationManager, tooltipManager, attributionManager, blockedDeeplinkPrompt, analytics, bugBashDeeplinkSharedPref, accountSelectorHomeManger);
        }

        @JvmStatic
        @HasVisitedInboxTabPref
        public final void injectHasVisitedInboxTabPref(MainTabActivity instance, BooleanPreference hasVisitedInboxTabPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasVisitedInboxTabPref, "hasVisitedInboxTabPref");
            instance.setHasVisitedInboxTabPref(hasVisitedInboxTabPref);
        }

        @SnowflakesConfettiLastShownDatePref
        @JvmStatic
        public final void injectSnowflakesConfettiLastShownDatePref(MainTabActivity instance, StringPreference snowflakesConfettiLastShownDatePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(snowflakesConfettiLastShownDatePref, "snowflakesConfettiLastShownDatePref");
            instance.setSnowflakesConfettiLastShownDatePref(snowflakesConfettiLastShownDatePref);
        }

        @JvmStatic
        public final void injectEventLogger(MainTabActivity instance, SharedEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectUserLeapManager(MainTabActivity instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }

        @JvmStatic
        public final void injectGcmManager(MainTabActivity instance, GcmManager gcmManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
            instance.setGcmManager(gcmManager);
        }

        @JvmStatic
        public final void injectInboxBadgeStore(MainTabActivity instance, InboxBadgeStore inboxBadgeStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            instance.setInboxBadgeStore(inboxBadgeStore);
        }

        @JvmStatic
        public final void injectMainTabActivityListeners(MainTabActivity instance, Set<MainTabActivityListener> mainTabActivityListeners) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(mainTabActivityListeners, "mainTabActivityListeners");
            instance.setMainTabActivityListeners(mainTabActivityListeners);
        }

        @JvmStatic
        public final void injectConfetti(MainTabActivity instance, Confetti confetti) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(confetti, "confetti");
            instance.setConfetti(confetti);
        }

        @JvmStatic
        public final void injectNotificationHandler(MainTabActivity instance, NotificationManager notificationHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
            instance.setNotificationHandler(notificationHandler);
        }

        @JvmStatic
        public final void injectResumeApplicationManager(MainTabActivity instance, ResumeApplicationManager resumeApplicationManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(resumeApplicationManager, "resumeApplicationManager");
            instance.setResumeApplicationManager(resumeApplicationManager);
        }

        @JvmStatic
        public final void injectTooltipManager(MainTabActivity instance, TooltipManager tooltipManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            instance.setTooltipManager(tooltipManager);
        }

        @JvmStatic
        public final void injectAttributionManager(MainTabActivity instance, AttributionManager attributionManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            instance.setAttributionManager(attributionManager);
        }

        @JvmStatic
        public final void injectBlockedDeeplinkPrompt(MainTabActivity instance, BlockedExternalDeeplinkPrompt blockedDeeplinkPrompt) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(blockedDeeplinkPrompt, "blockedDeeplinkPrompt");
            instance.setBlockedDeeplinkPrompt(blockedDeeplinkPrompt);
        }

        @JvmStatic
        public final void injectAnalytics(MainTabActivity instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        @BugBashPrefModule2
        public final void injectBugBashDeeplinkSharedPref(MainTabActivity instance, StringPreference bugBashDeeplinkSharedPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bugBashDeeplinkSharedPref, "bugBashDeeplinkSharedPref");
            instance.setBugBashDeeplinkSharedPref(bugBashDeeplinkSharedPref);
        }

        @JvmStatic
        public final void injectAccountSelectorHomeManger(MainTabActivity instance, AccountSelectorHomeManager accountSelectorHomeManger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManger, "accountSelectorHomeManger");
            instance.setAccountSelectorHomeManger(accountSelectorHomeManger);
        }
    }
}
