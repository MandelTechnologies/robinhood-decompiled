package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntList2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: LazyLayoutStickyItems.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013JN\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H&J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "calculateStickingItemOffset", "", "visibleStickyItems", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "getStickingIndices", "Landroidx/collection/IntList;", "firstVisibleItemIndex", "lastVisibleItemIndex", "stickyItems", "Companion", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.StickyItemsPlacement, reason: use source file name */
/* loaded from: classes4.dex */
public interface LazyLayoutStickyItems2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight);

    IntList getStickingIndices(int firstVisibleItemIndex, int lastVisibleItemIndex, IntList stickyItems);

    /* compiled from: LazyLayoutStickyItems.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;", "", "()V", "StickToTopPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "getStickToTopPlacement", "()Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final LazyLayoutStickyItems2 StickToTopPlacement = new LazyLayoutStickyItems2() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutStickyItems2
            public int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                int size = visibleStickyItems.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        lazyLayoutMeasuredItem = null;
                        break;
                    }
                    lazyLayoutMeasuredItem = visibleStickyItems.get(i);
                    if (lazyLayoutMeasuredItem.getIndex() != itemIndex) {
                        break;
                    }
                    i++;
                }
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
                int mainAxisOffset = lazyLayoutMeasuredItem2 != null ? LazyLayoutStickyItems.getMainAxisOffset(lazyLayoutMeasuredItem2) : Integer.MIN_VALUE;
                int iMax = itemOffset == Integer.MIN_VALUE ? -beforeContentPadding : Math.max(-beforeContentPadding, itemOffset);
                return mainAxisOffset != Integer.MIN_VALUE ? Math.min(iMax, mainAxisOffset - itemSize) : iMax;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutStickyItems2
            public IntList getStickingIndices(int firstVisibleItemIndex, int lastVisibleItemIndex, IntList stickyItems) {
                int i;
                if (lastVisibleItemIndex - firstVisibleItemIndex >= 0 && (i = stickyItems._size) != 0) {
                    PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, i);
                    int first = primitiveRanges2Until.getFirst();
                    int last = primitiveRanges2Until.getLast();
                    int i2 = -1;
                    if (first <= last) {
                        while (stickyItems.get(first) <= firstVisibleItemIndex) {
                            i2 = stickyItems.get(first);
                            if (first == last) {
                                break;
                            }
                            first++;
                        }
                    }
                    if (i2 == -1) {
                        return IntList2.emptyIntList();
                    }
                    return IntList2.intListOf(i2);
                }
                return IntList2.emptyIntList();
            }
        };

        private Companion() {
        }

        public final LazyLayoutStickyItems2 getStickToTopPlacement() {
            return StickToTopPlacement;
        }
    }
}
