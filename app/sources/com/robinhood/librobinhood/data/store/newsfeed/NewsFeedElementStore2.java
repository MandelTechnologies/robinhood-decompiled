package com.robinhood.librobinhood.data.store.newsfeed;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.newsfeed.api.ApiNewsFeedElement;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: NewsFeedElementStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "location", "", "paginatedElements", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$defaultSaveElementsAction$1", m3645f = "NewsFeedElementStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore$defaultSaveElementsAction$1, reason: use source file name */
/* loaded from: classes13.dex */
final class NewsFeedElementStore2 extends ContinuationImpl7 implements Function3<String, PaginatedResult<? extends ApiNewsFeedElement>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ NewsFeedElementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsFeedElementStore2(NewsFeedElementStore newsFeedElementStore, Continuation<? super NewsFeedElementStore2> continuation) {
        super(3, continuation);
        this.this$0 = newsFeedElementStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(String str, PaginatedResult<? extends ApiNewsFeedElement> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2(str, (PaginatedResult<ApiNewsFeedElement>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, PaginatedResult<ApiNewsFeedElement> paginatedResult, Continuation<? super Unit> continuation) {
        NewsFeedElementStore2 newsFeedElementStore2 = new NewsFeedElementStore2(this.this$0, continuation);
        newsFeedElementStore2.L$0 = str;
        newsFeedElementStore2.L$1 = paginatedResult;
        return newsFeedElementStore2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            this.this$0.dao.insertWithLocation((PaginatedResult) this.L$1, str);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
