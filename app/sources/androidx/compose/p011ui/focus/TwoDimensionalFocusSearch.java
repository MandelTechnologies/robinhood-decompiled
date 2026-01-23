package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.layout.BeyondBoundsLayout;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TwoDimensionalFocusSearch.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\u001a>\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a:\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a:\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a!\u0010\u0018\u001a\u00020\u0017*\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a.\u0010\u001d\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00152\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a2\u0010(\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010\"\u001a\u0013\u0010)\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010*\u001a\u0013\u0010,\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, m3636d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "twoDimensionalFocusSearch", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "findChildCorrespondingToFocusEnter", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/geometry/Rect;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/runtime/collection/MutableVector;", "accessibleChildren", "", "collectAccessibleChildren", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/runtime/collection/MutableVector;)V", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "findBestCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "source", "rect1", "rect2", "beamBeats-I7lrPNg", "beamBeats", "topLeft", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "bottomRight", "activeNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class TwoDimensionalFocusSearch {

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusState2.values().length];
            try {
                iArr[FocusState2.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusState2.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusState2.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusState2.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m6527twoDimensionalFocusSearchsMXa3k8(FocusTargetNode focusTargetNode, int i, Rect rect, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusState2 focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m6523findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, function1));
            }
            if (i2 == 4) {
                if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                    return function1.invoke(focusTargetNode);
                }
                if (rect == null) {
                    return Boolean.valueOf(m6523findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, function1));
                }
                return Boolean.valueOf(m6526searchChildren4C6V_qg(focusTargetNode, rect, i, function1));
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode activeChild = FocusTraversal.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i3 = iArr[activeChild.getFocusState().ordinal()];
        if (i3 == 1) {
            Boolean boolM6527twoDimensionalFocusSearchsMXa3k8 = m6527twoDimensionalFocusSearchsMXa3k8(activeChild, i, rect, function1);
            if (!Intrinsics.areEqual(boolM6527twoDimensionalFocusSearchsMXa3k8, Boolean.FALSE)) {
                return boolM6527twoDimensionalFocusSearchsMXa3k8;
            }
            if (rect == null) {
                rect = FocusTraversal.focusRect(activeNode(activeChild));
            }
            return Boolean.valueOf(m6524generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i, function1));
        }
        if (i3 == 2 || i3 == 3) {
            if (rect == null) {
                rect = FocusTraversal.focusRect(activeChild);
            }
            return Boolean.valueOf(m6524generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i, function1));
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            DelegatableNode2.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & iM7381constructorimpl) == 0) {
                DelegatableNode2.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & iM7381constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (!(nodePop instanceof FocusTargetNode)) {
                                if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nodePop = delegate;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector3.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector3.add(delegate);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            } else {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                                if (focusTargetNode.getIsAttached() && !DelegatableNode2.requireLayoutNode(focusTargetNode).getIsDeactivated()) {
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                        mutableVector.add(focusTargetNode);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode, mutableVector);
                                    }
                                }
                            }
                            nodePop = DelegatableNode2.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m6524generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final Rect rect, final int i, final Function1<? super FocusTargetNode, Boolean> function1) {
        if (m6526searchChildren4C6V_qg(focusTargetNode, rect, i, function1)) {
            return true;
        }
        final FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNode4.requireTransactionManager(focusTargetNode);
        final int generation = focusTransactionManagerRequireTransactionManager.getGeneration();
        final FocusTargetNode activeFocusTargetNode = DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayout2.m6469searchBeyondBoundsOMvw8(focusTargetNode, i, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (generation == focusTransactionManagerRequireTransactionManager.getGeneration() && (!ComposeUiFlags.isTrackFocusEnabled || activeFocusTargetNode == DelegatableNode2.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    boolean zM6526searchChildren4C6V_qg = TwoDimensionalFocusSearch.m6526searchChildren4C6V_qg(focusTargetNode, rect, i, function1);
                    Boolean boolValueOf = Boolean.valueOf(zM6526searchChildren4C6V_qg);
                    if (zM6526searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                        return boolValueOf;
                    }
                    return null;
                }
                return Boolean.TRUE;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m6522findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s())) {
            rectTranslate = rect.translate((rect.getRight() - rect.getLeft()) + 1, 0.0f);
        } else if (FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
            rectTranslate = rect.translate(-((rect.getRight() - rect.getLeft()) + 1), 0.0f);
        } else if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, (rect.getBottom() - rect.getTop()) + 1);
        } else if (FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
            rectTranslate = rect.translate(0.0f, -((rect.getBottom() - rect.getTop()) + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        FocusTargetNode[] focusTargetNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        for (int i2 = 0; i2 < size; i2++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i2];
            if (FocusTraversal.isEligibleForFocusSearch(focusTargetNode2)) {
                Rect rectFocusRect = FocusTraversal.focusRect(focusTargetNode2);
                if (m6525isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i)) {
                    focusTargetNode = focusTargetNode2;
                    rectTranslate = rectFocusRect;
                }
            }
        }
        return focusTargetNode;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s())) {
            if (FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            if (f >= 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        if (f >= 0.0f) {
        }
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        float f;
        float f2;
        float left;
        float right;
        float left2;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s()) ? true : FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
            float top = rect2.getTop();
            float bottom = rect2.getBottom() - rect2.getTop();
            f = 2;
            f2 = top + (bottom / f);
            left = rect.getTop();
            right = rect.getBottom();
            left2 = rect.getTop();
        } else {
            if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s()) ? true : FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
                float left3 = rect2.getLeft();
                float right2 = rect2.getRight() - rect2.getLeft();
                f = 2;
                f2 = left3 + (right2 / f);
                left = rect.getLeft();
                right = rect.getRight();
                left2 = rect.getLeft();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        return f2 - (left + ((right - left2) / f));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long jIsBetterCandidate_I7lrPNg$majorAxisDistance = (long) isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect);
        long jIsBetterCandidate_I7lrPNg$minorAxisDistance = (long) isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect);
        return (13 * jIsBetterCandidate_I7lrPNg$majorAxisDistance * jIsBetterCandidate_I7lrPNg$majorAxisDistance) + (jIsBetterCandidate_I7lrPNg$minorAxisDistance * jIsBetterCandidate_I7lrPNg$minorAxisDistance);
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m6525isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) && !m6521beamBeatsI7lrPNg(rect3, rect, rect2, i)) {
            return !m6521beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2);
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s()) ? true : FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s()) ? true : FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s())) {
            return rect2.getLeft() >= rect.getRight();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
            return rect2.getRight() <= rect.getLeft();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s())) {
            return rect2.getTop() >= rect.getBottom();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
            return rect2.getBottom() <= rect.getTop();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s())) {
            if (FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            if (f >= 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        if (f >= 0.0f) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s())) {
            if (FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            if (f >= 1.0f) {
                return 1.0f;
            }
            return f;
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        if (f >= 1.0f) {
        }
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m6521beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        if (!beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect)) {
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        return FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s()) || FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect);
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusState2.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversal.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return focusTargetNodeFindActiveFocusNode;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m6523findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        Rect rectBottomRight;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.getSize() == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m6474equalsimpl0(i, companion.m6479getEnterdhqQ8s())) {
            i = companion.m6484getRightdhqQ8s();
        }
        if (FocusDirection.m6474equalsimpl0(i, companion.m6484getRightdhqQ8s()) ? true : FocusDirection.m6474equalsimpl0(i, companion.m6478getDowndhqQ8s())) {
            rectBottomRight = topLeft(FocusTraversal.focusRect(focusTargetNode));
        } else {
            if (!(FocusDirection.m6474equalsimpl0(i, companion.m6481getLeftdhqQ8s()) ? true : FocusDirection.m6474equalsimpl0(i, companion.m6485getUpdhqQ8s()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            rectBottomRight = bottomRight(FocusTraversal.focusRect(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeM6522findBestCandidate4WY_MpI = m6522findBestCandidate4WY_MpI(mutableVector, rectBottomRight, i);
        if (focusTargetNodeM6522findBestCandidate4WY_MpI != null) {
            return function1.invoke(focusTargetNodeM6522findBestCandidate4WY_MpI).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m6526searchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeM6522findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNode2.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & iM7381constructorimpl) == 0) {
                DelegatableNode2.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & iM7381constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (!(nodePop instanceof FocusTargetNode)) {
                                if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector3.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector3.add(delegate);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.getIsAttached()) {
                                    mutableVector.add(focusTargetNode2);
                                }
                            }
                            nodePop = DelegatableNode2.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
        while (mutableVector.getSize() != 0 && (focusTargetNodeM6522findBestCandidate4WY_MpI = m6522findBestCandidate4WY_MpI(mutableVector, rect, i)) != null) {
            if (focusTargetNodeM6522findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetNodeM6522findBestCandidate4WY_MpI).booleanValue();
            }
            if (m6524generateAndSearchChildren4C6V_qg(focusTargetNodeM6522findBestCandidate4WY_MpI, rect, i, function1)) {
                return true;
            }
            mutableVector.remove(focusTargetNodeM6522findBestCandidate4WY_MpI);
        }
        return false;
    }
}
