package bonfire.proto.idl.retirement.p038v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RetirementRolloverService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/RetirementRolloverService;", "", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsRequestDto;", "request", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "GetAccountDetails", "(Lbonfire/proto/idl/retirement/v1/GetAccountDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface RetirementRolloverService {
    Object GetAccountDetails(GetAccountDetailsRequestDto getAccountDetailsRequestDto, Continuation<? super GetAccountDetailsResponseDto> continuation);
}
