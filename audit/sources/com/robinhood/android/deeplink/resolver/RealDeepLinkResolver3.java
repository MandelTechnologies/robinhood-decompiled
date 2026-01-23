package com.robinhood.android.deeplink.resolver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.navigation.DeepLinkOrigin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealDeepLinkResolver.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.resolver.RealDeepLinkResolver$mapPathToDeepLink$1$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RealDeepLinkResolver3 extends FunctionReferenceImpl implements Function3<Context, Uri, DeepLinkOrigin, Intent[]> {
    RealDeepLinkResolver3(Object obj) {
        super(3, obj, RealDeepLinkResolver.class, "redirectGetIntents", "redirectGetIntents$lib_deeplink_resolver_externalDebug(Landroid/content/Context;Landroid/net/Uri;Lcom/robinhood/android/navigation/DeepLinkOrigin;)[Landroid/content/Intent;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Intent[] invoke(Context p0, Uri p1, DeepLinkOrigin p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return ((RealDeepLinkResolver) this.receiver).redirectGetIntents$lib_deeplink_resolver_externalDebug(p0, p1, p2);
    }
}
