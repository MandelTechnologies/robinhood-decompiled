package bonfire.proto.idl.margin.p036v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: MaintenanceTableServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableServiceRetrofit;", "", "GetMaintenanceTable", "Lretrofit2/Response;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "headers", "", "", "account_number", "sort_by", "sort_direction", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface MaintenanceTableServiceRetrofit {
    @GET("sms/margin/{account_number}/maintenance_table")
    Object GetMaintenanceTable(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("sortBy") String str2, @IdlField(protoType = "string") @Query("sortDirection") String str3, Continuation<Response<GetMaintenanceTableResponseDto>> continuation);
}
