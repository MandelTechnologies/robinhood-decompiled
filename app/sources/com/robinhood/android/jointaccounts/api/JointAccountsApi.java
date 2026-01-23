package com.robinhood.android.jointaccounts.api;

import com.robinhood.android.jointaccounts.DeeplinkTargetsKt;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondarySubmittedViewModel;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondaryViewModel;
import com.robinhood.models.jointaccounts.api.confirmation.ApiRejectInvitationRequest;
import com.robinhood.models.jointaccounts.api.confirmation.ApiRejectSecondarySuccessViewModel;
import com.robinhood.models.jointaccounts.api.confirmation.ApiSecondarySetupViewModel;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountOnboardingPrimaryPostAgreementsViewModel;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountPrimaryIntroResponse;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountSecondaryIntroResponse;
import com.robinhood.models.jointaccounts.api.users.ApiJointUsers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: JointAccountsApi.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "", "getPrimaryOnboardingPostAgreements", "Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountOnboardingPrimaryPostAgreementsViewModel;", "invitationId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrimaryIntro", "Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountPrimaryIntroResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSecondaryIntro", "Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountSecondaryIntroResponse;", "getSecondaryIntroLoggedOut", "getSecondaryConfirmation", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel;", "confirmSecondary", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondarySubmittedViewModel;", "rejectInvitation", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiRejectSecondarySuccessViewModel;", "request", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiRejectInvitationRequest;", "(Lcom/robinhood/models/jointaccounts/api/confirmation/ApiRejectInvitationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSecondarySetup", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiSecondarySetupViewModel;", "getJointUsers", "Lcom/robinhood/models/jointaccounts/api/users/ApiJointUsers;", "accountNumber", "lib-api-joint-accounts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface JointAccountsApi {
    @POST("joint_accounts/new_user_experience/{invitation_id}/confirm_secondary/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object confirmSecondary(@Path(DeeplinkTargetsKt.INVITATION_ID_QUERY_KEY) String str, Continuation<? super ApiConfirmSecondarySubmittedViewModel> continuation);

    @GET("accounts/{accountNumber}/joint_users")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object getJointUsers(@Path("accountNumber") String str, Continuation<? super ApiJointUsers> continuation);

    @GET("joint_accounts/onboarding/primary_intro")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object getPrimaryIntro(Continuation<? super ApiJointAccountPrimaryIntroResponse> continuation);

    @GET("joint_accounts/onboarding/primary_post_agreements")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object getPrimaryOnboardingPostAgreements(@Query(DeeplinkTargetsKt.INVITATION_ID_QUERY_KEY) String str, Continuation<? super ApiJointAccountOnboardingPrimaryPostAgreementsViewModel> continuation);

    @GET("joint_accounts/new_user_experience/secondary_confirmation")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object getSecondaryConfirmation(@Query(DeeplinkTargetsKt.INVITATION_ID_QUERY_KEY) String str, Continuation<? super ApiConfirmSecondaryViewModel> continuation);

    @GET("joint_accounts/onboarding/secondary_intro")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object getSecondaryIntro(@Query(DeeplinkTargetsKt.INVITATION_ID_QUERY_KEY) String str, Continuation<? super ApiJointAccountSecondaryIntroResponse> continuation);

    @GET("joint_accounts/onboarding/secondary_intro_logged_out")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object getSecondaryIntroLoggedOut(Continuation<? super ApiJointAccountSecondaryIntroResponse> continuation);

    @GET("joint_accounts/new_user_experience/secondary_setup_steps")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object getSecondarySetup(@Query(DeeplinkTargetsKt.INVITATION_ID_QUERY_KEY) String str, Continuation<? super ApiSecondarySetupViewModel> continuation);

    @POST("joint_accounts/new_user_experience/reject_invitation/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object rejectInvitation(@Body ApiRejectInvitationRequest apiRejectInvitationRequest, Continuation<? super ApiRejectSecondarySuccessViewModel> continuation);
}
