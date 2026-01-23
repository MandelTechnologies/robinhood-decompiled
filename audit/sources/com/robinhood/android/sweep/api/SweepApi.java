package com.robinhood.android.sweep.api;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiSweep;
import com.robinhood.models.api.ApiSweepsInterest;
import com.robinhood.models.api.ApiSweepsSummary;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p479j$.time.LocalDateTime;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: SweepApi.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007J$\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/sweep/api/SweepApi;", "", "", "paginationCursor", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiSweep;", "getSweeps", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "id", "getSweep", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiSweepsSummary;", "getSweepsSummary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountNumber", "Lcom/robinhood/models/api/ApiSweepsInterest;", "getSweepsInterest", "j$/time/LocalDateTime", InquiryField.DatetimeField.TYPE, "Lcom/robinhood/models/api/ApiSweepsTimelineSummary;", "getSweepsTimelineSummary", "(Lj$/time/LocalDateTime;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface SweepApi {
    @GET("accounts/sweeps/{id}/")
    Object getSweep(@Path("id") UUID uuid, Continuation<? super ApiSweep> continuation);

    @GET("accounts/sweeps/?default_to_all_accounts=true&include_managed=true")
    Object getSweeps(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiSweep>> continuation);

    @GET("accounts/sweeps/interest/")
    Object getSweepsInterest(@Query("account_number") String str, Continuation<? super ApiSweepsInterest> continuation);

    @GET("accounts/sweeps/summary/")
    Object getSweepsSummary(Continuation<? super ApiSweepsSummary> continuation);

    @GET("accounts/sweeps/timeline_summary/")
    Object getSweepsTimelineSummary(@Query(InquiryField.DatetimeField.TYPE) LocalDateTime localDateTime, @Query("account_number") String str, Continuation<? super ApiSweepsTimelineSummary> continuation);
}
