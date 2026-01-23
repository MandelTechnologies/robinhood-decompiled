package com.robinhood.utils.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: Capitalization.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0005"}, m3636d2 = {"capitalizeFirstChar", "", "locale", "Ljava/util/Locale;", "decapitalizeFirstChar", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.text.CapitalizationKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Capitalization {
    public static final String capitalizeFirstChar(String str, Locale locale) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            strValueOf = String.valueOf(cCharAt);
        } else if (locale == null) {
            strValueOf = CharsKt.titlecase(cCharAt);
        } else {
            strValueOf = CharsKt.titlecase(cCharAt, locale);
        }
        sb.append((Object) strValueOf);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static /* synthetic */ String capitalizeFirstChar$default(String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = null;
        }
        return capitalizeFirstChar(str, locale);
    }

    public static final String decapitalizeFirstChar(String str, Locale locale) {
        String strLowercase;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (locale == null) {
            String strValueOf = String.valueOf(cCharAt);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            strLowercase = strValueOf.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(strLowercase, "toLowerCase(...)");
        } else {
            strLowercase = CharsKt.lowercase(cCharAt, locale);
        }
        sb.append((Object) strLowercase);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static /* synthetic */ String decapitalizeFirstChar$default(String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = null;
        }
        return decapitalizeFirstChar(str, locale);
    }
}
