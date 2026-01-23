package com.robinhood.android.history.util;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UppercaseFirst.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"uppercaseFirst", "", "", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.history.util.UppercaseFirstKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UppercaseFirst {
    public static final String uppercaseFirst(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String string2 = charSequence.toString();
        if (string2.length() <= 0) {
            return string2;
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(string2.charAt(0));
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String strSubstring = string2.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }
}
