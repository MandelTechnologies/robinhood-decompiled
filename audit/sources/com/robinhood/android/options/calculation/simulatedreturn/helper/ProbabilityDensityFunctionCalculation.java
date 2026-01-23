package com.robinhood.android.options.calculation.simulatedreturn.helper;

import kotlin.Metadata;

/* compiled from: ProbabilityDensityFunctionCalculation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"probabilityDensityFunction", "", "x", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.ProbabilityDensityFunctionCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProbabilityDensityFunctionCalculation {
    public static final double probabilityDensityFunction(double d) {
        return (1.0d / Math.sqrt(6.283185307179586d)) * Math.exp((-0.5d) * d * d);
    }
}
