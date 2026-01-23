package com.robinhood.utils.extensions;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: HttpUrls.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"lastNonEmptyPathSegment", "", "Lokhttp3/HttpUrl;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.HttpUrlsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class HttpUrls {
    public static final String lastNonEmptyPathSegment(HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        List<String> listPathSegments = httpUrl.pathSegments();
        ListIterator<String> listIterator = listPathSegments.listIterator(listPathSegments.size());
        while (listIterator.hasPrevious()) {
            String strPrevious = listIterator.previous();
            if (strPrevious.length() > 0) {
                return strPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }
}
