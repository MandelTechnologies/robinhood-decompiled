package com.robinhood.android.indexes.detail.components.news;

import com.robinhood.android.common.detail.component.news.DetailPageNewsViewState;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.udf.StateProvider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageNewsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsDataState;", "Lcom/robinhood/android/common/detail/component/news/DetailPageNewsViewState;", "<init>", "()V", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageNewsStateProvider implements StateProvider<IndexDetailPageNewsDataState, DetailPageNewsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public DetailPageNewsViewState reduce(IndexDetailPageNewsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean z = (dataState.getIndex() == null || dataState.getNewsFeedElements().isEmpty()) ? false : true;
        Index index = dataState.getIndex();
        UUID id = index != null ? index.getId() : null;
        Index index2 = dataState.getIndex();
        return new DetailPageNewsViewState(z, id, index2 != null ? index2.getSymbol() : null, dataState.getNewsFeedElements());
    }
}
