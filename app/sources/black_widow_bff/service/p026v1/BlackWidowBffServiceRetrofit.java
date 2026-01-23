package black_widow_bff.service.p026v1;

import black_widow_bff.model.p025v1.AppChannelDto;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: BlackWidowBffServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJD\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lblack_widow_bff/service/v1/BlackWidowBffServiceRetrofit;", "", "", "", "headers", "Lblack_widow_bff/service/v1/SendEmailAccessLinkRequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Lblack_widow_bff/service/v1/SendEmailAccessLinkResponseDto;", "SendEmailAccessLink", "(Ljava/util/Map;Lblack_widow_bff/service/v1/SendEmailAccessLinkRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lblack_widow_bff/model/v1/AppChannelDto;", "app_channel", "client_cached_chart_version", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto;", "MobileAppChartVersion", "(Ljava/util/Map;Lblack_widow_bff/model/v1/AppChannelDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface BlackWidowBffServiceRetrofit {
    @GET("bw/mobile-app-chart-version")
    Object MobileAppChartVersion(@HeaderMap Map<String, String> map, @Query("appChannel") AppChannelDto appChannelDto, @IdlField(protoType = "google.protobuf.StringValue") @Query("clientCachedChartVersion") String str, Continuation<Response<MobileAppChartVersionResponseDto>> continuation);

    @POST("bw/email-access-link")
    Object SendEmailAccessLink(@HeaderMap Map<String, String> map, @Body SendEmailAccessLinkRequestDto sendEmailAccessLinkRequestDto, Continuation<Response<SendEmailAccessLinkResponseDto>> continuation);
}
