package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.ParentDataModifierNode;
import androidx.compose.p011ui.unit.Density;
import kotlin.Metadata;

/* compiled from: LayoutId.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/ui/layout/LayoutIdModifier;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/Modifier$Node;", "layoutId", "", "(Ljava/lang/Object;)V", "<set-?>", "getLayoutId", "()Ljava/lang/Object;", "setLayoutId$ui_release", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.layout.LayoutIdModifier, reason: use source file name */
/* loaded from: classes.dex */
public final class LayoutId3 extends Modifier.Node implements ParentDataModifierNode, LayoutId4 {
    private Object layoutId;

    @Override // androidx.compose.p011ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        return this;
    }

    public LayoutId3(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.p011ui.layout.LayoutId4
    public Object getLayoutId() {
        return this.layoutId;
    }

    public void setLayoutId$ui_release(Object obj) {
        this.layoutId = obj;
    }
}
