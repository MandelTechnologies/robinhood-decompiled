package com.robinhood.android.lib.webview.extensions;

import android.net.Uri;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Uris.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m3636d2 = {"toDeepLink", "Landroid/net/Uri;", "APPLINK_HOST", "", "lib-webview_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.webview.extensions.UrisKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Uris3 {
    private static final String APPLINK_HOST = "applink.robinhood.com";

    public static final Uri toDeepLink(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!Intrinsics.areEqual(uri.getHost(), "applink.robinhood.com")) {
            return uri;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        int i = 0;
        Uri.Builder builderAuthority = new Uri.Builder().scheme(DeeplinkConfig.INSTANCE.getScheme()).authority((String) CollectionsKt.getOrNull(pathSegments, 0));
        List<String> pathSegments2 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        for (Object obj : pathSegments2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if (i > 0) {
                builderAuthority.appendPath(str);
            }
            i = i2;
        }
        Uri uriBuild = builderAuthority.encodedQuery(uri.getEncodedQuery()).build();
        Intrinsics.checkNotNull(uriBuild);
        return uriBuild;
    }
}
