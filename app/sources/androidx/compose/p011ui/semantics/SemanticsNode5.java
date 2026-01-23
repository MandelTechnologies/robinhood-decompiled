package androidx.compose.p011ui.semantics;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SemanticsNode.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/SemanticsNode;", "SemanticsNode", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;", "", "contentDescriptionFakeNodeId", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "roleFakeNodeId", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "outerMergingSemantics", "Landroidx/compose/ui/semantics/Role;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "role", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.semantics.SemanticsNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class SemanticsNode5 {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SemanticsNode SemanticsNode(LayoutNode layoutNode, boolean z) {
        NodeChain nodes = layoutNode.getNodes();
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(8);
        Object obj = null;
        if ((nodes.getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
            Modifier.Node head = nodes.getHead();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & iM7381constructorimpl) != 0) {
                    Modifier.Node nodePop = head;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof SemanticsModifierNode) {
                            obj = nodePop;
                            break loop0;
                        }
                        if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            mutableVector.add(nodePop);
                                            nodePop = null;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNode2.pop(mutableVector);
                    }
                    if ((head.getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                        break;
                    }
                    head = head.getChild();
                } else if ((head.getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                }
            }
        }
        Intrinsics.checkNotNull(obj);
        Modifier.Node node = ((SemanticsModifierNode) obj).getNode();
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z, layoutNode, semanticsConfiguration);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SemanticsModifierNode getOuterMergingSemantics(LayoutNode layoutNode) {
        NodeChain nodes = layoutNode.getNodes();
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(8);
        Object obj = null;
        if ((nodes.getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
            Modifier.Node head = nodes.getHead();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & iM7381constructorimpl) != 0) {
                    Modifier.Node nodePop = head;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (!(nodePop instanceof SemanticsModifierNode)) {
                            if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        } else if (((SemanticsModifierNode) nodePop).getMergeDescendants()) {
                            obj = nodePop;
                            break loop0;
                        }
                        nodePop = DelegatableNode2.pop(mutableVector);
                    }
                    if ((head.getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                        break;
                    }
                    head = head.getChild();
                } else if ((head.getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                }
            }
        }
        return (SemanticsModifierNode) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfiguration2.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }
}
