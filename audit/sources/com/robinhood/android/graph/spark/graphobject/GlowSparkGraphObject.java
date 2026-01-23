package com.robinhood.android.graph.spark.graphobject;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.robinhood.android.common.view.GlowEffect;
import com.robinhood.android.common.view.GlowEffect2;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphObject;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.GraphViewState;
import com.robinhood.android.graph.spark.ScaleHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlowSparkGraphObject.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/GlowSparkGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", "sparkPath", "Landroid/graphics/Path;", "glowEffect", "Lcom/robinhood/android/common/view/GlowEffect;", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onInvalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "onDetachedFromWindow", "recreateGlowEffect", "updatePath", "graphData", "Lcom/robinhood/android/graph/spark/GraphData;", "scaleHelper", "Lcom/robinhood/android/graph/spark/ScaleHelper;", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GlowSparkGraphObject implements GraphObject {
    public static final int $stable = 8;
    private GlowEffect glowEffect;
    private final GraphView graphView;
    private final Resources resources;
    private final Path sparkPath;

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean isStale(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return false;
    }

    public GlowSparkGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        this.sparkPath = new Path();
        this.resources = graphView.getResources();
    }

    public final GraphView getGraphView() {
        return this.graphView;
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onContentRectChanged() {
        GraphObject.DefaultImpls.onContentRectChanged(this);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean onTouch(int i, int i2) {
        return GraphObject.DefaultImpls.onTouch(this, i, i2);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onInvalidate(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData mainGraphData = viewState.getMainGraphData();
        if (mainGraphData == null) {
            return;
        }
        ScaleHelper scaleHelper$lib_graph_externalDebug = this.graphView.getScaleHelper$lib_graph_externalDebug(mainGraphData);
        recreateGlowEffect();
        updatePath(mainGraphData, scaleHelper$lib_graph_externalDebug);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        GlowEffect glowEffect = this.glowEffect;
        if (glowEffect != null) {
            glowEffect.clear();
            Canvas sourceCanvas = glowEffect.getSourceCanvas();
            Path path = this.sparkPath;
            Paint glowPaint = this.graphView.getPaintCache().getGlowPaint();
            Intrinsics.checkNotNull(glowPaint);
            sourceCanvas.drawPath(path, glowPaint);
            glowEffect.drawGlow(canvas);
        }
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        this.sparkPath.reset();
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDetachedFromWindow() {
        GlowEffect glowEffect = this.glowEffect;
        if (glowEffect != null) {
            glowEffect.close();
        }
        this.glowEffect = null;
    }

    private final void recreateGlowEffect() {
        GlowEffect glowEffect = this.glowEffect;
        Context context = this.graphView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.glowEffect = GlowEffect2.recreate(glowEffect, context, this.graphView.getWidth(), this.graphView.getHeight(), this.resources.getDisplayMetrics().density, this.graphView.getPaintCache().getGlowRadius());
    }

    private final void updatePath(GraphData graphData, ScaleHelper scaleHelper) {
        Paths.populatePath(this.sparkPath, this.graphView, 0, graphData.getCount(), true, graphData, scaleHelper);
    }
}
