package com.robinhood.shared.trading.tradecomponentscompose.traderow;

import androidx.compose.p011ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathMeasure;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathMeasures.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t¨\u0006\n"}, m3636d2 = {"pathMeasure", "Landroidx/compose/ui/graphics/PathMeasure;", "Landroidx/compose/ui/graphics/Path;", "getOffsetAtCurrentProgress", "Landroidx/compose/ui/geometry/Offset;", "progress", "", "(Landroidx/compose/ui/graphics/PathMeasure;F)J", "toPathMeasure", "Landroidx/compose/ui/graphics/Outline;", "lib-trade-components-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.traderow.PathMeasuresKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PathMeasures3 {
    public static final PathMeasure pathMeasure(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        PathMeasure PathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        PathMeasure.setPath(path, false);
        return PathMeasure;
    }

    public static final long getOffsetAtCurrentProgress(PathMeasure pathMeasure, float f) {
        Intrinsics.checkNotNullParameter(pathMeasure, "<this>");
        return pathMeasure.mo6633getPositiontuRUvjQ(pathMeasure.getLength() * f);
    }

    public static final PathMeasure toPathMeasure(Outline outline) {
        Path Path;
        Path path;
        Intrinsics.checkNotNullParameter(outline, "<this>");
        if (outline instanceof Outline.Generic) {
            path = ((Outline.Generic) outline).getPath();
        } else {
            if (outline instanceof Outline.Rectangle) {
                Path = AndroidPath_androidKt.Path();
                Path.addRect$default(Path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
            } else {
                if (!(outline instanceof Outline.Rounded)) {
                    throw new NoWhenBranchMatchedException();
                }
                Path = AndroidPath_androidKt.Path();
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
            }
            path = Path;
        }
        return pathMeasure(path);
    }
}
