package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import p479j$.time.Instant;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: InsightServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0084\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0001\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0001\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightServiceRetrofit;", "", "", "", "headers", "instrument_id", "", "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "categories", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "", "page_offset", "page_size", "Lretrofit2/Response;", "Lcom/robinhood/copilot/proto/v1/GetInsightsResponseDto;", "GetInsights", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;", CarResultComposable2.BODY, "Lcom/robinhood/copilot/proto/v1/CreateInsightsResponseDto;", "CreateInsights", "(Ljava/util/Map;Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "GetLatestInsight", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes15.dex */
public interface InsightServiceRetrofit {
    @POST("copilot/v1/insights")
    Object CreateInsights(@HeaderMap Map<String, String> map, @Body CreateInsightsRequestDto createInsightsRequestDto, Continuation<Response<CreateInsightsResponseDto>> continuation);

    @GET("copilot/v1/insights/{instrument_id}")
    Object GetInsights(@HeaderMap Map<String, String> map, @Path("instrument_id") @IdlField(protoType = "string") String str, @Query("categories") List<InsightCategoryDto> list, @IdlField(protoType = "google.protobuf.Timestamp") @Query("startDate") Instant instant, @IdlField(protoType = "google.protobuf.Timestamp") @Query("endDate") Instant instant2, @IdlField(protoType = "int32") @Query("pageOffset") Integer num, @IdlField(protoType = "int32") @Query("pageSize") Integer num2, Continuation<Response<GetInsightsResponseDto>> continuation);

    @GET("copilot/v1/insights/{instrument_id}/latest")
    Object GetLatestInsight(@HeaderMap Map<String, String> map, @Path("instrument_id") @IdlField(protoType = "string") String str, Continuation<Response<GetLatestInsightResponseDto>> continuation);
}
