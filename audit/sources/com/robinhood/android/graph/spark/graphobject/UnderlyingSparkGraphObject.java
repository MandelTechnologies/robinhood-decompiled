package com.robinhood.android.graph.spark.graphobject;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphObject;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.GraphViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnderlyingSparkGraphObject.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/UnderlyingSparkGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "sparkPath", "Landroid/graphics/Path;", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onInvalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UnderlyingSparkGraphObject implements GraphObject {
    public static final int $stable = 8;
    private final GraphView graphView;
    private final Path sparkPath;

    public UnderlyingSparkGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        this.sparkPath = new Path();
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
        GraphData underlyingGraphData = viewState.getUnderlyingGraphData();
        return underlyingGraphData != null && underlyingGraphData.getStale();
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onInvalidate(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData underlyingGraphData = viewState.getUnderlyingGraphData();
        if (underlyingGraphData == null) {
            return;
        }
        Paths.populatePath(this.sparkPath, this.graphView, 0, underlyingGraphData.getCount(), false, underlyingGraphData, this.graphView.getUnderlyingScaleHelper$lib_graph_externalDebug(viewState.getUnderlyingGraphData()));
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Paint highlightedSecondarySparkLinePaint;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.graphView.getIsPrimaryLineOnTop()) {
            highlightedSecondarySparkLinePaint = this.graphView.getPaintCache().getSecondarySparkLinePaint();
        } else {
            highlightedSecondarySparkLinePaint = this.graphView.getPaintCache().getHighlightedSecondarySparkLinePaint();
        }
        canvas.drawPath(this.sparkPath, highlightedSecondarySparkLinePaint);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        this.sparkPath.reset();
    }
}
