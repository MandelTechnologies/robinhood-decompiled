package com.robinhood.android.beneficiaries.api;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryDetail;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryFlowResponse;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryList;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryListsForAllAccounts;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryRequest;
import com.robinhood.android.beneficiaries.models.api.ApiSplashValuePropsResponse;
import com.robinhood.android.beneficiaries.models.api.ApiUpdateBeneficiaryRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateAccountsRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateAccountsResponse;
import com.robinhood.android.beneficiaries.models.api.ApiValidateDobRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateDobResponse;
import com.robinhood.android.beneficiaries.models.api.ApiValidateRelationshipRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateRelationshipResponse;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BeneficiariesApi.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ\"\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0018\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\"\u001a\u00020#H§@¢\u0006\u0002\u0010$J\"\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020'H§@¢\u0006\u0002\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "", "getBeneficiaryDetail", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryDetail;", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeneficiaryList", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryList;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreateBeneficiaryConfiguration", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "createBeneficiary", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryFlowResponse;", "request", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRequest;", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBeneficiary", "Lcom/robinhood/android/beneficiaries/models/api/ApiUpdateBeneficiaryRequest;", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/models/api/ApiUpdateBeneficiaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateDob", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateDobResponse;", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateDobRequest;", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/models/api/ApiValidateDobRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateRelationship", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateRelationshipResponse;", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateRelationshipRequest;", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/models/api/ApiValidateRelationshipRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBeneficiary", "", "getBeneficiaryValueProps", "Lcom/robinhood/android/beneficiaries/models/api/ApiSplashValuePropsResponse;", "getBeneficiaryListsForAllAccounts", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryListsForAllAccounts;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateBeneficiaryAccounts", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateAccountsResponse;", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateAccountsRequest;", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/models/api/ApiValidateAccountsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BeneficiariesApi {
    @POST("beneficiaries/{account_number}/beneficiary_flow/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object createBeneficiary(@Path("account_number") String str, @Body ApiCreateBeneficiaryRequest apiCreateBeneficiaryRequest, Continuation<? super ApiBeneficiaryFlowResponse> continuation);

    @DELETE("beneficiaries/{account_number}/beneficiary_flow/{beneficiary_id}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object deleteBeneficiary(@Path("account_number") String str, @Path("beneficiary_id") UUID uuid, Continuation<? super Unit> continuation);

    @GET("beneficiaries/{account_number}/beneficiary_detail/{beneficiary_id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object getBeneficiaryDetail(@Path("account_number") String str, @Path("beneficiary_id") UUID uuid, Continuation<? super ApiBeneficiaryDetail> continuation);

    @GET("beneficiaries/{account_number}/beneficiary_list/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object getBeneficiaryList(@Path("account_number") String str, Continuation<? super ApiBeneficiaryList> continuation);

    @GET("beneficiaries/beneficiary_list/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object getBeneficiaryListsForAllAccounts(Continuation<? super ApiBeneficiaryListsForAllAccounts> continuation);

    @GET("beneficiaries/{account_number}/beneficiary_splash/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object getBeneficiaryValueProps(@Path("account_number") String str, Continuation<? super ApiSplashValuePropsResponse> continuation);

    @GET("beneficiaries/{account_number}/beneficiary_flow/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object getCreateBeneficiaryConfiguration(@Path("account_number") String str, @Query("beneficiary_id") UUID uuid, Continuation<? super ApiCreateBeneficiaryConfiguration> continuation);

    @PUT("beneficiaries/{account_number}/beneficiary_flow/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object updateBeneficiary(@Path("account_number") String str, @Body ApiUpdateBeneficiaryRequest apiUpdateBeneficiaryRequest, Continuation<? super ApiBeneficiaryFlowResponse> continuation);

    @POST("beneficiaries/{account_number}/validate/accounts/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object validateBeneficiaryAccounts(@Path("account_number") String str, @Body ApiValidateAccountsRequest apiValidateAccountsRequest, Continuation<? super ApiValidateAccountsResponse> continuation);

    @POST("beneficiaries/{account_number}/validate/dob/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object validateDob(@Path("account_number") String str, @Body ApiValidateDobRequest apiValidateDobRequest, Continuation<? super ApiValidateDobResponse> continuation);

    @POST("beneficiaries/{account_number}/validate/relationship/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {BeneficiariesRegionGate.class})
    Object validateRelationship(@Path("account_number") String str, @Body ApiValidateRelationshipRequest apiValidateRelationshipRequest, Continuation<? super ApiValidateRelationshipResponse> continuation);
}
