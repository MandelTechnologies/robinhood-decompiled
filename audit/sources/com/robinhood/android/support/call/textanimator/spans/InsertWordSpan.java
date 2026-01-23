package com.robinhood.android.support.call.textanimator.spans;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.android.support.call.textanimator.WordDiff;
import com.robinhood.android.support.call.textanimator.extensions.Paints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InsertWordSpan.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJP\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/spans/InsertWordSpan;", "Lcom/robinhood/android/support/call/textanimator/spans/WordSpan;", "startColor", "", "wordDiff", "Lcom/robinhood/android/support/call/textanimator/WordDiff;", "getFraction", "Lkotlin/Function0;", "", "setPosition", "Lkotlin/Function2;", "", "<init>", "(ILcom/robinhood/android/support/call/textanimator/WordDiff;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "fraction", "()F", "hasSetPosition", "", "draw", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InsertWordSpan extends WordSpan {
    private final Function0<Float> getFraction;
    private boolean hasSetPosition;
    private final Function2<Integer, Integer, Unit> setPosition;
    private final int startColor;
    private final WordDiff wordDiff;
    public static final int $stable = 8;
    private static final ArgbEvaluator ARGB_EVALUATOR = new ArgbEvaluator();

    /* JADX WARN: Multi-variable type inference failed */
    public InsertWordSpan(int i, WordDiff wordDiff, Function0<Float> getFraction, Function2<? super Integer, ? super Integer, Unit> setPosition) {
        Intrinsics.checkNotNullParameter(wordDiff, "wordDiff");
        Intrinsics.checkNotNullParameter(getFraction, "getFraction");
        Intrinsics.checkNotNullParameter(setPosition, "setPosition");
        this.startColor = i;
        this.wordDiff = wordDiff;
        this.getFraction = getFraction;
        this.setPosition = setPosition;
    }

    private final float getFraction() {
        return this.getFraction.invoke().floatValue();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Integer endPositionY;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (!this.hasSetPosition) {
            this.hasSetPosition = true;
            this.setPosition.invoke(Integer.valueOf((int) x), Integer.valueOf(y));
        }
        Object objEvaluate = ARGB_EVALUATOR.evaluate(getFraction(), Integer.valueOf(this.startColor), Integer.valueOf(paint.getColor()));
        Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        paint.setColor(((Integer) objEvaluate).intValue());
        Paints.updateAlpha(paint, getFraction());
        WordDiff anchor = this.wordDiff.getAnchor();
        float f = 1;
        float fraction = (f - getFraction()) * ((anchor == null || (endPositionY = anchor.getEndPositionY()) == null || endPositionY.intValue() != y) ? 0 : -anchor.getDeltaX());
        float fraction2 = top == 0 ? (f - getFraction()) * bottom : 0.0f;
        int width = canvas.getWidth();
        int iSave = canvas.save();
        canvas.clipRect(0, 0, width, bottom);
        try {
            iSave = canvas.save();
            canvas.translate(fraction, fraction2);
            try {
                canvas.drawText(text, start, end, x, y, paint);
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
