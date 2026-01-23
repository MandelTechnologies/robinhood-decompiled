package androidx.compose.p011ui.node;

import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Density3;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LayoutNode.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/unit/Density;", "DefaultDensity", "Landroidx/compose/ui/unit/Density;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.LayoutNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class LayoutNode6 {
    private static final Density DefaultDensity = Density3.Density$default(1.0f, 0.0f, 2, null);

    public static final Owner requireOwner(LayoutNode layoutNode) {
        Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        InlineClassHelper4.throwIllegalStateExceptionForNullCheck("LayoutNode should be attached to an owner");
        throw new ExceptionsH();
    }
}
