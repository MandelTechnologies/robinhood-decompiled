package com.robinhood.android.search.highlights.duxo;

import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import com.robinhood.android.search.highlights.util.SearchHighlightExperiments;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import search_coprocessor.p542v1.GetSearchHighlightsResponseDto;
import search_coprocessor.p542v1.GetSearchSubpageContentResponseDto;
import search_coprocessor.p542v1.HighlightItemDto;
import search_coprocessor.p542v1.SearchSubpageDto;

/* compiled from: SearchHighlightsViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0 ¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0 ¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0015¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsViewState;", "", "experiments", "Lcom/robinhood/android/search/highlights/util/SearchHighlightExperiments;", "highlightResponse", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "subpageContents", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "showMoreEarnings", "", "selectedSubpage", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "<init>", "(Lcom/robinhood/android/search/highlights/util/SearchHighlightExperiments;Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;Lkotlinx/collections/immutable/ImmutableMap;ZLcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;)V", "getExperiments", "()Lcom/robinhood/android/search/highlights/util/SearchHighlightExperiments;", "getSubpageContents", "()Lkotlinx/collections/immutable/ImmutableMap;", "getShowMoreEarnings", "()Z", "getSelectedSubpage", "()Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "inExperiment", "getInExperiment", "highlights", "", "Lsearch_coprocessor/v1/HighlightItemDto;", "getHighlights", "()Ljava/util/List;", "rawSubpages", "Lkotlinx/collections/immutable/PersistentList;", "Lsearch_coprocessor/v1/SearchSubpageDto;", "subpages", "getSubpages", "()Lkotlinx/collections/immutable/PersistentList;", "excludedTemplates", "getExcludedTemplates", "hideScreeners", "getHideScreeners", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightsViewState {
    public static final int $stable = 8;
    private final ImmutableList3<String> excludedTemplates;
    private final SearchHighlightExperiments experiments;
    private final boolean hideScreeners;
    private final GetSearchHighlightsResponseDto highlightResponse;
    private final List<HighlightItemDto> highlights;
    private final boolean inExperiment;
    private final ImmutableList3<SearchSubpageDto> rawSubpages;
    private final SearchHighlightSubpageData selectedSubpage;
    private final boolean showMoreEarnings;
    private final ImmutableMap<String, GetSearchSubpageContentResponseDto> subpageContents;
    private final ImmutableList3<SearchHighlightSubpageData> subpages;

    public SearchHighlightsViewState() {
        this(null, null, null, false, null, 31, null);
    }

    /* renamed from: component2, reason: from getter */
    private final GetSearchHighlightsResponseDto getHighlightResponse() {
        return this.highlightResponse;
    }

    public static /* synthetic */ SearchHighlightsViewState copy$default(SearchHighlightsViewState searchHighlightsViewState, SearchHighlightExperiments searchHighlightExperiments, GetSearchHighlightsResponseDto getSearchHighlightsResponseDto, ImmutableMap immutableMap, boolean z, SearchHighlightSubpageData searchHighlightSubpageData, int i, Object obj) {
        if ((i & 1) != 0) {
            searchHighlightExperiments = searchHighlightsViewState.experiments;
        }
        if ((i & 2) != 0) {
            getSearchHighlightsResponseDto = searchHighlightsViewState.highlightResponse;
        }
        if ((i & 4) != 0) {
            immutableMap = searchHighlightsViewState.subpageContents;
        }
        if ((i & 8) != 0) {
            z = searchHighlightsViewState.showMoreEarnings;
        }
        if ((i & 16) != 0) {
            searchHighlightSubpageData = searchHighlightsViewState.selectedSubpage;
        }
        SearchHighlightSubpageData searchHighlightSubpageData2 = searchHighlightSubpageData;
        ImmutableMap immutableMap2 = immutableMap;
        return searchHighlightsViewState.copy(searchHighlightExperiments, getSearchHighlightsResponseDto, immutableMap2, z, searchHighlightSubpageData2);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchHighlightExperiments getExperiments() {
        return this.experiments;
    }

    public final ImmutableMap<String, GetSearchSubpageContentResponseDto> component3() {
        return this.subpageContents;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowMoreEarnings() {
        return this.showMoreEarnings;
    }

    /* renamed from: component5, reason: from getter */
    public final SearchHighlightSubpageData getSelectedSubpage() {
        return this.selectedSubpage;
    }

    public final SearchHighlightsViewState copy(SearchHighlightExperiments experiments, GetSearchHighlightsResponseDto highlightResponse, ImmutableMap<String, GetSearchSubpageContentResponseDto> subpageContents, boolean showMoreEarnings, SearchHighlightSubpageData selectedSubpage) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return new SearchHighlightsViewState(experiments, highlightResponse, subpageContents, showMoreEarnings, selectedSubpage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightsViewState)) {
            return false;
        }
        SearchHighlightsViewState searchHighlightsViewState = (SearchHighlightsViewState) other;
        return Intrinsics.areEqual(this.experiments, searchHighlightsViewState.experiments) && Intrinsics.areEqual(this.highlightResponse, searchHighlightsViewState.highlightResponse) && Intrinsics.areEqual(this.subpageContents, searchHighlightsViewState.subpageContents) && this.showMoreEarnings == searchHighlightsViewState.showMoreEarnings && Intrinsics.areEqual(this.selectedSubpage, searchHighlightsViewState.selectedSubpage);
    }

    public int hashCode() {
        int iHashCode = this.experiments.hashCode() * 31;
        GetSearchHighlightsResponseDto getSearchHighlightsResponseDto = this.highlightResponse;
        int iHashCode2 = (iHashCode + (getSearchHighlightsResponseDto == null ? 0 : getSearchHighlightsResponseDto.hashCode())) * 31;
        ImmutableMap<String, GetSearchSubpageContentResponseDto> immutableMap = this.subpageContents;
        int iHashCode3 = (((iHashCode2 + (immutableMap == null ? 0 : immutableMap.hashCode())) * 31) + Boolean.hashCode(this.showMoreEarnings)) * 31;
        SearchHighlightSubpageData searchHighlightSubpageData = this.selectedSubpage;
        return iHashCode3 + (searchHighlightSubpageData != null ? searchHighlightSubpageData.hashCode() : 0);
    }

    public String toString() {
        return "SearchHighlightsViewState(experiments=" + this.experiments + ", highlightResponse=" + this.highlightResponse + ", subpageContents=" + this.subpageContents + ", showMoreEarnings=" + this.showMoreEarnings + ", selectedSubpage=" + this.selectedSubpage + ")";
    }

    public SearchHighlightsViewState(SearchHighlightExperiments experiments, GetSearchHighlightsResponseDto getSearchHighlightsResponseDto, ImmutableMap<String, GetSearchSubpageContentResponseDto> immutableMap, boolean z, SearchHighlightSubpageData searchHighlightSubpageData) {
        ImmutableList3<SearchHighlightSubpageData> immutableList3PersistentListOf;
        ImmutableList3<String> persistentList;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.experiments = experiments;
        this.highlightResponse = getSearchHighlightsResponseDto;
        this.subpageContents = immutableMap;
        this.showMoreEarnings = z;
        this.selectedSubpage = searchHighlightSubpageData;
        this.inExperiment = experiments.getHasHighlights();
        List<HighlightItemDto> items = getSearchHighlightsResponseDto != null ? getSearchHighlightsResponseDto.getItems() : null;
        this.highlights = items == null ? CollectionsKt.emptyList() : items;
        List<SearchSubpageDto> subpages = getSearchHighlightsResponseDto != null ? getSearchHighlightsResponseDto.getSubpages() : null;
        ImmutableList3<SearchSubpageDto> persistentList2 = extensions2.toPersistentList(subpages == null ? CollectionsKt.emptyList() : subpages);
        this.rawSubpages = persistentList2;
        if (!persistentList2.isEmpty()) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(SearchHighlightSubpageData.Now.INSTANCE);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(persistentList2, 10));
            for (SearchSubpageDto searchSubpageDto : persistentList2) {
                arrayList.add(new SearchHighlightSubpageData.Remote(searchSubpageDto.getId(), searchSubpageDto));
            }
            listCreateListBuilder.addAll(arrayList);
            immutableList3PersistentListOf = extensions2.toPersistentList(CollectionsKt.build(listCreateListBuilder));
        } else {
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        this.subpages = immutableList3PersistentListOf;
        SearchHighlightSubpageData searchHighlightSubpageData2 = this.selectedSubpage;
        if (searchHighlightSubpageData2 instanceof SearchHighlightSubpageData.Remote) {
            persistentList = extensions2.toPersistentList(((SearchHighlightSubpageData.Remote) searchHighlightSubpageData2).getTemplatesToExclude());
        } else {
            GetSearchHighlightsResponseDto getSearchHighlightsResponseDto2 = this.highlightResponse;
            List<String> templates_to_exclude = getSearchHighlightsResponseDto2 != null ? getSearchHighlightsResponseDto2.getTemplates_to_exclude() : null;
            persistentList = extensions2.toPersistentList(templates_to_exclude == null ? CollectionsKt.emptyList() : templates_to_exclude);
        }
        this.excludedTemplates = persistentList;
        SearchHighlightSubpageData searchHighlightSubpageData3 = this.selectedSubpage;
        boolean z2 = false;
        if (!(searchHighlightSubpageData3 instanceof SearchHighlightSubpageData.Now)) {
            if (searchHighlightSubpageData3 instanceof SearchHighlightSubpageData.Remote) {
                z2 = true;
            } else if (searchHighlightSubpageData3 != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.hideScreeners = z2;
    }

    public /* synthetic */ SearchHighlightsViewState(SearchHighlightExperiments searchHighlightExperiments, GetSearchHighlightsResponseDto getSearchHighlightsResponseDto, ImmutableMap immutableMap, boolean z, SearchHighlightSubpageData searchHighlightSubpageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SearchHighlightExperiments(false, 1, null) : searchHighlightExperiments, (i & 2) != 0 ? null : getSearchHighlightsResponseDto, (i & 4) != 0 ? null : immutableMap, (i & 8) != 0 ? true : z, (i & 16) != 0 ? SearchHighlightSubpageData.Now.INSTANCE : searchHighlightSubpageData);
    }

    public final SearchHighlightExperiments getExperiments() {
        return this.experiments;
    }

    public final ImmutableMap<String, GetSearchSubpageContentResponseDto> getSubpageContents() {
        return this.subpageContents;
    }

    public final boolean getShowMoreEarnings() {
        return this.showMoreEarnings;
    }

    public final SearchHighlightSubpageData getSelectedSubpage() {
        return this.selectedSubpage;
    }

    public final boolean getInExperiment() {
        return this.inExperiment;
    }

    public final List<HighlightItemDto> getHighlights() {
        return this.highlights;
    }

    public final ImmutableList3<SearchHighlightSubpageData> getSubpages() {
        return this.subpages;
    }

    public final ImmutableList3<String> getExcludedTemplates() {
        return this.excludedTemplates;
    }

    public final boolean getHideScreeners() {
        return this.hideScreeners;
    }
}
