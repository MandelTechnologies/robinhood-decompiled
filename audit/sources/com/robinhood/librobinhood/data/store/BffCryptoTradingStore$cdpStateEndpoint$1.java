package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import bff_crypto_trading.service.p018v1.GetCryptoDetailPageStateRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoDetailPageStateResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BffCryptoTradingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateResponseDto;", "currencyPairId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpStateEndpoint$1", m3645f = "BffCryptoTradingStore.kt", m3646l = {62}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BffCryptoTradingStore$cdpStateEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super GetCryptoDetailPageStateResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BffCryptoTradingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BffCryptoTradingStore$cdpStateEndpoint$1(BffCryptoTradingStore bffCryptoTradingStore, Continuation<? super BffCryptoTradingStore$cdpStateEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = bffCryptoTradingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BffCryptoTradingStore$cdpStateEndpoint$1 bffCryptoTradingStore$cdpStateEndpoint$1 = new BffCryptoTradingStore$cdpStateEndpoint$1(this.this$0, continuation);
        bffCryptoTradingStore$cdpStateEndpoint$1.L$0 = obj;
        return bffCryptoTradingStore$cdpStateEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super GetCryptoDetailPageStateResponseDto> continuation) {
        return ((BffCryptoTradingStore$cdpStateEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        BffCryptoTradingService bffCryptoTradingService = this.this$0.bffCryptoTradingApi;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        GetCryptoDetailPageStateRequestDto getCryptoDetailPageStateRequestDto = new GetCryptoDetailPageStateRequestDto(string2);
        this.label = 1;
        Object objGetCryptoDetailPageState = bffCryptoTradingService.GetCryptoDetailPageState(getCryptoDetailPageStateRequestDto, this);
        return objGetCryptoDetailPageState == coroutine_suspended ? coroutine_suspended : objGetCryptoDetailPageState;
    }
}
