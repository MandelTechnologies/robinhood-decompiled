package com.github.jinatonic.confetti.confetto;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;

/* loaded from: classes16.dex */
public abstract class Confetto {
    private float accelerationX;
    private float accelerationY;
    private int alpha;
    private Rect bound;
    private float currentRotation;
    protected float currentRotationalVelocity;
    protected float currentVelocityX;
    protected float currentVelocityY;
    private float currentX;
    private float currentY;
    private Interpolator fadeOutInterpolator;
    private long initialDelay;
    private float initialRotation;
    private float initialRotationalVelocity;
    private float initialVelocityX;
    private float initialVelocityY;
    private float initialX;
    private float initialY;
    private float millisToReachBound;
    private Long millisToReachTargetRotationalVelocity;
    private Long millisToReachTargetVelocityX;
    private Long millisToReachTargetVelocityY;
    private float overrideDeltaX;
    private float overrideDeltaY;
    private float overrideVelocityX;
    private float overrideVelocityY;
    private float overrideX;
    private float overrideY;
    private float percentageAnimated;
    private float rotationalAcceleration;
    private boolean startedAnimation;
    private Float targetRotationalVelocity;
    private Float targetVelocityX;
    private Float targetVelocityY;
    private boolean terminated;
    private boolean touchOverride;
    private long ttl;
    private VelocityTracker velocityTracker;
    private final Matrix matrix = new Matrix();
    private final Paint workPaint = new Paint(1);
    private final float[] workPairs = new float[2];

    protected abstract void drawInternal(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4);

    public abstract int getHeight();

    public abstract int getWidth();

    public void prepare(Rect rect) {
        this.bound = rect;
        this.millisToReachTargetVelocityX = computeMillisToReachTarget(this.targetVelocityX, this.initialVelocityX, this.accelerationX);
        this.millisToReachTargetVelocityY = computeMillisToReachTarget(this.targetVelocityY, this.initialVelocityY, this.accelerationY);
        this.millisToReachTargetRotationalVelocity = computeMillisToReachTarget(this.targetRotationalVelocity, this.initialRotationalVelocity, this.rotationalAcceleration);
        long j = this.ttl;
        this.millisToReachBound = j >= 0 ? j : 9.223372E18f;
        this.millisToReachBound = Math.min(computeBound(this.initialX, this.initialVelocityX, this.accelerationX, this.millisToReachTargetVelocityX, this.targetVelocityX, rect.left - getWidth(), rect.right), this.millisToReachBound);
        this.millisToReachBound = Math.min(computeBound(this.initialY, this.initialVelocityY, this.accelerationY, this.millisToReachTargetVelocityY, this.targetVelocityY, rect.top - getHeight(), rect.bottom), this.millisToReachBound);
        configurePaint(this.workPaint);
    }

    private boolean doesLocationIntercept(float f, float f2) {
        float f3 = this.currentX;
        if (f3 > f || f > f3 + getWidth()) {
            return false;
        }
        float f4 = this.currentY;
        return f4 <= f2 && f2 <= f4 + ((float) getHeight());
    }

