package com.robinhood.store.futures.marketdata;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import java.util.UUID;
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
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$seedProductHistoricalIfApplicable$quote$2$quote$1$1", m3645f = "FuturesMarketDataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$seedProductHistoricalIfApplicable$quote$2$quote$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesMarketDataStore8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super FuturesQuote>, Object> {
    final /* synthetic */ UUID $contractId;
    int label;
    final /* synthetic */ FuturesMarketDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesMarketDataStore8(FuturesMarketDataStore futuresMarketDataStore, UUID uuid, Continuation<? super FuturesMarketDataStore8> continuation) {
        super(2, continuation);
        this.this$0 = futuresMarketDataStore;
        this.$contractId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesMarketDataStore8(this.this$0, this.$contractId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FuturesQuote> continuation) {
        return ((FuturesMarketDataStore8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Flow flowFilterNotNull = FlowKt.filterNotNull(FuturesQuoteStore.getQuote$default(this.this$0.futuresQuoteStore, this.$contractId, null, 2, null));
        this.label = 1;
        Object objFirst = FlowKt.first(flowFilterNotNull, this);
        return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
    }
}
