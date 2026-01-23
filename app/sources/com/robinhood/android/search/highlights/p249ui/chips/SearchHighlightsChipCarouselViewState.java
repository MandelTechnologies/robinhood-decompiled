package com.robinhood.android.search.highlights.p249ui.chips;

import com.robinhood.android.redesign.model.AssetQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import search_coprocessor.p542v1.AssetTypeDto;

/* compiled from: SearchHighlightsChipCarouselViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/chips/SearchHighlightsChipCarouselViewState;", "", "assetQuotes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesign/model/AssetQuote;", "assetIdToType", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lsearch_coprocessor/v1/AssetTypeDto;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableMap;)V", "getAssetQuotes", "()Lkotlinx/collections/immutable/ImmutableList;", "getAssetIdToType", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightsChipCarouselViewState {
    public static final int $stable = 8;
    private final ImmutableMap<String, AssetTypeDto> assetIdToType;
    private final ImmutableList<AssetQuote> assetQuotes;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightsChipCarouselViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchHighlightsChipCarouselViewState copy$default(SearchHighlightsChipCarouselViewState searchHighlightsChipCarouselViewState, ImmutableList immutableList, ImmutableMap immutableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = searchHighlightsChipCarouselViewState.assetQuotes;
        }
        if ((i & 2) != 0) {
            immutableMap = searchHighlightsChipCarouselViewState.assetIdToType;
        }
        return searchHighlightsChipCarouselViewState.copy(immutableList, immutableMap);
    }

    public final ImmutableList<AssetQuote> component1() {
        return this.assetQuotes;
    }

    public final ImmutableMap<String, AssetTypeDto> component2() {
        return this.assetIdToType;
    }

    public final SearchHighlightsChipCarouselViewState copy(ImmutableList<? extends AssetQuote> assetQuotes, ImmutableMap<String, ? extends AssetTypeDto> assetIdToType) {
        Intrinsics.checkNotNullParameter(assetQuotes, "assetQuotes");
        Intrinsics.checkNotNullParameter(assetIdToType, "assetIdToType");
        return new SearchHighlightsChipCarouselViewState(assetQuotes, assetIdToType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightsChipCarouselViewState)) {
            return false;
        }
        SearchHighlightsChipCarouselViewState searchHighlightsChipCarouselViewState = (SearchHighlightsChipCarouselViewState) other;
        return Intrinsics.areEqual(this.assetQuotes, searchHighlightsChipCarouselViewState.assetQuotes) && Intrinsics.areEqual(this.assetIdToType, searchHighlightsChipCarouselViewState.assetIdToType);
    }

    public int hashCode() {
        return (this.assetQuotes.hashCode() * 31) + this.assetIdToType.hashCode();
    }

    public String toString() {
        return "SearchHighlightsChipCarouselViewState(assetQuotes=" + this.assetQuotes + ", assetIdToType=" + this.assetIdToType + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightsChipCarouselViewState(ImmutableList<? extends AssetQuote> assetQuotes, ImmutableMap<String, ? extends AssetTypeDto> assetIdToType) {
        Intrinsics.checkNotNullParameter(assetQuotes, "assetQuotes");
        Intrinsics.checkNotNullParameter(assetIdToType, "assetIdToType");
        this.assetQuotes = assetQuotes;
        this.assetIdToType = assetIdToType;
    }

    public /* synthetic */ SearchHighlightsChipCarouselViewState(ImmutableList immutableList, ImmutableMap immutableMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList, (i & 2) != 0 ? extensions2.persistentMapOf() : immutableMap);
    }

    public final ImmutableList<AssetQuote> getAssetQuotes() {
        return this.assetQuotes;
    }

    public final ImmutableMap<String, AssetTypeDto> getAssetIdToType() {
        return this.assetIdToType;
    }
}
