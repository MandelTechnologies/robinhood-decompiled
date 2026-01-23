package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SpringEstimation.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n\u001a7\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0010\u001aG\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "estimateAnimationDurationMillis", "(FFFFF)J", "", "(DDDDD)J", "firstRootReal", "firstRootImaginary", "p0", "v0", "estimateUnderDamped", "(DDDDD)D", "estimateCriticallyDamped", "(DDDD)D", "secondRootReal", "estimateOverDamped", "initialPosition", "estimateDurationInternal", "(DDDDDDD)J", "animation-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.animation.core.SpringEstimationKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class SpringEstimation {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        if (f2 == 0.0f) {
            return 9223372036854L;
        }
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        double dSqrt = 2.0d * d2 * Math.sqrt(d);
        double d6 = (dSqrt * dSqrt) - (4.0d * d);
        double dSqrt2 = d6 < 0.0d ? 0.0d : Math.sqrt(d6);
        double d7 = -dSqrt;
        return estimateDurationInternal((d7 + dSqrt2) * 0.5d, (d6 < 0.0d ? Math.sqrt(Math.abs(d6)) : 0.0d) * 0.5d, (d7 - dSqrt2) * 0.5d, d2, d3, d4, d5);
    }

    private static final double estimateUnderDamped(double d, double d2, double d3, double d4, double d5) {
        double d6 = (d4 - (d * d3)) / d2;
        return Math.log(d5 / Math.sqrt((d3 * d3) + (d6 * d6))) / d;
    }

    private static final double estimateCriticallyDamped(double d, double d2, double d3, double d4) {
        double d5 = d4;
        double d6 = d * d2;
        double d7 = d3 - d6;
        double dLog = Math.log(Math.abs(d5 / d2)) / d;
        double dLog2 = Math.log(Math.abs(d5 / d7));
        int i = 0;
        double dLog3 = dLog2;
        for (int i2 = 0; i2 < 6; i2++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d));
        }
        double d8 = dLog3 / d;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d8;
        } else if ((Double.doubleToRawLongBits(d8) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d8);
        }
        double d9 = (-(d6 + d7)) / (d * d7);
        double d10 = d * d9;
        double dExp = (Math.exp(d10) * d2) + (d7 * d9 * Math.exp(d10));
        if (Double.isNaN(d9) || d9 <= 0.0d) {
            d5 = -d5;
        } else if (d9 <= 0.0d || (-dExp) >= d5) {
            dLog = (-(2.0d / d)) - (d2 / d7);
        } else {
            if (d7 < 0.0d && d2 > 0.0d) {
                dLog = 0.0d;
            }
            d5 = -d5;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i < 100) {
            i++;
            double d11 = d * dLog;
            double d12 = d5;
            double dExp2 = dLog - ((((d2 + (d7 * dLog)) * Math.exp(d11)) + d5) / ((((1 + d11) * d7) + d6) * Math.exp(d11)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d5 = d12;
        }
        return dLog;
    }

    private static final double estimateOverDamped(double d, double d2, double d3, double d4, double d5) {
        double d6 = d5;
        double d7 = d - d2;
        double d8 = ((d * d3) - d4) / d7;
        double d9 = d3 - d8;
        double dLog = Math.log(Math.abs(d6 / d9)) / d;
        double dLog2 = Math.log(Math.abs(d6 / d8)) / d2;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d10 = d9 * d;
        double dLog3 = Math.log(d10 / ((-d8) * d2)) / (d2 - d);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d6 = -d6;
        } else if (dLog3 <= 0.0d || (-estimateOverDamped$xInflection(d9, d, dLog3, d8, d2)) >= d6) {
            dLog = Math.log((-((d8 * d2) * d2)) / (d10 * d)) / d7;
        } else {
            if (d8 > 0.0d && d9 < 0.0d) {
                dLog = 0.0d;
            }
            d6 = -d6;
        }
        double d11 = d8 * d2;
        if (Math.abs((Math.exp(d * dLog) * d10) + (Math.exp(d2 * dLog) * d11)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i = 0;
        while (dAbs > 0.001d && i < 100) {
            i++;
            double d12 = d * dLog;
            double d13 = d2 * dLog;
            double dExp = dLog - ((((Math.exp(d12) * d9) + (Math.exp(d13) * d8)) + d6) / ((Math.exp(d12) * d10) + (Math.exp(d13) * d11)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double estimateOverDamped$xInflection(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final long estimateDurationInternal(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double dEstimateCriticallyDamped;
        double d8 = d5;
        if (d6 == 0.0d && d8 == 0.0d) {
            return 0L;
        }
        if (d6 < 0.0d) {
            d8 = -d8;
        }
        double d9 = d8;
        double dAbs = Math.abs(d6);
        if (d4 > 1.0d) {
            dEstimateCriticallyDamped = estimateOverDamped(d, d3, dAbs, d9, d7);
        } else if (d4 < 1.0d) {
            dEstimateCriticallyDamped = estimateUnderDamped(d, d2, dAbs, d9, d7);
        } else {
            dEstimateCriticallyDamped = estimateCriticallyDamped(d, dAbs, d9, d7);
        }
        return (long) (dEstimateCriticallyDamped * 1000.0d);
    }
}
