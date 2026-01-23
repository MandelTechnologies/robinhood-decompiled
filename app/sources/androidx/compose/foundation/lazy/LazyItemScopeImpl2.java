package androidx.compose.foundation.lazy;

import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/ParentSizeNode;", "", "fraction", "Landroidx/compose/runtime/State;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Landroidx/compose/foundation/lazy/ParentSizeNode;", "node", "", "update", "(Landroidx/compose/foundation/lazy/ParentSizeNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "getFraction", "()F", "Landroidx/compose/runtime/State;", "getWidthState", "()Landroidx/compose/runtime/State;", "getHeightState", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.lazy.ParentSizeElement, reason: use source file name */
/* loaded from: classes4.dex */
final class LazyItemScopeImpl2 extends ModifierNodeElement<LazyItemScopeImpl3> {
    private final float fraction;
    private final SnapshotState4<Integer> heightState;
    private final String inspectorName;
    private final SnapshotState4<Integer> widthState;

    public /* synthetic */ LazyItemScopeImpl2(float f, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? null : snapshotState4, (i & 4) != 0 ? null : snapshotState42, str);
    }

    public LazyItemScopeImpl2(float f, SnapshotState4<Integer> snapshotState4, SnapshotState4<Integer> snapshotState42, String str) {
        this.fraction = f;
        this.widthState = snapshotState4;
        this.heightState = snapshotState42;
        this.inspectorName = str;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    /* renamed from: create */
    public LazyItemScopeImpl3 getNode() {
        return new LazyItemScopeImpl3(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(LazyItemScopeImpl3 node) {
        node.setFraction(this.fraction);
        node.setWidthState(this.widthState);
        node.setHeightState(this.heightState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyItemScopeImpl2)) {
            return false;
        }
        LazyItemScopeImpl2 lazyItemScopeImpl2 = (LazyItemScopeImpl2) other;
        return this.fraction == lazyItemScopeImpl2.fraction && Intrinsics.areEqual(this.widthState, lazyItemScopeImpl2.widthState) && Intrinsics.areEqual(this.heightState, lazyItemScopeImpl2.heightState);
    }

    public int hashCode() {
        SnapshotState4<Integer> snapshotState4 = this.widthState;
        int iHashCode = (snapshotState4 != null ? snapshotState4.hashCode() : 0) * 31;
        SnapshotState4<Integer> snapshotState42 = this.heightState;
        return ((iHashCode + (snapshotState42 != null ? snapshotState42.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }
}
