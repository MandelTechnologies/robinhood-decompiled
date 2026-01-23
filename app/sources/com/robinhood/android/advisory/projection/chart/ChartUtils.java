package com.robinhood.android.advisory.projection.chart;

import com.robinhood.android.charts.model.Point;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.models.advisory.p304db.projection.ProjectedValues;
import com.robinhood.models.advisory.p304db.projection.YearlyProjectedValues;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: ChartUtils.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a<\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u001a\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b\u001a0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010!\u001a\u00020\u0001\u001a(\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001\u001a&\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001b\u001a\u001c\u0010*\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010,\u001a\u00020\n¨\u0006-"}, m3636d2 = {"getMaxValue", "", "values", "Lcom/robinhood/models/advisory/db/projection/ProjectedValues;", "getMinValue", "calculateChartPoints", "Lcom/robinhood/android/advisory/projection/chart/ChartPoints;", "currentValues", "currentPortfolioValue", "numYears", "", "gridMinValue", "gridMaxValue", "calculatePoints", "", "Lcom/robinhood/android/charts/model/Point;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/projection/YearlyProjectedValues;", "addSimulatedLastPoint", "", "calculateMedianLineValues", "startValues", "endValues", "interpolateChartPoints", "startPoints", "endPoints", "progress", "", "interpolatePoints", "makeGridIncrements", "minValue", "maxValue", "multiply", "value", "toAbsoluteValues", "areValuesRelative", "Ljava/math/BigDecimal;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "getSelectedYear", "x", "totalWidth", "gapPx", "computeTangentAngle", "points", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "feature-projected-returns_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.chart.ChartUtilsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartUtils {
    public static final double getMaxValue(ProjectedValues values) {
        Intrinsics.checkNotNullParameter(values, "values");
        List<YearlyProjectedValues> percentile95s = values.getPercentile95s();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = percentile95s.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((YearlyProjectedValues) it.next()).getValues());
        }
        Double dMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Double>) arrayList);
        if (dMaxOrNull != null) {
            return dMaxOrNull.doubleValue();
        }
        return 0.0d;
    }

    public static final double getMinValue(ProjectedValues values) {
        Intrinsics.checkNotNullParameter(values, "values");
        List<YearlyProjectedValues> percentile5s = values.getPercentile5s();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = percentile5s.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((YearlyProjectedValues) it.next()).getValues());
        }
        Double dMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Double>) arrayList);
        if (dMinOrNull != null) {
            return dMinOrNull.doubleValue();
        }
        return 0.0d;
    }

    public static final ChartPoints calculateChartPoints(ProjectedValues currentValues, double d, int i, double d2, double d3) {
        Intrinsics.checkNotNullParameter(currentValues, "currentValues");
        List listCalculatePoints$default = calculatePoints$default(currentValues.getPercentile5s(), i, d2, d3, false, 16, null);
        List<Point> listCalculatePoints = calculatePoints(currentValues.getMedians(), i, d2, d3, true);
        List listCalculatePoints$default2 = calculatePoints$default(currentValues.getPercentile95s(), i, d2, d3, false, 16, null);
        int size = currentValues.getMedians().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            int size2 = ((YearlyProjectedValues) CollectionsKt.first((List) currentValues.getMedians())).getValues().size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(Double.valueOf(d));
            }
            arrayList.add(new YearlyProjectedValues(arrayList2));
        }
        return new ChartPoints(listCalculatePoints$default, listCalculatePoints, listCalculatePoints$default2, calculatePoints(arrayList, i, d2, d3, true));
    }

    public static /* synthetic */ List calculatePoints$default(List list, int i, double d, double d2, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        return calculatePoints(list, i, d, d2, z);
    }

    public static final List<Point> calculatePoints(List<YearlyProjectedValues> data, int i, double d, double d2, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        List<YearlyProjectedValues> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        int i2 = 0;
        while (true) {
            float fDoubleValue = 1.0f;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            YearlyProjectedValues yearlyProjectedValues = (YearlyProjectedValues) next;
            if (d != d2) {
                fDoubleValue = (float) ((((Number) CollectionsKt.last((List) yearlyProjectedValues.getValues())).doubleValue() - d) / (d2 - d));
            }
            arrayList.add(new Point((i2 + 0.5f) / i, fDoubleValue));
            i2 = i3;
        }
        if (!z || arrayList.size() < 2) {
            return arrayList;
        }
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        Point point = (Point) arrayList.get(lastIndex - 1);
        Point point2 = (Point) arrayList.get(lastIndex);
        return CollectionsKt.plus((Collection<? extends Point>) arrayList, new Point(1.0f, point2.getY() + (((point2.getY() - point.getY()) / (point2.getX() - point.getX())) * (1.0f - point2.getX()))));
    }

    public static final List<YearlyProjectedValues> calculateMedianLineValues(List<YearlyProjectedValues> startValues, List<YearlyProjectedValues> endValues) {
        double dDoubleValue;
        Intrinsics.checkNotNullParameter(startValues, "startValues");
        Intrinsics.checkNotNullParameter(endValues, "endValues");
        if (startValues.isEmpty() || endValues.isEmpty() || startValues.size() != endValues.size()) {
            return startValues;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = startValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((YearlyProjectedValues) it.next()).getValues());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = endValues.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((YearlyProjectedValues) it2.next()).getValues());
        }
        PrimitiveRanges2 indices = CollectionsKt.getIndices(arrayList);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it3 = indices.iterator();
        while (it3.hasNext()) {
            int iNextInt = ((PrimitiveIterators6) it3).nextInt();
            double dDoubleValue2 = ((Number) arrayList.get(iNextInt)).doubleValue();
            double dDoubleValue3 = ((Number) arrayList2.get(iNextInt)).doubleValue();
            double d = dDoubleValue3 - dDoubleValue2;
            double size = arrayList.size() > 1 ? iNextInt / (arrayList.size() - 1) : 0.0d;
            if (d > 0.0d) {
                dDoubleValue = dDoubleValue2 + (Math.pow(size, 10.0d) * d);
            } else {
                double dSqrt = Math.sqrt(((Number) arrayList2.get(0)).doubleValue() / ((Number) arrayList.get(0)).doubleValue());
                dDoubleValue = (dDoubleValue3 * dSqrt) + (((Number) arrayList2.get(0)).doubleValue() * (1 - dSqrt));
            }
            arrayList3.add(Double.valueOf(dDoubleValue));
        }
        List listChunked = CollectionsKt.chunked(arrayList3, ((YearlyProjectedValues) CollectionsKt.first((List) startValues)).getValues().size());
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        Iterator it4 = listChunked.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new YearlyProjectedValues((List) it4.next()));
        }
        return arrayList4;
    }

    public static final ChartPoints interpolateChartPoints(ChartPoints startPoints, ChartPoints endPoints, float f) {
        Intrinsics.checkNotNullParameter(startPoints, "startPoints");
        Intrinsics.checkNotNullParameter(endPoints, "endPoints");
        return new ChartPoints(interpolatePoints(startPoints.getPercentile5Points(), endPoints.getPercentile5Points(), f), interpolatePoints(startPoints.getMedianPoints(), endPoints.getMedianPoints(), f), interpolatePoints(startPoints.getPercentile95Points(), endPoints.getPercentile95Points(), f), interpolatePoints(startPoints.getCurrentPortfolioPoints(), endPoints.getCurrentPortfolioPoints(), f));
    }

    public static final List<Point> interpolatePoints(List<Point> startPoints, List<Point> endPoints, float f) {
        Intrinsics.checkNotNullParameter(startPoints, "startPoints");
        Intrinsics.checkNotNullParameter(endPoints, "endPoints");
        if (startPoints.isEmpty() || endPoints.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        int iMin = Math.min(startPoints.size(), endPoints.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            Point point = startPoints.get(i);
            Point point2 = endPoints.get(i);
            arrayList.add(new Point(point.getX() + ((point2.getX() - point.getX()) * f), point.getY() + ((point2.getY() - point.getY()) * f)));
        }
        return arrayList;
    }

    public static final List<Double> makeGridIncrements(double d, double d2) {
        double d3 = d2 - d;
        if (d3 <= 0.0d) {
            return CollectionsKt.listOf(Double.valueOf(d));
        }
        double dFloor = Math.floor(Math.log10(d3));
        double dPow = d3 / Math.pow(10.0d, dFloor);
        double dPow2 = (dPow < 1.1d ? 0.2d : dPow < 3.0d ? 0.5d : dPow < 6.0d ? 1.0d : 2.0d) * Math.pow(10.0d, dFloor);
        ArrayList arrayList = new ArrayList();
        double dCeil = Math.ceil(d2 / dPow2) * dPow2;
        for (double dFloor2 = Math.floor(d / dPow2) * dPow2; dFloor2 <= dCeil; dFloor2 += dPow2) {
            arrayList.add(Double.valueOf(dFloor2));
        }
        return arrayList;
    }

    public static final List<YearlyProjectedValues> multiply(List<YearlyProjectedValues> list, double d) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<YearlyProjectedValues> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (YearlyProjectedValues yearlyProjectedValues : list2) {
            List<Double> values = yearlyProjectedValues.getValues();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                arrayList2.add(Double.valueOf(((Number) it.next()).doubleValue() * d));
            }
            arrayList.add(yearlyProjectedValues.copy(arrayList2));
        }
        return arrayList;
    }

    public static /* synthetic */ ProjectedValues toAbsoluteValues$default(boolean z, ProjectedValues projectedValues, BigDecimal bigDecimal, double d, int i, Object obj) {
        if ((i & 8) != 0) {
            d = 0.0d;
        }
        return toAbsoluteValues(z, projectedValues, bigDecimal, d);
    }

    public static final ProjectedValues toAbsoluteValues(boolean z, ProjectedValues value, BigDecimal currentPortfolioValue, double d) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currentPortfolioValue, "currentPortfolioValue");
        if (!z) {
            return value;
        }
        double dDoubleValue = currentPortfolioValue.doubleValue() + d;
        return new ProjectedValues(multiply(value.getPercentile5s(), dDoubleValue), multiply(value.getMedians(), dDoubleValue), multiply(value.getPercentile95s(), dDoubleValue), multiply(value.getNetDeposits(), dDoubleValue));
    }

    public static final int getSelectedYear(float f, int i, float f2, float f3) {
        return RangesKt.coerceIn((int) Math.floor(f / (((f2 - (r0 * f3)) / i) + f3)), 0, i - 1) + 1;
    }

    public static final float computeTangentAngle(List<Point> points, int i) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(points, "points");
        if (points.size() <= 1) {
            return 0.0f;
        }
        if (i == 0) {
            tuples2M3642to = Tuples4.m3642to(points.get(0), points.get(1));
        } else {
            tuples2M3642to = Tuples4.m3642to(points.get(i - 1), points.get(i));
        }
        Point point = (Point) tuples2M3642to.component1();
        Point point2 = (Point) tuples2M3642to.component2();
        return (float) Math.toDegrees(Math.atan2(point2.getY() - point.getY(), point2.getX() - point.getX()));
    }
}
