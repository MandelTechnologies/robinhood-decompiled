package identi.service.p471v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.android.idl.common.json.ToJsonTransform;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionRequest;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionRequestDto;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionResponseDto;
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
import retrofit2.http.PATCH;
import retrofit2.http.Path;

/* compiled from: IdentiIDLV1ServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lidenti/service/v1/IdentiIDLV1ServiceRetrofit;", "", "", "", "headers", "id", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;", "WorkflowAction", "(Ljava/util/Map;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lidenti/service/v1/GetFullNinResponseDto;", "GetFullNin", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WorkflowActionBodyTransformer", "identi.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes27.dex */
public interface IdentiIDLV1ServiceRetrofit {
    @GET("idl/v1/gov_id_code/get_full_nin")
    Object GetFullNin(@HeaderMap Map<String, String> map, Continuation<Response<GetFullNinResponseDto>> continuation);

    @PATCH("idl/v1/workflow/{id}")
    Object WorkflowAction(@HeaderMap Map<String, String> map, @Path("id") @IdlField(protoType = "string") String str, @ToJsonTransform(objectClass = WorkflowActionBodyTransformer.class) @Body WorkflowActionRequestDto workflowActionRequestDto, Continuation<Response<WorkflowActionResponseDto>> continuation);

    /* compiled from: IdentiIDLV1ServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/IdentiIDLV1ServiceRetrofit$WorkflowActionBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequest;", "<init>", "()V", "apply", "value", "identi.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WorkflowActionBodyTransformer implements UnaryOperator<WorkflowActionRequest> {
        public static final WorkflowActionBodyTransformer INSTANCE = new WorkflowActionBodyTransformer();

        private WorkflowActionBodyTransformer() {
        }

        @Override // java.util.function.Function
        public WorkflowActionRequest apply(WorkflowActionRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.copy((2097143 & 1) != 0 ? value.client_version : null, (2097143 & 2) != 0 ? value.screen_name : null, (2097143 & 4) != 0 ? value.block_id : null, (2097143 & 8) != 0 ? value.id : "", (2097143 & 16) != 0 ? value.entry_point_action : null, (2097143 & 32) != 0 ? value.update_app_action : null, (2097143 & 64) != 0 ? value.info_action : null, (2097143 & 128) != 0 ? value.contact_support_action : null, (2097143 & 256) != 0 ? value.sms_challenge_action : null, (2097143 & 512) != 0 ? value.device_approval_challenge_action : null, (2097143 & 1024) != 0 ? value.kyc_status_check_action : null, (2097143 & 2048) != 0 ? value.plaid_bank_list_action : null, (2097143 & 4096) != 0 ? value.plaid_auth_action : null, (2097143 & 8192) != 0 ? value.kba_action : null, (2097143 & 16384) != 0 ? value.email_challenge_action : null, (2097143 & 32768) != 0 ? value.gkba_action : null, (2097143 & 65536) != 0 ? value.request_phone_call_action : null, (2097143 & 131072) != 0 ? value.freeze_account_action : null, (2097143 & 262144) != 0 ? value.unverified_account_contact_information_action : null, (2097143 & 524288) != 0 ? value.checklist_action : null, (2097143 & 1048576) != 0 ? value.unknownFields() : null);
        }
    }
}
