package androidx.compose.p011ui.draganddrop;

import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.node.TraversableNode2;
import androidx.compose.p011ui.node.TraversableNode3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DragAndDropNode.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0012\u001a\u00020\u0003\"\b\b\u0000\u0010\u000e*\u00020\r*\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m3636d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "event", "", "dispatchEntered", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/geometry/Offset;", "positionInRoot", "", "contains-Uv8p0NA", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)Z", "contains", "Landroidx/compose/ui/node/TraversableNode;", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "block", "traverseSelfAndDescendants", "(Landroidx/compose/ui/node/TraversableNode;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.draganddrop.DragAndDropNodeKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class DragAndDropNode3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(DragAndDrop dragAndDrop, DragAndDropEvent dragAndDropEvent) {
        dragAndDrop.onEntered(dragAndDropEvent);
        dragAndDrop.onMoved(dragAndDropEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m6446containsUv8p0NA(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.getNode().getIsAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNode2.requireLayoutNode(dragAndDropNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long jPositionInRoot = LayoutCoordinates2.positionInRoot(coordinates);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jPositionInRoot >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L));
        float fM6444getSizeYbymL2g$ui_release = ((int) (dragAndDropNode.getSize() >> 32)) + fIntBitsToFloat;
        float fM6444getSizeYbymL2g$ui_release2 = ((int) (dragAndDropNode.getSize() & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fM6444getSizeYbymL2g$ui_release) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fM6444getSizeYbymL2g$ui_release2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> void traverseSelfAndDescendants(T t, Function1<? super T, ? extends TraversableNode2> function1) {
        if (function1.invoke(t) != TraversableNode2.ContinueTraversal) {
            return;
        }
        TraversableNode3.traverseDescendants(t, function1);
    }
}
