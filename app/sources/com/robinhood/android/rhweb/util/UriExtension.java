package com.robinhood.android.rhweb.util;

import android.content.res.Resources;
import android.net.Uri;
import com.robinhood.android.rhweb.C27330R;
import com.robinhood.android.rhweb.RhWebDeeplinkTarget;
import com.robinhood.targetbackend.TargetBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: UriExtension.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"toRhWebLink", "Lokhttp3/HttpUrl;", "Landroid/net/Uri;", "resources", "Landroid/content/res/Resources;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "feature-rhweb_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhweb.util.UriExtensionKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class UriExtension {
    public static final HttpUrl toRhWebLink(Uri uri, Resources resources, TargetBackend targetBackend) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        if (targetBackend.isApollo()) {
            string2 = resources.getString(C27330R.string.rh_web_apollo_host, targetBackend.getEndpoint().getApolloNamespace());
        } else {
            string2 = resources.getString(C27330R.string.rh_web_prod_host);
        }
        Intrinsics.checkNotNull(string2);
        String string3 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String strSubstring = string3.substring(StringsKt.indexOf$default((CharSequence) string3, RhWebDeeplinkTarget.INSTANCE.getPath(), 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return HttpUrl.INSTANCE.get(string2 + strSubstring);
    }
}
