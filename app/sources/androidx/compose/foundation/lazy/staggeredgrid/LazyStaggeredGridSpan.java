package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: LazyStaggeredGridSpan.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "intervals", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;)V", "", "itemIndex", "", "isFullSpan", "(I)Z", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyStaggeredGridSpan {
    private final IntervalList<LazyStaggeredGridIntervalContent2> intervals;

    public LazyStaggeredGridSpan(IntervalList<LazyStaggeredGridIntervalContent2> intervalList) {
        this.intervals = intervalList;
    }

    public final boolean isFullSpan(int itemIndex) {
        if (itemIndex >= 0 && itemIndex < this.intervals.getSize()) {
            IntervalList.Interval<LazyStaggeredGridIntervalContent2> interval = this.intervals.get(itemIndex);
            Function1<Integer, LazyStaggeredGridSpan2> span = interval.getValue().getSpan();
            int startIndex = itemIndex - interval.getStartIndex();
            if (span != null && span.invoke(Integer.valueOf(startIndex)) == LazyStaggeredGridSpan2.INSTANCE.getFullLine()) {
                return true;
            }
        }
        return false;
    }
}
