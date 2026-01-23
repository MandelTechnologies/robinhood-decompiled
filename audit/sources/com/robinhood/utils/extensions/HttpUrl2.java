package com.robinhood.utils.extensions;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: HttpUrl.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"toHttpUrl", "Lokhttp3/HttpUrl;", "Landroid/net/Uri;", "toAndroidUri", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.HttpUrlKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class HttpUrl2 {
    public static final HttpUrl toHttpUrl(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return companion.get(string2);
    }

    public static final Uri toAndroidUri(HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Uri uri = Uri.parse(httpUrl.getUrl());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }
}
