package com.robinhood.android.options.simulatedreturnschart;

import com.robinhood.android.investFlow.InvestFlowConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;

/* compiled from: RawYAxisLabel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0010\u001a \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0015"}, m3636d2 = {"getRawYAxisLabels", "", "Lcom/robinhood/android/options/simulatedreturnschart/RawYAxisLabel;", "numGridlines", "", "usePercentageReturns", "", "bounds", "Lcom/robinhood/android/options/simulatedreturnschart/Bounds;", "getGridlines", "tickInterval", "", "opacity", "valuesToExclude", "", "tickIntervalForLabels", "(Lcom/robinhood/android/options/simulatedreturnschart/Bounds;DZDLjava/util/Set;Ljava/lang/Double;)Ljava/util/List;", "getLabel", "", "value", "getDecimalString", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturnschart.RawYAxisLabelKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RawYAxisLabel3 {
    public static final List<RawYAxisLabel> getRawYAxisLabels(int i, boolean z, Bounds bounds) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        double maxY = (bounds.getMaxY() - bounds.getMinY()) / i;
        if (maxY < 0.01d) {
            return getGridlines$default(bounds, 0.01d, z, 1.0d, null, null, 48, null);
        }
        double dPow = Math.pow(10.0d, Math.floor(Math.log10(maxY)));
        double d = 5 * dPow;
        double d2 = maxY < d ? d : 10 * dPow;
        double d3 = maxY < d ? dPow : d;
        double d4 = (d2 - maxY) / (d2 - d3);
        double d5 = maxY < d ? 0.9d : 0.75d;
        boolean z2 = d4 > d5;
        List gridlines$default = getGridlines$default(bounds, d2, z, 1.0d, null, z2 ? Double.valueOf(d3) : null, 16, null);
        if (z2) {
            double d6 = (d4 - d5) / (1 - d5);
            List list = gridlines$default;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((RawYAxisLabel) it.next()).getValue()));
            }
            listEmptyList = getGridlines$default(bounds, d3, z, d6, CollectionsKt.toSet(arrayList), null, 32, null);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) gridlines$default, (Iterable) listEmptyList);
    }

    static /* synthetic */ List getGridlines$default(Bounds bounds, double d, boolean z, double d2, Set set, Double d3, int i, Object obj) {
        if ((i & 16) != 0) {
            set = SetsKt.emptySet();
        }
        return getGridlines(bounds, d, z, d2, set, (i & 32) != 0 ? null : d3);
    }

    private static final List<RawYAxisLabel> getGridlines(Bounds bounds, double d, boolean z, double d2, Set<Double> set, Double d3) {
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2((int) Math.ceil((bounds.getMinY() + 1.0E-4d) / d), (int) Math.floor((bounds.getMaxY() - 1.0E-4d) / d));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
        Iterator<Integer> it = primitiveRanges2.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((PrimitiveIterators6) it).nextInt() * d));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!set.contains(Double.valueOf(((Number) obj).doubleValue()))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            double dDoubleValue = ((Number) it2.next()).doubleValue();
            arrayList3.add(new RawYAxisLabel(dDoubleValue, getLabel(dDoubleValue, z, d3 != null ? d3.doubleValue() : d), d2));
        }
        return arrayList3;
    }

    private static final String getLabel(double d, boolean z, double d2) {
        double dAbs = Math.abs(d);
        String str = d < 0.0d ? "-" : "";
        if (z) {
            double d3 = 100;
            return str + getDecimalString(dAbs * d3, d2 * d3) + "%";
        }
        return str + "$" + getDecimalString(dAbs, d2);
    }

    private static final String getDecimalString(double d, double d2) {
        int i;
        String str = "";
        if (d == Math.floor(d)) {
            if (d >= 1.0E9d && d2 >= 9.9999999E7d) {
                str = "B";
            } else if (d >= 1000000.0d && d2 >= 99999.0d) {
                str = "M";
            } else if (d >= 1000.0d && d2 >= 99.0d) {
                str = "K";
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 66) {
            if (iHashCode != 75) {
                if (iHashCode == 77 && str.equals("M")) {
                    i = InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
                    d /= i;
                }
            } else if (str.equals("K")) {
                i = 1000;
                d /= i;
            }
        } else if (str.equals("B")) {
            i = 1000000000;
            d /= i;
        }
        int i2 = str.length() == 0 ? 2 : 1;
        int i3 = (int) d;
        String strTakeLast = StringsKt.takeLast(String.valueOf((int) (d * Math.pow(10.0d, i2))), i2);
        if (StringsKt.replace$default(strTakeLast, "0", "", false, 4, (Object) null).length() == 0) {
            return i3 + str;
        }
        return i3 + "." + strTakeLast + str;
    }
}
