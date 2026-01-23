package bonfire.proto.idl.acats.p027v1;

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

/* compiled from: AcatsServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JP\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsServiceRetrofit;", "", "", "", "headers", "clawback_id", "account_number", "", "transfer_amount", "Lretrofit2/Response;", "Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsResponseDto;", "GetAcatsClawbackDetails", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto;", "GetAcatsTransferHubBottomSheet", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/ConfirmPendingJointAccountACATSRequestDto;", CarResultComposable2.BODY, "ConfirmPendingJointAccountACATS", "(Ljava/util/Map;Lbonfire/proto/idl/acats/v1/ConfirmPendingJointAccountACATSRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/CancelPendingJointAccountACATSRequestDto;", "CancelPendingJointAccountACATS", "(Ljava/util/Map;Lbonfire/proto/idl/acats/v1/CancelPendingJointAccountACATSRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface AcatsServiceRetrofit {
    @POST("rad/acats/v1/cancel_pending_joint_account_acats")
    Object CancelPendingJointAccountACATS(@HeaderMap Map<String, String> map, @Body CancelPendingJointAccountACATSRequestDto cancelPendingJointAccountACATSRequestDto, Continuation<Response<Object>> continuation);

    @POST("rad/acats/v1/confirm_pending_joint_account_acats")
    Object ConfirmPendingJointAccountACATS(@HeaderMap Map<String, String> map, @Body ConfirmPendingJointAccountACATSRequestDto confirmPendingJointAccountACATSRequestDto, Continuation<Response<Object>> continuation);

    @GET("acats/v1/clawback/details")
    Object GetAcatsClawbackDetails(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("clawbackId") String str, @IdlField(protoType = "string") @Query("accountNumber") String str2, @IdlField(protoType = "double") @Query("transferAmount") Double d, Continuation<Response<GetAcatsClawbackDetailsResponseDto>> continuation);

    @GET("rad/acats/v1/transfer_hub/bottom_sheet")
    Object GetAcatsTransferHubBottomSheet(@HeaderMap Map<String, String> map, Continuation<Response<GetAcatsTransferHubBottomSheetResponseDto>> continuation);
}
