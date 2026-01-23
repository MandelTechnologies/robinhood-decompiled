package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollableState4;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: PagerScrollScope.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"LazyLayoutScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "state", "Landroidx/compose/foundation/pager/PagerState;", "scrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.pager.PagerScrollScopeKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class PagerScrollScope {

    /* compiled from: PagerScrollScope.kt */
    @Metadata(m3635d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u0017"}, m3636d2 = {"androidx/compose/foundation/pager/PagerScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "itemCount", "getItemCount", "lastVisibleItemIndex", "getLastVisibleItemIndex", "calculateDistanceTo", "targetIndex", "targetOffset", "scrollBy", "", "pixels", "snapToItem", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "offset", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C13081 implements LazyLayoutScrollScope, ScrollableState4 {
        private final /* synthetic */ ScrollableState4 $$delegate_0;
        final /* synthetic */ PagerState $state;

        @Override // androidx.compose.foundation.gestures.ScrollableState4
        public float scrollBy(float pixels) {
            return this.$$delegate_0.scrollBy(pixels);
        }

        C13081(ScrollableState4 scrollableState4, PagerState pagerState) {
            this.$state = pagerState;
            this.$$delegate_0 = scrollableState4;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemIndex() {
            return this.$state.getFirstVisiblePage();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return this.$state.getFirstVisiblePageOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getLastVisibleItemIndex() {
            return ((PageInfo) CollectionsKt.last((List) this.$state.getLayoutInfo().getVisiblePagesInfo())).getIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getItemCount() {
            return this.$state.getPageCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int index, int offset) {
            this.$state.snapToItem$foundation_release(index, offset / this.$state.getPageSizeWithSpacing$foundation_release(), true);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int targetIndex, int targetOffset) {
            return (int) (RangesKt.coerceIn(PagerScrollPosition2.currentAbsoluteScrollOffset(this.$state) + MathKt.roundToInt((((targetIndex - this.$state.getCurrentPage()) * this.$state.getPageSizeWithSpacing$foundation_release()) - (this.$state.getCurrentPageOffsetFraction() * this.$state.getPageSizeWithSpacing$foundation_release())) + targetOffset), this.$state.getMinScrollOffset(), this.$state.getMaxScrollOffset()) - PagerScrollPosition2.currentAbsoluteScrollOffset(this.$state));
        }
    }

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(PagerState pagerState, ScrollableState4 scrollableState4) {
        return new C13081(scrollableState4, pagerState);
    }
}
