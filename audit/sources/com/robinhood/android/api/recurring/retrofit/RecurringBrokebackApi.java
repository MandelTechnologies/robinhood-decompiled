package com.robinhood.android.api.recurring.retrofit;

import com.robinhood.android.regiongate.DripRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAccountDripSettings;
import com.robinhood.models.api.ApiDripEnrollment;
import com.robinhood.models.api.ApiDripSettingsRequest;
import com.robinhood.models.api.ApiInstrumentDripSettings;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RecurringBrokebackApi.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/api/recurring/retrofit/RecurringBrokebackApi;", "", "patchAccountDripSettings", "Lcom/robinhood/models/api/ApiAccountDripSettings;", "accountNumber", "", "request", "Lcom/robinhood/models/api/ApiDripSettingsRequest;", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiDripSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstrumentDripSettings", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiInstrumentDripSettings;", "paginationCursor", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patchInstrumentDripSettings", "instrumentId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/api/ApiDripSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDripEnrollment", "Lcom/robinhood/models/api/ApiDripEnrollment;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RecurringBrokebackApi {
    @GET("corp_actions/drip/enrollment/{accountNumber}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {DripRegionGate.class})
    Object getDripEnrollment(@Path("accountNumber") String str, Continuation<? super ApiDripEnrollment> continuation);

    @GET("corp_actions/drip/instrument_settings/{accountNumber}/")
    @RequiresRegionGate(regionGates = {DripRegionGate.class})
    Object getInstrumentDripSettings(@Path("accountNumber") String str, @Query("cursor") String str2, Continuation<? super PaginatedResult<ApiInstrumentDripSettings>> continuation);

    @PATCH("corp_actions/drip/account_settings/{accountNumber}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {DripRegionGate.class})
    Object patchAccountDripSettings(@Path("accountNumber") String str, @Body ApiDripSettingsRequest apiDripSettingsRequest, Continuation<? super ApiAccountDripSettings> continuation);

    @PATCH("corp_actions/drip/instrument_settings/{accountNumber}/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {DripRegionGate.class})
    Object patchInstrumentDripSettings(@Path("accountNumber") String str, @Path("instrumentId") UUID uuid, @Body ApiDripSettingsRequest apiDripSettingsRequest, Continuation<? super ApiInstrumentDripSettings> continuation);
}
