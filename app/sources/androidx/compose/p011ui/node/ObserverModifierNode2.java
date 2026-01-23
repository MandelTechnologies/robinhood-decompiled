package androidx.compose.p011ui.node;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ObserverModifierNode.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"observeReads", "", "T", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "block", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier$Node;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.ObserverModifierNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ObserverModifierNode2 {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t, Function0<Unit> function0) {
        ObserverModifierNode3 ownerScope = t.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new ObserverModifierNode3(t);
            t.setOwnerScope$ui_release(ownerScope);
        }
        DelegatableNode2.requireOwner(t).getSnapshotObserver().observeReads$ui_release(ownerScope, ObserverModifierNode3.INSTANCE.getOnObserveReadsChanged$ui_release(), function0);
    }
}
