package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdvisorMarketplaceService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceService;", "", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorDashboardStateRequestDto;", "request", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorDashboardStateResponseDto;", "GetAdvisorDashboardState", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorDashboardStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesRequestDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto;", "GetAdvisorMatches", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowRequestDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowResponseDto;", "GetScheduleMeetingFlow", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubRequestDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto;", "GetMeetingsHub", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface AdvisorMarketplaceService {
    Object GetAdvisorDashboardState(GetAdvisorDashboardStateRequestDto getAdvisorDashboardStateRequestDto, Continuation<? super GetAdvisorDashboardStateResponseDto> continuation);

    Object GetAdvisorMatches(GetAdvisorMatchesRequestDto getAdvisorMatchesRequestDto, Continuation<? super GetAdvisorMatchesResponseDto> continuation);

    Object GetMeetingsHub(GetMeetingsHubRequestDto getMeetingsHubRequestDto, Continuation<? super GetMeetingsHubResponseDto> continuation);

    Object GetScheduleMeetingFlow(GetScheduleMeetingFlowRequestDto getScheduleMeetingFlowRequestDto, Continuation<? super GetScheduleMeetingFlowResponseDto> continuation);
}