    public boolean onTouchDown(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!doesLocationIntercept(x, y)) {
            return false;
        }
        this.touchOverride = true;
        this.overrideX = x;
        this.overrideY = y;
        this.overrideDeltaX = this.currentX - x;
        this.overrideDeltaY = this.currentY - y;
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        this.velocityTracker = velocityTrackerObtain;
        velocityTrackerObtain.addMovement(motionEvent);
        return true;
    }

    public void onTouchMove(MotionEvent motionEvent) {
        this.overrideX = motionEvent.getX();
        this.overrideY = motionEvent.getY();
        this.velocityTracker.addMovement(motionEvent);
        this.velocityTracker.computeCurrentVelocity(1);
        this.overrideVelocityX = this.velocityTracker.getXVelocity();
        this.overrideVelocityY = this.velocityTracker.getYVelocity();
    }

    public void onTouchUp(MotionEvent motionEvent) {
        this.velocityTracker.addMovement(motionEvent);
        this.velocityTracker.computeCurrentVelocity(1);
        this.initialDelay = -1L;
        this.initialX = motionEvent.getX() + this.overrideDeltaX;
        this.initialY = motionEvent.getY() + this.overrideDeltaY;
        this.initialVelocityX = this.velocityTracker.getXVelocity();
        this.initialVelocityY = this.velocityTracker.getYVelocity();
        this.initialRotation = this.currentRotation;
        this.velocityTracker.recycle();
        this.velocityTracker = null;
        prepare(this.bound);
        this.touchOverride = false;
    }

    protected static Long computeMillisToReachTarget(Float f, float f2, float f3) {
        if (f != null) {
            if (f3 != 0.0f) {
                long jFloatValue = (long) ((f.floatValue() - f2) / f3);
                return Long.valueOf(jFloatValue > 0 ? jFloatValue : 0L);
            }
            if (f.floatValue() < f2) {
                return 0L;
            }
        }
        return null;
    }

    protected static long computeBound(float f, float f2, float f3, Long l, Float f4, int i, int i2) {
        if (f3 == 0.0f) {
            if (l != null) {
                f2 = f4.floatValue();
            }
            if (f2 > 0.0f) {
                i = i2;
            }
            if (f2 != 0.0f) {
                double d = (i - f) / f2;
                if (d > 0.0d) {
                    return (long) d;
                }
            }
            return Long.MAX_VALUE;
        }
        if (f3 > 0.0f) {
            i = i2;
        }
        if (l == null || l.longValue() < 0) {
            float f5 = 2.0f * f3;
            double dSqrt = Math.sqrt(((i * f5) - (f5 * f)) + (f2 * f2));
            double d2 = f2;
            double d3 = f3;
            double d4 = ((-dSqrt) - d2) / d3;
            if (d4 > 0.0d) {
                return (long) d4;
            }
            double d5 = (dSqrt - d2) / d3;
            if (d5 > 0.0d) {
                return (long) d5;
            }
            return Long.MAX_VALUE;
        }
        double dLongValue = ((((i - f) - (f2 * l.longValue())) - (((f3 * 0.5d) * l.longValue()) * l.longValue())) + (f4.floatValue() * l.longValue())) / f4.floatValue();
        if (dLongValue > 0.0d) {
            return (long) dLongValue;
        }
        return Long.MAX_VALUE;
    }

    public void reset() {
        this.initialDelay = 0L;
        this.initialY = 0.0f;
        this.initialX = 0.0f;
        this.initialVelocityY = 0.0f;
        this.initialVelocityX = 0.0f;
        this.accelerationY = 0.0f;
        this.accelerationX = 0.0f;
        this.targetVelocityY = null;
        this.targetVelocityX = null;
        this.millisToReachTargetVelocityY = null;
        this.millisToReachTargetVelocityX = null;
        this.initialRotation = 0.0f;
        this.initialRotationalVelocity = 0.0f;
        this.rotationalAcceleration = 0.0f;
        this.targetRotationalVelocity = null;
        this.millisToReachTargetRotationalVelocity = null;
        this.ttl = 0L;
        this.millisToReachBound = 0.0f;
        this.percentageAnimated = 0.0f;
        this.fadeOutInterpolator = null;
        this.currentY = 0.0f;
        this.currentX = 0.0f;
        this.currentVelocityY = 0.0f;
        this.currentVelocityX = 0.0f;
        this.currentRotation = 0.0f;
        this.alpha = 255;
        this.startedAnimation = false;
        this.terminated = false;
    }

    protected void configurePaint(Paint paint) {
        paint.setAlpha(this.alpha);
    }

    public boolean applyUpdate(long j) {
        Confetto confetto;
        if (this.initialDelay == -1) {
            this.initialDelay = j;
        }
        long j2 = j - this.initialDelay;
        boolean z = false;
        boolean z2 = j2 >= 0;
        this.startedAnimation = z2;
        if (!z2 || this.terminated) {
            confetto = this;
        } else {
            confetto = this;
            confetto.computeDistance(this.workPairs, j2, this.initialX, this.initialVelocityX, this.accelerationX, this.millisToReachTargetVelocityX, this.targetVelocityX);
            float[] fArr = confetto.workPairs;
            confetto.currentX = fArr[0];
            confetto.currentVelocityX = fArr[1];
            confetto.computeDistance(fArr, j2, confetto.initialY, confetto.initialVelocityY, confetto.accelerationY, confetto.millisToReachTargetVelocityY, confetto.targetVelocityY);
            float[] fArr2 = confetto.workPairs;
            confetto.currentY = fArr2[0];
            confetto.currentVelocityY = fArr2[1];
            confetto.computeDistance(fArr2, j2, confetto.initialRotation, confetto.initialRotationalVelocity, confetto.rotationalAcceleration, confetto.millisToReachTargetRotationalVelocity, confetto.targetRotationalVelocity);
            float[] fArr3 = confetto.workPairs;
            confetto.currentRotation = fArr3[0];
            confetto.currentRotationalVelocity = fArr3[1];
            Interpolator interpolator = confetto.fadeOutInterpolator;
            if (interpolator != null) {
                confetto.alpha = (int) (interpolator.getInterpolation(j2 / confetto.millisToReachBound) * 255.0f);
            } else {
                confetto.alpha = 255;
            }
            if (!confetto.touchOverride && j2 >= confetto.millisToReachBound) {
                z = true;
            }
            confetto.terminated = z;
            confetto.percentageAnimated = Math.min(1.0f, j2 / confetto.millisToReachBound);
        }
        return !confetto.terminated;
    }

    private void computeDistance(float[] fArr, long j, float f, float f2, float f3, Long l, Float f4) {
        float f5 = j;
        fArr[1] = (f3 * f5) + f2;
        if (l == null || j < l.longValue()) {
            fArr[0] = f + (f2 * f5) + (f3 * 0.5f * f5 * f5);
        } else {
            fArr[0] = f + (f2 * l.longValue()) + (f3 * 0.5f * l.longValue() * l.longValue()) + ((j - l.longValue()) * f4.floatValue());
        }
    }

    public void draw(Canvas canvas) {
        if (this.touchOverride) {
            this.currentVelocityX = this.overrideVelocityX;
            this.currentVelocityY = this.overrideVelocityY;
            draw(canvas, this.overrideX + this.overrideDeltaX, this.overrideY + this.overrideDeltaY, this.currentRotation, this.percentageAnimated);
        } else {
            if (!this.startedAnimation || this.terminated) {
                return;
            }
            draw(canvas, this.currentX, this.currentY, this.currentRotation, this.percentageAnimated);
        }
    }

    private void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.save();
        canvas.clipRect(this.bound);
        this.matrix.reset();
        this.workPaint.setAlpha(this.alpha);
        drawInternal(canvas, this.matrix, this.workPaint, f, f2, f3, f4);
        canvas.restore();
    }

    public void setInitialDelay(long j) {
        this.initialDelay = j;
    }

    public void setInitialX(float f) {
        this.initialX = f;
    }

    public void setInitialY(float f) {
        this.initialY = f;
    }

    public void setInitialVelocityX(float f) {
        this.initialVelocityX = f;
    }

    public void setInitialVelocityY(float f) {
        this.initialVelocityY = f;
    }

    public void setAccelerationX(float f) {
        this.accelerationX = f;
    }

    public void setAccelerationY(float f) {
        this.accelerationY = f;
    }

    public void setTargetVelocityX(Float f) {
        this.targetVelocityX = f;
    }

    public void setTargetVelocityY(Float f) {
        this.targetVelocityY = f;
    }

    public void setInitialRotation(float f) {
        this.initialRotation = f;
    }

    public void setInitialRotationalVelocity(float f) {
        this.initialRotationalVelocity = f;
    }

    public void setRotationalAcceleration(float f) {
        this.rotationalAcceleration = f;
    }

    public void setTargetRotationalVelocity(Float f) {
        this.targetRotationalVelocity = f;
    }

    public void setTTL(long j) {
        this.ttl = j;
    }

    public void setFadeOut(Interpolator interpolator) {
        this.fadeOutInterpolator = interpolator;
    }
}
