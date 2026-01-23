package search_coprocessor.p542v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import search_coprocessor.p542v1.SearchHighlightsService_Adapter;

/* compiled from: SearchHighlightsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "request", "Lsearch_coprocessor/v1/GetSearchHighlightsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "search_coprocessor.v1.SearchHighlightsService_Adapter$GetSearchHighlightsEndpoint$call$1", m3645f = "SearchHighlightsService_Adapter.kt", m3646l = {87}, m3647m = "invokeSuspend")
/* renamed from: search_coprocessor.v1.SearchHighlightsService_Adapter$GetSearchHighlightsEndpoint$call$1, reason: use source file name */
/* loaded from: classes28.dex */
final class SearchHighlightsService_Adapter2 extends ContinuationImpl7 implements Function2<GetSearchHighlightsRequestDto, Continuation<? super GetSearchHighlightsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchHighlightsService_Adapter.GetSearchHighlightsEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchHighlightsService_Adapter2(SearchHighlightsService_Adapter.GetSearchHighlightsEndpoint getSearchHighlightsEndpoint, Continuation<? super SearchHighlightsService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getSearchHighlightsEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchHighlightsService_Adapter2 searchHighlightsService_Adapter2 = new SearchHighlightsService_Adapter2(this.this$0, continuation);
        searchHighlightsService_Adapter2.L$0 = obj;
        return searchHighlightsService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetSearchHighlightsRequestDto getSearchHighlightsRequestDto, Continuation<? super GetSearchHighlightsResponseDto> continuation) {
        return ((SearchHighlightsService_Adapter2) create(getSearchHighlightsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        GetSearchHighlightsRequestDto getSearchHighlightsRequestDto = (GetSearchHighlightsRequestDto) this.L$0;
        SearchHighlightsService searchHighlightsService = this.this$0.service;
        this.label = 1;
        Object objGetSearchHighlights = searchHighlightsService.GetSearchHighlights(getSearchHighlightsRequestDto, this);
        return objGetSearchHighlights == coroutine_suspended ? coroutine_suspended : objGetSearchHighlights;
    }
}
