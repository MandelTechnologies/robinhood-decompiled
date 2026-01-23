package com.robinhood.librobinhood.data.store.marketupdates;

import com.robinhood.models.market.updates.api.ApiMarketIndices;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: MarketIndicesStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "", "keys", "", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/market/updates/api/ApiMarketIndices;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.marketupdates.MarketIndicesStore$marketIndicesEndpoint$2", m3645f = "MarketIndicesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.marketupdates.MarketIndicesStore$marketIndicesEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class MarketIndicesStore3 extends ContinuationImpl7 implements Function3<List<? extends String>, Response<ApiMarketIndices>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MarketIndicesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarketIndicesStore3(MarketIndicesStore marketIndicesStore, Continuation<? super MarketIndicesStore3> continuation) {
        super(3, continuation);
        this.this$0 = marketIndicesStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends String> list, Response<ApiMarketIndices> response, Continuation<? super Unit> continuation) {
        return invoke2((List<String>) list, response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<String> list, Response<ApiMarketIndices> response, Continuation<? super Unit> continuation) {
        MarketIndicesStore3 marketIndicesStore3 = new MarketIndicesStore3(this.this$0, continuation);
        marketIndicesStore3.L$0 = list;
        marketIndicesStore3.L$1 = response;
        return marketIndicesStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<String> list = (List) this.L$0;
        ApiMarketIndices apiMarketIndices = (ApiMarketIndices) ((Response) this.L$1).body();
        if (apiMarketIndices != null) {
            this.this$0.dao.insert(apiMarketIndices.toDbModel(list));
        }
        return Unit.INSTANCE;
    }
}
