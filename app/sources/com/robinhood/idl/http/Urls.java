package com.robinhood.idl.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: Urls.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, m3636d2 = {"ensureTrailingSlash", "Lokhttp3/HttpUrl;", "requireResolve", "link", "", "requireTrailingResolve", "core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.http.UrlsKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class Urls {
    public static final HttpUrl ensureTrailingSlash(HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        return httpUrl.newBuilder().addPathSegment("").build();
    }

    public static final HttpUrl requireResolve(HttpUrl httpUrl, String link) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(link, "link");
        HttpUrl httpUrlResolve = httpUrl.resolve(link);
        if (httpUrlResolve != null) {
            return httpUrlResolve;
        }
        throw new IllegalArgumentException(("`" + link + "` could not be resolved from `" + httpUrl + "`").toString());
    }

    public static final HttpUrl requireTrailingResolve(HttpUrl httpUrl, String link) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(link, "link");
        return ensureTrailingSlash(requireResolve(ensureTrailingSlash(httpUrl), link));
    }
}
