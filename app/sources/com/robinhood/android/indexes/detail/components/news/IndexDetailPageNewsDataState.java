package com.robinhood.android.indexes.detail.components.news;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IndexDetailPageNewsDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsDataState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "newsFeedElements", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "<init>", "(Lcom/robinhood/android/indexes/models/db/Index;Lkotlinx/collections/immutable/ImmutableList;)V", "getIndex", "()Lcom/robinhood/android/indexes/models/db/Index;", "getNewsFeedElements", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageNewsDataState {
    public static final int $stable = 8;
    private final Index index;
    private final ImmutableList<NewsFeedElement> newsFeedElements;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageNewsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexDetailPageNewsDataState copy$default(IndexDetailPageNewsDataState indexDetailPageNewsDataState, Index index, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            index = indexDetailPageNewsDataState.index;
        }
        if ((i & 2) != 0) {
            immutableList = indexDetailPageNewsDataState.newsFeedElements;
        }
        return indexDetailPageNewsDataState.copy(index, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final Index getIndex() {
        return this.index;
    }

    public final ImmutableList<NewsFeedElement> component2() {
        return this.newsFeedElements;
    }

    public final IndexDetailPageNewsDataState copy(Index index, ImmutableList<NewsFeedElement> newsFeedElements) {
        Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
        return new IndexDetailPageNewsDataState(index, newsFeedElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageNewsDataState)) {
            return false;
        }
        IndexDetailPageNewsDataState indexDetailPageNewsDataState = (IndexDetailPageNewsDataState) other;
        return Intrinsics.areEqual(this.index, indexDetailPageNewsDataState.index) && Intrinsics.areEqual(this.newsFeedElements, indexDetailPageNewsDataState.newsFeedElements);
    }

    public int hashCode() {
        Index index = this.index;
        return ((index == null ? 0 : index.hashCode()) * 31) + this.newsFeedElements.hashCode();
    }

    public String toString() {
        return "IndexDetailPageNewsDataState(index=" + this.index + ", newsFeedElements=" + this.newsFeedElements + ")";
    }

    public IndexDetailPageNewsDataState(Index index, ImmutableList<NewsFeedElement> newsFeedElements) {
        Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
        this.index = index;
        this.newsFeedElements = newsFeedElements;
    }

    public final Index getIndex() {
        return this.index;
    }

    public /* synthetic */ IndexDetailPageNewsDataState(Index index, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : index, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList);
    }

    public final ImmutableList<NewsFeedElement> getNewsFeedElements() {
        return this.newsFeedElements;
    }
}
