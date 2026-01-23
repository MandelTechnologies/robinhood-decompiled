package com.robinhood.librobinhood.data.store.newsfeed;

import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.newsfeed.api.ApiNewsFeedElement;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: NewsFeedAssetElementStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedElement;", "assetId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$endpoint$1", m3645f = "NewsFeedAssetElementStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class NewsFeedAssetElementStore3 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super PaginatedResult<? extends ApiNewsFeedElement>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NewsFeedAssetElementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsFeedAssetElementStore3(NewsFeedAssetElementStore newsFeedAssetElementStore, Continuation<? super NewsFeedAssetElementStore3> continuation) {
        super(2, continuation);
        this.this$0 = newsFeedAssetElementStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewsFeedAssetElementStore3 newsFeedAssetElementStore3 = new NewsFeedAssetElementStore3(this.this$0, continuation);
        newsFeedAssetElementStore3.L$0 = obj;
        return newsFeedAssetElementStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super PaginatedResult<? extends ApiNewsFeedElement>> continuation) {
        return invoke2(uuid, (Continuation<? super PaginatedResult<ApiNewsFeedElement>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super PaginatedResult<ApiNewsFeedElement>> continuation) {
        return ((NewsFeedAssetElementStore3) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        DoraApi doraApi = this.this$0.doraApi;
        this.label = 1;
        Object feed = doraApi.getFeed(uuid, this);
        return feed == coroutine_suspended ? coroutine_suspended : feed;
    }
}
