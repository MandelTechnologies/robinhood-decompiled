package com.robinhood.android.graph.spark;

import android.graphics.Canvas;
import kotlin.Metadata;

/* compiled from: GraphObject.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphObject;", "", "isStale", "", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "onContentRectChanged", "", "onInvalidate", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouch", "x", "", "y", "onDetachedFromWindow", "reset", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GraphObject {

    /* compiled from: GraphObject.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onContentRectChanged(GraphObject graphObject) {
        }

        public static void onDetachedFromWindow(GraphObject graphObject) {
        }

        public static boolean onTouch(GraphObject graphObject, int i, int i2) {
            return false;
        }
    }

    boolean isStale(GraphViewState viewState);

    void onContentRectChanged();

    void onDetachedFromWindow();

    void onDraw(GraphViewState viewState, Canvas canvas);

    void onInvalidate(GraphViewState viewState);

    boolean onTouch(int x, int y);

    void reset();
}
