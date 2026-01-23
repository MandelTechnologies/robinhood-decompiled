package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.node.ModifierNodeElement;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Transformable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/foundation/gestures/TransformableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "canPan", "lockRotationOnZoomPan", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Landroidx/compose/foundation/gestures/TransformableNode;", "node", "", "update", "(Landroidx/compose/foundation/gestures/TransformableNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/gestures/TransformableState;", "Lkotlin/jvm/functions/Function1;", "Z", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.gestures.TransformableElement, reason: use source file name */
/* loaded from: classes4.dex */
final class Transformable2 extends ModifierNodeElement<Transformable4> {
    private final Function1<Offset, Boolean> canPan;
    private final boolean enabled;
    private final boolean lockRotationOnZoomPan;
    private final TransformableState state;

    /* JADX WARN: Multi-variable type inference failed */
    public Transformable2(TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z, boolean z2) {
        this.state = transformableState;
        this.canPan = function1;
        this.lockRotationOnZoomPan = z;
        this.enabled = z2;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    /* renamed from: create */
    public Transformable4 getNode() {
        return new Transformable4(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(Transformable4 node) {
        node.update(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Transformable2.class != other.getClass()) {
            return false;
        }
        Transformable2 transformable2 = (Transformable2) other;
        return Intrinsics.areEqual(this.state, transformable2.state) && this.canPan == transformable2.canPan && this.lockRotationOnZoomPan == transformable2.lockRotationOnZoomPan && this.enabled == transformable2.enabled;
    }

    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.canPan.hashCode()) * 31) + Boolean.hashCode(this.lockRotationOnZoomPan)) * 31) + Boolean.hashCode(this.enabled);
    }
}
