package com.robinhood.android.indexes.detail.components.topbaraction;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageAddToWatchlistActionDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/topbaraction/IndexDetailPageAddToWatchlistActionDataState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "uuidList", "", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/indexes/models/db/Index;Ljava/util/List;)V", "getIndex", "()Lcom/robinhood/android/indexes/models/db/Index;", "getUuidList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageAddToWatchlistActionDataState {
    public static final int $stable = 8;
    private final Index index;
    private final List<UUID> uuidList;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageAddToWatchlistActionDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexDetailPageAddToWatchlistActionDataState copy$default(IndexDetailPageAddToWatchlistActionDataState indexDetailPageAddToWatchlistActionDataState, Index index, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            index = indexDetailPageAddToWatchlistActionDataState.index;
        }
        if ((i & 2) != 0) {
            list = indexDetailPageAddToWatchlistActionDataState.uuidList;
        }
        return indexDetailPageAddToWatchlistActionDataState.copy(index, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Index getIndex() {
        return this.index;
    }

    public final List<UUID> component2() {
        return this.uuidList;
    }

    public final IndexDetailPageAddToWatchlistActionDataState copy(Index index, List<UUID> uuidList) {
        Intrinsics.checkNotNullParameter(uuidList, "uuidList");
        return new IndexDetailPageAddToWatchlistActionDataState(index, uuidList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageAddToWatchlistActionDataState)) {
            return false;
        }
        IndexDetailPageAddToWatchlistActionDataState indexDetailPageAddToWatchlistActionDataState = (IndexDetailPageAddToWatchlistActionDataState) other;
        return Intrinsics.areEqual(this.index, indexDetailPageAddToWatchlistActionDataState.index) && Intrinsics.areEqual(this.uuidList, indexDetailPageAddToWatchlistActionDataState.uuidList);
    }

    public int hashCode() {
        Index index = this.index;
        return ((index == null ? 0 : index.hashCode()) * 31) + this.uuidList.hashCode();
    }

    public String toString() {
        return "IndexDetailPageAddToWatchlistActionDataState(index=" + this.index + ", uuidList=" + this.uuidList + ")";
    }

    public IndexDetailPageAddToWatchlistActionDataState(Index index, List<UUID> uuidList) {
        Intrinsics.checkNotNullParameter(uuidList, "uuidList");
        this.index = index;
        this.uuidList = uuidList;
    }

    public final Index getIndex() {
        return this.index;
    }

    public /* synthetic */ IndexDetailPageAddToWatchlistActionDataState(Index index, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : index, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<UUID> getUuidList() {
        return this.uuidList;
    }
}
