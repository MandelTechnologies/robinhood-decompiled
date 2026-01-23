package androidx.compose.p011ui.node;

import androidx.collection.ObjectIntMap2;
import androidx.collection.ObjectIntMap3;
import androidx.compose.p011ui.Actual_jvmKt;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifier;
import androidx.compose.p011ui.focus.FocusEventModifier;
import androidx.compose.p011ui.focus.FocusEventModifierNode;
import androidx.compose.p011ui.focus.FocusEventModifierNode2;
import androidx.compose.p011ui.focus.FocusOrderModifier;
import androidx.compose.p011ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p011ui.focus.FocusPropertiesModifierNode2;
import androidx.compose.p011ui.focus.FocusTargetNode;
import androidx.compose.p011ui.focus.FocusTargetNode4;
import androidx.compose.p011ui.input.key.KeyInputModifierNode;
import androidx.compose.p011ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p011ui.input.pointer.PointerInputModifier;
import androidx.compose.p011ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p011ui.layout.LayoutModifier;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p011ui.layout.OnPlacedModifier;
import androidx.compose.p011ui.layout.OnRemeasuredModifier;
import androidx.compose.p011ui.layout.ParentDataModifier;
import androidx.compose.p011ui.modifier.ModifierLocalConsumer;
import androidx.compose.p011ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p011ui.modifier.ModifierLocalProvider;
import androidx.compose.p011ui.relocation.BringIntoViewModifierNode;
import androidx.compose.p011ui.semantics.SemanticsModifier;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NodeKind.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0013\u0010\u0014\u001a\u00020\b*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u0007\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001c\u0010!\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Landroidx/compose/ui/Modifier$Element;", "element", "", "calculateNodeKindSetFrom", "(Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", "node", "(Landroidx/compose/ui/Modifier$Node;)I", "", "autoInvalidateRemovedNode", "(Landroidx/compose/ui/Modifier$Node;)V", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", "remainingSet", "phase", "autoInvalidateNodeIncludingDelegates", "(Landroidx/compose/ui/Modifier$Node;II)V", "selfKindSet", "autoInvalidateNodeSelf", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "scheduleInvalidationOfAssociatedFocusTargets", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "", "specifiesCanFocusProperty", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)Z", "calculateNodeKindSetFromIncludingDelegates", "Landroidx/collection/MutableObjectIntMap;", "", "classToKindSetMap", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "includeSelfInTraversal", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.NodeKindKt, reason: use source file name */
/* loaded from: classes.dex */
public final class NodeKind3 {
    private static final ObjectIntMap2<Object> classToKindSetMap = ObjectIntMap3.mutableObjectIntMapOf();

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(64);
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            iM7381constructorimpl |= NodeKind.m7381constructorimpl(128);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.m7381constructorimpl(524288) | iM7381constructorimpl : iM7381constructorimpl;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m7382getIncludeSelfInTraversalH91voCI(int i) {
        return (i & NodeKind.m7381constructorimpl(128)) != 0;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNode2.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & iM7381constructorimpl) == 0) {
                DelegatableNode2.addLayoutNodeChildren(mutableVector, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & iM7381constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            if (!(nodePop instanceof FocusTargetNode)) {
                                if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                        if ((delegate$ui_release.getKindSet() & iM7381constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            } else {
                                FocusTargetNode4.invalidateFocusTarget((FocusTargetNode) nodePop);
                            }
                            nodePop = DelegatableNode2.pop(mutableVector2);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        ObjectIntMap2<Object> objectIntMap2 = classToKindSetMap;
        Object objClassKeyForObject = Actual_jvmKt.classKeyForObject(node);
        int iFindKeyIndex = objectIntMap2.findKeyIndex(objClassKeyForObject);
        if (iFindKeyIndex < 0) {
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(1);
            if (node instanceof LayoutModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(2);
            }
            if (node instanceof DrawModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(4);
            }
            if (node instanceof SemanticsModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(8);
            }
            if (node instanceof PointerInputModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(16);
            }
            if (node instanceof ModifierLocalModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(32);
            }
            if (node instanceof ParentDataModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(64);
            }
            if (node instanceof LayoutAwareModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(128);
            }
            if (node instanceof GlobalPositionAwareModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(256);
            }
            if (node instanceof ApproachLayoutModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(512);
            }
            if (node instanceof FocusTargetNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(1024);
            }
            if (node instanceof FocusPropertiesModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(2048);
            }
            if (node instanceof FocusEventModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(4096);
            }
            if (node instanceof KeyInputModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(8192);
            }
            if (node instanceof RotaryInputModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(16384);
            }
            if (node instanceof CompositionLocalConsumerModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(32768);
            }
            if (node instanceof SoftKeyboardInterceptionModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(131072);
            }
            if (node instanceof TraversableNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(262144);
            }
            if (node instanceof BringIntoViewModifierNode) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(524288);
            }
            if (node instanceof LayoutAwareModifierNode2) {
                iM7381constructorimpl |= NodeKind.m7381constructorimpl(1048576);
            }
            objectIntMap2.set(objClassKeyForObject, iM7381constructorimpl);
            return iM7381constructorimpl;
        }
        return objectIntMap2.values[iFindKeyIndex];
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i, int i2) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet() & i, i2);
            int i3 = (~delegatingNode.getSelfKindSet()) & i;
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                autoInvalidateNodeIncludingDelegates(delegate$ui_release, i3, i2);
            }
            return;
        }
        autoInvalidateNodeSelf(node, i & node.getKindSet(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m7381constructorimpl(2) & i) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNode2.invalidateMeasurement((LayoutModifierNode) node);
                if (i2 == 2) {
                    DelegatableNode2.m7287requireCoordinator64DMado(node, NodeKind.m7381constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m7381constructorimpl(128) & i) != 0 && (node instanceof LayoutAwareModifierNode) && i2 != 2) {
                DelegatableNode2.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m7381constructorimpl(256) & i) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i2 != 2) {
                DelegatableNode2.requireLayoutNode(node).invalidateOnPositioned$ui_release();
            }
            if ((NodeKind.m7381constructorimpl(4) & i) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNode2.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m7381constructorimpl(8) & i) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNode2.requireLayoutNode(node).setSemanticsInvalidated$ui_release(true);
            }
            if ((NodeKind.m7381constructorimpl(64) & i) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNode2.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m7381constructorimpl(2048) & i) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (ComposeUiFlags.isTrackFocusEnabled || i2 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNode2.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i & NodeKind.m7381constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNode2.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        NodeKind2 nodeKind2 = NodeKind2.INSTANCE;
        nodeKind2.reset();
        focusPropertiesModifierNode.applyFocusProperties(nodeKind2);
        return nodeKind2.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
            }
            return selfKindSet$ui_release;
        }
        return calculateNodeKindSetFrom(node);
    }
}
