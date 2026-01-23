package com.robinhood.android.search.highlights.p249ui;

import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import search_coprocessor.p542v1.GetSearchSubpageContentResponseDto;

/* compiled from: SearchHighlightsRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SubpageTabs;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsBaseRow;", "id", "", "subpages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "subpageContents", "Lkotlinx/collections/immutable/ImmutableMap;", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "selectedSubpage", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableMap;Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;)V", "getId", "()Ljava/lang/String;", "getSubpages", "()Lkotlinx/collections/immutable/ImmutableList;", "getSubpageContents", "()Lkotlinx/collections/immutable/ImmutableMap;", "getSelectedSubpage", "()Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SubpageTabs extends SearchHighlightsRow2 {
    public static final int $stable = 8;
    private final String id;
    private final SearchHighlightSubpageData selectedSubpage;
    private final ImmutableMap<String, GetSearchSubpageContentResponseDto> subpageContents;
    private final ImmutableList<SearchHighlightSubpageData> subpages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubpageTabs copy$default(SubpageTabs subpageTabs, String str, ImmutableList immutableList, ImmutableMap immutableMap, SearchHighlightSubpageData searchHighlightSubpageData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subpageTabs.id;
        }
        if ((i & 2) != 0) {
            immutableList = subpageTabs.subpages;
        }
        if ((i & 4) != 0) {
            immutableMap = subpageTabs.subpageContents;
        }
        if ((i & 8) != 0) {
            searchHighlightSubpageData = subpageTabs.selectedSubpage;
        }
        return subpageTabs.copy(str, immutableList, immutableMap, searchHighlightSubpageData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final ImmutableList<SearchHighlightSubpageData> component2() {
        return this.subpages;
    }

    public final ImmutableMap<String, GetSearchSubpageContentResponseDto> component3() {
        return this.subpageContents;
    }

    /* renamed from: component4, reason: from getter */
    public final SearchHighlightSubpageData getSelectedSubpage() {
        return this.selectedSubpage;
    }

    public final SubpageTabs copy(String id, ImmutableList<? extends SearchHighlightSubpageData> subpages, ImmutableMap<String, GetSearchSubpageContentResponseDto> subpageContents, SearchHighlightSubpageData selectedSubpage) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        return new SubpageTabs(id, subpages, subpageContents, selectedSubpage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubpageTabs)) {
            return false;
        }
        SubpageTabs subpageTabs = (SubpageTabs) other;
        return Intrinsics.areEqual(this.id, subpageTabs.id) && Intrinsics.areEqual(this.subpages, subpageTabs.subpages) && Intrinsics.areEqual(this.subpageContents, subpageTabs.subpageContents) && Intrinsics.areEqual(this.selectedSubpage, subpageTabs.selectedSubpage);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.subpages.hashCode()) * 31;
        ImmutableMap<String, GetSearchSubpageContentResponseDto> immutableMap = this.subpageContents;
        int iHashCode2 = (iHashCode + (immutableMap == null ? 0 : immutableMap.hashCode())) * 31;
        SearchHighlightSubpageData searchHighlightSubpageData = this.selectedSubpage;
        return iHashCode2 + (searchHighlightSubpageData != null ? searchHighlightSubpageData.hashCode() : 0);
    }

    public String toString() {
        return "SubpageTabs(id=" + this.id + ", subpages=" + this.subpages + ", subpageContents=" + this.subpageContents + ", selectedSubpage=" + this.selectedSubpage + ")";
    }

    @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
    public String getId() {
        return this.id;
    }

    public final ImmutableList<SearchHighlightSubpageData> getSubpages() {
        return this.subpages;
    }

    public final ImmutableMap<String, GetSearchSubpageContentResponseDto> getSubpageContents() {
        return this.subpageContents;
    }

    public final SearchHighlightSubpageData getSelectedSubpage() {
        return this.selectedSubpage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubpageTabs(String id, ImmutableList<? extends SearchHighlightSubpageData> subpages, ImmutableMap<String, GetSearchSubpageContentResponseDto> immutableMap, SearchHighlightSubpageData searchHighlightSubpageData) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        this.id = id;
        this.subpages = subpages;
        this.subpageContents = immutableMap;
        this.selectedSubpage = searchHighlightSubpageData;
    }
}
