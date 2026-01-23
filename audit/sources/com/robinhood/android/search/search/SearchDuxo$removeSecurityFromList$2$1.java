package com.robinhood.android.search.search;

import com.robinhood.models.p320db.Security;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$removeSecurityFromList$2$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchDuxo$removeSecurityFromList$2$1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
    final /* synthetic */ Security $security;

    /* renamed from: $t */
    final /* synthetic */ Throwable f4925$t;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchDuxo$removeSecurityFromList$2$1(Security security, Throwable th, Continuation<? super SearchDuxo$removeSecurityFromList$2$1> continuation) {
        super(2, continuation);
        this.$security = security;
        this.f4925$t = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchDuxo$removeSecurityFromList$2$1 searchDuxo$removeSecurityFromList$2$1 = new SearchDuxo$removeSecurityFromList$2$1(this.$security, this.f4925$t, continuation);
        searchDuxo$removeSecurityFromList$2$1.L$0 = obj;
        return searchDuxo$removeSecurityFromList$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
        return ((SearchDuxo$removeSecurityFromList$2$1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, new UiEvent(Tuples4.m3642to(this.$security, this.f4925$t)), null, null, false, null, false, null, null, null, null, false, false, false, null, null, -524289, 3, null);
    }
}
