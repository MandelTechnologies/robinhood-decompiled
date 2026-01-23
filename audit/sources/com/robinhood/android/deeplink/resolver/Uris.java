package com.robinhood.android.deeplink.resolver;

import android.content.UriMatcher;
import android.net.Uri;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Uris.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\b*\u00020\fH\u0000\u001a\f\u0010\r\u001a\u00020\b*\u00020\fH\u0000\u001a\f\u0010\u000e\u001a\u00020\b*\u00020\fH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"nonRootSinglePathSegments", "", "", "updateMatcherFromPath", "", "Landroid/content/UriMatcher;", "path", "isAppLink", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "isRoot", "Landroid/net/Uri;", "shouldRerouteToPdfRenderer", "isWallet", "lib-deeplink-resolver_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.resolver.UrisKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Uris {
    private static final List<String> nonRootSinglePathSegments = CollectionsKt.listOf((Object[]) new String[]{DeepLinkPath.RETIREMENT_WAITLIST.getPath(), DeepLinkPath.GOLD_MONDAY.getPath(), DeepLinkPath.GOLD_SIGN_UP_MAY_2025.getPath()});

    public static final void updateMatcherFromPath(UriMatcher uriMatcher, String path, boolean z, int i) {
        Intrinsics.checkNotNullParameter(uriMatcher, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        String str = "applink/" + path;
        uriMatcher.addURI(path, null, i);
        uriMatcher.addURI(DeepLinkPath.URL_BASE, str, i);
        uriMatcher.addURI(DeepLinkPath.SUBDOMAIN_URL_BASE, path, i);
        uriMatcher.addURI(DeepLinkPath.SUBDOMAIN_URL_BASE, "u/" + path, i);
        uriMatcher.addURI(DeepLinkPath.ALTERNATE_URL_BASE, str, i);
        if (z) {
            uriMatcher.addURI(DeepLinkPath.URL_BASE, path, i);
            uriMatcher.addURI(DeepLinkPath.ALTERNATE_URL_BASE, path, i);
            uriMatcher.addURI(DeepLinkPath.JOINDOT_URL_BASE, path, i);
            uriMatcher.addURI(DeepLinkPath.GIFT_URL_BASE, path, i);
            uriMatcher.addURI(DeepLinkPath.DEPOSIT_URL_BASE, path, i);
            uriMatcher.addURI(DeepLinkPath.SHARE_URL_BASE, path, i);
        }
    }

    public static final boolean isRoot(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (Intrinsics.areEqual(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), uri.getScheme())) {
            String authority = uri.getAuthority();
            return authority == null || authority.length() == 0;
        }
        if (Intrinsics.areEqual(DeepLinkPath.URL_BASE, uri.getAuthority()) || Intrinsics.areEqual(DeepLinkPath.ALTERNATE_URL_BASE, uri.getAuthority())) {
            if (uri.getPathSegments().size() <= 1) {
                List<String> list = nonRootSinglePathSegments;
                List<String> pathSegments = uri.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                if (!CollectionsKt.contains(list, CollectionsKt.firstOrNull((List) pathSegments))) {
                    return true;
                }
            }
            return false;
        }
        return uri.getPathSegments().isEmpty();
    }

    public static final boolean shouldRerouteToPdfRenderer(Uri uri) {
        String path;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual(uri.getAuthority(), DeepLinkPath.CDN_URL_BASE) && (path = uri.getPath()) != null && StringsKt.contains$default((CharSequence) path, (CharSequence) ".pdf", false, 2, (Object) null);
    }

    public static final boolean isWallet(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual(uri.getScheme(), "robinhood-wallet");
    }
}
