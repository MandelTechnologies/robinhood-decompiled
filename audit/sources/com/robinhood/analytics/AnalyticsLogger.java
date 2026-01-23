package com.robinhood.analytics;

import com.adjust.sdk.Constants;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.shared.legacy.models.AnalyticsRequest;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsLogger.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 r2\u00020\u0001:\u0002qrJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&Je\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0017Je\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0017Je\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J2\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H&J.\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030!H&J^\u0010\"\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u00032\b\u0010&\u001a\u0004\u0018\u00010\u00032\b\u0010'\u001a\u0004\u0018\u00010\u00032\b\u0010(\u001a\u0004\u0018\u00010\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003H&J\u001a\u0010+\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0003H&Jr\u0010.\u001a\u00020,2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u00032\b\u0010/\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010\u00032\b\u00101\u001a\u0004\u0018\u00010\u00032\b\u0010$\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0012H&J3\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u00105JT\u00106\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u00032\b\u00108\u001a\u0004\u0018\u00010\u00032\b\u00109\u001a\u0004\u0018\u00010\u00032\b\u0010:\u001a\u0004\u0018\u00010\u00032\b\u0010;\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H&JM\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00122\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010EJU\u0010F\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00122\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010GJM\u0010H\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00122\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010EJ\u001c\u0010I\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H&J\"\u0010J\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0003H&J \u0010K\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010@\u001a\u00020A2\u0006\u0010\u000b\u001a\u00020\u0012H&J\u0018\u0010L\u001a\u00020,2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H&J\u001c\u0010M\u001a\u00020\t2\b\u0010N\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u0003H&J0\u0010P\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u0012H&J \u0001\u0010S\u001a\u00020\t2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00032\u0006\u0010^\u001a\u00020\u00032\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0003H&J8\u0010a\u001a\u00020\t2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0003H&J\u0080\u0001\u0010b\u001a\u00020\t2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0003H&JB\u0010e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010f\u001a\u0004\u0018\u00010g2\b\u0010[\u001a\u0004\u0018\u00010\u00032\b\u0010X\u001a\u0004\u0018\u00010\u00032\b\u0010Y\u001a\u0004\u0018\u00010\u00032\u0006\u0010`\u001a\u00020\u0003H&J\u0010\u0010h\u001a\u00020\t2\u0006\u0010i\u001a\u00020\fH&J!\u0010j\u001a\u00020\t2\b\u0010k\u001a\u0004\u0018\u00010\u00032\b\u0010l\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010mJ\u0010\u0010n\u001a\u00020\t2\u0006\u0010o\u001a\u00020pH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006s"}, m3636d2 = {"Lcom/robinhood/analytics/AnalyticsLogger;", "", "currentTab", "", "getCurrentTab", "()Ljava/lang/String;", "setCurrentTab", "(Ljava/lang/String;)V", "logFieldTransition", "", "name", "timeSpent", "", "logButtonGroupTap", "groupTitle", "buttonTitle", "buttonDescription", "numShares", "", "entityId", "entityType", "tag", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logButtonGroupAppear", "logButtonGroupDismiss", "logUserAction", "userAction", "event", "logDeepLink", Constants.REFERRER, "rootUrl", "params", "", "logPushNotification", "uuid", "type", "title", CarResultComposable2.BODY, "expandedBodyOverride", "poBox", RhGcmListenerService.EXTRA_CATEGORY, "tapIdentifier", "buildSimpleTransitionEvent", "Lcom/robinhood/analytics/AnalyticsLogger$EventBuilder;", "desc", "buildTransitionEvent", "reason", "sourceScreenName", "messageType", "logTabGroup", "groupName", "tabName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "logNotificationStack", "numNotifications", "cardId", "loadId", "message", "deeplinkUri", "logNewsFeedContentAppear", "screenName", "contentType", "template", "newsUuid", "Ljava/util/UUID;", "rank", "collectionCategory", "collectionRank", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/String;Ljava/lang/Integer;)V", "logNewsFeedContentDisappear", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;IILjava/lang/String;Ljava/lang/Integer;)V", "logNewsFeedContentClick", "logError", "buildScreenTransitionEvent", "logNewsDisappear", "buildEvent", "onUserChanged", "username", "userSecret", "logComm", "intended", "sent", "logPlaidLinkEvent", "errorType", "errorCode", "errorMessage", "eventName", "institutionId", "institutionName", "institutionSearchQuery", "linkSessionId", "mfaType", "requestId", "plaidTimeStamp", "viewName", "sourceTag", "logPlaidLinkConnection", "logPlaidExitEvent", "exitStatus", "status", "logPlaidIavEventPostSdk", "throwable", "", "logPathfinderTimeToInteraction", "milliseconds", "onReferredCampaign", "referredCampaignJson", "engagementTime", "(Ljava/lang/String;Ljava/lang/Long;)V", "forwardWebRequest", "request", "Lcom/robinhood/shared/legacy/models/AnalyticsRequest;", "EventBuilder", "Companion", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface AnalyticsLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int MIN_DURATION_FOR_ANALYTICS_MS = 250;

    /* compiled from: AnalyticsLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/AnalyticsLogger$EventBuilder;", "", "appendEventData", "name", "", "value", "send", "", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface EventBuilder {
        EventBuilder appendEventData(String name, Object value);

        void send();
    }

    EventBuilder buildEvent(String category, String event);

    EventBuilder buildScreenTransitionEvent(String event, String screenName, String desc);

    EventBuilder buildSimpleTransitionEvent(String name, String desc);

    EventBuilder buildTransitionEvent(String event, String name, String desc, String reason, String source, String sourceScreenName, String messageType, String type2, String entityId, String tag, int timeSpent);

    void forwardWebRequest(AnalyticsRequest request);

    String getCurrentTab();

    void logButtonGroupAppear(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source);

    void logButtonGroupDismiss(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source);

    void logButtonGroupTap(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source);

    void logComm(String event, String type2, String source, int intended, int sent);

    void logDeepLink(String referrer, String rootUrl, Map<String, String> params);

    void logError(String event, String tag);

    void logFieldTransition(String name, long timeSpent);

    void logNewsDisappear(String screenName, UUID newsUuid, int timeSpent);

    void logNewsFeedContentAppear(String screenName, String contentType, String template, UUID newsUuid, int rank, String collectionCategory, Integer collectionRank);

    void logNewsFeedContentClick(String screenName, String contentType, String template, UUID newsUuid, int rank, String collectionCategory, Integer collectionRank);

    void logNewsFeedContentDisappear(String screenName, String contentType, String template, UUID newsUuid, int rank, int timeSpent, String collectionCategory, Integer collectionRank);

    void logNotificationStack(String event, int numNotifications, String type2, String cardId, String loadId, String message, String deeplinkUri, String entityId);

    void logPathfinderTimeToInteraction(long milliseconds);

    void logPlaidExitEvent(String errorType, String errorCode, String errorMessage, String exitStatus, String institutionId, String institutionName, String linkSessionId, String requestId, String status, String sourceTag);

    void logPlaidIavEventPostSdk(String event, Throwable throwable, String linkSessionId, String institutionId, String institutionName, String sourceTag);

    void logPlaidLinkConnection(String institutionId, String institutionName, String linkSessionId, String sourceTag);

    void logPlaidLinkEvent(String errorType, String errorCode, String errorMessage, String eventName, String institutionId, String institutionName, String institutionSearchQuery, String linkSessionId, String mfaType, String requestId, String plaidTimeStamp, String viewName, String sourceTag);

    void logPushNotification(String event, String uuid, String type2, String title, String body, String expandedBodyOverride, String poBox, String category, String tapIdentifier);

    void logTabGroup(String groupName, String tabName, Long timeSpent, String tag);

    void logUserAction(String userAction);

    void logUserAction(String userAction, String event, String buttonTitle, String tag);

    void onReferredCampaign(String referredCampaignJson, Long engagementTime);

    void onUserChanged(String username, String userSecret);

    void setCurrentTab(String str);

    /* compiled from: AnalyticsLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void logButtonGroupTap$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logButtonGroupTap");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 32) != 0) {
                str5 = null;
            }
            if ((i & 64) != 0) {
                str6 = null;
            }
            if ((i & 128) != 0) {
                str7 = null;
            }
            analyticsLogger.logButtonGroupTap(str, str2, str3, num, str4, str5, str6, str7);
        }

        public static /* synthetic */ void logButtonGroupAppear$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logButtonGroupAppear");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 32) != 0) {
                str5 = null;
            }
            if ((i & 64) != 0) {
                str6 = null;
            }
            if ((i & 128) != 0) {
                str7 = null;
            }
            analyticsLogger.logButtonGroupAppear(str, str2, str3, num, str4, str5, str6, str7);
        }

        public static /* synthetic */ void logButtonGroupDismiss$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logButtonGroupDismiss");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 32) != 0) {
                str5 = null;
            }
            if ((i & 64) != 0) {
                str6 = null;
            }
            if ((i & 128) != 0) {
                str7 = null;
            }
            analyticsLogger.logButtonGroupDismiss(str, str2, str3, num, str4, str5, str6, str7);
        }

        public static void logUserAction(AnalyticsLogger analyticsLogger, String userAction) {
            Intrinsics.checkNotNullParameter(userAction, "userAction");
            logUserAction$default(analyticsLogger, userAction, "completed", null, null, 12, null);
        }

        public static /* synthetic */ void logUserAction$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logUserAction");
            }
            if ((i & 2) != 0) {
                str2 = "completed";
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            analyticsLogger.logUserAction(str, str2, str3, str4);
        }

        public static /* synthetic */ void logPushNotification$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPushNotification");
            }
            analyticsLogger.logPushNotification(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : str9);
        }

        public static /* synthetic */ EventBuilder buildTransitionEvent$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildTransitionEvent");
            }
            if ((i2 & 1) != 0) {
                str = AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR;
            }
            return analyticsLogger.buildTransitionEvent(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i);
        }

        public static /* synthetic */ void logTabGroup$default(AnalyticsLogger analyticsLogger, String str, String str2, Long l, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logTabGroup");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            analyticsLogger.logTabGroup(str, str2, l, str3);
        }

        public static /* synthetic */ void logNewsFeedContentAppear$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, UUID uuid, int i, String str4, Integer num, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNewsFeedContentAppear");
            }
            if ((i2 & 32) != 0) {
                str4 = null;
            }
            if ((i2 & 64) != 0) {
                num = null;
            }
            analyticsLogger.logNewsFeedContentAppear(str, str2, str3, uuid, i, str4, num);
        }

        public static /* synthetic */ void logNewsFeedContentDisappear$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, UUID uuid, int i, int i2, String str4, Integer num, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNewsFeedContentDisappear");
            }
            if ((i3 & 64) != 0) {
                str4 = null;
            }
            if ((i3 & 128) != 0) {
                num = null;
            }
            analyticsLogger.logNewsFeedContentDisappear(str, str2, str3, uuid, i, i2, str4, num);
        }

        public static /* synthetic */ void logNewsFeedContentClick$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, UUID uuid, int i, String str4, Integer num, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNewsFeedContentClick");
            }
            if ((i2 & 32) != 0) {
                str4 = null;
            }
            if ((i2 & 64) != 0) {
                num = null;
            }
            analyticsLogger.logNewsFeedContentClick(str, str2, str3, uuid, i, str4, num);
        }

        public static /* synthetic */ void logError$default(AnalyticsLogger analyticsLogger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            analyticsLogger.logError(str, str2);
        }

        public static /* synthetic */ void logPlaidLinkEvent$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPlaidLinkEvent");
            }
            analyticsLogger.logPlaidLinkEvent((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13);
        }

        public static /* synthetic */ void logPlaidLinkConnection$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPlaidLinkConnection");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            analyticsLogger.logPlaidLinkConnection(str, str2, str3, str4);
        }

        public static /* synthetic */ void logPlaidExitEvent$default(AnalyticsLogger analyticsLogger, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPlaidExitEvent");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            if ((i & 32) != 0) {
                str6 = null;
            }
            if ((i & 64) != 0) {
                str7 = null;
            }
            if ((i & 128) != 0) {
                str8 = null;
            }
            if ((i & 256) != 0) {
                str9 = null;
            }
            if ((i & 512) != 0) {
                str10 = null;
            }
            analyticsLogger.logPlaidExitEvent(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        public static /* synthetic */ void logPlaidIavEventPostSdk$default(AnalyticsLogger analyticsLogger, String str, Throwable th, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPlaidIavEventPostSdk");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            analyticsLogger.logPlaidIavEventPostSdk(str, th, str2, str3, str4, str5);
        }
    }

    /* compiled from: AnalyticsLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/analytics/AnalyticsLogger$Companion;", "", "<init>", "()V", "MIN_DURATION_FOR_ANALYTICS_MS", "", "NoOp", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int MIN_DURATION_FOR_ANALYTICS_MS = 250;

        private Companion() {
        }

        /* compiled from: AnalyticsLogger.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001sB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016JY\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0019JY\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0019JY\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0019J,\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016J.\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050#H\u0016J\\\u0010$\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010-\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0005H\u0016Jp\u00100\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\b\u00101\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u00102\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u00010\u00052\b\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0014H\u0016J1\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u00107JT\u00108\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u00052\b\u0010;\u001a\u0004\u0018\u00010\u00052\b\u0010<\u001a\u0004\u0018\u00010\u00052\b\u0010=\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016JI\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010\u00052\b\u0010F\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010GJQ\u0010H\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010\u00052\b\u0010F\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010IJI\u0010J\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010\u00052\b\u0010F\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010GJ\u001a\u0010K\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010L\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010M\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010B\u001a\u00020C2\u0006\u0010\r\u001a\u00020\u0014H\u0016J\u0018\u0010N\u001a\u00020.2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0016J\u001c\u0010O\u001a\u00020\u000b2\b\u0010P\u001a\u0004\u0018\u00010\u00052\b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0016J0\u0010R\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u0014H\u0016J\u0088\u0001\u0010U\u001a\u00020\u000b2\b\u0010V\u001a\u0004\u0018\u00010\u00052\b\u0010W\u001a\u0004\u0018\u00010\u00052\b\u0010X\u001a\u0004\u0018\u00010\u00052\b\u0010Y\u001a\u0004\u0018\u00010\u00052\b\u0010Z\u001a\u0004\u0018\u00010\u00052\b\u0010[\u001a\u0004\u0018\u00010\u00052\b\u0010\\\u001a\u0004\u0018\u00010\u00052\b\u0010]\u001a\u0004\u0018\u00010\u00052\b\u0010^\u001a\u0004\u0018\u00010\u00052\b\u0010_\u001a\u0004\u0018\u00010\u00052\u0006\u0010`\u001a\u00020\u00052\b\u0010a\u001a\u0004\u0018\u00010\u00052\b\u0010b\u001a\u0004\u0018\u00010\u0005H\u0016J0\u0010c\u001a\u00020\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u00052\b\u0010[\u001a\u0004\u0018\u00010\u00052\b\u0010]\u001a\u0004\u0018\u00010\u00052\b\u0010b\u001a\u0004\u0018\u00010\u0005H\u0016Jl\u0010d\u001a\u00020\u000b2\b\u0010V\u001a\u0004\u0018\u00010\u00052\b\u0010W\u001a\u0004\u0018\u00010\u00052\b\u0010X\u001a\u0004\u0018\u00010\u00052\b\u0010e\u001a\u0004\u0018\u00010\u00052\b\u0010Z\u001a\u0004\u0018\u00010\u00052\b\u0010[\u001a\u0004\u0018\u00010\u00052\b\u0010]\u001a\u0004\u0018\u00010\u00052\b\u0010_\u001a\u0004\u0018\u00010\u00052\b\u0010f\u001a\u0004\u0018\u00010\u00052\b\u0010b\u001a\u0004\u0018\u00010\u0005H\u0016J@\u0010g\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00052\b\u0010h\u001a\u0004\u0018\u00010i2\b\u0010]\u001a\u0004\u0018\u00010\u00052\b\u0010Z\u001a\u0004\u0018\u00010\u00052\b\u0010[\u001a\u0004\u0018\u00010\u00052\u0006\u0010b\u001a\u00020\u0005H\u0016J\u0010\u0010j\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u000eH\u0016J!\u0010l\u001a\u00020\u000b2\b\u0010m\u001a\u0004\u0018\u00010\u00052\b\u0010n\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010oJ\u0010\u0010p\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020rH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006t"}, m3636d2 = {"Lcom/robinhood/analytics/AnalyticsLogger$Companion$NoOp;", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "()V", "currentTab", "", "getCurrentTab", "()Ljava/lang/String;", "setCurrentTab", "(Ljava/lang/String;)V", "logFieldTransition", "", "name", "timeSpent", "", "logButtonGroupTap", "groupTitle", "buttonTitle", "buttonDescription", "numShares", "", "entityId", "entityType", "tag", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logButtonGroupAppear", "logButtonGroupDismiss", "logUserAction", "userAction", "event", "logDeepLink", Constants.REFERRER, "rootUrl", "params", "", "logPushNotification", "uuid", "type", "title", CarResultComposable2.BODY, "expandedBodyOverride", "poBox", RhGcmListenerService.EXTRA_CATEGORY, "tapIdentifier", "buildSimpleTransitionEvent", "Lcom/robinhood/analytics/AnalyticsLogger$EventBuilder;", "desc", "buildTransitionEvent", "reason", "sourceScreenName", "messageType", "logTabGroup", "groupName", "tabName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "logNotificationStack", "numNotifications", "cardId", "loadId", "message", "deeplinkUri", "logNewsFeedContentAppear", "screenName", "contentType", "template", "newsUuid", "Ljava/util/UUID;", "rank", "collectionCategory", "collectionRank", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/String;Ljava/lang/Integer;)V", "logNewsFeedContentDisappear", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;IILjava/lang/String;Ljava/lang/Integer;)V", "logNewsFeedContentClick", "logError", "buildScreenTransitionEvent", "logNewsDisappear", "buildEvent", "onUserChanged", "username", "userSecret", "logComm", "intended", "sent", "logPlaidLinkEvent", "errorType", "errorCode", "errorMessage", "eventName", "institutionId", "institutionName", "institutionSearchQuery", "linkSessionId", "mfaType", "requestId", "plaidTimeStamp", "viewName", "sourceTag", "logPlaidLinkConnection", "logPlaidExitEvent", "exitStatus", "status", "logPlaidIavEventPostSdk", "throwable", "", "logPathfinderTimeToInteraction", "milliseconds", "onReferredCampaign", "referredCampaignJson", "engagementTime", "(Ljava/lang/String;Ljava/lang/Long;)V", "forwardWebRequest", "request", "Lcom/robinhood/shared/legacy/models/AnalyticsRequest;", "StubEventBuilder", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NoOp implements AnalyticsLogger {
            public static final NoOp INSTANCE = new NoOp();
            private static String currentTab;

            /* compiled from: AnalyticsLogger.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/analytics/AnalyticsLogger$Companion$NoOp$StubEventBuilder;", "Lcom/robinhood/analytics/AnalyticsLogger$EventBuilder;", "<init>", "()V", "appendEventData", "name", "", "value", "", "send", "", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class StubEventBuilder implements EventBuilder {
                @Override // com.robinhood.analytics.AnalyticsLogger.EventBuilder
                public EventBuilder appendEventData(String name, Object value) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    return this;
                }

                @Override // com.robinhood.analytics.AnalyticsLogger.EventBuilder
                public void send() {
                }
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void forwardWebRequest(AnalyticsRequest request) {
                Intrinsics.checkNotNullParameter(request, "request");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logButtonGroupAppear(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source) {
                Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logButtonGroupDismiss(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source) {
                Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logButtonGroupTap(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source) {
                Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logComm(String event, String type2, String source, int intended, int sent) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(source, "source");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logDeepLink(String referrer, String rootUrl, Map<String, String> params) {
                Intrinsics.checkNotNullParameter(rootUrl, "rootUrl");
                Intrinsics.checkNotNullParameter(params, "params");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logError(String event, String tag) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logFieldTransition(String name, long timeSpent) {
                Intrinsics.checkNotNullParameter(name, "name");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logNewsDisappear(String screenName, UUID newsUuid, int timeSpent) {
                Intrinsics.checkNotNullParameter(screenName, "screenName");
                Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logNewsFeedContentAppear(String screenName, String contentType, String template, UUID newsUuid, int rank, String collectionCategory, Integer collectionRank) {
                Intrinsics.checkNotNullParameter(screenName, "screenName");
                Intrinsics.checkNotNullParameter(contentType, "contentType");
                Intrinsics.checkNotNullParameter(template, "template");
                Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logNewsFeedContentClick(String screenName, String contentType, String template, UUID newsUuid, int rank, String collectionCategory, Integer collectionRank) {
                Intrinsics.checkNotNullParameter(screenName, "screenName");
                Intrinsics.checkNotNullParameter(contentType, "contentType");
                Intrinsics.checkNotNullParameter(template, "template");
                Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logNewsFeedContentDisappear(String screenName, String contentType, String template, UUID newsUuid, int rank, int timeSpent, String collectionCategory, Integer collectionRank) {
                Intrinsics.checkNotNullParameter(screenName, "screenName");
                Intrinsics.checkNotNullParameter(contentType, "contentType");
                Intrinsics.checkNotNullParameter(template, "template");
                Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logNotificationStack(String event, int numNotifications, String type2, String cardId, String loadId, String message, String deeplinkUri, String entityId) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logPathfinderTimeToInteraction(long milliseconds) {
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logPlaidExitEvent(String errorType, String errorCode, String errorMessage, String exitStatus, String institutionId, String institutionName, String linkSessionId, String requestId, String status, String sourceTag) {
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logPlaidIavEventPostSdk(String event, Throwable throwable, String linkSessionId, String institutionId, String institutionName, String sourceTag) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logPlaidLinkConnection(String institutionId, String institutionName, String linkSessionId, String sourceTag) {
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logPlaidLinkEvent(String errorType, String errorCode, String errorMessage, String eventName, String institutionId, String institutionName, String institutionSearchQuery, String linkSessionId, String mfaType, String requestId, String plaidTimeStamp, String viewName, String sourceTag) {
                Intrinsics.checkNotNullParameter(plaidTimeStamp, "plaidTimeStamp");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logPushNotification(String event, String uuid, String type2, String title, String body, String expandedBodyOverride, String poBox, String category, String tapIdentifier) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(type2, "type");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logTabGroup(String groupName, String tabName, Long timeSpent, String tag) {
                Intrinsics.checkNotNullParameter(groupName, "groupName");
                Intrinsics.checkNotNullParameter(tabName, "tabName");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logUserAction(String userAction, String event, String buttonTitle, String tag) {
                Intrinsics.checkNotNullParameter(userAction, "userAction");
                Intrinsics.checkNotNullParameter(event, "event");
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void onReferredCampaign(String referredCampaignJson, Long engagementTime) {
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void onUserChanged(String username, String userSecret) {
            }

            private NoOp() {
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void logUserAction(String str) {
                DefaultImpls.logUserAction(this, str);
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public String getCurrentTab() {
                return currentTab;
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public void setCurrentTab(String str) {
                currentTab = str;
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public EventBuilder buildSimpleTransitionEvent(String name, String desc) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new StubEventBuilder();
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public EventBuilder buildTransitionEvent(String event, String name, String desc, String reason, String source, String sourceScreenName, String messageType, String type2, String entityId, String tag, int timeSpent) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(name, "name");
                return new StubEventBuilder();
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public EventBuilder buildScreenTransitionEvent(String event, String screenName, String desc) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(screenName, "screenName");
                return new StubEventBuilder();
            }

            @Override // com.robinhood.analytics.AnalyticsLogger
            public EventBuilder buildEvent(String category, String event) {
                Intrinsics.checkNotNullParameter(category, "category");
                Intrinsics.checkNotNullParameter(event, "event");
                return new StubEventBuilder();
            }
        }
    }
}
