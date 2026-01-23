package androidx.paging;

import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PagedList.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"", "Key", "Landroidx/paging/PagedList$Config;", "key", "Landroidx/paging/PagingSource$LoadParams;", "toRefreshLoadParams", "(Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.paging.PagedListKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class PagedList4 {
    public static final <Key> PagingSource.LoadParams<Key> toRefreshLoadParams(PagedList.Config config, Key key) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        return new PagingSource.LoadParams.Refresh(key, config.initialLoadSizeHint, config.enablePlaceholders);
    }
}
