package com.twilio.util;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: Fibonacci.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"kFi", "", "kSqrt5", "fibonacci", Constants.RequestParamsKeys.APP_NAME_KEY, "", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.FibonacciKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Fibonacci2 {
    private static final double kFi;
    private static final double kSqrt5;

    static {
        double dSqrt = Math.sqrt(5.0d);
        kSqrt5 = dSqrt;
        kFi = (1 + dSqrt) / 2;
    }

    public static final double fibonacci(int i) {
        return Math.rint(Math.pow(kFi, i) / kSqrt5);
    }
}
