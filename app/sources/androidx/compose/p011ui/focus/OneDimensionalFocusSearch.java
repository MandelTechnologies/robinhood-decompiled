package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.runtime.collection.MutableVector;
import com.singular.sdk.internal.Constants;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "()V", "compare", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.focus.FocusableChildrenComparator, reason: use source file name */
/* loaded from: classes4.dex */
final class OneDimensionalFocusSearch implements Comparator<FocusTargetNode> {
    public static final OneDimensionalFocusSearch INSTANCE = new OneDimensionalFocusSearch();

    private OneDimensionalFocusSearch() {
    }

    @Override // java.util.Comparator
    public int compare(FocusTargetNode a, FocusTargetNode b) {
        int i = 0;
        if (!FocusTraversal.isEligibleForFocusSearch(a) || !FocusTraversal.isEligibleForFocusSearch(b)) {
            if (FocusTraversal.isEligibleForFocusSearch(a)) {
                return -1;
            }
            return FocusTraversal.isEligibleForFocusSearch(b) ? 1 : 0;
        }
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(a);
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNode2.requireLayoutNode(b);
        if (Intrinsics.areEqual(layoutNodeRequireLayoutNode, layoutNodeRequireLayoutNode2)) {
            return 0;
        }
        MutableVector<LayoutNode> mutableVectorPathFromRoot = pathFromRoot(layoutNodeRequireLayoutNode);
        MutableVector<LayoutNode> mutableVectorPathFromRoot2 = pathFromRoot(layoutNodeRequireLayoutNode2);
        int iMin = Math.min(mutableVectorPathFromRoot.getSize() - 1, mutableVectorPathFromRoot2.getSize() - 1);
        if (iMin >= 0) {
            while (Intrinsics.areEqual(mutableVectorPathFromRoot.content[i], mutableVectorPathFromRoot2.content[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return Intrinsics.compare(mutableVectorPathFromRoot.content[i].getPlaceOrder$ui_release(), mutableVectorPathFromRoot2.content[i].getPlaceOrder$ui_release());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }
}
