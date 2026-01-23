package androidx.compose.p011ui.platform;

import android.view.ViewGroup;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.RectHelper_androidKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.relocation.BringIntoViewModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m3636d2 = {"Landroidx/compose/ui/platform/BringIntoViewOnScreenResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroid/view/ViewGroup;", "view", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "", "bringIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "setView", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {
    private ViewGroup view;

    public final void setView(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    public BringIntoViewOnScreenResponderNode(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // androidx.compose.p011ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super Unit> continuation) {
        long jPositionInRoot = LayoutCoordinates2.positionInRoot(layoutCoordinates);
        Rect rectInvoke = function0.invoke();
        Rect rectM6562translatek4lQ0M = rectInvoke != null ? rectInvoke.m6562translatek4lQ0M(jPositionInRoot) : null;
        if (rectM6562translatek4lQ0M != null) {
            this.view.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(rectM6562translatek4lQ0M), false);
        }
        return Unit.INSTANCE;
    }
}
