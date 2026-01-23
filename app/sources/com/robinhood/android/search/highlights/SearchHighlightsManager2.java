package com.robinhood.android.search.highlights;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import search_coprocessor.p542v1.GetSearchSubpageContentResponseDto;

/* compiled from: SearchHighlightsManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2$responses$1$1", m3645f = "SearchHighlightsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.search.highlights.SearchHighlightsManager$refreshSubpagesIfNeeded$2$responses$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SearchHighlightsManager2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super GetSearchSubpageContentResponseDto>, Object> {
    final /* synthetic */ String $subpageId;
    int label;
    final /* synthetic */ SearchHighlightsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchHighlightsManager2(SearchHighlightsManager searchHighlightsManager, String str, Continuation<? super SearchHighlightsManager2> continuation) {
        super(2, continuation);
        this.this$0 = searchHighlightsManager;
        this.$subpageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchHighlightsManager2(this.this$0, this.$subpageId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetSearchSubpageContentResponseDto> continuation) {
        return ((SearchHighlightsManager2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SearchHighlightsManager searchHighlightsManager = this.this$0;
        String str = this.$subpageId;
        this.label = 1;
        Object objFetchSearchSubpageContent = searchHighlightsManager.fetchSearchSubpageContent(str, this);
        return objFetchSearchSubpageContent == coroutine_suspended ? coroutine_suspended : objFetchSearchSubpageContent;
    }
}
