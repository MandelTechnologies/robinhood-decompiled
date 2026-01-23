package com.robinhood.android.graph.spark.graphobject;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphObject;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.GraphViewState;
import com.robinhood.android.graph.spark.ScaleHelper;
import com.robinhood.models.p355ui.DataPoint;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BaselineGraphObject.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/BaselineGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", "baseLinePath", "Landroid/graphics/Path;", "baselinePoints", "", "preCount", "", "regCount", "postCount", "firstPreIndex", "firstRegIndex", "firstPostIndex", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onInvalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "populateBaselinePoints", "graphData", "Lcom/robinhood/android/graph/spark/GraphData;", "scaleHelper", "Lcom/robinhood/android/graph/spark/ScaleHelper;", "reset", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class BaselineGraphObject implements GraphObject {
    public static final int $stable = 8;
    private final Path baseLinePath;
    private float[] baselinePoints;
    private int firstPostIndex;
    private int firstPreIndex;
    private int firstRegIndex;
    private final GraphView graphView;
    private int postCount;
    private int preCount;
    private int regCount;

    public BaselineGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        this.baseLinePath = new Path();
    }

    public final GraphView getGraphView() {
        return this.graphView;
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onContentRectChanged() {
        GraphObject.DefaultImpls.onContentRectChanged(this);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDetachedFromWindow() {
        GraphObject.DefaultImpls.onDetachedFromWindow(this);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean onTouch(int i, int i2) {
        return GraphObject.DefaultImpls.onTouch(this, i, i2);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean isStale(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData mainGraphData = viewState.getMainGraphData();
        return mainGraphData != null && mainGraphData.getStale();
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onInvalidate(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData mainGraphData = viewState.getMainGraphData();
        if (mainGraphData == null) {
            return;
        }
        populateBaselinePoints(mainGraphData, this.graphView.getScaleHelper$lib_graph_externalDebug(mainGraphData));
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint baseLinePaint = this.graphView.getPaintCache().getBaseLinePaint();
        Paint lowLightBaseLinePaint = this.graphView.getPaintCache().getLowLightBaseLinePaint();
        DataPoint.Session highlightSession = viewState.getHighlightSession();
        float[] fArr = this.baselinePoints;
        if (fArr != null) {
            if (highlightSession == null) {
                canvas.drawPoints(fArr, baseLinePaint);
            } else {
                Paint paint = highlightSession == DataPoint.Session.PRE_MARKET ? baseLinePaint : lowLightBaseLinePaint;
                Paint paint2 = highlightSession == DataPoint.Session.REGULAR_HOURS ? baseLinePaint : lowLightBaseLinePaint;
                if (highlightSession == DataPoint.Session.AFTER_HOURS) {
                    lowLightBaseLinePaint = baseLinePaint;
                }
                int i = this.firstPreIndex;
                if (i >= 0) {
                    canvas.drawPoints(fArr, i, this.preCount, paint);
                }
                int i2 = this.firstRegIndex;
                if (i2 >= 0) {
                    canvas.drawPoints(fArr, i2, this.regCount, paint2);
                }
                int i3 = this.firstPostIndex;
                if (i3 >= 0) {
                    canvas.drawPoints(fArr, i3, this.postCount, lowLightBaseLinePaint);
                }
            }
        }
        canvas.drawPath(this.baseLinePath, baseLinePaint);
    }

    private final void populateBaselinePoints(GraphData graphData, ScaleHelper scaleHelper) {
        BigDecimal fromPrice = graphData.getFromPrice();
        Intrinsics.checkNotNull(fromPrice);
        float y = scaleHelper.getY(fromPrice.floatValue());
        this.baselinePoints = null;
        this.baseLinePath.reset();
        int width = this.graphView.getWidth();
        int preStartIndex = graphData.getPreStartIndex();
        if (graphData.getRange() * this.graphView.getPaintCache().getBaseLinePaint().getStrokeWidth() < width / 2) {
            int range = graphData.getRange() * 2;
            float[] fArr = new float[range];
            Iterator<Integer> it = RangesKt.step(ArraysKt.getIndices(fArr), 2).iterator();
            while (it.hasNext()) {
                int iNextInt = ((PrimitiveIterators6) it).nextInt();
                fArr[iNextInt] = scaleHelper.getX(iNextInt / 2);
                fArr[iNextInt + 1] = y;
            }
            this.baselinePoints = fArr;
            if (preStartIndex != -1) {
                float extendedHoursDurationInMillis = graphData.getMarketHours().getExtendedHoursDurationInMillis();
                float premarketDurationInMillis = graphData.getMarketHours().getPremarketDurationInMillis() / extendedHoursDurationInMillis;
                float regularHoursDurationInMillis = graphData.getMarketHours().getRegularHoursDurationInMillis() / extendedHoursDurationInMillis;
                this.firstPreIndex = 0;
                float f = range;
                float f2 = 2;
                int i = ((int) ((premarketDurationInMillis * f) / f2)) * 2;
                this.preCount = i;
                this.firstRegIndex = i;
                int i2 = ((int) ((regularHoursDurationInMillis * f) / f2)) * 2;
                this.regCount = i2;
                int i3 = i + i2;
                this.firstPostIndex = i3;
                this.postCount = range - i3;
                return;
            }
            this.firstPreIndex = -1;
            this.firstRegIndex = 0;
            this.regCount = range;
            this.firstPostIndex = -1;
            return;
        }
        this.baseLinePath.reset();
        this.baseLinePath.moveTo(0.0f, y);
        this.baseLinePath.lineTo(width, y);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        this.baseLinePath.reset();
        this.baselinePoints = null;
    }
}
