package androidx.compose.p011ui.node;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.semantics.SemanticsInfo;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DelegatableNode.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u0010\u001a\u00020\u0001*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0015\u001a\u00020\u0012*\u00020\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010!\u001a\u00020 *\u00020\u000b¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010$\u001a\u00020#*\u00020\u000b¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010'\u001a\u00020&*\u00020\u000b¢\u0006\u0004\b'\u0010(\u001a\u0011\u0010*\u001a\u00020)*\u00020\u000b¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010-\u001a\u0004\u0018\u00010,*\u00020\u0006H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001d\u0010/\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b/\u00100\"\u0018\u00101\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m3636d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "zOrder", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "", "addLayoutNodeChildren", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeKind;", "type", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "requireLayoutNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "requireSemanticsInfo", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;", "requestAutofill", "(Landroidx/compose/ui/node/DelegatableNode;)V", "Landroidx/compose/ui/unit/Density;", "requireDensity", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireGraphicsContext", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutDirection", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutCoordinates", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LayoutModifierNode;", "asLayoutModifierNode", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/node/LayoutModifierNode;", "pop", "(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;", "isDelegationRoot", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.DelegatableNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class DelegatableNode2 {
    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m7381constructorimpl(2) & node.getKindSet()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    if ((delegate$ui_release instanceof DelegatingNode) && (NodeKind.m7381constructorimpl(2) & delegate$ui_release.getKindSet()) != 0) {
                        delegate$ui_release = ((DelegatingNode) delegate$ui_release).getDelegate();
                    } else {
                        delegate$ui_release = delegate$ui_release.getChild();
                    }
                }
            }
        }
        return null;
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode layoutNode, boolean z) {
        if (z) {
            return layoutNode.getZSortedChildren();
        }
        return layoutNode.get_children$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean z) {
        MutableVector<LayoutNode> children = getChildren(requireLayoutNode(node), z);
        int size = children.getSize() - 1;
        LayoutNode[] layoutNodeArr = children.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes().getHead());
                size--;
            }
        }
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m7286has64DMado(DelegatableNode delegatableNode, int i) {
        return (delegatableNode.getNode().getAggregateChildKindSet() & i) != 0;
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m7287requireCoordinator64DMado(DelegatableNode delegatableNode, int i) {
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != delegatableNode || !NodeKind3.m7382getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator;
        }
        NodeCoordinator wrapped$ui_release = coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator == null) {
            InlineClassHelper4.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
            throw new ExceptionsH();
        }
        return coordinator.getLayoutNode();
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        InlineClassHelper4.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new ExceptionsH();
    }

    public static final void requestAutofill(DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui_release();
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m7287requireCoordinator64DMado(delegatableNode, NodeKind.m7381constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelper4.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }
}
