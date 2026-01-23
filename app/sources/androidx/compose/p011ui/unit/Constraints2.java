package androidx.compose.p011ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Constraints.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016\u001a\u001e\u0010\u001d\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010 \u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001c\u001a*\u0010%\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m3636d2 = {"", "widthVal", "heightVal", "", "throwInvalidConstraintException", "(II)V", "size", "", "throwInvalidConstraintsSizeException", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", "createConstraints", "(IIII)J", "bitsNeedForSizeUnchecked", "(I)I", "Constraints", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "offset", "ui-unit_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.unit.ConstraintsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Constraints2 {
    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iBitsNeedForSizeUnchecked2 - 13;
        return Constraints.m7965constructorimpl(((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (iBitsNeedForSizeUnchecked2 + 2)) | ((i8 & (~(i8 >> 31))) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            InlineClassHelper6.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m7988constrainN9IONVI(long j, long j2) {
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
        int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
        int iM7977getMinWidthimpl2 = Constraints.m7977getMinWidthimpl(j2);
        if (iM7977getMinWidthimpl2 < iM7977getMinWidthimpl) {
            iM7977getMinWidthimpl2 = iM7977getMinWidthimpl;
        }
        if (iM7977getMinWidthimpl2 > iM7975getMaxWidthimpl) {
            iM7977getMinWidthimpl2 = iM7975getMaxWidthimpl;
        }
        int iM7975getMaxWidthimpl2 = Constraints.m7975getMaxWidthimpl(j2);
        if (iM7975getMaxWidthimpl2 >= iM7977getMinWidthimpl) {
            iM7977getMinWidthimpl = iM7975getMaxWidthimpl2;
        }
        if (iM7977getMinWidthimpl <= iM7975getMaxWidthimpl) {
            iM7975getMaxWidthimpl = iM7977getMinWidthimpl;
        }
        int iM7976getMinHeightimpl2 = Constraints.m7976getMinHeightimpl(j2);
        if (iM7976getMinHeightimpl2 < iM7976getMinHeightimpl) {
            iM7976getMinHeightimpl2 = iM7976getMinHeightimpl;
        }
        if (iM7976getMinHeightimpl2 > iM7974getMaxHeightimpl) {
            iM7976getMinHeightimpl2 = iM7974getMaxHeightimpl;
        }
        int iM7974getMaxHeightimpl2 = Constraints.m7974getMaxHeightimpl(j2);
        if (iM7974getMaxHeightimpl2 >= iM7976getMinHeightimpl) {
            iM7976getMinHeightimpl = iM7974getMaxHeightimpl2;
        }
        if (iM7976getMinHeightimpl <= iM7974getMaxHeightimpl) {
            iM7974getMaxHeightimpl = iM7976getMinHeightimpl;
        }
        return Constraints(iM7977getMinWidthimpl2, iM7975getMaxWidthimpl, iM7976getMinHeightimpl2, iM7974getMaxHeightimpl);
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m7987constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        if (i < iM7977getMinWidthimpl) {
            i = iM7977getMinWidthimpl;
        }
        if (i <= iM7975getMaxWidthimpl) {
            iM7975getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
        int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
        if (i2 < iM7976getMinHeightimpl) {
            i2 = iM7976getMinHeightimpl;
        }
        if (i2 <= iM7974getMaxHeightimpl) {
            iM7974getMaxHeightimpl = i2;
        }
        return IntSize.m8056constructorimpl((iM7975getMaxWidthimpl << 32) | (iM7974getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m7990constrainWidthK40F9xA(long j, int i) {
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        if (i < iM7977getMinWidthimpl) {
            i = iM7977getMinWidthimpl;
        }
        return i > iM7975getMaxWidthimpl ? iM7975getMaxWidthimpl : i;
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m7989constrainHeightK40F9xA(long j, int i) {
        int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
        int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
        if (i < iM7976getMinHeightimpl) {
            i = iM7976getMinHeightimpl;
        }
        return i > iM7974getMaxHeightimpl ? iM7974getMaxHeightimpl : i;
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m7992offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m7991offsetNN6EwU(j, i, i2);
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m7991offsetNN6EwU(long j, int i, int i2) {
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j) + i;
        if (iM7977getMinWidthimpl < 0) {
            iM7977getMinWidthimpl = 0;
        }
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        if (iM7975getMaxWidthimpl != Integer.MAX_VALUE && (iM7975getMaxWidthimpl = iM7975getMaxWidthimpl + i) < 0) {
            iM7975getMaxWidthimpl = 0;
        }
        int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j) + i2;
        if (iM7976getMinHeightimpl < 0) {
            iM7976getMinHeightimpl = 0;
        }
        int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
        return Constraints(iM7977getMinWidthimpl, iM7975getMaxWidthimpl, iM7976getMinHeightimpl, (iM7974getMaxHeightimpl == Integer.MAX_VALUE || (iM7974getMaxHeightimpl = iM7974getMaxHeightimpl + i2) >= 0) ? iM7974getMaxHeightimpl : 0);
    }
}
