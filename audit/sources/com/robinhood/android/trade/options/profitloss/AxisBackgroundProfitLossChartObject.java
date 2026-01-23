package com.robinhood.android.trade.options.profitloss;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AxisBackgroundProfitLossChartObject.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0014\u0010\"\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\u0014\u0010%\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\u0014\u0010&\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/AxisBackgroundProfitLossChartObject;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "paintCache", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;Landroid/content/res/Resources;)V", "path", "Landroid/graphics/Path;", "totalCanvasBounds", "Landroid/graphics/Rect;", "zeroString", "", "plusString", "minusString", "requestedLeftPadding", "", "getRequestedLeftPadding", "()F", "requestedTopPadding", "getRequestedTopPadding", "requestedBottomPadding", "getRequestedBottomPadding", "signInfoCenterX", "zeroStringHeight", "plusStringHeight", "minusStringHeight", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "drawXAxis", "chartBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "drawSignInfoBar", "drawDottedBorder", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AxisBackgroundProfitLossChartObject implements OptionsProfitLossChartObject {
    public static final int $stable = 8;
    private final String minusString;
    private final float minusStringHeight;
    private final OptionsProfitLossPaintCache paintCache;
    private final Path path;
    private final String plusString;
    private final float plusStringHeight;
    private final float requestedBottomPadding;
    private final float requestedLeftPadding;
    private final float requestedTopPadding;
    private final float signInfoCenterX;
    private final Rect totalCanvasBounds;
    private final String zeroString;
    private final float zeroStringHeight;

    public AxisBackgroundProfitLossChartObject(OptionsProfitLossPaintCache paintCache, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(paintCache, "paintCache");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.paintCache = paintCache;
        this.path = new Path();
        this.totalCanvasBounds = new Rect();
        String string2 = resources.getString(C11048R.string.general_label_zero);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.zeroString = string2;
        String string3 = resources.getString(C11048R.string.mathematical_symbol_plus);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.plusString = string3;
        String string4 = resources.getString(C11048R.string.mathematical_symbol_minus);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        this.minusString = string4;
        Rect rect = new Rect();
        TextPaint centeredPrimaryTextPaint = paintCache.getCenteredPrimaryTextPaint();
        float strokeWidth = paintCache.getDottedBorderPaint().getStrokeWidth();
        centeredPrimaryTextPaint.getTextBounds(string2, 0, 1, rect);
        float fWidth = rect.width();
        this.zeroStringHeight = rect.height();
        this.signInfoCenterX = paintCache.getSignLeftPadding() + (fWidth / 2);
        this.requestedLeftPadding = paintCache.getSignLeftPadding() + fWidth + paintCache.getSignRightPadding();
        this.requestedTopPadding = strokeWidth;
        this.requestedBottomPadding = strokeWidth;
        centeredPrimaryTextPaint.getTextBounds(string3, 0, 1, rect);
        this.plusStringHeight = rect.height();
        centeredPrimaryTextPaint.getTextBounds(string4, 0, 1, rect);
        this.minusStringHeight = rect.height();
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedRightPadding() {
        return OptionsProfitLossChartObject.DefaultImpls.getRequestedRightPadding(this);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedLeftPadding() {
        return this.requestedLeftPadding;
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
        ChartBounds chartBounds;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(state, "state");
        OptionsProfitLossChartData chartData = state.getChartData();
        if (chartData == null || (chartBounds = chartData.getChartBounds()) == null) {
            return;
        }
        drawSignInfoBar(canvas, chartBounds);
        drawDottedBorder(canvas, chartBounds);
        drawXAxis(canvas, chartBounds);
    }

    private final void drawXAxis(Canvas canvas, ChartBounds chartBounds) {
        canvas.drawLine(chartBounds.getCanvasLeftX(), chartBounds.getCanvasBreakevenY(), chartBounds.getCanvasRightX(), chartBounds.getCanvasBreakevenY(), this.paintCache.getSolidLinePaint());
    }

    private final void drawSignInfoBar(Canvas canvas, ChartBounds chartBounds) {
        float canvasBreakevenY = chartBounds.getCanvasBreakevenY();
        canvas.drawText(this.zeroString, this.signInfoCenterX, (this.zeroStringHeight / 2.0f) + canvasBreakevenY, this.paintCache.getCenteredPrimaryTextPaint());
        float f = 2;
        canvas.drawText(this.plusString, this.signInfoCenterX, ((chartBounds.getCanvasTopY() + canvasBreakevenY) + this.plusStringHeight) / f, this.paintCache.getCenteredPrimaryTextPaint());
        canvas.drawText(this.minusString, this.signInfoCenterX, (((canvasBreakevenY + chartBounds.getCanvasBottomY()) + this.minusStringHeight) + this.zeroStringHeight) / f, this.paintCache.getCenteredPrimaryTextPaint());
    }

    private final void drawDottedBorder(Canvas canvas, ChartBounds chartBounds) {
        float strokeWidth = this.paintCache.getDottedBorderPaint().getStrokeWidth() / 2;
        canvas.getClipBounds(this.totalCanvasBounds);
        Rect rect = this.totalCanvasBounds;
        float f = rect.left;
        float f2 = rect.right;
        this.path.reset();
        this.path.moveTo(f, chartBounds.getCanvasTopY() + strokeWidth);
        this.path.lineTo(f2, chartBounds.getCanvasTopY() - strokeWidth);
        canvas.drawPath(this.path, this.paintCache.getDottedBorderPaint());
        this.path.moveTo(f, chartBounds.getCanvasBottomY() - strokeWidth);
        this.path.lineTo(f2, chartBounds.getCanvasBottomY() + strokeWidth);
        canvas.drawPath(this.path, this.paintCache.getDottedBorderPaint());
        this.path.reset();
    }
}
