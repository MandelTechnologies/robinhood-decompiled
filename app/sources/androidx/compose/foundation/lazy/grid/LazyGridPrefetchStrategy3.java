package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGridPrefetchStrategy.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "", "scheduleLinePrefetch", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "lineIndex", "", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope, reason: use source file name */
/* loaded from: classes4.dex */
public interface LazyGridPrefetchStrategy3 {
    List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int lineIndex);
}
