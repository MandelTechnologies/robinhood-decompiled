package com.robinhood.shared.common.singular;

import android.net.Uri;
import com.singular.sdk.SingularLinkParams;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: LinkParams.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"toLinkParams", "Lcom/robinhood/shared/common/singular/LinkParams;", "Lcom/singular/sdk/SingularLinkParams;", "DEEPLINK_KEY", "", "DEFERRED_DEEPLINK_KEY", "lib-singular_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.singular.LinkParamsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class LinkParams2 {
    private static final String DEEPLINK_KEY = "_dl";
    private static final String DEFERRED_DEEPLINK_KEY = "_ddl";

    public static final LinkParams toLinkParams(SingularLinkParams singularLinkParams) {
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(singularLinkParams, "<this>");
        if (singularLinkParams.isDeferred()) {
            String deeplink = singularLinkParams.getDeeplink();
            if (singularLinkParams.getDeeplink() == null) {
                mapEmptyMap = MapsKt.emptyMap();
            } else {
                String deeplink2 = singularLinkParams.getDeeplink();
                Intrinsics.checkNotNullExpressionValue(deeplink2, "getDeeplink(...)");
                Uri uri = Uri.parse(deeplink2);
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
                Set<String> set = queryParameterNames;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
                for (Object obj : set) {
                    String queryParameter = uri.getQueryParameter((String) obj);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    linkedHashMap.put(obj, queryParameter);
                }
                mapEmptyMap = linkedHashMap;
            }
            return new LinkParams(mapEmptyMap, deeplink);
        }
        Map urlParameters = singularLinkParams.getUrlParameters();
        if (urlParameters == null) {
            urlParameters = MapsKt.emptyMap();
        }
        String str = (String) urlParameters.get("_dl");
        if (str == null) {
            str = (String) urlParameters.get(DEFERRED_DEEPLINK_KEY);
        }
        return new LinkParams(urlParameters, str);
    }
}
