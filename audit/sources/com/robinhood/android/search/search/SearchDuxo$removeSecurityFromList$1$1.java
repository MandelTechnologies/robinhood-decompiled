package com.robinhood.android.search.search;

import com.robinhood.models.p320db.Security;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$removeSecurityFromList$1$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchDuxo$removeSecurityFromList$1$1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
    final /* synthetic */ Security $security;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchDuxo$removeSecurityFromList$1$1(Security security, Continuation<? super SearchDuxo$removeSecurityFromList$1$1> continuation) {
        super(2, continuation);
        this.$security = security;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchDuxo$removeSecurityFromList$1$1 searchDuxo$removeSecurityFromList$1$1 = new SearchDuxo$removeSecurityFromList$1$1(this.$security, continuation);
        searchDuxo$removeSecurityFromList$1$1.L$0 = obj;
        return searchDuxo$removeSecurityFromList$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
        return ((SearchDuxo$removeSecurityFromList$1$1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SearchViewState searchViewState = (SearchViewState) this.L$0;
        return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, CollectionsKt.minus(searchViewState.getInstrumentIdsInList(), this.$security.getId()), null, null, null, false, null, null, new UiEvent(this.$security), null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -132097, 3, null);
    }
}
