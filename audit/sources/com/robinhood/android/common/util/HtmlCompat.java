package com.robinhood.android.common.util;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HtmlCompat.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/HtmlCompat;", "", "<init>", "()V", "fromHtml", "Landroid/text/Spannable;", "source", "", "flags", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class HtmlCompat {
    public static final int $stable = 0;
    public static final HtmlCompat INSTANCE = new HtmlCompat();

    @JvmStatic
    @JvmOverloads
    public static final Spannable fromHtml(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return fromHtml$default(source, 0, 2, null);
    }

    private HtmlCompat() {
    }

    public static /* synthetic */ Spannable fromHtml$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return fromHtml(str, i);
    }

    @JvmStatic
    @JvmOverloads
    public static final Spannable fromHtml(String source, int flags) {
        Intrinsics.checkNotNullParameter(source, "source");
        Spanned spannedFromHtml = androidx.core.text.HtmlCompat.fromHtml(source, flags);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        SpannableString spannableStringValueOf = SpannableString.valueOf(spannedFromHtml);
        Object[] spans = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), URLSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            spannableStringValueOf.setSpan(new StyleSpan(1), spannableStringValueOf.getSpanStart(uRLSpan), spannableStringValueOf.getSpanEnd(uRLSpan), 0);
        }
        return spannableStringValueOf;
    }
}
