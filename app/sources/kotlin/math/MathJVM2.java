package kotlin.math;

import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MathJVM.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\f\"\u001e\u0010\u0011\u001a\u00020\u0001*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\"\u001e\u0010\u0011\u001a\u00020\u0001*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"", "", "roundToInt", "(D)I", "", "roundToLong", "(D)J", "", "x", "log2", "(F)F", "(F)I", "(F)J", "getSign", "(I)I", "getSign$annotations", "(I)V", "sign", "(J)I", "(J)V", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/math/MathKt")
/* renamed from: kotlin.math.MathKt__MathJVMKt, reason: use source file name */
/* loaded from: classes21.dex */
public class MathJVM2 extends MathH {
    @SinceKotlin
    public static int roundToInt(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    @SinceKotlin
    public static long roundToLong(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    @SinceKotlin
    public static float log2(float f) {
        return (float) (Math.log(f) / MathJVM.LN2);
    }

    @SinceKotlin
    public static int roundToInt(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    @SinceKotlin
    public static long roundToLong(float f) {
        return roundToLong(f);
    }

    public static int getSign(int i) {
        return Integer.signum(i);
    }

    public static int getSign(long j) {
        return Long.signum(j);
    }
}
