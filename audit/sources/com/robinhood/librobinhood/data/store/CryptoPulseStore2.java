package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshRequestDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import com.robinhood.librobinhood.data.store.CryptoPulseStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoPulseStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "params", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore$GetCryptoPulseFeedRefreshParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPulseStore$getCryptoPulseFeedRefreshEndpoint$1", m3645f = "CryptoPulseStore.kt", m3646l = {119, 117}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoPulseStore$getCryptoPulseFeedRefreshEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoPulseStore2 extends ContinuationImpl7 implements Function2<CryptoPulseStore.GetCryptoPulseFeedRefreshParams, Continuation<? super GetCryptoPulseFeedRefreshResponseDto>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CryptoPulseStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPulseStore2(CryptoPulseStore cryptoPulseStore, Continuation<? super CryptoPulseStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoPulseStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoPulseStore2 cryptoPulseStore2 = new CryptoPulseStore2(this.this$0, continuation);
        cryptoPulseStore2.L$0 = obj;
        return cryptoPulseStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoPulseStore.GetCryptoPulseFeedRefreshParams getCryptoPulseFeedRefreshParams, Continuation<? super GetCryptoPulseFeedRefreshResponseDto> continuation) {
        return ((CryptoPulseStore2) create(getCryptoPulseFeedRefreshParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoService cryptoService;
        CryptoPulseStore.GetCryptoPulseFeedRefreshParams getCryptoPulseFeedRefreshParams;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoPulseStore.GetCryptoPulseFeedRefreshParams getCryptoPulseFeedRefreshParams2 = (CryptoPulseStore.GetCryptoPulseFeedRefreshParams) this.L$0;
            cryptoService = this.this$0.cryptoService;
            CryptoPulseStore cryptoPulseStore = this.this$0;
            this.L$0 = getCryptoPulseFeedRefreshParams2;
            this.L$1 = cryptoService;
            this.label = 1;
            Object defaultCryptoAccountId = cryptoPulseStore.getDefaultCryptoAccountId(this);
            if (defaultCryptoAccountId != coroutine_suspended) {
                getCryptoPulseFeedRefreshParams = getCryptoPulseFeedRefreshParams2;
                obj = defaultCryptoAccountId;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        cryptoService = (CryptoService) this.L$1;
        getCryptoPulseFeedRefreshParams = (CryptoPulseStore.GetCryptoPulseFeedRefreshParams) this.L$0;
        ResultKt.throwOnFailure(obj);
        GetCryptoPulseFeedRefreshRequestDto getCryptoPulseFeedRefreshRequestDto = new GetCryptoPulseFeedRefreshRequestDto((String) obj, getCryptoPulseFeedRefreshParams.getCurrencyPairIds(), getCryptoPulseFeedRefreshParams.getIncludeDigest());
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objGetCryptoPulseFeedRefresh = cryptoService.GetCryptoPulseFeedRefresh(getCryptoPulseFeedRefreshRequestDto, this);
        return objGetCryptoPulseFeedRefresh == coroutine_suspended ? coroutine_suspended : objGetCryptoPulseFeedRefresh;
    }
}
