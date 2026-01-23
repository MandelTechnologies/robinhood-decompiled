package com.robinhood.store.futures.marketdata;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesMarketDataStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$seedProductHistoricalIfApplicable$quote$1", m3645f = "FuturesMarketDataStore.kt", m3646l = {202}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$seedProductHistoricalIfApplicable$quote$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesMarketDataStore7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super FuturesProduct>, Object> {
    final /* synthetic */ FuturesMarketDataStore.HistoricalParams $params;
    int label;
    final /* synthetic */ FuturesMarketDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesMarketDataStore7(FuturesMarketDataStore futuresMarketDataStore, FuturesMarketDataStore.HistoricalParams historicalParams, Continuation<? super FuturesMarketDataStore7> continuation) {
        super(2, continuation);
        this.this$0 = futuresMarketDataStore;
        this.$params = historicalParams;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesMarketDataStore7(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FuturesProduct> continuation) {
        return ((FuturesMarketDataStore7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.futuresProductStore.streamFuturesProduct(this.$params.getInstrumentId()));
        this.label = 1;
        Object objFirst = FlowKt.first(flowFilterNotNull, this);
        return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
    }
}
