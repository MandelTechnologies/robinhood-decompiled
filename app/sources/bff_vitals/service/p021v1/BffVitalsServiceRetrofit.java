package bff_vitals.service.p021v1;

import bff_vitals.service.p021v1.FetchVitalsRequestDto;
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

/* compiled from: BffVitalsServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JZ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lbff_vitals/service/v1/BffVitalsServiceRetrofit;", "", "FetchVitals", "Lretrofit2/Response;", "Lbff_vitals/service/v1/FetchVitalsResponseDto;", "headers", "", "", "platform", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "app", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "os_version", "app_version", "(Ljava/util/Map;Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes.dex */
public interface BffVitalsServiceRetrofit {
    @GET("vitals/fetch")
    Object FetchVitals(@HeaderMap Map<String, String> map, @Query("platform") FetchVitalsRequestDto.PlatformDto platformDto, @Query("app") FetchVitalsRequestDto.AppDto appDto, @IdlField(protoType = "string") @Query("osVersion") String str, @IdlField(protoType = "string") @Query("appVersion") String str2, Continuation<Response<FetchVitalsResponseDto>> continuation);
}
