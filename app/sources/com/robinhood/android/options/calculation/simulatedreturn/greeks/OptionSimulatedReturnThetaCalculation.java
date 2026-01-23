package com.robinhood.android.options.calculation.simulatedreturn.greeks;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.calculation.simulatedreturn.helper.CumulativeDistributionFunctionCalculation;
import com.robinhood.android.options.calculation.simulatedreturn.helper.ProbabilityDensityFunctionCalculation;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSimulatedReturnThetaCalculation.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a&\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"calculateTheta", "", "params", "Lcom/robinhood/models/db/simulatedreturns/OptionPricingParams;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "calculate0DteTheta", "spotPrice", "strikePrice", "isPut", "", "ONE_YEAR_IN_DAYS", "ONE_DAY_IN_YEARS", "THETA_EPS", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionSimulatedReturnThetaCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSimulatedReturnThetaCalculation {
    public static final double ONE_DAY_IN_YEARS = 0.0027397260273972603d;
    public static final double ONE_YEAR_IN_DAYS = 365.0d;
    public static final double THETA_EPS = 1.0E-6d;

    public static final double calculateTheta(OptionPricingParams params, double d) {
        double spotPrice;
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.getTau() <= 0.0d) {
            return 0.0d;
        }
        if (params.getTau() <= 0.0027397260273972603d) {
            return calculate0DteTheta(params.getSpotPrice(), params.getStrikePrice(), params.isPut(), d);
        }
        if (params.isEuropean()) {
            double boundedVolatility = params.getBoundedVolatility();
            double dSqrt = Math.sqrt(params.getTau());
            double dLog = Math.log(params.getSpotPrice() / params.getStrikePrice()) + (((params.getInterestRate() - params.getDividendYield()) + (0.5d * boundedVolatility * boundedVolatility)) * params.getTau());
            double d2 = boundedVolatility * dSqrt;
            double d3 = dLog / d2;
            double d4 = d3 - d2;
            double dProbabilityDensityFunction = ProbabilityDensityFunctionCalculation.probabilityDensityFunction(d3);
            double dExp = Math.exp((-params.getDividendYield()) * params.getTau());
            double dExp2 = Math.exp((-params.getInterestRate()) * params.getTau());
            double spotPrice2 = (((params.getSpotPrice() * dExp) * dProbabilityDensityFunction) * boundedVolatility) / (dSqrt * 2.0d);
            if (params.isPut()) {
                spotPrice = (-spotPrice2) + ((-params.getDividendYield()) * params.getSpotPrice() * dExp * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(-d3)) + (params.getInterestRate() * params.getStrikePrice() * dExp2 * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(-d4));
            } else {
                spotPrice = ((-spotPrice2) - ((((-params.getDividendYield()) * params.getSpotPrice()) * dExp) * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(d3))) - (((params.getInterestRate() * params.getStrikePrice()) * dExp2) * CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(d4));
            }
            return spotPrice / 365.0d;
        }
        return ((OptionsSimulatedReturnOptionPriceCalculation.calculateOptionPrice(params.copy((1919 & 1) != 0 ? params.optionId : null, (1919 & 2) != 0 ? params.impliedVolatility : 0.0d, (1919 & 4) != 0 ? params.isValidIv : false, (1919 & 8) != 0 ? params.markPrice : 0.0d, (1919 & 16) != 0 ? params.spotPrice : 0.0d, (1919 & 32) != 0 ? params.strikePrice : 0.0d, (1919 & 64) != 0 ? params.tau : params.getTau() - 1.0E-6d, (1919 & 128) != 0 ? params.interestRate : 0.0d, (1919 & 256) != 0 ? params.dividendYield : 0.0d, (1919 & 512) != 0 ? params.isPut : false, (1919 & 1024) != 0 ? params.isEuropean : false)) - OptionsSimulatedReturnOptionPriceCalculation.calculateOptionPrice(params)) / 1.0E-6d) / 365.0d;
    }

    public static final double calculate0DteTheta(double d, double d2, boolean z, double d3) {
        if ((!z && d > d2) || (z && d < d2)) {
            d3 = Math.max(d3 - Math.abs(d - d2), 0.0d);
        }
        return -d3;
    }
}
