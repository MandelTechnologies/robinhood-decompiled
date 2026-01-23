package com.robinhood.android.support.call.textanimator.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.robinhood.android.support.call.textanimator.extensions.Paints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FullReplaceDeleteWordSpan.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016JP\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/spans/FullReplaceDeleteWordSpan;", "Lcom/robinhood/android/support/call/textanimator/spans/WordSpan;", "startPositions", "", "Landroid/graphics/Point;", "startWidth", "", "gravity", "getFraction", "Lkotlin/Function0;", "", "<init>", "(Ljava/util/List;IILkotlin/jvm/functions/Function0;)V", "fraction", "()F", "bounds", "Landroid/graphics/Rect;", "wordPositionHelper", "Lcom/robinhood/android/support/call/textanimator/spans/WordPositionHelper;", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "top", "y", "bottom", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class FullReplaceDeleteWordSpan extends WordSpan {
    public static final int $stable = 8;
    private final Rect bounds;
    private final Function0<Float> getFraction;
    private final int gravity;
    private final int startWidth;
    private final WordPositionHelper wordPositionHelper;

    public FullReplaceDeleteWordSpan(List<? extends Point> startPositions, int i, int i2, Function0<Float> getFraction) {
        Intrinsics.checkNotNullParameter(startPositions, "startPositions");
        Intrinsics.checkNotNullParameter(getFraction, "getFraction");
        this.startWidth = i;
        this.gravity = i2;
        this.getFraction = getFraction;
        this.bounds = new Rect();
        this.wordPositionHelper = new WordPositionHelper(startPositions);
    }

    private final float getFraction() {
        return this.getFraction.invoke().floatValue();
    }

    @Override // com.robinhood.android.support.call.textanimator.spans.WordSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        super.getSize(paint, text, start, end, fm);
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Point startPosition = this.wordPositionHelper.getStartPosition(start);
        int i = startPosition.x;
        int i2 = startPosition.y;
        Paints.updateAlpha(paint, 1 - getFraction());
        float fCalculateGravityOffsetX = SpanUtils2.calculateGravityOffsetX(this.gravity, this.startWidth, canvas.getWidth());
        float f = (-getFraction()) * (bottom - top);
        paint.getTextBounds(text.toString(), 0, text.length(), this.bounds);
        int iHeight = i2 - this.bounds.height();
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int iSave = canvas.save();
        canvas.clipRect(0, iHeight, width, height);
        try {
            iSave = canvas.save();
            canvas.translate(fCalculateGravityOffsetX, f);
            try {
                canvas.drawText(text, start, end, i, i2, paint);
                canvas.restoreToCount(iSave);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
