package com.robinhood.android.graph.spark.graphobject;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.android.common.view.GlowEffect;
import com.robinhood.android.common.view.GlowEffect2;
import com.robinhood.android.graph.C18339R;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphObject;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.GraphViewState;
import com.robinhood.android.graph.spark.ScaleHelper;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LivePulseGraphObject.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010*\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/LivePulseGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", "glowEffect", "Lcom/robinhood/android/common/view/GlowEffect;", "dotAnimator", "Landroid/animation/ValueAnimator;", "dotX", "", "dotY", "pulseRadius", "pulseAlpha", "", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "dotRadius", "maxPulseDotRadius", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onContentRectChanged", "", "onInvalidate", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "onDetachedFromWindow", "recreateGlowEffect", "updatePulse", "graphData", "Lcom/robinhood/android/graph/spark/GraphData;", "scaleHelper", "Lcom/robinhood/android/graph/spark/ScaleHelper;", "drawDot", "drawPulse", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LivePulseGraphObject implements GraphObject {
    public static final int $stable = 8;
    private ValueAnimator dotAnimator;
    private final float dotRadius;
    private float dotX;
    private float dotY;
    private GlowEffect glowEffect;
    private final GraphView graphView;
    private final float maxPulseDotRadius;
    private int pulseAlpha;
    private float pulseRadius;
    private final Resources resources;

    /* compiled from: LivePulseGraphObject.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GraphSelection.values().length];
            try {
                iArr[GraphSelection.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraphSelection.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraphSelection.TWENTY_FOUR_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GraphSelection.ALL_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean isStale(GraphViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return false;
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
    }

    public LivePulseGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        Resources resources = graphView.getResources();
        this.resources = resources;
        float dimensionPixelOffset = resources.getDimensionPixelOffset(C18339R.dimen.crypto_graph_point_radius);
        this.dotRadius = dimensionPixelOffset;
        this.maxPulseDotRadius = dimensionPixelOffset * 14;
    }

    public final GraphView getGraphView() {
        return this.graphView;
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public boolean onTouch(int i, int i2) {
        return GraphObject.DefaultImpls.onTouch(this, i, i2);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onContentRectChanged() {
        this.dotX = 0.0f;
        this.dotY = 0.0f;
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
        updatePulse(mainGraphData, scaleHelper$lib_graph_externalDebug);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        GlowEffect glowEffect = this.glowEffect;
        GraphData mainGraphData = viewState.getMainGraphData();
        if (mainGraphData == null) {
            return;
        }
        if (glowEffect != null) {
            glowEffect.clear();
            drawPulse(mainGraphData, glowEffect.getSourceCanvas());
            glowEffect.drawGlow(canvas);
        } else {
            drawPulse(mainGraphData, canvas);
        }
        drawDot(mainGraphData, canvas);
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

    private final void updatePulse(GraphData graphData, ScaleHelper scaleHelper) {
        this.dotX = scaleHelper.getX(graphData.getLivePulseX());
        DataPoint lastHistorical = graphData.getLastHistorical();
        Intrinsics.checkNotNull(lastHistorical);
        this.dotY = scaleHelper.getY(lastHistorical.getGraphDisplayValue(false).getDecimalValue().floatValue());
        ValueAnimator valueAnimator = this.dotAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            GraphSelection selection = graphData.getSelection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[selection.ordinal()];
            final float f = i != 1 ? (i == 2 || i == 3) ? 0.5f : i != 4 ? 0.0f : 0.25f : 1.0f;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(iArr[graphData.getSelection().ordinal()] == 4 ? 1500L : 350L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.graph.spark.graphobject.LivePulseGraphObject$updatePulse$2$1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    float animatedFraction = animation.getAnimatedFraction();
                    this.this$0.pulseAlpha = (int) ((1.0f - animatedFraction) * 255);
                    LivePulseGraphObject livePulseGraphObject = this.this$0;
                    livePulseGraphObject.pulseRadius = animatedFraction * livePulseGraphObject.maxPulseDotRadius * f;
                    this.this$0.getGraphView().invalidate();
                }
            });
            duration.start();
            this.dotAnimator = duration;
        }
    }

    private final void drawDot(GraphData graphData, Canvas canvas) {
        if (this.dotX == 0.0f || this.dotY == 0.0f) {
            return;
        }
        float f = WhenMappings.$EnumSwitchMapping$0[graphData.getSelection().ordinal()] == 4 ? 0.5f : 1.0f;
        Paint sparkLinePaint = this.graphView.getPaintCache().getSparkLinePaint();
        Paint.Style style = sparkLinePaint.getStyle();
        sparkLinePaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.dotX, this.dotY, this.dotRadius * f, sparkLinePaint);
        sparkLinePaint.setStyle(style);
    }

    private final void drawPulse(GraphData graphData, Canvas canvas) {
        if (this.dotX == 0.0f || this.dotY == 0.0f) {
            return;
        }
        float f = WhenMappings.$EnumSwitchMapping$0[graphData.getSelection().ordinal()] == 4 ? 0.5f : 1.0f;
        Paint glowPaint = this.graphView.getPaintCache().getGlowPaint();
        if (glowPaint == null) {
            glowPaint = this.graphView.getPaintCache().getSparkLinePaint();
        }
        canvas.drawCircle(this.dotX, this.dotY, this.dotRadius * f, glowPaint);
        Paint.Style style = glowPaint.getStyle();
        int alpha = glowPaint.getAlpha();
        glowPaint.setStyle(Paint.Style.FILL);
        glowPaint.setAlpha(this.pulseAlpha);
        canvas.drawCircle(this.dotX, this.dotY, this.pulseRadius, glowPaint);
        glowPaint.setStyle(style);
        glowPaint.setAlpha(alpha);
    }
}
