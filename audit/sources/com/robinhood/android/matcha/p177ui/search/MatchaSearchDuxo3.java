package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.android.store.matcha.MatchaSearchStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onStart$4$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaSearchDuxo3 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
    final /* synthetic */ MatchaSearchStore.SearchResponse $searchResponse;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaSearchDuxo3(MatchaSearchStore.SearchResponse searchResponse, Continuation<? super MatchaSearchDuxo3> continuation) {
        super(2, continuation);
        this.$searchResponse = searchResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaSearchDuxo3 matchaSearchDuxo3 = new MatchaSearchDuxo3(this.$searchResponse, continuation);
        matchaSearchDuxo3.L$0 = obj;
        return matchaSearchDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
        return ((MatchaSearchDuxo3) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaSearchDataState.copy$default((MatchaSearchDataState) this.L$0, false, null, null, null, this.$searchResponse, null, null, null, null, false, null, null, null, 8175, null);
    }
}
