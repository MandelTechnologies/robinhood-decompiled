package com.robinhood.android.graph.spark.graphobject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.robinhood.android.graph.C18339R;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphObject;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.GraphViewState;
import com.robinhood.android.graph.spark.ScaleHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaintenanceShadeGraphObject.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/MaintenanceShadeGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", "sparkPath", "Landroid/graphics/Path;", "shadingPath", "warningRectPath", "sparkRectPath", "shadingPaint", "Landroid/graphics/Paint;", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onInvalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class MaintenanceShadeGraphObject implements GraphObject {
    public static final int $stable = 8;
    private final GraphView graphView;
    private final Paint shadingPaint;
    private final Path shadingPath;
    private final Path sparkPath;
    private final Path sparkRectPath;
    private final Path warningRectPath;

    public MaintenanceShadeGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        this.sparkPath = new Path();
        this.shadingPath = new Path();
        this.warningRectPath = new Path();
        this.sparkRectPath = new Path();
        Paint paint = new Paint();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(graphView.getResources(), C18339R.drawable.chart_shading_tile);
        paint.setStyle(Paint.Style.FILL);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(bitmapDecodeResource, tileMode, tileMode));
        this.shadingPaint = paint;
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
        Float maintenanceRequirement;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        GraphData mainGraphData = viewState.getMainGraphData();
        if (mainGraphData == null || (maintenanceRequirement = mainGraphData.getMaintenanceRequirement()) == null) {
            return;
        }
        float fFloatValue = maintenanceRequirement.floatValue();
        ScaleHelper scaleHelper$lib_graph_externalDebug = this.graphView.getScaleHelper$lib_graph_externalDebug(mainGraphData);
        float y = scaleHelper$lib_graph_externalDebug.getY(fFloatValue);
        float strokeWidth = this.graphView.getPaintCache().getSparkLinePaint().getStrokeWidth();
        int width = this.graphView.getWidth();
        int height = this.graphView.getHeight();
        int bottom = this.graphView.getBottom();
        int right = this.graphView.getRight();
        int left = this.graphView.getLeft();
        Paths.populatePath(this.sparkPath, this.graphView, 0, mainGraphData.getCount(), true, mainGraphData, scaleHelper$lib_graph_externalDebug);
        Path path = this.warningRectPath;
        float f = y + strokeWidth;
        path.reset();
        path.moveTo(0.0f, f);
        path.lineTo(width, f);
        float f2 = bottom;
        path.lineTo(right, f2);
        path.lineTo(left, f2);
        path.close();
        Path path2 = this.sparkRectPath;
        path2.reset();
        path2.addPath(new Path(this.sparkPath));
        path2.rLineTo(0.0f, -height);
        path2.lineTo(0.0f, 0.0f);
        path2.close();
        this.shadingPath.op(this.sparkRectPath, this.warningRectPath, Path.Op.INTERSECT);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.shadingPath, this.shadingPaint);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        this.sparkPath.reset();
        this.shadingPath.reset();
        this.warningRectPath.reset();
        this.sparkRectPath.reset();
    }
}
