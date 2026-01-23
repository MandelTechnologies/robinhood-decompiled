package com.robinhood.android.search.highlights.p249ui;

import com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow;
import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import search_coprocessor.p542v1.AssetDto;
import search_coprocessor.p542v1.GetSearchSubpageContentResponseDto;
import search_coprocessor.p542v1.HighlightItemDto;

/* compiled from: SearchHighlightsRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¨\u0006\u0010"}, m3636d2 = {"toSearchHighlightRows", "", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsBaseRow;", "highlights", "Lsearch_coprocessor/v1/HighlightItemDto;", "subpages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "subpageContents", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "accountNumber", "showMoreEarnings", "", "selectedSubpage", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.SearchHighlightsRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightsRow3 {
    public static final List<SearchHighlightsRow2> toSearchHighlightRows(List<HighlightItemDto> highlights, ImmutableList<? extends SearchHighlightSubpageData> subpages, ImmutableMap<String, GetSearchSubpageContentResponseDto> immutableMap, String str, boolean z, SearchHighlightSubpageData searchHighlightSubpageData) {
        boolean z2;
        GetSearchSubpageContentResponseDto getSearchSubpageContentResponseDto;
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        ArrayList arrayList = new ArrayList();
        if (!subpages.isEmpty()) {
            arrayList.add(new SubpageTabs("search-highlight-subpage-row", subpages, immutableMap, searchHighlightSubpageData));
        }
        if (!(searchHighlightSubpageData instanceof SearchHighlightSubpageData.Now) && searchHighlightSubpageData != null) {
            if (!(searchHighlightSubpageData instanceof SearchHighlightSubpageData.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            if (immutableMap == null || (getSearchSubpageContentResponseDto = immutableMap.get(((SearchHighlightSubpageData.Remote) searchHighlightSubpageData).getId())) == null || (highlights = getSearchSubpageContentResponseDto.getItems()) == null) {
                highlights = CollectionsKt.emptyList();
            }
        }
        ArrayList<HighlightItemDto.ContentDto> arrayList2 = new ArrayList();
        Iterator<T> it = highlights.iterator();
        while (it.hasNext()) {
            HighlightItemDto.ContentDto content = ((HighlightItemDto) it.next()).getContent();
            if (content != null) {
                arrayList2.add(content);
            }
        }
        for (HighlightItemDto.ContentDto contentDto : arrayList2) {
            if (contentDto instanceof HighlightItemDto.ContentDto.SectionTitle) {
                arrayList.add(new SearchHighlightsRow.SectionTitle(((HighlightItemDto.ContentDto.SectionTitle) contentDto).getValue().getId(), new HighlightItemDto(contentDto)));
            } else if (contentDto instanceof HighlightItemDto.ContentDto.CompactIndicies) {
                arrayList.add(new SearchHighlightsRow.MarketCards(((HighlightItemDto.ContentDto.CompactIndicies) contentDto).getValue().getId(), new HighlightItemDto(contentDto), str));
            } else if (contentDto instanceof HighlightItemDto.ContentDto.AssetChipGrid) {
                arrayList.add(new SearchHighlightsRow.ChipCarousel(((HighlightItemDto.ContentDto.AssetChipGrid) contentDto).getValue().getId(), new HighlightItemDto(contentDto), str));
            } else if (contentDto instanceof HighlightItemDto.ContentDto.QuickLinks) {
                arrayList.add(new SearchHighlightsRow.QuickLinks(((HighlightItemDto.ContentDto.QuickLinks) contentDto).getValue().getId(), new HighlightItemDto(contentDto), str));
            } else {
                if (contentDto instanceof HighlightItemDto.ContentDto.EarningsList) {
                    HighlightItemDto.ContentDto.EarningsList earningsList = (HighlightItemDto.ContentDto.EarningsList) contentDto;
                    String id = earningsList.getValue().getId();
                    List<AssetDto> assets = earningsList.getValue().getAssets();
                    for (AssetDto assetDto : !z ? assets : CollectionsKt.take(assets, 3)) {
                        String str2 = id;
                        id = str2;
                        arrayList.add(new SearchHighlightsRow.EarningsRow(id + "-earnings-" + assetDto.getId(), new HighlightItemDto(contentDto), str, assetDto, str2));
                    }
                    if (assets.size() > 3) {
                        z2 = z;
                        arrayList.add(new SearchHighlightsRow.EarningsShowMoreButton(id + "-show-more", new HighlightItemDto(contentDto), id, z2, assets.size()));
                    }
                } else {
                    z2 = z;
                    if (!(contentDto instanceof HighlightItemDto.ContentDto.SportEventHero)) {
                        if (contentDto instanceof HighlightItemDto.ContentDto.SportCarousel) {
                            arrayList.add(new SearchHighlightsRow.SportCarousel(((HighlightItemDto.ContentDto.SportCarousel) contentDto).getValue().getId(), new HighlightItemDto(contentDto), str));
                        } else if (contentDto instanceof HighlightItemDto.ContentDto.SportsHeroCarousel) {
                            arrayList.add(new SearchHighlightsRow.SportHeroCarousel(((HighlightItemDto.ContentDto.SportsHeroCarousel) contentDto).getValue().getId(), new HighlightItemDto(contentDto), str));
                        } else if (contentDto instanceof HighlightItemDto.ContentDto.MultiContractsHeroCarousel) {
                            arrayList.add(new SearchHighlightsRow.MultiContractHeroCarousel(((HighlightItemDto.ContentDto.MultiContractsHeroCarousel) contentDto).getValue().getId(), new HighlightItemDto(contentDto), str));
                        }
                    }
                }
                z = z2;
            }
            z2 = z;
            z = z2;
        }
        return arrayList;
    }
}
