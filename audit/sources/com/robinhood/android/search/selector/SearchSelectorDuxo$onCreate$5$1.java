package com.robinhood.android.search.selector;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/selector/SearchSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$5$1", m3645f = "SearchSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchSelectorDuxo$onCreate$5$1 extends ContinuationImpl7 implements Function2<SearchSelectorViewState, Continuation<? super SearchSelectorViewState>, Object> {
    final /* synthetic */ List<SearchSelectorViewState3> $stockChipsSearchItems;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchSelectorDuxo$onCreate$5$1(List<? extends SearchSelectorViewState3> list, Continuation<? super SearchSelectorDuxo$onCreate$5$1> continuation) {
        super(2, continuation);
        this.$stockChipsSearchItems = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchSelectorDuxo$onCreate$5$1 searchSelectorDuxo$onCreate$5$1 = new SearchSelectorDuxo$onCreate$5$1(this.$stockChipsSearchItems, continuation);
        searchSelectorDuxo$onCreate$5$1.L$0 = obj;
        return searchSelectorDuxo$onCreate$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchSelectorViewState searchSelectorViewState, Continuation<? super SearchSelectorViewState> continuation) {
        return ((SearchSelectorDuxo$onCreate$5$1) create(searchSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SearchSelectorViewState.copy$default((SearchSelectorViewState) this.L$0, false, this.$stockChipsSearchItems, null, null, null, false, 61, null);
    }
}
