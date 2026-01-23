package com.robinhood.android.indexes.detail.components.relatedlist;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: IndexDetailPageRelatedListDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDataState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "relatedIndustryLists", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "<init>", "(Lcom/robinhood/android/indexes/models/db/Index;Lkotlinx/collections/immutable/ImmutableList;)V", "getIndex", "()Lcom/robinhood/android/indexes/models/db/Index;", "getRelatedIndustryLists", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageRelatedListDataState {
    public static final int $stable = 8;
    private final Index index;
    private final ImmutableList<CuratedListChipItem> relatedIndustryLists;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageRelatedListDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexDetailPageRelatedListDataState copy$default(IndexDetailPageRelatedListDataState indexDetailPageRelatedListDataState, Index index, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            index = indexDetailPageRelatedListDataState.index;
        }
        if ((i & 2) != 0) {
            immutableList = indexDetailPageRelatedListDataState.relatedIndustryLists;
        }
        return indexDetailPageRelatedListDataState.copy(index, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final Index getIndex() {
        return this.index;
    }

    public final ImmutableList<CuratedListChipItem> component2() {
        return this.relatedIndustryLists;
    }

    public final IndexDetailPageRelatedListDataState copy(Index index, ImmutableList<CuratedListChipItem> relatedIndustryLists) {
        return new IndexDetailPageRelatedListDataState(index, relatedIndustryLists);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageRelatedListDataState)) {
            return false;
        }
        IndexDetailPageRelatedListDataState indexDetailPageRelatedListDataState = (IndexDetailPageRelatedListDataState) other;
        return Intrinsics.areEqual(this.index, indexDetailPageRelatedListDataState.index) && Intrinsics.areEqual(this.relatedIndustryLists, indexDetailPageRelatedListDataState.relatedIndustryLists);
    }

    public int hashCode() {
        Index index = this.index;
        int iHashCode = (index == null ? 0 : index.hashCode()) * 31;
        ImmutableList<CuratedListChipItem> immutableList = this.relatedIndustryLists;
        return iHashCode + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "IndexDetailPageRelatedListDataState(index=" + this.index + ", relatedIndustryLists=" + this.relatedIndustryLists + ")";
    }

    public IndexDetailPageRelatedListDataState(Index index, ImmutableList<CuratedListChipItem> immutableList) {
        this.index = index;
        this.relatedIndustryLists = immutableList;
    }

    public /* synthetic */ IndexDetailPageRelatedListDataState(Index index, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : index, (i & 2) != 0 ? null : immutableList);
    }

    public final Index getIndex() {
        return this.index;
    }

    public final ImmutableList<CuratedListChipItem> getRelatedIndustryLists() {
        return this.relatedIndustryLists;
    }
}
