package com.robinhood.android.support.call.textanimator.spans;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.android.support.call.textanimator.extensions.Paints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FullReplaceInsertWordSpan.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJP\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/spans/FullReplaceInsertWordSpan;", "Lcom/robinhood/android/support/call/textanimator/spans/WordSpan;", "startColor", "", "getFraction", "Lkotlin/Function0;", "", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "fraction", "()F", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class FullReplaceInsertWordSpan extends WordSpan {
    private final Function0<Float> getFraction;
    private final int startColor;
    public static final int $stable = 8;
    private static final ArgbEvaluator ARGB_EVALUATOR = new ArgbEvaluator();

    public FullReplaceInsertWordSpan(int i, Function0<Float> getFraction) {
        Intrinsics.checkNotNullParameter(getFraction, "getFraction");
        this.startColor = i;
        this.getFraction = getFraction;
    }

    private final float getFraction() {
        return this.getFraction.invoke().floatValue();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Object objEvaluate = ARGB_EVALUATOR.evaluate(getFraction(), Integer.valueOf(this.startColor), Integer.valueOf(paint.getColor()));
        Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        paint.setColor(((Integer) objEvaluate).intValue());
        Paints.updateAlpha(paint, getFraction());
        float fraction = (1 - getFraction()) * (bottom - top);
        int width = canvas.getWidth();
        int iSave = canvas.save();
        canvas.clipRect(0, 0, width, bottom);
        try {
            iSave = canvas.save();
            canvas.translate(0.0f, fraction);
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
