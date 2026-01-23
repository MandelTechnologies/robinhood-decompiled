package com.robinhood.analytics;

import android.net.Uri;
import com.robinhood.analytics.models.MicrogramPerformanceMetricType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo;
import com.robinhood.rosetta.eventlogging.DeviceSecurityConfig;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventData;
import com.robinhood.rosetta.eventlogging.DeviceSecurityTimeout;
import com.robinhood.rosetta.eventlogging.LocalAuthInfo;
import com.robinhood.rosetta.eventlogging.OAuthInfo;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData;
import com.robinhood.rosetta.eventlogging.PromptsChallengeEventData;
import com.robinhood.rosetta.eventlogging.SUVInfo;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData;
import com.robinhood.rosetta.eventlogging.WebViewNavigationData;
import com.robinhood.rosetta.eventlogging.WorkflowInfo;
import java.util.UUID;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: SharedEventLogger.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J0\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J0\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001eH&J&\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%H&J(\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H&JD\u0010-\u001a\u00020\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u000107H&J(\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>H&J\u0018\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH&J\u0010\u0010D\u001a\u00020\t2\u0006\u0010\n\u001a\u00020EH&J\u0010\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020HH&J\u0010\u0010I\u001a\u00020\t2\u0006\u0010G\u001a\u00020HH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006J"}, m3636d2 = {"Lcom/robinhood/analytics/SharedEventLogger;", "Lcom/robinhood/analytics/EventLogger;", "currentTab", "", "getCurrentTab", "()Ljava/lang/String;", "setCurrentTab", "(Ljava/lang/String;)V", "logWebViewNavigation", "", "url", "strategy", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "logDeviceSecurityEvent", "securityType", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "securityConfig", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;", "accountAge", "", "unlockSuccess", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "securityTimeout", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "logPromptsChallengeEvent", "silent", "", "sourceFlow", "errorMessage", "errorType", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "logTwilioConversationsSdkEvent", "clientSdkStatus", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "conversationSyncStatus", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "action", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "logPathfinderFallbackToWebViewEvent", "page", "reason", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "inquiryId", "sequence", "", "logAccountSecurityEvent", "challengeReplacementInfo", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;", "suvInfo", "Lcom/robinhood/rosetta/eventlogging/SUVInfo;", "oAuthInfo", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo;", "workflowInfo", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "localAuthInfo", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;", "logMicrogramPerformance", "timeInMillis", "", "useFullBusinessLogic", "useMultiLeg", "type", "Lcom/robinhood/analytics/models/MicrogramPerformanceMetricType;", "logCancelOrderEvent", "existingOrderId", "Ljava/util/UUID;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "logDeeplinkBlocked", "Lokhttp3/HttpUrl;", "logDeeplinkMatchSuccess", "uri", "Landroid/net/Uri;", "logDeeplinkMatchFailure", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface SharedEventLogger extends EventLogger {
    String getCurrentTab();

    void logAccountSecurityEvent(ChallengeReplacementInfo challengeReplacementInfo, SUVInfo suvInfo, OAuthInfo oAuthInfo, WorkflowInfo workflowInfo, LocalAuthInfo localAuthInfo);

    void logCancelOrderEvent(UUID existingOrderId, BrokerageAccountType brokerageAccountType);

    void logDeeplinkBlocked(HttpUrl url);

    void logDeeplinkMatchFailure(Uri uri);

    void logDeeplinkMatchSuccess(Uri uri);

    void logDeviceSecurityEvent(DeviceSecurityEventData.SecurityType securityType, DeviceSecurityConfig securityConfig, double accountAge, Boolean unlockSuccess, DeviceSecurityTimeout securityTimeout);

    void logMicrogramPerformance(long timeInMillis, boolean useFullBusinessLogic, boolean useMultiLeg, MicrogramPerformanceMetricType type2);

    void logPathfinderFallbackToWebViewEvent(String page, PathfinderFallbackToWebViewEventData.Reason reason, String inquiryId, int sequence);

    void logPromptsChallengeEvent(boolean silent, String sourceFlow, String errorMessage, PromptsChallengeEventData.ErrorType errorType);

    void logTwilioConversationsSdkEvent(TwilioConversationsSdkEventData.ConnectionState clientSdkStatus, TwilioConversationsSdkEventData.ConversationSyncStatus conversationSyncStatus, TwilioConversationsSdkEventData.Action action);

    void logWebViewNavigation(String url, WebViewNavigationData.Strategy strategy);

    void setCurrentTab(String str);

    /* compiled from: SharedEventLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void logPromptsChallengeEvent$default(SharedEventLogger sharedEventLogger, boolean z, String str, String str2, PromptsChallengeEventData.ErrorType errorType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPromptsChallengeEvent");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                errorType = PromptsChallengeEventData.ErrorType.EVENT_TYPE_UNSPECIFIED;
            }
            sharedEventLogger.logPromptsChallengeEvent(z, str, str2, errorType);
        }

        public static /* synthetic */ void logTwilioConversationsSdkEvent$default(SharedEventLogger sharedEventLogger, TwilioConversationsSdkEventData.ConnectionState connectionState, TwilioConversationsSdkEventData.ConversationSyncStatus conversationSyncStatus, TwilioConversationsSdkEventData.Action action, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logTwilioConversationsSdkEvent");
            }
            if ((i & 1) != 0) {
                connectionState = TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                conversationSyncStatus = TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED;
            }
            if ((i & 4) != 0) {
                action = TwilioConversationsSdkEventData.Action.ACTION_UNSPECIFIED;
            }
            sharedEventLogger.logTwilioConversationsSdkEvent(connectionState, conversationSyncStatus, action);
        }

        public static /* synthetic */ void logAccountSecurityEvent$default(SharedEventLogger sharedEventLogger, ChallengeReplacementInfo challengeReplacementInfo, SUVInfo sUVInfo, OAuthInfo oAuthInfo, WorkflowInfo workflowInfo, LocalAuthInfo localAuthInfo, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logAccountSecurityEvent");
            }
            if ((i & 1) != 0) {
                challengeReplacementInfo = null;
            }
            if ((i & 2) != 0) {
                sUVInfo = null;
            }
            if ((i & 4) != 0) {
                oAuthInfo = null;
            }
            if ((i & 8) != 0) {
                workflowInfo = null;
            }
            if ((i & 16) != 0) {
                localAuthInfo = null;
            }
            sharedEventLogger.logAccountSecurityEvent(challengeReplacementInfo, sUVInfo, oAuthInfo, workflowInfo, localAuthInfo);
        }
    }
}
