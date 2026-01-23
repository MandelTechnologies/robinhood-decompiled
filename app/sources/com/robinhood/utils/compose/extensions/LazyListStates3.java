package com.robinhood.utils.compose.extensions;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyListStates.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"isListEmptyOrItemVisible", "", "Landroidx/compose/foundation/lazy/LazyListState;", "key", "", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.extensions.LazyListStatesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LazyListStates3 {
    public static final boolean isListEmptyOrItemVisible(LazyListState lazyListState, String key) {
        Intrinsics.checkNotNullParameter(lazyListState, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return true;
        }
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        if ((visibleItemsInfo instanceof Collection) && visibleItemsInfo.isEmpty()) {
            return false;
        }
        Iterator<T> it = visibleItemsInfo.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((LazyListItemInfo) it.next()).getKey(), key)) {
                return true;
            }
        }
        return false;
    }
}
