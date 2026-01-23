package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyListLayoutInfo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"visibleItemsAverageSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.LazyListLayoutInfoKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyListLayoutInfo2 {
    public static final int visibleItemsAverageSize(LazyListLayoutInfo lazyListLayoutInfo) {
        List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += visibleItemsInfo.get(i).getSize();
        }
        return (size2 / visibleItemsInfo.size()) + lazyListLayoutInfo.getMainAxisItemSpacing();
    }
}
