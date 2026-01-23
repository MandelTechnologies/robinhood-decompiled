package bonfire.proto.idl.advisory.p030v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdvisoryOnboardingService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;", "", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationRequestDto;", "request", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto;", "CreateAdvisoryApplication", "(Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsResponseDto;", "GetAdvisorySwipeToSubmitDetails", "(Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface AdvisoryOnboardingService {
    Object CreateAdvisoryApplication(CreateAdvisoryApplicationRequestDto createAdvisoryApplicationRequestDto, Continuation<? super CreateAdvisoryApplicationResponseDto> continuation);

    Object GetAdvisorySwipeToSubmitDetails(GetAdvisorySwipeToSubmitDetailsRequestDto getAdvisorySwipeToSubmitDetailsRequestDto, Continuation<? super GetAdvisorySwipeToSubmitDetailsResponseDto> continuation);
}
