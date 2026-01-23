package com.robinhood.android.idl.deeplink.resolver;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IdlDeeplinkTargetResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, m3636d2 = {"findRoute", "", "", "Landroid/net/Uri;", "uri", "lib-idl-deeplink-resolver_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolverKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IdlDeeplinkTargetResolver2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String findRoute(Iterable<? extends Uri> iterable, Uri uri) {
        for (Uri uri2 : iterable) {
            if (Intrinsics.areEqual(uri2.getScheme(), uri.getScheme())) {
                String string2 = uri2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String strTrim = StringsKt.trim(string2, '/');
                String string3 = uri.buildUpon().clearQuery().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                if (StringsKt.startsWith$default(string3, strTrim, false, 2, (Object) null)) {
                    return StringsKt.trim(StringsKt.removePrefix(string3, strTrim), '/');
                }
            }
        }
        return null;
    }
}
