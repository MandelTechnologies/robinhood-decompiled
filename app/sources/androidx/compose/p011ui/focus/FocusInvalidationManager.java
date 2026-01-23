package androidx.compose.p011ui.focus;

import androidx.collection.ScatterSet2;
import androidx.collection.ScatterSet5;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FocusInvalidationManager.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0005H\u0002J%\u0010\u001c\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\r2\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010!J%\u0010\"\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00102\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010#R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "invalidateOwnerFocusState", "rootFocusStateFetcher", "Landroidx/compose/ui/focus/FocusState;", "activeFocusTargetNodeFetcher", "Landroidx/compose/ui/focus/FocusTargetNode;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "focusEventNodes", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusEventNodesLegacy", "", "focusPropertiesNodesLegacy", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "focusTargetNodesLegacy", "focusTargetsWithInvalidatedFocusEventsLegacy", "isInvalidationScheduled", "", "hasPendingInvalidation", "invalidateNodes", "invalidateNodesLegacy", "invalidateNodesOptimized", "scheduleInvalidation", "node", "scheduleInvalidationForOwner", "setUpOnRequestApplyChangesListener", "T", "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "scheduleInvalidationLegacy", "(Ljava/util/List;Ljava/lang/Object;)V", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    private final Function0<FocusTargetNode> activeFocusTargetNodeFetcher;
    private final Function0<Unit> invalidateOwnerFocusState;
    private boolean isInvalidationScheduled;
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;
    private final Function0<FocusState> rootFocusStateFetcher;
    private final ScatterSet2<FocusTargetNode> focusTargetNodes = ScatterSet5.mutableScatterSetOf();
    private final ScatterSet2<FocusEventModifierNode> focusEventNodes = ScatterSet5.mutableScatterSetOf();
    private final List<FocusTargetNode> focusTargetNodesLegacy = new ArrayList();
    private final List<FocusEventModifierNode> focusEventNodesLegacy = new ArrayList();
    private final List<FocusPropertiesModifierNode> focusPropertiesNodesLegacy = new ArrayList();
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0, Function0<? extends FocusState> function02, Function0<FocusTargetNode> function03) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
        this.rootFocusStateFetcher = function02;
        this.activeFocusTargetNodeFetcher = function03;
    }

    public final void scheduleInvalidation(FocusTargetNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusTargetNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusTargetNodesLegacy, node);
        }
    }

    public final void scheduleInvalidation(FocusEventModifierNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusEventNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusEventNodesLegacy, node);
        }
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode node) {
        scheduleInvalidationLegacy(this.focusPropertiesNodesLegacy, node);
    }

    public final void scheduleInvalidationForOwner() {
        setUpOnRequestApplyChangesListener();
    }

    public final boolean hasPendingInvalidation() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return this.isInvalidationScheduled;
        }
        return (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    private final <T> void scheduleInvalidation(ScatterSet2<T> scatterSet2, T t) {
        if (scatterSet2.add(t)) {
            setUpOnRequestApplyChangesListener();
        }
    }

    /* compiled from: FocusInvalidationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$setUpOnRequestApplyChangesListener$1 */
    /* loaded from: classes4.dex */
    /* synthetic */ class C18181 extends FunctionReferenceImpl implements Function0<Unit> {
        C18181(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    private final void setUpOnRequestApplyChangesListener() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.onRequestApplyChangesListener.invoke(new C18181(this));
        this.isInvalidationScheduled = true;
    }

    private final <T> void scheduleInvalidationLegacy(List<T> list, T t) {
        if (list.add(t) && this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusPropertiesNodesLegacy.size() == 1) {
            this.onRequestApplyChangesListener.invoke(new C18171(this));
        }
    }

    /* compiled from: FocusInvalidationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidationLegacy$1 */
    /* loaded from: classes4.dex */
    /* synthetic */ class C18171 extends FunctionReferenceImpl implements Function0<Unit> {
        C18171(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            invalidateNodesOptimized();
        } else {
            invalidateNodesLegacy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void invalidateNodesOptimized() {
        NodeChain nodes;
        long j;
        long j2;
        FocusTargetNode focusTargetNodeInvoke = this.activeFocusTargetNodeFetcher.invoke();
        long j3 = 255;
        if (focusTargetNodeInvoke == null) {
            ScatterSet2<FocusEventModifierNode> scatterSet2 = this.focusEventNodes;
            Object[] objArr = scatterSet2.elements;
            long[] jArr = scatterSet2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j4 = jArr[i];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j4 & j3) < 128) {
                                j2 = j3;
                                ((FocusEventModifierNode) objArr[(i << 3) + i3]).onFocusEvent(FocusState2.Inactive);
                            } else {
                                j2 = j3;
                            }
                            j4 >>= 8;
                            i3++;
                            j3 = j2;
                        }
                        j = j3;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        j = j3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    j3 = j;
                }
            }
        } else if (focusTargetNodeInvoke.getIsAttached()) {
            if (this.focusTargetNodes.contains(focusTargetNodeInvoke)) {
                focusTargetNodeInvoke.invalidateFocus$ui_release();
            }
            FocusState2 focusState = focusTargetNodeInvoke.getFocusState();
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024) | NodeKind.m7381constructorimpl(4096);
            if (!focusTargetNodeInvoke.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeInvoke.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(focusTargetNodeInvoke);
            int i4 = 0;
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iM7381constructorimpl) != 0) {
                            if ((NodeKind.m7381constructorimpl(1024) & node.getKindSet()) != 0) {
                                i4++;
                            }
                            if ((node instanceof FocusEventModifierNode) && this.focusEventNodes.contains(node)) {
                                if (i4 <= 1) {
                                    ((FocusEventModifierNode) node).onFocusEvent(focusState);
                                } else {
                                    ((FocusEventModifierNode) node).onFocusEvent(FocusState2.ActiveParent);
                                }
                                this.focusEventNodes.remove(node);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            ScatterSet2<FocusEventModifierNode> scatterSet22 = this.focusEventNodes;
            Object[] objArr2 = scatterSet22.elements;
            long[] jArr2 = scatterSet22.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr2[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j5 & 255) < 128) {
                                ((FocusEventModifierNode) objArr2[(i5 << 3) + i7]).onFocusEvent(FocusState2.Inactive);
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
        }
        this.invalidateOwnerFocusState.invoke();
        this.focusTargetNodes.clear();
        this.focusEventNodes.clear();
        this.isInvalidationScheduled = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final void invalidateNodesLegacy() {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        FocusState focusState;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = 0;
        if (!this.rootFocusStateFetcher.invoke().getHasFocus()) {
            List<FocusEventModifierNode> list = this.focusEventNodesLegacy;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                list.get(i5).onFocusEvent(FocusState2.Inactive);
            }
            List<FocusTargetNode> list2 = this.focusTargetNodesLegacy;
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                FocusTargetNode focusTargetNode = list2.get(i6);
                if (focusTargetNode.getIsAttached() && !focusTargetNode.isInitialized$ui_release()) {
                    focusTargetNode.initializeFocusState$ui_release(FocusState2.Inactive);
                }
            }
            this.focusTargetNodesLegacy.clear();
            this.focusEventNodesLegacy.clear();
            this.focusPropertiesNodesLegacy.clear();
            this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
            this.invalidateOwnerFocusState.invoke();
            return;
        }
        List<FocusPropertiesModifierNode> list3 = this.focusPropertiesNodesLegacy;
        int size3 = list3.size();
        int i7 = 0;
        while (true) {
            i = 1024;
            i2 = 16;
            i3 = 1;
            if (i7 >= size3) {
                break;
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = list3.get(i7);
            if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
                Modifier.Node node = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof FocusTargetNode) {
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node);
                    } else if ((node.getKindSet() & iM7381constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                        int i8 = 0;
                        for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                i8++;
                                if (i8 == 1) {
                                    node = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        mutableVector.add(node);
                                        node = null;
                                    }
                                    mutableVector.add(delegate);
                                }
                            }
                        }
                        if (i8 == 1) {
                        }
                    }
                    node = DelegatableNode2.pop(mutableVector);
                }
                if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                    InlineClassHelper4.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
                if (child == null) {
                    DelegatableNode2.addLayoutNodeChildren(mutableVector2, focusPropertiesModifierNode.getNode(), false);
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
                                    if (nodePop instanceof FocusTargetNode) {
                                        this.focusTargetNodesLegacy.add((FocusTargetNode) nodePop);
                                    } else if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i9 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iM7381constructorimpl) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    nodePop = delegate2;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector3.add(nodePop);
                                                        nodePop = null;
                                                    }
                                                    mutableVector3.add(delegate2);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
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
            i7++;
        }
        this.focusPropertiesNodesLegacy.clear();
        List<FocusEventModifierNode> list4 = this.focusEventNodesLegacy;
        int size4 = list4.size();
        int i10 = 0;
        while (i10 < size4) {
            FocusEventModifierNode focusEventModifierNode = list4.get(i10);
            if (focusEventModifierNode.getNode().getIsAttached()) {
                int iM7381constructorimpl2 = NodeKind.m7381constructorimpl(i);
                Modifier.Node node2 = focusEventModifierNode.getNode();
                int i11 = z5;
                int i12 = i3;
                FocusTargetNode focusTargetNode2 = null;
                MutableVector mutableVector4 = null;
                while (node2 != null) {
                    if (node2 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                        if (focusTargetNode2 != null) {
                            i11 = i3;
                        }
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode3)) {
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode3);
                            i12 = z5;
                        }
                        focusTargetNode2 = focusTargetNode3;
                    } else if ((node2.getKindSet() & iM7381constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate();
                        int i13 = z5;
                        while (delegate3 != null) {
                            if ((delegate3.getKindSet() & iM7381constructorimpl2) != 0) {
                                i13++;
                                if (i13 == i3) {
                                    node2 = delegate3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[i2], z5);
                                    }
                                    if (node2 != null) {
                                        mutableVector4.add(node2);
                                        node2 = null;
                                    }
                                    mutableVector4.add(delegate3);
                                }
                            }
                            delegate3 = delegate3.getChild();
                            i3 = 1;
                        }
                        int i14 = i3;
                        if (i13 == i14) {
                            i3 = i14;
                        }
                    }
                    node2 = DelegatableNode2.pop(mutableVector4);
                    i3 = 1;
                }
                if (!focusEventModifierNode.getNode().getIsAttached()) {
                    InlineClassHelper4.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector5 = new MutableVector(new Modifier.Node[i2], z5);
                Modifier.Node child2 = focusEventModifierNode.getNode().getChild();
                if (child2 == null) {
                    DelegatableNode2.addLayoutNodeChildren(mutableVector5, focusEventModifierNode.getNode(), z5);
                } else {
                    mutableVector5.add(child2);
                }
                while (mutableVector5.getSize() != 0) {
                    Modifier.Node nodePop2 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                    z5 = z5;
                    if ((nodePop2.getAggregateChildKindSet() & iM7381constructorimpl2) == 0) {
                        DelegatableNode2.addLayoutNodeChildren(mutableVector5, nodePop2, z5);
                    } else {
                        while (nodePop2 != null) {
                            if ((nodePop2.getKindSet() & iM7381constructorimpl2) != 0) {
                                MutableVector mutableVector6 = null;
                                z5 = z5;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) nodePop2;
                                        if (focusTargetNode2 != null) {
                                            i11 = 1;
                                        }
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                                            i12 = z5 == true ? 1 : 0;
                                        }
                                        z2 = z5 == true ? 1 : 0;
                                        focusTargetNode2 = focusTargetNode4;
                                    } else if ((nodePop2.getKindSet() & iM7381constructorimpl2) == 0 || !(nodePop2 instanceof DelegatingNode)) {
                                        z2 = z5 == true ? 1 : 0;
                                    } else {
                                        Modifier.Node delegate4 = ((DelegatingNode) nodePop2).getDelegate();
                                        int i15 = z5 == true ? 1 : 0;
                                        boolean z6 = z5;
                                        while (delegate4 != null) {
                                            if ((delegate4.getKindSet() & iM7381constructorimpl2) != 0) {
                                                i15++;
                                                if (i15 == 1) {
                                                    nodePop2 = delegate4;
                                                    z4 = false;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        Modifier.Node[] nodeArr = new Modifier.Node[i2];
                                                        z4 = false;
                                                        mutableVector6 = new MutableVector(nodeArr, 0);
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector6.add(nodePop2);
                                                        nodePop2 = null;
                                                    }
                                                    mutableVector6.add(delegate4);
                                                }
                                            } else {
                                                z4 = z6;
                                            }
                                            delegate4 = delegate4.getChild();
                                            z6 = z4;
                                            i2 = 16;
                                        }
                                        z3 = z6;
                                        z3 = z3;
                                        if (i15 != 1) {
                                            nodePop2 = DelegatableNode2.pop(mutableVector6);
                                        }
                                        z5 = z3;
                                        i2 = 16;
                                    }
                                    z3 = z2;
                                    nodePop2 = DelegatableNode2.pop(mutableVector6);
                                    z5 = z3;
                                    i2 = 16;
                                }
                                boolean z7 = z5 == true ? 1 : 0;
                                i2 = 16;
                            } else {
                                boolean z8 = z5 == true ? 1 : 0;
                                nodePop2 = nodePop2.getChild();
                                z5 = z8 ? 1 : 0;
                                i2 = 16;
                            }
                        }
                    }
                    z5 = z5 ? 1 : 0;
                    i2 = 16;
                }
                z = z5 == true ? 1 : 0;
                i4 = 1;
                if (i12 != 0) {
                    if (i11 != 0) {
                        focusState = FocusEventModifierNode2.getFocusState(focusEventModifierNode);
                    } else if (focusTargetNode2 == null || (focusState = focusTargetNode2.getFocusState()) == null) {
                        focusState = FocusState2.Inactive;
                    }
                    focusEventModifierNode.onFocusEvent(focusState);
                }
            } else {
                focusEventModifierNode.onFocusEvent(FocusState2.Inactive);
                z = z5;
                i4 = i3;
            }
            i10++;
            i3 = i4;
            z5 = z;
            i = 1024;
            i2 = 16;
        }
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> list5 = this.focusTargetNodesLegacy;
        int size5 = list5.size();
        for (int i16 = z5; i16 < size5; i16++) {
            FocusTargetNode focusTargetNode5 = list5.get(i16);
            if (focusTargetNode5.getIsAttached()) {
                FocusState2 focusState2 = focusTargetNode5.getFocusState();
                focusTargetNode5.invalidateFocus$ui_release();
                if (focusState2 != focusTargetNode5.getFocusState() || this.focusTargetsWithInvalidatedFocusEventsLegacy.contains(focusTargetNode5)) {
                    focusTargetNode5.dispatchFocusCallbacks$ui_release();
                }
            }
        }
        this.focusTargetNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodesLegacy.isEmpty()) {
            InlineClassHelper4.throwIllegalStateException("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodesLegacy.isEmpty()) {
            InlineClassHelper4.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodesLegacy.isEmpty()) {
            return;
        }
        InlineClassHelper4.throwIllegalStateException("Unprocessed FocusTarget nodes");
    }
}
