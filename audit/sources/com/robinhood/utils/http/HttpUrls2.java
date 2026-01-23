package com.robinhood.utils.http;

import com.robinhood.android.deeplink.DeepLinkPath;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: HttpUrls.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\"\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, m3636d2 = {"robinhoodDomains", "", "", "isRobinhoodDomain", "", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;)Z", "isRobinhoodDotCom", "hasTrailingSlash", "getHasTrailingSlash", "lib-utils-http"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.http.HttpUrlsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class HttpUrls2 {
    private static final Set<String> robinhoodDomains = SetsKt.setOf((Object[]) new String[]{DeepLinkPath.URL_BASE, "rhapollo.net", "rhinternal.net"});

    public static final boolean isRobinhoodDomain(HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        return CollectionsKt.contains(robinhoodDomains, httpUrl.topPrivateDomain());
    }

    public static final boolean isRobinhoodDotCom(HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        return StringsKt.equals(httpUrl.getHost(), DeepLinkPath.URL_BASE, true) || StringsKt.endsWith(httpUrl.getHost(), ".robinhood.com", true);
    }

    public static final boolean getHasTrailingSlash(HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        return StringsKt.last(httpUrl.encodedPath()) == '/';
    }
}
