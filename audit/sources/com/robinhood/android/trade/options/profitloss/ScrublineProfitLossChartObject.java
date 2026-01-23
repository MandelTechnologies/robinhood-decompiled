package com.robinhood.android.trade.options.profitloss;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.trade.options.profitloss.ChartParams;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ScrublineProfitLossChartObject.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J4\u0010\"\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u001c\u0010+\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010,\u001a\u00020\t2\u0006\u0010'\u001a\u00020(H\u0002J,\u0010-\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u000e\u0010\u0018\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ScrublineProfitLossChartObject;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "paintCache", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;Landroid/content/res/Resources;)V", "condensedPercentage", "", "getCondensedPercentage", "()F", "setCondensedPercentage", "(F)V", "textBounds", "Landroid/graphics/Rect;", "requestedLeftPadding", "getRequestedLeftPadding", "requestedRightPadding", "getRequestedRightPadding", "requestedTopPadding", "getRequestedTopPadding", "requestedBottomPadding", "getRequestedBottomPadding", "scrubHeaderTextHeight", "scrubPriceTextHeight", "selectedPointRadius", "textSpacing", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "drawScrubInfoText", "text", "", "scrubbedPosition", "yPosition", "chartBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartBounds;", "paint", "Landroid/graphics/Paint;", "drawScrubBar", "canvasX", "drawCondensedInfoText", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ScrublineProfitLossChartObject implements OptionsProfitLossChartObject {
    public static final int $stable = 8;
    private float condensedPercentage;
    private final OptionsProfitLossPaintCache paintCache;
    private final float requestedBottomPadding;
    private final float requestedLeftPadding;
    private final float requestedRightPadding;
    private final Resources resources;
    private final float scrubHeaderTextHeight;
    private final float scrubPriceTextHeight;
    private final float selectedPointRadius;
    private final Rect textBounds;
    private final float textSpacing;

    public ScrublineProfitLossChartObject(OptionsProfitLossPaintCache paintCache, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(paintCache, "paintCache");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.paintCache = paintCache;
        this.resources = resources;
        Rect rect = new Rect();
        this.textBounds = rect;
        this.textSpacing = resources.getDimension(C13997R.dimen.rds_spacing_small);
        BigDecimal TEN = BigDecimal.TEN;
        Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
        String str = Money.format$default(Money3.toMoney(TEN, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String string2 = resources.getString(C24771R.string.options_profit_loss_chart_profit_now);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        paintCache.getCenteredSecondaryTextPaint().getTextBounds(string2, 0, string2.length(), rect);
        this.scrubHeaderTextHeight = rect.height();
        paintCache.getCenteredBoldTextPaint().getTextBounds(str, 0, str.length(), rect);
        this.scrubPriceTextHeight = rect.height();
        float selectedPointRadius = paintCache.getSelectedPointRadius();
        this.selectedPointRadius = selectedPointRadius;
        this.requestedLeftPadding = selectedPointRadius;
        this.requestedRightPadding = selectedPointRadius;
        this.requestedBottomPadding = selectedPointRadius;
    }

    public final float getCondensedPercentage() {
        return this.condensedPercentage;
    }

    public final void setCondensedPercentage(float f) {
        this.condensedPercentage = f;
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
        float f = this.scrubPriceTextHeight;
        float f2 = this.textSpacing;
        return Math.max(this.selectedPointRadius, f + f2 + ((1.0f - this.condensedPercentage) * (f2 + f)));
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public float getRequestedBottomPadding() {
        return this.requestedBottomPadding;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject
    public void onDraw(Canvas canvas, OptionsProfitLossChartViewState state) throws Resources.NotFoundException {
        ChartBounds chartBounds;
        OptionsProfitLossChartData.Point scrubBarPoint;
        ApiOptionsProfitLossChartRequestParams params;
        UnderlyingQuote underlyingQuote;
        String symbol;
        Canvas canvas2;
        int i;
        OptionsProfitLossChartData.UnderlyingPrice visibleScrubBarUnderlyingPrice;
        ApiOptionsProfitLossChartRequestParams params2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(state, "state");
        OptionsProfitLossChartData chartData = state.getChartData();
        if (chartData != null && (chartBounds = chartData.getChartBounds()) != null && (scrubBarPoint = state.getScrubBarPoint(this.paintCache.getPointRadius())) != null) {
            EdgeProfitLossLimit scrubbedEdgeProfitLossLimit = state.getScrubbedEdgeProfitLossLimit();
            ChartParams.Loaded currentChartParams = state.getCurrentChartParams();
            UnderlyingQuote underlyingQuote2 = (currentChartParams == null || (params2 = currentChartParams.getParams()) == null) ? null : params2.getUnderlyingQuote();
            ChartParams.Loaded currentChartParams2 = state.getCurrentChartParams();
            if (currentChartParams2 != null && (params = currentChartParams2.getParams()) != null && (underlyingQuote = params.getUnderlyingQuote()) != null && (symbol = underlyingQuote.getSymbol()) != null) {
                float canvasX = (scrubbedEdgeProfitLossLimit == null || (visibleScrubBarUnderlyingPrice = scrubbedEdgeProfitLossLimit.getVisibleScrubBarUnderlyingPrice()) == null) ? scrubBarPoint.getCanvasX() : visibleScrubBarUnderlyingPrice.getCanvasPos();
                if (this.condensedPercentage < 1.0f) {
                    if (state.getUserScrubbedPoint() == null) {
                        if (underlyingQuote2 instanceof UnderlyingQuote.IndexQuote) {
                            i = C24771R.string.options_profit_loss_chart_value_now;
                        } else {
                            if (!(underlyingQuote2 instanceof UnderlyingQuote.EquityQuote) && underlyingQuote2 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = C24771R.string.options_profit_loss_chart_profit_now;
                        }
                    } else if (underlyingQuote2 instanceof UnderlyingQuote.IndexQuote) {
                        i = C24771R.string.options_profit_loss_chart_value_at_exp;
                    } else {
                        if (!(underlyingQuote2 instanceof UnderlyingQuote.EquityQuote) && underlyingQuote2 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = C24771R.string.options_profit_loss_chart_profit_at_exp;
                    }
                    String scrubText = state.getScrubText(this.resources, scrubBarPoint.getPriceX(), underlyingQuote2);
                    if (scrubText != null) {
                        int iCoerceIn = RangesKt.coerceIn((int) ((1.0f - this.condensedPercentage) * 255), 0, 255);
                        this.paintCache.getCenteredSecondaryTextPaint().setAlpha(iCoerceIn);
                        String string2 = this.resources.getString(i, symbol);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        canvas2 = canvas;
                        drawScrubInfoText(canvas2, string2, canvasX, (chartBounds.getCanvasTopY() - this.scrubPriceTextHeight) - (2 * this.textSpacing), chartBounds, this.paintCache.getCenteredSecondaryTextPaint());
                        this.paintCache.getCenteredBoldTextPaint().setAlpha(iCoerceIn);
                        drawScrubInfoText(canvas2, scrubText, canvasX, chartBounds.getCanvasTopY() - this.textSpacing, chartBounds, this.paintCache.getCenteredBoldTextPaint());
                    }
                } else if (state.getUserScrubbedPoint() != null) {
                    String scrubText2 = state.getScrubText(this.resources, scrubBarPoint.getPriceX(), underlyingQuote2);
                    if (scrubText2 == null) {
                        return;
                    }
                    canvas2 = canvas;
                    drawCondensedInfoText(canvas2, scrubText2, canvasX, chartBounds.getCanvasTopY() - this.textSpacing, chartBounds);
                } else {
                    canvas2 = canvas;
                }
                drawScrubBar(canvas2, canvasX, chartBounds);
            }
        }
    }

    private final void drawScrubInfoText(Canvas canvas, String str, float f, float f2, ChartBounds chartBounds, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.textBounds);
        float fWidth = this.textBounds.width() / 2.0f;
        canvas.drawText(str, RangesKt.coerceIn(f, chartBounds.getCanvasLeftX() + fWidth, chartBounds.getCanvasRightX() - fWidth), f2, paint);
    }

    private final void drawScrubBar(Canvas canvas, float f, ChartBounds chartBounds) {
        canvas.drawLine(f, chartBounds.getCanvasTopY(), f, chartBounds.getCanvasBottomY(), this.paintCache.getSolidLinePaint());
    }

    private final void drawCondensedInfoText(Canvas canvas, String str, float f, float f2, ChartBounds chartBounds) throws Resources.NotFoundException {
        String string2 = this.resources.getString(C24771R.string.options_profit_loss_chart_condensed_value_at_exp_full, str);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.paintCache.getLeftAlignedBoldTextPaint().getTextBounds(string2, 0, string2.length(), this.textBounds);
        float fWidth = this.textBounds.width() / 2.0f;
        float fCoerceIn = RangesKt.coerceIn(f, chartBounds.getCanvasLeftX() + fWidth, chartBounds.getCanvasRightX() - fWidth) - fWidth;
        this.paintCache.getLeftAlignedBoldTextPaint().getTextBounds(str, 0, str.length(), this.textBounds);
        canvas.drawText(str, fCoerceIn, f2, this.paintCache.getLeftAlignedBoldTextPaint());
        String string3 = this.resources.getString(C24771R.string.options_profit_loss_chart_condensed_value_at_exp_label);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        canvas.drawText(string3, fCoerceIn + this.textBounds.width(), f2, this.paintCache.getLeftAlignedSecondaryTextPaint());
    }
}
