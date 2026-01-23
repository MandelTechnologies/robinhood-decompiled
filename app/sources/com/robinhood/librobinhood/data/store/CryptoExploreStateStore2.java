package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import bff_crypto_trading.service.p018v1.GetCryptoExploreStateLoggedOutRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoExploreStateLoggedOutResponseDto;
import bff_crypto_trading.service.p018v1.GetCryptoExploreStateRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoExploreStateResponseDto;
import com.robinhood.g11n.iso.RegionCode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoExploreStateStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateResponseDto;", "it", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoExploreStateStore$getCryptoExploreStateEndpoint$1", m3645f = "CryptoExploreStateStore.kt", m3646l = {34, 36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoExploreStateStore$getCryptoExploreStateEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoExploreStateStore2 extends ContinuationImpl7 implements Function2<GetCryptoExploreStateRequestDto, Continuation<? super GetCryptoExploreStateResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoExploreStateStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoExploreStateStore2(CryptoExploreStateStore cryptoExploreStateStore, Continuation<? super CryptoExploreStateStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoExploreStateStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoExploreStateStore2 cryptoExploreStateStore2 = new CryptoExploreStateStore2(this.this$0, continuation);
        cryptoExploreStateStore2.L$0 = obj;
        return cryptoExploreStateStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCryptoExploreStateRequestDto getCryptoExploreStateRequestDto, Continuation<? super GetCryptoExploreStateResponseDto> continuation) {
        return ((CryptoExploreStateStore2) create(getCryptoExploreStateRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (GetCryptoExploreStateResponseDto) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GetCryptoExploreStateLoggedOutResponseDto getCryptoExploreStateLoggedOutResponseDto = (GetCryptoExploreStateLoggedOutResponseDto) obj;
            return new GetCryptoExploreStateResponseDto(getCryptoExploreStateLoggedOutResponseDto.getOrdering(), getCryptoExploreStateLoggedOutResponseDto.getAsset_type());
        }
        ResultKt.throwOnFailure(obj);
        GetCryptoExploreStateRequestDto getCryptoExploreStateRequestDto = (GetCryptoExploreStateRequestDto) this.L$0;
        if (this.this$0.authManager.isLoggedIn()) {
            BffCryptoTradingService bffCryptoTradingService = this.this$0.bffCryptoTradingApi;
            this.label = 1;
            obj = bffCryptoTradingService.GetCryptoExploreState(getCryptoExploreStateRequestDto, this);
        } else {
            BffCryptoTradingService bffCryptoTradingService2 = this.this$0.bffCryptoTradingApi;
            GetCryptoExploreStateLoggedOutRequestDto getCryptoExploreStateLoggedOutRequestDto = new GetCryptoExploreStateLoggedOutRequestDto(RegionCode.f5251EU.getServerValue(), getCryptoExploreStateRequestDto.getAsset_type());
            this.label = 2;
            obj = bffCryptoTradingService2.GetCryptoExploreStateLoggedOut(getCryptoExploreStateLoggedOutRequestDto, this);
        }
        return coroutine_suspended;
    }
}
