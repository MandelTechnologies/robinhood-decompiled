package com.robinhood.android.options.calculation.simulatedreturn.helper;

import kotlin.Metadata;

/* compiled from: CoerceAtLeastEpsilonCalculation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m3636d2 = {"coerceAtLeastEpsilon", "", "value", "EPSILON", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.CoerceAtLeastEpsilonCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CoerceAtLeastEpsilonCalculation {
    public static final double EPSILON = 1.0E-8d;

    public static final double coerceAtLeastEpsilon(double d) {
        if (d > 1.0E-8d) {
            return d;
        }
        return 1.0E-8d;
    }
}
