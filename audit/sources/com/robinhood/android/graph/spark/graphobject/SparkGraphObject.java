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
import com.robinhood.models.p355ui.Historical;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SparkGraphObject.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/graphobject/SparkGraphObject;", "Lcom/robinhood/android/graph/spark/GraphObject;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "<init>", "(Lcom/robinhood/android/graph/spark/GraphView;)V", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", "prePublicSparkPath", "Landroid/graphics/Path;", "sparkPath", "preSparkPath", "regSparkPath", "postSparkPath", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onInvalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "shouldShowPrePublic", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/graph/spark/GraphData;", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SparkGraphObject implements GraphObject {
    public static final int $stable = 8;
    private final GraphView graphView;
    private final Path postSparkPath;
    private final Path prePublicSparkPath;
    private final Path preSparkPath;
    private final Path regSparkPath;
    private final Path sparkPath;

    /* compiled from: SparkGraphObject.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DataPoint.Session.values().length];
            try {
                iArr[DataPoint.Session.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataPoint.Session.PRE_MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataPoint.Session.REGULAR_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataPoint.Session.AFTER_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataPoint.Session.OVERNIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Historical.Span.values().length];
            try {
                iArr2[Historical.Span.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Historical.Span.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Historical.Span.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Historical.Span.MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Historical.Span.THREE_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Historical.Span.YTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Historical.Span.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Historical.Span.FIVE_YEARS.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Historical.Span.ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public SparkGraphObject(GraphView graphView) {
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        this.graphView = graphView;
        this.prePublicSparkPath = new Path();
        this.sparkPath = new Path();
        this.preSparkPath = new Path();
        this.regSparkPath = new Path();
        this.postSparkPath = new Path();
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
        ScaleHelper scaleHelper$lib_graph_externalDebug = this.graphView.getScaleHelper$lib_graph_externalDebug(mainGraphData);
        int firstPublicIndex = shouldShowPrePublic(mainGraphData) ? mainGraphData.getFirstPublicIndex() : 0;
        Paths.populatePath(this.prePublicSparkPath, this.graphView, 0, firstPublicIndex, true, mainGraphData, scaleHelper$lib_graph_externalDebug);
        Paths.populatePath(this.sparkPath, this.graphView, RangesKt.coerceAtLeast(firstPublicIndex - 1, 0), mainGraphData.getCount(), true, mainGraphData, scaleHelper$lib_graph_externalDebug);
        int count = mainGraphData.getCount();
        int preStartIndex = mainGraphData.getPreStartIndex();
        int regStartIndex = mainGraphData.getRegStartIndex();
        int postStartIndex = mainGraphData.getPostStartIndex();
        int i = regStartIndex == -1 ? count : regStartIndex + 1;
        int i2 = postStartIndex == -1 ? count : postStartIndex + 1;
        Paths.populatePath(this.preSparkPath, this.graphView, preStartIndex, i, false, mainGraphData, scaleHelper$lib_graph_externalDebug);
        Paths.populatePath(this.regSparkPath, this.graphView, regStartIndex, i2, false, mainGraphData, scaleHelper$lib_graph_externalDebug);
        Paths.populatePath(this.postSparkPath, this.graphView, postStartIndex, count, false, mainGraphData, scaleHelper$lib_graph_externalDebug);
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void onDraw(GraphViewState viewState, Canvas canvas) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint sparkLinePaint = this.graphView.getPaintCache().getSparkLinePaint();
        Paint lowLightSparkPaint = this.graphView.getPaintCache().getLowLightSparkPaint();
        Paint prePublicLinePaint = this.graphView.getPaintCache().getPrePublicLinePaint();
        DataPoint.Session highlightSession = viewState.getHighlightSession();
        int i = highlightSession == null ? -1 : WhenMappings.$EnumSwitchMapping$0[highlightSession.ordinal()];
        if (i == -1 || i == 1) {
            canvas.drawPath(this.prePublicSparkPath, prePublicLinePaint);
            canvas.drawPath(this.sparkPath, sparkLinePaint);
            return;
        }
        if (i == 2) {
            canvas.drawPath(this.regSparkPath, lowLightSparkPaint);
            canvas.drawPath(this.postSparkPath, lowLightSparkPaint);
            canvas.drawPath(this.preSparkPath, sparkLinePaint);
        } else if (i == 3) {
            canvas.drawPath(this.preSparkPath, lowLightSparkPaint);
            canvas.drawPath(this.postSparkPath, lowLightSparkPaint);
            canvas.drawPath(this.regSparkPath, sparkLinePaint);
        } else if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawPath(this.sparkPath, sparkLinePaint);
        } else {
            canvas.drawPath(this.preSparkPath, lowLightSparkPaint);
            canvas.drawPath(this.regSparkPath, lowLightSparkPaint);
            canvas.drawPath(this.postSparkPath, sparkLinePaint);
        }
    }

    @Override // com.robinhood.android.graph.spark.GraphObject
    public void reset() {
        this.sparkPath.reset();
        this.preSparkPath.reset();
        this.regSparkPath.reset();
        this.postSparkPath.reset();
    }

    private final boolean shouldShowPrePublic(GraphData data) {
        if (data.getAlwaysShowPrePublic()) {
            return true;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[data.getSelection().getSpan().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
