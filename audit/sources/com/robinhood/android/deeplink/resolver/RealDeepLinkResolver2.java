package com.robinhood.android.deeplink.resolver;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealDeepLinkResolver.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.resolver.RealDeepLinkResolver$mapPathToDeepLink$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RealDeepLinkResolver2 extends FunctionReferenceImpl implements Function1<Uri, Boolean> {
    RealDeepLinkResolver2(Object obj) {
        super(1, obj, RealDeepLinkResolver.class, "isSupported", "isSupported(Landroid/net/Uri;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Uri p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((RealDeepLinkResolver) this.receiver).isSupported(p0));
    }
}
