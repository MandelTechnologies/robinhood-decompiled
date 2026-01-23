package com.robinhood.android.deeplink.targets.util;

import android.net.Uri;
import com.robinhood.android.deeplink.DeepLinkPath;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Uris.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"changeUriTo", "Landroid/net/Uri;", "to", "Lcom/robinhood/android/deeplink/DeepLinkPath;", "lib-deeplink-targets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.deeplink.targets.util.UrisKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Uris2 {
    public static final Uri changeUriTo(Uri uri, DeepLinkPath to) {
        int iHashCode;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(to, "to");
        if (Intrinsics.areEqual(uri.getScheme(), DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD())) {
            Uri uriBuild = uri.buildUpon().authority(to.getPath()).build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
            return uriBuild;
        }
        String authority = uri.getAuthority();
        int i = (authority == null || ((iHashCode = authority.hashCode()) == 241141058 ? !authority.equals(DeepLinkPath.ALTERNATE_URL_BASE) : !(iHashCode == 1505923417 && authority.equals(DeepLinkPath.URL_BASE)))) ? 0 : 1;
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        List mutableList = CollectionsKt.toMutableList((Collection) pathSegments);
        mutableList.set(i, to.getPath());
        Uri.Builder builderPath = uri.buildUpon().path("");
        Iterator it = mutableList.iterator();
        while (it.hasNext()) {
            builderPath = builderPath.appendPath((String) it.next());
        }
        Uri uriBuild2 = builderPath.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild2, "build(...)");
        return uriBuild2;
    }
}
