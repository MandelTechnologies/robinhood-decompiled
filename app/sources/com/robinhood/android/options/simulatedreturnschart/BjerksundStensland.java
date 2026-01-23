package com.robinhood.android.options.simulatedreturnschart;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: BjerksundStensland.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001aH\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0001\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a?\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0014\u001aP\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0002\u001a>\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a>\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001H\u0002\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"bjerksundStensland", "", "spotPrice", "strikePrice", "tau", "volatility", "interestRate", "dividendYield", "isPut", "", "bjerksundStenslandDelta", "epsilon", "intrinsicValue", Constants.RequestParamsKeys.SESSION_ID_KEY, Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, "computePrice", "t", Constants.REVENUE_AMOUNT_KEY, "b", "sigma", "(DDDDDD)Ljava/lang/Double;", "phi", "variance", "gamma", "h", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "blackScholes", "blackScholesModelDelta", "cdf", "x", "EPSILON", "coerceAtLeastEpsilon", "value", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.simulatedreturnschart.BjerksundStenslandKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BjerksundStensland {
    private static final double EPSILON = 1.0E-8d;

    private static final double coerceAtLeastEpsilon(double d) {
        if (d > 1.0E-8d) {
            return d;
        }
        return 1.0E-8d;
    }

    public static final double bjerksundStensland(double d, double d2, double d3, double d4, double d5, double d6, boolean z) {
        double dCoerceAtLeastEpsilon;
        double d7 = z ? d2 : d;
        double d8 = z ? d : d2;
        double d9 = z ? d6 : d5;
        if (z) {
            dCoerceAtLeastEpsilon = d6 - coerceAtLeastEpsilon(d5);
        } else {
            dCoerceAtLeastEpsilon = d5 - coerceAtLeastEpsilon(d6);
        }
        double d10 = dCoerceAtLeastEpsilon;
        double dCoerceAtLeastEpsilon2 = coerceAtLeastEpsilon(d4);
        if (d3 == 0.0d) {
            return intrinsicValue(d7, d8);
        }
        Double dComputePrice = computePrice(d7, d8, d3, d9, d10, dCoerceAtLeastEpsilon2);
        return dComputePrice != null ? dComputePrice.doubleValue() : blackScholes(d, d2, d3, d4, d5, d6, z);
    }

    public static final double bjerksundStenslandDelta(double d, double d2, double d3, double d4, double d5, double d6, boolean z, double d7) {
        if (d7 == 0.0d) {
            throw new IllegalStateException("epsilon can't be zero");
        }
        return (bjerksundStensland(d + d7, d2, d3, d4, d5, d6, z) - bjerksundStensland(d - d7, d2, d3, d4, d5, d6, z)) / (2 * d7);
    }

    private static final double intrinsicValue(double d, double d2) {
        return Math.max(d - d2, 0.0d);
    }

    private static final Double computePrice(double d, double d2, double d3, double d4, double d5, double d6) {
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
            return Double.valueOf(intrinsicValue(d, d2));
        }
        double dPow = (dExp - d2) * Math.pow(dExp, -dSqrt);
        double dPow2 = (((((dPow * Math.pow(d, dSqrt)) - (dPow * phi(d, d3, d4, d5, d6, d7, dSqrt, dExp, dExp))) + phi(d, d3, d4, d5, d6, d7, 1.0d, dExp, dExp)) - phi(d, d3, d4, d5, d6, d7, 1.0d, d2, dExp)) - (phi(d, d3, d4, d5, d6, d7, 0.0d, dExp, dExp) * d2)) + (phi(d, d3, d4, d5, d6, d7, 0.0d, d2, dExp) * d2);
        if (Math.abs(dPow2) <= Double.MAX_VALUE) {
            return Double.valueOf(Math.max(dPow2, intrinsicValue(d, d2)));
        }
        return null;
    }

    private static final double phi(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = ((-d3) + (d7 * d4) + (d7 * 0.5d * (d7 - 1.0d) * d6)) * d2;
        double dSqrt = (-(Math.log(d / d8) + ((d4 + ((d7 - 0.5d) * d6)) * d2))) / (Math.sqrt(d2) * d5);
        double d11 = ((d4 * 2.0d) / d6) + ((d7 * 2.0d) - 1.0d);
        double dCdf = cdf(dSqrt);
        double d12 = d9 / d;
        double dCdf2 = cdf(dSqrt - ((Math.log(d12) * 2.0d) / (Math.sqrt(d2) * d5)));
        if (dCdf - dCdf2 < 1.0E-8d) {
            return 0.0d;
        }
        return Math.exp(d10) * Math.pow(d, d7) * (dCdf - (Math.pow(d12, d11) * dCdf2));
    }

    public static final double blackScholes(double d, double d2, double d3, double d4, double d5, double d6, boolean z) {
        if (d3 == 0.0d) {
            double d7 = z ? d2 : d;
            if (!z) {
                d = d2;
            }
            return intrinsicValue(d7, d);
        }
        double dCoerceAtLeastEpsilon = coerceAtLeastEpsilon(d4);
        double d8 = d5 - d6;
        double dSqrt = Math.sqrt(d3) * dCoerceAtLeastEpsilon;
        double dExp = Math.exp((d8 - d5) * d3) * d;
        double dExp2 = Math.exp((-d5) * d3) * d2;
        double dLog = (Math.log(d / d2) + ((d8 + ((dCoerceAtLeastEpsilon * dCoerceAtLeastEpsilon) / 2)) * d3)) / dSqrt;
        double d9 = dLog - dSqrt;
        return !z ? (dExp * cdf(dLog)) - (dExp2 * cdf(d9)) : (dExp2 * cdf(-d9)) - (dExp * cdf(-dLog));
    }

    public static final double blackScholesModelDelta(double d, double d2, double d3, double d4, double d5, double d6, boolean z) {
        if (d3 == 0.0d) {
            return z ? d < d2 ? -1.0d : 0.0d : d > d2 ? 1.0d : 0.0d;
        }
        double dCoerceAtLeastEpsilon = coerceAtLeastEpsilon(d4);
        double dCdf = cdf((Math.log(d / d2) + (((d5 - d6) + ((0.5d * dCoerceAtLeastEpsilon) * dCoerceAtLeastEpsilon)) * d3)) / (dCoerceAtLeastEpsilon * Math.sqrt(d3)));
        double dExp = Math.exp((-d6) * d3);
        return z ? dExp * (dCdf - 1) : dExp * dCdf;
    }

    private static final double cdf(double d) {
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
