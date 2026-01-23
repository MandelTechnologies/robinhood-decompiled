package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoL2Quote;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoL2Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoL2QuoteStore$cryptoL2QuoteEndpoint$2", m3645f = "CryptoL2QuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoL2QuoteStore$cryptoL2QuoteEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoL2QuoteStore3 extends ContinuationImpl7 implements Function2<Response<ApiCryptoL2Quote>, Continuation<? super Unit>, Object> {
    int label;

    CryptoL2QuoteStore3(Continuation<? super CryptoL2QuoteStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoL2QuoteStore3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiCryptoL2Quote> response, Continuation<? super Unit> continuation) {
        return ((CryptoL2QuoteStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
