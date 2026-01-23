package com.robinhood.android.iav.p154ui;

import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventViewName;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidLinkEventListener.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011J\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidLinkEventListener;", "Lkotlin/Function1;", "Lcom/plaid/link/event/LinkEvent;", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;)V", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "setIavSource", "(Lcom/robinhood/shared/transfers/contracts/context/IavSource;)V", "sessionId", "Ljava/util/UUID;", "onNewSession", "newSessionId", "invoke", "linkEvent", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PlaidLinkEventListener implements Function1<LinkEvent, Unit> {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final EventLogger eventLogger;
    private IavSource iavSource;
    private UUID sessionId;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
        invoke2(linkEvent);
        return Unit.INSTANCE;
    }

    public PlaidLinkEventListener(AnalyticsLogger analytics, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.analytics = analytics;
        this.eventLogger = eventLogger;
    }

    public final IavSource getIavSource() {
        return this.iavSource;
    }

    public final void setIavSource(IavSource iavSource) {
        this.iavSource = iavSource;
    }

    public final void onNewSession(UUID newSessionId) {
        Intrinsics.checkNotNullParameter(newSessionId, "newSessionId");
        this.sessionId = newSessionId;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(LinkEvent linkEvent) {
        String analyticsTag;
        String jsonValue;
        String string2;
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        EventLogger eventLogger = this.eventLogger;
        UUID uuid = this.sessionId;
        IAVContext iAVContext = new IAVContext(null, (uuid == null || (string2 = uuid.toString()) == null) ? "" : string2, null, null, 13, null);
        String errorType = linkEvent.getMetadata().getErrorType();
        String str = errorType == null ? "" : errorType;
        String errorCode = linkEvent.getMetadata().getErrorCode();
        String str2 = errorCode == null ? "" : errorCode;
        String errorMessage = linkEvent.getMetadata().getErrorMessage();
        String str3 = errorMessage == null ? "" : errorMessage;
        PlaidEventData.Event event = PlaidEventData.Event.ON_EVENT;
        String json = linkEvent.getEventName().getJson();
        String institutionId = linkEvent.getMetadata().getInstitutionId();
        String str4 = institutionId == null ? "" : institutionId;
        String institutionName = linkEvent.getMetadata().getInstitutionName();
        String str5 = institutionName == null ? "" : institutionName;
        String institutionSearchQuery = linkEvent.getMetadata().getInstitutionSearchQuery();
        String str6 = institutionSearchQuery == null ? "" : institutionSearchQuery;
        String linkSessionId = linkEvent.getMetadata().getLinkSessionId();
        String mfaType = linkEvent.getMetadata().getMfaType();
        String str7 = mfaType == null ? "" : mfaType;
        String requestId = linkEvent.getMetadata().getRequestId();
        String str8 = requestId == null ? "" : requestId;
        String timestamp = linkEvent.getMetadata().getTimestamp();
        LinkEventViewName viewName = linkEvent.getMetadata().getViewName();
        String str9 = (viewName == null || (jsonValue = viewName.getJsonValue()) == null) ? "" : jsonValue;
        IavSource iavSource = this.iavSource;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.PLAID_IAV, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.IAV, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PlaidEventData(event, json, str2, str3, str, null, null, str4, str5, str6, linkSessionId, str7, str8, timestamp, str9, null, null, (iavSource == null || (analyticsTag = iavSource.getAnalyticsTag()) == null) ? "" : analyticsTag, null, null, 884832, null), iAVContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -49153, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
        AnalyticsLogger analyticsLogger = this.analytics;
        String errorType2 = linkEvent.getMetadata().getErrorType();
        String errorCode2 = linkEvent.getMetadata().getErrorCode();
        String errorMessage2 = linkEvent.getMetadata().getErrorMessage();
        String json2 = linkEvent.getEventName().getJson();
        String institutionId2 = linkEvent.getMetadata().getInstitutionId();
        String institutionName2 = linkEvent.getMetadata().getInstitutionName();
        String institutionSearchQuery2 = linkEvent.getMetadata().getInstitutionSearchQuery();
        String linkSessionId2 = linkEvent.getMetadata().getLinkSessionId();
        String mfaType2 = linkEvent.getMetadata().getMfaType();
        String requestId2 = linkEvent.getMetadata().getRequestId();
        String timestamp2 = linkEvent.getMetadata().getTimestamp();
        LinkEventViewName viewName2 = linkEvent.getMetadata().getViewName();
        String jsonValue2 = viewName2 != null ? viewName2.getJsonValue() : null;
        IavSource iavSource2 = this.iavSource;
        analyticsLogger.logPlaidLinkEvent(errorType2, errorCode2, errorMessage2, json2, institutionId2, institutionName2, institutionSearchQuery2, linkSessionId2, mfaType2, requestId2, timestamp2, jsonValue2, iavSource2 != null ? iavSource2.getAnalyticsTag() : null);
    }
}
