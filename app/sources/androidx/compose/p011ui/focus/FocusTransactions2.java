package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.node.ObserverModifierNode2;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FocusTransactions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a%\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0003\u001a'\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0003\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001e\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001c\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001a\u001e\u0010\u001e\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "performRequestFocus", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "performRequestFocusOptimized", "performRequestFocusLegacy", "freeFocus", "forced", "refreshFocusEvents", "clearFocus", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "grantFocus", "clearChildFocus", "childNode", "requestFocusForChild", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "requestFocusForOwner", "requireActiveChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus", "performCustomClearFocus-Mxy_nc0", "performCustomClearFocus", "performCustomEnter-Mxy_nc0", "performCustomEnter", "performCustomExit-Mxy_nc0", "performCustomExit", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class FocusTransactions2 {

    /* compiled from: FocusTransactions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusState2.values().length];
            try {
                iArr[FocusState2.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusState2.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusState2.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusState2.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean performRequestFocus(FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return performRequestFocusOptimized(focusTargetNode);
        }
        return performRequestFocusLegacy(focusTargetNode);
    }

    private static final boolean performRequestFocusOptimized(FocusTargetNode focusTargetNode) {
        MutableVector mutableVector;
        int i;
        NodeChain nodes;
        NodeChain nodes2;
        FocusOwner focusOwner = DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        FocusState2 focusState = focusTargetNode.getFocusState();
        int i2 = 1;
        if (activeFocusTargetNode == focusTargetNode) {
            focusTargetNode.dispatchFocusCallbacks$ui_release(focusState, focusState);
            return true;
        }
        int i3 = 0;
        if (activeFocusTargetNode == null && !requestFocusForOwner(focusTargetNode)) {
            return false;
        }
        int i4 = 1024;
        int i5 = 16;
        if (activeFocusTargetNode != null) {
            mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
            if (!activeFocusTargetNode.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = activeFocusTargetNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(activeFocusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM7381constructorimpl) != 0) {
                            Modifier.Node nodePop = parent;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                int i6 = i4;
                                if (nodePop instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) nodePop);
                                } else if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate();
                                    int i7 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                            i7++;
                                            if (i7 == i2) {
                                                nodePop = delegate;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i2 = 1;
                                    }
                                    if (i7 == i2) {
                                        i4 = i6;
                                    }
                                }
                                nodePop = DelegatableNode2.pop(mutableVector2);
                                i4 = i6;
                                i2 = 1;
                            }
                        }
                        parent = parent.getParent();
                        i4 = i4;
                        i2 = 1;
                    }
                }
                int i8 = i4;
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                i4 = i8;
                i2 = 1;
            }
        } else {
            mutableVector = null;
        }
        int i9 = i4;
        MutableVector mutableVector3 = new MutableVector(new FocusTargetNode[16], 0);
        int iM7381constructorimpl2 = NodeKind.m7381constructorimpl(i9);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent2 = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNode2.requireLayoutNode(focusTargetNode);
        int i10 = 1;
        while (layoutNodeRequireLayoutNode2 != null) {
            if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iM7381constructorimpl2) != 0) {
                        Modifier.Node nodePop2 = parent2;
                        MutableVector mutableVector4 = null;
                        while (nodePop2 != null) {
                            if (nodePop2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop2;
                                Boolean boolValueOf = mutableVector != null ? Boolean.valueOf(mutableVector.remove(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    mutableVector3.add(focusTargetNode2);
                                }
                                if (focusTargetNode2 == activeFocusTargetNode) {
                                    i10 = i3;
                                }
                            } else {
                                if ((nodePop2.getKindSet() & iM7381constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                    Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate();
                                    int i11 = i3;
                                    while (delegate2 != null) {
                                        if ((delegate2.getKindSet() & iM7381constructorimpl2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                nodePop2 = delegate2;
                                            } else {
                                                if (mutableVector4 == null) {
                                                    mutableVector4 = new MutableVector(new Modifier.Node[i5], 0);
                                                }
                                                if (nodePop2 != null) {
                                                    mutableVector4.add(nodePop2);
                                                    nodePop2 = null;
                                                }
                                                mutableVector4.add(delegate2);
                                            }
                                        }
                                        delegate2 = delegate2.getChild();
                                        i5 = 16;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                i3 = 0;
                                i5 = 16;
                            }
                            nodePop2 = DelegatableNode2.pop(mutableVector4);
                            i3 = 0;
                            i5 = 16;
                        }
                    }
                    parent2 = parent2.getParent();
                    i3 = 0;
                    i5 = 16;
                }
            }
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
            parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            i3 = 0;
            i5 = 16;
        }
        if (i10 == 0 || activeFocusTargetNode == null) {
            i = 1;
        } else {
            i = 1;
            if (!clearFocus$default(activeFocusTargetNode, false, true, 1, null)) {
                return false;
            }
        }
        grantFocus(focusTargetNode);
        if (mutableVector != null) {
            int size = mutableVector.getSize() - i;
            Object[] objArr = mutableVector.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                    if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.dispatchFocusCallbacks$ui_release(FocusState2.ActiveParent, FocusState2.Inactive);
                    size--;
                }
            }
        }
        int size2 = mutableVector3.getSize() - 1;
        Object[] objArr2 = mutableVector3.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[size2];
                if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.dispatchFocusCallbacks$ui_release(focusTargetNode4 == activeFocusTargetNode ? FocusState2.Active : FocusState2.Inactive, FocusState2.ActiveParent);
                size2--;
            }
        }
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.dispatchFocusCallbacks$ui_release(focusState, FocusState2.Active);
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (!ComposeUiFlags.isViewFocusFixEnabled || DelegatableNode2.requireLayoutNode(focusTargetNode).getInteropView() != null) {
            return true;
        }
        DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().mo6493requestFocusForOwner7o62pno(FocusDirection.m6471boximpl(FocusDirection.INSTANCE.m6482getNextdhqQ8s()), null);
        return true;
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node nodePop;
        NodeChain nodes;
        NodeChain nodes2;
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM7381constructorimpl) != 0) {
                        nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
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
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!Intrinsics.areEqual(nodePop, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetNode2);
            if (zGrantFocus) {
                focusTargetNode.setFocusState(FocusState2.ActiveParent);
            }
            return zGrantFocus;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM7381constructorimpl2 = NodeKind.m7381constructorimpl(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent2 = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNode2.requireLayoutNode(focusTargetNode);
                loop4: while (true) {
                    if (layoutNodeRequireLayoutNode2 == null) {
                        break;
                    }
                    if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iM7381constructorimpl2) != 0) {
                                Modifier.Node nodePop2 = parent2;
                                MutableVector mutableVector2 = null;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        node = nodePop2;
                                        break loop4;
                                    }
                                    if ((nodePop2.getKindSet() & iM7381constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iM7381constructorimpl2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop2 = delegate2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector2.add(nodePop2);
                                                        nodePop2 = null;
                                                    }
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    nodePop2 = DelegatableNode2.pop(mutableVector2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                    parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                if (focusTargetNode3 == null && requestFocusForOwner(focusTargetNode)) {
                    boolean zGrantFocus2 = grantFocus(focusTargetNode2);
                    if (zGrantFocus2) {
                        focusTargetNode.setFocusState(FocusState2.ActiveParent);
                    }
                    return zGrantFocus2;
                }
                if (focusTargetNode3 == null || !requestFocusForChild(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zRequestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.getFocusState() != FocusState2.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zRequestFocusForChild) {
                    focusTargetNode3.dispatchFocusCallbacks$ui_release();
                }
                return zRequestFocusForChild;
            }
            requireActiveChild(focusTargetNode);
            if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean performRequestFocusLegacy(FocusTargetNode focusTargetNode) {
        Modifier.Node nodePop;
        NodeChain nodes;
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        boolean zRequestFocusForChild = true;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(focusTargetNode);
                loop0: while (true) {
                    if (layoutNodeRequireLayoutNode == null) {
                        nodePop = null;
                        break;
                    }
                    if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & iM7381constructorimpl) != 0) {
                                MutableVector mutableVector = null;
                                nodePop = parent;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNode2.pop(mutableVector);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                    parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                if (focusTargetNode2 != null) {
                    FocusState2 focusState = focusTargetNode2.getFocusState();
                    zRequestFocusForChild = requestFocusForChild(focusTargetNode2, focusTargetNode);
                    if (zRequestFocusForChild && focusState != focusTargetNode2.getFocusState()) {
                        focusTargetNode2.dispatchFocusCallbacks$ui_release();
                    }
                } else if (!requestFocusForOwner(focusTargetNode) || !grantFocus(focusTargetNode)) {
                    zRequestFocusForChild = false;
                }
            } else if (!clearChildFocus$default(focusTargetNode, false, false, 3, null) || !grantFocus(focusTargetNode)) {
            }
        }
        if (zRequestFocusForChild) {
            if (ComposeUiFlags.isViewFocusFixEnabled && DelegatableNode2.requireLayoutNode(focusTargetNode).getInteropView() == null) {
                DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().mo6493requestFocusForOwner7o62pno(FocusDirection.m6471boximpl(FocusDirection.INSTANCE.m6482getNextdhqQ8s()), null);
            }
            focusTargetNode.dispatchFocusCallbacks$ui_release();
        }
        return zRequestFocusForChild;
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        boolean z = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        return false;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(false);
                focusTargetNode.dispatchFocusCallbacks$ui_release(FocusState2.Captured, FocusState2.Active);
            }
            return true;
        }
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNode4.requireTransactionManager(focusTargetNode);
        try {
            if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i2 == 1) {
                z = true;
            } else if (i2 == 2) {
                focusTargetNode.setFocusState(FocusState2.Active);
                focusTargetNode.dispatchFocusCallbacks$ui_release();
                z = true;
            } else if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return z;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            if (ComposeUiFlags.isTrackFocusEnabled) {
                DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui_release(FocusState2.Active, FocusState2.Inactive);
                }
            } else {
                focusTargetNode.setFocusState(FocusState2.Inactive);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui_release();
                }
            }
            return true;
        }
        if (i == 2) {
            if (z) {
                if (ComposeUiFlags.isTrackFocusEnabled) {
                    DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                    if (z2) {
                        focusTargetNode.dispatchFocusCallbacks$ui_release(FocusState2.Captured, FocusState2.Inactive);
                        return z;
                    }
                } else {
                    focusTargetNode.setFocusState(FocusState2.Inactive);
                    if (z2) {
                        focusTargetNode.dispatchFocusCallbacks$ui_release();
                    }
                }
            }
            return z;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!clearChildFocus(focusTargetNode, z, z2)) {
            return false;
        }
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            focusTargetNode.setFocusState(FocusState2.Inactive);
            if (z2) {
                focusTargetNode.dispatchFocusCallbacks$ui_release();
            }
        } else if (z2) {
            focusTargetNode.dispatchFocusCallbacks$ui_release(FocusState2.ActiveParent, FocusState2.Inactive);
        }
        return true;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final FocusTransactions m6505performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
                FocusTransactionManager focusTransactionManager = FocusTargetNode4.getFocusTransactionManager(focusTargetNode);
                int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusOwner focusOwner = DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                focusPropertiesFetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
                int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.INSTANCE;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        FocusTransactions focusTransactions = FocusTransactions.Cancelled;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return focusTransactions;
                    }
                    if (cancel == companion.getRedirect$ui_release()) {
                        FocusTransactions focusTransactions2 = FocusTransactions.Redirected;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return focusTransactions2;
                    }
                    FocusTransactions focusTransactions3 = FocusRequester.m6497requestFocus3ESFkO8$default(cancel, 0, 1, null) ? FocusTransactions.Redirected : FocusTransactions.RedirectCancelled;
                    focusTargetNode.isProcessingCustomEnter = false;
                    return focusTransactions3;
                }
                if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                    FocusRequester.Companion companion2 = FocusRequester.INSTANCE;
                    FocusRequester redirect$ui_release = companion2.getRedirect$ui_release();
                    if (redirect$ui_release == companion2.getCancel()) {
                        FocusTransactions focusTransactions4 = FocusTransactions.Cancelled;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return focusTransactions4;
                    }
                    if (redirect$ui_release == companion2.getRedirect$ui_release()) {
                        FocusTransactions focusTransactions5 = FocusTransactions.Redirected;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return focusTransactions5;
                    }
                    FocusTransactions focusTransactions6 = FocusRequester.m6497requestFocus3ESFkO8$default(redirect$ui_release, 0, 1, null) ? FocusTransactions.Redirected : FocusTransactions.RedirectCancelled;
                    focusTargetNode.isProcessingCustomEnter = false;
                    return focusTransactions6;
                }
                focusTargetNode.isProcessingCustomEnter = false;
            } catch (Throwable th) {
                focusTargetNode.isProcessingCustomEnter = false;
                throw th;
            }
        }
        return FocusTransactions.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final FocusTransactions m6506performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
                FocusTransactionManager focusTransactionManager = FocusTargetNode4.getFocusTransactionManager(focusTargetNode);
                int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusOwner focusOwner = DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                focusPropertiesFetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
                int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.INSTANCE;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        FocusTransactions focusTransactions = FocusTransactions.Cancelled;
                        focusTargetNode.isProcessingCustomExit = false;
                        return focusTransactions;
                    }
                    if (cancel == companion.getRedirect$ui_release()) {
                        FocusTransactions focusTransactions2 = FocusTransactions.Redirected;
                        focusTargetNode.isProcessingCustomExit = false;
                        return focusTransactions2;
                    }
                    FocusTransactions focusTransactions3 = FocusRequester.m6497requestFocus3ESFkO8$default(cancel, 0, 1, null) ? FocusTransactions.Redirected : FocusTransactions.RedirectCancelled;
                    focusTargetNode.isProcessingCustomExit = false;
                    return focusTransactions3;
                }
                if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                    FocusRequester.Companion companion2 = FocusRequester.INSTANCE;
                    FocusRequester redirect$ui_release = companion2.getRedirect$ui_release();
                    if (redirect$ui_release == companion2.getCancel()) {
                        FocusTransactions focusTransactions4 = FocusTransactions.Cancelled;
                        focusTargetNode.isProcessingCustomExit = false;
                        return focusTransactions4;
                    }
                    if (redirect$ui_release == companion2.getRedirect$ui_release()) {
                        FocusTransactions focusTransactions5 = FocusTransactions.Redirected;
                        focusTargetNode.isProcessingCustomExit = false;
                        return focusTransactions5;
                    }
                    FocusTransactions focusTransactions6 = FocusRequester.m6497requestFocus3ESFkO8$default(redirect$ui_release, 0, 1, null) ? FocusTransactions.Redirected : FocusTransactions.RedirectCancelled;
                    focusTargetNode.isProcessingCustomExit = false;
                    return focusTransactions6;
                }
                focusTargetNode.isProcessingCustomExit = false;
            } catch (Throwable th) {
                focusTargetNode.isProcessingCustomExit = false;
                throw th;
            }
        }
        return FocusTransactions.None;
    }

    private static final boolean grantFocus(final FocusTargetNode focusTargetNode) {
        ObserverModifierNode2.observeReads(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                focusTargetNode.fetchFocusProperties$ui_release();
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
            return true;
        }
        focusTargetNode.setFocusState(FocusState2.Active);
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversal.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        return DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().mo6493requestFocusForOwner7o62pno(null, null);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversal.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final FocusTransactions m6507performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        Modifier.Node nodePop;
        NodeChain nodes;
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return FocusTransactions.None;
        }
        if (i2 == 3) {
            return m6504performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
        }
        if (i2 == 4) {
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
            if (!focusTargetNode.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = focusTargetNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    nodePop = null;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM7381constructorimpl) != 0) {
                            nodePop = parent;
                            MutableVector mutableVector = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    break loop0;
                                }
                                if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
                                    }
                                }
                                nodePop = DelegatableNode2.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
            if (focusTargetNode2 == null) {
                return FocusTransactions.None;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode2.getFocusState().ordinal()];
            if (i4 == 1) {
                return m6505performCustomEnterMxy_nc0(focusTargetNode2, i);
            }
            if (i4 == 2) {
                return FocusTransactions.Cancelled;
            }
            if (i4 == 3) {
                return m6507performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
            }
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            FocusTransactions focusTransactionsM6507performCustomRequestFocusMxy_nc0 = m6507performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
            FocusTransactions focusTransactions = focusTransactionsM6507performCustomRequestFocusMxy_nc0 != FocusTransactions.None ? focusTransactionsM6507performCustomRequestFocusMxy_nc0 : null;
            return focusTransactions == null ? m6505performCustomEnterMxy_nc0(focusTargetNode2, i) : focusTransactions;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final FocusTransactions m6504performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return FocusTransactions.Cancelled;
            }
            if (i2 == 3) {
                FocusTransactions focusTransactionsM6504performCustomClearFocusMxy_nc0 = m6504performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
                if (focusTransactionsM6504performCustomClearFocusMxy_nc0 == FocusTransactions.None) {
                    focusTransactionsM6504performCustomClearFocusMxy_nc0 = null;
                }
                return focusTransactionsM6504performCustomClearFocusMxy_nc0 == null ? m6506performCustomExitMxy_nc0(focusTargetNode, i) : focusTransactionsM6504performCustomClearFocusMxy_nc0;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return FocusTransactions.None;
    }
}
