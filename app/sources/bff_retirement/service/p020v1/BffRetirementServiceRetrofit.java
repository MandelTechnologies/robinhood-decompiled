package bff_retirement.service.p020v1;

import com.robinhood.android.idl.common.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

/* compiled from: BffRetirementServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lbff_retirement/service/v1/BffRetirementServiceRetrofit;", "", "", "", "headers", "Lretrofit2/Response;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto;", "CapitalizeWebViewAllowedUrls", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface BffRetirementServiceRetrofit {
    @GET("bff-retirement/rollover_401k/capitalize_urls")
    Object CapitalizeWebViewAllowedUrls(@HeaderMap Map<String, String> map, Continuation<Response<CapitalizeWebViewAllowedUrlsResponseDto>> continuation);
}
