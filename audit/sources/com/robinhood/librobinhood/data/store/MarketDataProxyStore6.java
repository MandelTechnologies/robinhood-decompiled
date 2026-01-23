package com.robinhood.librobinhood.data.store;

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
import md_server_proxy.service.p483v1.GetFundamentalsResponseDto;

/* compiled from: MarketDataProxyStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "currencyPairId", "Ljava/util/UUID;", "response", "Lmd_server_proxy/service/v1/GetFundamentalsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MarketDataProxyStore$tokenFundamentalsEndpoint$2", m3645f = "MarketDataProxyStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.MarketDataProxyStore$tokenFundamentalsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class MarketDataProxyStore6 extends ContinuationImpl7 implements Function3<UUID, GetFundamentalsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MarketDataProxyStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarketDataProxyStore6(MarketDataProxyStore marketDataProxyStore, Continuation<? super MarketDataProxyStore6> continuation) {
        super(3, continuation);
        this.this$0 = marketDataProxyStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(UUID uuid, GetFundamentalsResponseDto getFundamentalsResponseDto, Continuation<? super Unit> continuation) {
        MarketDataProxyStore6 marketDataProxyStore6 = new MarketDataProxyStore6(this.this$0, continuation);
        marketDataProxyStore6.L$0 = uuid;
        marketDataProxyStore6.L$1 = getFundamentalsResponseDto;
        return marketDataProxyStore6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UUID uuid = (UUID) this.L$0;
        IdlKeyValueStore.insert$default(this.this$0.idlKeyValueStore, MarketDataProxyStore.INSTANCE.tokenFundamentalsKey$lib_store_crypto_externalDebug(uuid), (GetFundamentalsResponseDto) this.L$1, null, 4, null);
        return Unit.INSTANCE;
    }
}
