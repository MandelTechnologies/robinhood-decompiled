package com.robinhood.android.options.simulatedreturnschart;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import kotlinx.datetime.Instant;

/* compiled from: RawPoint.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a&\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"getRawPoint", "Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "timestamp", "Lkotlinx/datetime/Instant;", "params", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "getTheoreticalPrice", "", "legs", "", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg;", "spotPrice", "getMultiplier", "", "leg", "getTotalOpeningCredit", "DAYS_PER_YEAR", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.simulatedreturnschart.RawPointKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RawPoint3 {
    private static final double DAYS_PER_YEAR = 365.0d;

    public static final RawPoint getRawPoint(Instant timestamp, SimulatedReturnsParams params) {
        double d;
        double d2;
        double d3;
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(params, "params");
        double theoreticalPrice = getTheoreticalPrice(params.getLegs(), params.getSpotPrice(), timestamp);
        double quantity = params.getQuantity() * theoreticalPrice * params.getTradeValueMultiplier();
        double totalOpeningCredit = getTotalOpeningCredit(params);
        double d4 = quantity + totalOpeningCredit;
        double averageOpeningPrice = d4 / (params.getAverageOpeningPrice() * params.getQuantity());
        double dRoundToLong = MathKt.roundToLong(100 * theoreticalPrice) / 100.0d;
        double quantity2 = (params.getQuantity() * dRoundToLong * params.getTradeValueMultiplier()) + totalOpeningCredit;
        if (params.isOrderCredit()) {
            theoreticalPrice = -theoreticalPrice;
        }
        if (params.isOrderCredit()) {
            dRoundToLong = -dRoundToLong;
        }
        double d5 = theoreticalPrice;
        if (params.getUsePercentageReturns()) {
            d = d4;
            d2 = dRoundToLong;
            d3 = averageOpeningPrice;
        } else {
            d = d4;
            d2 = dRoundToLong;
            d3 = d;
        }
        return new RawPoint(timestamp, d5, d2, d, quantity2, averageOpeningPrice, d3, params.getUsePercentageReturns() ? d : averageOpeningPrice, false, 256, (DefaultConstructorMarker) null);
    }

    private static final double getTheoreticalPrice(List<SimulatedReturnsLeg> list, double d, Instant instant) {
        double dBjerksundStensland;
        double d2 = 0.0d;
        for (SimulatedReturnsLeg simulatedReturnsLeg : list) {
            double dM28758toDoubleimpl = Duration.m28758toDoubleimpl(simulatedReturnsLeg.getExpiration().m28850minus5sfh64U(instant), DurationUnitJvm.DAYS) / 365.0d;
            double multiplier = getMultiplier(simulatedReturnsLeg);
            if (simulatedReturnsLeg.isEuropean()) {
                dBjerksundStensland = BjerksundStensland.blackScholes(d, simulatedReturnsLeg.getStrikePrice(), dM28758toDoubleimpl, simulatedReturnsLeg.getImpliedVolatility(), simulatedReturnsLeg.getInterestRate(), simulatedReturnsLeg.getDividendYield(), simulatedReturnsLeg.isPut());
            } else {
                dBjerksundStensland = BjerksundStensland.bjerksundStensland(d, simulatedReturnsLeg.getStrikePrice(), dM28758toDoubleimpl, simulatedReturnsLeg.getImpliedVolatility(), simulatedReturnsLeg.getInterestRate(), simulatedReturnsLeg.getDividendYield(), simulatedReturnsLeg.isPut());
            }
            d2 += multiplier * dBjerksundStensland;
        }
        return d2;
    }

    private static final int getMultiplier(SimulatedReturnsLeg simulatedReturnsLeg) {
        boolean zIsBuy = simulatedReturnsLeg.isBuy();
        int ratio = simulatedReturnsLeg.getRatio();
        return zIsBuy ? ratio : -ratio;
    }

    private static final double getTotalOpeningCredit(SimulatedReturnsParams simulatedReturnsParams) {
        return (simulatedReturnsParams.isOrderCredit() ? 1 : -1) * simulatedReturnsParams.getAverageOpeningPrice() * simulatedReturnsParams.getQuantity();
    }
}
