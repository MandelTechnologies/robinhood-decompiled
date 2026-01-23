package com.robinhood.shared.user.lib.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.search.contracts.SnacksWebViewFragmentKey;
import com.robinhood.shared.common.contracts.RhEmbeddedWebViewFragmentKey;
import com.robinhood.shared.common.contracts.WebDeeplinkIntentKey;
import com.robinhood.shared.home.contracts.BlockedExternalDeeplinkIntentKey;
import com.robinhood.shared.home.contracts.BlockedExternalLoggedOutDeeplinkIntentKey;
import com.robinhood.shared.support.contracts.HelpCenterWebViewFragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.http.HttpUrls2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okhttp3.HttpUrl;

/* compiled from: WebDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/user/lib/deeplink/targets/WebDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "getInAppOverride", "inAppOverride", "", "url", "Lokhttp3/HttpUrl;", "(Ljava/lang/String;Lcom/robinhood/android/deeplink/DeeplinkContext;Lokhttp3/HttpUrl;)[Landroid/content/Intent;", "isDeeplinkSafeToOpen", "", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WebDeeplinkTarget extends DeeplinkTarget4 {
    public static final WebDeeplinkTarget INSTANCE = new WebDeeplinkTarget();

    private WebDeeplinkTarget() {
        super("web", false, false, false, false, false, null, 110, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        IntentKey blockedExternalLoggedOutDeeplinkIntentKey;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("url");
        HttpUrl httpUrl = queryParameter != null ? HttpUrl.INSTANCE.parse(queryParameter) : null;
        if (httpUrl == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Invalid URL: " + queryParameter), false, null, 4, null);
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null)};
        }
        if (!isDeeplinkSafeToOpen(deeplinkContext, httpUrl)) {
            Navigator navigator = deeplinkContext.getNavigator();
            Context context = deeplinkContext.getContext();
            if (deeplinkContext.isLoggedIn()) {
                blockedExternalLoggedOutDeeplinkIntentKey = new BlockedExternalDeeplinkIntentKey(httpUrl.getUrl());
            } else {
                blockedExternalLoggedOutDeeplinkIntentKey = new BlockedExternalLoggedOutDeeplinkIntentKey(httpUrl.getUrl());
            }
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, blockedExternalLoggedOutDeeplinkIntentKey, null, false, 12, null)};
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("in_app_override");
        boolean zIsHelpCenterUrl = StringsKt.isHelpCenterUrl(queryParameter);
        boolean zIsSnacksUrl = StringsKt.isSnacksUrl(queryParameter);
        boolean zIsLearnUrl = StringsKt.isLearnUrl(queryParameter);
        if (Boolean.parseBoolean(deeplinkContext.getUri().getQueryParameter("force_external"))) {
            return new Intent[]{new Intent("android.intent.action.VIEW", Uri.parse(httpUrl.getUrl()))};
        }
        if (queryParameter2 != null && !kotlin.text.StringsKt.isBlank(queryParameter2)) {
            return getInAppOverride(queryParameter2, deeplinkContext, httpUrl);
        }
        if (zIsHelpCenterUrl) {
            String queryParameter3 = deeplinkContext.getUri().getQueryParameter("use_design_system");
            if (queryParameter3 == null) {
                queryParameter3 = "true";
            }
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HelpCenterWebViewFragmentKey(queryParameter), false, false, false, null, false, Boolean.parseBoolean(queryParameter3), false, true, false, null, false, 6260, null)};
        }
        if (zIsSnacksUrl) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new SnacksWebViewFragmentKey(queryParameter), false, false, false, null, false, true, false, true, false, null, false, 6260, null)};
        }
        if (zIsLearnUrl) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new RhEmbeddedWebViewFragmentKey(queryParameter), false, false, false, null, false, true, false, true, false, null, false, 6260, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new WebDeeplinkIntentKey(httpUrl.getUrl()), null, false, 12, null)};
    }

    private final Intent[] getInAppOverride(String inAppOverride, DeeplinkTarget2 deeplinkContext, HttpUrl url) {
        Set<String> queryParameterNames = deeplinkContext.getUri().getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        Iterator<T> it = set.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String queryParameter = deeplinkContext.getUri().getQueryParameter((String) next);
            if (queryParameter != null) {
                str = queryParameter;
            }
            linkedHashMap.put(next, str);
        }
        Set<String> queryParameterNames2 = Uri.parse(inAppOverride).getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames2, "getQueryParameterNames(...)");
        Set<String> set2 = queryParameterNames2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
        for (Object obj : set2) {
            String queryParameter2 = Uri.parse(inAppOverride).getQueryParameter((String) obj);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            linkedHashMap2.put(obj, queryParameter2);
        }
        Map mapPlus = MapsKt.plus(linkedHashMap, linkedHashMap2);
        Uri.Builder builderAuthority = new Uri.Builder().scheme(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD()).authority(inAppOverride);
        for (Map.Entry entry : mapPlus.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (!Intrinsics.areEqual(str2, "in_app_override") && !Intrinsics.areEqual(str2, "url")) {
                builderAuthority.appendQueryParameter(str2, str3);
            }
        }
        Uri uriBuild = builderAuthority.build();
        Intrinsics.checkNotNull(uriBuild);
        return deeplinkContext.isSupported(uriBuild) ? deeplinkContext.redirectGetIntents(uriBuild) : new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new WebDeeplinkIntentKey(String.valueOf(url)), null, false, 12, null)};
    }

    private final boolean isDeeplinkSafeToOpen(DeeplinkTarget2 deeplinkContext, HttpUrl url) {
        if (!Intrinsics.areEqual(deeplinkContext.getDeepLinkOrigin(), DeepLinkOrigin.External.INSTANCE)) {
            return true;
        }
        boolean zIsRobinhoodDomain = HttpUrls2.isRobinhoodDomain(url);
        if (!zIsRobinhoodDomain) {
            deeplinkContext.getEventLogger().logDeeplinkBlocked(url);
            CrashReporter.INSTANCE.reportNonFatal(new IllegalArgumentException("Blocked unsafe external web deeplink: " + url), false, new EventMetadata(SentryTeam.MOBILE_PLATFORM, null, MapsKt.mapOf(Tuples4.m3642to("host", url.getHost()), Tuples4.m3642to("url", url)), 2, null));
        }
        return zIsRobinhoodDomain;
    }
}
