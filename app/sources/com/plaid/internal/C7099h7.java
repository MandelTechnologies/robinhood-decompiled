package com.plaid.internal;

import android.webkit.WebResourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.h7 */
/* loaded from: classes16.dex */
public final class C7099h7 {
    /* renamed from: a */
    public static final String m1524a(WebResourceError webResourceError) {
        Intrinsics.checkNotNullParameter(webResourceError, "<this>");
        return "WebResourceError { Error Code: " + webResourceError.getErrorCode() + " ; Description: " + ((Object) webResourceError.getDescription()) + " }";
    }
}
