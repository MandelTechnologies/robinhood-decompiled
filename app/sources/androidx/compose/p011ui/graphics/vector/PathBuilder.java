package androidx.compose.p011ui.graphics.vector;

import androidx.compose.p011ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PathBuilder.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0011J=\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001cJ-\u0010$\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b&\u0010%R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020(0,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m3636d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "<init>", "()V", "close", "()Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "x", "y", "moveTo", "(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx", "dy", "moveToRelative", "lineTo", "lineToRelative", "horizontalLineTo", "(F)Landroidx/compose/ui/graphics/vector/PathBuilder;", "horizontalLineToRelative", "verticalLineTo", "verticalLineToRelative", "x1", "y1", "x2", "y2", "x3", "y3", "curveTo", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "curveToRelative", "reflectiveCurveTo", "(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "reflectiveCurveToRelative", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "_nodes", "Ljava/util/ArrayList;", "", "getNodes", "()Ljava/util/List;", "nodes", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PathBuilder {
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    public final PathBuilder moveTo(float x, float y) {
        this._nodes.add(new PathNode.MoveTo(x, y));
        return this;
    }

    public final PathBuilder moveToRelative(float dx, float dy) {
        this._nodes.add(new PathNode.RelativeMoveTo(dx, dy));
        return this;
    }

    public final PathBuilder lineTo(float x, float y) {
        this._nodes.add(new PathNode.LineTo(x, y));
        return this;
    }

    public final PathBuilder lineToRelative(float dx, float dy) {
        this._nodes.add(new PathNode.RelativeLineTo(dx, dy));
        return this;
    }

    public final PathBuilder horizontalLineTo(float x) {
        this._nodes.add(new PathNode.HorizontalTo(x));
        return this;
    }

    public final PathBuilder horizontalLineToRelative(float dx) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(dx));
        return this;
    }

    public final PathBuilder verticalLineTo(float y) {
        this._nodes.add(new PathNode.VerticalTo(y));
        return this;
    }

    public final PathBuilder verticalLineToRelative(float dy) {
        this._nodes.add(new PathNode.RelativeVerticalTo(dy));
        return this;
    }

    public final PathBuilder curveTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        this._nodes.add(new PathNode.CurveTo(x1, y1, x2, y2, x3, y3));
        return this;
    }

    public final PathBuilder curveToRelative(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this._nodes.add(new PathNode.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
        return this;
    }

    public final PathBuilder reflectiveCurveTo(float x1, float y1, float x2, float y2) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(x1, y1, x2, y2));
        return this;
    }

    public final PathBuilder reflectiveCurveToRelative(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
        return this;
    }
}
