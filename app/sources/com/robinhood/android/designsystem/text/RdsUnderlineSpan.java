package com.robinhood.android.designsystem.text;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsUnderlineSpan.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J`\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/designsystem/text/RdsUnderlineSpan;", "Landroid/text/style/LineBackgroundSpan;", "resources", "Landroid/content/res/Resources;", "useLinkColor", "", "<init>", "(Landroid/content/res/Resources;Z)V", "largeTextSize", "", "mediumTextSize", "smallTextSize", "largeBaselineToBottomHeight", "", "mediumBaselineToBottomHeight", "smallBaselineToBottomHeight", "underlineStrokeWidth", "underlinePaint", "Landroid/graphics/Paint;", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", "left", "right", "top", "baseline", "bottom", "text", "", "start", "end", "lineNumber", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RdsUnderlineSpan implements LineBackgroundSpan {
    private final float largeBaselineToBottomHeight;
    private final int largeTextSize;
    private final float mediumBaselineToBottomHeight;
    private final int mediumTextSize;
    private final float smallBaselineToBottomHeight;
    private final int smallTextSize;
    private final Paint underlinePaint;
    private final float underlineStrokeWidth;
    private final boolean useLinkColor;

    public RdsUnderlineSpan(Resources resources, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.useLinkColor = z;
        this.largeTextSize = resources.getDimensionPixelSize(C13997R.dimen.text_size_mobius_regular_large);
        this.mediumTextSize = resources.getDimensionPixelSize(C13997R.dimen.text_size_mobius_regular_medium);
        this.smallTextSize = resources.getDimensionPixelSize(C13997R.dimen.text_size_mobius_regular_small);
        this.largeBaselineToBottomHeight = resources.getDimension(C13997R.dimen.last_baseline_to_bottom_height_large);
        this.mediumBaselineToBottomHeight = resources.getDimension(C13997R.dimen.last_baseline_to_bottom_height_medium);
        this.smallBaselineToBottomHeight = resources.getDimension(C13997R.dimen.last_baseline_to_bottom_height_small);
        float dimension = resources.getDimension(C13997R.dimen.underline_stroke_width);
        this.underlineStrokeWidth = dimension;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimension);
        this.underlinePaint = paint;
    }

    public /* synthetic */ RdsUnderlineSpan(Resources resources, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i & 2) != 0 ? true : z);
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int left, int right, int top, int baseline, int bottom, CharSequence text, int start, int end, int lineNumber) {
        int color;
        float f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        boolean z = text instanceof Spanned;
        Spanned spanned = z ? (Spanned) text : null;
        int spanStart = spanned != null ? spanned.getSpanStart(this) : start;
        Spanned spanned2 = z ? (Spanned) text : null;
        int spanEnd = spanned2 != null ? spanned2.getSpanEnd(this) : end;
        if (spanStart < start) {
            spanStart = start;
        }
        if (spanEnd > end) {
            spanEnd = end;
        }
        float fMeasureText = paint.measureText(text, start, spanStart);
        float fMeasureText2 = fMeasureText + paint.measureText(text, spanStart, spanEnd);
        Paint paint2 = this.underlinePaint;
        if (this.useLinkColor) {
            TextPaint textPaint = paint instanceof TextPaint ? (TextPaint) paint : null;
            color = textPaint != null ? textPaint.linkColor : paint.getColor();
        } else {
            color = paint.getColor();
        }
        paint2.setColor(color);
        int textSize = (int) paint.getTextSize();
        if (textSize == this.largeTextSize) {
            f = this.largeBaselineToBottomHeight;
        } else if (textSize == this.mediumTextSize) {
            f = this.mediumBaselineToBottomHeight;
        } else {
            f = textSize == this.smallTextSize ? this.smallBaselineToBottomHeight : this.smallBaselineToBottomHeight;
        }
        float f2 = baseline + f;
        float f3 = this.underlineStrokeWidth;
        canvas.drawLine(fMeasureText, f2 - f3, fMeasureText2, f2 - f3, this.underlinePaint);
    }
}
