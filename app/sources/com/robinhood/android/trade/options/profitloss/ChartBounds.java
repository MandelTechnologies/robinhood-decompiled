package com.robinhood.android.trade.options.profitloss;

import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "", "canvasLeftX", "", "canvasRightX", "canvasTopY", "canvasBottomY", "priceLeftX", "Lcom/robinhood/models/util/Money;", "priceRightX", "priceTopY", "priceBottomY", "<init>", "(FFFFLcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "chartCanvasBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;", "apiOptionsProfitLossChart", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "(Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;Lcom/robinhood/models/api/ApiOptionsProfitLossChart;)V", "getCanvasLeftX", "()F", "getCanvasRightX", "getCanvasTopY", "getCanvasBottomY", "getPriceLeftX", "()Lcom/robinhood/models/util/Money;", "getPriceRightX", "getPriceTopY", "getPriceBottomY", "canvasWidth", "getCanvasWidth", "canvasHeight", "getCanvasHeight", "priceWidth", "getPriceWidth", "priceHeight", "getPriceHeight", "canvasBreakevenY", "getCanvasBreakevenY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChartBounds {
    public static final int $stable = 8;
    private final float canvasBottomY;
    private final float canvasBreakevenY;
    private final float canvasHeight;
    private final float canvasLeftX;
    private final float canvasRightX;
    private final float canvasTopY;
    private final float canvasWidth;
    private final Money priceBottomY;
    private final Money priceHeight;
    private final Money priceLeftX;
    private final Money priceRightX;
    private final Money priceTopY;
    private final Money priceWidth;

    public static /* synthetic */ ChartBounds copy$default(ChartBounds chartBounds, float f, float f2, float f3, float f4, Money money, Money money2, Money money3, Money money4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = chartBounds.canvasLeftX;
        }
        if ((i & 2) != 0) {
            f2 = chartBounds.canvasRightX;
        }
        if ((i & 4) != 0) {
            f3 = chartBounds.canvasTopY;
        }
        if ((i & 8) != 0) {
            f4 = chartBounds.canvasBottomY;
        }
        if ((i & 16) != 0) {
            money = chartBounds.priceLeftX;
        }
        if ((i & 32) != 0) {
            money2 = chartBounds.priceRightX;
        }
        if ((i & 64) != 0) {
            money3 = chartBounds.priceTopY;
        }
        if ((i & 128) != 0) {
            money4 = chartBounds.priceBottomY;
        }
        Money money5 = money3;
        Money money6 = money4;
        Money money7 = money;
        Money money8 = money2;
        return chartBounds.copy(f, f2, f3, f4, money7, money8, money5, money6);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCanvasLeftX() {
        return this.canvasLeftX;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCanvasRightX() {
        return this.canvasRightX;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCanvasTopY() {
        return this.canvasTopY;
    }

    /* renamed from: component4, reason: from getter */
    public final float getCanvasBottomY() {
        return this.canvasBottomY;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getPriceLeftX() {
        return this.priceLeftX;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getPriceRightX() {
        return this.priceRightX;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getPriceTopY() {
        return this.priceTopY;
    }

    /* renamed from: component8, reason: from getter */
    public final Money getPriceBottomY() {
        return this.priceBottomY;
    }

    public final ChartBounds copy(float canvasLeftX, float canvasRightX, float canvasTopY, float canvasBottomY, Money priceLeftX, Money priceRightX, Money priceTopY, Money priceBottomY) {
        Intrinsics.checkNotNullParameter(priceLeftX, "priceLeftX");
        Intrinsics.checkNotNullParameter(priceRightX, "priceRightX");
        Intrinsics.checkNotNullParameter(priceTopY, "priceTopY");
        Intrinsics.checkNotNullParameter(priceBottomY, "priceBottomY");
        return new ChartBounds(canvasLeftX, canvasRightX, canvasTopY, canvasBottomY, priceLeftX, priceRightX, priceTopY, priceBottomY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartBounds)) {
            return false;
        }
        ChartBounds chartBounds = (ChartBounds) other;
        return Float.compare(this.canvasLeftX, chartBounds.canvasLeftX) == 0 && Float.compare(this.canvasRightX, chartBounds.canvasRightX) == 0 && Float.compare(this.canvasTopY, chartBounds.canvasTopY) == 0 && Float.compare(this.canvasBottomY, chartBounds.canvasBottomY) == 0 && Intrinsics.areEqual(this.priceLeftX, chartBounds.priceLeftX) && Intrinsics.areEqual(this.priceRightX, chartBounds.priceRightX) && Intrinsics.areEqual(this.priceTopY, chartBounds.priceTopY) && Intrinsics.areEqual(this.priceBottomY, chartBounds.priceBottomY);
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.canvasLeftX) * 31) + Float.hashCode(this.canvasRightX)) * 31) + Float.hashCode(this.canvasTopY)) * 31) + Float.hashCode(this.canvasBottomY)) * 31) + this.priceLeftX.hashCode()) * 31) + this.priceRightX.hashCode()) * 31) + this.priceTopY.hashCode()) * 31) + this.priceBottomY.hashCode();
    }

    public String toString() {
        return "ChartBounds(canvasLeftX=" + this.canvasLeftX + ", canvasRightX=" + this.canvasRightX + ", canvasTopY=" + this.canvasTopY + ", canvasBottomY=" + this.canvasBottomY + ", priceLeftX=" + this.priceLeftX + ", priceRightX=" + this.priceRightX + ", priceTopY=" + this.priceTopY + ", priceBottomY=" + this.priceBottomY + ")";
    }

    public ChartBounds(float f, float f2, float f3, float f4, Money priceLeftX, Money priceRightX, Money priceTopY, Money priceBottomY) {
        Intrinsics.checkNotNullParameter(priceLeftX, "priceLeftX");
        Intrinsics.checkNotNullParameter(priceRightX, "priceRightX");
        Intrinsics.checkNotNullParameter(priceTopY, "priceTopY");
        Intrinsics.checkNotNullParameter(priceBottomY, "priceBottomY");
        this.canvasLeftX = f;
        this.canvasRightX = f2;
        this.canvasTopY = f3;
        this.canvasBottomY = f4;
        this.priceLeftX = priceLeftX;
        this.priceRightX = priceRightX;
        this.priceTopY = priceTopY;
        this.priceBottomY = priceBottomY;
        this.canvasWidth = f2 - f;
        this.canvasHeight = f4 - f3;
        this.priceWidth = priceRightX.minus(priceLeftX);
        this.priceHeight = priceTopY.minus(priceBottomY);
        Currency currency = priceLeftX.getCurrency();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.canvasBreakevenY = new OptionsProfitLossChartData.ProfitLoss(new Money(currency, ZERO), this).getCanvasPos();
    }

    public final float getCanvasLeftX() {
        return this.canvasLeftX;
    }

    public final float getCanvasRightX() {
        return this.canvasRightX;
    }

    public final float getCanvasTopY() {
        return this.canvasTopY;
    }

    public final float getCanvasBottomY() {
        return this.canvasBottomY;
    }

    public final Money getPriceLeftX() {
        return this.priceLeftX;
    }

    public final Money getPriceRightX() {
        return this.priceRightX;
    }

    public final Money getPriceTopY() {
        return this.priceTopY;
    }

    public final Money getPriceBottomY() {
        return this.priceBottomY;
    }

    public final float getCanvasWidth() {
        return this.canvasWidth;
    }

    public final float getCanvasHeight() {
        return this.canvasHeight;
    }

    public final Money getPriceWidth() {
        return this.priceWidth;
    }

    public final Money getPriceHeight() {
        return this.priceHeight;
    }

    public final float getCanvasBreakevenY() {
        return this.canvasBreakevenY;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartBounds(ChartCanvasBounds chartCanvasBounds, ApiOptionsProfitLossChart apiOptionsProfitLossChart) {
        this(chartCanvasBounds.getCanvasLeftX(), chartCanvasBounds.getCanvasRightX(), chartCanvasBounds.getCanvasTopY(), chartCanvasBounds.getCanvasBottomY(), apiOptionsProfitLossChart.getMin_x(), apiOptionsProfitLossChart.getMax_x(), apiOptionsProfitLossChart.getMax_y(), apiOptionsProfitLossChart.getMin_y());
        Intrinsics.checkNotNullParameter(chartCanvasBounds, "chartCanvasBounds");
        Intrinsics.checkNotNullParameter(apiOptionsProfitLossChart, "apiOptionsProfitLossChart");
    }
}
