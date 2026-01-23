package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import bff_crypto_trading.service.p018v1.GetCryptoTokenizedStocksOrderEntryConfigRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoTokenizedStocksOrderEntryConfigResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BffCryptoTradingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "it", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1", m3645f = "BffCryptoTradingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1 extends ContinuationImpl7 implements Function2<GetCryptoTokenizedStocksOrderEntryConfigRequestDto, Continuation<? super Response<? extends GetCryptoTokenizedStocksOrderEntryConfigResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BffCryptoTradingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1(BffCryptoTradingStore bffCryptoTradingStore, Continuation<? super BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = bffCryptoTradingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1 bffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1 = new BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1(this.this$0, continuation);
        bffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1.L$0 = obj;
        return bffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GetCryptoTokenizedStocksOrderEntryConfigRequestDto getCryptoTokenizedStocksOrderEntryConfigRequestDto, Continuation<? super Response<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>> continuation) {
        return ((BffCryptoTradingStore$getTokenizedStockOrderConfigEndpoint$1) create(getCryptoTokenizedStocksOrderEntryConfigRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GetCryptoTokenizedStocksOrderEntryConfigRequestDto getCryptoTokenizedStocksOrderEntryConfigRequestDto, Continuation<? super Response<? extends GetCryptoTokenizedStocksOrderEntryConfigResponseDto>> continuation) {
        return invoke2(getCryptoTokenizedStocksOrderEntryConfigRequestDto, (Continuation<? super Response<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>>) continuation);
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
        GetCryptoTokenizedStocksOrderEntryConfigRequestDto getCryptoTokenizedStocksOrderEntryConfigRequestDto = (GetCryptoTokenizedStocksOrderEntryConfigRequestDto) this.L$0;
        BffCryptoTradingService bffCryptoTradingService = this.this$0.bffCryptoTradingApi;
        Request<GetCryptoTokenizedStocksOrderEntryConfigRequestDto> request = new Request<>(getCryptoTokenizedStocksOrderEntryConfigRequestDto, null, 2, null);
        this.label = 1;
        Object objGetCryptoTokenizedStocksOrderEntryConfig = bffCryptoTradingService.GetCryptoTokenizedStocksOrderEntryConfig(request, this);
        return objGetCryptoTokenizedStocksOrderEntryConfig == coroutine_suspended ? coroutine_suspended : objGetCryptoTokenizedStocksOrderEntryConfig;
    }
}
