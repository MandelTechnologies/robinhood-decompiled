package crypto_portkey.service.p443v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.android.idl.common.json.ToJsonTransform;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: MigrationServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationServiceRetrofit;", "", "", "", "headers", "partner", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedRequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "ProcessMigrationAuthed", "(Ljava/util/Map;Ljava/lang/String;Lcrypto_portkey/service/v1/ProcessMigrationAuthedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;", "CheckMigrationEligibilityAuthed", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ProcessMigrationBodyTransformer", "ProcessMigrationAuthedBodyTransformer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes18.dex */
public interface MigrationServiceRetrofit {
    @GET("crypto-portkey/v1/migrations/{partner}/user/eligibility")
    Object CheckMigrationEligibilityAuthed(@HeaderMap Map<String, String> map, @Path("partner") @IdlField(protoType = "string") String str, Continuation<Response<CheckMigrationEligibilityAuthedResponseDto>> continuation);

    @POST("crypto-portkey/v1/migrations/{partner}/user")
    Object ProcessMigrationAuthed(@HeaderMap Map<String, String> map, @Path("partner") @IdlField(protoType = "string") String str, @ToJsonTransform(objectClass = ProcessMigrationAuthedBodyTransformer.class) @Body ProcessMigrationAuthedRequestDto processMigrationAuthedRequestDto, Continuation<Response<ProcessMigrationAuthedResponseDto>> continuation);

    /* compiled from: MigrationServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationServiceRetrofit$ProcessMigrationBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lcrypto_portkey/service/v1/ProcessMigrationRequest;", "<init>", "()V", "apply", "value", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProcessMigrationBodyTransformer implements UnaryOperator<ProcessMigrationRequest> {
        public static final ProcessMigrationBodyTransformer INSTANCE = new ProcessMigrationBodyTransformer();

        private ProcessMigrationBodyTransformer() {
        }

        @Override // java.util.function.Function
        public ProcessMigrationRequest apply(ProcessMigrationRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return ProcessMigrationRequest.copy$default(value, null, 0L, null, null, "", null, 47, null);
        }
    }

    /* compiled from: MigrationServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationServiceRetrofit$ProcessMigrationAuthedBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedRequest;", "<init>", "()V", "apply", "value", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProcessMigrationAuthedBodyTransformer implements UnaryOperator<ProcessMigrationAuthedRequest> {
        public static final ProcessMigrationAuthedBodyTransformer INSTANCE = new ProcessMigrationAuthedBodyTransformer();

        private ProcessMigrationAuthedBodyTransformer() {
        }

        @Override // java.util.function.Function
        public ProcessMigrationAuthedRequest apply(ProcessMigrationAuthedRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return ProcessMigrationAuthedRequest.copy$default(value, null, 0L, null, null, "", null, 47, null);
        }
    }
}
