package bonfire.proto.idl.beneficiaries.p031v1;

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
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BeneficiariesServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u001bJZ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0002\u0010\u000eJ6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0011J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0019H§@¢\u0006\u0002\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesServiceRetrofit;", "", "GetBeneficiaryFlow", "Lretrofit2/Response;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowResponseDto;", "headers", "", "", "account_number", "beneficiary_id", "beneficiary_type", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryTypeDto;", "beneficiary_role", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryTypeDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetBeneficiaryFlowIntroViewModels", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto;", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateBeneficiary", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryResponseDto;", CarResultComposable2.BODY, "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;", "(Ljava/util/Map;Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UpdateBeneficiary", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryResponseDto;", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequestDto;", "(Ljava/util/Map;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UpdateBeneficiaryBodyTransformer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface BeneficiariesServiceRetrofit {
    @POST("rad/beneficiaries/v1/beneficiaries")
    Object CreateBeneficiary(@HeaderMap Map<String, String> map, @Body CreateBeneficiaryRequestDto createBeneficiaryRequestDto, Continuation<Response<CreateBeneficiaryResponseDto>> continuation);

    @GET("rad/beneficiaries/v1/beneficiary_flow")
    Object GetBeneficiaryFlow(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, @IdlField(protoType = "string") @Query("beneficiaryId") String str2, @Query("beneficiaryType") BeneficiaryTypeDto beneficiaryTypeDto, @Query("beneficiaryRole") BeneficiaryRoleDto beneficiaryRoleDto, Continuation<Response<GetBeneficiaryFlowResponseDto>> continuation);

    @GET("rad/beneficiaries/v1/beneficiary_flow_intro_view_models")
    Object GetBeneficiaryFlowIntroViewModels(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, Continuation<Response<GetBeneficiaryFlowIntroViewModelsResponseDto>> continuation);

    @PUT("rad/beneficiaries/v1/beneficiaries/{beneficiary_id}")
    Object UpdateBeneficiary(@HeaderMap Map<String, String> map, @Path("beneficiary_id") @IdlField(protoType = "string") String str, @ToJsonTransform(objectClass = UpdateBeneficiaryBodyTransformer.class) @Body UpdateBeneficiaryRequestDto updateBeneficiaryRequestDto, Continuation<Response<UpdateBeneficiaryResponseDto>> continuation);

    /* compiled from: BeneficiariesServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesServiceRetrofit$UpdateBeneficiaryBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequest;", "<init>", "()V", "apply", "value", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateBeneficiaryBodyTransformer implements UnaryOperator<UpdateBeneficiaryRequest> {
        public static final UpdateBeneficiaryBodyTransformer INSTANCE = new UpdateBeneficiaryBodyTransformer();

        private UpdateBeneficiaryBodyTransformer() {
        }

        @Override // java.util.function.Function
        public UpdateBeneficiaryRequest apply(UpdateBeneficiaryRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UpdateBeneficiaryRequest.copy$default(value, null, "", null, null, null, null, 61, null);
        }
    }
}
