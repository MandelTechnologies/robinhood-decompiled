package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegate2;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: LayoutUtils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m3636d2 = {"isEllipsis", "", "Landroidx/compose/ui/text/style/TextOverflow;", "isEllipsis-MW5-ApA", "(I)Z", "finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "overflow", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.modifiers.LayoutUtilsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class LayoutUtils {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m5482finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return Constraints.INSTANCE.m7983fitPrioritizingWidthZbe2FdA(0, m5484finalMaxWidthtfFHcEY(j, z, i, f), 0, Constraints.m7974getMaxHeightimpl(j));
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m5484finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int iM7975getMaxWidthimpl = ((z || m5485isEllipsisMW5ApA(i)) && Constraints.m7971getHasBoundedWidthimpl(j)) ? Constraints.m7975getMaxWidthimpl(j) : Integer.MAX_VALUE;
        return Constraints.m7977getMinWidthimpl(j) == iM7975getMaxWidthimpl ? iM7975getMaxWidthimpl : RangesKt.coerceIn(TextDelegate2.ceilToIntPx(f), Constraints.m7977getMinWidthimpl(j), iM7975getMaxWidthimpl);
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m5483finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (z || !m5485isEllipsisMW5ApA(i)) {
            return RangesKt.coerceAtLeast(i2, 1);
        }
        return 1;
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m5485isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m7955equalsimpl0(i, companion.m7959getEllipsisgIe3tQ8()) || TextOverflow.m7955equalsimpl0(i, companion.m7961getStartEllipsisgIe3tQ8()) || TextOverflow.m7955equalsimpl0(i, companion.m7960getMiddleEllipsisgIe3tQ8());
    }
}
