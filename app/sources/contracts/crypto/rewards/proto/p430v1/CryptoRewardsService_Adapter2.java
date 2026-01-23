package contracts.crypto.rewards.proto.p430v1;

import contracts.crypto.rewards.proto.p430v1.CryptoRewardsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoRewardsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "request", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "contracts.crypto.rewards.proto.v1.CryptoRewardsService_Adapter$GetCryptoDetailRewardButtonEndpoint$call$1", m3645f = "CryptoRewardsService_Adapter.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: contracts.crypto.rewards.proto.v1.CryptoRewardsService_Adapter$GetCryptoDetailRewardButtonEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class CryptoRewardsService_Adapter2 extends ContinuationImpl7 implements Function2<GetCryptoDetailRewardButtonRequestDto, Continuation<? super GetCryptoDetailRewardButtonResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoRewardsService_Adapter.GetCryptoDetailRewardButtonEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoRewardsService_Adapter2(CryptoRewardsService_Adapter.GetCryptoDetailRewardButtonEndpoint getCryptoDetailRewardButtonEndpoint, Continuation<? super CryptoRewardsService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getCryptoDetailRewardButtonEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoRewardsService_Adapter2 cryptoRewardsService_Adapter2 = new CryptoRewardsService_Adapter2(this.this$0, continuation);
        cryptoRewardsService_Adapter2.L$0 = obj;
        return cryptoRewardsService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto, Continuation<? super GetCryptoDetailRewardButtonResponseDto> continuation) {
        return ((CryptoRewardsService_Adapter2) create(getCryptoDetailRewardButtonRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoRewardsService cryptoRewardsService = this.this$0.service;
        this.label = 1;
        Object objGetCryptoDetailRewardButton = cryptoRewardsService.GetCryptoDetailRewardButton(getCryptoDetailRewardButtonRequestDto, this);
        return objGetCryptoDetailRewardButton == coroutine_suspended ? coroutine_suspended : objGetCryptoDetailRewardButton;
    }
}
