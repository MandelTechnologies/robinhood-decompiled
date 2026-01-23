package com.robinhood.librobinhood.data.store;

import com.robinhood.shared.store.idl.IdlKeyValueStore;
import contracts.crypto.rewards.proto.p430v1.GetHomeRewardsButtonResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoRewardsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoRewardsStore$homeRewardsButtonEndpoint$2", m3645f = "CryptoRewardsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoRewardsStore$homeRewardsButtonEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoRewardsStore5 extends ContinuationImpl7 implements Function2<GetHomeRewardsButtonResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoRewardsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoRewardsStore5(CryptoRewardsStore cryptoRewardsStore, Continuation<? super CryptoRewardsStore5> continuation) {
        super(2, continuation);
        this.this$0 = cryptoRewardsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoRewardsStore5 cryptoRewardsStore5 = new CryptoRewardsStore5(this.this$0, continuation);
        cryptoRewardsStore5.L$0 = obj;
        return cryptoRewardsStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto, Continuation<? super Unit> continuation) {
        return ((CryptoRewardsStore5) create(getHomeRewardsButtonResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IdlKeyValueStore.insert$default(this.this$0.idlCacheStore, CryptoRewardsStore.IDL_HOME_CACHE_KEY, (GetHomeRewardsButtonResponseDto) this.L$0, null, 4, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
