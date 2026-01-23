package com.robinhood.android.trade.options.profitloss;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartObject;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShadedRegionProfitLossChartObject.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\t*\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ShadedRegionProfitLossChartObject;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "paintCache", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;)V", "path", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "drawArea", "area", "", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Segment;", "paint", "Landroid/graphics/Paint;", "addSegmentToPath", "segment", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ShadedRegionProfitLossChartObject implements OptionsProfitLossChartObject {
    public static final int $stable = 8;
    private final OptionsProfitLossPaintCache paintCache;
    private final Path path;

    /* compiled from: ShadedRegionProfitLossChartObject.kt */
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

    public ShadedRegionProfitLossChartObject(OptionsProfitLossPaintCache paintCache) {
        Intrinsics.checkNotNullParameter(paintCache, "paintCache");
        this.paintCache = paintCache;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.path = path;
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
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(state, "state");
        OptionsProfitLossChartData chartData = state.getChartData();
        if (chartData == null) {
            return;
        }
        Iterator<T> it = chartData.getNegativeAreas().iterator();
        while (it.hasNext()) {
            drawArea(canvas, (List) it.next(), this.paintCache.getNegativeAreaPaint());
        }
        Iterator<T> it2 = chartData.getPositiveAreas().iterator();
        while (it2.hasNext()) {
            drawArea(canvas, (List) it2.next(), this.paintCache.getPositiveAreaPaint());
        }
    }

    private final void drawArea(Canvas canvas, List<OptionsProfitLossChartData.Segment> list, Paint paint) {
        this.path.reset();
        if (list.isEmpty()) {
            return;
        }
        OptionsProfitLossChartData.Point point = (OptionsProfitLossChartData.Point) CollectionsKt.first((List) ((OptionsProfitLossChartData.Segment) CollectionsKt.first((List) list)).getPoints());
        this.path.moveTo(point.getCanvasX(), point.getCanvasY());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            addSegmentToPath((OptionsProfitLossChartData.Segment) it.next());
        }
        this.path.close();
        canvas.drawPath(this.path, paint);
    }

    private final void addSegmentToPath(OptionsProfitLossChartData.Segment segment) {
        int i = WhenMappings.$EnumSwitchMapping$0[segment.getInterpolation().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            for (OptionsProfitLossChartData.Point point : segment.getPoints()) {
                this.path.lineTo(point.getCanvasX(), point.getCanvasY());
            }
        }
    }
}
