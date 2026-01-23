package com.plaid.internal;

import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventViewName;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.x2 */
/* loaded from: classes16.dex */
public final class C7249x2 {
    /* renamed from: a */
    public static LinkEventMetadata m1653a(String errorCode, String errorMessage, String errorType, String exitStatus, String institutionId, String institutionName, String institutionSearchQuery, String issueId, String linkSessionId, String mfaType, String requestId, String timestamp, String viewName, String brandName, String selection, String metadataJson) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(exitStatus, "exitStatus");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(institutionSearchQuery, "institutionSearchQuery");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(mfaType, "mfaType");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        return new LinkEventMetadata(brandName, errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, null, null, issueId, linkSessionId, mfaType, requestId, selection, timestamp, LinkEventViewName.INSTANCE.fromString$link_sdk_release(viewName), metadataJson, null, null, null, null, 3932928, null);
    }
}
