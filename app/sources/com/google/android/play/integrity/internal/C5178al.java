package com.google.android.play.integrity.internal;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.al */
/* loaded from: classes27.dex */
public final class C5178al {
    /* renamed from: a */
    public static int m946a(int i, int i2, String str) {
        String strM950a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM950a = C5179am.m950a("%s (%s) must not be negative", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            strM950a = C5179am.m950a("%s (%s) must be less than size (%s)", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM950a);
    }

    /* renamed from: b */
    public static int m947b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m949d(i, i2, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX));
        }
        return i;
    }

    /* renamed from: c */
    public static void m948c(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m949d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m949d(i2, i3, "end index") : C5179am.m950a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: d */
    private static String m949d(int i, int i2, String str) {
        if (i < 0) {
            return C5179am.m950a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C5179am.m950a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
