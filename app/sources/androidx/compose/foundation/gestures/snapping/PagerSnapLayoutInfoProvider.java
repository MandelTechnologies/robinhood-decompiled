package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProvider;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo2;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.p011ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: PagerSnapLayoutInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "velocity", "", "isScrollingForward", "(Landroidx/compose/foundation/pager/PagerState;F)Z", "dragGestureDelta", "(Landroidx/compose/foundation/pager/PagerState;)F", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/unit/LayoutDirection;FFFF)F", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class PagerSnapLayoutInfoProvider {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final Function3<? super Float, ? super Float, ? super Float, Float> function3) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            public final boolean isValidDistance(float f) {
                return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float velocity) {
                Tuples2<Float, Float> tuples2SearchForSnappingBounds = searchForSnappingBounds(pagerState.getLayoutInfo().getSnapPosition(), velocity);
                float fFloatValue = tuples2SearchForSnappingBounds.component1().floatValue();
                float fFloatValue2 = tuples2SearchForSnappingBounds.component2().floatValue();
                float fFloatValue3 = function3.invoke(Float.valueOf(velocity), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
                if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                    InlineClassHelper.throwIllegalStateException("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (isValidDistance(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float velocity, float decayOffset) {
                int firstVisiblePage;
                int pageSize$foundation_release = pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
                if (pageSize$foundation_release == 0) {
                    return 0.0f;
                }
                if (velocity < 0.0f) {
                    firstVisiblePage = pagerState.getFirstVisiblePage() + 1;
                } else {
                    firstVisiblePage = pagerState.getFirstVisiblePage();
                }
                int i = firstVisiblePage;
                int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.abs((RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(i, RangesKt.coerceIn(((int) (decayOffset / pageSize$foundation_release)) + i, 0, pagerState.getPageCount()), velocity, pagerState.getPageSize$foundation_release(), pagerState.getPageSpacing$foundation_release()), 0, pagerState.getPageCount()) - i) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                return iCoerceAtLeast == 0 ? iCoerceAtLeast : iCoerceAtLeast * Math.signum(velocity);
            }

            private final Tuples2<Float, Float> searchForSnappingBounds(SnapPosition snapPosition, float velocity) {
                float f;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                PagerState pagerState2 = pagerState;
                int size = visiblePagesInfo.size();
                int i = 0;
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                while (true) {
                    f = 0.0f;
                    if (i >= size) {
                        break;
                    }
                    PageInfo pageInfo = visiblePagesInfo.get(i);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPosition2.calculateDistanceToDesiredSnapPosition(PagerLayoutInfo2.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    i++;
                }
                if (f2 == Float.NEGATIVE_INFINITY) {
                    f2 = f3;
                }
                if (f3 == Float.POSITIVE_INFINITY) {
                    f3 = f2;
                }
                if (!pagerState.getCanScrollForward()) {
                    if (PagerSnapLayoutInfoProvider.isScrollingForward(pagerState, velocity)) {
                        f2 = 0.0f;
                        f3 = 0.0f;
                    } else {
                        f3 = 0.0f;
                    }
                }
                if (pagerState.getCanScrollBackward()) {
                    f = f2;
                } else if (!PagerSnapLayoutInfoProvider.isScrollingForward(pagerState, velocity)) {
                    f3 = 0.0f;
                }
                return Tuples4.m3642to(Float.valueOf(f), Float.valueOf(f3));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState, float f) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        boolean z = (pagerState.isNotGestureAction$foundation_release() ? -f : dragGestureDelta(pagerState)) > 0.0f;
        return (z && reverseLayout) || !(z || reverseLayout);
    }

    private static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.m5310getUpDownDifferenceF1C5BW0$foundation_release() >> 32)) : Float.intBitsToFloat((int) (pagerState.m5310getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float calculateFinalSnappingBound(PagerState pagerState, LayoutDirection layoutDirection, float f, float f2, float f3, float f4) {
        boolean zIsScrollingForward = isScrollingForward(pagerState, f2);
        if (pagerState.getLayoutInfo().getOrientation() != Orientation.Vertical && layoutDirection != LayoutDirection.Ltr) {
            zIsScrollingForward = !zIsScrollingForward;
        }
        int pageSize = pagerState.getLayoutInfo().getPageSize();
        float fDragGestureDelta = pageSize == 0 ? 0.0f : dragGestureDelta(pagerState) / pageSize;
        float f5 = fDragGestureDelta - ((int) fDragGestureDelta);
        int iCalculateFinalSnappingItem = LazyListSnapLayoutInfoProvider2.calculateFinalSnappingItem(pagerState.getDensity(), f2);
        LazyListSnapLayoutInfoProvider.Companion companion = LazyListSnapLayoutInfoProvider.INSTANCE;
        if (LazyListSnapLayoutInfoProvider.m5057equalsimpl0(iCalculateFinalSnappingItem, companion.m5058getClosestItembbeMdSM())) {
            return (Math.abs(f5) <= f ? Math.abs(fDragGestureDelta) < Math.abs(pagerState.getPositionThresholdFraction$foundation_release()) ? Math.abs(f3) >= Math.abs(f4) : !zIsScrollingForward : zIsScrollingForward) ? f4 : f3;
        }
        if (!LazyListSnapLayoutInfoProvider.m5057equalsimpl0(iCalculateFinalSnappingItem, companion.m5059getNextItembbeMdSM())) {
            if (!LazyListSnapLayoutInfoProvider.m5057equalsimpl0(iCalculateFinalSnappingItem, companion.m5060getPreviousItembbeMdSM())) {
                return 0.0f;
            }
        }
    }
}
