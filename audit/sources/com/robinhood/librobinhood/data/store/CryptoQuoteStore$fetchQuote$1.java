package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.models.api.ApiCryptoQuote;
import com.robinhood.models.api.fee.MonetizationModel;
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

/* compiled from: CryptoQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoQuote;", "args", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore$CryptoQuoteArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoQuoteStore$fetchQuote$1", m3645f = "CryptoQuoteStore.kt", m3646l = {116}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoQuoteStore$fetchQuote$1 extends ContinuationImpl7 implements Function2<CryptoQuoteStore.CryptoQuoteArgs, Continuation<? super Response<ApiCryptoQuote>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuoteStore$fetchQuote$1(CryptoQuoteStore cryptoQuoteStore, Continuation<? super CryptoQuoteStore$fetchQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoQuoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoQuoteStore$fetchQuote$1 cryptoQuoteStore$fetchQuote$1 = new CryptoQuoteStore$fetchQuote$1(this.this$0, continuation);
        cryptoQuoteStore$fetchQuote$1.L$0 = obj;
        return cryptoQuoteStore$fetchQuote$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoQuoteStore.CryptoQuoteArgs cryptoQuoteArgs, Continuation<? super Response<ApiCryptoQuote>> continuation) {
        return ((CryptoQuoteStore$fetchQuote$1) create(cryptoQuoteArgs, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoQuoteStore.CryptoQuoteArgs cryptoQuoteArgs = (CryptoQuoteStore.CryptoQuoteArgs) this.L$0;
        Brokeback brokeback = this.this$0.brokeback;
        UUID currencyPairId = cryptoQuoteArgs.getCurrencyPairId();
        MonetizationModel routingGroup = cryptoQuoteArgs.getRoutingGroup();
        this.label = 1;
        Object objFetchCryptoQuote = brokeback.fetchCryptoQuote(currencyPairId, routingGroup, this);
        return objFetchCryptoQuote == coroutine_suspended ? coroutine_suspended : objFetchCryptoQuote;
    }
}
