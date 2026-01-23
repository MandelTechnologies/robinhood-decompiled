package options_product.service;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: OnboardingService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/OnboardingService;", "", "Loptions_product/service/GetNextOnboardingScreensRequestDto;", "request", "Loptions_product/service/GetNextOnboardingScreensResponseDto;", "GetNextOnboardingScreens", "(Loptions_product/service/GetNextOnboardingScreensRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/UpdateOptionsSuitabilityInfoRequestDto;", "UpdateOptionsSuitabilityInfo", "(Loptions_product/service/UpdateOptionsSuitabilityInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/GetOptionsStatusRequestDto;", "Loptions_product/service/GetOptionsStatusResponseDto;", "GetOptionsStatus", "(Loptions_product/service/GetOptionsStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/ConfirmUserAnswersRequestDto;", "", "ConfirmUserAnswers", "(Loptions_product/service/ConfirmUserAnswersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/GetAppointmentDataRequestDto;", "Loptions_product/service/GetAppointmentDataResponseDto;", "GetAppointmentData", "(Loptions_product/service/GetAppointmentDataRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/CreateChatRequestDto;", "Loptions_product/service/CreateChatResponseDto;", "CreateChat", "(Loptions_product/service/CreateChatRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface OnboardingService {
    Object ConfirmUserAnswers(ConfirmUserAnswersRequestDto confirmUserAnswersRequestDto, Continuation<? super Unit> continuation);

    Object CreateChat(CreateChatRequestDto createChatRequestDto, Continuation<? super CreateChatResponseDto> continuation);

    Object GetAppointmentData(GetAppointmentDataRequestDto getAppointmentDataRequestDto, Continuation<? super GetAppointmentDataResponseDto> continuation);

    Object GetNextOnboardingScreens(GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto, Continuation<? super GetNextOnboardingScreensResponseDto> continuation);

    Object GetOptionsStatus(GetOptionsStatusRequestDto getOptionsStatusRequestDto, Continuation<? super GetOptionsStatusResponseDto> continuation);

    Object UpdateOptionsSuitabilityInfo(UpdateOptionsSuitabilityInfoRequestDto updateOptionsSuitabilityInfoRequestDto, Continuation<Object> continuation);
}
