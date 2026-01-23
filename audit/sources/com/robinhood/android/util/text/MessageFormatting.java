package com.robinhood.android.util.text;

import android.icu.text.MessageFormat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageFormatting.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¨\u0006\u0005"}, m3636d2 = {"formatMessageWith", "", "arguments", "", "", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.util.text.MessageFormattingKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MessageFormatting {
    public static final String formatMessageWith(String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (map == null) {
            return str;
        }
        String str2 = MessageFormat.format(str, map);
        Intrinsics.checkNotNull(str2);
        return str2;
    }
}
