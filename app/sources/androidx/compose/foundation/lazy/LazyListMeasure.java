package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem2;
import androidx.compose.foundation.lazy.layout.LazyLayoutStickyItems;
import androidx.compose.foundation.lazy.layout.LazyLayoutStickyItems2;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.SnapshotState;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyListMeasure.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\\\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u001a4\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002\u001a\u009f\u0002\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0002002\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u00101\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2/\u0010;\u001a+\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=¢\u0006\u0002\b@\u0012\u0004\u0012\u00020A0<H\u0000ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, m3636d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "items", "", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "createItemsAfterList", "visibleItems", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "itemsCount", "beyondBoundsItemCount", "pinnedItems", "consumedScroll", "", "isLookingAhead", "lastApproachLayoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "createItemsBeforeList", "currentFirstItemIndex", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "constraints", "Landroidx/compose/ui/unit/Constraints;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "hasLookaheadOccurred", "approachLayoutInfo", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-LCrQqZ4", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.LazyListMeasureKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyListMeasure {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c1  */
    /* renamed from: measureLazyList-LCrQqZ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyListMeasureResult m5207measureLazyListLCrQqZ4(int i, final LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list, boolean z3, final boolean z4, LazyListLayoutInfo lazyListLayoutInfo, CoroutineScope coroutineScope, final SnapshotState<Unit> snapshotState, GraphicsContext graphicsContext, LazyLayoutStickyItems2 lazyLayoutStickyItems2, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer numValueOf;
        boolean z5 = true;
        if (!(i3 >= 0)) {
            InlineClassHelper.throwIllegalArgumentException("invalid beforeContentPadding");
        }
        if (!(i4 >= 0)) {
            InlineClassHelper.throwIllegalArgumentException("invalid afterContentPadding");
        }
        if (i > 0) {
            int i18 = i;
            int i19 = i6;
            if (i19 >= i18) {
                i19 = i18 - 1;
                i9 = 0;
            } else {
                i9 = i7;
            }
            int iRound = Math.round(f);
            int i20 = i9 - iRound;
            if (i19 == 0 && i20 < 0) {
                iRound += i20;
                i20 = 0;
            }
            int i21 = iRound;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i22 = -i3;
            int i23 = (i5 < 0 ? i5 : 0) + i22;
            int mainAxisSizeWithSpacings = i20 + i23;
            int iMax = 0;
            while (mainAxisSizeWithSpacings < 0 && i19 > 0) {
                int i24 = i19 - 1;
                int i25 = i23;
                LazyListMeasuredItem lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default = LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i24, 0L, 2, null);
                arrayDeque.add(0, lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default);
                iMax = Math.max(iMax, lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default.getCrossAxisSize());
                mainAxisSizeWithSpacings = lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default.getMainAxisSizeWithSpacings() + mainAxisSizeWithSpacings;
                i19 = i24;
                i23 = i25;
                i22 = i22;
                i21 = i21;
            }
            int i26 = mainAxisSizeWithSpacings;
            int i27 = i21;
            int i28 = i22;
            int i29 = i23;
            int i30 = iMax;
            if (i26 < i29) {
                i11 = i27 - (i29 - i26);
                i10 = i29;
            } else {
                i10 = i26;
                i11 = i27;
            }
            int i31 = i10 - i29;
            int i32 = i2 + i4;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i32, 0);
            int mainAxisSizeWithSpacings2 = -i31;
            int i33 = i19;
            int i34 = 0;
            boolean z6 = false;
            while (i34 < arrayDeque.size()) {
                if (mainAxisSizeWithSpacings2 >= iCoerceAtLeast) {
                    arrayDeque.remove(i34);
                    z6 = true;
                } else {
                    i33++;
                    mainAxisSizeWithSpacings2 += ((LazyListMeasuredItem) arrayDeque.get(i34)).getMainAxisSizeWithSpacings();
                    i34++;
                }
            }
            int i35 = i19;
            int i36 = i30;
            int mainAxisSizeWithSpacings3 = i31;
            int i37 = mainAxisSizeWithSpacings2;
            int i38 = i32;
            int i39 = i33;
            while (i39 < i18 && (i37 < iCoerceAtLeast || i37 <= 0 || arrayDeque.isEmpty())) {
                int i40 = i38;
                int i41 = i37;
                int i42 = iCoerceAtLeast;
                int i43 = i36;
                int i44 = i35;
                LazyListMeasuredItem lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default2 = LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i39, 0L, 2, null);
                int i45 = i39;
                int mainAxisSizeWithSpacings4 = lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings() + i41;
                if (mainAxisSizeWithSpacings4 <= i29 && i45 != i - 1) {
                    mainAxisSizeWithSpacings3 -= lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
                    i35 = i45 + 1;
                    z6 = true;
                } else {
                    int iMax2 = Math.max(i43, lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default2.getCrossAxisSize());
                    arrayDeque.add(lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default2);
                    i35 = i44;
                    i43 = iMax2;
                }
                i37 = mainAxisSizeWithSpacings4;
                i38 = i40;
                iCoerceAtLeast = i42;
                i39 = i45 + 1;
                i36 = i43;
                i18 = i;
            }
            int iMax3 = i36;
            int i46 = i39;
            int i47 = i38;
            int i48 = i35;
            int i49 = i37;
            if (i49 < i2) {
                int i50 = i2 - i49;
                mainAxisSizeWithSpacings3 -= i50;
                i49 += i50;
                i14 = i48;
                while (mainAxisSizeWithSpacings3 < i3 && i14 > 0) {
                    i14--;
                    LazyListMeasuredItem lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default3 = LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i14, 0L, 2, null);
                    arrayDeque.add(0, lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default3);
                    iMax3 = Math.max(iMax3, lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default3.getCrossAxisSize());
                    mainAxisSizeWithSpacings3 += lazyListMeasuredItemM5212getAndMeasure0kLqBqw$default3.getMainAxisSizeWithSpacings();
                    i46 = i46;
                }
                i12 = i46;
                i13 = 0;
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                i15 = i50 + i11;
                if (mainAxisSizeWithSpacings3 < 0) {
                    i15 += mainAxisSizeWithSpacings3;
                    i49 += mainAxisSizeWithSpacings3;
                    mainAxisSizeWithSpacings3 = 0;
                }
            } else {
                i12 = i46;
                i13 = 0;
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                i14 = i48;
                i15 = i11;
            }
            float f2 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(i15) || Math.abs(Math.round(f)) < Math.abs(i15)) ? f : i15;
            float f3 = f - f2;
            float f4 = 0.0f;
            if (z4 && i15 > i11 && f3 <= 0.0f) {
                f4 = (i15 - i11) + f3;
            }
            float f5 = f4;
            if ((mainAxisSizeWithSpacings3 >= 0 ? 1 : i13) == 0) {
                InlineClassHelper.throwIllegalArgumentException("negative currentFirstItemScrollOffset");
            }
            int i51 = -mainAxisSizeWithSpacings3;
            LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) arrayDeque.first();
            if (i3 > 0 || i5 < 0) {
                int size = arrayDeque.size();
                while (i13 < size) {
                    i16 = i51;
                    int mainAxisSizeWithSpacings5 = ((LazyListMeasuredItem) arrayDeque.get(i13)).getMainAxisSizeWithSpacings();
                    if (mainAxisSizeWithSpacings3 == 0 || mainAxisSizeWithSpacings5 > mainAxisSizeWithSpacings3 || i13 == CollectionsKt.getLastIndex(arrayDeque)) {
                        break;
                    }
                    mainAxisSizeWithSpacings3 -= mainAxisSizeWithSpacings5;
                    i13++;
                    lazyListMeasuredItem = (LazyListMeasuredItem) arrayDeque.get(i13);
                    i51 = i16;
                }
                i16 = i51;
            } else {
                i16 = i51;
            }
            int i52 = mainAxisSizeWithSpacings3;
            LazyListMeasuredItem lazyListMeasuredItem2 = lazyListMeasuredItem;
            List<LazyListMeasuredItem> listCreateItemsBeforeList = createItemsBeforeList(i14, lazyListMeasuredItemProvider2, i8, list);
            int size2 = listCreateItemsBeforeList.size();
            int i53 = 0;
            while (i53 < size2) {
                iMax3 = Math.max(iMax3, listCreateItemsBeforeList.get(i53).getCrossAxisSize());
                i53++;
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            }
            List<LazyListMeasuredItem> listCreateItemsAfterList = createItemsAfterList(arrayDeque, lazyListMeasuredItemProvider2, i, i8, list, f2, z4, lazyListLayoutInfo);
            int size3 = listCreateItemsAfterList.size();
            int iMax4 = iMax3;
            for (int i54 = 0; i54 < size3; i54++) {
                iMax4 = Math.max(iMax4, listCreateItemsAfterList.get(i54).getCrossAxisSize());
            }
            boolean z7 = Intrinsics.areEqual(lazyListMeasuredItem2, arrayDeque.first()) && listCreateItemsBeforeList.isEmpty() && listCreateItemsAfterList.isEmpty();
            int iM7990constrainWidthK40F9xA = Constraints2.m7990constrainWidthK40F9xA(j, z ? iMax4 : i49);
            if (z) {
                iMax4 = i49;
            }
            int iM7989constrainHeightK40F9xA = Constraints2.m7989constrainHeightK40F9xA(j, iMax4);
            float f6 = f2;
            int i55 = i49;
            final List<LazyListMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDeque, listCreateItemsBeforeList, listCreateItemsAfterList, iM7990constrainWidthK40F9xA, iM7989constrainHeightK40F9xA, i55, i2, i16, z, vertical, horizontal, z2, density);
            int iM7990constrainWidthK40F9xA2 = iM7990constrainWidthK40F9xA;
            lazyLayoutItemAnimator.onMeasured((int) f6, iM7990constrainWidthK40F9xA2, iM7989constrainHeightK40F9xA, listCalculateItemsOffsets, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, i52, i55, coroutineScope, graphicsContext);
            if (!z4) {
                long jM5257getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m5257getMinSizeToFitDisappearingItemsYbymL2g();
                if (IntSize.m8058equalsimpl0(jM5257getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
                    i17 = iM7989constrainHeightK40F9xA;
                } else {
                    int i56 = z ? iM7989constrainHeightK40F9xA : iM7990constrainWidthK40F9xA2;
                    iM7990constrainWidthK40F9xA2 = Constraints2.m7990constrainWidthK40F9xA(j, Math.max(iM7990constrainWidthK40F9xA2, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g >> 32)));
                    int iM7989constrainHeightK40F9xA2 = Constraints2.m7989constrainHeightK40F9xA(j, Math.max(iM7989constrainHeightK40F9xA, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L)));
                    int i57 = z ? iM7989constrainHeightK40F9xA2 : iM7990constrainWidthK40F9xA2;
                    if (i57 != i56) {
                        int size4 = listCalculateItemsOffsets.size();
                        for (int i58 = 0; i58 < size4; i58++) {
                            listCalculateItemsOffsets.get(i58).updateMainAxisLayoutSize(i57);
                        }
                    }
                    i17 = iM7989constrainHeightK40F9xA2;
                }
            }
            int i59 = iM7990constrainWidthK40F9xA2;
            final List listApplyStickyItems = LazyLayoutStickyItems.applyStickyItems(lazyLayoutStickyItems2, listCalculateItemsOffsets, lazyListMeasuredItemProvider.getHeaderIndexes(), i3, i4, i59, i17, new Function1<Integer, LazyListMeasuredItem>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ LazyListMeasuredItem invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final LazyListMeasuredItem invoke(int i60) {
                    return LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i60, 0L, 2, null);
                }
            });
            Integer numValueOf2 = null;
            if (z7) {
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.firstOrNull((List) listCalculateItemsOffsets);
                numValueOf = lazyListMeasuredItem3 != null ? Integer.valueOf(lazyListMeasuredItem3.getIndex()) : null;
            } else {
                LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) arrayDeque.firstOrNull();
                if (lazyListMeasuredItem4 != null) {
                    numValueOf = Integer.valueOf(lazyListMeasuredItem4.getIndex());
                }
            }
            if (z7) {
                LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) CollectionsKt.lastOrNull((List) listCalculateItemsOffsets);
                if (lazyListMeasuredItem5 != null) {
                    numValueOf2 = Integer.valueOf(lazyListMeasuredItem5.getIndex());
                }
            } else {
                LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayDeque.lastOrNull();
                if (lazyListMeasuredItem6 != null) {
                    numValueOf2 = Integer.valueOf(lazyListMeasuredItem6.getIndex());
                }
            }
            if (i12 >= i && i55 <= i2) {
                z5 = false;
            }
            return new LazyListMeasureResult(lazyListMeasuredItem2, i52, z5, f6, function3.invoke(Integer.valueOf(i59), Integer.valueOf(i17), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
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
                    final List<LazyListMeasuredItem> list2 = listCalculateItemsOffsets;
                    final List<LazyListMeasuredItem> list3 = listApplyStickyItems;
                    final boolean z8 = z4;
                    placementScope.withMotionFrameOfReferencePlacement(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
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
                            List<LazyListMeasuredItem> list4 = list2;
                            boolean z9 = z8;
                            int size5 = list4.size();
                            for (int i60 = 0; i60 < size5; i60++) {
                                list4.get(i60).place(placementScope2, z9);
                            }
                            List<LazyListMeasuredItem> list5 = list3;
                            boolean z10 = z8;
                            int size6 = list5.size();
                            for (int i61 = 0; i61 < size6; i61++) {
                                list5.get(i61).place(placementScope2, z10);
                            }
                        }
                    });
                    ObservableScopeInvalidator.m5266attachToScopeimpl(snapshotState);
                }
            }), f5, z6, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), LazyLayoutMeasuredItem2.updatedVisibleItems(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, listCalculateItemsOffsets, listApplyStickyItems), i28, i47, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
        }
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
        int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
        lazyLayoutItemAnimator.onMeasured(0, iM7977getMinWidthimpl, iM7976getMinHeightimpl, new ArrayList(), lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, 0, 0, coroutineScope, graphicsContext);
        if (!z4) {
            long jM5257getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m5257getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m8058equalsimpl0(jM5257getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
                iM7977getMinWidthimpl = Constraints2.m7990constrainWidthK40F9xA(j, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g2 >> 32));
                iM7976getMinHeightimpl = Constraints2.m7989constrainHeightK40F9xA(j, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L));
            }
        }
        return new LazyListMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(iM7977getMinWidthimpl), Integer.valueOf(iM7976getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }
        }), 0.0f, false, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i2, List<Integer> list2, float f, boolean z, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        LazyListMeasuredItem lazyListMeasuredItem2;
        int mainAxisSizeWithSpacings;
        LazyListMeasuredItem lazyListMeasuredItem3;
        int index;
        int iMin;
        LazyListMeasuredItem lazyListMeasuredItem4;
        LazyListMeasuredItem lazyListMeasuredItem5;
        int i3 = i - 1;
        int iMin2 = Math.min(((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + i2, i3);
        int index2 = ((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i4 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i4, 0L, 2, null));
                if (i4 == iMin2) {
                    break;
                }
                i4++;
            }
        } else {
            arrayList = null;
        }
        if (z && lazyListLayoutInfo != null && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() > iMin2 && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= iMin2)) {
                    break;
                }
            }
            lazyListItemInfo = visibleItemsInfo.get(size);
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (iMin = Math.min(lazyListItemInfo2.getIndex(), i3))) {
                int i5 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                            lazyListMeasuredItem5 = arrayList.get(i6);
                            if (lazyListMeasuredItem5.getIndex() == i5) {
                                break;
                            }
                            i6++;
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i5, 0L, 2, null));
                    }
                    if (i5 == iMin) {
                        break;
                    }
                    i5++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i7 = 0;
                while (index3 < i && i7 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                            lazyListMeasuredItem3 = list.get(i8);
                            if (lazyListMeasuredItem3.getIndex() == index3) {
                                break;
                            }
                            i8++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                            lazyListMeasuredItem2 = arrayList.get(i9);
                            if (lazyListMeasuredItem2.getIndex() == index3) {
                                break;
                            }
                            i9++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem2;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i7 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() > iMin2) {
            iMin2 = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i10 = 0; i10 < size5; i10++) {
            int iIntValue = list2.get(i10).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, List<Integer> list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            int i4 = i3;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i4, 0L, 2, null));
                if (i4 == iMax) {
                    break;
                }
                i4--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m5212getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, iIntValue, 0L, 2, null));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        int i7 = 0;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3) {
            if (!(i5 == 0)) {
                InlineClassHelper.throwIllegalStateException("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z3) {
            int size = list2.size();
            int mainAxisSizeWithSpacings = i5;
            for (int i8 = 0; i8 < size; i8++) {
                LazyListMeasuredItem lazyListMeasuredItem = list2.get(i8);
                mainAxisSizeWithSpacings -= lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem.position(mainAxisSizeWithSpacings, i, i2);
                arrayList.add(lazyListMeasuredItem);
            }
            int size2 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i9 = 0; i9 < size2; i9++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list.get(i9);
                lazyListMeasuredItem2.position(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(lazyListMeasuredItem2);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
            }
            int size3 = list3.size();
            while (i7 < size3) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list3.get(i7);
                lazyListMeasuredItem3.position(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
                i7++;
            }
        } else {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelper.throwIllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            while (i7 < size4) {
                iArr[i7] = list.get(calculateItemsOffsets$reverseAware(i7, z2, size4)).getSize();
                i7++;
            }
            int[] iArr2 = new int[size4];
            if (z) {
                if (vertical == null) {
                    InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                    throw new ExceptionsH();
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                    throw new ExceptionsH();
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            Progressions2 indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size5 = iArr2[first];
                    LazyListMeasuredItem lazyListMeasuredItem4 = list.get(calculateItemsOffsets$reverseAware(first, z2, size4));
                    if (z2) {
                        size5 = (i6 - size5) - lazyListMeasuredItem4.getSize();
                    }
                    lazyListMeasuredItem4.position(size5, i, i2);
                    arrayList.add(lazyListMeasuredItem4);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }
}
