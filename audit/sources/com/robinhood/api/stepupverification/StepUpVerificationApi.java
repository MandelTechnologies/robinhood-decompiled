package com.robinhood.api.stepupverification;

import com.robinhood.android.models.stepupverification.api.ApiVerificationWorkflowPrecheck;
import com.robinhood.android.models.stepupverification.api.ApiWorkflowMigratedResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: StepUpVerificationApi.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "", "verificationWorkflowPrecheck", "", "request", "Lcom/robinhood/android/models/stepupverification/api/ApiVerificationWorkflowPrecheck;", "(Lcom/robinhood/android/models/stepupverification/api/ApiVerificationWorkflowPrecheck;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWorkflowMigrated", "Lcom/robinhood/android/models/stepupverification/api/ApiWorkflowMigratedResponse;", "workflowId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface StepUpVerificationApi {
    @GET("verification_workflows/polaris_migrated/{id}/")
    Object isWorkflowMigrated(@Path("id") UUID uuid, Continuation<? super ApiWorkflowMigratedResponse> continuation);

    @POST("verification_workflows/v1/precheck/")
    Object verificationWorkflowPrecheck(@Body ApiVerificationWorkflowPrecheck apiVerificationWorkflowPrecheck, Continuation<? super Unit> continuation);
}
