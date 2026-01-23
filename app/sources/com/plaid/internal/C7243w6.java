package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.w6 */
/* loaded from: classes16.dex */
public final class C7243w6 {
    /* renamed from: a */
    public static final AbstractC5919N6 m1637a(Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
        Intrinsics.checkNotNullParameter(requestSilentNetworkAuth, "<this>");
        String verificationId = requestSilentNetworkAuth.getVerificationId();
        if (verificationId != null && verificationId.length() != 0) {
            if (requestSilentNetworkAuth.hasTwilio()) {
                String redirectUri = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                if (redirectUri == null || redirectUri.length() == 0) {
                    return null;
                }
                String verificationId2 = requestSilentNetworkAuth.getVerificationId();
                Intrinsics.checkNotNullExpressionValue(verificationId2, "getVerificationId(...)");
                String redirectUri2 = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                Intrinsics.checkNotNullExpressionValue(redirectUri2, "getRedirectUri(...)");
                return new C6036a7(verificationId2, redirectUri2);
            }
            if (requestSilentNetworkAuth.hasProve()) {
                String verificationId3 = requestSilentNetworkAuth.getVerificationId();
                Intrinsics.checkNotNullExpressionValue(verificationId3, "getVerificationId(...)");
                return new C7108i6(verificationId3);
            }
        }
        return null;
    }
}
