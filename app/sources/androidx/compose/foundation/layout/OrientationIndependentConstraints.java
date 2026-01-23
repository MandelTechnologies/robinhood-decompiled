package androidx.compose.foundation.layout;

import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RowColumnImpl.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\rJ;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0088\u0001\u000e\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "Landroidx/compose/ui/unit/Constraints;", "c", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "toBoxConstraints-OenEA2s", "toBoxConstraints", "copy-yUG9Ft0", "(JIIII)J", "copy", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m5130constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m5133copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m7977getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m7975getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m7976getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m7974getMaxHeightimpl(j);
        }
        return m5132copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5129constructorimpl(int i, int i2, int i3, int i4) {
        return m5130constructorimpl(Constraints2.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5131constructorimpl(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m5129constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m7977getMinWidthimpl(j) : Constraints.m7976getMinHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7975getMaxWidthimpl(j) : Constraints.m7974getMaxHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7976getMinHeightimpl(j) : Constraints.m7977getMinWidthimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7974getMaxHeightimpl(j) : Constraints.m7975getMaxWidthimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m5134toBoxConstraintsOenEA2s(long j, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return Constraints2.Constraints(Constraints.m7977getMinWidthimpl(j), Constraints.m7975getMaxWidthimpl(j), Constraints.m7976getMinHeightimpl(j), Constraints.m7974getMaxHeightimpl(j));
        }
        return Constraints2.Constraints(Constraints.m7976getMinHeightimpl(j), Constraints.m7974getMaxHeightimpl(j), Constraints.m7977getMinWidthimpl(j), Constraints.m7975getMaxWidthimpl(j));
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m5132copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m5129constructorimpl(i, i2, i3, i4);
    }
}
