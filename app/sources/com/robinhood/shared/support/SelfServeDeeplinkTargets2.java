package com.robinhood.shared.support;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitives;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: SelfServeDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t*\u00020\u000b¨\u0006\f"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "requireAuthentication", "", "(Lcom/robinhood/android/deeplink/DeeplinkContext;Z)[Landroid/content/Intent;", "getQueryAsMap", "", "", "Landroid/net/Uri;", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.SelfServeDeeplinkTargetsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelfServeDeeplinkTargets2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2, boolean z) {
        Map mutableMap = MapsKt.toMutableMap(getQueryAsMap(deeplinkTarget2.getUri()));
        String str = (String) mutableMap.remove("flow_id");
        String str2 = (String) mutableMap.remove("version_id");
        if (str == null && str2 == null) {
            return new Intent[0];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mutableMap.size()));
        for (Map.Entry entry : mutableMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), JsonPrimitives.toJsonPrimitive((String) entry.getValue()));
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new ContactSupportFragmentKey.Sassy(str, str2, linkedHashMap), false, false, false, null, false, true, false, false, z, null, false, 7028, null)};
    }

    public static final Map<String, String> getQueryAsMap(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (Object obj : set) {
            String queryParameter = uri.getQueryParameter((String) obj);
            Intrinsics.checkNotNull(queryParameter);
            linkedHashMap.put(obj, queryParameter);
        }
        return linkedHashMap;
    }
}
