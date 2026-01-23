package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRequestDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoPulseStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPulseStore$getPulseFeedEndpoint$1", m3645f = "CryptoPulseStore.kt", m3646l = {76, 74}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoPulseStore$getPulseFeedEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoPulseStore4 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super GetCryptoPulseFeedResponseDto>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CryptoPulseStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPulseStore4(CryptoPulseStore cryptoPulseStore, Continuation<? super CryptoPulseStore4> continuation) {
        super(2, continuation);
        this.this$0 = cryptoPulseStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoPulseStore4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super GetCryptoPulseFeedResponseDto> continuation) {
        return ((CryptoPulseStore4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoService cryptoService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cryptoService = this.this$0.cryptoService;
            CryptoPulseStore cryptoPulseStore = this.this$0;
            this.L$0 = cryptoService;
            this.label = 1;
            obj = cryptoPulseStore.getDefaultCryptoAccountId(this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        cryptoService = (CryptoService) this.L$0;
        ResultKt.throwOnFailure(obj);
        GetCryptoPulseFeedRequestDto getCryptoPulseFeedRequestDto = new GetCryptoPulseFeedRequestDto((String) obj);
        this.L$0 = null;
        this.label = 2;
        Object objGetCryptoPulseFeed = cryptoService.GetCryptoPulseFeed(getCryptoPulseFeedRequestDto, this);
        return objGetCryptoPulseFeed == coroutine_suspended ? coroutine_suspended : objGetCryptoPulseFeed;
    }
}
