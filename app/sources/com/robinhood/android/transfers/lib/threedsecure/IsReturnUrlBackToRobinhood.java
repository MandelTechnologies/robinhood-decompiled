package com.robinhood.android.transfers.lib.threedsecure;

import android.net.Uri;
import android.webkit.URLUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: IsReturnUrlBackToRobinhood.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"isReturnUrlBackToRobinhood", "", "", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.lib.threedsecure.IsReturnUrlBackToRobinhoodKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IsReturnUrlBackToRobinhood {
    public static final boolean isReturnUrlBackToRobinhood(String str) {
        String authority;
        Uri uri;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Uri uri2 = Uri.parse(str);
        if (Intrinsics.areEqual(uri2.getScheme(), "robinhood")) {
            return true;
        }
        if (!StringsKt.startsWith$default(str, "https://", false, 2, (Object) null) && !StringsKt.startsWith$default(str, "http://", false, 2, (Object) null)) {
            String str2 = "https://" + str;
            if (!URLUtil.isValidUrl(str2)) {
                str2 = null;
            }
            if (str2 != null && (uri = Uri.parse(str2)) != null) {
                uri2 = uri;
            }
        }
        String authority2 = uri2.getAuthority();
        return (authority2 != null && StringsKt.contains$default((CharSequence) authority2, (CharSequence) "robinhood", false, 2, (Object) null)) || ((authority = uri2.getAuthority()) != null && StringsKt.contains$default((CharSequence) authority, (CharSequence) "rhinternal", false, 2, (Object) null));
    }
}
