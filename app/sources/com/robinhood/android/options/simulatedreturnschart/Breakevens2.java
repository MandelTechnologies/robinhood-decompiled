package com.robinhood.android.options.simulatedreturnschart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlinx.datetime.Instant;

/* compiled from: Breakevens.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a0\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\"\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"getBreakevens", "", "Lcom/robinhood/android/options/simulatedreturnschart/BreakevenPoint;", "rawPoints", "Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "params", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "insertBreakevens", "breakevens", "calculateExactBreakevenPoint", "firstPoint", "secondPoint", "HALF_OF_A_HUNDREDTH_OF_A_CENT", "", "NUMBER_OF_ITERATIONS", "", "isEffectivelyZero", "", "point", "getMidTimestamp", "Lkotlinx/datetime/Instant;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturnschart.BreakevensKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Breakevens2 {
    private static final double HALF_OF_A_HUNDREDTH_OF_A_CENT = 5.0E-5d;
    private static final int NUMBER_OF_ITERATIONS = 30;

    public static final List<BreakevenPoint> getBreakevens(List<RawPoint> rawPoints, SimulatedReturnsParams params) {
        Intrinsics.checkNotNullParameter(rawPoints, "rawPoints");
        Intrinsics.checkNotNullParameter(params, "params");
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(1, rawPoints.size());
        ArrayList arrayList = new ArrayList();
        for (Integer num : primitiveRanges2Until) {
            int iIntValue = num.intValue();
            if (Math.signum(rawPoints.get(iIntValue - 1).getTheoreticalReturn()) * Math.signum(rawPoints.get(iIntValue).getTheoreticalReturn()) < 0.0d) {
                arrayList.add(num);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            RawPoint rawPointCalculateExactBreakevenPoint = calculateExactBreakevenPoint(rawPoints.get(iIntValue2 - 1), rawPoints.get(iIntValue2), params);
            BreakevenPoint breakevenPoint = rawPointCalculateExactBreakevenPoint == null ? null : new BreakevenPoint(rawPointCalculateExactBreakevenPoint, iIntValue2);
            if (breakevenPoint != null) {
                arrayList2.add(breakevenPoint);
            }
        }
        return arrayList2;
    }

    public static final List<List<RawPoint>> insertBreakevens(List<RawPoint> rawPoints, List<BreakevenPoint> breakevens) {
        Intrinsics.checkNotNullParameter(rawPoints, "rawPoints");
        Intrinsics.checkNotNullParameter(breakevens, "breakevens");
        List listListOf = CollectionsKt.listOf(0);
        List<BreakevenPoint> list = breakevens;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((BreakevenPoint) it.next()).getIndexAfterBreakeven()));
        }
        List<Tuples2> listZipWithNext = CollectionsKt.zipWithNext(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList), (Iterable) CollectionsKt.listOf(Integer.valueOf(rawPoints.size()))));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZipWithNext, 10));
        for (Tuples2 tuples2 : listZipWithNext) {
            arrayList2.add(CollectionsKt.toMutableList((Collection) rawPoints.subList(((Number) tuples2.getFirst()).intValue(), ((Number) tuples2.getSecond()).intValue())));
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BreakevenPoint breakevenPoint = (BreakevenPoint) obj;
            List list2 = (List) CollectionsKt.getOrNull(arrayList2, i);
            if (list2 != null) {
                list2.add(breakevenPoint.getRawPoint());
            }
            List list3 = (List) CollectionsKt.getOrNull(arrayList2, i2);
            if (list3 != null) {
                list3.add(0, breakevenPoint.getRawPoint());
            }
            i = i2;
        }
        return arrayList2;
    }

    private static final RawPoint calculateExactBreakevenPoint(RawPoint rawPoint, RawPoint rawPoint2, SimulatedReturnsParams simulatedReturnsParams) {
        RawPoint rawPoint3 = rawPoint2;
        RawPoint rawPoint4 = RawPoint3.getRawPoint(getMidTimestamp(rawPoint, rawPoint2), simulatedReturnsParams);
        RawPoint rawPoint5 = rawPoint;
        for (int i = 0; i < 30; i++) {
            boolean z = rawPoint5.getTheoreticalReturn() < rawPoint3.getTheoreticalReturn();
            if ((z && rawPoint4.getTheoreticalReturn() > 0.0d) || (!z && rawPoint4.getTheoreticalReturn() < 0.0d)) {
                RawPoint rawPoint6 = rawPoint4;
                rawPoint4 = RawPoint3.getRawPoint(getMidTimestamp(rawPoint5, rawPoint4), simulatedReturnsParams);
                rawPoint3 = rawPoint6;
            } else {
                RawPoint rawPoint7 = rawPoint4;
                rawPoint4 = RawPoint3.getRawPoint(getMidTimestamp(rawPoint4, rawPoint3), simulatedReturnsParams);
                rawPoint5 = rawPoint7;
            }
        }
        if (isEffectivelyZero(rawPoint4)) {
            return new RawPoint(rawPoint4.getTimestamp(), rawPoint4.getTheoreticalPrice(), MathKt.roundToLong(rawPoint4.getTheoreticalPrice() * 100) / 100.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, true);
        }
        return null;
    }

    private static final boolean isEffectivelyZero(RawPoint rawPoint) {
        return Math.abs(rawPoint.getTheoreticalReturn()) < HALF_OF_A_HUNDREDTH_OF_A_CENT && Math.abs(rawPoint.getTheoreticalReturnPercent()) < HALF_OF_A_HUNDREDTH_OF_A_CENT;
    }

    private static final Instant getMidTimestamp(RawPoint rawPoint, RawPoint rawPoint2) {
        return rawPoint.getTimestamp().m28852plusLRDsOJo(Duration.m28731divUwyO8pc(rawPoint2.getTimestamp().m28850minus5sfh64U(rawPoint.getTimestamp()), 2));
    }
}
