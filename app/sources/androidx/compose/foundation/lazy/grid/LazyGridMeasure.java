package androidx.compose.foundation.lazy.grid;

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
import java.util.Collection;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGridMeasure.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aÜ\u0002\u0010:\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'23\u0010.\u001a/\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0-0\u001d0)2\b\u00100\u001a\u0004\u0018\u00010/2/\u00106\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030)¢\u0006\u0002\b4\u0012\u0004\u0012\u00020501H\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001aM\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\u001d2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001d2\b\u0010>\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b?\u0010@\u001a\u0093\u0001\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001a0I2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020<0\u001d2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bJ\u0010K\u001a-\u0010O\u001a\u000203\"\u0004\b\u0000\u0010L*\b\u0012\u0004\u0012\u00028\u00000I2\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000MH\u0002¢\u0006\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, m3636d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "approachLayoutInfo", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "Lkotlin/Pair;", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsScrollBehavior", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-GyuLg2I", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "lastVisibleItemIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "visibleLines", "lastApproachLayoutInfo", "linesRetainedForLookahead", "(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "T", "", "arr", "addAllFromArray", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyGridMeasure {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0448  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* renamed from: measureLazyGrid-GyuLg2I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyGridMeasureResult m5234measureLazyGridGyuLg2I(int i, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, final LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list, boolean z3, final boolean z4, LazyGridLayoutInfo lazyGridLayoutInfo, CoroutineScope coroutineScope, final SnapshotState<Unit> snapshotState, GraphicsContext graphicsContext, Function1<? super Integer, ? extends List<Tuples2<Integer, Constraints>>> function1, LazyLayoutStickyItems2 lazyLayoutStickyItems2, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i9;
        int i10;
        int i11;
        ArrayDeque arrayDeque;
        int i12;
        int i13;
        ArrayDeque arrayDeque2;
        List<LazyGridMeasuredLine> list2;
        int i14;
        int i15;
        int i16;
        LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider2;
        int i17;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i18;
        int i19;
        int i20;
        boolean z5 = true;
        if (!(i3 >= 0)) {
            InlineClassHelper.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (!(i4 >= 0)) {
            InlineClassHelper.throwIllegalArgumentException("negative afterContentPadding");
        }
        if (i <= 0) {
            int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
            int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, iM7977getMinWidthimpl, iM7976getMinHeightimpl, new ArrayList(), lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, 0, 0, coroutineScope, graphicsContext);
            if (!z4) {
                long jM5257getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m5257getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m8058equalsimpl0(jM5257getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
                    iM7977getMinWidthimpl = Constraints2.m7990constrainWidthK40F9xA(j, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    iM7976getMinHeightimpl = Constraints2.m7989constrainHeightK40F9xA(j, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new LazyGridMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(iM7977getMinWidthimpl), Integer.valueOf(iM7976getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), 0.0f, false, coroutineScope, density, i8, function1, CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int iRound = Math.round(f);
        int i21 = i7 - iRound;
        if (i6 == 0 && i21 < 0) {
            iRound += i21;
            i21 = 0;
        }
        ArrayDeque arrayDeque3 = new ArrayDeque();
        int i22 = -i3;
        int i23 = (i5 < 0 ? i5 : 0) + i22;
        int mainAxisSizeWithSpacings = i21 + i23;
        int i24 = i6;
        while (mainAxisSizeWithSpacings < 0 && i24 > 0) {
            i24--;
            LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i24);
            arrayDeque3.add(0, andMeasure);
            mainAxisSizeWithSpacings += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i23) {
            iRound -= i23 - mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i23;
        }
        int i25 = mainAxisSizeWithSpacings - i23;
        int i26 = i2 + i4;
        int i27 = i24;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i26, 0);
        int mainAxisSizeWithSpacings2 = -i25;
        int i28 = i27;
        int i29 = 0;
        boolean z6 = false;
        while (i29 < arrayDeque3.size()) {
            if (mainAxisSizeWithSpacings2 >= iCoerceAtLeast) {
                arrayDeque3.remove(i29);
                z6 = true;
            } else {
                i28++;
                mainAxisSizeWithSpacings2 += ((LazyGridMeasuredLine) arrayDeque3.get(i29)).getMainAxisSizeWithSpacings();
                i29++;
            }
        }
        int mainAxisSizeWithSpacings3 = i25;
        boolean z7 = z6;
        int i30 = i28;
        while (i30 < i && (mainAxisSizeWithSpacings2 < iCoerceAtLeast || mainAxisSizeWithSpacings2 <= 0 || arrayDeque3.isEmpty())) {
            int i31 = iCoerceAtLeast;
            LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i30);
            if (andMeasure2.isEmpty()) {
                break;
            }
            mainAxisSizeWithSpacings2 += andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings2 <= i23) {
                i18 = i23;
                i19 = i30;
                if (((LazyGridMeasuredItem) ArraysKt.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    i20 = i19 + 1;
                    mainAxisSizeWithSpacings3 -= andMeasure2.getMainAxisSizeWithSpacings();
                    z7 = true;
                }
                i27 = i20;
                i23 = i18;
                i30 = i19 + 1;
                iCoerceAtLeast = i31;
            } else {
                i18 = i23;
                i19 = i30;
            }
            arrayDeque3.add(andMeasure2);
            i20 = i27;
            i27 = i20;
            i23 = i18;
            i30 = i19 + 1;
            iCoerceAtLeast = i31;
        }
        if (mainAxisSizeWithSpacings2 < i2) {
            int i32 = i2 - mainAxisSizeWithSpacings2;
            mainAxisSizeWithSpacings3 -= i32;
            mainAxisSizeWithSpacings2 += i32;
            int i33 = i27;
            while (mainAxisSizeWithSpacings3 < i3 && i33 > 0) {
                i33--;
                LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i33);
                arrayDeque3.add(0, andMeasure3);
                mainAxisSizeWithSpacings3 += andMeasure3.getMainAxisSizeWithSpacings();
                i32 = i32;
            }
            i9 = iRound + i32;
            if (mainAxisSizeWithSpacings3 < 0) {
                i9 += mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings2 += mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings3 = 0;
            }
        } else {
            i9 = iRound;
        }
        float f2 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(i9) || Math.abs(Math.round(f)) < Math.abs(i9)) ? f : i9;
        float f3 = f - f2;
        float f4 = 0.0f;
        if (z4 && i9 > iRound && f3 <= 0.0f) {
            f4 = (i9 - iRound) + f3;
        }
        float f5 = f4;
        if (!(mainAxisSizeWithSpacings3 >= 0)) {
            InlineClassHelper.throwIllegalArgumentException("negative initial offset");
        }
        int i34 = -mainAxisSizeWithSpacings3;
        LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque3.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : 0;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque3.lastOrNull();
        if (lazyGridMeasuredLine2 == null || (items = lazyGridMeasuredLine2.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) {
            i10 = i34;
            i11 = 0;
        } else {
            int index2 = lazyGridMeasuredItem.getIndex();
            i10 = i34;
            i11 = index2;
        }
        List<Integer> list3 = list;
        int i35 = i11;
        int size = list3.size();
        List listEmptyList = null;
        float f6 = f2;
        List listEmptyList2 = null;
        int i36 = 0;
        while (i36 < size) {
            int i37 = size;
            int iIntValue = list.get(i36).intValue();
            if (iIntValue < 0 || iIntValue >= index) {
                i17 = index;
            } else {
                i17 = index;
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                LazyGridMeasuredItem lazyGridMeasuredItemMo5213getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo5213getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m5237childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                List list4 = listEmptyList2;
                list4.add(lazyGridMeasuredItemMo5213getAndMeasurehBUhpc);
                listEmptyList2 = list4;
            }
            i36++;
            size = i37;
            index = i17;
        }
        int i38 = index;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        int i39 = i10;
        int i40 = i38;
        List<LazyGridMeasuredLine> listLinesRetainedForLookahead = linesRetainedForLookahead(i35, i, lazyGridMeasuredLineProvider, z4, arrayDeque3, lazyGridLayoutInfo);
        int i41 = i;
        LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider3 = lazyGridMeasuredLineProvider;
        int size2 = list3.size();
        int i42 = i35;
        int i43 = 0;
        while (i43 < size2) {
            int i44 = i43;
            int iIntValue2 = list.get(i43).intValue();
            int i45 = size2;
            if (i42 + 1 > iIntValue2 || iIntValue2 >= i41) {
                i13 = i42;
                arrayDeque2 = arrayDeque3;
                list2 = listLinesRetainedForLookahead;
                i14 = i40;
                i15 = i44;
                i16 = i45;
                lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider3;
                break;
            }
            if (z4) {
                int size3 = listLinesRetainedForLookahead.size();
                int i46 = 0;
                while (i46 < size3) {
                    int i47 = i46;
                    LazyGridMeasuredItem[] items2 = listLinesRetainedForLookahead.get(i46).getItems();
                    int i48 = size3;
                    int length = items2.length;
                    int i49 = 0;
                    while (i49 < length) {
                        int i50 = i49;
                        if (items2[i49].getIndex() == iIntValue2) {
                            i13 = i42;
                            arrayDeque2 = arrayDeque3;
                            list2 = listLinesRetainedForLookahead;
                            i14 = i40;
                            i15 = i44;
                            i16 = i45;
                            lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider3;
                            break;
                            break;
                        }
                        i49 = i50 + 1;
                    }
                    i46 = i47 + 1;
                    size3 = i48;
                }
            }
            int iSpanOf2 = lazyGridMeasuredLineProvider3.spanOf(iIntValue2);
            arrayDeque2 = arrayDeque3;
            list2 = listLinesRetainedForLookahead;
            i13 = i42;
            i14 = i40;
            i15 = i44;
            lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider;
            i16 = i45;
            LazyGridMeasuredItem lazyGridMeasuredItemMo5213getAndMeasurehBUhpc2 = lazyGridMeasuredItemProvider.mo5213getAndMeasurehBUhpc(iIntValue2, 0, iSpanOf2, lazyGridMeasuredLineProvider3.m5237childConstraintsJhjzzOo$foundation_release(0, iSpanOf2));
            if (listEmptyList == null) {
                listEmptyList = new ArrayList();
            }
            List list5 = listEmptyList;
            list5.add(lazyGridMeasuredItemMo5213getAndMeasurehBUhpc2);
            listEmptyList = list5;
            i43 = i15 + 1;
            i41 = i;
            lazyGridMeasuredLineProvider3 = lazyGridMeasuredLineProvider2;
            arrayDeque3 = arrayDeque2;
            size2 = i16;
            listLinesRetainedForLookahead = list2;
            i40 = i14;
            i42 = i13;
        }
        int i51 = i42;
        ArrayDeque arrayDeque4 = arrayDeque3;
        List<LazyGridMeasuredLine> list6 = listLinesRetainedForLookahead;
        int i52 = i40;
        final LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider4 = lazyGridMeasuredLineProvider3;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list7 = listEmptyList;
        if (i3 > 0 || i5 < 0) {
            int size4 = arrayDeque4.size();
            int i53 = 0;
            while (true) {
                arrayDeque = arrayDeque4;
                if (i53 >= size4) {
                    break;
                }
                int mainAxisSizeWithSpacings4 = ((LazyGridMeasuredLine) arrayDeque.get(i53)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings3 == 0 || mainAxisSizeWithSpacings4 > mainAxisSizeWithSpacings3 || i53 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                mainAxisSizeWithSpacings3 -= mainAxisSizeWithSpacings4;
                i53++;
                lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.get(i53);
                arrayDeque4 = arrayDeque;
            }
        } else {
            arrayDeque = arrayDeque4;
        }
        int i54 = mainAxisSizeWithSpacings3;
        LazyGridMeasuredLine lazyGridMeasuredLine3 = lazyGridMeasuredLine;
        int iM7975getMaxWidthimpl = z ? Constraints.m7975getMaxWidthimpl(j) : Constraints2.m7990constrainWidthK40F9xA(j, mainAxisSizeWithSpacings2);
        int iM7989constrainHeightK40F9xA = z ? Constraints2.m7989constrainHeightK40F9xA(j, mainAxisSizeWithSpacings2) : Constraints.m7974getMaxHeightimpl(j);
        ArrayDeque arrayDequePlus = arrayDeque;
        if (!list6.isEmpty()) {
            arrayDequePlus = CollectionsKt.plus((Collection) arrayDeque, (Iterable) list6);
        }
        int i55 = mainAxisSizeWithSpacings2;
        final List<LazyGridMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDequePlus, listEmptyList2, list7, iM7975getMaxWidthimpl, iM7989constrainHeightK40F9xA, i55, i2, i39, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f6, iM7975getMaxWidthimpl, iM7989constrainHeightK40F9xA, listCalculateItemsOffsets, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, i54, i55, coroutineScope, graphicsContext);
        if (!z4) {
            long jM5257getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m5257getMinSizeToFitDisappearingItemsYbymL2g();
            if (IntSize.m8058equalsimpl0(jM5257getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m8064getZeroYbymL2g())) {
                i12 = iM7989constrainHeightK40F9xA;
            } else {
                int i56 = z ? iM7989constrainHeightK40F9xA : iM7975getMaxWidthimpl;
                iM7975getMaxWidthimpl = Constraints2.m7990constrainWidthK40F9xA(j, Math.max(iM7975getMaxWidthimpl, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                int iM7989constrainHeightK40F9xA2 = Constraints2.m7989constrainHeightK40F9xA(j, Math.max(iM7989constrainHeightK40F9xA, (int) (jM5257getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                int i57 = z ? iM7989constrainHeightK40F9xA2 : iM7975getMaxWidthimpl;
                if (i57 != i56) {
                    int size5 = listCalculateItemsOffsets.size();
                    for (int i58 = 0; i58 < size5; i58++) {
                        listCalculateItemsOffsets.get(i58).updateMainAxisLayoutSize(i57);
                    }
                }
                i12 = iM7989constrainHeightK40F9xA2;
            }
        }
        int i59 = iM7975getMaxWidthimpl;
        final List listApplyStickyItems = LazyLayoutStickyItems.applyStickyItems(lazyLayoutStickyItems2, listCalculateItemsOffsets, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, i59, i12, new Function1<Integer, LazyGridMeasuredItem>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$stickingItems$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LazyGridMeasuredItem invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final LazyGridMeasuredItem invoke(int i60) {
                int iSpanOf3 = lazyGridMeasuredLineProvider4.spanOf(i60);
                return lazyGridMeasuredItemProvider.mo5213getAndMeasurehBUhpc(i60, 0, iSpanOf3, lazyGridMeasuredLineProvider4.m5237childConstraintsJhjzzOo$foundation_release(0, iSpanOf3));
            }
        });
        if (i51 == i - 1 && i55 <= i2) {
            z5 = false;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine3, i54, z5, f6, function3.invoke(Integer.valueOf(i59), Integer.valueOf(i12), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6
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
                final List<LazyGridMeasuredItem> list8 = listCalculateItemsOffsets;
                final List<LazyGridMeasuredItem> list9 = listApplyStickyItems;
                final boolean z8 = z4;
                placementScope.withMotionFrameOfReferencePlacement(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6.1
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
                        List<LazyGridMeasuredItem> list10 = list8;
                        boolean z9 = z8;
                        int size6 = list10.size();
                        for (int i60 = 0; i60 < size6; i60++) {
                            list10.get(i60).place(placementScope2, z9);
                        }
                        List<LazyGridMeasuredItem> list11 = list9;
                        boolean z10 = z8;
                        int size7 = list11.size();
                        for (int i61 = 0; i61 < size7; i61++) {
                            list11.get(i61).place(placementScope2, z10);
                        }
                    }
                });
                ObservableScopeInvalidator.m5266attachToScopeimpl(snapshotState);
            }
        }), f5, z7, coroutineScope, density, i8, function1, LazyLayoutMeasuredItem2.updatedVisibleItems(i52, i51, listCalculateItemsOffsets, listApplyStickyItems), i22, i26, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[LOOP:1: B:25:0x0072->B:39:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[EDGE_INSN: B:49:0x00b0->B:40:0x00b0 BREAK  A[LOOP:1: B:25:0x0072->B:39:0x00ad], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<LazyGridMeasuredLine> linesRetainedForLookahead(int i, int i2, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, boolean z, List<LazyGridMeasuredLine> list, LazyGridLayoutInfo lazyGridLayoutInfo) {
        LazyGridItemInfo lazyGridItemInfo;
        int index;
        int iMin;
        ArrayList arrayList = null;
        if (z && lazyGridLayoutInfo != null && !lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyGridItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() > i && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= i)) {
                    break;
                }
            }
            lazyGridItemInfo = visibleItemsInfo.get(size);
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.last((List) lazyGridLayoutInfo.getVisibleItemsInfo());
            LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) CollectionsKt.lastOrNull((List) list);
            int index2 = lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() + 1 : 0;
            if (lazyGridItemInfo != null && (index = lazyGridItemInfo.getIndex()) <= (iMin = Math.min(lazyGridItemInfo2.getIndex(), i2 - 1))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            for (LazyGridMeasuredItem lazyGridMeasuredItem : arrayList.get(i3).getItems()) {
                                if (lazyGridMeasuredItem.getIndex() == index) {
                                    break;
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(index2);
                        index2++;
                        arrayList.add(andMeasure);
                        if (index != iMin) {
                            break;
                        }
                        index++;
                    } else {
                        if (arrayList == null) {
                        }
                        LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(index2);
                        index2++;
                        arrayList.add(andMeasure2);
                        if (index != iMin) {
                        }
                    }
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3) {
            if (!(i5 == 0)) {
                InlineClassHelper.throwIllegalStateException("non-zero firstLineScrollOffset");
            }
        }
        List<LazyGridMeasuredLine> list4 = list;
        int size = list4.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += list.get(i7).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (!z3) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int mainAxisSizeWithSpacings = i5;
                while (true) {
                    int i8 = size2 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size2);
                    mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i, i2);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i8 < 0) {
                        break;
                    }
                    size2 = i8;
                }
            }
            int size3 = list4.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i9 = 0; i9 < size3; i9++) {
                LazyGridMeasuredLine lazyGridMeasuredLine = list.get(i9);
                addAllFromArray(arrayList, lazyGridMeasuredLine.position(mainAxisSizeWithSpacings2, i, i2));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i10 = 0; i10 < size4; i10++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i10);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings2, 0, i, i2);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        } else {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelper.throwIllegalArgumentException("no items");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i11 = 0; i11 < size5; i11++) {
                iArr[i11] = list.get(calculateItemsOffsets$reverseAware(i11, z2, size5)).getMainAxisSize();
            }
            int[] iArr2 = new int[size5];
            if (z) {
                if (vertical == null) {
                    InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
                    throw new ExceptionsH();
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
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
                    int mainAxisSize = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(calculateItemsOffsets$reverseAware(first, z2, size5));
                    if (z2) {
                        mainAxisSize = (i6 - mainAxisSize) - lazyGridMeasuredLine2.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine2.position(mainAxisSize, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }
}
