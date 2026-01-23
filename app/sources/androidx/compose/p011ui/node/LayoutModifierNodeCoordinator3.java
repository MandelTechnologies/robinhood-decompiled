package androidx.compose.p011ui.node;

import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.HorizontalAlignmentLine;
import androidx.compose.p011ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, m3636d2 = {"calculateAlignmentAndPlaceChildAsNeeded", "", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinatorKt, reason: use source file name */
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadDelegate2 lookaheadDelegate2, AlignmentLine alignmentLine) {
        int iM8038getXimpl;
        LookaheadDelegate2 child = lookaheadDelegate2.getChild();
        if (!(child != null)) {
            InlineClassHelper4.throwIllegalStateException("Child of " + lookaheadDelegate2 + " cannot be null when calculating alignment line");
        }
        if (lookaheadDelegate2.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = lookaheadDelegate2.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i = child.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        child.setShallowPlacing$ui_release(true);
        lookaheadDelegate2.setPlacingForAlignment$ui_release(true);
        lookaheadDelegate2.replace$ui_release();
        child.setShallowPlacing$ui_release(false);
        lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            iM8038getXimpl = IntOffset.m8039getYimpl(child.getPosition());
        } else {
            iM8038getXimpl = IntOffset.m8038getXimpl(child.getPosition());
        }
        return i + iM8038getXimpl;
    }
}
