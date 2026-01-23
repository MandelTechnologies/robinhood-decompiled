package hippo.service.p470v1;

import com.robinhood.android.idl.common.RhGenerated;
import hippo.model.p469v1.UXFlagNameDto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

/* compiled from: UXFlagsServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lhippo/service/v1/UXFlagsServiceRetrofit;", "", "", "", "headers", "", "Lhippo/model/v1/UXFlagNameDto;", "flags", "Lretrofit2/Response;", "Lhippo/service/v1/GetUXFlagsResponseDto;", "GetUXFlags", "(Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes18.dex */
public interface UXFlagsServiceRetrofit {
    @GET("hippo/ux-flags")
    Object GetUXFlags(@HeaderMap Map<String, String> map, @Query("flags") List<UXFlagNameDto> list, Continuation<Response<GetUXFlagsResponseDto>> continuation);
}
