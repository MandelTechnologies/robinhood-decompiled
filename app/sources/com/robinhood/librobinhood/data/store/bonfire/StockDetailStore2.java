package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: StockDetailStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiStockDetail;", "instrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$endpoint$1", m3645f = "StockDetailStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.StockDetailStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class StockDetailStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiStockDetail>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StockDetailStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StockDetailStore2(StockDetailStore stockDetailStore, Continuation<? super StockDetailStore2> continuation) {
        super(2, continuation);
        this.this$0 = stockDetailStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StockDetailStore2 stockDetailStore2 = new StockDetailStore2(this.this$0, continuation);
        stockDetailStore2.L$0 = obj;
        return stockDetailStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiStockDetail> continuation) {
        return ((StockDetailStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BonfireApi bonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object instrumentDetail = bonfireApi.getInstrumentDetail(uuid, this);
        return instrumentDetail == coroutine_suspended ? coroutine_suspended : instrumentDetail;
    }
}
