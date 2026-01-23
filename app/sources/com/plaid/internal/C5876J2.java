package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.J2 */
/* loaded from: classes16.dex */
public final class C5876J2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static LinkExit m1228b(Throwable th, String str) {
        return new LinkExit(m1220a(th, str), null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public static String m1227a(String str, String str2, String str3) {
        return "{\"error_code\":\"" + str + "\",\"error_message\":\"" + str2 + "\",\"display_message\":\"" + str3 + "\"}";
    }

    /* renamed from: a */
    public static LinkError m1220a(Throwable th, String str) {
        if (th instanceof C7267z2) {
            C5953R5.a.m1301a(C5953R5.f1671a, th);
            String str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists";
            if (str != null && str.length() != 0) {
                str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists\n" + str;
            }
            return LinkError.INSTANCE.fromException$link_sdk_release(new LinkException(str2));
        }
        return LinkError.INSTANCE.fromException$link_sdk_release(th);
    }

    /* renamed from: a */
    public static LinkExitMetadata m1222a(int i, String str) {
        if ((i & 8) != 0) {
            str = null;
        }
        return new LinkExitMetadata(null, null, null, str, null);
    }

    /* renamed from: a */
    public static LinkSuccess m1223a(String publicToken, LinkSuccessMetadata metadata) {
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }

    /* renamed from: a */
    public static LinkSuccess m1224a(LinkedHashMap linkData, List accounts2) {
        Intrinsics.checkNotNullParameter(linkData, "linkData");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        return LinkSuccess.INSTANCE.fromMap$link_sdk_release(linkData, accounts2);
    }

    /* renamed from: a */
    public static LinkSuccessMetadata m1225a(ArrayList accounts2, String str, String str2, String linkSessionId, String metadataJson) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        return new LinkSuccessMetadata((str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : new LinkInstitution(str, str2), accounts2, linkSessionId, metadataJson);
    }

    /* renamed from: a */
    public static LinkAccount m1219a(C5803B1 account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return LinkAccount.INSTANCE.fromResponse$link_sdk_release(account);
    }

    /* renamed from: a */
    public static String m1226a(String linkSessionId, String requestId) {
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return "{\"link_session_id\":\"" + linkSessionId + "\",\"request_id\":\"" + requestId + "\"}";
    }
}
