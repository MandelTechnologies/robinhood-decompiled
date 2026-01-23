package com.robinhood.android.trade.options.profitloss;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SignificantPointsProfitLossChartObject.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u0011*\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/SignificantPointsProfitLossChartObject;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "paintCache", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;)V", "requestedLeftPadding", "", "getRequestedLeftPadding", "()F", "requestedRightPadding", "getRequestedRightPadding", "requestedTopPadding", "getRequestedTopPadding", "requestedBottomPadding", "getRequestedBottomPadding", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "drawPoint", "point", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;", "paint", "Landroid/graphics/Paint;", "isSelected", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SignificantPointsProfitLossChartObject implements OptionsProfitLossChartObject {
    public static final int $stable = 8;
    private final OptionsProfitLossPaintCache paintCache;
    private final float requestedBottomPadding;
    private final float requestedLeftPadding;
    private final float requestedRightPadding;
    private final float requestedTopPadding;

    public SignificantPointsProfitLossChartObject(OptionsProfitLossPaintCache paintCache) {
        Intrinsics.checkNotNullParameter(paintCache, "paintCache");
        this.paintCache = paintCache;
        this.requestedLeftPadding = paintCache.getPointRadius();
        this.requestedRightPadding = paintCache.getPointRadius();
        this.requestedTopPadding = paintCache.getPointRadius();
        this.requestedBottomPadding = paintCache.getPointRadius();
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedLeftPadding() {
        return this.requestedLeftPadding;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedRightPadding() {
        return this.requestedRightPadding;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedTopPadding() {
        return this.requestedTopPadding;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedBottomPadding() {
        return this.requestedBottomPadding;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public void onDraw(Canvas canvas, OptionsProfitLossChartViewState state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(state, "state");
        OptionsProfitLossChartData chartData = state.getChartData();
        if (chartData == null) {
            return;
        }
        OptionsProfitLossChartData.Point closestPointOrNull = state.getClosestPointOrNull(this.paintCache.getPointRadius());
        List<OptionsProfitLossChartData.Point> pricesOfInterest = chartData.getPricesOfInterest();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pricesOfInterest, 10));
        for (OptionsProfitLossChartData.Point point : pricesOfInterest) {
            drawPoint(canvas, point, this.paintCache.getFillPaint(ProfitLossDirection.INSTANCE.getProfitLossDirection$feature_options_pl_chart_externalDebug(point)), Intrinsics.areEqual(point, closestPointOrNull));
            arrayList.add(Unit.INSTANCE);
        }
        List<OptionsProfitLossChartData.Point> breakevenPoints = chartData.getBreakevenPoints();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(breakevenPoints, 10));
        for (OptionsProfitLossChartData.Point point2 : breakevenPoints) {
            drawPoint(canvas, point2, this.paintCache.getNeutralFillPaint(), Intrinsics.areEqual(point2, closestPointOrNull));
            arrayList2.add(Unit.INSTANCE);
        }
    }

    private final void drawPoint(Canvas canvas, OptionsProfitLossChartData.Point point, Paint paint, boolean z) {
        canvas.drawCircle(point.getCanvasX(), point.getCanvasY(), z ? this.paintCache.getSelectedPointRadius() : this.paintCache.getPointRadius(), paint);
    }
}
