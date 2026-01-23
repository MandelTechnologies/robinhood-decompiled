package com.robinhood.android.options.simulatedreturnschart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Instant;
import kotlinx.datetime.TimeZoneJvm2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a)\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"getSimulatedReturnsChart", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "params", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "timeZone", "Lkotlinx/datetime/TimeZone;", "isUkOrApac", "", "isBeyondMaxProfitLoss", "maxProfitLoss", "Lcom/robinhood/android/options/simulatedreturnschart/MaxProfitLoss;", "yAxisLabel", "Lcom/robinhood/android/options/simulatedreturnschart/RawYAxisLabel;", "getMaxProfitLossGridline", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "value", "", AnnotatedPrivateKey.LABEL, "", "bounds", "Lcom/robinhood/android/options/simulatedreturnschart/Bounds;", "(Ljava/lang/Double;Ljava/lang/String;Lcom/robinhood/android/options/simulatedreturnschart/Bounds;)Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SimulatedReturnsChartKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final SimulatedReturnsChart getSimulatedReturnsChart(SimulatedReturnsParams params, TimeZoneJvm2 timeZone, boolean z) throws Exception {
        Instant expiration;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        int i = 1;
        if (params.getQuantity() < 1) {
            return null;
        }
        Iterator<T> it = params.getLegs().iterator();
        if (it.hasNext()) {
            expiration = ((SimulatedReturnsLeg) it.next()).getExpiration();
            while (it.hasNext()) {
                Instant expiration2 = ((SimulatedReturnsLeg) it.next()).getExpiration();
                if (expiration.compareTo(expiration2) > 0) {
                    expiration = expiration2;
                }
            }
        } else {
            expiration = null;
        }
        if (expiration == null) {
            return null;
        }
        List<SimulatedReturnsLeg> legs = params.getLegs();
        if (!(legs instanceof Collection) || !legs.isEmpty()) {
            Iterator<T> it2 = legs.iterator();
            while (it2.hasNext()) {
                if (((SimulatedReturnsLeg) it2.next()).getExpiration().compareTo(params.getNow()) < 0) {
                    return null;
                }
            }
        }
        List<Instant> timestamps = Intervals.getTimestamps(params.getNow(), expiration);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(timestamps, 10));
        Iterator<T> it3 = timestamps.iterator();
        while (it3.hasNext()) {
            arrayList.add(RawPoint3.getRawPoint((Instant) it3.next(), params));
        }
        Bounds bounds = Bounds3.getBounds(arrayList, params.getInsets(), params.getAverageOpeningPrice());
        if (bounds == null) {
            return null;
        }
        List<List<RawPoint>> listInsertBreakevens = Breakevens2.insertBreakevens(arrayList, Breakevens2.getBreakevens(arrayList, params));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listInsertBreakevens, 10));
        Iterator<T> it4 = listInsertBreakevens.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            List list = (List) it4.next();
            RawPoint rawPoint = (RawPoint) CollectionsKt.getOrNull(list, i);
            boolean z2 = (rawPoint == null || rawPoint.getTheoreticalReturn() > 0.0d) ? i : 0;
            List<RawPoint> list2 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (RawPoint rawPoint2 : list2) {
                arrayList3.add(new SimulatedReturnsPoint(rawPoint2.isBreakevenPoint(), rawPoint2.getTimestamp(), rawPoint2.getTheoreticalPrice(), rawPoint2.getTheoreticalPriceRounded(), rawPoint2.getTheoreticalReturn(), rawPoint2.getTheoreticalReturnRounded(), rawPoint2.getTheoreticalReturnPercent(), DateFormat.getTimestampString(rawPoint2.getTimestamp(), params.getNow(), expiration, timeZone, z), params.getUsePercentageReturns(), Bounds3.getNormalizedX(bounds, rawPoint2.getTimestamp()), Bounds3.getNormalizedY(bounds, rawPoint2.getPrimaryPoint())));
            }
            arrayList2.add(new SimulatedReturnsSegment(arrayList3, z2));
            i = 1;
        }
        SimulatedReturnsLine simulatedReturnsLine = new SimulatedReturnsLine(arrayList2);
        List<RawXAxisLabel> rawXAxisLabels = RawXAxisLabel2.getRawXAxisLabels(params.getNow(), expiration, params.getMaxVerticalGridlines(), bounds, timeZone, z);
        List<RawYAxisLabel> rawYAxisLabels = RawYAxisLabel3.getRawYAxisLabels(params.getMaxHorizontalGridlines(), params.getUsePercentageReturns(), bounds);
        MaxProfitLoss maxProfitLoss = MaxProfitLoss3.getMaxProfitLoss(params);
        List<RawXAxisLabel> list3 = rawXAxisLabels;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (RawXAxisLabel rawXAxisLabel : list3) {
            arrayList4.add(new SimulatedReturnsGridLine(Bounds3.getNormalizedX(bounds, rawXAxisLabel.getTimestamp()), rawXAxisLabel.getLabel(), false, 0.0d, 8, (DefaultConstructorMarker) null));
        }
        ArrayList<RawYAxisLabel> arrayList5 = new ArrayList();
        for (Object obj : rawYAxisLabels) {
            if (!isBeyondMaxProfitLoss(maxProfitLoss, (RawYAxisLabel) obj)) {
                arrayList5.add(obj);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (RawYAxisLabel rawYAxisLabel : arrayList5) {
            arrayList6.add(new SimulatedReturnsGridLine(Bounds3.getNormalizedY(bounds, rawYAxisLabel.getValue()), rawYAxisLabel.getLabel(), rawYAxisLabel.getValue() == 0.0d, rawYAxisLabel.getOpacity()));
        }
        Double maxProfit = maxProfitLoss.getMaxProfit();
        if (maxProfit == null || maxProfit.doubleValue() < 0.0d) {
            maxProfit = null;
        }
        SimulatedReturnsGridLine maxProfitLossGridline = getMaxProfitLossGridline(maxProfit, "MAX\nPROFIT", bounds);
        Double maxLoss = maxProfitLoss.getMaxLoss();
        return new SimulatedReturnsChart(simulatedReturnsLine, arrayList4, arrayList6, maxProfitLossGridline, getMaxProfitLossGridline((maxLoss == null || maxLoss.doubleValue() > 0.0d) ? null : maxLoss, "MAX\nLOSS", bounds));
    }

    private static final boolean isBeyondMaxProfitLoss(MaxProfitLoss maxProfitLoss, RawYAxisLabel rawYAxisLabel) {
        if (maxProfitLoss.getMaxProfit() == null || rawYAxisLabel.getValue() < maxProfitLoss.getMaxProfit().doubleValue()) {
            return maxProfitLoss.getMaxLoss() != null && rawYAxisLabel.getValue() <= maxProfitLoss.getMaxLoss().doubleValue();
        }
        return true;
    }

    private static final SimulatedReturnsGridLine getMaxProfitLossGridline(Double d, String str, Bounds bounds) {
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue <= bounds.getMaxY() && dDoubleValue >= bounds.getMinY()) {
                return new SimulatedReturnsGridLine(Bounds3.getNormalizedY(bounds, dDoubleValue), str, true, 0.0d, 8, (DefaultConstructorMarker) null);
            }
        }
        return null;
    }
}
