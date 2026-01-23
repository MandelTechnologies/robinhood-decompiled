package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.p011ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyLayoutStickyItems.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001ao\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "positionedItems", "Landroidx/collection/IntList;", "stickyItems", "", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "applyStickyItems", "(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "mainAxisOffset", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyLayoutStickyItems {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo5211getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo5211getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m8039getYimpl(jMo5211getOffsetBjo55l4) : IntOffset.m8038getXimpl(jMo5211getOffsetBjo55l4);
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(LazyLayoutStickyItems2 lazyLayoutStickyItems2, List<T> list, IntList intList, int i, int i2, int i3, int i4, Function1<? super Integer, ? extends T> function1) {
        T tRemove;
        LazyLayoutStickyItems2 lazyLayoutStickyItems22 = lazyLayoutStickyItems2;
        if (lazyLayoutStickyItems22 != null && !list.isEmpty() && intList._size != 0) {
            IntList stickingIndices = lazyLayoutStickyItems22.getStickingIndices(((LazyLayoutMeasuredItem) CollectionsKt.first((List) list)).getIndex(), ((LazyLayoutMeasuredItem) CollectionsKt.last((List) list)).getIndex(), intList);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                T t = list.get(i5);
                if (intList.contains(t.getIndex())) {
                    arrayList2.add(t);
                }
            }
            int[] iArr = stickingIndices.content;
            int i6 = stickingIndices._size;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = iArr[i7];
                Iterator<T> it = list.iterator();
                int i9 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i9 = -1;
                        break;
                    }
                    if (it.next().getIndex() == i8) {
                        break;
                    }
                    i9++;
                }
                if (i9 == -1) {
                    tRemove = function1.invoke(Integer.valueOf(i8));
                } else {
                    tRemove = list.remove(i9);
                }
                ArrayList arrayList3 = arrayList2;
                T t2 = tRemove;
                int iCalculateStickingItemOffset = lazyLayoutStickyItems22.calculateStickingItemOffset(arrayList3, i8, tRemove.getMainAxisSizeWithSpacings(), i9 == -1 ? Integer.MIN_VALUE : getMainAxisOffset(tRemove), i, i2, i3, i4);
                t2.setNonScrollableItem(true);
                t2.position(iCalculateStickingItemOffset, 0, i3, i4);
                arrayList.add(t2);
                i7++;
                lazyLayoutStickyItems22 = lazyLayoutStickyItems2;
                arrayList2 = arrayList3;
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}
