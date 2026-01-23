package com.robinhood.android.graph.spark.graphobject;

import android.graphics.Path;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.graph.spark.ScaleHelper;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paths.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"populatePath", "", "Landroid/graphics/Path;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "start", "", "end", "canFill", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/graph/spark/GraphData;", "scaleHelper", "Lcom/robinhood/android/graph/spark/ScaleHelper;", "lib-graph_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.graph.spark.graphobject.PathsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Paths {
    public static final void populatePath(Path path, GraphView graphView, int i, int i2, boolean z, GraphData data, ScaleHelper scaleHelper) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(graphView, "graphView");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(scaleHelper, "scaleHelper");
        path.reset();
        if (i == -1) {
            return;
        }
        while (i < i2) {
            float x = scaleHelper.getX((int) data.getX(i));
            float y = scaleHelper.getY(data.getY(i));
            if (path.isEmpty() || data.isHidden(i)) {
                path.moveTo(x, y);
            } else {
                path.lineTo(x, y);
            }
            i++;
        }
        if (z && graphView.getPaintCache().getFill()) {
            float x2 = scaleHelper.getX(data.getLastIndex());
            float height = graphView.getHeight() - graphView.getPaddingBottom();
            path.lineTo(x2, height);
            path.lineTo(graphView.getPaddingStart(), height);
            path.close();
        }
    }
}
