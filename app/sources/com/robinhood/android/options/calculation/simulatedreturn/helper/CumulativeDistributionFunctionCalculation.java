package com.robinhood.android.options.calculation.simulatedreturn.helper;

import kotlin.Metadata;

/* compiled from: CumulativeDistributionFunctionCalculation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"cumulativeDistributionFunction", "", "x", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.CumulativeDistributionFunctionCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CumulativeDistributionFunctionCalculation {
    public static final double cumulativeDistributionFunction(double d) {
        double d2;
        double dAbs = Math.abs(d);
        if (dAbs > 37.0d) {
            d2 = 0.0d;
        } else {
            double d3 = 2;
            double dExp = Math.exp(((-dAbs) * dAbs) / d3);
            d2 = dAbs < 7.07106781186547d ? (dExp * ((((((((((((0.0352624965998911d * dAbs) + 0.700383064443688d) * dAbs) + 6.37396220353165d) * dAbs) + 33.912866078383d) * dAbs) + 112.079291497871d) * dAbs) + 221.213596169931d) * dAbs) + 220.206867912376d)) / ((((((((((((((0.0883883476483184d * dAbs) + 1.75566716318264d) * dAbs) + 16.064177579207d) * dAbs) + 86.7807322029461d) * dAbs) + 296.564248779674d) * dAbs) + 637.333633378831d) * dAbs) + 793.826512519948d) * dAbs) + 440.413735824752d) : dExp / ((dAbs + (1 / ((d3 / ((3 / ((4 / (0.65d + dAbs)) + dAbs)) + dAbs)) + dAbs))) * 2.506628274631d);
        }
        return d > 0.0d ? 1 - d2 : d2;
    }
}
