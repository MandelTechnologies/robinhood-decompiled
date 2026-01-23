package search_coprocessor.p542v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: SearchHighlightsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/SearchHighlightsService;", "", "Lsearch_coprocessor/v1/GetSearchHighlightsRequestDto;", "request", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "GetSearchHighlights", "(Lsearch_coprocessor/v1/GetSearchHighlightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsearch_coprocessor/v1/GetSearchSubpageContentRequestDto;", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "GetSearchSubpageContent", "(Lsearch_coprocessor/v1/GetSearchSubpageContentRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsearch_coprocessor/v1/StreamSportEventHeroDetailsRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lsearch_coprocessor/v1/StreamSportEventHeroDetailsResponseDto;", "StreamSportEventHeroDetails", "(Lsearch_coprocessor/v1/StreamSportEventHeroDetailsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsRequestDto;", "Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsResponseDto;", "StreamMultiContractsHeroDetails", "(Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "search_coprocessor.v1.SearchHighlightsService")
/* loaded from: classes28.dex */
public interface SearchHighlightsService {
    Object GetSearchHighlights(GetSearchHighlightsRequestDto getSearchHighlightsRequestDto, Continuation<? super GetSearchHighlightsResponseDto> continuation);

    Object GetSearchSubpageContent(GetSearchSubpageContentRequestDto getSearchSubpageContentRequestDto, Continuation<? super GetSearchSubpageContentResponseDto> continuation);

    Flow<StreamMultiContractsHeroDetailsResponseDto> StreamMultiContractsHeroDetails(StreamMultiContractsHeroDetailsRequestDto request);

    Flow<StreamSportEventHeroDetailsResponseDto> StreamSportEventHeroDetails(StreamSportEventHeroDetailsRequestDto request);
}
