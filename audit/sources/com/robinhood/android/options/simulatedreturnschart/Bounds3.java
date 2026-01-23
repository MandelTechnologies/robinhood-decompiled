package com.robinhood.android.options.simulatedreturnschart;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.datetime.Instant;

/* compiled from: Bounds.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a(\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a,\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\"\u000e\u0010\u0012\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"getBounds", "Lcom/robinhood/android/options/simulatedreturnschart/Bounds;", "rawPoints", "", "Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "insets", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets;", "averageOpeningPrice", "", "getNormalizedX", "bounds", "timestamp", "Lkotlinx/datetime/Instant;", "getNormalizedY", "point", "getAdjustedMinMaxY", "Lkotlin/Pair;", "getAdjustedMinMaxX", "MIN_PADDING_VERTICAL_DOLLAR", "MIN_PADDING_VERTICAL_PERCENT", "MIN_PADDING_HORIZONTAL_SECONDS", "", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturnschart.BoundsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Bounds3 {
    private static final int MIN_PADDING_HORIZONTAL_SECONDS = 1;
    private static final double MIN_PADDING_VERTICAL_DOLLAR = 5.0d;
    private static final double MIN_PADDING_VERTICAL_PERCENT = 0.01d;

    public static final Bounds getBounds(List<RawPoint> rawPoints, SimulatedReturnsChartInsets insets, double d) throws Exception {
        Intrinsics.checkNotNullParameter(rawPoints, "rawPoints");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Tuples2<Instant, Instant> adjustedMinMaxX = getAdjustedMinMaxX(rawPoints);
        if (adjustedMinMaxX == null) {
            return null;
        }
        Instant instantComponent1 = adjustedMinMaxX.component1();
        Instant instantComponent2 = adjustedMinMaxX.component2();
        Tuples2<Double, Double> adjustedMinMaxY = getAdjustedMinMaxY(rawPoints, d);
        if (adjustedMinMaxY == null) {
            return null;
        }
        double dDoubleValue = adjustedMinMaxY.component1().doubleValue();
        double dDoubleValue2 = adjustedMinMaxY.component2().doubleValue();
        double d2 = 1;
        double rightPercentageInset = (d2 - insets.getRightPercentageInset()) - insets.getLeftPercentageInset();
        double topPercentageInset = (d2 - insets.getTopPercentageInset()) - insets.getBottomPercentageInset();
        if (rightPercentageInset <= 0.0d || topPercentageInset <= 0.0d) {
            return new Bounds(instantComponent1, instantComponent2, dDoubleValue, dDoubleValue2);
        }
        long jM28730divUwyO8pc = Duration.m28730divUwyO8pc(instantComponent2.m28850minus5sfh64U(instantComponent1), rightPercentageInset);
        Instant instantM28851minusLRDsOJo = instantComponent1.m28851minusLRDsOJo(Duration.m28756timesUwyO8pc(jM28730divUwyO8pc, insets.getLeftPercentageInset()));
        Instant instantM28852plusLRDsOJo = instantComponent2.m28852plusLRDsOJo(Duration.m28756timesUwyO8pc(jM28730divUwyO8pc, insets.getRightPercentageInset()));
        double d3 = (dDoubleValue2 - dDoubleValue) / topPercentageInset;
        return new Bounds(instantM28851minusLRDsOJo, instantM28852plusLRDsOJo, dDoubleValue - (insets.getBottomPercentageInset() * d3), dDoubleValue2 + (d3 * insets.getTopPercentageInset()));
    }

    public static final double getNormalizedX(Bounds bounds, Instant timestamp) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return Duration.m28729divLRDsOJo(timestamp.m28850minus5sfh64U(bounds.getMinX()), bounds.getMaxX().m28850minus5sfh64U(bounds.getMinX()));
    }

    public static final double getNormalizedY(Bounds bounds, double d) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return (d - bounds.getMinY()) / (bounds.getMaxY() - bounds.getMinY());
    }

    private static final Tuples2<Double, Double> getAdjustedMinMaxY(List<RawPoint> list, double d) {
        Object next;
        Object next2;
        List<RawPoint> list2 = list;
        Iterator<T> it = list2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double primaryPoint = ((RawPoint) next).getPrimaryPoint();
                do {
                    Object next3 = it.next();
                    double primaryPoint2 = ((RawPoint) next3).getPrimaryPoint();
                    if (Double.compare(primaryPoint, primaryPoint2) > 0) {
                        next = next3;
                        primaryPoint = primaryPoint2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        RawPoint rawPoint = (RawPoint) next;
        if (rawPoint == null) {
            return null;
        }
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                double primaryPoint3 = ((RawPoint) next2).getPrimaryPoint();
                do {
                    Object next4 = it2.next();
                    double primaryPoint4 = ((RawPoint) next4).getPrimaryPoint();
                    if (Double.compare(primaryPoint3, primaryPoint4) < 0) {
                        next2 = next4;
                        primaryPoint3 = primaryPoint4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        RawPoint rawPoint2 = (RawPoint) next2;
        if (rawPoint2 == null) {
            return null;
        }
        double primaryPoint5 = rawPoint.getPrimaryPoint();
        double primaryPoint6 = rawPoint2.getPrimaryPoint();
        double d2 = ((primaryPoint6 - primaryPoint5) / 2.0d) + primaryPoint5;
        double dMax = primaryPoint5 == rawPoint.getTheoreticalReturnPercent() ? Math.max(5.0d / d, 0.01d) : Math.max(5.0d, d * 0.01d);
        return new Tuples2<>(Double.valueOf(Math.min(primaryPoint5, d2 - dMax)), Double.valueOf(Math.max(primaryPoint6, d2 + dMax)));
    }

    private static final Tuples2<Instant, Instant> getAdjustedMinMaxX(List<RawPoint> list) throws Exception {
        Instant timestamp;
        Instant timestamp2;
        List<RawPoint> list2 = list;
        Iterator<T> it = list2.iterator();
        if (it.hasNext()) {
            timestamp = ((RawPoint) it.next()).getTimestamp();
            while (it.hasNext()) {
                Instant timestamp3 = ((RawPoint) it.next()).getTimestamp();
                if (timestamp.compareTo(timestamp3) > 0) {
                    timestamp = timestamp3;
                }
            }
        } else {
            timestamp = null;
        }
        if (timestamp == null) {
            return null;
        }
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            timestamp2 = ((RawPoint) it2.next()).getTimestamp();
            while (it2.hasNext()) {
                Instant timestamp4 = ((RawPoint) it2.next()).getTimestamp();
                if (timestamp2.compareTo(timestamp4) < 0) {
                    timestamp2 = timestamp4;
                }
            }
        } else {
            timestamp2 = null;
        }
        if (timestamp2 == null) {
            return null;
        }
        Instant instantM28852plusLRDsOJo = timestamp.m28852plusLRDsOJo(Duration.m28730divUwyO8pc(timestamp2.m28850minus5sfh64U(timestamp), 2.0d));
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.SECONDS;
        return new Tuples2<>((Instant) ComparisonsKt.minOf(timestamp, instantM28852plusLRDsOJo.m28851minusLRDsOJo(Duration3.toDuration(1, durationUnitJvm))), (Instant) ComparisonsKt.maxOf(timestamp2, instantM28852plusLRDsOJo.m28852plusLRDsOJo(Duration3.toDuration(1, durationUnitJvm))));
    }
}
