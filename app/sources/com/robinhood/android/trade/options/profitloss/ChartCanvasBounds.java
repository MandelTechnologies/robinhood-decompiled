package com.robinhood.android.trade.options.profitloss;

import kotlin.Metadata;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;", "", "canvasLeftX", "", "canvasRightX", "canvasTopY", "canvasBottomY", "<init>", "(FFFF)V", "getCanvasLeftX", "()F", "getCanvasRightX", "getCanvasTopY", "getCanvasBottomY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChartCanvasBounds {
    public static final int $stable = 0;
    private final float canvasBottomY;
    private final float canvasLeftX;
    private final float canvasRightX;
    private final float canvasTopY;

    public static /* synthetic */ ChartCanvasBounds copy$default(ChartCanvasBounds chartCanvasBounds, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = chartCanvasBounds.canvasLeftX;
        }
        if ((i & 2) != 0) {
            f2 = chartCanvasBounds.canvasRightX;
        }
        if ((i & 4) != 0) {
            f3 = chartCanvasBounds.canvasTopY;
        }
        if ((i & 8) != 0) {
            f4 = chartCanvasBounds.canvasBottomY;
        }
        return chartCanvasBounds.copy(f, f2, f3, f4);
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

    public final ChartCanvasBounds copy(float canvasLeftX, float canvasRightX, float canvasTopY, float canvasBottomY) {
        return new ChartCanvasBounds(canvasLeftX, canvasRightX, canvasTopY, canvasBottomY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartCanvasBounds)) {
            return false;
        }
        ChartCanvasBounds chartCanvasBounds = (ChartCanvasBounds) other;
        return Float.compare(this.canvasLeftX, chartCanvasBounds.canvasLeftX) == 0 && Float.compare(this.canvasRightX, chartCanvasBounds.canvasRightX) == 0 && Float.compare(this.canvasTopY, chartCanvasBounds.canvasTopY) == 0 && Float.compare(this.canvasBottomY, chartCanvasBounds.canvasBottomY) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.canvasLeftX) * 31) + Float.hashCode(this.canvasRightX)) * 31) + Float.hashCode(this.canvasTopY)) * 31) + Float.hashCode(this.canvasBottomY);
    }

    public String toString() {
        return "ChartCanvasBounds(canvasLeftX=" + this.canvasLeftX + ", canvasRightX=" + this.canvasRightX + ", canvasTopY=" + this.canvasTopY + ", canvasBottomY=" + this.canvasBottomY + ")";
    }

    public ChartCanvasBounds(float f, float f2, float f3, float f4) {
        this.canvasLeftX = f;
        this.canvasRightX = f2;
        this.canvasTopY = f3;
        this.canvasBottomY = f4;
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
}
