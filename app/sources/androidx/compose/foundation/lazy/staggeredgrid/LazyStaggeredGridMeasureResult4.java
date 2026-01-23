package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.IntervalList3;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.unit.Density3;
import androidx.compose.p011ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m3636d2 = {"EmptyArray", "", "EmptyLazyStaggeredGridLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getEmptyLazyStaggeredGridLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)I", "findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "itemIndex", "visibleItemsAverageSize", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyStaggeredGridMeasureResult4 {
    private static final int[] EmptyArray;
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    public static final LazyStaggeredGridMeasureResult2 findVisibleItem(LazyStaggeredGridMeasureResult3 lazyStaggeredGridMeasureResult3, final int i) {
        if (lazyStaggeredGridMeasureResult3.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridMeasureResult2) CollectionsKt.first((List) lazyStaggeredGridMeasureResult3.getVisibleItemsInfo())).getIndex();
        if (i > ((LazyStaggeredGridMeasureResult2) CollectionsKt.last((List) lazyStaggeredGridMeasureResult3.getVisibleItemsInfo())).getIndex() || index > i) {
            return null;
        }
        return (LazyStaggeredGridMeasureResult2) CollectionsKt.getOrNull(lazyStaggeredGridMeasureResult3.getVisibleItemsInfo(), CollectionsKt.binarySearch$default(lazyStaggeredGridMeasureResult3.getVisibleItemsInfo(), 0, 0, new Function1<LazyStaggeredGridMeasureResult2, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(LazyStaggeredGridMeasureResult2 lazyStaggeredGridMeasureResult2) {
                return Integer.valueOf(lazyStaggeredGridMeasureResult2.getIndex() - i);
            }
        }, 3, (Object) null));
    }

    static {
        int[] iArr = new int[0];
        EmptyArray = iArr;
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = MapsKt.emptyMap();
            private final int height;
            private final int width;

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public void placeChildren() {
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }
        }, 0.0f, false, false, false, new LazyStaggeredGrid3(iArr, iArr), new LazyStaggeredGridSpan(new IntervalList3()), Density3.Density$default(1.0f, 0.0f, 2, null), 0, CollectionsKt.emptyList(), IntSize.INSTANCE.m8064getZeroYbymL2g(), 0, 0, 0, 0, 0, CoroutineScope2.CoroutineScope(CoroutineContextImpl6.INSTANCE), null);
    }

    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int visibleItemsAverageSize(LazyStaggeredGridMeasureResult3 lazyStaggeredGridMeasureResult3) {
        long size;
        List<LazyStaggeredGridMeasureResult2> visibleItemsInfo = lazyStaggeredGridMeasureResult3.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size2 = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            LazyStaggeredGridMeasureResult2 lazyStaggeredGridMeasureResult2 = visibleItemsInfo.get(i2);
            if (lazyStaggeredGridMeasureResult3.getOrientation() == Orientation.Vertical) {
                size = lazyStaggeredGridMeasureResult2.getSize() & 4294967295L;
            } else {
                size = lazyStaggeredGridMeasureResult2.getSize() >> 32;
            }
            i += (int) size;
        }
        return (i / visibleItemsInfo.size()) + lazyStaggeredGridMeasureResult3.getMainAxisItemSpacing();
    }

    public static final int getSingleAxisViewportSize(LazyStaggeredGridMeasureResult3 lazyStaggeredGridMeasureResult3) {
        long viewportSize;
        if (lazyStaggeredGridMeasureResult3.getOrientation() == Orientation.Vertical) {
            viewportSize = lazyStaggeredGridMeasureResult3.getViewportSize() & 4294967295L;
        } else {
            viewportSize = lazyStaggeredGridMeasureResult3.getViewportSize() >> 32;
        }
        return (int) viewportSize;
    }
}
