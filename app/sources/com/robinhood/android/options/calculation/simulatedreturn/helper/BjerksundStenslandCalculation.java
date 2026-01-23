package com.robinhood.android.options.calculation.simulatedreturn.helper;

import kotlin.Metadata;

/* compiled from: BjerksundStenslandCalculation.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"bjerksundStensland", "", "spotPrice", "strikePrice", "tau", "volatility", "interestRate", "dividendYield", "isPut", "", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.BjerksundStenslandCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BjerksundStenslandCalculation {
    public static final double bjerksundStensland(double d, double d2, double d3, double d4, double d5, double d6, boolean z) {
        double dCoerceAtLeastEpsilon;
        double d7 = z ? d2 : d;
        double d8 = z ? d : d2;
        double d9 = z ? d6 : d5;
        if (z) {
            dCoerceAtLeastEpsilon = d6 - CoerceAtLeastEpsilonCalculation.coerceAtLeastEpsilon(d5);
        } else {
            dCoerceAtLeastEpsilon = d5 - CoerceAtLeastEpsilonCalculation.coerceAtLeastEpsilon(d6);
        }
        double d10 = dCoerceAtLeastEpsilon;
        double dCoerceAtLeastEpsilon2 = CoerceAtLeastEpsilonCalculation.coerceAtLeastEpsilon(d4);
        if (d3 <= 0.0d) {
            return IntrinsicValueCalculation.intrinsicValue(d7, d8);
        }
        Double dComputePrice = ComputePriceCalculation.computePrice(d7, d8, d3, d9, d10, dCoerceAtLeastEpsilon2);
        return dComputePrice != null ? dComputePrice.doubleValue() : BlackScholesCalculation.blackScholes(d, d2, d3, d4, d5, d6, z);
    }
}
