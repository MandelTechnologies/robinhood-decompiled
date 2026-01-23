package com.robinhood.librobinhood.data.store.newsfeed;

import com.robinhood.api.retrofit.DoraApi;
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
import kotlin.jvm.functions.Function2;

/* compiled from: NewsFeedElementStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedElement;", "param", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$getFeedByTypeAndLocationEndpoint$1", m3645f = "NewsFeedElementStore.kt", m3646l = {41}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$getFeedByTypeAndLocationEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class NewsFeedElementStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super PaginatedResult<? extends ApiNewsFeedElement>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NewsFeedElementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsFeedElementStore4(NewsFeedElementStore newsFeedElementStore, Continuation<? super NewsFeedElementStore4> continuation) {
        super(2, continuation);
        this.this$0 = newsFeedElementStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewsFeedElementStore4 newsFeedElementStore4 = new NewsFeedElementStore4(this.this$0, continuation);
        newsFeedElementStore4.L$0 = obj;
        return newsFeedElementStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super PaginatedResult<? extends ApiNewsFeedElement>> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, (Continuation<? super PaginatedResult<ApiNewsFeedElement>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super PaginatedResult<ApiNewsFeedElement>> continuation) {
        return ((NewsFeedElementStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        DoraApi doraApi = this.this$0.doraApi;
        String str = (String) tuples2.getFirst();
        String str2 = (String) tuples2.getSecond();
        this.label = 1;
        Object feedByTypeAndLocation = doraApi.getFeedByTypeAndLocation(str, str2, this);
        return feedByTypeAndLocation == coroutine_suspended ? coroutine_suspended : feedByTypeAndLocation;
    }
}
