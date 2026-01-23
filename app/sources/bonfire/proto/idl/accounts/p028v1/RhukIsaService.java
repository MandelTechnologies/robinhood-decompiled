package bonfire.proto.idl.accounts.p028v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RhukIsaService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/RhukIsaService;", "", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionRequestDto;", "request", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionResponseDto;", "GetIsaBonusPromotion", "(Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;", "IsUserEligibleForAccount", "(Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface RhukIsaService {
    Object GetIsaBonusPromotion(GetIsaBonusPromotionRequestDto getIsaBonusPromotionRequestDto, Continuation<? super GetIsaBonusPromotionResponseDto> continuation);

    Object IsUserEligibleForAccount(IsUserEligibleForAccountRequestDto isUserEligibleForAccountRequestDto, Continuation<? super IsUserEligibleForAccountResponseDto> continuation);
}
