package com.robinhood.android.api.recurring.retrofit;

import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiInvestmentScheduleBulkUpdateRequest;
import com.robinhood.models.api.ApiInvestmentScheduleEvent;
import com.robinhood.models.api.ApiInvestmentScheduleUpdateRequest;
import com.robinhood.models.api.ApiInvestmentScheduleUpdateRequest2;
import com.robinhood.models.api.ApiRecurringHookStartDate;
import com.robinhood.models.api.ApiScheduleAlert;
import com.robinhood.models.api.bonfire.ApiInstrumentRecurringTradability;
import com.robinhood.models.api.bonfire.ApiRecurringInsightsPageResponse;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiInvestmentScheduleRequest;
import com.robinhood.recurring.models.api.ApiNextInvestmentDate;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p479j$.time.LocalDate;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RecurringApi.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJL\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH§@¢\u0006\u0004\b\u000b\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\rH§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\n2\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u001e\u0010\u001fJf\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\n2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000fH§@¢\u0006\u0004\b\"\u0010#J.\u0010*\u001a\u00020)2\b\b\u0001\u0010$\u001a\u00020\u001b2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010(\u001a\u00020'H§@¢\u0006\u0004\b*\u0010+J$\u0010-\u001a\u00020,2\b\b\u0001\u0010$\u001a\u00020\u001b2\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\b\u0001\u0010\u0003\u001a\u00020/H§@¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u0002032\b\b\u0001\u0010\u0012\u001a\u00020\rH§@¢\u0006\u0004\b4\u0010\u0014J&\u00106\u001a\u0002052\b\b\u0001\u0010\u0012\u001a\u00020\r2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u0002082\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b9\u0010\u0014J.\u0010;\u001a\u0002082\b\b\u0001\u0010$\u001a\u00020\u001b2\b\b\u0001\u0010:\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b;\u0010<¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "", "Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;", "request", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "postInvestmentSchedule", "(Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "accountNumber", "paginationCursor", "Lcom/robinhood/models/PaginatedResult;", "getInvestmentSchedules", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "instrumentId", "Lcom/robinhood/models/CommaSeparatedList;", "assetTypes", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/CommaSeparatedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleId", "getInvestmentSchedule", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiInvestmentScheduleUpdateRequest;", "updateInvestmentSchedule", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiInvestmentScheduleUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiInvestmentScheduleBackupUpdateRequest;", "updateInvestmentScheduleBackup", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiInvestmentScheduleBackupUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "assetType", "Lcom/robinhood/models/api/ApiInvestmentScheduleEvent;", "getInvestmentScheduleEvents", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "achTransferId", "orderId", "getFilteredInvestmentScheduleEvents", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/CommaSeparatedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/recurring/models/api/ApiNextInvestmentDate;", "getNextInvestmentDate", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiRecurringHookStartDate;", "getRecurringHookStartDate", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiInvestmentScheduleBulkUpdateRequest;", "", "bulkUpdateInvestmentSchedule", "(Lcom/robinhood/models/api/ApiInvestmentScheduleBulkUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/ApiRecurringInsightsPageResponse;", "getRecurringInsightsPage", "Lcom/robinhood/models/api/ApiScheduleAlert;", "getScheduleAlert", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/ApiInstrumentRecurringTradability;", "getInstrumentRecurringTradability", "assetId", "getRecurringTradability", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RecurringApi {
    @PATCH("recurring_schedules/equity/bulk/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object bulkUpdateInvestmentSchedule(@Body ApiInvestmentScheduleBulkUpdateRequest apiInvestmentScheduleBulkUpdateRequest, Continuation<? super Unit> continuation);

    @GET("recurring_trade_logs/")
    @RequiresRegionGate(regionGates = {RecurringInvestmentRegionGate.class})
    Object getFilteredInvestmentScheduleEvents(@Query("account_number") String str, @Query("ach_transfer_id") UUID uuid, @Query("order_id") UUID uuid2, @Query("cursor") String str2, @Query("schedule_id") UUID uuid3, @Query("asset_types") CommaSeparatedList<ApiAssetType> commaSeparatedList, Continuation<? super PaginatedResult<ApiInvestmentScheduleEvent>> continuation);

    @GET("instruments/{instrumentId}/recurring_tradability/")
    @RequiresRegionGate(regionGates = {RecurringInvestmentRegionGate.class})
    Object getInstrumentRecurringTradability(@Path("instrumentId") UUID uuid, Continuation<? super ApiInstrumentRecurringTradability> continuation);

    @GET("recurring_schedules/{scheduleId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object getInvestmentSchedule(@Path("scheduleId") UUID uuid, Continuation<? super ApiInvestmentSchedule> continuation);

    @GET("recurring_trade_logs/")
    @RequiresRegionGate(regionGates = {RecurringInvestmentRegionGate.class})
    Object getInvestmentScheduleEvents(@Query("asset_types") ApiAssetType apiAssetType, @Query("account_number") String str, @Query("cursor") String str2, Continuation<? super PaginatedResult<ApiInvestmentScheduleEvent>> continuation);

    @GET("recurring_schedules/")
    @RequiresRegionGate(regionGates = {RecurringInvestmentRegionGate.class})
    Object getInvestmentSchedules(@Query("accountNumber") String str, @Query("cursor") String str2, @Query("instrument_id") UUID uuid, @Query("asset_types") CommaSeparatedList<String> commaSeparatedList, Continuation<? super PaginatedResult<ApiInvestmentSchedule>> continuation);

    @GET("recurring_schedules/")
    @RequiresRegionGate(regionGates = {RecurringInvestmentRegionGate.class})
    Object getInvestmentSchedules(@Query("accountNumber") String str, @Query("cursor") String str2, Continuation<? super PaginatedResult<ApiInvestmentSchedule>> continuation);

    @GET("recurring_schedules/{type}/next_investment_date/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object getNextInvestmentDate(@Path("type") ApiAssetType apiAssetType, @Query("frequency") ApiInvestmentSchedule.Frequency frequency, @Query("start_date") LocalDate localDate, Continuation<? super ApiNextInvestmentDate> continuation);

    @GET("recurring_schedules/{type}/hook_start_date/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object getRecurringHookStartDate(@Path("type") ApiAssetType apiAssetType, @Query("frequency") ApiInvestmentSchedule.Frequency frequency, Continuation<? super ApiRecurringHookStartDate> continuation);

    @GET("recurring/insights/{schedule_id}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object getRecurringInsightsPage(@Path("schedule_id") UUID uuid, Continuation<? super ApiRecurringInsightsPageResponse> continuation);

    @GET("recurring_tradability/{type}/{id}/")
    @RequiresRegionGate(regionGates = {RecurringInvestmentRegionGate.class})
    Object getRecurringTradability(@Path("type") ApiAssetType apiAssetType, @Path("id") UUID uuid, @Query("account_number") String str, Continuation<? super ApiInstrumentRecurringTradability> continuation);

    @GET("recurring_schedules_alert/{schedule_id}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object getScheduleAlert(@Path("schedule_id") UUID uuid, @Query("account_number") String str, Continuation<? super ApiScheduleAlert> continuation);

    @POST("recurring_schedules/")
    @RequiresRegionGate(regionGates = {RecurringInvestmentRegionGate.class})
    Object postInvestmentSchedule(@Body ApiInvestmentScheduleRequest apiInvestmentScheduleRequest, Continuation<? super ApiInvestmentSchedule> continuation);

    @PATCH("recurring_schedules/{scheduleId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object updateInvestmentSchedule(@Path("scheduleId") UUID uuid, @Body ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest, Continuation<? super ApiInvestmentSchedule> continuation);

    @PATCH("recurring_schedules/{scheduleId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecurringInvestmentRegionGate.class})
    Object updateInvestmentScheduleBackup(@Path("scheduleId") UUID uuid, @Body ApiInvestmentScheduleUpdateRequest2 apiInvestmentScheduleUpdateRequest2, Continuation<? super ApiInvestmentSchedule> continuation);

    /* compiled from: RecurringApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getFilteredInvestmentScheduleEvents$default(RecurringApi recurringApi, String str, UUID uuid, UUID uuid2, String str2, UUID uuid3, CommaSeparatedList commaSeparatedList, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFilteredInvestmentScheduleEvents");
            }
            if ((i & 16) != 0) {
                uuid3 = null;
            }
            if ((i & 32) != 0) {
                commaSeparatedList = null;
            }
            return recurringApi.getFilteredInvestmentScheduleEvents(str, uuid, uuid2, str2, uuid3, commaSeparatedList, continuation);
        }
    }
}
