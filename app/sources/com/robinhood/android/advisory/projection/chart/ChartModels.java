package com.robinhood.android.advisory.projection.chart;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.models.advisory.p304db.projection.ProjectedValues;
import com.robinhood.models.advisory.p304db.projection.YearlyProjectedValues;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: ChartModels.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003\u001a\u0006\u0010\t\u001a\u00020\u0001¨\u0006\n"}, m3636d2 = {"generateLoadingAnimationData", "Lcom/robinhood/models/advisory/db/projection/ProjectedValues;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "currentPortfolioValue", "Ljava/math/BigDecimal;", "growthRate5", "growthRateMedian", "growthRate95", "generateEmptyData", "feature-projected-returns_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.chart.ChartModelsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartModels {
    public static /* synthetic */ ProjectedValues generateLoadingAnimationData$default(double d, BigDecimal bigDecimal, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 4) != 0) {
            d2 = 0.02d;
        }
        return generateLoadingAnimationData(d, bigDecimal, d2, (i & 8) != 0 ? 0.05d : d3, (i & 16) != 0 ? 0.08d : d4);
    }

    public static final ProjectedValues generateLoadingAnimationData(double d, BigDecimal currentPortfolioValue, double d2, double d3, double d4) {
        int i;
        Intrinsics.checkNotNullParameter(currentPortfolioValue, "currentPortfolioValue");
        double dDoubleValue = currentPortfolioValue.doubleValue();
        double dDoubleValue2 = currentPortfolioValue.doubleValue();
        double dDoubleValue3 = currentPortfolioValue.doubleValue();
        double dDoubleValue4 = currentPortfolioValue.doubleValue();
        int i2 = 0;
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 30);
        int i3 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (true) {
            i = 3;
            if (!it.hasNext()) {
                break;
            }
            ((PrimitiveIterators6) it).nextInt();
            PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(i2, 3);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, i3));
            Iterator<Integer> it2 = primitiveRanges2.iterator();
            while (it2.hasNext()) {
                ((PrimitiveIterators6) it2).nextInt();
                dDoubleValue = Math.round(((dDoubleValue + d) * (1 + (d2 / 4))) * 100.0d) / 100.0d;
                arrayList2.add(Double.valueOf(dDoubleValue));
                dDoubleValue4 = dDoubleValue4;
            }
            arrayList.add(new YearlyProjectedValues(arrayList2));
            dDoubleValue4 = dDoubleValue4;
            i2 = 0;
            i3 = 10;
        }
        double dRound = dDoubleValue4;
        int i4 = i2;
        PrimitiveRanges2 primitiveRanges2Until2 = RangesKt.until(i4, 30);
        int i5 = 10;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until2, 10));
        Iterator<Integer> it3 = primitiveRanges2Until2.iterator();
        while (it3.hasNext()) {
            ((PrimitiveIterators6) it3).nextInt();
            PrimitiveRanges2 primitiveRanges22 = new PrimitiveRanges2(i4, i);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges22, i5));
            Iterator<Integer> it4 = primitiveRanges22.iterator();
            while (it4.hasNext()) {
                ((PrimitiveIterators6) it4).nextInt();
                dDoubleValue2 = Math.round(((dDoubleValue2 + d) * (1 + (d3 / 4))) * 100.0d) / 100.0d;
                arrayList4.add(Double.valueOf(dDoubleValue2));
            }
            arrayList3.add(new YearlyProjectedValues(arrayList4));
            i4 = 0;
            i5 = 10;
            i = 3;
        }
        PrimitiveRanges2 primitiveRanges2Until3 = RangesKt.until(i4, 30);
        int i6 = 10;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until3, 10));
        Iterator<Integer> it5 = primitiveRanges2Until3.iterator();
        while (it5.hasNext()) {
            ((PrimitiveIterators6) it5).nextInt();
            PrimitiveRanges2 primitiveRanges23 = new PrimitiveRanges2(i4, 3);
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges23, i6));
            Iterator<Integer> it6 = primitiveRanges23.iterator();
            while (it6.hasNext()) {
                ((PrimitiveIterators6) it6).nextInt();
                dDoubleValue3 = Math.round(((dDoubleValue3 + d) * (1 + (d4 / 4))) * 100.0d) / 100.0d;
                arrayList6.add(Double.valueOf(dDoubleValue3));
            }
            arrayList5.add(new YearlyProjectedValues(arrayList6));
            i4 = 0;
            i6 = 10;
        }
        PrimitiveRanges2 primitiveRanges2Until4 = RangesKt.until(i4, 30);
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until4, 10));
        Iterator<Integer> it7 = primitiveRanges2Until4.iterator();
        while (it7.hasNext()) {
            ((PrimitiveIterators6) it7).nextInt();
            PrimitiveRanges2 primitiveRanges24 = new PrimitiveRanges2(i4, 3);
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges24, 10));
            Iterator<Integer> it8 = primitiveRanges24.iterator();
            while (it8.hasNext()) {
                ((PrimitiveIterators6) it8).nextInt();
                dRound = Math.round((dRound + (d / 4)) * 100.0d) / 100.0d;
                arrayList8.add(Double.valueOf(dRound));
            }
            arrayList7.add(new YearlyProjectedValues(arrayList8));
        }
        return new ProjectedValues(arrayList, arrayList3, arrayList5, arrayList7);
    }

    public static final ProjectedValues generateEmptyData() {
        return new ProjectedValues(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
