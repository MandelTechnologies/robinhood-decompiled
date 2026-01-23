package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.GetCryptoDetailPageStateResponseDto;
import com.robinhood.shared.store.idl.IdlKeyValueStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: BffCryptoTradingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "currencyPairId", "Ljava/util/UUID;", "response", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BffCryptoTradingStore$cdpStateEndpoint$2", m3645f = "BffCryptoTradingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BffCryptoTradingStore$cdpStateEndpoint$2 extends ContinuationImpl7 implements Function3<UUID, GetCryptoDetailPageStateResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BffCryptoTradingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BffCryptoTradingStore$cdpStateEndpoint$2(BffCryptoTradingStore bffCryptoTradingStore, Continuation<? super BffCryptoTradingStore$cdpStateEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = bffCryptoTradingStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(UUID uuid, GetCryptoDetailPageStateResponseDto getCryptoDetailPageStateResponseDto, Continuation<? super Unit> continuation) {
        BffCryptoTradingStore$cdpStateEndpoint$2 bffCryptoTradingStore$cdpStateEndpoint$2 = new BffCryptoTradingStore$cdpStateEndpoint$2(this.this$0, continuation);
        bffCryptoTradingStore$cdpStateEndpoint$2.L$0 = uuid;
        bffCryptoTradingStore$cdpStateEndpoint$2.L$1 = getCryptoDetailPageStateResponseDto;
        return bffCryptoTradingStore$cdpStateEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UUID uuid = (UUID) this.L$0;
        IdlKeyValueStore.insert$default(this.this$0.idlKeyValueStore, this.this$0.cdpIdlCacheKey(uuid), (GetCryptoDetailPageStateResponseDto) this.L$1, null, 4, null);
        return Unit.INSTANCE;
    }
}
