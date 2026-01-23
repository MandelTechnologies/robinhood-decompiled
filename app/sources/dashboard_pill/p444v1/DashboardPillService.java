package dashboard_pill.p444v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import messaging.proto.badge.p484v1.GetBadgeDataRequestDto;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import microgram.annotation.ManagedServices;

/* compiled from: DashboardPillService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ldashboard_pill/v1/DashboardPillService;", "", "Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "GetBadgeData", "(Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ldashboard_pill/v1/ClearNotificationDotRequestDto;", "Ldashboard_pill/v1/ClearNotificationDotResponseDto;", "ClearNotificationDot", "(Ldashboard_pill/v1/ClearNotificationDotRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldashboard_pill/v1/AppStateChangedRequestDto;", "Ldashboard_pill/v1/AppStateChangedResponseDto;", "AppStateChanged", "(Ldashboard_pill/v1/AppStateChangedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldashboard_pill/v1/SetVisibleLocationRequestDto;", "Ldashboard_pill/v1/SetVisibleLocationResponseDto;", "SetVisibleLocation", "(Ldashboard_pill/v1/SetVisibleLocationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dashboard_pill.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "dashboard_pill.v1.DashboardPillService")
/* loaded from: classes18.dex */
public interface DashboardPillService {
    Object AppStateChanged(AppStateChangedRequestDto appStateChangedRequestDto, Continuation<? super AppStateChangedResponseDto> continuation);

    Object ClearNotificationDot(ClearNotificationDotRequestDto clearNotificationDotRequestDto, Continuation<? super ClearNotificationDotResponseDto> continuation);

    Flow<GetBadgeDataResponseDto> GetBadgeData(GetBadgeDataRequestDto request);

    Object SetVisibleLocation(SetVisibleLocationRequestDto setVisibleLocationRequestDto, Continuation<? super SetVisibleLocationResponseDto> continuation);
}
