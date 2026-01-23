package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Nummus;
import com.robinhood.librobinhood.data.store.CryptoPortfolioStore;
import com.robinhood.models.api.ApiCryptoPortfolio;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoPortfolio;", "args", "Lcom/robinhood/librobinhood/data/store/CryptoPortfolioStore$PortfolioArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPortfolioStore$fetchPortfolioEndpoint$1", m3645f = "CryptoPortfolioStore.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoPortfolioStore$fetchPortfolioEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoPortfolioStore2 extends ContinuationImpl7 implements Function2<CryptoPortfolioStore.PortfolioArgs, Continuation<? super ApiCryptoPortfolio>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoPortfolioStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPortfolioStore2(CryptoPortfolioStore cryptoPortfolioStore, Continuation<? super CryptoPortfolioStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoPortfolioStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoPortfolioStore2 cryptoPortfolioStore2 = new CryptoPortfolioStore2(this.this$0, continuation);
        cryptoPortfolioStore2.L$0 = obj;
        return cryptoPortfolioStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoPortfolioStore.PortfolioArgs portfolioArgs, Continuation<? super ApiCryptoPortfolio> continuation) {
        return ((CryptoPortfolioStore2) create(portfolioArgs, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoPortfolioStore.PortfolioArgs portfolioArgs = (CryptoPortfolioStore.PortfolioArgs) this.L$0;
        Nummus nummus2 = this.this$0.nummus;
        String strValueOf = String.valueOf(portfolioArgs.getCryptoAccountId());
        this.label = 1;
        Object objFetchPortfolio = nummus2.fetchPortfolio(strValueOf, this);
        return objFetchPortfolio == coroutine_suspended ? coroutine_suspended : objFetchPortfolio;
    }
}
