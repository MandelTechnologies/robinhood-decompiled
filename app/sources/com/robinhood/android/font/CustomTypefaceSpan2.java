package com.robinhood.android.font;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTypefaceSpan.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"withTypeface", "Landroid/text/Spanned;", "", "typeface", "Landroid/graphics/Typeface;", "lib-fonts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.font.CustomTypefaceSpanKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CustomTypefaceSpan2 {
    public static final Spanned withTypeface(CharSequence charSequence, Typeface typeface) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CustomTypefaceSpan(typeface), 0, spannableString.length(), 18);
        return spannableString;
    }
}
