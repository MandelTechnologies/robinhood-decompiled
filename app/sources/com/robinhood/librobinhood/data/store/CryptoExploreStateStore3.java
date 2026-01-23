package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.GetCryptoExploreStateResponseDto;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoExploreStateStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoExploreStateStore$getCryptoExploreStateEndpoint$2", m3645f = "CryptoExploreStateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoExploreStateStore$getCryptoExploreStateEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoExploreStateStore3 extends ContinuationImpl7 implements Function2<GetCryptoExploreStateResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoExploreStateStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoExploreStateStore3(CryptoExploreStateStore cryptoExploreStateStore, Continuation<? super CryptoExploreStateStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoExploreStateStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoExploreStateStore3 cryptoExploreStateStore3 = new CryptoExploreStateStore3(this.this$0, continuation);
        cryptoExploreStateStore3.L$0 = obj;
        return cryptoExploreStateStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCryptoExploreStateResponseDto getCryptoExploreStateResponseDto, Continuation<? super Unit> continuation) {
        return ((CryptoExploreStateStore3) create(getCryptoExploreStateResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.cryptoExploreStateDao.clearAndInsert(CryptoExploreState5.toDbModel((GetCryptoExploreStateResponseDto) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
