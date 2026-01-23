package com.robinhood.android.options.lib.simulatedreturn.chart;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnChartViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartPoint;", "", "x", "", "y", "xValue", "Ljava/math/BigDecimal;", "yValue", "estimatedContractPrice", "dateLabel", "", "<init>", "(FFLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getX", "()F", "getY", "getXValue", "()Ljava/math/BigDecimal;", "getYValue", "getEstimatedContractPrice", "getDateLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnChartPoint {
    public static final int $stable = 8;
    private final String dateLabel;
    private final BigDecimal estimatedContractPrice;
    private final float x;
    private final BigDecimal xValue;
    private final float y;
    private final BigDecimal yValue;

    public static /* synthetic */ OptionsSimulatedReturnChartPoint copy$default(OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint, float f, float f2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = optionsSimulatedReturnChartPoint.x;
        }
        if ((i & 2) != 0) {
            f2 = optionsSimulatedReturnChartPoint.y;
        }
        if ((i & 4) != 0) {
            bigDecimal = optionsSimulatedReturnChartPoint.xValue;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = optionsSimulatedReturnChartPoint.yValue;
        }
        if ((i & 16) != 0) {
            bigDecimal3 = optionsSimulatedReturnChartPoint.estimatedContractPrice;
        }
        if ((i & 32) != 0) {
            str = optionsSimulatedReturnChartPoint.dateLabel;
        }
        BigDecimal bigDecimal4 = bigDecimal3;
        String str2 = str;
        return optionsSimulatedReturnChartPoint.copy(f, f2, bigDecimal, bigDecimal2, bigDecimal4, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getXValue() {
        return this.xValue;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getYValue() {
        return this.yValue;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDateLabel() {
        return this.dateLabel;
    }

    public final OptionsSimulatedReturnChartPoint copy(float x, float y, BigDecimal xValue, BigDecimal yValue, BigDecimal estimatedContractPrice, String dateLabel) {
        Intrinsics.checkNotNullParameter(xValue, "xValue");
        Intrinsics.checkNotNullParameter(yValue, "yValue");
        Intrinsics.checkNotNullParameter(estimatedContractPrice, "estimatedContractPrice");
        Intrinsics.checkNotNullParameter(dateLabel, "dateLabel");
        return new OptionsSimulatedReturnChartPoint(x, y, xValue, yValue, estimatedContractPrice, dateLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnChartPoint)) {
            return false;
        }
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = (OptionsSimulatedReturnChartPoint) other;
        return Float.compare(this.x, optionsSimulatedReturnChartPoint.x) == 0 && Float.compare(this.y, optionsSimulatedReturnChartPoint.y) == 0 && Intrinsics.areEqual(this.xValue, optionsSimulatedReturnChartPoint.xValue) && Intrinsics.areEqual(this.yValue, optionsSimulatedReturnChartPoint.yValue) && Intrinsics.areEqual(this.estimatedContractPrice, optionsSimulatedReturnChartPoint.estimatedContractPrice) && Intrinsics.areEqual(this.dateLabel, optionsSimulatedReturnChartPoint.dateLabel);
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + this.xValue.hashCode()) * 31) + this.yValue.hashCode()) * 31) + this.estimatedContractPrice.hashCode()) * 31) + this.dateLabel.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnChartPoint(x=" + this.x + ", y=" + this.y + ", xValue=" + this.xValue + ", yValue=" + this.yValue + ", estimatedContractPrice=" + this.estimatedContractPrice + ", dateLabel=" + this.dateLabel + ")";
    }

    public OptionsSimulatedReturnChartPoint(float f, float f2, BigDecimal xValue, BigDecimal yValue, BigDecimal estimatedContractPrice, String dateLabel) {
        Intrinsics.checkNotNullParameter(xValue, "xValue");
        Intrinsics.checkNotNullParameter(yValue, "yValue");
        Intrinsics.checkNotNullParameter(estimatedContractPrice, "estimatedContractPrice");
        Intrinsics.checkNotNullParameter(dateLabel, "dateLabel");
        this.x = f;
        this.y = f2;
        this.xValue = xValue;
        this.yValue = yValue;
        this.estimatedContractPrice = estimatedContractPrice;
        this.dateLabel = dateLabel;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final BigDecimal getXValue() {
        return this.xValue;
    }

    public final BigDecimal getYValue() {
        return this.yValue;
    }

    public final BigDecimal getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    public final String getDateLabel() {
        return this.dateLabel;
    }
}
