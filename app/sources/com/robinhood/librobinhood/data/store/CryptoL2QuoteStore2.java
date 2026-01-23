package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoL2QuoteStore;
import com.robinhood.models.api.ApiCryptoL2Quote;
import com.robinhood.models.api.ApiCryptoOrderInputType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.api.retrofit.CryptoL2QuoteApi;
import com.robinhood.models.p320db.OrderSide;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: CryptoL2QuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoL2Quote;", "it", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore$Params;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoL2QuoteStore$cryptoL2QuoteEndpoint$1", m3645f = "CryptoL2QuoteStore.kt", m3646l = {41}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoL2QuoteStore$cryptoL2QuoteEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoL2QuoteStore2 extends ContinuationImpl7 implements Function2<CryptoL2QuoteStore.Params, Continuation<? super Response<ApiCryptoL2Quote>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoL2QuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoL2QuoteStore2(CryptoL2QuoteStore cryptoL2QuoteStore, Continuation<? super CryptoL2QuoteStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoL2QuoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoL2QuoteStore2 cryptoL2QuoteStore2 = new CryptoL2QuoteStore2(this.this$0, continuation);
        cryptoL2QuoteStore2.L$0 = obj;
        return cryptoL2QuoteStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoL2QuoteStore.Params params, Continuation<? super Response<ApiCryptoL2Quote>> continuation) {
        return ((CryptoL2QuoteStore2) create(params, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoL2QuoteStore.Params params = (CryptoL2QuoteStore.Params) this.L$0;
        CryptoL2QuoteApi cryptoL2QuoteApi = this.this$0.cryptoL2QuoteApi;
        UUID currencyPairId = params.getCurrencyPairId();
        ApiCryptoOrderInputType orderInputType = params.getOrderInputType();
        OrderSide orderSide = params.getOrderSide();
        BigDecimal quantity = params.getQuantity();
        MonetizationModel routingGroup = params.getRoutingGroup();
        this.label = 1;
        Object objFetchCryptoQuote = cryptoL2QuoteApi.fetchCryptoQuote(currencyPairId, orderInputType, quantity, orderSide, routingGroup, this);
        return objFetchCryptoQuote == coroutine_suspended ? coroutine_suspended : objFetchCryptoQuote;
    }
}
