package androidx.compose.foundation;

import android.annotation.SuppressLint;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.node.ModifierNodeElement;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: SystemGestureExclusion.android.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "exclusion", "<init>", "(Lkotlin/jvm/functions/Function1;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "node", "", "update", "(Landroidx/compose/foundation/ExcludeFromSystemGestureNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getExclusion", "()Lkotlin/jvm/functions/Function1;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {
    private final Function1<LayoutCoordinates, Rect> exclusion;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureElement(Function1<? super LayoutCoordinates, Rect> function1) {
        this.exclusion = function1;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @SuppressLint({"NewApi"})
    /* renamed from: create */
    public ExcludeFromSystemGestureNode getNode() {
        return new ExcludeFromSystemGestureNode(this.exclusion);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(ExcludeFromSystemGestureNode node) {
        node.setRect(this.exclusion);
    }

    public int hashCode() {
        Function1<LayoutCoordinates, Rect> function1 = this.exclusion;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }

    public boolean equals(Object other) {
        return (other instanceof ExcludeFromSystemGestureElement) && this.exclusion == ((ExcludeFromSystemGestureElement) other).exclusion;
    }
}
