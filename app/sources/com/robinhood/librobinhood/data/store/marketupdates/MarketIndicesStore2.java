package com.robinhood.librobinhood.data.store.marketupdates;

import com.robinhood.api.newsfeed.NewsFeedApi;
import com.robinhood.models.market.updates.api.ApiMarketIndices;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: MarketIndicesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/market/updates/api/ApiMarketIndices;", "keys", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.marketupdates.MarketIndicesStore$marketIndicesEndpoint$1", m3645f = "MarketIndicesStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.marketupdates.MarketIndicesStore$marketIndicesEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MarketIndicesStore2 extends ContinuationImpl7 implements Function2<List<? extends String>, Continuation<? super Response<ApiMarketIndices>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketIndicesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarketIndicesStore2(MarketIndicesStore marketIndicesStore, Continuation<? super MarketIndicesStore2> continuation) {
        super(2, continuation);
        this.this$0 = marketIndicesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketIndicesStore2 marketIndicesStore2 = new MarketIndicesStore2(this.this$0, continuation);
        marketIndicesStore2.L$0 = obj;
        return marketIndicesStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends String> list, Continuation<? super Response<ApiMarketIndices>> continuation) {
        return invoke2((List<String>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<String> list, Continuation<? super Response<ApiMarketIndices>> continuation) {
        return ((MarketIndicesStore2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
        List<String> list = (List) this.L$0;
        NewsFeedApi newsFeedApi = this.this$0.newsfeedApi;
        this.label = 1;
        Object marketIndices = newsFeedApi.getMarketIndices(list, this);
        return marketIndices == coroutine_suspended ? coroutine_suspended : marketIndices;
    }
}
