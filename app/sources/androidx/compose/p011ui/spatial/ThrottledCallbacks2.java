package androidx.compose.p011ui.spatial;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffset2;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThrottledCallbacks.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"rectInfoFor", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "rectInfoFor-Q-MZNJw", "(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.spatial.ThrottledCallbacksKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class ThrottledCallbacks2 {
    /* renamed from: rectInfoFor-Q-MZNJw, reason: not valid java name */
    public static final RelativeLayoutBounds m7511rectInfoForQMZNJw(DelegatableNode delegatableNode, long j, long j2, long j3, long j4, float[] fArr) {
        NodeCoordinator nodeCoordinatorM7287requireCoordinator64DMado = DelegatableNode2.m7287requireCoordinator64DMado(delegatableNode, NodeKind.m7381constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release() != nodeCoordinatorM7287requireCoordinator64DMado) {
            long jM8033constructorimpl = IntOffset.m8033constructorimpl(j);
            float fM8038getXimpl = IntOffset.m8038getXimpl(jM8033constructorimpl);
            float fM8039getYimpl = IntOffset.m8039getYimpl(jM8033constructorimpl);
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fM8038getXimpl) << 32) | (Float.floatToRawIntBits(fM8039getYimpl) & 4294967295L));
            long jMo7241getSizeYbymL2g = nodeCoordinatorM7287requireCoordinator64DMado.getCoordinates().mo7241getSizeYbymL2g();
            return new RelativeLayoutBounds(IntOffset2.m8050roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release().getCoordinates().mo7242localPositionOfR5De75A(nodeCoordinatorM7287requireCoordinator64DMado, jM6535constructorimpl)), IntOffset.m8033constructorimpl(((IntOffset.m8038getXimpl(r0) + ((int) (jMo7241getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m8039getYimpl(r0) + ((int) (jMo7241getSizeYbymL2g & 4294967295L))) & 4294967295L)), j3, j4, fArr, delegatableNode, null);
        }
        return new RelativeLayoutBounds(j, j2, j3, j4, fArr, delegatableNode, null);
    }
}
