package com.robinhood.librobinhood.data.store;

import com.robinhood.shared.crypto.microgram.service.CryptoRewardsCachedService;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonRequestDto;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoRewardsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "it", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoRewardsStore$cdpRewardsButtonEndpoint$1", m3645f = "CryptoRewardsStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoRewardsStore$cdpRewardsButtonEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoRewardsStore2 extends ContinuationImpl7 implements Function2<GetCryptoDetailRewardButtonRequestDto, Continuation<? super GetCryptoDetailRewardButtonResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoRewardsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoRewardsStore2(CryptoRewardsStore cryptoRewardsStore, Continuation<? super CryptoRewardsStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoRewardsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoRewardsStore2 cryptoRewardsStore2 = new CryptoRewardsStore2(this.this$0, continuation);
        cryptoRewardsStore2.L$0 = obj;
        return cryptoRewardsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto, Continuation<? super GetCryptoDetailRewardButtonResponseDto> continuation) {
        return ((CryptoRewardsStore2) create(getCryptoDetailRewardButtonRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto = (GetCryptoDetailRewardButtonRequestDto) this.L$0;
        CryptoRewardsCachedService cryptoRewardsCachedService = this.this$0.cryptoRewardsCachedService;
        this.label = 1;
        Object objGetCryptoDetailRewardButton = cryptoRewardsCachedService.GetCryptoDetailRewardButton(getCryptoDetailRewardButtonRequestDto, this);
        return objGetCryptoDetailRewardButton == coroutine_suspended ? coroutine_suspended : objGetCryptoDetailRewardButton;
    }
}
