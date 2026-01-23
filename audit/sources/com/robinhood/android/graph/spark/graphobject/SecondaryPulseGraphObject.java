package com.robinhood.android.graph.spark.graphobject;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.android.graph.C18339R;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphObject;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.GraphViewState;
import com.robinhood.android.graph.spark.ScaleHelper;
import com.robinhood.models.p355ui.DataPoint;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecondaryPulseGraphObject.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/SecondaryPulseGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", "dotX", "", "dotY", "activeDotRadius", "inactiveDotRadius", "dotRadius", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onContentRectChanged", "", "onInvalidate", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "drawDot", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SecondaryPulseGraphObject implements GraphObject {
    public static final int $stable = 8;
    private final float activeDotRadius;
    private float dotRadius;
    private float dotX;
    private float dotY;
    private final GraphView graphView;
    private final float inactiveDotRadius;

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean isStale(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return false;
    }

    public SecondaryPulseGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        this.activeDotRadius = graphView.getResources().getDimensionPixelOffset(C18339R.dimen.crypto_graph_point_radius);
        float dimensionPixelOffset = graphView.getResources().getDimensionPixelOffset(C18339R.dimen.crypto_secondary_graph_point_radius);
        this.inactiveDotRadius = dimensionPixelOffset;
        this.dotRadius = dimensionPixelOffset;
    }

    public final GraphView getGraphView() {
        return this.graphView;
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
    public void onContentRectChanged() {
        reset();
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onInvalidate(GraphViewState viewState) {
        float f;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData underlyingGraphData = viewState.getUnderlyingGraphData();
        if (underlyingGraphData == null) {
            return;
        }
        DataPoint lastHistorical = underlyingGraphData.getLastHistorical();
        if (lastHistorical == null) {
            reset();
            return;
        }
        ScaleHelper underlyingScaleHelper$lib_graph_externalDebug = this.graphView.getUnderlyingScaleHelper$lib_graph_externalDebug(underlyingGraphData);
        this.dotX = underlyingScaleHelper$lib_graph_externalDebug.getX(CollectionsKt.getLastIndex(underlyingGraphData.getDataPoints()));
        this.dotY = underlyingScaleHelper$lib_graph_externalDebug.getY(lastHistorical.getGraphDisplayValue(false).getDecimalValue().floatValue());
        if (this.graphView.getIsPrimaryLineOnTop()) {
            f = this.inactiveDotRadius;
        } else {
            f = this.activeDotRadius;
        }
        this.dotRadius = f;
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawDot(canvas);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        this.dotX = 0.0f;
        this.dotY = 0.0f;
    }

    private final void drawDot(Canvas canvas) {
        Paint highlightedSecondarySparkLinePaint;
        if (this.dotX == 0.0f || this.dotY == 0.0f) {
            return;
        }
        if (this.graphView.getIsPrimaryLineOnTop()) {
            highlightedSecondarySparkLinePaint = this.graphView.getPaintCache().getSecondarySparkLinePaint();
        } else {
            highlightedSecondarySparkLinePaint = this.graphView.getPaintCache().getHighlightedSecondarySparkLinePaint();
        }
        canvas.drawCircle(this.dotX, this.dotY, this.dotRadius, highlightedSecondarySparkLinePaint);
    }
}
