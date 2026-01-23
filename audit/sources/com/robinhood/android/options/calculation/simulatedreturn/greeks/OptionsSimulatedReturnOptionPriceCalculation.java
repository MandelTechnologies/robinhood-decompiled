package com.robinhood.android.options.calculation.simulatedreturn.greeks;

import com.robinhood.android.options.calculation.simulatedreturn.helper.BjerksundStenslandCalculation;
import com.robinhood.android.options.calculation.simulatedreturn.helper.BlackScholesCalculation;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnOptionPriceCalculation.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"calculateOptionPrice", "", "params", "Lcom/robinhood/models/db/simulatedreturns/OptionPricingParams;", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionsSimulatedReturnOptionPriceCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnOptionPriceCalculation {
    public static final double calculateOptionPrice(OptionPricingParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.isEuropean()) {
            return BlackScholesCalculation.blackScholes(params.getSpotPrice(), params.getStrikePrice(), params.getTau(), params.getBoundedVolatility(), params.getInterestRate(), params.getDividendYield(), params.isPut());
        }
        return BjerksundStenslandCalculation.bjerksundStensland(params.getSpotPrice(), params.getStrikePrice(), params.getTau(), params.getBoundedVolatility(), params.getInterestRate(), params.getDividendYield(), params.isPut());
    }
}
