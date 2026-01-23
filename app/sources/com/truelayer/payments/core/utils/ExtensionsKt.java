package com.truelayer.payments.core.utils;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0005"}, m3636d2 = {"extractTrueLayerRedirectParams", "", "", "Landroid/net/Uri;", "toBearerToken", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ExtensionsKt {
    public static final String toBearerToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.startsWith(str, "Bearer ", true)) {
            return str;
        }
        return "Bearer " + str;
    }

    public static final Map<String, String> extractTrueLayerRedirectParams(Uri uri) {
        if (uri == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                Intrinsics.checkNotNull(str);
                Intrinsics.checkNotNull(queryParameter);
                linkedHashMap.put(str, queryParameter);
            }
        }
        return linkedHashMap;
    }
}
