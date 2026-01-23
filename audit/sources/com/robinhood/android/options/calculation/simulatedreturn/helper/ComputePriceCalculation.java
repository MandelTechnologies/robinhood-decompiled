package com.robinhood.android.options.calculation.simulatedreturn.helper;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: ComputePriceCalculation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\u001a=\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"computePrice", "", Constants.RequestParamsKeys.SESSION_ID_KEY, Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, "t", Constants.REVENUE_AMOUNT_KEY, "b", "sigma", "(DDDDDD)Ljava/lang/Double;", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.ComputePriceCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ComputePriceCalculation {
    public static final Double computePrice(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d6 * d6;
        double d8 = 0.5d * d7;
        double d9 = d5 - d8;
        double dSqrt = ((d8 - d5) + Math.sqrt((d9 * d9) + ((2 * d4) * d7))) / d7;
        double d10 = dSqrt - 1.0d;
        double d11 = (d2 * dSqrt) / d10;
        double d12 = d4 / (d4 - d5);
        double dMax = Math.max(d12, 1.0d) * d2;
        double dMax2 = Math.max(d12, 1.0d);
        double dMax3 = Math.max((-((d5 * d3) + (2.0d * d6 * Math.sqrt(d3)))) * (dMax2 / ((dSqrt / d10) - dMax2)), -30.0d);
        if (dMax3 > 700.0d) {
            return null;
        }
        double dExp = dMax + ((d11 - dMax) * (1 - Math.exp(dMax3)));
        if (d >= dExp) {
            return Double.valueOf(IntrinsicValueCalculation.intrinsicValue(d, d2));
        }
        double dPow = (dExp - d2) * Math.pow(dExp, -dSqrt);
        double dPow2 = (((((dPow * Math.pow(d, dSqrt)) - (dPow * PhiCalculation.phi(d, d3, d4, d5, d6, d7, dSqrt, dExp, dExp))) + PhiCalculation.phi(d, d3, d4, d5, d6, d7, 1.0d, dExp, dExp)) - PhiCalculation.phi(d, d3, d4, d5, d6, d7, 1.0d, d2, dExp)) - (PhiCalculation.phi(d, d3, d4, d5, d6, d7, 0.0d, dExp, dExp) * d2)) + (PhiCalculation.phi(d, d3, d4, d5, d6, d7, 0.0d, d2, dExp) * d2);
        if (Math.abs(dPow2) <= Double.MAX_VALUE) {
            return Double.valueOf(Math.max(dPow2, IntrinsicValueCalculation.intrinsicValue(d, d2)));
        }
        return null;
    }
}
