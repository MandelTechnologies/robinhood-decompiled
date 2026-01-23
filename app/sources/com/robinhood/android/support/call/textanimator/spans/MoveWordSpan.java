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

/* compiled from: MoveWordSpan.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0011R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/spans/MoveWordSpan;", "Lcom/robinhood/android/support/call/textanimator/spans/WordSpan;", "startWidth", "", "startColor", "wordDiff", "Lcom/robinhood/android/support/call/textanimator/WordDiff;", "gravity", "getFraction", "Lkotlin/Function0;", "", "setPosition", "Lkotlin/Function2;", "", "<init>", "(IILcom/robinhood/android/support/call/textanimator/WordDiff;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "fraction", "()F", "startPositionX", "Ljava/lang/Integer;", "startPositionY", "hasSetEndPosition", "", "draw", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MoveWordSpan extends WordSpan {
    private final Function0<Float> getFraction;
    private final int gravity;
    private boolean hasSetEndPosition;
    private final Function2<Integer, Integer, Unit> setPosition;
    private final int startColor;
    private final Integer startPositionX;
    private final Integer startPositionY;
    private final int startWidth;
    private final WordDiff wordDiff;
    public static final int $stable = 8;
    private static final ArgbEvaluator ARGB_EVALUATOR = new ArgbEvaluator();

    /* JADX WARN: Multi-variable type inference failed */
    public MoveWordSpan(int i, int i2, WordDiff wordDiff, int i3, Function0<Float> getFraction, Function2<? super Integer, ? super Integer, Unit> setPosition) {
        Intrinsics.checkNotNullParameter(wordDiff, "wordDiff");
        Intrinsics.checkNotNullParameter(getFraction, "getFraction");
        Intrinsics.checkNotNullParameter(setPosition, "setPosition");
        this.startWidth = i;
        this.startColor = i2;
        this.wordDiff = wordDiff;
        this.gravity = i3;
        this.getFraction = getFraction;
        this.setPosition = setPosition;
        this.startPositionX = wordDiff.getStartPositionX();
        this.startPositionY = wordDiff.getStartPositionY();
    }

    private final float getFraction() {
        return this.getFraction.invoke().floatValue();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        float fraction;
        int iSave;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (!this.hasSetEndPosition) {
            this.hasSetEndPosition = true;
            this.setPosition.invoke(Integer.valueOf((int) x), Integer.valueOf(y));
        }
        float fCalculateGravityOffsetX = SpanUtils2.calculateGravityOffsetX(this.gravity, this.startWidth, canvas.getWidth());
        Integer num = this.startPositionX;
        int iIntValue = num != null ? num.intValue() : (int) x;
        Integer num2 = this.startPositionY;
        int iIntValue2 = num2 != null ? num2.intValue() : y;
        if (iIntValue2 == y) {
            float fraction2 = (1 - getFraction()) * ((iIntValue - x) + fCalculateGravityOffsetX);
            iSave = canvas.save();
            canvas.translate(fraction2, 0.0f);
            try {
                canvas.drawText(text, start, end, x, y, paint);
                return;
            } finally {
            }
        }
        WordDiff anchor = this.wordDiff.getAnchor();
        if (iIntValue2 < y) {
            fCalculateGravityOffsetX += getFraction() * (anchor != null ? anchor.getDeltaX() - fCalculateGravityOffsetX : 0.0f);
            fraction = 0.0f;
        } else {
            fraction = (1 - getFraction()) * (-(anchor != null ? anchor.getDeltaX() : 0));
        }
        Paints.updateAlpha(paint, 1 - getFraction());
        iSave = canvas.save();
        canvas.translate(fCalculateGravityOffsetX, 0.0f);
        try {
            canvas.drawText(text, start, end, iIntValue, iIntValue2, paint);
            canvas.restoreToCount(iSave);
            Object objEvaluate = ARGB_EVALUATOR.evaluate(getFraction(), Integer.valueOf(this.startColor), Integer.valueOf(paint.getColor()));
            Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
            paint.setColor(((Integer) objEvaluate).intValue());
            Paints.updateAlpha(paint, getFraction());
            iSave = canvas.save();
            canvas.translate(fraction, 0.0f);
            try {
                canvas.drawText(text, start, end, x, y, paint);
            } finally {
            }
        } finally {
        }
    }
}
