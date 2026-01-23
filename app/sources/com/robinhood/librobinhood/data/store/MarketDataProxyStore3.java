package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import com.robinhood.shared.store.idl.IdlKeyValueStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import md_server_proxy.service.p483v1.GetQuotesResponseDto;

/* compiled from: MarketDataProxyStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore$TokenQuoteRequest;", "response", "Lmd_server_proxy/service/v1/GetQuotesResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$quoteEndpoint$2", m3645f = "MarketDataProxyStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$quoteEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class MarketDataProxyStore3 extends ContinuationImpl7 implements Function3<MarketDataProxyStore.TokenQuoteRequest, GetQuotesResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MarketDataProxyStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarketDataProxyStore3(MarketDataProxyStore marketDataProxyStore, Continuation<? super MarketDataProxyStore3> continuation) {
        super(3, continuation);
        this.this$0 = marketDataProxyStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(MarketDataProxyStore.TokenQuoteRequest tokenQuoteRequest, GetQuotesResponseDto getQuotesResponseDto, Continuation<? super Unit> continuation) {
        MarketDataProxyStore3 marketDataProxyStore3 = new MarketDataProxyStore3(this.this$0, continuation);
        marketDataProxyStore3.L$0 = tokenQuoteRequest;
        marketDataProxyStore3.L$1 = getQuotesResponseDto;
        return marketDataProxyStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MarketDataProxyStore.TokenQuoteRequest tokenQuoteRequest = (MarketDataProxyStore.TokenQuoteRequest) this.L$0;
        IdlKeyValueStore.insert$default(this.this$0.idlKeyValueStore, MarketDataProxyStore.INSTANCE.tokenQuoteKey$lib_store_crypto_externalDebug(tokenQuoteRequest), (GetQuotesResponseDto) this.L$1, null, 4, null);
        return Unit.INSTANCE;
    }
}
