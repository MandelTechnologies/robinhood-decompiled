package com.robinhood.prediction_markets.proto.p361v1.combo;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: ComboServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/ComboServiceRetrofit;", "", "CreateComboRFQ", "Lretrofit2/Response;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponseDto;", "headers", "", "", CarResultComposable2.BODY, "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "(Ljava/util/Map;Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetComboProposals", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "rfq_id", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes26.dex */
public interface ComboServiceRetrofit {
    @POST("prediction-markets/v1/combos/rfq")
    Object CreateComboRFQ(@HeaderMap Map<String, String> map, @Body CreateComboRFQRequestDto createComboRFQRequestDto, Continuation<Response<CreateComboRFQResponseDto>> continuation);

    @GET("prediction-markets/v1/combos/proposals")
    Object GetComboProposals(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("rfqId") String str, Continuation<Response<GetComboProposalsResponseDto>> continuation);
}
