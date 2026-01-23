package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import bff_crypto_trading.service.p018v1.GetCryptoDetailPageStateLoggedOutRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoDetailPageStateLoggedOutResponseDto;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateLoggedOutResponseDto;", "currencyPairId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1", m3645f = "BffCryptoTradingStore.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super GetCryptoDetailPageStateLoggedOutResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BffCryptoTradingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1(BffCryptoTradingStore bffCryptoTradingStore, Continuation<? super BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = bffCryptoTradingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1 bffCryptoTradingStore$cdpStateLoggedOutEndpoint$1 = new BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1(this.this$0, continuation);
        bffCryptoTradingStore$cdpStateLoggedOutEndpoint$1.L$0 = obj;
        return bffCryptoTradingStore$cdpStateLoggedOutEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super GetCryptoDetailPageStateLoggedOutResponseDto> continuation) {
        return ((BffCryptoTradingStore$cdpStateLoggedOutEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetCryptoDetailPageStateLoggedOutRequestDto getCryptoDetailPageStateLoggedOutRequestDto = new GetCryptoDetailPageStateLoggedOutRequestDto(string2, this.this$0.appType.toRegionCode().getServerValue());
        this.label = 1;
        Object objGetCryptoDetailPageStateLoggedOut = bffCryptoTradingService.GetCryptoDetailPageStateLoggedOut(getCryptoDetailPageStateLoggedOutRequestDto, this);
        return objGetCryptoDetailPageStateLoggedOut == coroutine_suspended ? coroutine_suspended : objGetCryptoDetailPageStateLoggedOut;
    }
}
