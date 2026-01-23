package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.y6 */
/* loaded from: classes16.dex */
public final class C7262y6 {
    /* renamed from: a */
    public static final LinkEvent m1670a(Common$SDKEvent common$SDKEvent) {
        LinkEventMetadata metadata;
        Intrinsics.checkNotNullParameter(common$SDKEvent, "<this>");
        if (common$SDKEvent.hasMetadata()) {
            String brandName = common$SDKEvent.getMetadata().getBrandName();
            String errorCode = common$SDKEvent.getMetadata().getErrorCode();
            String errorMessage = common$SDKEvent.getMetadata().getErrorMessage();
            String errorType = common$SDKEvent.getMetadata().getErrorType();
            String exitStatus = common$SDKEvent.getMetadata().getExitStatus();
            String institutionId = common$SDKEvent.getMetadata().getInstitutionId();
            String institutionName = common$SDKEvent.getMetadata().getInstitutionName();
            String institutionSearchQuery = common$SDKEvent.getMetadata().getInstitutionSearchQuery();
            String linkSessionId = common$SDKEvent.getMetadata().getLinkSessionId();
            String mfaType = common$SDKEvent.getMetadata().getMfaType();
            String requestId = common$SDKEvent.getMetadata().getRequestId();
            String selection = common$SDKEvent.getMetadata().getSelection();
            String timestamp = common$SDKEvent.getMetadata().getTimestamp();
            String viewName = common$SDKEvent.getMetadata().getViewName();
            Intrinsics.checkNotNull(errorCode);
            Intrinsics.checkNotNull(errorMessage);
            Intrinsics.checkNotNull(errorType);
            Intrinsics.checkNotNull(exitStatus);
            Intrinsics.checkNotNull(institutionId);
            Intrinsics.checkNotNull(institutionName);
            Intrinsics.checkNotNull(institutionSearchQuery);
            Intrinsics.checkNotNull(linkSessionId);
            Intrinsics.checkNotNull(mfaType);
            Intrinsics.checkNotNull(requestId);
            Intrinsics.checkNotNull(timestamp);
            Intrinsics.checkNotNull(viewName);
            Intrinsics.checkNotNull(brandName);
            Intrinsics.checkNotNull(selection);
            metadata = C7249x2.m1653a((32896 & 1) != 0 ? "" : errorCode, (32896 & 2) != 0 ? "" : errorMessage, (32896 & 4) != 0 ? "" : errorType, (32896 & 8) != 0 ? "" : exitStatus, (32896 & 16) != 0 ? "" : institutionId, (32896 & 32) != 0 ? "" : institutionName, (32896 & 64) != 0 ? "" : institutionSearchQuery, "", linkSessionId, (32896 & 512) != 0 ? "" : mfaType, (32896 & 1024) != 0 ? "" : requestId, timestamp, (32896 & 4096) != 0 ? "" : viewName, brandName, (32896 & 16384) != 0 ? "" : selection, "");
        } else {
            String brandName2 = common$SDKEvent.getMetadata().getBrandName();
            Intrinsics.checkNotNullExpressionValue(brandName2, "getBrandName(...)");
            metadata = C7249x2.m1653a((32896 & 1) != 0 ? "" : null, (32896 & 2) != 0 ? "" : null, (32896 & 4) != 0 ? "" : null, (32896 & 8) != 0 ? "" : null, (32896 & 16) != 0 ? "" : null, (32896 & 32) != 0 ? "" : null, (32896 & 64) != 0 ? "" : null, "", "", (32896 & 512) != 0 ? "" : null, (32896 & 1024) != 0 ? "" : null, "", (32896 & 4096) != 0 ? "" : null, brandName2, (32896 & 16384) != 0 ? "" : null, "");
        }
        String eventName = common$SDKEvent.getEventName();
        Intrinsics.checkNotNullExpressionValue(eventName, "getEventName(...)");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), metadata);
    }

    /* renamed from: a */
    public static final LinkEvent m1669a(Channel$Message.SDKEvent sDKEvent) {
        Intrinsics.checkNotNullParameter(sDKEvent, "<this>");
        String brandName = sDKEvent.getMetadata().getBrandName();
        String errorCode = sDKEvent.getMetadata().getErrorCode();
        String errorMessage = sDKEvent.getMetadata().getErrorMessage();
        String errorType = sDKEvent.getMetadata().getErrorType();
        String exitStatus = sDKEvent.getMetadata().getExitStatus();
        String institutionId = sDKEvent.getMetadata().getInstitutionId();
        String institutionName = sDKEvent.getMetadata().getInstitutionName();
        String institutionSearchQuery = sDKEvent.getMetadata().getInstitutionSearchQuery();
        String issueId = sDKEvent.getMetadata().getIssueId();
        String linkSessionId = sDKEvent.getMetadata().getLinkSessionId();
        String mfaType = sDKEvent.getMetadata().getMfaType();
        String requestId = sDKEvent.getMetadata().getRequestId();
        String selection = sDKEvent.getMetadata().getSelection();
        String timestamp = sDKEvent.getMetadata().getTimestamp();
        String viewName = sDKEvent.getMetadata().getViewName();
        String metadataJson = sDKEvent.getMetadataJson();
        Intrinsics.checkNotNull(errorCode);
        Intrinsics.checkNotNull(errorMessage);
        Intrinsics.checkNotNull(errorType);
        Intrinsics.checkNotNull(exitStatus);
        Intrinsics.checkNotNull(institutionId);
        Intrinsics.checkNotNull(institutionName);
        Intrinsics.checkNotNull(institutionSearchQuery);
        Intrinsics.checkNotNull(issueId);
        Intrinsics.checkNotNull(linkSessionId);
        Intrinsics.checkNotNull(mfaType);
        Intrinsics.checkNotNull(requestId);
        Intrinsics.checkNotNull(timestamp);
        Intrinsics.checkNotNull(viewName);
        Intrinsics.checkNotNull(brandName);
        Intrinsics.checkNotNull(selection);
        Intrinsics.checkNotNull(metadataJson);
        LinkEventMetadata metadata = C7249x2.m1653a(errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueId, linkSessionId, mfaType, requestId, timestamp, viewName, brandName, selection, metadataJson);
        String eventName = sDKEvent.getEventName();
        Intrinsics.checkNotNullExpressionValue(eventName, "getEventName(...)");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), metadata);
    }
}
