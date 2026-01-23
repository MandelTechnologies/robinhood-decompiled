package com.robinhood.librobinhood.data.store.newsfeed;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.newsfeed.api.ApiNewsFeedElement;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: NewsFeedElementStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "", "param", "Lkotlin/Pair;", "", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$getFeedByTypeAndLocationEndpoint$2", m3645f = "NewsFeedElementStore.kt", m3646l = {45}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$getFeedByTypeAndLocationEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class NewsFeedElementStore5 extends ContinuationImpl7 implements Function3<Tuples2<? extends String, ? extends String>, PaginatedResult<? extends ApiNewsFeedElement>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ NewsFeedElementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsFeedElementStore5(NewsFeedElementStore newsFeedElementStore, Continuation<? super NewsFeedElementStore5> continuation) {
        super(3, continuation);
        this.this$0 = newsFeedElementStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, PaginatedResult<? extends ApiNewsFeedElement> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, (PaginatedResult<ApiNewsFeedElement>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, PaginatedResult<ApiNewsFeedElement> paginatedResult, Continuation<? super Unit> continuation) {
        NewsFeedElementStore5 newsFeedElementStore5 = new NewsFeedElementStore5(this.this$0, continuation);
        newsFeedElementStore5.L$0 = tuples2;
        newsFeedElementStore5.L$1 = paginatedResult;
        return newsFeedElementStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            PaginatedResult paginatedResult = (PaginatedResult) this.L$1;
            Function3 function3 = this.this$0.defaultSaveElementsAction;
            Object second = tuples2.getSecond();
            this.L$0 = null;
            this.label = 1;
            if (function3.invoke(second, paginatedResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
