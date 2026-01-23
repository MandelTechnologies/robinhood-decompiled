package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: PagerScrollPosition.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Landroidx/compose/foundation/pager/PagerState;", "", "currentAbsoluteScrollOffset", "(Landroidx/compose/foundation/pager/PagerState;)J", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.pager.PagerScrollPositionKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class PagerScrollPosition2 {
    public static final long currentAbsoluteScrollOffset(PagerState pagerState) {
        return (pagerState.getCurrentPage() * pagerState.getPageSizeWithSpacing$foundation_release()) + MathKt.roundToLong(pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation_release());
    }
}
