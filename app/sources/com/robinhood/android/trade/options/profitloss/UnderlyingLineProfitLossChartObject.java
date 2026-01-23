package com.robinhood.android.trade.options.profitloss;

import android.graphics.Canvas;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnderlyingLineProfitLossChartObject.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/UnderlyingLineProfitLossChartObject;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "paintCache", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UnderlyingLineProfitLossChartObject implements OptionsProfitLossChartObject {
    public static final int $stable = 8;
    private final OptionsProfitLossPaintCache paintCache;

    public UnderlyingLineProfitLossChartObject(OptionsProfitLossPaintCache paintCache) {
        Intrinsics.checkNotNullParameter(paintCache, "paintCache");
        this.paintCache = paintCache;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedBottomPadding() {
        return OptionsProfitLossChartObject.DefaultImpls.getRequestedBottomPadding(this);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedLeftPadding() {
        return OptionsProfitLossChartObject.DefaultImpls.getRequestedLeftPadding(this);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedRightPadding() {
        return OptionsProfitLossChartObject.DefaultImpls.getRequestedRightPadding(this);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedTopPadding() {
        return OptionsProfitLossChartObject.DefaultImpls.getRequestedTopPadding(this);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public void onDraw(Canvas canvas, OptionsProfitLossChartViewState state) {
        OptionsProfitLossChartData.Point underlyingPricePoint;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(state, "state");
        ChartCanvasBounds chartCanvasBounds = state.getChartCanvasBounds();
        if (chartCanvasBounds == null || (underlyingPricePoint = state.getUnderlyingPricePoint()) == null) {
            return;
        }
        canvas.drawLine(underlyingPricePoint.getCanvasX(), chartCanvasBounds.getCanvasBottomY(), underlyingPricePoint.getCanvasX(), chartCanvasBounds.getCanvasTopY(), this.paintCache.getUnderlyingLinePaint());
    }
}
