package com.robinhood.android.options.simulatedreturnschart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Instant;

/* compiled from: MaxProfitLoss.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m3636d2 = {"getMaxProfitLoss", "Lcom/robinhood/android/options/simulatedreturnschart/MaxProfitLoss;", "params", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "getRightLimit", "", "legs", "", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg;", "lastPoint", "Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturnschart.MaxProfitLossKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class MaxProfitLoss3 {
    public static final MaxProfitLoss getMaxProfitLoss(SimulatedReturnsParams simulatedReturnsParams) {
        SimulatedReturnsParams params = simulatedReturnsParams;
        Intrinsics.checkNotNullParameter(params, "params");
        Double d = null;
        if (params.getLegs().isEmpty()) {
            return new MaxProfitLoss(null, null);
        }
        List<SimulatedReturnsLeg> legs = params.getLegs();
        char c = '\n';
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((SimulatedReturnsLeg) it.next()).getExpiration());
        }
        Instant instant = (Instant) CollectionsKt.singleOrNull(CollectionsKt.distinct(arrayList));
        if (instant == null) {
            return new MaxProfitLoss(null, null);
        }
        List<SimulatedReturnsLeg> legs2 = params.getLegs();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs2, 10));
        Iterator<T> it2 = legs2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((SimulatedReturnsLeg) it2.next()).getStrikePrice()));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ArrayList arrayList4 = arrayList3;
            arrayList4.add(RawPoint3.getRawPoint(instant, SimulatedReturnsParams.copy$default(params, null, ((Number) it3.next()).doubleValue(), 0.0d, false, null, false, null, 0, false, false, 0, 0, 0.0d, 8189, null)));
            params = simulatedReturnsParams;
            arrayList3 = arrayList4;
            d = d;
            c = '\n';
        }
        Double d2 = d;
        ArrayList arrayList5 = arrayList3;
        double primaryPoint = RawPoint3.getRawPoint(instant, SimulatedReturnsParams.copy$default(simulatedReturnsParams, null, 0.0d, 0.0d, false, null, false, null, 0, false, false, 0, 0, 0.0d, 8189, null)).getPrimaryPoint();
        double rightLimit = getRightLimit(simulatedReturnsParams.getLegs(), (RawPoint) CollectionsKt.last((List) arrayList5));
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(Double.valueOf(((RawPoint) it4.next()).getPrimaryPoint()));
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList6, (Iterable) CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(primaryPoint), Double.valueOf(rightLimit)}));
        Double dMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Double>) listPlus);
        if (dMaxOrNull == null || Math.abs(dMaxOrNull.doubleValue()) > Double.MAX_VALUE) {
            dMaxOrNull = d2;
        }
        Double dMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Double>) listPlus);
        if (dMinOrNull == null || Math.abs(dMinOrNull.doubleValue()) > Double.MAX_VALUE) {
            dMinOrNull = d2;
        }
        return new MaxProfitLoss(dMaxOrNull, dMinOrNull);
    }

    private static final double getRightLimit(List<SimulatedReturnsLeg> list, RawPoint rawPoint) {
        ArrayList<SimulatedReturnsLeg> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((SimulatedReturnsLeg) obj).isPut()) {
                arrayList.add(obj);
            }
        }
        int ratio = 0;
        for (SimulatedReturnsLeg simulatedReturnsLeg : arrayList) {
            ratio += simulatedReturnsLeg.getRatio() * (simulatedReturnsLeg.isBuy() ? 1 : -1);
        }
        if (ratio == 0) {
            return rawPoint.getPrimaryPoint();
        }
        return ratio > 0 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
    }
}
