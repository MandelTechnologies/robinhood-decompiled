package midas.service.p509v1;

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

/* compiled from: MidasServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JP\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lmidas/service/v1/MidasServiceRetrofit;", "", "", "", "headers", "rhs_account_number", "feature", "logging_source", "Lretrofit2/Response;", "Lmidas/service/v1/SwitchPlansContentResponseDto;", "SwitchPlansContent", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes14.dex */
public interface MidasServiceRetrofit {
    @GET("midas-frontend/switch_plans")
    Object SwitchPlansContent(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("rhs_account_number") String str, @IdlField(protoType = "string") @Query("feature") String str2, @IdlField(protoType = "string") @Query("logging_source") String str3, Continuation<Response<SwitchPlansContentResponseDto>> continuation);
}
