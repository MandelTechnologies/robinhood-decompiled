package com.github.jinatonic.confetti.confetto;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* loaded from: classes16.dex */
public class BitmapConfetto extends Confetto {
    private final Bitmap bitmap;
    private final float bitmapCenterX;
    private final float bitmapCenterY;

    public BitmapConfetto(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.bitmapCenterX = bitmap.getWidth() / 2.0f;
        this.bitmapCenterY = bitmap.getHeight() / 2.0f;
    }

    @Override // com.github.jinatonic.confetti.confetto.Confetto
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // com.github.jinatonic.confetti.confetto.Confetto
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // com.github.jinatonic.confetti.confetto.Confetto
    protected void drawInternal(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4) {
        matrix.preTranslate(f, f2);
        matrix.preRotate(f3, this.bitmapCenterX, this.bitmapCenterY);
        canvas.drawBitmap(this.bitmap, matrix, paint);
    }
}
