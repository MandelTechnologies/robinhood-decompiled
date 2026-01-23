package androidx.compose.p011ui.node;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LayoutNodeDrawScope.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"nextDrawNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.LayoutNodeDrawScopeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(4);
        int iM7381constructorimpl2 = NodeKind.m7381constructorimpl(2);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iM7381constructorimpl) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iM7381constructorimpl2) == 0) {
            if ((child.getKindSet() & iM7381constructorimpl) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
