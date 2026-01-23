package androidx.compose.material.ripple;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RippleAnimation.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m3636d2 = {"Landroidx/compose/ui/unit/Density;", "", "bounded", "Landroidx/compose/ui/geometry/Size;", "size", "", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "getRippleEndRadius", "Landroidx/compose/ui/unit/Dp;", "BoundedRippleExtraRadius", "F", "material-ripple_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material.ripple.RippleAnimationKt, reason: use source file name */
/* loaded from: classes.dex */
public final class RippleAnimation {
    private static final float BoundedRippleExtraRadius = C2002Dp.m7995constructorimpl(10);

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m5679getRippleEndRadiuscSwnlzA(Density density, boolean z, long j) {
        float fM6541getDistanceimpl = Offset.m6541getDistanceimpl(OffsetKt.Offset(Size.m6583getWidthimpl(j), Size.m6580getHeightimpl(j))) / 2.0f;
        return z ? fM6541getDistanceimpl + density.mo5016toPx0680j_4(BoundedRippleExtraRadius) : fM6541getDistanceimpl;
    }
}
