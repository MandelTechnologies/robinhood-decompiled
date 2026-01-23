package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import bff_crypto_trading.service.p018v1.GetCryptoI18NRegionsRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoI18NRegionsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BffCryptoTradingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$getCryptoRegionsEndpoint$1", m3645f = "BffCryptoTradingStore.kt", m3646l = {50}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BffCryptoTradingStore$getCryptoRegionsEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super GetCryptoI18NRegionsResponseDto>, Object> {
    int label;
    final /* synthetic */ BffCryptoTradingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BffCryptoTradingStore$getCryptoRegionsEndpoint$1(BffCryptoTradingStore bffCryptoTradingStore, Continuation<? super BffCryptoTradingStore$getCryptoRegionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = bffCryptoTradingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BffCryptoTradingStore$getCryptoRegionsEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super GetCryptoI18NRegionsResponseDto> continuation) {
        return ((BffCryptoTradingStore$getCryptoRegionsEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BffCryptoTradingService bffCryptoTradingService = this.this$0.bffCryptoTradingApi;
        GetCryptoI18NRegionsRequestDto getCryptoI18NRegionsRequestDto = new GetCryptoI18NRegionsRequestDto();
        this.label = 1;
        Object objGetCryptoI18NRegions = bffCryptoTradingService.GetCryptoI18NRegions(getCryptoI18NRegionsRequestDto, this);
        return objGetCryptoI18NRegions == coroutine_suspended ? coroutine_suspended : objGetCryptoI18NRegions;
    }
}
