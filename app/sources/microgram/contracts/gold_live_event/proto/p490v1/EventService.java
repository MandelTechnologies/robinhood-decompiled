package microgram.contracts.gold_live_event.proto.p490v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: EventService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/EventService;", "", "Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationResponseDto;", "GetEventConfiguration", "(Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityRequestDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityResponseDto;", "UpdateEventPageVisibility", "(Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusRequestDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusResponseDto;", "UpdatePlaybackStatus", "(Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/gold_live_event/proto/v1/HandleUserDismissRequestDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/HandleUserDismissResponseDto;", "HandleUserDismiss", "(Lmicrogram/contracts/gold_live_event/proto/v1/HandleUserDismissRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.gold_live_event.proto.v1.EventService")
/* loaded from: classes14.dex */
public interface EventService {
    Flow<GetEventConfigurationResponseDto> GetEventConfiguration(GetEventConfigurationRequestDto request);

    Object HandleUserDismiss(HandleUserDismissRequestDto handleUserDismissRequestDto, Continuation<? super HandleUserDismissResponseDto> continuation);

    Object UpdateEventPageVisibility(UpdateEventPageVisibilityRequestDto updateEventPageVisibilityRequestDto, Continuation<? super UpdateEventPageVisibilityResponseDto> continuation);

    Object UpdatePlaybackStatus(UpdatePlaybackStatusRequestDto updatePlaybackStatusRequestDto, Continuation<? super UpdatePlaybackStatusResponseDto> continuation);
}
