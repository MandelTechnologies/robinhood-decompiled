package com.robinhood.android.trade.options.profitloss;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SparklineProfitLossChartObject.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u0011*\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/SparklineProfitLossChartObject;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "paintCache", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;)V", "requestedLeftPadding", "", "getRequestedLeftPadding", "()F", "requestedRightPadding", "getRequestedRightPadding", "requestedTopPadding", "getRequestedTopPadding", "requestedBottomPadding", "getRequestedBottomPadding", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "drawSegment", "segment", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Segment;", "paint", "Landroid/graphics/Paint;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SparklineProfitLossChartObject implements OptionsProfitLossChartObject {
    public static final int $stable = 8;
    private final OptionsProfitLossPaintCache paintCache;
    private final float requestedBottomPadding;
    private final float requestedLeftPadding;
    private final float requestedRightPadding;
    private final float requestedTopPadding;

    /* compiled from: SparklineProfitLossChartObject.kt */
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

    public SparklineProfitLossChartObject(OptionsProfitLossPaintCache paintCache) {
        Intrinsics.checkNotNullParameter(paintCache, "paintCache");
        this.paintCache = paintCache;
        this.requestedLeftPadding = paintCache.getSparklineWidth();
        this.requestedRightPadding = paintCache.getSparklineWidth();
        this.requestedTopPadding = paintCache.getSparklineWidth();
        this.requestedBottomPadding = paintCache.getSparklineWidth();
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
        Iterator<T> it = chartData.getNegativeSparklines().iterator();
        while (it.hasNext()) {
            drawSegment(canvas, (OptionsProfitLossChartData.Segment) it.next(), this.paintCache.getNegativeLinePaint());
        }
        Iterator<T> it2 = chartData.getPositiveSparklines().iterator();
        while (it2.hasNext()) {
            drawSegment(canvas, (OptionsProfitLossChartData.Segment) it2.next(), this.paintCache.getPositiveLinePaint());
        }
    }

    private final void drawSegment(Canvas canvas, OptionsProfitLossChartData.Segment segment, Paint paint) {
        int i = WhenMappings.$EnumSwitchMapping$0[segment.getInterpolation().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        Iterator<T> it = segment.getPoints().iterator();
        if (!it.hasNext()) {
            CollectionsKt.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        int i2 = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            OptionsProfitLossChartData.Point point = (OptionsProfitLossChartData.Point) next2;
            OptionsProfitLossChartData.Point point2 = (OptionsProfitLossChartData.Point) next;
            Canvas canvas2 = canvas;
            Paint paint2 = paint;
            canvas2.drawLine(point2.getCanvasX(), point2.getCanvasY(), point.getCanvasX(), point.getCanvasY(), paint2);
            arrayList.add(Integer.valueOf(i2));
            i2++;
            next = next2;
            canvas = canvas2;
            paint = paint2;
        }
    }
}
