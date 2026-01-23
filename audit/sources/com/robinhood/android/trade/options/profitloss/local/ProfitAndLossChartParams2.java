package com.robinhood.android.trade.options.profitloss.local;

import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;

/* compiled from: ProfitAndLossChartParams.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, m3636d2 = {"toProfitAndLossChartLeg", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartLeg;", "Lcom/robinhood/models/ui/OptionSimulatedChartLegBundle;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "expirationTime", "Lkotlinx/datetime/Instant;", "impliedVolatility", "", "interestRate", "dividendYield", "feature-options-pl-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParamsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ProfitAndLossChartParams2 {
    public static final ProfitAndLossChartLeg toProfitAndLossChartLeg(OptionSimulatedChartLegBundle optionSimulatedChartLegBundle, OptionChain.UnderlyingType underlyingType, Instant expirationTime, double d, double d2, double d3) {
        Intrinsics.checkNotNullParameter(optionSimulatedChartLegBundle, "<this>");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
        return new ProfitAndLossChartLeg(expirationTime, optionSimulatedChartLegBundle.getOptionInstrument(), optionSimulatedChartLegBundle.getOptionChain(), underlyingType, optionSimulatedChartLegBundle.getSide(), optionSimulatedChartLegBundle.getQuantity(), d, d2, d3);
    }
}
