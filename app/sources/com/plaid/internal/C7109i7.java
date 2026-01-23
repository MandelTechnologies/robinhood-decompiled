package com.plaid.internal;

import android.webkit.WebResourceResponse;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.i7 */
/* loaded from: classes16.dex */
public final class C7109i7 {
    /* renamed from: a */
    public static final String m1532a(WebResourceResponse webResourceResponse) {
        Intrinsics.checkNotNullParameter(webResourceResponse, "<this>");
        return "WebResourceResponse{, MimeType='" + webResourceResponse.getMimeType() + "', Encoding='" + webResourceResponse.getEncoding() + "', StatusCode=" + webResourceResponse.getStatusCode() + ", ReasonPhrase='" + webResourceResponse.getReasonPhrase() + "', ResponseHeaders=" + webResourceResponse.getResponseHeaders() + ", data=" + webResourceResponse.getData() + "}";
    }
}
