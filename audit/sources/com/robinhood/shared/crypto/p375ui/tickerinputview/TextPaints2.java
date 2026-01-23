package com.robinhood.shared.crypto.p375ui.tickerinputview;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextPaints.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"height", "", "Landroid/text/TextPaint;", "calculateWidth", "char", "", "calculateHeight", "string", "", "bounds", "Landroid/graphics/Rect;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.tickerinputview.TextPaintsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TextPaints2 {
    public static final float height(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    public static final float calculateWidth(TextPaint textPaint, char c) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        return textPaint.measureText(String.valueOf(c));
    }

    public static final float calculateHeight(TextPaint textPaint, String string2, Rect bounds) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(string2, "string");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        textPaint.getTextBounds(string2, 0, string2.length(), bounds);
        return bounds.height();
    }
}
