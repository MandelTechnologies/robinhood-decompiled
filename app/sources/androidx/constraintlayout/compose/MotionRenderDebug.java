package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.Motion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MotionRenderDebug.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 z2\u00020\u0001:\u0001zB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u001eJ'\u0010!\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010\"JG\u0010&\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\"\u0010I\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\"\u0010L\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010A\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER\"\u0010O\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER\u0014\u0010R\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010*R\u001a\u0010S\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR\u001a\u0010Y\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u001a\u0010[\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010VR\u001a\u0010]\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b]\u0010T\u001a\u0004\b^\u0010VR\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010T\u001a\u0004\bg\u0010V\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010q\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010w\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010T\u001a\u0004\bx\u0010V\"\u0004\by\u0010i¨\u0006{"}, m3636d2 = {"Landroidx/constraintlayout/compose/MotionRenderDebug;", "", "", "textSize", "<init>", "(F)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/constraintlayout/core/motion/Motion;", "motionController", "", "duration", "layoutWidth", "layoutHeight", "", "drawPath", "drawTicks", "", "basicDraw", "(Landroid/graphics/Canvas;Landroidx/constraintlayout/core/motion/Motion;IIIZZ)V", "", "text", "Landroid/graphics/Paint;", "paint", "getTextBounds", "(Ljava/lang/String;Landroid/graphics/Paint;)V", "drawBasicPath", "(Landroid/graphics/Canvas;)V", "mode", "keyFrames", "(Landroid/graphics/Canvas;IILandroidx/constraintlayout/core/motion/Motion;II)V", "x", "y", "drawPathRelativeTicks", "(Landroid/graphics/Canvas;FF)V", "drawPathCartesianTicks", "viewWidth", "viewHeight", "drawPathScreenTicks", "(Landroid/graphics/Canvas;FFIIII)V", "", "mPoints", "[F", "getMPoints", "()[F", "setMPoints", "([F)V", "", "mPathMode", "[I", "getMPathMode", "()[I", "setMPathMode", "([I)V", "mKeyFramePoints", "getMKeyFramePoints", "setMKeyFramePoints", "Landroid/graphics/Path;", "mPath", "Landroid/graphics/Path;", "getMPath", "()Landroid/graphics/Path;", "setMPath", "(Landroid/graphics/Path;)V", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "setMPaint", "(Landroid/graphics/Paint;)V", "mPaintKeyframes", "getMPaintKeyframes", "setMPaintKeyframes", "mPaintGraph", "getMPaintGraph", "setMPaintGraph", "mTextPaint", "getMTextPaint", "setMTextPaint", "mFillPaint", "getMFillPaint", "setMFillPaint", "mRectangle", "mRedColor", "I", "getMRedColor", "()I", "mKeyframeColor", "getMKeyframeColor", "mGraphColor", "getMGraphColor", "mShadowColor", "getMShadowColor", "mDiamondSize", "getMDiamondSize", "Landroid/graphics/DashPathEffect;", "mDashPathEffect", "Landroid/graphics/DashPathEffect;", "getMDashPathEffect", "()Landroid/graphics/DashPathEffect;", "setMDashPathEffect", "(Landroid/graphics/DashPathEffect;)V", "mKeyFrameCount", "getMKeyFrameCount", "setMKeyFrameCount", "(I)V", "Landroid/graphics/Rect;", "mBounds", "Landroid/graphics/Rect;", "getMBounds", "()Landroid/graphics/Rect;", "setMBounds", "(Landroid/graphics/Rect;)V", "mPresentationMode", "Z", "getMPresentationMode", "()Z", "setMPresentationMode", "(Z)V", "mShadowTranslate", "getMShadowTranslate", "setMShadowTranslate", "Companion", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class MotionRenderDebug {
    private DashPathEffect mDashPathEffect;
    private Paint mFillPaint;
    private int mKeyFrameCount;
    private float[] mKeyFramePoints;
    private Paint mPaint;
    private Paint mPaintGraph;
    private Paint mPaintKeyframes;
    private Path mPath;
    private int[] mPathMode;
    private float[] mPoints;
    private boolean mPresentationMode;
    private final float[] mRectangle;
    private int mShadowTranslate;
    private Paint mTextPaint;
    public static final int $stable = 8;
    private final int mRedColor = -21965;
    private final int mKeyframeColor = -2067046;
    private final int mGraphColor = -13391360;
    private final int mShadowColor = 1996488704;
    private final int mDiamondSize = 10;
    private Rect mBounds = new Rect();

    public MotionRenderDebug(float f) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        Paint paint2 = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.mPaintKeyframes = paint3;
        paint3.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(style);
        Paint paint4 = new Paint();
        this.mPaintGraph = paint4;
        paint4.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(style);
        Paint paint5 = new Paint();
        this.mTextPaint = paint5;
        paint5.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(f);
        this.mRectangle = new float[8];
        Paint paint6 = new Paint();
        this.mFillPaint = paint6;
        paint6.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void basicDraw(Canvas canvas, Motion motionController, int duration, int layoutWidth, int layoutHeight, boolean drawPath, boolean drawTicks) {
        MotionRenderDebug motionRenderDebug;
        Canvas canvas2;
        Motion motion;
        int i;
        int i2;
        this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode, null);
        int i3 = duration / 16;
        float[] fArr = this.mPoints;
        if (fArr != null) {
            Intrinsics.checkNotNull(fArr);
            if (fArr.length != i3 * 2) {
                this.mPoints = new float[i3 * 2];
                this.mPath = new Path();
            }
        }
        int i4 = this.mShadowTranslate;
        canvas.translate(i4, i4);
        this.mPaint.setColor(this.mShadowColor);
        this.mFillPaint.setColor(this.mShadowColor);
        this.mPaintKeyframes.setColor(this.mShadowColor);
        this.mPaintGraph.setColor(this.mShadowColor);
        motionController.buildPath(this.mPoints, i3);
        if (drawPath) {
            drawBasicPath(canvas);
        }
        if (drawTicks) {
            motionRenderDebug = this;
            canvas2 = canvas;
            motion = motionController;
            i = layoutWidth;
            i2 = layoutHeight;
            motionRenderDebug.drawTicks(canvas2, 1, this.mKeyFrameCount, motion, i, i2);
        } else {
            motionRenderDebug = this;
            canvas2 = canvas;
            motion = motionController;
            i = layoutWidth;
            i2 = layoutHeight;
        }
        motionRenderDebug.mPaint.setColor(motionRenderDebug.mRedColor);
        motionRenderDebug.mPaintKeyframes.setColor(motionRenderDebug.mKeyframeColor);
        motionRenderDebug.mFillPaint.setColor(motionRenderDebug.mKeyframeColor);
        motionRenderDebug.mPaintGraph.setColor(motionRenderDebug.mGraphColor);
        int i5 = motionRenderDebug.mShadowTranslate;
        canvas2.translate(-i5, -i5);
        if (drawPath) {
            drawBasicPath(canvas2);
        }
        if (drawTicks) {
            motionRenderDebug.drawTicks(canvas2, 1, motionRenderDebug.mKeyFrameCount, motion, i, i2);
        }
    }

    private final void drawBasicPath(Canvas canvas) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        canvas.drawLines(fArr, this.mPaint);
    }

    private final void drawTicks(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        int width;
        int height;
        if (motionController.getView() != null) {
            width = motionController.getView().getWidth();
            height = motionController.getView().getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i = keyFrames - 1;
        for (int i2 = 1; i2 < i; i2++) {
            if (mode != 4 || this.mPathMode[i2 - 1] != 0) {
                float[] fArr = this.mKeyFramePoints;
                int i3 = i2 * 2;
                float f = fArr[i3];
                float f2 = fArr[i3 + 1];
                Path path = this.mPath;
                Intrinsics.checkNotNull(path);
                path.reset();
                Path path2 = this.mPath;
                Intrinsics.checkNotNull(path2);
                path2.moveTo(f, this.mDiamondSize + f2);
                Path path3 = this.mPath;
                Intrinsics.checkNotNull(path3);
                path3.lineTo(this.mDiamondSize + f, f2);
                Path path4 = this.mPath;
                Intrinsics.checkNotNull(path4);
                path4.lineTo(f, f2 - this.mDiamondSize);
                Path path5 = this.mPath;
                Intrinsics.checkNotNull(path5);
                path5.lineTo(f - this.mDiamondSize, f2);
                Path path6 = this.mPath;
                Intrinsics.checkNotNull(path6);
                path6.close();
                if (mode == 4) {
                    int i4 = this.mPathMode[i2 - 1];
                    if (i4 == 1) {
                        drawPathRelativeTicks(canvas, f - 0.0f, f2 - 0.0f);
                    } else if (i4 == 0) {
                        drawPathCartesianTicks(canvas, f - 0.0f, f2 - 0.0f);
                    } else if (i4 == 2) {
                        drawPathScreenTicks(canvas, f - 0.0f, f2 - 0.0f, width, height, layoutWidth, layoutHeight);
                    }
                    Path path7 = this.mPath;
                    Intrinsics.checkNotNull(path7);
                    canvas.drawPath(path7, this.mFillPaint);
                }
                if (mode == 2) {
                    drawPathRelativeTicks(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (mode == 3) {
                    drawPathCartesianTicks(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (mode == 6) {
                    drawPathScreenTicks(canvas, f - 0.0f, f2 - 0.0f, width, height, layoutWidth, layoutHeight);
                }
                Path path8 = this.mPath;
                Intrinsics.checkNotNull(path8);
                canvas.drawPath(path8, this.mFillPaint);
            }
        }
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.mPoints;
            Intrinsics.checkNotNull(fArr3);
            float f3 = fArr3[0];
            float[] fArr4 = this.mPoints;
            Intrinsics.checkNotNull(fArr4);
            canvas.drawCircle(f3, fArr4[1], 8.0f, this.mPaintKeyframes);
            float[] fArr5 = this.mPoints;
            Intrinsics.checkNotNull(fArr5);
            float[] fArr6 = this.mPoints;
            Intrinsics.checkNotNull(fArr6);
            float f4 = fArr5[fArr6.length - 2];
            float[] fArr7 = this.mPoints;
            Intrinsics.checkNotNull(fArr7);
            float[] fArr8 = this.mPoints;
            Intrinsics.checkNotNull(fArr8);
            canvas.drawCircle(f4, fArr7[fArr8.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    private final void drawPathRelativeTicks(Canvas canvas, float x, float y) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f2 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float f3 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        float[] fArr6 = this.mPoints;
        Intrinsics.checkNotNull(fArr6);
        float f4 = fArr5[fArr6.length - 1];
        float fHypot = (float) Math.hypot(f - f3, f2 - f4);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = (((x - f) * f5) + ((y - f2) * f6)) / (fHypot * fHypot);
        float f8 = f + (f5 * f7);
        float f9 = f2 + (f7 * f6);
        Path path = new Path();
        path.moveTo(x, y);
        path.lineTo(f8, f9);
        float fHypot2 = (float) Math.hypot(f8 - x, f9 - y);
        String str = "" + (((int) ((100 * fHypot2) / fHypot)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(x, y, f8, f9, this.mPaintGraph);
    }

    public final void getTextBounds(String text, Paint paint) {
        paint.getTextBounds(text, 0, text.length(), this.mBounds);
    }

    private final void drawPathCartesianTicks(Canvas canvas, float x, float y) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f2 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float f3 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        float[] fArr6 = this.mPoints;
        Intrinsics.checkNotNull(fArr6);
        float f4 = fArr5[fArr6.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMin2 = x - Math.min(f, f3);
        float fMax2 = Math.max(f2, f4) - y;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f5 = 100;
        sb.append(((int) (((f5 * fMin2) / Math.abs(f3 - f)) + 0.5d)) / 100.0f);
        String string2 = sb.toString();
        getTextBounds(string2, this.mTextPaint);
        float f6 = 2;
        canvas.drawText(string2, ((fMin2 / f6) - (this.mBounds.width() / 2)) + fMin, y - 20, this.mTextPaint);
        canvas.drawLine(x, y, Math.min(f, f3), y, this.mPaintGraph);
        String str = "" + (((int) (((f5 * fMax2) / Math.abs(f4 - f2)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, x + 5, fMax - ((fMax2 / f6) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x, y, x, Math.max(f2, f4), this.mPaintGraph);
    }

    private final void drawPathScreenTicks(Canvas canvas, float x, float y, int viewWidth, int viewHeight, int layoutWidth, int layoutHeight) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f = 100;
        sb.append(((int) ((((x - (viewWidth / 2)) * f) / (layoutWidth - viewWidth)) + 0.5d)) / 100.0f);
        String string2 = sb.toString();
        getTextBounds(string2, this.mTextPaint);
        float f2 = 2;
        canvas.drawText(string2, ((x / f2) - (this.mBounds.width() / 2)) + 0.0f, y - 20, this.mTextPaint);
        canvas.drawLine(x, y, Math.min(0.0f, 1.0f), y, this.mPaintGraph);
        String str = "" + (((int) (((f * (y - (viewHeight / 2))) / (layoutHeight - viewHeight)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, x + 5, 0.0f - ((y / f2) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x, y, x, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }
}
