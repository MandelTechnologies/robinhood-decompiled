package com.robinhood.android.graph.spark;

import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScaleHelper.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/ScaleHelper;", "", "graphData", "Lcom/robinhood/android/graph/spark/GraphData;", "contentRect", "Landroid/graphics/RectF;", "lineWidth", "", "glowRadius", "fill", "", "xOffset", "<init>", "(Lcom/robinhood/android/graph/spark/GraphData;Landroid/graphics/RectF;FFZF)V", "getGraphData", "()Lcom/robinhood/android/graph/spark/GraphData;", "lineWidthOffset", "bounds", "Lcom/robinhood/android/graph/spark/Rectangle;", "width", "getWidth", "()F", "height", "getHeight", "xScale", "yScale", "xTranslation", "yTranslation", "getX", "rawX", "", "getY", "rawY", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ScaleHelper {
    public static final int $stable = 8;
    private final Rectangle bounds;
    private final GraphData graphData;
    private final float height;
    private final float lineWidthOffset;
    private final float width;
    private final float xScale;
    private final float xTranslation;
    private final float yScale;
    private final float yTranslation;

    public ScaleHelper(GraphData graphData, RectF contentRect, float f, float f2, boolean z, float f3) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        Intrinsics.checkNotNullParameter(contentRect, "contentRect");
        this.graphData = graphData;
        f = z ? 0.0f : f;
        this.lineWidthOffset = f;
        Rectangle dataBounds = graphData.getDataBounds();
        dataBounds.inset(dataBounds.width() == 0.0f ? -1.0f : 0.0f, dataBounds.height() == 0.0f ? -1.0f : 0.0f);
        this.bounds = dataBounds;
        float fWidth = (contentRect.width() - f) + f3;
        this.width = fWidth;
        float f4 = 2;
        float fHeight = (contentRect.height() - f) - (f4 * f2);
        this.height = fHeight;
        float right = fWidth / (dataBounds.getRight() - dataBounds.getLeft());
        this.xScale = right;
        float bottom = fHeight / (dataBounds.getBottom() - dataBounds.getTop());
        this.yScale = bottom;
        this.xTranslation = (contentRect.left - (dataBounds.getLeft() * right)) + (f / f4);
        this.yTranslation = (dataBounds.getTop() * bottom) + contentRect.top + (f / f4) + f2;
    }

    public /* synthetic */ ScaleHelper(GraphData graphData, RectF rectF, float f, float f2, boolean z, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(graphData, rectF, f, f2, z, (i & 32) != 0 ? 0.0f : f3);
    }

    public final GraphData getGraphData() {
        return this.graphData;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getX(int rawX) {
        return (rawX * this.xScale) + this.xTranslation;
    }

    public final float getY(float rawY) {
        return (this.height - (rawY * this.yScale)) + this.yTranslation;
    }
}
