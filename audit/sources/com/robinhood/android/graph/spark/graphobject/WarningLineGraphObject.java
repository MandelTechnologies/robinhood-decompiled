package com.robinhood.android.graph.spark.graphobject;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.graph.C18339R;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphObject;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.GraphViewState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.p409ui.color.ThemeColors;
import io.reactivex.subjects.Subject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: WarningLineGraphObject.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/WarningLineGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "warningIconClickedSubject", "Lio/reactivex/subjects/Subject;", "", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;Lio/reactivex/subjects/Subject;)V", "warningLinePath", "Landroid/graphics/Path;", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "warningDrawable", "Landroid/graphics/drawable/Drawable;", "warningDrawablePadding", "", "warningLinePaint", "Landroid/graphics/Paint;", "isStale", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onInvalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouch", "x", "", "y", "reset", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class WarningLineGraphObject implements GraphObject {
    public static final int $stable = 8;
    private final GraphView graphView;
    private final Resources resources;
    private final Drawable warningDrawable;
    private final float warningDrawablePadding;
    private final Subject<Boolean> warningIconClickedSubject;
    private final Paint warningLinePaint;
    private final Path warningLinePath;

    public WarningLineGraphObject(GraphView graphView, Subject<Boolean> warningIconClickedSubject) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        Intrinsics.checkNotNullParameter(warningIconClickedSubject, "warningIconClickedSubject");
        this.graphView = graphView;
        this.warningIconClickedSubject = warningIconClickedSubject;
        this.warningLinePath = new Path();
        Resources resources = graphView.getResources();
        this.resources = resources;
        Drawable drawable = resources.getDrawable(C18339R.drawable.svg_ic_error, null);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        this.warningDrawable = drawable;
        this.warningDrawablePadding = resources.getDimension(C13997R.dimen.rds_spacing_default);
        Paint paint = new Paint(graphView.getPaintCache().getBaseLinePaint());
        paint.setPathEffect(graphView.getPaintCache().getBaseLinePaint().getPathEffect());
        Context context = graphView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ThemeColors.getThemeColor(context, C20690R.attr.colorNegative));
        this.warningLinePaint = paint;
        graphView.setPadding(graphView.getPaddingStart(), RangesKt.coerceAtMost(graphView.getPaddingTop(), drawable.getIntrinsicHeight() / 2), graphView.getPaddingEnd(), RangesKt.coerceAtMost(graphView.getPaddingBottom(), drawable.getIntrinsicHeight() / 2));
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
        float y = this.graphView.getScaleHelper$lib_graph_externalDebug(mainGraphData).getY(maintenanceRequirement.floatValue());
        int width = this.graphView.getWidth();
        Path path = this.warningLinePath;
        path.reset();
        path.moveTo(0.0f, y);
        path.lineTo(width, y);
        int iRoundToInt = MathKt.roundToInt(this.warningDrawablePadding);
        int iRoundToInt2 = MathKt.roundToInt(y - (this.warningDrawable.getIntrinsicHeight() / 2));
        this.warningDrawable.setBounds(iRoundToInt, iRoundToInt2, this.warningDrawable.getIntrinsicWidth() + iRoundToInt, this.warningDrawable.getIntrinsicHeight() + iRoundToInt2);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.warningLinePath, this.warningLinePaint);
        this.warningDrawable.draw(canvas);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean onTouch(int x, int y) {
        if (!this.warningDrawable.getBounds().contains(x, y)) {
            return false;
        }
        this.warningIconClickedSubject.onNext(Boolean.TRUE);
        return true;
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        this.warningLinePath.reset();
    }
}
