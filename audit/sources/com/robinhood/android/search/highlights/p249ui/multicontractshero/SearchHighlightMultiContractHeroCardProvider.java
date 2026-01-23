package com.robinhood.android.search.highlights.p249ui.multicontractshero;

import android.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.search.highlights.p249ui.common.UtilsKt;
import com.robinhood.android.search.highlights.p249ui.multicontractshero.SearchHighlightMultiContractHeroCardViewState;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import search_coprocessor.p542v1.CustomColorDto;
import search_coprocessor.p542v1.MultiContractsHeroDetailsDto;

/* compiled from: SearchHighlightMultiContractHeroCardProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardDataState;", "Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState;", "<init>", "()V", "reduce", "dataState", "toContractDisplayInfo", "Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState$ContractDisplayInfo;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHighlightMultiContractHeroCardProvider implements StateProvider<SearchHighlightMultiContractHeroCardDataState, SearchHighlightMultiContractHeroCardViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SearchHighlightMultiContractHeroCardViewState reduce(SearchHighlightMultiContractHeroCardDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MultiContractsHeroDetailsDto heroDetails = dataState.getHeroDetails();
        if (heroDetails == null) {
            return new SearchHighlightMultiContractHeroCardViewState(false, null, null, null, null, null, 63, null);
        }
        UUID eventId = dataState.getEventId();
        String title = heroDetails.getTitle();
        String headline = heroDetails.getHeadline();
        MultiContractsHeroDetailsDto.DisplayStyleDto style = heroDetails.getStyle();
        List<MultiContractsHeroDetailsDto.ContractInfoDto> contracts2 = heroDetails.getContracts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contracts2, 10));
        Iterator<T> it = contracts2.iterator();
        while (it.hasNext()) {
            arrayList.add(toContractDisplayInfo((MultiContractsHeroDetailsDto.ContractInfoDto) it.next()));
        }
        return new SearchHighlightMultiContractHeroCardViewState(false, eventId, title, headline, extensions2.toPersistentList(arrayList), style);
    }

    private final SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo toContractDisplayInfo(MultiContractsHeroDetailsDto.ContractInfoDto contractInfoDto) {
        DayNightColor dayNightColorDayNightFallbackColor;
        String id = contractInfoDto.getId();
        String title = contractInfoDto.getTitle();
        String display_value = contractInfoDto.getDisplay_value();
        float graph_relative_length = (float) contractInfoDto.getGraph_relative_length();
        CustomColorDto color = contractInfoDto.getColor();
        if (color != null) {
            dayNightColorDayNightFallbackColor = new DayNightColor(Color2.Color(Color.parseColor(color.getLight())), Color2.Color(Color.parseColor(color.getDark())), null);
        } else {
            dayNightColorDayNightFallbackColor = UtilsKt.dayNightFallbackColor();
        }
        return new SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo(id, title, display_value, graph_relative_length, dayNightColorDayNightFallbackColor, contractInfoDto.getHighlighted());
    }
}
