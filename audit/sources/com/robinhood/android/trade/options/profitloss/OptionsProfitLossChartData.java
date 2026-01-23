package com.robinhood.android.trade.options.profitloss;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.options.profitloss.EdgeProfitLossLimit;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0004()*+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0019¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0019¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData;", "", "chart", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "chartCanvasBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;", "<init>", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChart;Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;)V", "chartBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "getChartBounds", "()Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "leftLimit", "Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit;", "getLeftLimit", "()Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit;", "rightLimit", "getRightLimit", "maxProfit", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "getMaxProfit", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "maxLoss", "getMaxLoss", "pricesOfInterest", "", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;", "getPricesOfInterest", "()Ljava/util/List;", "breakevenPoints", "getBreakevenPoints", "positiveSparklines", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Segment;", "getPositiveSparklines", "negativeSparklines", "getNegativeSparklines", "positiveAreas", "getPositiveAreas", "negativeAreas", "getNegativeAreas", "UnderlyingPrice", "ProfitLoss", "Point", "Segment", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionsProfitLossChartData {
    public static final int $stable = 8;
    private final List<Point> breakevenPoints;
    private final ChartBounds chartBounds;
    private final EdgeProfitLossLimit leftLimit;
    private final ApiOptionsProfitLossChart.ProfitLossLimit maxLoss;
    private final ApiOptionsProfitLossChart.ProfitLossLimit maxProfit;
    private final List<List<Segment>> negativeAreas;
    private final List<Segment> negativeSparklines;
    private final List<List<Segment>> positiveAreas;
    private final List<Segment> positiveSparklines;
    private final List<Point> pricesOfInterest;
    private final EdgeProfitLossLimit rightLimit;

    public OptionsProfitLossChartData(ApiOptionsProfitLossChart chart, ChartCanvasBounds chartCanvasBounds) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartCanvasBounds, "chartCanvasBounds");
        ChartBounds chartBounds = new ChartBounds(chartCanvasBounds, chart);
        this.chartBounds = chartBounds;
        this.leftLimit = new EdgeProfitLossLimit(chart.getLimit_at_zero(), EdgeProfitLossLimit.Side.LEFT, new UnderlyingPrice(chart.getMin_x(), chartBounds));
        this.rightLimit = new EdgeProfitLossLimit(chart.getLimit_at_infinity(), EdgeProfitLossLimit.Side.RIGHT, new UnderlyingPrice(chart.getMax_x(), chartBounds));
        this.maxProfit = chart.getMax_profit();
        this.maxLoss = chart.getMax_loss();
        List<ApiOptionsProfitLossChart.ProfitLossPoint> prices_of_interest = chart.getPrices_of_interest();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(prices_of_interest, 10));
        Iterator<T> it = prices_of_interest.iterator();
        while (it.hasNext()) {
            arrayList.add(new Point((ApiOptionsProfitLossChart.ProfitLossPoint) it.next(), this.chartBounds));
        }
        this.pricesOfInterest = arrayList;
        List<ApiOptionsProfitLossChart.ProfitLossPoint> breakeven_points = chart.getBreakeven_points();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(breakeven_points, 10));
        Iterator<T> it2 = breakeven_points.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Point((ApiOptionsProfitLossChart.ProfitLossPoint) it2.next(), this.chartBounds));
        }
        this.breakevenPoints = arrayList2;
        List<ApiOptionsProfitLossChart.ProfitLossSegment> positive_sparklines = chart.getPositive_sparklines();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(positive_sparklines, 10));
        Iterator<T> it3 = positive_sparklines.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new Segment((ApiOptionsProfitLossChart.ProfitLossSegment) it3.next(), this.chartBounds));
        }
        this.positiveSparklines = arrayList3;
        List<ApiOptionsProfitLossChart.ProfitLossSegment> negative_sparklines = chart.getNegative_sparklines();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(negative_sparklines, 10));
        Iterator<T> it4 = negative_sparklines.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new Segment((ApiOptionsProfitLossChart.ProfitLossSegment) it4.next(), this.chartBounds));
        }
        this.negativeSparklines = arrayList4;
        List<List<ApiOptionsProfitLossChart.ProfitLossSegment>> positive_areas = chart.getPositive_areas();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(positive_areas, 10));
        Iterator<T> it5 = positive_areas.iterator();
        while (it5.hasNext()) {
            List list = (List) it5.next();
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList6.add(new Segment((ApiOptionsProfitLossChart.ProfitLossSegment) it6.next(), this.chartBounds));
            }
            arrayList5.add(arrayList6);
        }
        this.positiveAreas = arrayList5;
        List<List<ApiOptionsProfitLossChart.ProfitLossSegment>> negative_areas = chart.getNegative_areas();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(negative_areas, 10));
        Iterator<T> it7 = negative_areas.iterator();
        while (it7.hasNext()) {
            List list2 = (List) it7.next();
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList8.add(new Segment((ApiOptionsProfitLossChart.ProfitLossSegment) it8.next(), this.chartBounds));
            }
            arrayList7.add(arrayList8);
        }
        this.negativeAreas = arrayList7;
    }

    public final ChartBounds getChartBounds() {
        return this.chartBounds;
    }

    public final EdgeProfitLossLimit getLeftLimit() {
        return this.leftLimit;
    }

    public final EdgeProfitLossLimit getRightLimit() {
        return this.rightLimit;
    }

    public final ApiOptionsProfitLossChart.ProfitLossLimit getMaxProfit() {
        return this.maxProfit;
    }

    public final ApiOptionsProfitLossChart.ProfitLossLimit getMaxLoss() {
        return this.maxLoss;
    }

    public final List<Point> getPricesOfInterest() {
        return this.pricesOfInterest;
    }

    public final List<Point> getBreakevenPoints() {
        return this.breakevenPoints;
    }

    public final List<Segment> getPositiveSparklines() {
        return this.positiveSparklines;
    }

    public final List<Segment> getNegativeSparklines() {
        return this.negativeSparklines;
    }

    public final List<List<Segment>> getPositiveAreas() {
        return this.positiveAreas;
    }

    public final List<List<Segment>> getNegativeAreas() {
        return this.negativeAreas;
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\nR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;", "", "priceX", "Lcom/robinhood/models/util/Money;", "chartBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/trade/options/profitloss/ChartBounds;)V", "canvasX", "", "(FLcom/robinhood/android/trade/options/profitloss/ChartBounds;)V", "canvasPos", "getCanvasPos", "()F", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "()Lcom/robinhood/models/util/Money;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnderlyingPrice {
        public static final int $stable = 8;
        private final float canvasPos;
        private final Money price;

        public final float getCanvasPos() {
            return this.canvasPos;
        }

        public final Money getPrice() {
            return this.price;
        }

        public UnderlyingPrice(Money priceX, ChartBounds chartBounds) {
            Intrinsics.checkNotNullParameter(priceX, "priceX");
            Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
            this.price = priceX;
            this.canvasPos = (chartBounds.getCanvasWidth() * priceX.minus(chartBounds.getPriceLeftX()).div(chartBounds.getPriceWidth()).floatValue()) + chartBounds.getCanvasLeftX();
        }

        public UnderlyingPrice(float f, ChartBounds chartBounds) {
            Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
            this.canvasPos = f;
            this.price = chartBounds.getPriceWidth().times(new BigDecimal(String.valueOf((f - chartBounds.getCanvasLeftX()) / chartBounds.getCanvasWidth()))).plus(chartBounds.getPriceLeftX());
        }
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\nR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$ProfitLoss;", "", "priceY", "Lcom/robinhood/models/util/Money;", "chartBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/trade/options/profitloss/ChartBounds;)V", "canvasY", "", "(FLcom/robinhood/android/trade/options/profitloss/ChartBounds;)V", "canvasPos", "getCanvasPos", "()F", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "()Lcom/robinhood/models/util/Money;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProfitLoss {
        public static final int $stable = 8;
        private final float canvasPos;
        private final Money price;

        public final float getCanvasPos() {
            return this.canvasPos;
        }

        public final Money getPrice() {
            return this.price;
        }

        public ProfitLoss(Money priceY, ChartBounds chartBounds) {
            Intrinsics.checkNotNullParameter(priceY, "priceY");
            Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
            this.price = priceY;
            this.canvasPos = chartBounds.getCanvasBottomY() - (chartBounds.getCanvasHeight() * priceY.minus(chartBounds.getPriceBottomY()).div(chartBounds.getPriceHeight()).floatValue());
        }

        public ProfitLoss(float f, ChartBounds chartBounds) {
            Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
            this.canvasPos = f;
            this.price = chartBounds.getPriceHeight().times(new BigDecimal(String.valueOf((chartBounds.getCanvasBottomY() - f) / chartBounds.getCanvasHeight()))).plus(chartBounds.getPriceBottomY());
        }
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\b\u0010\u0013J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J1\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;", "", "canvasX", "", "canvasY", "priceX", "Lcom/robinhood/models/util/Money;", "priceY", "<init>", "(FFLcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "x", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;", "y", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$ProfitLoss;", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$ProfitLoss;)V", "apiPoint", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossPoint;", "chartBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossPoint;Lcom/robinhood/android/trade/options/profitloss/ChartBounds;)V", "getCanvasX", "()F", "getCanvasY", "getPriceX", "()Lcom/robinhood/models/util/Money;", "getPriceY", "profitLossLimit", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "getProfitLossLimit", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Point {
        public static final int $stable = 8;
        private final float canvasX;
        private final float canvasY;
        private final Money priceX;
        private final Money priceY;

        public static /* synthetic */ Point copy$default(Point point, float f, float f2, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = point.canvasX;
            }
            if ((i & 2) != 0) {
                f2 = point.canvasY;
            }
            if ((i & 4) != 0) {
                money = point.priceX;
            }
            if ((i & 8) != 0) {
                money2 = point.priceY;
            }
            return point.copy(f, f2, money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getCanvasX() {
            return this.canvasX;
        }

        /* renamed from: component2, reason: from getter */
        public final float getCanvasY() {
            return this.canvasY;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getPriceX() {
            return this.priceX;
        }

        /* renamed from: component4, reason: from getter */
        public final Money getPriceY() {
            return this.priceY;
        }

        public final Point copy(float canvasX, float canvasY, Money priceX, Money priceY) {
            Intrinsics.checkNotNullParameter(priceX, "priceX");
            Intrinsics.checkNotNullParameter(priceY, "priceY");
            return new Point(canvasX, canvasY, priceX, priceY);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Point)) {
                return false;
            }
            Point point = (Point) other;
            return Float.compare(this.canvasX, point.canvasX) == 0 && Float.compare(this.canvasY, point.canvasY) == 0 && Intrinsics.areEqual(this.priceX, point.priceX) && Intrinsics.areEqual(this.priceY, point.priceY);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.canvasX) * 31) + Float.hashCode(this.canvasY)) * 31) + this.priceX.hashCode()) * 31) + this.priceY.hashCode();
        }

        public String toString() {
            return "Point(canvasX=" + this.canvasX + ", canvasY=" + this.canvasY + ", priceX=" + this.priceX + ", priceY=" + this.priceY + ")";
        }

        public Point(float f, float f2, Money priceX, Money priceY) {
            Intrinsics.checkNotNullParameter(priceX, "priceX");
            Intrinsics.checkNotNullParameter(priceY, "priceY");
            this.canvasX = f;
            this.canvasY = f2;
            this.priceX = priceX;
            this.priceY = priceY;
        }

        public final float getCanvasX() {
            return this.canvasX;
        }

        public final float getCanvasY() {
            return this.canvasY;
        }

        public final Money getPriceX() {
            return this.priceX;
        }

        public final Money getPriceY() {
            return this.priceY;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Point(UnderlyingPrice x, ProfitLoss y) {
            this(x.getCanvasPos(), y.getCanvasPos(), x.getPrice(), y.getPrice());
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(y, "y");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Point(ApiOptionsProfitLossChart.ProfitLossPoint apiPoint, ChartBounds chartBounds) {
            this(new UnderlyingPrice(apiPoint.getUnderlying_price(), chartBounds), new ProfitLoss(apiPoint.getProfit_or_loss(), chartBounds));
            Intrinsics.checkNotNullParameter(apiPoint, "apiPoint");
            Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
        }

        public final ApiOptionsProfitLossChart.ProfitLossLimit getProfitLossLimit() {
            return new ApiOptionsProfitLossChart.ProfitLossLimit(ApiOptionsProfitLossChart.LimitType.FINITE, this.priceY);
        }
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Segment;", "", "points", "", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;", "interpolation", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$InterpolationType;", "chartBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "<init>", "(Ljava/util/List;Lcom/robinhood/models/api/ApiOptionsProfitLossChart$InterpolationType;Lcom/robinhood/android/trade/options/profitloss/ChartBounds;)V", "apiSegment", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossSegment;", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossSegment;Lcom/robinhood/android/trade/options/profitloss/ChartBounds;)V", "getPoints", "()Ljava/util/List;", "getInterpolation", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChart$InterpolationType;", "sortedPoints", "getPoint", "underlyingPrice", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;", "interpolateLinear", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Segment {
        public static final int $stable = 8;
        private final ChartBounds chartBounds;
        private final ApiOptionsProfitLossChart.InterpolationType interpolation;
        private final List<Point> points;
        private final List<Point> sortedPoints;

        /* compiled from: OptionsProfitLossChartViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiOptionsProfitLossChart.InterpolationType.values().length];
                try {
                    iArr[ApiOptionsProfitLossChart.InterpolationType.LINEAR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiOptionsProfitLossChart.InterpolationType.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Segment(List<Point> points, ApiOptionsProfitLossChart.InterpolationType interpolation, ChartBounds chartBounds) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(interpolation, "interpolation");
            Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
            this.points = points;
            this.interpolation = interpolation;
            this.chartBounds = chartBounds;
            this.sortedPoints = CollectionsKt.sortedWith(points, new Comparator() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData$Segment$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((OptionsProfitLossChartData.Point) t).getPriceX(), ((OptionsProfitLossChartData.Point) t2).getPriceX());
                }
            });
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        public final ApiOptionsProfitLossChart.InterpolationType getInterpolation() {
            return this.interpolation;
        }

        public Segment(ApiOptionsProfitLossChart.ProfitLossSegment apiSegment, ChartBounds chartBounds) {
            Intrinsics.checkNotNullParameter(apiSegment, "apiSegment");
            Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
            List<ApiOptionsProfitLossChart.ProfitLossPoint> points = apiSegment.getPoints();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            Iterator<T> it = points.iterator();
            while (it.hasNext()) {
                arrayList.add(new Point((ApiOptionsProfitLossChart.ProfitLossPoint) it.next(), chartBounds));
            }
            this(arrayList, apiSegment.getInterpolation(), chartBounds);
        }

        public final Point getPoint(UnderlyingPrice underlyingPrice) {
            Intrinsics.checkNotNullParameter(underlyingPrice, "underlyingPrice");
            Point point = (Point) CollectionsKt.firstOrNull((List) this.sortedPoints);
            if (point == null) {
                return null;
            }
            if (Intrinsics.areEqual(underlyingPrice.getPrice(), point.getPriceX())) {
                return point;
            }
            Iterator<T> it = this.sortedPoints.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                Object next = it.next();
                int i = 0;
                while (it.hasNext()) {
                    Object next2 = it.next();
                    Point point2 = (Point) next2;
                    Point point3 = (Point) next;
                    if (Intrinsics.areEqual(underlyingPrice.getPrice(), point2.getPriceX())) {
                        return point2;
                    }
                    if (underlyingPrice.getPrice().compareTo(point3.getPriceX()) > 0 && underlyingPrice.getPrice().compareTo(point2.getPriceX()) < 0) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[this.interpolation.ordinal()];
                        if (i2 == 1) {
                            return interpolateLinear(underlyingPrice, i);
                        }
                        if (i2 == 2) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(Integer.valueOf(i));
                    i++;
                    next = next2;
                }
            } else {
                CollectionsKt.emptyList();
            }
            return null;
        }

        private final Point interpolateLinear(UnderlyingPrice underlyingPrice, int index) {
            Point point = this.sortedPoints.get(index);
            Point point2 = this.sortedPoints.get(index + 1);
            return new Point(underlyingPrice, new ProfitLoss(point.getPriceY().plus(point2.getPriceY().minus(point.getPriceY()).times(underlyingPrice.getPrice().minus(point.getPriceX()).div(point2.getPriceX().minus(point.getPriceX())))), this.chartBounds));
        }
    }
}
