package com.robinhood.analytics;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.analytics.models.MicrogramPerformanceMetricType;
import com.robinhood.analytics.models.SharedEventLog;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.AccountSecurityEventData;
import com.robinhood.rosetta.eventlogging.AppEventData;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo;
import com.robinhood.rosetta.eventlogging.DeviceSecurityConfig;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventData;
import com.robinhood.rosetta.eventlogging.DeviceSecurityTimeout;
import com.robinhood.rosetta.eventlogging.EventCategory;
import com.robinhood.rosetta.eventlogging.LocalAuthInfo;
import com.robinhood.rosetta.eventlogging.OAuthInfo;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData;
import com.robinhood.rosetta.eventlogging.PromptsChallengeEventData;
import com.robinhood.rosetta.eventlogging.SUVInfo;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData;
import com.robinhood.rosetta.eventlogging.User;
import com.robinhood.rosetta.eventlogging.WebViewNavigationData;
import com.robinhood.rosetta.eventlogging.WorkflowInfo;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: BaseSharedEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\u000e\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00010\u0004*\u0004\b\u0003\u0010\u00062\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00072\u00020\bBY\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019Jk\u0010*\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(H&¢\u0006\u0004\b*\u0010+J\u001f\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00102J7\u0010=\u001a\u0002002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J/\u0010E\u001a\u0002002\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ'\u0010M\u001a\u0002002\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ/\u0010U\u001a\u0002002\u0006\u0010O\u001a\u00020,2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020,2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJA\u0010a\u001a\u0002002\b\u0010X\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\ba\u0010bJ/\u0010i\u001a\u0002002\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020?2\u0006\u0010f\u001a\u00020?2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jR$\u0010l\u001a\u0004\u0018\u00010k8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006r"}, m3636d2 = {"Lcom/robinhood/analytics/BaseSharedEventLogger;", "AppEventType", "", "LoggingEventType", "Lcom/robinhood/analytics/models/SharedEventLog;", "EventLog", "LoggingEventBatch", "Lcom/robinhood/analytics/BaseEventLogger;", "Lcom/robinhood/analytics/SharedEventLogger;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogBundle;", "eventLogBundle", "Lcom/robinhood/analytics/EventLogManager;", "eventLogManager", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/prefs/StringPreference;", "usernamePref", "userUuidPref", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lj$/time/Clock;Lcom/robinhood/analytics/EventLogBundle;Lcom/robinhood/analytics/EventLogManager;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "Lcom/robinhood/rosetta/eventlogging/EventCategory;", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;", "webViewNavigationData", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "deviceSecurityEventData", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;", "promptsChallengeEventData", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;", "twilioConversationsSdkEventData", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;", "pathfinderFallbackToWebViewEventData", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;", "accountSecurityEventData", "Lcom/robinhood/rosetta/eventlogging/AppEventData;", "appEventData", "createAppEvent", "(Lcom/robinhood/rosetta/eventlogging/EventCategory;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;Lcom/robinhood/rosetta/eventlogging/AppEventData;)Ljava/lang/Object;", "", "url", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "strategy", "", "logWebViewNavigation", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;)V", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "securityType", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;", "securityConfig", "", "accountAge", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unlockSuccess", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "securityTimeout", "logDeviceSecurityEvent", "(Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;DLcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;)V", "", "silent", "sourceFlow", "errorMessage", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "errorType", "logPromptsChallengeEvent", "(ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;)V", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "clientSdkStatus", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "conversationSyncStatus", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "action", "logTwilioConversationsSdkEvent", "(Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;)V", "page", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "reason", "inquiryId", "", "sequence", "logPathfinderFallbackToWebViewEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;Ljava/lang/String;I)V", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;", "challengeReplacementInfo", "Lcom/robinhood/rosetta/eventlogging/SUVInfo;", "suvInfo", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo;", "oAuthInfo", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "workflowInfo", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;", "localAuthInfo", "logAccountSecurityEvent", "(Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;Lcom/robinhood/rosetta/eventlogging/SUVInfo;Lcom/robinhood/rosetta/eventlogging/OAuthInfo;Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;)V", "", "timeInMillis", "useFullBusinessLogic", "useMultiLeg", "Lcom/robinhood/analytics/models/MicrogramPerformanceMetricType;", "type", "logMicrogramPerformance", "(JZZLcom/robinhood/analytics/models/MicrogramPerformanceMetricType;)V", "Lcom/robinhood/rosetta/eventlogging/User;", "user", "Lcom/robinhood/rosetta/eventlogging/User;", "getUser", "()Lcom/robinhood/rosetta/eventlogging/User;", "setUser", "(Lcom/robinhood/rosetta/eventlogging/User;)V", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class BaseSharedEventLogger<AppEventType, LoggingEventType, EventLog extends SharedEventLog<? extends LoggingEventType>, LoggingEventBatch> extends BaseEventLogger<AppEventType, LoggingEventType, EventLog, LoggingEventBatch> implements SharedEventLogger {
    private User user;

    public abstract AppEventType createAppEvent(EventCategory category, WebViewNavigationData webViewNavigationData, DeviceSecurityEventData deviceSecurityEventData, PromptsChallengeEventData promptsChallengeEventData, TwilioConversationsSdkEventData twilioConversationsSdkEventData, PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData, AccountSecurityEventData accountSecurityEventData, AppEventData appEventData);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSharedEventLogger(CoroutineScope coroutineScope, Clock clock, EventLogBundle eventLogBundle, EventLogManager<LoggingEventType, EventLog, LoggingEventBatch> eventLogManager, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, StringPreference usernamePref, StringPreference userUuidPref, PerformanceLogger performanceLogger) {
        super(coroutineScope, eventLogBundle, firebaseAppInstanceIdProvider, clock, eventLogManager, performanceLogger);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventLogBundle, "eventLogBundle");
        Intrinsics.checkNotNullParameter(eventLogManager, "eventLogManager");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        ScopedSubscriptionKt.subscribeIn(Observables.INSTANCE.combineLatest(usernamePref.changes(), userUuidPref.changes()), coroutineScope, new Function1() { // from class: com.robinhood.analytics.BaseSharedEventLogger$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSharedEventLogger._init_$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    protected final User getUser() {
        return this.user;
    }

    protected final void setUser(User user) {
        this.user = user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(BaseSharedEventLogger baseSharedEventLogger, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Optional optional = (Optional) tuples2.component1();
        Optional optional2 = (Optional) tuples2.component2();
        if ((optional instanceof Some) && (optional2 instanceof Some)) {
            baseSharedEventLogger.user = new User((String) ((Some) optional).getValue(), (String) ((Some) optional2).getValue(), null, null, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object createAppEvent$default(BaseSharedEventLogger baseSharedEventLogger, EventCategory eventCategory, WebViewNavigationData webViewNavigationData, DeviceSecurityEventData deviceSecurityEventData, PromptsChallengeEventData promptsChallengeEventData, TwilioConversationsSdkEventData twilioConversationsSdkEventData, PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData, AccountSecurityEventData accountSecurityEventData, AppEventData appEventData, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAppEvent");
        }
        if ((i & 2) != 0) {
            webViewNavigationData = null;
        }
        if ((i & 4) != 0) {
            deviceSecurityEventData = null;
        }
        if ((i & 8) != 0) {
            promptsChallengeEventData = null;
        }
        if ((i & 16) != 0) {
            twilioConversationsSdkEventData = null;
        }
        if ((i & 32) != 0) {
            pathfinderFallbackToWebViewEventData = null;
        }
        if ((i & 64) != 0) {
            accountSecurityEventData = null;
        }
        if ((i & 128) != 0) {
            appEventData = null;
        }
        return baseSharedEventLogger.createAppEvent(eventCategory, webViewNavigationData, deviceSecurityEventData, promptsChallengeEventData, twilioConversationsSdkEventData, pathfinderFallbackToWebViewEventData, accountSecurityEventData, appEventData);
    }

    @Override // com.robinhood.analytics.SharedEventLogger
    public void logWebViewNavigation(String url, WebViewNavigationData.Strategy strategy) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        BaseEventLogger.send$default(this, createAppEvent$default(this, EventCategory.WEB_VIEW_NAVIGATION, new WebViewNavigationData(url, strategy, null, null, null, 28, null), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.SharedEventLogger
    public void logDeviceSecurityEvent(DeviceSecurityEventData.SecurityType securityType, DeviceSecurityConfig securityConfig, double accountAge, Boolean unlockSuccess, DeviceSecurityTimeout securityTimeout) {
        Intrinsics.checkNotNullParameter(securityType, "securityType");
        Intrinsics.checkNotNullParameter(securityConfig, "securityConfig");
        Intrinsics.checkNotNullParameter(unlockSuccess, "unlockSuccess");
        Intrinsics.checkNotNullParameter(securityTimeout, "securityTimeout");
        BaseEventLogger.send$default(this, createAppEvent$default(this, EventCategory.DEVICE_SECURITY, null, new DeviceSecurityEventData(securityConfig, securityType, accountAge, unlockSuccess, securityTimeout, null, 32, null), null, null, null, null, null, 250, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.SharedEventLogger
    public void logPromptsChallengeEvent(boolean silent, String sourceFlow, String errorMessage, PromptsChallengeEventData.ErrorType errorType) {
        Intrinsics.checkNotNullParameter(sourceFlow, "sourceFlow");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        BaseEventLogger.send$default(this, createAppEvent$default(this, EventCategory.PROMPTS_CHALLENGE, null, null, new PromptsChallengeEventData(silent, sourceFlow, errorMessage, errorType, null, 16, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.SharedEventLogger
    public void logTwilioConversationsSdkEvent(TwilioConversationsSdkEventData.ConnectionState clientSdkStatus, TwilioConversationsSdkEventData.ConversationSyncStatus conversationSyncStatus, TwilioConversationsSdkEventData.Action action) {
        Intrinsics.checkNotNullParameter(clientSdkStatus, "clientSdkStatus");
        Intrinsics.checkNotNullParameter(conversationSyncStatus, "conversationSyncStatus");
        Intrinsics.checkNotNullParameter(action, "action");
        BaseEventLogger.send$default(this, createAppEvent$default(this, EventCategory.TWILIO_CONVERSATIONS_SDK, null, null, null, new TwilioConversationsSdkEventData(clientSdkStatus, conversationSyncStatus, action, null, 8, null), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.SharedEventLogger
    public void logPathfinderFallbackToWebViewEvent(String page, PathfinderFallbackToWebViewEventData.Reason reason, String inquiryId, int sequence) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        BaseEventLogger.send$default(this, createAppEvent$default(this, EventCategory.PATHFINDER_FALLBACK_TO_WEB_VIEW, null, null, null, null, new PathfinderFallbackToWebViewEventData(page, reason, inquiryId, sequence, null, 16, null), null, null, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.SharedEventLogger
    public void logAccountSecurityEvent(ChallengeReplacementInfo challengeReplacementInfo, SUVInfo suvInfo, OAuthInfo oAuthInfo, WorkflowInfo workflowInfo, LocalAuthInfo localAuthInfo) {
        BaseEventLogger.send$default(this, createAppEvent$default(this, EventCategory.ACCOUNT_SECURITY, null, null, null, null, null, new AccountSecurityEventData(challengeReplacementInfo, suvInfo, oAuthInfo, null, workflowInfo, null, localAuthInfo, null, null, 424, null), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.SharedEventLogger
    public void logMicrogramPerformance(long timeInMillis, boolean useFullBusinessLogic, boolean useMultiLeg, MicrogramPerformanceMetricType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        String str = useFullBusinessLogic ? "full data" : "points only";
        String str2 = useMultiLeg ? "multileg" : "singleleg";
        BaseEventLogger.send$default(this, createAppEvent$default(this, EventCategory.PERFORMANCE_METRIC, null, null, null, null, null, null, new AppEventData(null, 0, null, (int) timeInMillis, null, type2.getValue(), null, null, null, null, null, null, 0, null, null, null, null, str + PlaceholderUtils.XXShortPlaceholderText + str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0.0d, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, 0, null, null, null, 0.0d, null, 0.0d, null, 0.0d, 0.0d, null, 0, null, null, null, 0.0d, null, 0, 0, null, null, null, null, null, null, -131113, -1, -1, null), EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), false, false, null, null, 30, null);
    }
}
