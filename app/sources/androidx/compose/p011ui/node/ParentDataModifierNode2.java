package androidx.compose.p011ui.node;

import kotlin.Metadata;

/* compiled from: ParentDataModifierNode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"invalidateParentData", "", "Landroidx/compose/ui/node/ParentDataModifierNode;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.node.ParentDataModifierNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ParentDataModifierNode2 {
    public static final void invalidateParentData(ParentDataModifierNode parentDataModifierNode) {
        DelegatableNode2.requireLayoutNode(parentDataModifierNode).invalidateParentData$ui_release();
    }
}
