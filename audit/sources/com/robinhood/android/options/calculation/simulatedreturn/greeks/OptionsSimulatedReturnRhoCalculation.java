package com.robinhood.android.options.calculation.simulatedreturn.greeks;

import com.robinhood.android.options.calculation.simulatedreturn.helper.CumulativeDistributionFunctionCalculation;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnRhoCalculation.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"calculateRho", "", "params", "Lcom/robinhood/models/db/simulatedreturns/OptionPricingParams;", "RHO_EPS", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionsSimulatedReturnRhoCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnRhoCalculation {
    public static final double RHO_EPS = 1.0E-4d;

    public static final double calculateRho(OptionPricingParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.getTau() <= 0.0d) {
            return 0.0d;
        }
        if (!params.isEuropean()) {
            return ((OptionsSimulatedReturnOptionPriceCalculation.calculateOptionPrice(params.copy((1919 & 1) != 0 ? params.optionId : null, (1919 & 2) != 0 ? params.impliedVolatility : 0.0d, (1919 & 4) != 0 ? params.isValidIv : false, (1919 & 8) != 0 ? params.markPrice : 0.0d, (1919 & 16) != 0 ? params.spotPrice : 0.0d, (1919 & 32) != 0 ? params.strikePrice : 0.0d, (1919 & 64) != 0 ? params.tau : 0.0d, (1919 & 128) != 0 ? params.interestRate : params.getInterestRate() + 1.0E-4d, (1919 & 256) != 0 ? params.dividendYield : 0.0d, (1919 & 512) != 0 ? params.isPut : false, (1919 & 1024) != 0 ? params.isEuropean : false)) - OptionsSimulatedReturnOptionPriceCalculation.calculateOptionPrice(params.copy((1919 & 1) != 0 ? params.optionId : null, (1919 & 2) != 0 ? params.impliedVolatility : 0.0d, (1919 & 4) != 0 ? params.isValidIv : false, (1919 & 8) != 0 ? params.markPrice : 0.0d, (1919 & 16) != 0 ? params.spotPrice : 0.0d, (1919 & 32) != 0 ? params.strikePrice : 0.0d, (1919 & 64) != 0 ? params.tau : 0.0d, (1919 & 128) != 0 ? params.interestRate : params.getInterestRate() - 1.0E-4d, (1919 & 256) != 0 ? params.dividendYield : 0.0d, (1919 & 512) != 0 ? params.isPut : false, (1919 & 1024) != 0 ? params.isEuropean : false))) / 2.0E-4d) / 100.0d;
        }
        double boundedVolatility = params.getBoundedVolatility();
        double dSqrt = Math.sqrt(params.getTau());
        double dLog = Math.log(params.getSpotPrice() / params.getStrikePrice()) + (((params.getInterestRate() - params.getDividendYield()) + (0.5d * boundedVolatility * boundedVolatility)) * params.getTau());
        double d = boundedVolatility * dSqrt;
        double d2 = (dLog / d) - d;
        return params.getTau() * params.getStrikePrice() * Math.exp((-params.getInterestRate()) * params.getTau()) * (params.isPut() ? -CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(-d2) : CumulativeDistributionFunctionCalculation.cumulativeDistributionFunction(d2)) * 0.01d;
    }
}
