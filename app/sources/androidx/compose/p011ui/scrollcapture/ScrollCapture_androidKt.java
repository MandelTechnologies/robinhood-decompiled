package androidx.compose.p011ui.scrollcapture;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.platform.SemanticsUtils_androidKt;
import androidx.compose.p011ui.semantics.ScrollAxisRange;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration2;
import androidx.compose.p011ui.semantics.SemanticsNode;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntRect2;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScrollCapture.android.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"E\u0010\u0016\u001a/\b\u0001\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "fromNode", "", "depth", "Lkotlin/Function1;", "Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "", "onCandidate", "visitScrollCaptureCandidates", "(Landroidx/compose/ui/semantics/SemanticsNode;ILkotlin/jvm/functions/Function1;)V", "", "getChildrenForSearch", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "offset", "Lkotlin/coroutines/Continuation;", "", "getScrollCaptureScrollByAction", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;", "scrollCaptureScrollByAction", "", "getCanScrollVertically", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "canScrollVertically", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ScrollCapture_androidKt {
    static /* synthetic */ void visitScrollCaptureCandidates$default(SemanticsNode semanticsNode, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        visitScrollCaptureCandidates(semanticsNode, i, function1);
    }

    public static final Function2<Offset, Continuation<? super Offset>, Object> getScrollCaptureScrollByAction(SemanticsNode semanticsNode) {
        return (Function2) SemanticsConfiguration2.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollByOffset());
    }

    private static final boolean getCanScrollVertically(SemanticsNode semanticsNode) {
        Function2<Offset, Continuation<? super Offset>, Object> scrollCaptureScrollByAction = getScrollCaptureScrollByAction(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfiguration2.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        return (scrollCaptureScrollByAction == null || scrollAxisRange == null || scrollAxisRange.getMaxValue().invoke().floatValue() <= 0.0f) ? false : true;
    }

    private static final List<SemanticsNode> getChildrenForSearch(SemanticsNode semanticsNode) {
        return semanticsNode.getChildren$ui_release(false, false, false);
    }

    private static final void visitScrollCaptureCandidates(SemanticsNode semanticsNode, int i, Function1<? super ScrollCaptureCandidate, Unit> function1) {
        SemanticsNode semanticsNode2;
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        List<SemanticsNode> childrenForSearch = getChildrenForSearch(semanticsNode);
        while (true) {
            mutableVector.addAll(mutableVector.getSize(), (List) childrenForSearch);
            while (mutableVector.getSize() != 0) {
                semanticsNode2 = (SemanticsNode) mutableVector.removeAt(mutableVector.getSize() - 1);
                if (!SemanticsUtils_androidKt.isHidden(semanticsNode2) && !semanticsNode2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getDisabled())) {
                    NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = semanticsNode2.findCoordinatorToGetBounds$ui_release();
                    if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release == null) {
                        InlineClassHelper4.throwIllegalStateExceptionForNullCheck("Expected semantics node to have a coordinator.");
                        throw new ExceptionsH();
                    }
                    LayoutCoordinates coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui_release.getCoordinates();
                    IntRect intRectRoundToIntRect = IntRect2.roundToIntRect(LayoutCoordinates2.boundsInWindow(coordinates));
                    if (intRectRoundToIntRect.isEmpty()) {
                        continue;
                    } else {
                        if (!getCanScrollVertically(semanticsNode2)) {
                            break;
                        }
                        int i2 = i + 1;
                        function1.invoke(new ScrollCaptureCandidate(semanticsNode2, i2, intRectRoundToIntRect, coordinates));
                        visitScrollCaptureCandidates(semanticsNode2, i2, function1);
                    }
                }
            }
            return;
            childrenForSearch = getChildrenForSearch(semanticsNode2);
        }
    }
}
