package com.robinhood.android.search.search;

import com.robinhood.android.search.search.SearchViewState;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
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
@DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$12$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchDuxo$onCreate$12$1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
    final /* synthetic */ ScreenersStore.ScreenersData $screenersData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchDuxo$onCreate$12$1(ScreenersStore.ScreenersData screenersData, Continuation<? super SearchDuxo$onCreate$12$1> continuation) {
        super(2, continuation);
        this.$screenersData = screenersData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchDuxo$onCreate$12$1 searchDuxo$onCreate$12$1 = new SearchDuxo$onCreate$12$1(this.$screenersData, continuation);
        searchDuxo$onCreate$12$1.L$0 = obj;
        return searchDuxo$onCreate$12$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
        return ((SearchDuxo$onCreate$12$1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SearchViewState searchViewState = (SearchViewState) this.L$0;
        return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, this.$screenersData, null, SearchViewState.RecyclerViewItemsFetched.copy$default(searchViewState.getRecyclerViewItemsFetched(), false, false, true, 3, null), false, false, false, null, null, -335544321, 3, null);
    }
}
