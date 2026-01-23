package com.withpersona.sdk2.inquiry.steps.p423ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.card.MaterialCardView;
import com.singular.sdk.internal.Constants;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SignatureView.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006>"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/SignatureView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "init", "", "x", "y", "touchStart", "(FF)V", "touchMove", "touchUp", "()V", "updateSignatureRectF", "Landroid/graphics/Rect;", "computeSignatureRect", "()Landroid/graphics/Rect;", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "(Landroid/graphics/Canvas;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "Landroid/view/MotionEvent;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "clearCanvas", "Landroid/graphics/Bitmap;", "generateSignatureBitmap", "()Landroid/graphics/Bitmap;", "signatureBitmap", "Landroid/graphics/Bitmap;", "signatureCanvas", "Landroid/graphics/Canvas;", "Landroid/graphics/RectF;", "signatureRectF", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "drawPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "bitmapPaint", "Landroid/graphics/Paint;", "paint", "penX", "F", "penY", "isEmpty", "()Z", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SignatureView extends MaterialCardView {
    private final Paint bitmapPaint;
    private Path drawPath;
    private final Paint paint;
    private float penX;
    private float penY;
    private Bitmap signatureBitmap;
    private Canvas signatureCanvas;
    private RectF signatureRectF;

    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        init(context, attributeSet);
    }

    private final void init(Context context, AttributeSet attrs) {
        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setColor(-16777216);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w <= 0 || h <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        this.signatureBitmap = bitmapCreateBitmap;
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "also(...)");
        this.signatureCanvas = new Canvas(bitmapCreateBitmap);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        Bitmap bitmap = this.signatureBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.bitmapPaint);
        }
        drawBackground(canvas);
        canvas.drawPath(this.drawPath, this.paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        super.onTouchEvent(e);
        float x = e.getX();
        float y = e.getY();
        int action = e.getAction();
        if (action == 0) {
            touchStart(x, y);
            invalidate();
        } else if (action == 1) {
            touchUp();
            invalidate();
        } else if (action == 2) {
            touchMove(x, y);
            invalidate();
        }
        return true;
    }

    public final void clearCanvas() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        this.drawPath.reset();
        this.signatureRectF = new RectF();
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }

    private final void touchStart(float x, float y) {
        this.drawPath.reset();
        this.drawPath.moveTo(x, y);
        this.penX = x;
        this.penY = y;
    }

    private final void touchMove(float x, float y) {
        this.drawPath.lineTo(x, y);
        this.penX = x;
        this.penY = y;
    }

    private final void touchUp() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        if (!this.drawPath.isEmpty()) {
            this.drawPath.lineTo(this.penX, this.penY);
            canvas.drawPath(this.drawPath, this.paint);
        } else {
            this.drawPath.moveTo(this.penX - 0.5f, this.penY - 0.5f);
            this.drawPath.lineTo(this.penX, this.penY);
            canvas.drawPoint(this.penX, this.penY, this.paint);
        }
        updateSignatureRectF();
        this.drawPath.reset();
    }

    private final void updateSignatureRectF() {
        RectF rectF = new RectF();
        this.drawPath.computeBounds(rectF, true);
        if (!this.drawPath.isEmpty()) {
            float f = 2;
            rectF.inset((-this.paint.getStrokeWidth()) / f, (-this.paint.getStrokeWidth()) / f);
        }
        rectF.sort();
        this.signatureRectF.union(rectF);
        this.signatureRectF.sort();
    }

    private final Rect computeSignatureRect() {
        RectF rectF = new RectF(this.signatureRectF.left - this.paint.getStrokeWidth(), this.signatureRectF.top - this.paint.getStrokeWidth(), this.signatureRectF.right + this.paint.getStrokeWidth(), this.signatureRectF.bottom + this.paint.getStrokeWidth());
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    private final void drawBackground(Canvas canvas) {
        canvas.save();
        Paint paint = new Paint();
        paint.setColor(-3355444);
        paint.setStrokeWidth(4.0f);
        float dpToPx = (float) ExtensionsKt.getDpToPx(24.0d);
        float dpToPx2 = (float) ExtensionsKt.getDpToPx(20.0d);
        canvas.drawLine(dpToPx2, canvas.getHeight() - dpToPx, canvas.getWidth() - dpToPx2, canvas.getHeight() - dpToPx, paint);
        canvas.restore();
    }

    private final boolean isEmpty() {
        return this.signatureRectF.isEmpty();
    }

    public final Bitmap generateSignatureBitmap() {
        Bitmap bitmap = this.signatureBitmap;
        if (isEmpty() || bitmap == null) {
            return null;
        }
        updateSignatureRectF();
        Rect rectComputeSignatureRect = computeSignatureRect();
        Rect rect = new Rect(0, 0, rectComputeSignatureRect.width(), rectComputeSignatureRect.height());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rectComputeSignatureRect.width(), rectComputeSignatureRect.height(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(bitmap, rectComputeSignatureRect, rect, (Paint) null);
        return bitmapCreateBitmap;
    }
}
