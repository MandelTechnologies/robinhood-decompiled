package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

/* compiled from: AdvisorMarketplaceServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\n\u0010\bJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceServiceRetrofit;", "", "", "", "headers", "Lretrofit2/Response;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorDashboardStateResponseDto;", "GetAdvisorDashboardState", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto;", "GetAdvisorMatches", "advisor_id", "Lbonfire/proto/idl/advisor_marketplace/v1/GetScheduleMeetingFlowResponseDto;", "GetScheduleMeetingFlow", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto;", "GetMeetingsHub", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface AdvisorMarketplaceServiceRetrofit {
    @GET("rad/advisor_marketplace/dashboard/state")
    Object GetAdvisorDashboardState(@HeaderMap Map<String, String> map, Continuation<Response<GetAdvisorDashboardStateResponseDto>> continuation);

    @GET("rad/advisor_marketplace/matches")
    Object GetAdvisorMatches(@HeaderMap Map<String, String> map, Continuation<Response<GetAdvisorMatchesResponseDto>> continuation);

    @GET("rad/advisor_marketplace/meetings_hub")
    Object GetMeetingsHub(@HeaderMap Map<String, String> map, Continuation<Response<GetMeetingsHubResponseDto>> continuation);

    @GET("rad/advisor_marketplace/schedule_meeting_flow")
    Object GetScheduleMeetingFlow(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("advisorId") String str, Continuation<Response<GetScheduleMeetingFlowResponseDto>> continuation);
}
