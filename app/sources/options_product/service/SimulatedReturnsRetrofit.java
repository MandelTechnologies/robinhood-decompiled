package options_product.service;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/* compiled from: SimulatedReturnsRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsRetrofit;", "", "", "", "headers", "Loptions_product/service/GetSimulatedReturnsParamsV4RequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Loptions_product/service/SimulatedReturnsParamsResponseDto;", "GetSimulatedReturnsParamsV4", "(Ljava/util/Map;Loptions_product/service/GetSimulatedReturnsParamsV4RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes25.dex */
public interface SimulatedReturnsRetrofit {
    @POST("options-product/simulated-returns/configuration/v4")
    Object GetSimulatedReturnsParamsV4(@HeaderMap Map<String, String> map, @Body GetSimulatedReturnsParamsV4RequestDto getSimulatedReturnsParamsV4RequestDto, Continuation<Response<SimulatedReturnsParamsResponseDto>> continuation);
}
