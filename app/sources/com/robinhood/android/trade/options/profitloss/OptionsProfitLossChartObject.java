package com.robinhood.android.trade.options.profitloss;

import android.graphics.Canvas;
import kotlin.Metadata;

/* compiled from: OptionsProfitLossChartObject.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "", "requestedLeftPadding", "", "getRequestedLeftPadding", "()F", "requestedRightPadding", "getRequestedRightPadding", "requestedTopPadding", "getRequestedTopPadding", "requestedBottomPadding", "getRequestedBottomPadding", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface OptionsProfitLossChartObject {

    /* compiled from: OptionsProfitLossChartObject.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static float getRequestedBottomPadding(OptionsProfitLossChartObject optionsProfitLossChartObject) {
            return 0.0f;
        }

        public static float getRequestedLeftPadding(OptionsProfitLossChartObject optionsProfitLossChartObject) {
            return 0.0f;
        }

        public static float getRequestedRightPadding(OptionsProfitLossChartObject optionsProfitLossChartObject) {
            return 0.0f;
        }

        public static float getRequestedTopPadding(OptionsProfitLossChartObject optionsProfitLossChartObject) {
            return 0.0f;
        }
    }

    float getRequestedBottomPadding();

    float getRequestedLeftPadding();

    float getRequestedRightPadding();

    float getRequestedTopPadding();

    void onDraw(Canvas canvas, OptionsProfitLossChartViewState state);
}
