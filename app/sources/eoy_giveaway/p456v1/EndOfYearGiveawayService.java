package eoy_giveaway.p456v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import messaging.proto.badge.p484v1.GetBadgeDataRequestDto;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import microgram.annotation.ManagedServices;

/* compiled from: EndOfYearGiveawayService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Leoy_giveaway/v1/EndOfYearGiveawayService;", "", "Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "GetBadgeData", "(Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Leoy_giveaway/v1/GetProgramViewModelRequestDto;", "Leoy_giveaway/v1/GetProgramViewModelResponseDto;", "GetProgramViewModel", "(Leoy_giveaway/v1/GetProgramViewModelRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Leoy_giveaway/v1/UpdateProgramViewVisibilityRequestDto;", "Leoy_giveaway/v1/UpdateProgramViewVisibilityResponseDto;", "UpdateProgramViewVisibility", "(Leoy_giveaway/v1/UpdateProgramViewVisibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leoy_giveaway/v1/UpdateAppStateRequestDto;", "Leoy_giveaway/v1/UpdateAppStateResponseDto;", "UpdateAppState", "(Leoy_giveaway/v1/UpdateAppStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leoy_giveaway/v1/HandleCanvasMessageRequestDto;", "Leoy_giveaway/v1/HandleCanvasMessageResponseDto;", "HandleCanvasMessage", "(Leoy_giveaway/v1/HandleCanvasMessageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leoy_giveaway/v1/ShowHolidayHubViewRequestDto;", "Leoy_giveaway/v1/ShowHolidayHubViewResponseDto;", "ShowHolidayHubView", "(Leoy_giveaway/v1/ShowHolidayHubViewRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "eoy_giveaway.v1.EndOfYearGiveawayService")
/* loaded from: classes18.dex */
public interface EndOfYearGiveawayService {
    Flow<GetBadgeDataResponseDto> GetBadgeData(GetBadgeDataRequestDto request);

    Flow<GetProgramViewModelResponseDto> GetProgramViewModel(GetProgramViewModelRequestDto request);

    Object HandleCanvasMessage(HandleCanvasMessageRequestDto handleCanvasMessageRequestDto, Continuation<? super HandleCanvasMessageResponseDto> continuation);

    Object ShowHolidayHubView(ShowHolidayHubViewRequestDto showHolidayHubViewRequestDto, Continuation<? super ShowHolidayHubViewResponseDto> continuation);

    Object UpdateAppState(UpdateAppStateRequestDto updateAppStateRequestDto, Continuation<? super UpdateAppStateResponseDto> continuation);

    Object UpdateProgramViewVisibility(UpdateProgramViewVisibilityRequestDto updateProgramViewVisibilityRequestDto, Continuation<? super UpdateProgramViewVisibilityResponseDto> continuation);
}
