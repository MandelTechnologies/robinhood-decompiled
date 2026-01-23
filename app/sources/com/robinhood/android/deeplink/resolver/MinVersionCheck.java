package com.robinhood.android.deeplink.resolver;

import android.net.Uri;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.SemanticVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MinVersionCheck.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"MIN_VER_PARAM", "", "requiresUpdateToView", "", "Lcom/robinhood/utils/ReleaseVersion;", "uri", "Landroid/net/Uri;", "lib-deeplink-resolver_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.resolver.MinVersionCheckKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class MinVersionCheck {
    private static final String MIN_VER_PARAM = "min_req_app_ver_android";

    public static final boolean requiresUpdateToView(ReleaseVersion releaseVersion, Uri uri) {
        SemanticVersion.Companion companion;
        SemanticVersion orNull;
        Intrinsics.checkNotNullParameter(releaseVersion, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter(MIN_VER_PARAM);
        return (queryParameter == null || (orNull = (companion = SemanticVersion.INSTANCE).parseOrNull(queryParameter)) == null || orNull.compareTo(companion.parse(releaseVersion.getVersionName())) <= 0) ? false : true;
    }
}
