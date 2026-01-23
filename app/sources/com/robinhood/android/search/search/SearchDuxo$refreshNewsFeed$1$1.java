package com.robinhood.android.search.search;

import com.robinhood.android.search.search.SearchViewState;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$refreshNewsFeed$1$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchDuxo$refreshNewsFeed$1$1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    SearchDuxo$refreshNewsFeed$1$1(Continuation<? super SearchDuxo$refreshNewsFeed$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchDuxo$refreshNewsFeed$1$1 searchDuxo$refreshNewsFeed$1$1 = new SearchDuxo$refreshNewsFeed$1$1(continuation);
        searchDuxo$refreshNewsFeed$1$1.L$0 = obj;
        return searchDuxo$refreshNewsFeed$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
        return ((SearchDuxo$refreshNewsFeed$1$1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SearchViewState searchViewState = (SearchViewState) this.L$0;
        return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, false, null, false, null, null, null, SearchViewState.RecyclerViewItemsFetched.copy$default(searchViewState.getRecyclerViewItemsFetched(), false, true, false, 5, null), false, false, false, null, null, -269484033, 3, null);
    }
}
