package com.robinhood.android.trade.options.profitloss.local;

import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PiecewiseLinearFunction.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J,\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0002R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/PiecewiseLinearFunction;", "", "xValues", "", "Ljava/math/BigDecimal;", "yValues", "slopes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getXValues", "()Ljava/util/List;", "getYValues", "getSlopes", "invoke", "queryX", "plus", "other", "yIntersects", "interpolate", "leftPoint", "Lcom/robinhood/android/trade/options/profitloss/local/Point;", "rightPoint", "slope", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PiecewiseLinearFunction {
    public static final int $stable = 8;
    private final List<BigDecimal> slopes;
    private final List<BigDecimal> xValues;
    private final List<BigDecimal> yValues;

    /* JADX WARN: Multi-variable type inference failed */
    public PiecewiseLinearFunction(List<? extends BigDecimal> xValues, List<? extends BigDecimal> yValues, List<? extends BigDecimal> slopes) {
        Intrinsics.checkNotNullParameter(xValues, "xValues");
        Intrinsics.checkNotNullParameter(yValues, "yValues");
        Intrinsics.checkNotNullParameter(slopes, "slopes");
        this.xValues = xValues;
        this.yValues = yValues;
        this.slopes = slopes;
        if (xValues.size() != yValues.size()) {
            throw new IllegalArgumentException("xValues and yValues must have the same size");
        }
        if (slopes.size() != xValues.size() + 1) {
            throw new IllegalArgumentException("slopes must have size xValues.size + 1");
        }
    }

    public final List<BigDecimal> getXValues() {
        return this.xValues;
    }

    public final List<BigDecimal> getYValues() {
        return this.yValues;
    }

    public final List<BigDecimal> getSlopes() {
        return this.slopes;
    }

    public final BigDecimal invoke(BigDecimal queryX) {
        Point point;
        Intrinsics.checkNotNullParameter(queryX, "queryX");
        Iterator<BigDecimal> it = this.xValues.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().compareTo(queryX) >= 0) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : this.xValues.size();
        if (iIntValue != this.xValues.size() && this.xValues.get(iIntValue).compareTo(queryX) == 0) {
            return this.yValues.get(iIntValue);
        }
        if (iIntValue != 0) {
            int i2 = iIntValue - 1;
            point = new Point(this.xValues.get(i2), this.yValues.get(i2));
        } else {
            point = null;
        }
        return interpolate(queryX, point, iIntValue != this.xValues.size() ? new Point(this.xValues.get(iIntValue), this.yValues.get(iIntValue)) : null, this.slopes.get(iIntValue));
    }

    public final PiecewiseLinearFunction plus(PiecewiseLinearFunction other) {
        Point point;
        Intrinsics.checkNotNullParameter(other, "other");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        BigDecimal bigDecimalAdd = this.slopes.get(0).add(other.slopes.get(0));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        arrayList3.add(bigDecimalAdd);
        Point point2 = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.xValues.size() && i3 >= other.xValues.size()) {
                break;
            }
            if (i2 < this.xValues.size() && i3 < other.xValues.size() && this.xValues.get(i2).compareTo(other.xValues.get(i3)) == 0) {
                BigDecimal bigDecimal = other.xValues.get(i3);
                BigDecimal bigDecimalAdd2 = this.yValues.get(i2).add(other.yValues.get(i3));
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                i2++;
                i3++;
                point = new Point(bigDecimal, bigDecimalAdd2);
            } else if (i3 >= other.xValues.size() || (i2 < this.xValues.size() && this.xValues.get(i2).compareTo(other.xValues.get(i3)) < 0)) {
                BigDecimal bigDecimalInvoke = other.invoke(this.xValues.get(i2));
                BigDecimal bigDecimal2 = this.xValues.get(i2);
                BigDecimal bigDecimalAdd3 = this.yValues.get(i2).add(bigDecimalInvoke);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
                point = new Point(bigDecimal2, bigDecimalAdd3);
                i2++;
            } else {
                BigDecimal bigDecimalInvoke2 = invoke(other.xValues.get(i3));
                BigDecimal bigDecimal3 = other.xValues.get(i3);
                BigDecimal bigDecimalAdd4 = other.yValues.get(i3).add(bigDecimalInvoke2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd4, "add(...)");
                point = new Point(bigDecimal3, bigDecimalAdd4);
                i3++;
            }
            arrayList.add(point.getX());
            arrayList2.add(point.getY());
            if (point2 != null) {
                BigDecimal bigDecimalSubtract = point.getY().subtract(point2.getY());
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal bigDecimalSubtract2 = point.getX().subtract(point2.getX());
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                arrayList3.add(BigDecimals7.safeDivide$default(bigDecimalSubtract, bigDecimalSubtract2, 8, null, 4, null));
            }
            point2 = point;
        }
        BigDecimal bigDecimalAdd5 = ((BigDecimal) CollectionsKt.last((List) this.slopes)).add((BigDecimal) CollectionsKt.last((List) other.slopes));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd5, "add(...)");
        arrayList3.add(bigDecimalAdd5);
        while (arrayList3.size() > 2 && i < arrayList3.size() - 1) {
            int i4 = i + 1;
            if (((BigDecimal) arrayList3.get(i)).compareTo((BigDecimal) arrayList3.get(i4)) == 0) {
                arrayList.remove(i);
                arrayList2.remove(i);
                arrayList3.remove(i);
            } else {
                i = i4;
            }
        }
        return new PiecewiseLinearFunction(arrayList, arrayList2, arrayList3);
    }

    public final List<BigDecimal> yIntersects() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        BigDecimal bigDecimal = this.slopes.get(0);
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        BigDecimal bigDecimalNegate = null;
        BigDecimal bigDecimalSafeDivide$default = bigDecimal.compareTo(bigDecimal2) != 0 ? BigDecimals7.safeDivide$default(this.yValues.get(0), this.slopes.get(0), 8, null, 4, null) : null;
        if (bigDecimalSafeDivide$default != null && bigDecimalSafeDivide$default.compareTo(bigDecimal2) > 0) {
            BigDecimal bigDecimalSubtract = this.xValues.get(0).subtract(bigDecimalSafeDivide$default);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            arrayList.add(bigDecimalSubtract);
        }
        int size = this.xValues.size() - 1;
        while (i < size) {
            BigDecimal bigDecimal3 = this.yValues.get(i);
            BigDecimal bigDecimal4 = BigDecimal.ZERO;
            if (bigDecimal3.compareTo(bigDecimal4) == 0) {
                arrayList.add(this.xValues.get(i));
            }
            int i2 = i + 1;
            BigDecimal bigDecimalMultiply = this.yValues.get(i).multiply(this.yValues.get(i2));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            if (bigDecimalMultiply.compareTo(bigDecimal4) < 0 && this.slopes.get(i2).compareTo(bigDecimal4) != 0) {
                BigDecimal bigDecimalSubtract2 = this.xValues.get(i).subtract(BigDecimals7.safeDivide$default(this.yValues.get(i), this.slopes.get(i2), 8, null, 4, null));
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                arrayList.add(bigDecimalSubtract2);
            }
            i = i2;
        }
        BigDecimal bigDecimal5 = (BigDecimal) CollectionsKt.last((List) this.yValues);
        BigDecimal bigDecimal6 = BigDecimal.ZERO;
        if (bigDecimal5.compareTo(bigDecimal6) == 0) {
            arrayList.add(CollectionsKt.last((List) this.xValues));
        }
        if (((BigDecimal) CollectionsKt.last((List) this.slopes)).compareTo(bigDecimal6) != 0) {
            bigDecimalNegate = BigDecimals7.safeDivide$default((BigDecimal) CollectionsKt.last((List) this.yValues), (BigDecimal) CollectionsKt.last((List) this.slopes), 8, null, 4, null).negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        }
        if (bigDecimalNegate != null && bigDecimalNegate.compareTo(bigDecimal6) > 0) {
            BigDecimal bigDecimalAdd = ((BigDecimal) CollectionsKt.last((List) this.xValues)).add(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            arrayList.add(bigDecimalAdd);
        }
        return arrayList;
    }

    private final BigDecimal interpolate(BigDecimal queryX, Point leftPoint, Point rightPoint, BigDecimal slope) {
        if (leftPoint == null && rightPoint != null) {
            BigDecimal y = rightPoint.getY();
            BigDecimal bigDecimalSubtract = rightPoint.getX().subtract(queryX);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(slope);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalSubtract2 = y.subtract(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            return bigDecimalSubtract2;
        }
        if (leftPoint == null) {
            throw new IllegalArgumentException("leftPoint cannot be null");
        }
        BigDecimal y2 = leftPoint.getY();
        BigDecimal bigDecimalSubtract3 = queryX.subtract(leftPoint.getX());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalSubtract3.multiply(slope);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalAdd = y2.add(bigDecimalMultiply2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }
}
