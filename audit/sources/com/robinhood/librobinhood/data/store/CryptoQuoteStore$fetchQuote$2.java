package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoQuote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: CryptoQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoQuoteStore$fetchQuote$2", m3645f = "CryptoQuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class CryptoQuoteStore$fetchQuote$2 extends ContinuationImpl7 implements Function2<Response<ApiCryptoQuote>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuoteStore$fetchQuote$2(CryptoQuoteStore cryptoQuoteStore, Continuation<? super CryptoQuoteStore$fetchQuote$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoQuoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoQuoteStore$fetchQuote$2 cryptoQuoteStore$fetchQuote$2 = new CryptoQuoteStore$fetchQuote$2(this.this$0, continuation);
        cryptoQuoteStore$fetchQuote$2.L$0 = obj;
        return cryptoQuoteStore$fetchQuote$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiCryptoQuote> response, Continuation<? super Unit> continuation) {
        return ((CryptoQuoteStore$fetchQuote$2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiCryptoQuote apiCryptoQuote = (ApiCryptoQuote) ((Response) this.L$0).body();
        if (apiCryptoQuote != null) {
            this.this$0.dao.insert(apiCryptoQuote);
        }
        return Unit.INSTANCE;
    }
}
