package com.robinhood.android.api.psp;

import com.robinhood.android.regiongate.PspRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiEligibleProgram;
import com.robinhood.models.api.bonfire.ApiProgramDetail;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.models.api.bonfire.ApiPspGiftHistoryDetail;
import com.robinhood.models.api.bonfire.ApiPspGiftItem;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PspApi.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H§@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/api/psp/PspApi;", "", "getEligiblePrograms", "Lretrofit2/Response;", "", "Lcom/robinhood/models/api/bonfire/ApiEligibleProgram;", "accountNumbers", "Lcom/robinhood/models/CommaSeparatedList;", "", "(Lcom/robinhood/models/CommaSeparatedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProgramDetail", "Lcom/robinhood/models/api/bonfire/ApiProgramDetail;", "accountNumber", "programId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enrollProgram", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "getPspGiftsHistory", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiPspGiftItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPspGiftsHistoryDetail", "Lcom/robinhood/models/api/bonfire/ApiPspGiftHistoryDetail;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PspApi {
    @POST("psp/{accountNumber}/enroll/{programId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {PspRegionGate.class})
    Object enrollProgram(@Path("accountNumber") String str, @Path("programId") UUID uuid, Continuation<? super ApiPspEnrollmentResponse> continuation);

    @GET("psp/eligible_programs/")
    @RequiresRegionGate(regionGates = {PspRegionGate.class})
    Object getEligiblePrograms(@Query("account_numbers") CommaSeparatedList<String> commaSeparatedList, Continuation<? super Response<List<ApiEligibleProgram>>> continuation);

    @GET("psp/{accountNumber}/gift_detail/{programId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {PspRegionGate.class})
    Object getProgramDetail(@Path("accountNumber") String str, @Path("programId") UUID uuid, Continuation<? super ApiProgramDetail> continuation);

    @GET("psp/gifts/history/")
    @RequiresRegionGate(regionGates = {PspRegionGate.class})
    Object getPspGiftsHistory(Continuation<? super PaginatedResult<ApiPspGiftItem>> continuation);

    @GET("psp/gifts/history/{programId}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {PspRegionGate.class})
    Object getPspGiftsHistoryDetail(@Path("programId") UUID uuid, Continuation<? super ApiPspGiftHistoryDetail> continuation);
}
