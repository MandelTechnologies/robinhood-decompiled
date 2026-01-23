package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: LayoutServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\tJZ\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0002\u0010\u0010J<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H§@¢\u0006\u0002\u0010\u0015J<\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H§@¢\u0006\u0002\u0010\u0015JB\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u001eJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0002\u0010!J4\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010$\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ*\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0002\u0010!¨\u0006'"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutServiceRetrofit;", "", "ListChildNavigationNodes", "Lretrofit2/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesResponseDto;", "headers", "", "", "node_id", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponseDto;", "cursor", "page_size", "", "preview_size", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventState", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponseDto;", "event_ids", "", "(Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetHighlights", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsResponseDto;", "contract_ids", "ListStrikes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponseDto;", "yes_no", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "contract_id", "(Ljava/util/Map;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetSearchLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutResponseDto;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMarqueeEventsByNavId", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdResponseDto;", "nav_id", "ListMarqueeEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponseDto;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes26.dex */
public interface LayoutServiceRetrofit {
    @GET("prediction-markets/v1/event_state")
    Object GetEventState(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("eventIds") List<String> list, Continuation<Response<GetEventStateResponseDto>> continuation);

    @GET("prediction-markets/v1/highlights")
    Object GetHighlights(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("contractIds") List<String> list, Continuation<Response<GetHighlightsResponseDto>> continuation);

    @GET("prediction-markets/v1/layout")
    Object GetLayout(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("nodeId") String str, @IdlField(protoType = "string") @Query("cursor") String str2, @IdlField(protoType = "int32") @Query("pageSize") Integer num, @IdlField(protoType = "int32") @Query("previewSize") Integer num2, Continuation<Response<GetLayoutResponseDto>> continuation);

    @GET("prediction-markets/v1/marquee_events/{nav_id}")
    Object GetMarqueeEventsByNavId(@HeaderMap Map<String, String> map, @Path("nav_id") @IdlField(protoType = "string") String str, Continuation<Response<GetMarqueeEventsByNavIdResponseDto>> continuation);

    @GET("prediction-markets/v1/layout/search")
    Object GetSearchLayout(@HeaderMap Map<String, String> map, Continuation<Response<GetSearchLayoutResponseDto>> continuation);

    @GET("prediction-markets/v1/navigation_nodes")
    Object ListChildNavigationNodes(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("nodeId") String str, Continuation<Response<ListChildNavigationNodesResponseDto>> continuation);

    @GET("prediction-markets/v1/marquee_events")
    Object ListMarqueeEvents(@HeaderMap Map<String, String> map, Continuation<Response<ListMarqueeEventsResponseDto>> continuation);

    @GET("prediction-markets/v1/strikes")
    Object ListStrikes(@HeaderMap Map<String, String> map, @Query("yesNo") YesNoDto yesNoDto, @IdlField(protoType = "string") @Query("contractId") String str, Continuation<Response<ListStrikesResponseDto>> continuation);
}
