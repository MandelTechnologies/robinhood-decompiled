package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.IntSize;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a¦\u0001\u0010 \u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010'\u001a\u00020\u001d*\u00020!2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(\u001aM\u00101\u001a\b\u0012\u0004\u0012\u00020+0\u0003*\u00020!2\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)2\u0006\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102\u001a\u001b\u00105\u001a\u000204*\u00020#2\u0006\u00103\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u00106\u001a\u001e\u0010;\u001a\u00020\u0004*\u00020#2\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u001d\u0010=\u001a\u00020\u0004*\u00020#2\b\b\u0002\u0010<\u001a\u00020\u0004H\u0000¢\u0006\u0004\b=\u0010>\u001a\u0013\u0010?\u001a\u00020\u0004*\u00020#H\u0002¢\u0006\u0004\b?\u0010@\u001a#\u0010C\u001a\u000204*\u00020!2\u0006\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010D\u001a#\u0010G\u001a\u00020\u0004*\u00020!2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "approachLayoutInfo", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-C6celF4", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "initialScrollDelta", "", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measure", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "minOffset", "maxOffset", "calculateVisibleItems", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[IIII)Ljava/util/List;", "delta", "", "offsetBy", "([II)V", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "maxInRange", "minBound", "indexOfMinValue", "([II)I", "indexOfMaxValue", "([I)I", "indices", "itemCount", "ensureIndicesInRange", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "lane", "findPreviousItemIndex", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyStaggeredGridMeasure3 {
    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m5286measureStaggeredGridC6celF4(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGrid3 lazyStaggeredGrid3, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope, boolean z3, boolean z4, LazyStaggeredGridMeasureResult3 lazyStaggeredGridMeasureResult3, GraphicsContext graphicsContext) {
        int i5;
        int iM5285maxInRangejy6DScQ;
        LazyStaggeredGridMeasure lazyStaggeredGridMeasure = new LazyStaggeredGridMeasure(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGrid3, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, z3, z4, lazyStaggeredGridMeasureResult3, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasure.getLaneCount()) {
            lazyStaggeredGridMeasure.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasure.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM5285maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                    iM5285maxInRangejy6DScQ = i6 == 0 ? 0 : m5285maxInRangejy6DScQ(iArr, LazyStaggeredGridMeasure8.m5294constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = iM5285maxInRangejy6DScQ;
                lazyStaggeredGridMeasure.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasure.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasure.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                if (i7 < scrollOffsets.length) {
                    i5 = scrollOffsets[i7];
                } else {
                    i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                }
                iArr2[i7] = i5;
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasure, Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation_release(z4)), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f2, code lost:
    
        r4 = indexOfMinValue$default(r7, 0, 1, null);
        r6 = indexOfMaxValue(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02fd, code lost:
    
        if (r4 == r6) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0303, code lost:
    
        if (r7[r4] != r7[r6]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0305, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0307, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0308, code lost:
    
        r6 = r28[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030b, code lost:
    
        if (r6 != (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030d, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030e, code lost:
    
        r6 = findPreviousItemIndex(r0, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0312, code lost:
    
        if (r6 >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0314, code lost:
    
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0316, code lost:
    
        if (r1 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031c, code lost:
    
        if (measure$lambda$43$misalignedStart(r8, r0, r7, r4) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x031e, code lost:
    
        if (r49 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0320, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r8.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032b, code lost:
    
        if (r3 >= r1) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032d, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0334, code lost:
    
        r1 = r7.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0338, code lost:
    
        if (r5 >= r1) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033a, code lost:
    
        r3[r5] = r7[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0348, code lost:
    
        return measure(r0, r29, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0351, code lost:
    
        r8 = r28;
        r11 = r29;
        r25 = r14;
        r13 = r0.m5283getSpanRangelOCCd4c(r0.getItemProvider(), r6, r4);
        r4 = r0.getLaneInfo();
        r15 = r1;
        r46 = r2;
        r1 = (int) (r13 & 4294967295L);
        r27 = r3;
        r2 = (int) (r13 >> 32);
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0373, code lost:
    
        if (r3 == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0375, code lost:
    
        r2 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0377, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0379, code lost:
    
        r4.setLane(r6, r2);
        r2 = r0.getMeasuredItemProvider().m5290getAndMeasurejy6DScQ(r6, r13);
        r4 = m5285maxInRangejy6DScQ(r7, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0389, code lost:
    
        if (r3 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x038b, code lost:
    
        r3 = r0.getLaneInfo().getGaps(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0394, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0395, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0397, code lost:
    
        if (r14 >= r1) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x039b, code lost:
    
        if (r7[r14] == r4) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039d, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039e, code lost:
    
        r48[r14].addFirst(r2);
        r8[r14] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a5, code lost:
    
        if (r3 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a7, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a9, code lost:
    
        r13 = r3[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ab, code lost:
    
        r7[r14] = (r4 + r2.getMainAxisSizeWithSpacings()) + r13;
        r14 = r14 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0723 A[LOOP:21: B:312:0x066e->B:353:0x0723, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0735 A[EDGE_INSN: B:540:0x0735->B:355:0x0735 BREAK  A[LOOP:21: B:312:0x066e->B:353:0x0723], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasure lazyStaggeredGridMeasure, int i, int[] iArr, int[] iArr2, boolean z) {
        int i2;
        int iIndexOf;
        int i3;
        int i4;
        int[] iArr3;
        int[] iArr4;
        int i5;
        int i6;
        int i7;
        int[] iArr5;
        int[] iArr6;
        int i8;
        int[] iArr7;
        boolean z2;
        int i9;
        int i10;
        float f;
        int i11;
        List listEmptyList;
        List list;
        int[] iArr8;
        int[] iArr9;
        int mainAxisSizeWithSpacings;
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        boolean z5;
        List<Integer> list2;
        boolean z6;
        boolean z7;
        boolean z8;
        int i12;
        int i13;
        LazyStaggeredGridMeasureResult2 lazyStaggeredGridMeasureResult2;
        int index;
        int iMin;
        ArrayList arrayList2;
        boolean z9;
        LazyStaggeredGridMeasureResult2 lazyStaggeredGridMeasureResult22;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int[] gaps;
        String str;
        int i17;
        final LazyStaggeredGridMeasure lazyStaggeredGridMeasure2 = lazyStaggeredGridMeasure;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasure2.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasure2.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasure2.getLaneCount() == 0) {
            int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(lazyStaggeredGridMeasure.getConstraints());
            int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(lazyStaggeredGridMeasure.getConstraints());
            lazyStaggeredGridMeasure.getState().getItemAnimator$foundation_release().onMeasured(0, iM7977getMinWidthimpl, iM7976getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasure.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasure.getMeasuredItemProvider(), lazyStaggeredGridMeasure.getIsVertical(), measureScope.isLookingAhead(), lazyStaggeredGridMeasure.getLaneCount(), lazyStaggeredGridMeasure.getIsInLookaheadScope(), 0, 0, lazyStaggeredGridMeasure.getCoroutineScope(), lazyStaggeredGridMeasure.getGraphicsContext());
            if (!measureScope.isLookingAhead()) {
                long jM5257getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasure.getState().getItemAnimator$foundation_release().m5257getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m8058equalsimpl0(jM5257getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
                    iM7977getMinWidthimpl = Constraints2.m7990constrainWidthK40F9xA(lazyStaggeredGridMeasure.getConstraints(), (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    iM7976getMinHeightimpl = Constraints2.m7989constrainHeightK40F9xA(lazyStaggeredGridMeasure.getConstraints(), (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, iM7977getMinWidthimpl, iM7976getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), 0.0f, false, lazyStaggeredGridMeasure.getIsVertical(), false, lazyStaggeredGridMeasure.getResolvedSlots(), lazyStaggeredGridMeasure.getItemProvider().getSpanProvider(), measureScope, itemCount, CollectionsKt.emptyList(), IntSize.m8056constructorimpl((Constraints.m7977getMinWidthimpl(lazyStaggeredGridMeasure.getConstraints()) << 32) | (Constraints.m7976getMinHeightimpl(lazyStaggeredGridMeasure.getConstraints()) & 4294967295L)), -lazyStaggeredGridMeasure.getBeforeContentPadding(), lazyStaggeredGridMeasure.getMainAxisAvailableSize() + lazyStaggeredGridMeasure.getAfterContentPadding(), lazyStaggeredGridMeasure.getBeforeContentPadding(), lazyStaggeredGridMeasure.getAfterContentPadding(), lazyStaggeredGridMeasure.getMainAxisSpacing(), lazyStaggeredGridMeasure.getCoroutineScope(), null);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        String str2 = "copyOf(...)";
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "copyOf(...)");
        ensureIndicesInRange(lazyStaggeredGridMeasure2, iArrCopyOf, itemCount);
        offsetBy(iArrCopyOf2, -i);
        int laneCount = lazyStaggeredGridMeasure2.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i18 = 0; i18 < laneCount; i18++) {
            arrayDequeArr[i18] = new ArrayDeque(16);
        }
        offsetBy(iArrCopyOf2, -lazyStaggeredGridMeasure2.getBeforeContentPadding());
        boolean z12 = false;
        while (true) {
            if (!measure$lambda$43$hasSpaceBeforeFirst(iArrCopyOf, iArrCopyOf2, lazyStaggeredGridMeasure2)) {
                i2 = 0;
                iIndexOf = -1;
                break;
            }
            iIndexOf = indexOfMaxValue(iArrCopyOf);
            int i19 = iArrCopyOf[iIndexOf];
            int length = iArrCopyOf2.length;
            for (int i20 = 0; i20 < length; i20++) {
                if (iArrCopyOf[i20] != iArrCopyOf[iIndexOf]) {
                    int i21 = iArrCopyOf2[i20];
                    int i22 = iArrCopyOf2[iIndexOf];
                    if (i21 < i22) {
                        iArrCopyOf2[i20] = i22;
                    }
                }
            }
            i2 = 0;
            int iFindPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasure2, i19, iIndexOf);
            if (iFindPreviousItemIndex < 0) {
                break;
            }
            long jM5283getSpanRangelOCCd4c = lazyStaggeredGridMeasure2.m5283getSpanRangelOCCd4c(lazyStaggeredGridMeasure2.getItemProvider(), iFindPreviousItemIndex, iIndexOf);
            int i23 = (int) (jM5283getSpanRangelOCCd4c & 4294967295L);
            int i24 = (int) (jM5283getSpanRangelOCCd4c >> 32);
            int i25 = i23 - i24;
            ArrayDeque[] arrayDequeArr2 = arrayDequeArr;
            lazyStaggeredGridMeasure2.getLaneInfo().setLane(iFindPreviousItemIndex, i25 != 1 ? -2 : i24);
            LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ = lazyStaggeredGridMeasure2.getMeasuredItemProvider().m5290getAndMeasurejy6DScQ(iFindPreviousItemIndex, jM5283getSpanRangelOCCd4c);
            int iM5285maxInRangejy6DScQ = m5285maxInRangejy6DScQ(iArrCopyOf2, jM5283getSpanRangelOCCd4c);
            int[] gaps2 = i25 != 1 ? lazyStaggeredGridMeasure2.getLaneInfo().getGaps(iFindPreviousItemIndex) : null;
            while (i24 < i23) {
                iArrCopyOf[i24] = iFindPreviousItemIndex;
                int mainAxisSizeWithSpacings2 = iM5285maxInRangejy6DScQ + lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i24]);
                iArrCopyOf2[i24] = mainAxisSizeWithSpacings2;
                if (lazyStaggeredGridMeasure2.getMainAxisAvailableSize() + mainAxisSizeWithSpacings2 <= 0) {
                    z12 = true;
                }
                i24++;
            }
            arrayDequeArr = arrayDequeArr2;
        }
        ArrayDeque[] arrayDequeArr3 = arrayDequeArr;
        int i26 = -lazyStaggeredGridMeasure2.getBeforeContentPadding();
        int i27 = iArrCopyOf2[i2];
        if (i27 < i26) {
            offsetBy(iArrCopyOf2, i26 - i27);
            i3 = i - (i26 - i27);
        } else {
            i3 = i;
        }
        offsetBy(iArrCopyOf2, lazyStaggeredGridMeasure2.getBeforeContentPadding());
        int i28 = -1;
        if (iIndexOf == -1) {
            iIndexOf = ArraysKt.indexOf(iArrCopyOf, i2);
        }
        if (iIndexOf != -1 && measure$lambda$43$misalignedStart(iArrCopyOf, lazyStaggeredGridMeasure2, iArrCopyOf2, iIndexOf) && z) {
            lazyStaggeredGridMeasure2.getLaneInfo().reset();
            int length2 = iArrCopyOf.length;
            int[] iArr10 = new int[length2];
            int i29 = 0;
            while (i29 < length2) {
                iArr10[i29] = i28;
                i29++;
                i28 = -1;
            }
            int length3 = iArrCopyOf2.length;
            int[] iArr11 = new int[length3];
            for (int i30 = 0; i30 < length3; i30++) {
                iArr11[i30] = iArrCopyOf2[iIndexOf];
            }
            return measure(lazyStaggeredGridMeasure2, i3, iArr10, iArr11, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "copyOf(...)");
        int length4 = iArrCopyOf2.length;
        int[] iArr12 = new int[length4];
        for (int i31 = 0; i31 < length4; i31++) {
            iArr12[i31] = -iArrCopyOf2[i31];
        }
        int mainAxisSpacing = i26 + lazyStaggeredGridMeasure2.getMainAxisSpacing();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasure2.getMainAxisAvailableSize() + lazyStaggeredGridMeasure2.getAfterContentPadding(), 0);
        boolean z13 = z12;
        int iIndexOfMinValue$default = indexOfMinValue$default(iArrCopyOf3, 0, 1, null);
        int laneCount2 = 0;
        boolean z14 = z13;
        for (int i32 = -1; iIndexOfMinValue$default != i32 && laneCount2 < lazyStaggeredGridMeasure2.getLaneCount(); i32 = -1) {
            int i33 = iArrCopyOf3[iIndexOfMinValue$default];
            int iIndexOfMinValue = indexOfMinValue(iArrCopyOf3, i33);
            laneCount2++;
            if (i33 >= 0) {
                long jM5283getSpanRangelOCCd4c2 = lazyStaggeredGridMeasure2.m5283getSpanRangelOCCd4c(lazyStaggeredGridMeasure2.getItemProvider(), i33, iIndexOfMinValue$default);
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
                LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasure2.getMeasuredItemProvider().m5290getAndMeasurejy6DScQ(i33, jM5283getSpanRangelOCCd4c2);
                LazyStaggeredGridLaneInfo laneInfo = lazyStaggeredGridMeasure2.getLaneInfo();
                int i34 = i3;
                int[] iArr13 = iArrCopyOf;
                int i35 = (int) (jM5283getSpanRangelOCCd4c2 & 4294967295L);
                int[] iArr14 = iArrCopyOf2;
                int i36 = (int) (jM5283getSpanRangelOCCd4c2 >> 32);
                int i37 = i35 - i36;
                if (i37 != 1) {
                    str = str2;
                    i17 = -2;
                } else {
                    str = str2;
                    i17 = i36;
                }
                laneInfo.setLane(i33, i17);
                int iM5285maxInRangejy6DScQ2 = m5285maxInRangejy6DScQ(iArr12, jM5283getSpanRangelOCCd4c2);
                for (int i38 = i36; i38 < i35; i38++) {
                    iArr12[i38] = lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + iM5285maxInRangejy6DScQ2;
                    iArrCopyOf3[i38] = i33;
                    arrayDequeArr3[i38].addLast(lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ2);
                }
                if (iM5285maxInRangejy6DScQ2 < mainAxisSpacing && iArr12[i36] <= mainAxisSpacing) {
                    lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ2.setVisible(false);
                    z14 = true;
                }
                laneCount2 = i37 != 1 ? lazyStaggeredGridMeasure2.getLaneCount() : laneCount2;
                iIndexOfMinValue$default = iIndexOfMinValue;
                measureScope = lazyLayoutMeasureScope;
                iArrCopyOf = iArr13;
                i3 = i34;
                iArrCopyOf2 = iArr14;
                str2 = str;
            } else {
                iIndexOfMinValue$default = iIndexOfMinValue;
            }
        }
        String str3 = str2;
        int i39 = i3;
        int[] iArr15 = iArrCopyOf;
        int[] iArr16 = iArrCopyOf2;
        final LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
        loop9: while (true) {
            int i40 = 0;
            while (true) {
                if (i40 >= length4) {
                    for (int i41 = 0; i41 < laneCount; i41++) {
                        if (!arrayDequeArr3[i41].isEmpty()) {
                            i4 = 1;
                            break loop9;
                        }
                    }
                } else {
                    int i42 = iArr12[i40];
                    if (i42 < iCoerceAtLeast || i42 <= 0) {
                        break;
                    }
                    i40++;
                }
            }
            i4 = 1;
            int iIndexOfMinValue$default2 = indexOfMinValue$default(iArr12, 0, 1, null);
            int iMaxOrThrow = ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
            if (iMaxOrThrow >= itemCount) {
                break;
            }
            int i43 = iCoerceAtLeast;
            int[] iArr17 = iArr12;
            boolean z15 = z14;
            int i44 = i39;
            int[] iArr18 = iArr16;
            int i45 = laneCount;
            LazyStaggeredGridMeasure lazyStaggeredGridMeasure3 = lazyStaggeredGridMeasure2;
            ArrayDeque[] arrayDequeArr4 = arrayDequeArr3;
            long jM5283getSpanRangelOCCd4c3 = lazyStaggeredGridMeasure3.m5283getSpanRangelOCCd4c(lazyStaggeredGridMeasure3.getItemProvider(), iMaxOrThrow, iIndexOfMinValue$default2);
            LazyStaggeredGridLaneInfo laneInfo2 = lazyStaggeredGridMeasure3.getLaneInfo();
            int i46 = (int) (jM5283getSpanRangelOCCd4c3 & 4294967295L);
            int i47 = (int) (jM5283getSpanRangelOCCd4c3 >> 32);
            int i48 = i46 - i47;
            laneInfo2.setLane(iMaxOrThrow, i48 != 1 ? -2 : i47);
            LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasure.getMeasuredItemProvider().m5290getAndMeasurejy6DScQ(iMaxOrThrow, jM5283getSpanRangelOCCd4c3);
            int iM5285maxInRangejy6DScQ3 = m5285maxInRangejy6DScQ(iArr17, jM5283getSpanRangelOCCd4c3);
            if (i48 != 1) {
                gaps = lazyStaggeredGridMeasure.getLaneInfo().getGaps(iMaxOrThrow);
                if (gaps == null) {
                    gaps = new int[lazyStaggeredGridMeasure.getLaneCount()];
                }
            } else {
                gaps = null;
            }
            for (int i49 = i47; i49 < i46; i49++) {
                if (gaps != null) {
                    gaps[i49] = iM5285maxInRangejy6DScQ3 - iArr17[i49];
                }
                iArrCopyOf3[i49] = iMaxOrThrow;
                iArr17[i49] = iM5285maxInRangejy6DScQ3 + lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings();
                arrayDequeArr4[i49].addLast(lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasure.getLaneInfo().setGaps(iMaxOrThrow, gaps);
            if (iM5285maxInRangejy6DScQ3 < mainAxisSpacing && iArr17[i47] <= mainAxisSpacing) {
                lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ3.setVisible(false);
            }
            arrayDequeArr3 = arrayDequeArr4;
            iArr12 = iArr17;
            z14 = z15;
            iCoerceAtLeast = i43;
            laneCount = i45;
            iArr16 = iArr18;
            lazyStaggeredGridMeasure2 = lazyStaggeredGridMeasure;
            i39 = i44;
        }
        int i50 = 0;
        while (i50 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr3[i50];
            while (arrayDeque.size() > i4 && !((LazyStaggeredGridMeasure7) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7 = (LazyStaggeredGridMeasure7) arrayDeque.removeFirst();
                int[] gaps3 = lazyStaggeredGridMeasure7.getSpan() != i4 ? lazyStaggeredGridMeasure2.getLaneInfo().getGaps(lazyStaggeredGridMeasure7.getIndex()) : null;
                iArr16[i50] = iArr16[i50] - (lazyStaggeredGridMeasure7.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i50]));
                i4 = 1;
            }
            LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure72 = (LazyStaggeredGridMeasure7) arrayDeque.firstOrNull();
            iArr15[i50] = lazyStaggeredGridMeasure72 != null ? lazyStaggeredGridMeasure72.getIndex() : -1;
            i50++;
            i4 = 1;
        }
        int length5 = iArrCopyOf3.length;
        int i51 = 0;
        while (true) {
            if (i51 >= length5) {
                break;
            }
            if (iArrCopyOf3[i51] == itemCount - 1) {
                offsetBy(iArr12, -lazyStaggeredGridMeasure2.getMainAxisSpacing());
                break;
            }
            i51++;
        }
        int i52 = 0;
        while (true) {
            if (i52 >= length4) {
                int mainAxisAvailableSize = lazyStaggeredGridMeasure2.getMainAxisAvailableSize() - iArr12[indexOfMaxValue(iArr12)];
                iArr3 = iArr16;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr12, mainAxisAvailableSize);
                boolean z16 = false;
                loop31: while (true) {
                    int length6 = iArr3.length;
                    int i53 = 0;
                    while (true) {
                        if (i53 >= length6) {
                            iArr4 = iArr15;
                            break loop31;
                        }
                        if (iArr3[i53] < lazyStaggeredGridMeasure2.getBeforeContentPadding()) {
                            break;
                        }
                        i53++;
                    }
                    mainAxisAvailableSize = i9;
                    iArr15 = iArr6;
                    i39 = i8;
                    z16 = z2;
                    iArr12 = iArr7;
                    iCoerceAtLeast = i10;
                }
                i5 = i39;
                int i54 = mainAxisAvailableSize;
                i6 = iCoerceAtLeast;
                int[] iArr19 = iArr12;
                if (z16 && z) {
                    lazyStaggeredGridMeasure2.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasure2, i5, iArr4, iArr3, false);
                }
                i7 = i5 + i54;
                int i55 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i55 < 0) {
                    i7 += i55;
                    iArr5 = iArr19;
                    offsetBy(iArr5, i55);
                    offsetBy(iArr3, -i55);
                } else {
                    iArr5 = iArr19;
                }
            } else {
                if (iArr12[i52] >= lazyStaggeredGridMeasure2.getMainAxisAvailableSize()) {
                    i6 = iCoerceAtLeast;
                    iArr5 = iArr12;
                    iArr4 = iArr15;
                    i7 = i39;
                    i5 = i7;
                    iArr3 = iArr16;
                    break;
                }
                i52++;
            }
        }
        float fScrollToBeConsumed$foundation_release = lazyStaggeredGridMeasure2.getState().scrollToBeConsumed$foundation_release(lazyLayoutMeasureScope2.isLookingAhead());
        float f2 = (MathKt.getSign(Math.round(fScrollToBeConsumed$foundation_release)) != MathKt.getSign(i7) || Math.abs(Math.round(fScrollToBeConsumed$foundation_release)) < Math.abs(i7)) ? fScrollToBeConsumed$foundation_release : i7;
        float f3 = fScrollToBeConsumed$foundation_release - f2;
        float f4 = 0.0f;
        if (lazyLayoutMeasureScope2.isLookingAhead() && i7 > i5 && f3 <= 0.0f) {
            f4 = (i7 - i5) + f3;
        }
        float f5 = f4;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, str3);
        int length7 = iArrCopyOf4.length;
        for (int i56 = 0; i56 < length7; i56++) {
            iArrCopyOf4[i56] = -iArrCopyOf4[i56];
        }
        if (lazyStaggeredGridMeasure2.getBeforeContentPadding() > lazyStaggeredGridMeasure2.getMainAxisSpacing()) {
            int i57 = 0;
            while (i57 < laneCount) {
                ArrayDeque arrayDeque2 = arrayDequeArr3[i57];
                int size = arrayDeque2.size();
                int i58 = 0;
                while (true) {
                    if (i58 >= size) {
                        i15 = i57;
                        break;
                    }
                    LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure73 = (LazyStaggeredGridMeasure7) arrayDeque2.get(i58);
                    i15 = i57;
                    int[] gaps4 = lazyStaggeredGridMeasure2.getLaneInfo().getGaps(lazyStaggeredGridMeasure73.getIndex());
                    int mainAxisSizeWithSpacings3 = lazyStaggeredGridMeasure73.getMainAxisSizeWithSpacings() + (gaps4 == null ? 0 : gaps4[i15]);
                    if (i58 == CollectionsKt.getLastIndex(arrayDeque2) || (i16 = iArr3[i15]) == 0 || i16 < mainAxisSizeWithSpacings3) {
                        break;
                    }
                    iArr3[i15] = i16 - mainAxisSizeWithSpacings3;
                    i58++;
                    iArr4[i15] = ((LazyStaggeredGridMeasure7) arrayDeque2.get(i58)).getIndex();
                    i57 = i15;
                }
                i57 = i15 + 1;
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasure2.getBeforeContentPadding() + lazyStaggeredGridMeasure2.getAfterContentPadding();
        int iM7975getMaxWidthimpl = lazyStaggeredGridMeasure2.getIsVertical() ? Constraints.m7975getMaxWidthimpl(lazyStaggeredGridMeasure2.getConstraints()) : Constraints2.m7990constrainWidthK40F9xA(lazyStaggeredGridMeasure2.getConstraints(), ArraysKt.maxOrThrow(iArr5) + beforeContentPadding);
        int iM7989constrainHeightK40F9xA = lazyStaggeredGridMeasure2.getIsVertical() ? Constraints2.m7989constrainHeightK40F9xA(lazyStaggeredGridMeasure2.getConstraints(), ArraysKt.maxOrThrow(iArr5) + beforeContentPadding) : Constraints.m7974getMaxHeightimpl(lazyStaggeredGridMeasure2.getConstraints());
        int iMin2 = (Math.min(lazyStaggeredGridMeasure2.getIsVertical() ? iM7989constrainHeightK40F9xA : iM7975getMaxWidthimpl, lazyStaggeredGridMeasure2.getMainAxisAvailableSize()) - lazyStaggeredGridMeasure2.getBeforeContentPadding()) + lazyStaggeredGridMeasure2.getAfterContentPadding();
        int i59 = iArrCopyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasure2.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            int i60 = size2;
            int mainAxisSizeWithSpacings4 = i59;
            listEmptyList = null;
            while (true) {
                int i61 = i60 - 1;
                int iIntValue = pinnedItems.get(i60).intValue();
                f = f2;
                int lane = lazyStaggeredGridMeasure2.getLaneInfo().getLane(iIntValue);
                List list3 = listEmptyList;
                if (lane == -2 || lane == -1) {
                    for (int i62 = 0; i62 < laneCount; i62++) {
                        LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure74 = (LazyStaggeredGridMeasure7) arrayDequeArr3[i62].firstOrNull();
                        if (!((lazyStaggeredGridMeasure74 != null ? lazyStaggeredGridMeasure74.getIndex() : -1) > iIntValue)) {
                            z11 = false;
                            break;
                        }
                    }
                    z11 = true;
                } else {
                    LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure75 = (LazyStaggeredGridMeasure7) arrayDequeArr3[lane].firstOrNull();
                    if ((lazyStaggeredGridMeasure75 != null ? lazyStaggeredGridMeasure75.getIndex() : -1) <= iIntValue) {
                        z11 = false;
                        break;
                    }
                    z11 = true;
                }
                if (z11) {
                    i14 = laneCount;
                    i11 = beforeContentPadding;
                    long jM5283getSpanRangelOCCd4c4 = lazyStaggeredGridMeasure2.m5283getSpanRangelOCCd4c(lazyStaggeredGridMeasure2.getItemProvider(), iIntValue, 0);
                    List arrayList3 = list3 == null ? new ArrayList() : list3;
                    LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasure2.getMeasuredItemProvider().m5290getAndMeasurejy6DScQ(iIntValue, jM5283getSpanRangelOCCd4c4);
                    mainAxisSizeWithSpacings4 -= lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings();
                    lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ4.position(mainAxisSizeWithSpacings4, 0, iMin2);
                    arrayList3.add(lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ4);
                    listEmptyList = arrayList3;
                } else {
                    i14 = laneCount;
                    i11 = beforeContentPadding;
                    listEmptyList = list3;
                }
                if (i61 < 0) {
                    break;
                }
                f2 = f;
                i60 = i61;
                laneCount = i14;
                beforeContentPadding = i11;
            }
        } else {
            f = f2;
            i11 = beforeContentPadding;
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        float f6 = f;
        List list4 = listEmptyList;
        int i63 = i6;
        List<LazyStaggeredGridMeasure7> listCalculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasure2, arrayDequeArr3, iArrCopyOf4, iMin2, i26, i63);
        int i64 = iArrCopyOf4[0];
        LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure76 = (LazyStaggeredGridMeasure7) CollectionsKt.lastOrNull((List) listCalculateVisibleItems);
        int index2 = lazyStaggeredGridMeasure76 != null ? lazyStaggeredGridMeasure76.getIndex() : -1;
        if (!lazyLayoutMeasureScope2.isLookingAhead() || lazyStaggeredGridMeasure2.getApproachLayoutInfo() == null || lazyStaggeredGridMeasure2.getApproachLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            list = list4;
            iArr8 = iArr3;
            iArr9 = iArr4;
            mainAxisSizeWithSpacings = i64;
            arrayList = null;
        } else {
            List<LazyStaggeredGridMeasureResult2> visibleItemsInfo = lazyStaggeredGridMeasure2.getApproachLayoutInfo().getVisibleItemsInfo();
            for (int size3 = visibleItemsInfo.size() - 1; -1 < size3; size3--) {
                if (visibleItemsInfo.get(size3).getIndex() > index2 && (size3 == 0 || visibleItemsInfo.get(size3 - 1).getIndex() <= index2)) {
                    lazyStaggeredGridMeasureResult2 = visibleItemsInfo.get(size3);
                    break;
                }
            }
            lazyStaggeredGridMeasureResult2 = null;
            LazyStaggeredGridMeasureResult2 lazyStaggeredGridMeasureResult23 = (LazyStaggeredGridMeasureResult2) CollectionsKt.last((List) lazyStaggeredGridMeasure2.getApproachLayoutInfo().getVisibleItemsInfo());
            if (lazyStaggeredGridMeasureResult2 != null && (index = lazyStaggeredGridMeasureResult2.getIndex()) <= (iMin = Math.min(lazyStaggeredGridMeasureResult23.getIndex(), itemCount - 1))) {
                int i65 = index;
                mainAxisSizeWithSpacings = i64;
                arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        list = list4;
                        int i66 = 0;
                        while (true) {
                            if (i66 >= size4) {
                                arrayList2 = arrayList;
                                z10 = false;
                                break;
                            }
                            arrayList2 = arrayList;
                            if (((LazyStaggeredGridMeasure7) arrayList.get(i66)).getIndex() == i65) {
                                z10 = true;
                                break;
                            }
                            i66++;
                            arrayList = arrayList2;
                        }
                        z9 = z10;
                        if (z9) {
                            arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                            List<LazyStaggeredGridMeasureResult2> visibleItemsInfo2 = lazyStaggeredGridMeasure2.getApproachLayoutInfo().getVisibleItemsInfo();
                            int size5 = visibleItemsInfo2.size();
                            iArr8 = iArr3;
                            int i67 = 0;
                            while (true) {
                                if (i67 >= size5) {
                                    lazyStaggeredGridMeasureResult22 = null;
                                    break;
                                }
                                lazyStaggeredGridMeasureResult22 = visibleItemsInfo2.get(i67);
                                List<LazyStaggeredGridMeasureResult2> list5 = visibleItemsInfo2;
                                if (lazyStaggeredGridMeasureResult22.getIndex() == i65) {
                                    break;
                                }
                                i67++;
                                visibleItemsInfo2 = list5;
                            }
                            LazyStaggeredGridMeasureResult2 lazyStaggeredGridMeasureResult24 = lazyStaggeredGridMeasureResult22;
                            int lane2 = lazyStaggeredGridMeasureResult24 != null ? lazyStaggeredGridMeasureResult24.getLane() : 0;
                            iArr9 = iArr4;
                            LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasure2.getMeasuredItemProvider().m5290getAndMeasurejy6DScQ(i65, lazyStaggeredGridMeasure2.m5283getSpanRangelOCCd4c(lazyStaggeredGridMeasure2.getItemProvider(), i65, lane2));
                            arrayList.add(lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ5);
                            int[] positions = lazyStaggeredGridMeasure2.getResolvedSlots().getPositions();
                            lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ5.position(mainAxisSizeWithSpacings, positions.length > lane2 ? positions[lane2] : 0, iMin2);
                            mainAxisSizeWithSpacings += lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                        } else {
                            iArr8 = iArr3;
                            iArr9 = iArr4;
                            arrayList = arrayList2;
                        }
                        if (i65 != iMin) {
                            break;
                        }
                        i65++;
                        list4 = list;
                        iArr3 = iArr8;
                        iArr4 = iArr9;
                    } else {
                        arrayList2 = arrayList;
                        list = list4;
                    }
                    if (z9) {
                    }
                    if (i65 != iMin) {
                    }
                }
            }
        }
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasure2.getPinnedItems();
        int size6 = pinnedItems2.size();
        int i68 = 0;
        List listEmptyList2 = null;
        while (i68 < size6) {
            int iIntValue2 = pinnedItems2.get(i68).intValue();
            if (iIntValue2 >= itemCount) {
                list2 = pinnedItems2;
            } else {
                if (arrayList != null) {
                    int size7 = arrayList.size();
                    int i69 = 0;
                    while (true) {
                        if (i69 >= size7) {
                            list2 = pinnedItems2;
                            z8 = false;
                            break;
                        }
                        list2 = pinnedItems2;
                        if (((LazyStaggeredGridMeasure7) arrayList.get(i69)).getIndex() == iIntValue2) {
                            z8 = true;
                            break;
                        }
                        i69++;
                        pinnedItems2 = list2;
                    }
                    z6 = z8;
                    if (!z6) {
                        z7 = false;
                        break;
                    }
                    int lane3 = lazyStaggeredGridMeasure2.getLaneInfo().getLane(iIntValue2);
                    if (lane3 == -2 || lane3 == -1) {
                        for (int i70 : iArrCopyOf3) {
                            if (i70 < iIntValue2) {
                            }
                        }
                        z7 = true;
                    } else {
                        if (iArrCopyOf3[lane3] >= iIntValue2) {
                            z7 = false;
                            break;
                        }
                        z7 = true;
                    }
                    if (z7) {
                        i12 = size6;
                        long jM5283getSpanRangelOCCd4c5 = lazyStaggeredGridMeasure2.m5283getSpanRangelOCCd4c(lazyStaggeredGridMeasure2.getItemProvider(), iIntValue2, 0);
                        if (listEmptyList2 == null) {
                            listEmptyList2 = new ArrayList();
                        }
                        i13 = i68;
                        List list6 = listEmptyList2;
                        LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ6 = lazyStaggeredGridMeasure2.getMeasuredItemProvider().m5290getAndMeasurejy6DScQ(iIntValue2, jM5283getSpanRangelOCCd4c5);
                        lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ6.position(mainAxisSizeWithSpacings, 0, iMin2);
                        mainAxisSizeWithSpacings += lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ6.getMainAxisSizeWithSpacings();
                        list6.add(lazyStaggeredGridMeasure7M5290getAndMeasurejy6DScQ6);
                        listEmptyList2 = list6;
                    } else {
                        i12 = size6;
                        i13 = i68;
                    }
                    i68 = i13 + 1;
                    pinnedItems2 = list2;
                    size6 = i12;
                } else {
                    list2 = pinnedItems2;
                }
                if (!z6) {
                    z7 = false;
                    break;
                }
                if (z7) {
                }
                i68 = i13 + 1;
                pinnedItems2 = list2;
                size6 = i12;
            }
            z7 = false;
            if (z7) {
            }
            i68 = i13 + 1;
            pinnedItems2 = list2;
            size6 = i12;
        }
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(list);
        arrayList4.addAll(listCalculateVisibleItems);
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        arrayList4.addAll(listEmptyList2);
        lazyStaggeredGridMeasure2.getState().getItemAnimator$foundation_release().onMeasured((int) f6, iM7975getMaxWidthimpl, iM7989constrainHeightK40F9xA, arrayList4, lazyStaggeredGridMeasure2.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasure2.getMeasuredItemProvider(), lazyStaggeredGridMeasure2.getIsVertical(), lazyLayoutMeasureScope2.isLookingAhead(), lazyStaggeredGridMeasure2.getLaneCount(), lazyStaggeredGridMeasure2.getIsInLookaheadScope(), ArraysKt.minOrThrow(iArr8), ArraysKt.maxOrThrow(iArr5) + i11, lazyStaggeredGridMeasure2.getCoroutineScope(), lazyStaggeredGridMeasure2.getGraphicsContext());
        int i71 = iM7975getMaxWidthimpl;
        int i72 = iM7989constrainHeightK40F9xA;
        if (!lazyLayoutMeasureScope2.isLookingAhead()) {
            long jM5257getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasure2.getState().getItemAnimator$foundation_release().m5257getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m8058equalsimpl0(jM5257getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
                int i73 = lazyStaggeredGridMeasure2.getIsVertical() ? i72 : i71;
                int iM7990constrainWidthK40F9xA = Constraints2.m7990constrainWidthK40F9xA(lazyStaggeredGridMeasure2.getConstraints(), Math.max(i71, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                int iM7989constrainHeightK40F9xA2 = Constraints2.m7989constrainHeightK40F9xA(lazyStaggeredGridMeasure2.getConstraints(), Math.max(i72, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                int i74 = lazyStaggeredGridMeasure2.getIsVertical() ? iM7989constrainHeightK40F9xA2 : iM7990constrainWidthK40F9xA;
                if (i74 != i73) {
                    int size8 = arrayList4.size();
                    for (int i75 = 0; i75 < size8; i75++) {
                        ((LazyStaggeredGridMeasure7) arrayList4.get(i75)).updateMainAxisLayoutSize(i74);
                    }
                }
                i71 = iM7990constrainWidthK40F9xA;
                i72 = iM7989constrainHeightK40F9xA2;
            }
        }
        int i76 = 0;
        while (true) {
            if (i76 >= length4) {
                z3 = false;
                break;
            }
            if (iArr5[i76] > lazyStaggeredGridMeasure2.getMainAxisAvailableSize()) {
                z3 = true;
                break;
            }
            i76++;
        }
        if (!z3) {
            int length8 = iArrCopyOf3.length;
            int i77 = 0;
            while (true) {
                if (i77 >= length8) {
                    z5 = true;
                    break;
                }
                if (!(iArrCopyOf3[i77] < itemCount + (-1))) {
                    z5 = false;
                    break;
                }
                i77++;
            }
            z4 = z5;
        }
        return new LazyStaggeredGridMeasureResult(iArr9, iArr8, f6, MeasureScope.layout$default(lazyLayoutMeasureScope2, i71, i72, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                final List<LazyStaggeredGridMeasure7> list7 = arrayList4;
                final LazyStaggeredGridMeasure lazyStaggeredGridMeasure4 = lazyStaggeredGridMeasure2;
                final LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope2;
                placementScope.withMotionFrameOfReferencePlacement(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope2) {
                        invoke2(placementScope2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope2) {
                        List<LazyStaggeredGridMeasure7> list8 = list7;
                        LazyStaggeredGridMeasure lazyStaggeredGridMeasure5 = lazyStaggeredGridMeasure4;
                        LazyLayoutMeasureScope lazyLayoutMeasureScope4 = lazyLayoutMeasureScope3;
                        int size9 = list8.size();
                        for (int i78 = 0; i78 < size9; i78++) {
                            list8.get(i78).place(placementScope2, lazyStaggeredGridMeasure5, lazyLayoutMeasureScope4.isLookingAhead());
                        }
                    }
                });
                ObservableScopeInvalidator.m5266attachToScopeimpl(lazyStaggeredGridMeasure2.getState().m5293getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), f5, z4, lazyStaggeredGridMeasure.getIsVertical(), z14, lazyStaggeredGridMeasure.getResolvedSlots(), lazyStaggeredGridMeasure.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope2, itemCount, listCalculateVisibleItems, IntSize.m8056constructorimpl((i71 << 32) | (i72 & 4294967295L)), i26, i63, lazyStaggeredGridMeasure.getBeforeContentPadding(), lazyStaggeredGridMeasure.getAfterContentPadding(), lazyStaggeredGridMeasure.getMainAxisSpacing(), lazyStaggeredGridMeasure.getCoroutineScope(), null);
    }

    private static final boolean measure$lambda$43$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasure lazyStaggeredGridMeasure) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasure.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$43$misalignedStart(int[] iArr, LazyStaggeredGridMeasure lazyStaggeredGridMeasure, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasure, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasure, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasure.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasure7> calculateVisibleItems(LazyStaggeredGridMeasure lazyStaggeredGridMeasure, ArrayDeque<LazyStaggeredGridMeasure7>[] arrayDequeArr, int[] iArr, int i, int i2, int i3) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasure7> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasure7> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i4 = -1;
                    int i5 = Integer.MAX_VALUE;
                    for (int i6 = 0; i6 < length; i6++) {
                        LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7FirstOrNull = arrayDequeArr[i6].firstOrNull();
                        int index = lazyStaggeredGridMeasure7FirstOrNull != null ? lazyStaggeredGridMeasure7FirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i5 > index) {
                            i4 = i6;
                            i5 = index;
                        }
                    }
                    LazyStaggeredGridMeasure7 lazyStaggeredGridMeasure7RemoveFirst = arrayDequeArr[i4].removeFirst();
                    if (lazyStaggeredGridMeasure7RemoveFirst.getLane() == i4) {
                        long jM5294constructorimpl = LazyStaggeredGridMeasure8.m5294constructorimpl(lazyStaggeredGridMeasure7RemoveFirst.getLane(), lazyStaggeredGridMeasure7RemoveFirst.getSpan());
                        int iM5285maxInRangejy6DScQ = m5285maxInRangejy6DScQ(iArr, jM5294constructorimpl);
                        int i7 = lazyStaggeredGridMeasure.getResolvedSlots().getPositions()[i4];
                        if (lazyStaggeredGridMeasure7RemoveFirst.getMainAxisSize() + iM5285maxInRangejy6DScQ >= i2 && iM5285maxInRangejy6DScQ <= i3) {
                            lazyStaggeredGridMeasure7RemoveFirst.position(iM5285maxInRangejy6DScQ, i7, i);
                            arrayList.add(lazyStaggeredGridMeasure7RemoveFirst);
                        }
                        int i8 = (int) (jM5294constructorimpl & 4294967295L);
                        for (int i9 = (int) (jM5294constructorimpl >> 32); i9 < i8; i9++) {
                            iArr[i9] = lazyStaggeredGridMeasure7RemoveFirst.getMainAxisSizeWithSpacings() + iM5285maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m5285maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasure lazyStaggeredGridMeasure, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasure.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasure, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasure.isFullSpan(lazyStaggeredGridMeasure.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasure.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasure lazyStaggeredGridMeasure, int i, int i2) {
        return lazyStaggeredGridMeasure.getLaneInfo().findPreviousItemIndex(i, i2);
    }
}
