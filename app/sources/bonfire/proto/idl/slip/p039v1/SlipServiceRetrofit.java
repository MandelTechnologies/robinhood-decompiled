package bonfire.proto.idl.slip.p039v1;

import com.robinhood.android.idl.common.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

/* compiled from: SlipServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipServiceRetrofit;", "", "GetSlipPayments", "Lretrofit2/Response;", "Lbonfire/proto/idl/slip/v1/GetSlipPaymentsResponseDto;", "headers", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface SlipServiceRetrofit {
    @GET("sms/slip/payments")
    Object GetSlipPayments(@HeaderMap Map<String, String> map, Continuation<Response<GetSlipPaymentsResponseDto>> continuation);
}
