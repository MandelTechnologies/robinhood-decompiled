package com.robinhood.utils.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PillSpan.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016JP\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/utils/text/PillSpan;", "Landroid/text/style/ReplacementSpan;", "pillColor", "", "textColor", "textTypeface", "Landroid/graphics/Typeface;", "pillStrokeWidth", "", "verticalPadding", "horizontalPadding", "fill", "", "<init>", "(ILjava/lang/Integer;Landroid/graphics/Typeface;FIIZ)V", "Ljava/lang/Integer;", "pillPaint", "Landroid/graphics/Paint;", "getSize", "paint", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "top", "y", "bottom", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PillSpan extends ReplacementSpan {
    private final boolean fill;
    private final int horizontalPadding;
    private final int pillColor;
    private final Paint pillPaint;
    private final float pillStrokeWidth;
    private final Integer textColor;
    private final Typeface textTypeface;
    private final int verticalPadding;

    public /* synthetic */ PillSpan(int i, Integer num, Typeface typeface, float f, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? null : typeface, f, i2, i3, (i4 & 64) != 0 ? false : z);
    }

    public PillSpan(int i, Integer num, Typeface typeface, float f, int i2, int i3, boolean z) {
        this.pillColor = i;
        this.textColor = num;
        this.textTypeface = typeface;
        this.pillStrokeWidth = f;
        this.verticalPadding = i2;
        this.horizontalPadding = i3;
        this.fill = z;
        Paint paint = new Paint();
        paint.setStyle(z ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setColor(i);
        paint.setAntiAlias(true);
        this.pillPaint = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        return ((int) paint.measureText(text, start, end)) + ((int) ((this.horizontalPadding * 2) + (this.pillStrokeWidth * 2)));
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        float fMeasureText = paint.measureText(text, start, end);
        float f = y;
        float f2 = (paint.getFontMetrics().top + f) - this.verticalPadding;
        float f3 = paint.getFontMetrics().bottom + f + this.verticalPadding;
        float f4 = f3 - f2;
        canvas.drawRoundRect(x + this.pillStrokeWidth, f2, x + fMeasureText + (this.horizontalPadding * 2), f3, f4, f4, this.pillPaint);
        Integer num = this.textColor;
        paint.setColor(num != null ? num.intValue() : paint.getColor());
        Typeface typeface = this.textTypeface;
        if (typeface == null) {
            typeface = paint.getTypeface();
        }
        paint.setTypeface(typeface);
        canvas.drawText(text, start, end, this.pillStrokeWidth + x + this.horizontalPadding, f, paint);
    }
}
