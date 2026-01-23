package com.google.common.math;

import com.google.common.base.Preconditions;

/* loaded from: classes27.dex */
final class DoubleUtils {
    static long getSignificand(double d) {
        Preconditions.checkArgument(isFinite(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean isFinite(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
