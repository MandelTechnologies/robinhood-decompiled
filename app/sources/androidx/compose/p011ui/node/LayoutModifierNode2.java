package androidx.compose.p011ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LayoutModifierNode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "", "remeasureSync", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "invalidateLayer", "invalidatePlacement", "invalidateMeasurement", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.LayoutModifierNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class LayoutModifierNode2 {
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        DelegatableNode2.m7287requireCoordinator64DMado(layoutModifierNode, NodeKind.m7381constructorimpl(2)).invalidateLayer();
    }

    public static final void remeasureSync(LayoutModifierNode layoutModifierNode) {
        DelegatableNode2.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void invalidatePlacement(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui_release$default(DelegatableNode2.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void invalidateMeasurement(LayoutModifierNode layoutModifierNode) {
        DelegatableNode2.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }
}
