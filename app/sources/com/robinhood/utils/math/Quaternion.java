package com.robinhood.utils.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Quaternion.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u001f\u001a\u00020\u0000J\u0006\u0010 \u001a\u00020\u0000J\u0006\u0010!\u001a\u00020\u0000J&\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0000J\u000e\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\u001e\u0010'\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003J\u001e\u0010(\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020#J\u0011\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0086\u0002J\u000e\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0000J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J1\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0016HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\n¨\u00068"}, m3636d2 = {"Lcom/robinhood/utils/math/Quaternion;", "", "w", "", "x", "y", "z", "<init>", "(FFFF)V", "getW", "()F", "setW", "(F)V", "getX", "setX", "getY", "setY", "getZ", "setZ", "squareNorm", "getSquareNorm", "gimbalPole", "", "getGimbalPole", "()I", "roll", "getRoll", "pitch", "getPitch", "yaw", "getYaw", "normalized", "conjugated", "inverse", "set", "", "other", "values", "", "setEulerAngles", "setEulerAnglesRadians", "invert", "times", "multiplicand", "multiply", "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "toString", "", "Companion", "lib-utils-math"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Quaternion {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float DEGREES_TO_RADIANS = 0.017453292f;
    private static final float FLOAT_ROUNDING_ERROR = 1.0E-6f;
    private float w;
    private float x;
    private float y;
    private float z;

    public Quaternion() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ Quaternion copy$default(Quaternion quaternion, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = quaternion.w;
        }
        if ((i & 2) != 0) {
            f2 = quaternion.x;
        }
        if ((i & 4) != 0) {
            f3 = quaternion.y;
        }
        if ((i & 8) != 0) {
            f4 = quaternion.z;
        }
        return quaternion.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getW() {
        return this.w;
    }

    /* renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component4, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    public final Quaternion copy(float w, float x, float y, float z) {
        return new Quaternion(w, x, y, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) other;
        return Float.compare(this.w, quaternion.w) == 0 && Float.compare(this.x, quaternion.x) == 0 && Float.compare(this.y, quaternion.y) == 0 && Float.compare(this.z, quaternion.z) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.w) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z);
    }

    public String toString() {
        return "Quaternion(w=" + this.w + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.w = f;
        this.x = f2;
        this.y = f3;
        this.z = f4;
    }

    public /* synthetic */ Quaternion(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public final float getW() {
        return this.w;
    }

    public final void setW(float f) {
        this.w = f;
    }

    public final float getX() {
        return this.x;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final float getY() {
        return this.y;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public final float getZ() {
        return this.z;
    }

    public final void setZ(float f) {
        this.z = f;
    }

    public final float getSquareNorm() {
        float f = this.w;
        float f2 = this.x;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.y;
        float f5 = f3 + (f4 * f4);
        float f6 = this.z;
        return f5 + (f6 * f6);
    }

    public final int getGimbalPole() {
        float f = (this.y * this.x) + (this.z * this.w);
        if (f > 0.499f) {
            return 1;
        }
        return f < -0.499f ? -1 : 0;
    }

    public final float getRoll() {
        int gimbalPole = getGimbalPole();
        if (gimbalPole == 0) {
            float f = this.w;
            float f2 = this.z;
            float f3 = this.y;
            float f4 = this.x;
            return (float) Math.atan2(((f * f2) + (f3 * f4)) * 2.0f, 1.0f - (((f4 * f4) + (f2 * f2)) * 2.0f));
        }
        return gimbalPole * 2.0f * ((float) Math.atan2(this.y, this.w));
    }

    public final float getPitch() {
        int gimbalPole = getGimbalPole();
        return gimbalPole == 0 ? (float) Math.asin(RangesKt.coerceIn(((this.w * this.x) - (this.z * this.y)) * 2.0f, -1.0f, 1.0f)) : gimbalPole * 3.1415927f * 0.5f;
    }

    public final float getYaw() {
        if (getGimbalPole() != 0) {
            return 0.0f;
        }
        float f = this.w * this.y;
        float f2 = this.x;
        return (float) Math.atan2((f + (this.z * f2)) * 2.0f, 1.0f - (((r0 * r0) + (f2 * f2)) * 2.0f));
    }

    public final Quaternion normalized() {
        float squareNorm = getSquareNorm();
        if (squareNorm != 0.0f && !INSTANCE.isAcceptablyEqualTo(squareNorm, 1.0f)) {
            float fSqrt = (float) Math.sqrt(squareNorm);
            return new Quaternion(this.w / fSqrt, this.x / fSqrt, this.y / fSqrt, this.z / fSqrt);
        }
        return copy$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public final Quaternion conjugated() {
        return new Quaternion(this.w, -this.x, -this.y, -this.z);
    }

    public final Quaternion inverse() {
        float squareNorm = getSquareNorm();
        return new Quaternion(this.w / squareNorm, (-this.x) / squareNorm, (-this.y) / squareNorm, (-this.z) / squareNorm);
    }

    public final void set(float w, float x, float y, float z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public final void set(Quaternion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        set(other.getW(), other.getX(), other.getY(), other.getZ());
    }

    public final void set(float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        set(values[0], values[1], values[2], values[3]);
    }

    public final void setEulerAngles(float roll, float pitch, float yaw) {
        setEulerAnglesRadians(roll * DEGREES_TO_RADIANS, pitch * DEGREES_TO_RADIANS, yaw * DEGREES_TO_RADIANS);
    }

    public final void setEulerAnglesRadians(float roll, float pitch, float yaw) {
        double d = roll * 0.5f;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        double d2 = pitch * 0.5f;
        float fSin2 = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        double d3 = yaw * 0.5f;
        float fSin3 = (float) Math.sin(d3);
        float fCos3 = (float) Math.cos(d3);
        float f = fCos3 * fSin2;
        float f2 = fSin3 * fCos2;
        float f3 = fCos3 * fCos2;
        float f4 = fSin3 * fSin2;
        this.w = (f3 * fCos) + (f4 * fSin);
        this.x = (f * fCos) + (f2 * fSin);
        this.y = (f2 * fCos) - (f * fSin);
        this.z = (f3 * fSin) - (f4 * fCos);
    }

    public final void invert() {
        float squareNorm = getSquareNorm();
        this.w /= squareNorm;
        float f = -squareNorm;
        this.x /= f;
        this.y /= f;
        this.z /= f;
    }

    public final Quaternion times(Quaternion multiplicand) {
        Intrinsics.checkNotNullParameter(multiplicand, "multiplicand");
        float f = this.w;
        float f2 = multiplicand.w;
        float f3 = this.x;
        float f4 = multiplicand.x;
        float f5 = this.y;
        float f6 = multiplicand.y;
        float f7 = ((f * f2) - (f3 * f4)) - (f5 * f6);
        float f8 = this.z;
        float f9 = multiplicand.z;
        return new Quaternion(f7 - (f8 * f9), (((f * f4) + (f3 * f2)) + (f5 * f9)) - (f8 * f6), (((f * f6) + (f5 * f2)) + (f8 * f4)) - (f3 * f9), (((f * f9) + (f8 * f2)) + (f3 * f6)) - (f5 * f4));
    }

    public final void multiply(Quaternion multiplicand) {
        Intrinsics.checkNotNullParameter(multiplicand, "multiplicand");
        float f = this.w;
        float f2 = multiplicand.x;
        float f3 = this.x;
        float f4 = multiplicand.w;
        float f5 = this.y;
        float f6 = multiplicand.z;
        float f7 = this.z;
        float f8 = multiplicand.y;
        this.x = (((f * f2) + (f3 * f4)) + (f5 * f6)) - (f7 * f8);
        this.y = (((f * f8) + (f5 * f4)) + (f7 * f2)) - (f3 * f6);
        this.z = (((f * f6) + (f7 * f4)) + (f3 * f8)) - (f5 * f2);
        this.w = (((f * f4) - (f3 * f2)) - (f5 * f8)) - (f7 * f6);
    }

    /* compiled from: Quaternion.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/math/Quaternion$Companion;", "", "<init>", "()V", "DEGREES_TO_RADIANS", "", "FLOAT_ROUNDING_ERROR", "isAcceptablyEqualTo", "", "other", "fromArray", "Lcom/robinhood/utils/math/Quaternion;", "values", "", "lib-utils-math"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAcceptablyEqualTo(float f, float f2) {
            return Math.abs(f - f2) <= Quaternion.FLOAT_ROUNDING_ERROR;
        }

        public final Quaternion fromArray(float[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            return new Quaternion(values[0], values[1], values[2], values[3]);
        }
    }
}
