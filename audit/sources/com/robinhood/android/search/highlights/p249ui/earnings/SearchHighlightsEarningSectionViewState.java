package com.robinhood.android.search.highlights.p249ui.earnings;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SearchHighlightsEarningSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightsEarningSectionViewState;", "", "earningItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightEarningsItem;", "showMore", "", "assetCount", "", "isLoadingMore", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ZIZ)V", "getEarningItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowMore", "()Z", "getAssetCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightsEarningSectionViewState {
    public static final int $stable = 8;
    private final int assetCount;
    private final ImmutableList<SearchHighlightEarningsItem> earningItems;
    private final boolean isLoadingMore;
    private final boolean showMore;

    public SearchHighlightsEarningSectionViewState() {
        this(null, false, 0, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchHighlightsEarningSectionViewState copy$default(SearchHighlightsEarningSectionViewState searchHighlightsEarningSectionViewState, ImmutableList immutableList, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = searchHighlightsEarningSectionViewState.earningItems;
        }
        if ((i2 & 2) != 0) {
            z = searchHighlightsEarningSectionViewState.showMore;
        }
        if ((i2 & 4) != 0) {
            i = searchHighlightsEarningSectionViewState.assetCount;
        }
        if ((i2 & 8) != 0) {
            z2 = searchHighlightsEarningSectionViewState.isLoadingMore;
        }
        return searchHighlightsEarningSectionViewState.copy(immutableList, z, i, z2);
    }

    public final ImmutableList<SearchHighlightEarningsItem> component1() {
        return this.earningItems;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowMore() {
        return this.showMore;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAssetCount() {
        return this.assetCount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    public final SearchHighlightsEarningSectionViewState copy(ImmutableList<SearchHighlightEarningsItem> earningItems, boolean showMore, int assetCount, boolean isLoadingMore) {
        Intrinsics.checkNotNullParameter(earningItems, "earningItems");
        return new SearchHighlightsEarningSectionViewState(earningItems, showMore, assetCount, isLoadingMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightsEarningSectionViewState)) {
            return false;
        }
        SearchHighlightsEarningSectionViewState searchHighlightsEarningSectionViewState = (SearchHighlightsEarningSectionViewState) other;
        return Intrinsics.areEqual(this.earningItems, searchHighlightsEarningSectionViewState.earningItems) && this.showMore == searchHighlightsEarningSectionViewState.showMore && this.assetCount == searchHighlightsEarningSectionViewState.assetCount && this.isLoadingMore == searchHighlightsEarningSectionViewState.isLoadingMore;
    }

    public int hashCode() {
        return (((((this.earningItems.hashCode() * 31) + Boolean.hashCode(this.showMore)) * 31) + Integer.hashCode(this.assetCount)) * 31) + Boolean.hashCode(this.isLoadingMore);
    }

    public String toString() {
        return "SearchHighlightsEarningSectionViewState(earningItems=" + this.earningItems + ", showMore=" + this.showMore + ", assetCount=" + this.assetCount + ", isLoadingMore=" + this.isLoadingMore + ")";
    }

    public SearchHighlightsEarningSectionViewState(ImmutableList<SearchHighlightEarningsItem> earningItems, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(earningItems, "earningItems");
        this.earningItems = earningItems;
        this.showMore = z;
        this.assetCount = i;
        this.isLoadingMore = z2;
    }

    public /* synthetic */ SearchHighlightsEarningSectionViewState(ImmutableList immutableList, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? extensions2.persistentListOf() : immutableList, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z2);
    }

    public final ImmutableList<SearchHighlightEarningsItem> getEarningItems() {
        return this.earningItems;
    }

    public final boolean getShowMore() {
        return this.showMore;
    }

    public final int getAssetCount() {
        return this.assetCount;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }
}
