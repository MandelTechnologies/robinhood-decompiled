package com.robinhood.api.p280bw;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.api.bonfire.ApiWithholdingAmount;
import com.robinhood.models.api.bonfire.ApiWithholdingEstimatedAmount;
import com.robinhood.models.api.bonfire.ApiWithholdingInfoSheet;
import com.robinhood.models.api.bonfire.ApiWithholdingStatus;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BackupWithholdingApi.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006J(\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/api/bw/BackupWithholdingApi;", "", "getTaxWithholdingStatusV2", "Lcom/robinhood/models/api/bonfire/ApiWithholdingStatus;", "instrumentId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaxWithholdingStatus", "getTaxWithholdingAmount", "Lcom/robinhood/models/api/bonfire/ApiWithholdingAmount;", "ids", "Lcom/robinhood/models/CommaSeparatedList;", "Ljava/util/UUID;", "accountNumber", "(Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaxWithholdingEstimatedAmount", "Lcom/robinhood/models/api/bonfire/ApiWithholdingEstimatedAmount;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "taxWithholdingStatus", "", "(Ljava/math/BigDecimal;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaxWithholdingInfoSheet", "Lcom/robinhood/models/api/bonfire/ApiWithholdingInfoSheet;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-backup-withholding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface BackupWithholdingApi {
    @GET("tax_info/withheld_amount")
    Object getTaxWithholdingAmount(@Query("trigger_ids") CommaSeparatedList<UUID> commaSeparatedList, @Query("account_number") String str, Continuation<? super ApiWithholdingAmount> continuation);

    @GET("tax_info/estimated_withholding_amount")
    Object getTaxWithholdingEstimatedAmount(@Query(AnalyticsStrings.TAG_SORT_ORDER_PRICE) BigDecimal bigDecimal, @Query("tax_withholding_status") int i, @Query("instrument_id") String str, Continuation<? super ApiWithholdingEstimatedAmount> continuation);

    @GET("tax_info/withholding_info_sheet")
    Object getTaxWithholdingInfoSheet(Continuation<? super ApiWithholdingInfoSheet> continuation);

    @GET("tax_info/withholding_status")
    Object getTaxWithholdingStatus(@Query("instrument_id") String str, Continuation<? super ApiWithholdingStatus> continuation);

    @GET("tax_info/instrument/{instrument_id}/withholding_status")
    Object getTaxWithholdingStatusV2(@Path("instrument_id") String str, Continuation<? super ApiWithholdingStatus> continuation);
}
