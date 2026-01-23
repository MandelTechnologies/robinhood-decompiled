package com.robinhood.android.options.calculation.simulatedreturn.helper;

import kotlin.Metadata;

/* compiled from: BlackScholesCalculation.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"blackScholes", "", "spotPrice", "strikePrice", "tau", "volatility", "interestRate", "dividendYield", "isPut", "", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.BlackScholesCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BlackScholesCalculation {
    public static final double blackScholes(double d, double d2, double d3, double d4, double d5, double d6, boolean z) {
        if (d3 <= 0.0d) {
            double d7 = z ? d2 : d;
            if (!z) {
                d = d2;
            }
            return IntrinsicValueCalculation.intrinsicValue(d7, d);
        }
        double dCoerceAtLeastEpsilon = CoerceAtLeastEpsilonCalculation.coerceAtLeastEpsilon(d4);
        double d8 = d5 - d6;
        double dSqrt = Math.sqrt(d3) * dCoerceAtLeastEpsilon;
        double dExp = Math.exp((d8 - d5) * d3) * d;
        double dExp2 = Math.exp((-d5) * d3) * d2;
        double dLog = (Math.log(d / d2) + ((d8 + ((dCoerceAtLeastEpsilon * dCoerceAtLeastEpsilon) / 2)) * d3)) / dSqrt;
        double d9 = dLog - dSqrt;
        return !z ? (dExp * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(dLog)) - (dExp2 * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(d9)) : (dExp2 * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(-d9)) - (dExp * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(-dLog));
    }
}
