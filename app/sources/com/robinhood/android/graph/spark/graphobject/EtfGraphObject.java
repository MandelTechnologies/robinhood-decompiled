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

/* compiled from: EtfGraphObject.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/EtfGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "spySparkPath", "Landroid/graphics/Path;", "value", "Lcom/robinhood/android/graph/spark/GraphData;", "spyGraphData", "getSpyGraphData", "()Lcom/robinhood/android/graph/spark/GraphData;", "setSpyGraphData", "(Lcom/robinhood/android/graph/spark/GraphData;)V", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onInvalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class EtfGraphObject implements GraphObject {
    public static final int $stable = 8;
    private final GraphView graphView;
    private GraphData spyGraphData;
    private final Path spySparkPath;

    public EtfGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        this.spySparkPath = new Path();
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

    public final GraphData getSpyGraphData() {
        return this.spyGraphData;
    }

    public final void setSpyGraphData(GraphData graphData) {
        GraphData graphData2 = this.spyGraphData;
        this.spyGraphData = graphData;
        if (graphData2 == null || graphData == null || graphData2.getStale() == graphData.getStale()) {
            return;
        }
        this.graphView.refreshDrawableState();
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean isStale(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData graphData = this.spyGraphData;
        return graphData != null && graphData.getStale();
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onInvalidate(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData graphData = this.spyGraphData;
        if (graphData == null || viewState.getMainGraphData() == null || graphData.getCount() <= 1) {
            return;
        }
        Paths.populatePath(this.spySparkPath, this.graphView, 0, graphData.getCount(), false, graphData, this.graphView.getScaleHelper$lib_graph_externalDebug(graphData));
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Paint spyLinePaint;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.graphView.getScrubbedIndex() == null) {
            spyLinePaint = this.graphView.getPaintCache().getLowLightSpyLinePaint();
        } else {
            spyLinePaint = this.graphView.getPaintCache().getSpyLinePaint();
        }
        if (this.spyGraphData != null) {
            canvas.drawPath(this.spySparkPath, spyLinePaint);
        }
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        setSpyGraphData(null);
        this.spySparkPath.reset();
    }
}
