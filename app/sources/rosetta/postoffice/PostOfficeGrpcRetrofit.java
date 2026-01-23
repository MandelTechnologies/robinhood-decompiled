package rosetta.postoffice;

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

/* compiled from: PostOfficeGrpcRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\tJ4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lrosetta/postoffice/PostOfficeGrpcRetrofit;", "", "ShouldBadge", "Lretrofit2/Response;", "Lrosetta/postoffice/ShouldBadgeResponseDto;", "headers", "", "", "user_uuid", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SawBadge", "Lrosetta/postoffice/SawBadgeResponseDto;", CarResultComposable2.BODY, "Lrosetta/postoffice/SawBadgeRequestDto;", "(Ljava/util/Map;Lrosetta/postoffice/SawBadgeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes25.dex */
public interface PostOfficeGrpcRetrofit {
    @POST("inbox/notifications/badge")
    Object SawBadge(@HeaderMap Map<String, String> map, @Body SawBadgeRequestDto sawBadgeRequestDto, Continuation<Response<SawBadgeResponseDto>> continuation);

    @GET("inbox/notifications/badge")
    Object ShouldBadge(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("userUuid") String str, Continuation<Response<ShouldBadgeResponseDto>> continuation);
}
