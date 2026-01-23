package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Scaffold.kt */
@Metadata(m3635d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\rR+\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m3636d2 = {"androidx/compose/material/ScaffoldKt$ScaffoldLayout$contentPadding$1$1", "Landroidx/compose/foundation/layout/PaddingValues;", "<set-?>", "paddingHolder", "getPaddingHolder", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingHolder", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "paddingHolder$delegate", "Landroidx/compose/runtime/MutableState;", "calculateBottomPadding", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements PaddingValues {

    /* renamed from: paddingHolder$delegate, reason: from kotlin metadata */
    private final SnapshotState paddingHolder = SnapshotState3.mutableStateOf$default(PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), null, 2, null);

    ScaffoldKt$ScaffoldLayout$contentPadding$1$1() {
    }

    public final PaddingValues getPaddingHolder() {
        return (PaddingValues) this.paddingHolder.getValue();
    }

    public final void setPaddingHolder(PaddingValues paddingValues) {
        this.paddingHolder.setValue(paddingValues);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo5118calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo5118calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float getTop() {
        return getPaddingHolder().getTop();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo5119calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo5119calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float getBottom() {
        return getPaddingHolder().getBottom();
    }
}
