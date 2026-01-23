package com.robinhood.android.options.calculation.simulatedreturn.helper;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: PhiCalculation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\u001aN\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001¨\u0006\u000b"}, m3636d2 = {"phi", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "t", Constants.REVENUE_AMOUNT_KEY, "b", "sigma", "variance", "gamma", "h", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.PhiCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PhiCalculation {
    public static final double phi(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = ((-d3) + (d7 * d4) + (d7 * 0.5d * (d7 - 1.0d) * d6)) * d2;
        double dSqrt = (-(Math.log(d / d8) + ((d4 + ((d7 - 0.5d) * d6)) * d2))) / (Math.sqrt(d2) * d5);
        double d11 = ((d4 * 2.0d) / d6) + ((d7 * 2.0d) - 1.0d);
        double dCumulativeDistributionFunction = CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(dSqrt);
        double d12 = d9 / d;
        double dCumulativeDistributionFunction2 = CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(dSqrt - ((Math.log(d12) * 2.0d) / (Math.sqrt(d2) * d5)));
        if (dCumulativeDistributionFunction - dCumulativeDistributionFunction2 < 1.0E-8d) {
            return 0.0d;
        }
        return Math.exp(d10) * Math.pow(d, d7) * (dCumulativeDistributionFunction - (Math.pow(d12, d11) * dCumulativeDistributionFunction2));
    }
}
