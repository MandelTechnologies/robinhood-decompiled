package androidx.compose.p011ui.node;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NodeChain.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001:\u0002abB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00104\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00106\u001a\u00020\fH\u0000¢\u0006\u0004\b5\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\r\u00108\u001a\u00020\f¢\u0006\u0004\b8\u0010\u000eJ\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010\u000eJ\u000f\u0010;\u001a\u00020\fH\u0000¢\u0006\u0004\b:\u0010\u000eJ\u000f\u0010=\u001a\u00020\fH\u0000¢\u0006\u0004\b<\u0010\u000eJ\u001e\u0010B\u001a\u00020\u00162\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR$\u0010O\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010S\u001a\u0004\bT\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bU\u0010\bR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u001c\u0010Y\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, m3636d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/Modifier$Node;", "padChain", "()Landroidx/compose/ui/Modifier$Node;", "paddedHead", "trimChain", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "", "syncAggregateChildKindSet", "()V", "head", "", "offset", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "after", "", "shouldAttachOnInsert", "Landroidx/compose/ui/node/NodeChain$Differ;", "getDiffer", "(Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/NodeChain$Differ;", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "propagateCoordinator", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V", "tail", "structuralUpdate", "(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "node", "detachAndRemoveNode", "removeNode", "element", "parent", "createAndInsertNodeAsChild", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "insertChild", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "prev", "next", "updateNode", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/Modifier;", "m", "updateFrom$ui_release", "(Landroidx/compose/ui/Modifier;)V", "updateFrom", "resetState$ui_release", "resetState", "syncCoordinators", "markAsAttached", "runAttachLifecycle", "markAsDetached$ui_release", "markAsDetached", "runDetachLifecycle$ui_release", "runDetachLifecycle", "Landroidx/compose/ui/node/NodeKind;", "type", "has-H91voCI$ui_release", "(I)Z", "has", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "<set-?>", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui_release", "getHead$ui_release", "current", "Landroidx/compose/runtime/collection/MutableVector;", "buffer", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "getAggregateChildKindSet", "()I", "aggregateChildKindSet", "isUpdating$ui_release", "()Z", "isUpdating", "Differ", "Logger", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NodeChain {
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    /* compiled from: NodeChain.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* loaded from: classes4.dex */
    public interface Logger {
    }

    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        InnerNodeCoordinator2 tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    public static final /* synthetic */ Logger access$getLogger$p(NodeChain nodeChain) {
        nodeChain.getClass();
        return null;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: getInnerCoordinator$ui_release, reason: from getter */
    public final InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* renamed from: getOuterCoordinator$ui_release, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* renamed from: getTail$ui_release, reason: from getter */
    public final Modifier.Node getTail() {
        return this.tail;
    }

    /* renamed from: getHead$ui_release, reason: from getter */
    public final Modifier.Node getHead() {
        return this.head;
    }

    public final boolean isUpdating$ui_release() {
        return NodeChain2.SentinelHead.getChild() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet();
    }

    private final Modifier.Node padChain() {
        if (!(this.head != NodeChain2.SentinelHead)) {
            InlineClassHelper4.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChain2.SentinelHead);
        NodeChain2.SentinelHead.setChild$ui_release(node);
        return NodeChain2.SentinelHead;
    }

    private final Modifier.Node trimChain(Modifier.Node paddedHead) {
        if (!(paddedHead == NodeChain2.SentinelHead)) {
            InlineClassHelper4.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        Modifier.Node child = NodeChain2.SentinelHead.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.setParent$ui_release(null);
        NodeChain2.SentinelHead.setChild$ui_release(null);
        NodeChain2.SentinelHead.setAggregateChildKindSet$ui_release(-1);
        NodeChain2.SentinelHead.updateCoordinator$ui_release(null);
        if (!(child != NodeChain2.SentinelHead)) {
            InlineClassHelper4.throwIllegalStateException("trimChain did not update the head");
        }
        return child;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r6 >= r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r5 = r13;
        r5.structuralUpdate(r6, r7, r8, r9, !r13.layoutNode.getApplyingModifierOnAttach$ui_release());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        androidx.compose.p011ui.internal.InlineClassHelper4.throwIllegalStateExceptionForNullCheck("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new kotlin.ExceptionsH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        androidx.compose.p011ui.internal.InlineClassHelper4.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        throw new kotlin.ExceptionsH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        r5 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateFrom$ui_release(Modifier m) {
        NodeChain nodeChain;
        Modifier.Node nodePadChain = padChain();
        MutableVector<Modifier.Element> mutableVector = this.current;
        int i = 0;
        int size = mutableVector != null ? mutableVector.getSize() : 0;
        MutableVector<Modifier.Element> mutableVector2 = this.buffer;
        if (mutableVector2 == null) {
            mutableVector2 = new MutableVector<>(new Modifier.Element[16], 0);
        }
        MutableVector<Modifier.Element> mutableVectorFillVector = NodeChain2.fillVector(m, mutableVector2);
        MutableVector<Modifier.Element> mutableVector3 = null;
        if (mutableVectorFillVector.getSize() == size) {
            Modifier.Node child = nodePadChain.getChild();
            int i2 = 0;
            while (true) {
                if (child == null || i2 >= size) {
                    break;
                }
                if (mutableVector == null) {
                    InlineClassHelper4.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new ExceptionsH();
                }
                Modifier.Element element = mutableVector.content[i2];
                Modifier.Element element2 = mutableVectorFillVector.content[i2];
                int iActionForModifiers = NodeChain2.actionForModifiers(element, element2);
                if (iActionForModifiers == 0) {
                    child = child.getParent();
                    break;
                }
                if (iActionForModifiers == 1) {
                    updateNode(element, element2, child);
                }
                child = child.getChild();
                i2++;
            }
        } else {
            nodeChain = this;
            if (nodeChain.layoutNode.getApplyingModifierOnAttach$ui_release() && size == 0) {
                Modifier.Node nodeCreateAndInsertNodeAsChild = nodePadChain;
                while (i < mutableVectorFillVector.getSize()) {
                    nodeCreateAndInsertNodeAsChild = createAndInsertNodeAsChild(mutableVectorFillVector.content[i], nodeCreateAndInsertNodeAsChild);
                    i++;
                }
                syncAggregateChildKindSet();
            } else if (mutableVectorFillVector.getSize() != 0) {
                if (mutableVector == null) {
                    mutableVector = new MutableVector<>(new Modifier.Element[16], 0);
                }
                MutableVector<Modifier.Element> mutableVector4 = mutableVector;
                nodeChain.structuralUpdate(0, mutableVector4, mutableVectorFillVector, nodePadChain, !nodeChain.layoutNode.getApplyingModifierOnAttach$ui_release());
                nodeChain = nodeChain;
                mutableVector = mutableVector4;
            } else {
                if (mutableVector == null) {
                    InlineClassHelper4.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new ExceptionsH();
                }
                Modifier.Node child2 = nodePadChain.getChild();
                for (int i3 = 0; child2 != null && i3 < mutableVector.getSize(); i3++) {
                    child2 = detachAndRemoveNode(child2).getChild();
                }
                InnerNodeCoordinator innerNodeCoordinator = nodeChain.innerCoordinator;
                LayoutNode parent$ui_release = nodeChain.layoutNode.getParent$ui_release();
                innerNodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
                nodeChain.outerCoordinator = nodeChain.innerCoordinator;
            }
            i = 1;
        }
        nodeChain.current = mutableVectorFillVector;
        if (mutableVector != null) {
            mutableVector.clear();
            mutableVector3 = mutableVector;
        }
        nodeChain.buffer = mutableVector3;
        nodeChain.head = trimChain(nodePadChain);
        if (i != 0) {
            syncCoordinators();
        }
    }

    public final void syncCoordinators() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNode2.asLayoutModifierNode(parent);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.checkNotNull(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(layoutModifierNodeAsLayoutModifierNode);
                    if (layoutModifierNode != parent) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, layoutModifierNodeAsLayoutModifierNode);
                    parent.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    private final void syncAggregateChildKindSet() {
        int kindSet = 0;
        for (Modifier.Node parent = this.tail.getParent(); parent != null && parent != NodeChain2.SentinelHead; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.setAggregateChildKindSet$ui_release(kindSet);
        }
    }

    public final void runAttachLifecycle() {
        NodeCoordinator wrapped$ui_release = this.outerCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        while (wrapped$ui_release != innerNodeCoordinator) {
            wrapped$ui_release.onAttach();
            wrapped$ui_release = wrapped$ui_release.getWrapped();
            Intrinsics.checkNotNull(wrapped$ui_release);
        }
        innerNodeCoordinator.onAttach();
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.runAttachLifecycle$ui_release();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                NodeKind3.autoInvalidateInsertedNode(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                NodeKind3.autoInvalidateUpdatedNode(head);
            }
            head.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    private final Differ getDiffer(Modifier.Node head, int offset, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after, boolean shouldAttachOnInsert) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(head);
        differ.setOffset(offset);
        differ.setBefore(before);
        differ.setAfter(after);
        differ.setShouldAttachOnInsert(shouldAttachOnInsert);
        return differ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(Modifier.Node start, NodeCoordinator coordinator) {
        for (Modifier.Node parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent != NodeChain2.SentinelHead) {
                if ((NodeKind.m7381constructorimpl(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.updateCoordinator$ui_release(coordinator);
            } else {
                LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                coordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = coordinator;
                return;
            }
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "Landroidx/compose/ui/Modifier$Node;", "node", "", "offset", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V", "oldIndex", "newIndex", "areItemsTheSame", "(II)Z", "", "insert", "(I)V", "atIndex", "remove", "(II)V", "same", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", "I", "getOffset", "()I", "setOffset", "Landroidx/compose/runtime/collection/MutableVector;", "getBefore", "()Landroidx/compose/runtime/collection/MutableVector;", "setBefore", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getAfter", "setAfter", "Z", "getShouldAttachOnInsert", "()Z", "setShouldAttachOnInsert", "(Z)V", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private final class Differ implements MyersDiff2 {
        private MutableVector<Modifier.Element> after;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(Modifier.Node node, int i, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z) {
            this.node = node;
            this.offset = i;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z;
        }

        public final void setNode(Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setShouldAttachOnInsert(boolean z) {
            this.shouldAttachOnInsert = z;
        }

        @Override // androidx.compose.p011ui.node.MyersDiff2
        public boolean areItemsTheSame(int oldIndex, int newIndex) {
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i = this.offset;
            return NodeChain2.actionForModifiers(mutableVector.content[oldIndex + i], this.after.content[i + newIndex]) != 0;
        }

        @Override // androidx.compose.p011ui.node.MyersDiff2
        public void insert(int newIndex) {
            int i = this.offset + newIndex;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.content[i], this.node);
            NodeChain.access$getLogger$p(NodeChain.this);
            if (this.shouldAttachOnInsert) {
                Modifier.Node child = this.node.getChild();
                Intrinsics.checkNotNull(child);
                NodeCoordinator coordinator = child.getCoordinator();
                Intrinsics.checkNotNull(coordinator);
                LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNode2.asLayoutModifierNode(this.node);
                if (layoutModifierNodeAsLayoutModifierNode != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), layoutModifierNodeAsLayoutModifierNode);
                    this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                    NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                    layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator.getWrappedBy());
                    layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator);
                    coordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                } else {
                    this.node.updateCoordinator$ui_release(coordinator);
                }
                this.node.markAsAttached$ui_release();
                this.node.runAttachLifecycle$ui_release();
                NodeKind3.autoInvalidateInsertedNode(this.node);
                return;
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }

        @Override // androidx.compose.p011ui.node.MyersDiff2
        public void remove(int atIndex, int oldIndex) {
            Modifier.Node child = this.node.getChild();
            Intrinsics.checkNotNull(child);
            NodeChain.access$getLogger$p(NodeChain.this);
            if ((NodeKind.m7381constructorimpl(2) & child.getKindSet()) != 0) {
                NodeCoordinator coordinator = child.getCoordinator();
                Intrinsics.checkNotNull(coordinator);
                NodeCoordinator wrappedBy$ui_release = coordinator.getWrappedBy();
                NodeCoordinator wrapped$ui_release = coordinator.getWrapped();
                Intrinsics.checkNotNull(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child);
        }

        @Override // androidx.compose.p011ui.node.MyersDiff2
        public void same(int oldIndex, int newIndex) {
            Modifier.Node child = this.node.getChild();
            Intrinsics.checkNotNull(child);
            this.node = child;
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i = this.offset;
            Modifier.Element element = mutableVector.content[oldIndex + i];
            Modifier.Element element2 = this.after.content[i + newIndex];
            if (!Intrinsics.areEqual(element, element2)) {
                NodeChain.this.updateNode(element, element2, this.node);
                NodeChain.access$getLogger$p(NodeChain.this);
            } else {
                NodeChain.access$getLogger$p(NodeChain.this);
            }
        }
    }

    private final void structuralUpdate(int offset, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after, Modifier.Node tail, boolean shouldAttachOnInsert) {
        MyersDiff4.executeDiff(before.getSize() - offset, after.getSize() - offset, getDiffer(tail, offset, before, after, shouldAttachOnInsert));
        syncAggregateChildKindSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.getIsAttached()) {
            NodeKind3.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child = node.getChild();
        Modifier.Node parent = node.getParent();
        if (child != null) {
            child.setParent$ui_release(parent);
            node.setChild$ui_release(null);
        }
        if (parent != null) {
            parent.setChild$ui_release(child);
            node.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(parent);
        return parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node parent) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).getNode();
            backwardsCompatNode.setKindSet$ui_release(NodeKind3.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(backwardsCompatNode, parent);
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node parent) {
        Modifier.Node child = parent.getChild();
        if (child != null) {
            child.setParent$ui_release(node);
            node.setChild$ui_release(child);
        }
        parent.setChild$ui_release(node);
        node.setParent$ui_release(parent);
        return node;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        if ((prev instanceof ModifierNodeElement) && (next instanceof ModifierNodeElement)) {
            NodeChain2.updateUnsafe((ModifierNodeElement) next, node);
            if (node.getIsAttached()) {
                NodeKind3.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).setElement(next);
            if (node.getIsAttached()) {
                NodeKind3.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        InlineClassHelper4.throwIllegalStateException("Unknown Modifier.Node type");
    }

    public final void markAsAttached() {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.reset$ui_release();
            }
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.runDetachLifecycle$ui_release();
            }
        }
        NodeCoordinator wrappedBy$ui_release = this.innerCoordinator;
        NodeCoordinator nodeCoordinator = this.outerCoordinator;
        while (wrappedBy$ui_release != nodeCoordinator) {
            wrappedBy$ui_release.onDetach();
            wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy$ui_release);
        }
        nodeCoordinator.onDetach();
    }

    /* renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m7349hasH91voCI$ui_release(int type2) {
        return (type2 & getAggregateChildKindSet()) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head != this.tail) {
            Modifier.Node head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head = head.getChild();
            }
        } else {
            sb.append("]");
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
