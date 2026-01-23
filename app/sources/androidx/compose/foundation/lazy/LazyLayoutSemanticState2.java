package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics2;
import androidx.compose.p011ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: LazyLayoutSemanticState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m3636d2 = {"LazyLayoutSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "isVertical", "", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyLayoutSemanticState2 {
    public static final LazyLayoutSemantics LazyLayoutSemanticState(final LazyListState lazyListState, final boolean z) {
        return new LazyLayoutSemantics() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt.LazyLayoutSemanticState.1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemantics
            public float getScrollOffset() {
                return LazyLayoutSemantics2.estimatedLazyScrollOffset(lazyListState.getFirstVisibleItemIndex(), lazyListState.getFirstVisibleItemScrollOffset());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemantics
            public float getMaxScrollOffset() {
                return LazyLayoutSemantics2.estimatedLazyMaxScrollOffset(lazyListState.getFirstVisibleItemIndex(), lazyListState.getFirstVisibleItemScrollOffset(), lazyListState.getCanScrollForward());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemantics
            public Object scrollToItem(int i, Continuation<? super Unit> continuation) {
                Object objScrollToItem$default = LazyListState.scrollToItem$default(lazyListState, i, 0, continuation, 2, null);
                return objScrollToItem$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScrollToItem$default : Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemantics
            public CollectionInfo collectionInfo() {
                if (z) {
                    return new CollectionInfo(-1, 1);
                }
                return new CollectionInfo(1, -1);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemantics
            public int getViewport() {
                long jMo5206getViewportSizeYbymL2g;
                if (lazyListState.getLayoutInfo().getOrientation() == Orientation.Vertical) {
                    jMo5206getViewportSizeYbymL2g = lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L;
                } else {
                    jMo5206getViewportSizeYbymL2g = lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() >> 32;
                }
                return (int) jMo5206getViewportSizeYbymL2g;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemantics
            public int getContentPadding() {
                return lazyListState.getLayoutInfo().getBeforeContentPadding() + lazyListState.getLayoutInfo().getAfterContentPadding();
            }
        };
    }
}
