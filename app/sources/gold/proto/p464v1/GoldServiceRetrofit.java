package gold.proto.p464v1;

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

/* compiled from: GoldServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\b\u0010\tJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lgold/proto/v1/GoldServiceRetrofit;", "", "", "", "headers", "source", "Lretrofit2/Response;", "Lgold/proto/v1/GetSageFlowResponseDto;", "GetSageFlow", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold/proto/v1/CreateSageApplicationRequestDto;", CarResultComposable2.BODY, "Lgold/proto/v1/CreateSageApplicationResponseDto;", "CreateSageApplication", "(Ljava/util/Map;Lgold/proto/v1/CreateSageApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold/proto/v1/GetSageRateResponseDto;", "GetSageRate", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes18.dex */
public interface GoldServiceRetrofit {
    @POST("gold/sage_application")
    Object CreateSageApplication(@HeaderMap Map<String, String> map, @Body CreateSageApplicationRequestDto createSageApplicationRequestDto, Continuation<Response<CreateSageApplicationResponseDto>> continuation);

    @GET("gold/sage_flow")
    Object GetSageFlow(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("source") String str, Continuation<Response<GetSageFlowResponseDto>> continuation);

    @GET("gold/sage_rate")
    Object GetSageRate(@HeaderMap Map<String, String> map, Continuation<Response<GetSageRateResponseDto>> continuation);
}
