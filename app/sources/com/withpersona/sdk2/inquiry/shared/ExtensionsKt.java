package com.withpersona.sdk2.inquiry.shared;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\r\u001a\u00020\b*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u0015\u0010\u000f\u001a\u00020\b*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\"\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0014\u001a\u00020\u0013*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u00020\u0013*\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"", "", "toHexColorString", "(I)Ljava/lang/String;", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "displayMetrics", "Landroid/util/DisplayMetrics;", "", "getDpToPx", "(D)D", "dpToPx", "getPxToDp", "pxToDp", "getSpToPx", "spToPx", "getFormattedResourceName", "(Ljava/lang/String;)Ljava/lang/String;", "formattedResourceName", "", "isFallbackInquiryId", "(Ljava/lang/String;)Z", "isRegularInquiryId", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ExtensionsKt {
    private static final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();

    public static final double getDpToPx(double d) {
        return d * displayMetrics.density;
    }

    public static final double getPxToDp(double d) {
        return d / displayMetrics.density;
    }

    public static final double getSpToPx(double d) {
        return d * displayMetrics.scaledDensity;
    }

    public static final String toHexColorString(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String getFormattedResourceName(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Regex("[- ]").replace(lowerCase, "_");
    }

    public static final boolean isFallbackInquiryId(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith(str, "iqfs", true);
    }

    public static final boolean isRegularInquiryId(String str) {
        if (str != null) {
            return StringsKt.startsWith(str, "inq_", true);
        }
        return false;
    }
}
