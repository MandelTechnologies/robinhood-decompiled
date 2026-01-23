package com.google.maps.android;

/* loaded from: classes27.dex */
class MathUtil {
    static double hav(double d) {
        double dSin = Math.sin(d * 0.5d);
        return dSin * dSin;
    }

    static double arcHav(double d) {
        return Math.asin(Math.sqrt(d)) * 2.0d;
    }

    static double havDistance(double d, double d2, double d3) {
        return hav(d - d2) + (hav(d3) * Math.cos(d) * Math.cos(d2));
    }
}
