package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rosetta.mainst.PositionEffectDto;

/* compiled from: InstrumentServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\tJX\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0013JZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0002\u0010\u0017JB\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0002\u0010\u001dJZ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010$H§@¢\u0006\u0002\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceRetrofit;", "", "GetEventContract", "Lretrofit2/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractResponseDto;", "headers", "", "", "id", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventContracts", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsResponseDto;", "ids", "GetEvent", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventResponseDto;", "include_nondiscoverable_contracts", "", "hydrate_contract_groups", "url_slug", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsResponseDto;", "categories", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetContractDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "contract_id", "yes_no", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "(Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderFormDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "yes_no_from_contract_element", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "order_form_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;", "(Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes26.dex */
public interface InstrumentServiceRetrofit {
    @GET("prediction-markets/v1/events/contracts/display_details")
    Object GetContractDisplayDetails(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("contractId") String str, @Query("yesNo") YesNoDto yesNoDto, Continuation<Response<GetContractDisplayDetailsResponseDto>> continuation);

    @GET("prediction-markets/v1/events/{id}")
    Object GetEvent(@HeaderMap Map<String, String> map, @Path("id") @IdlField(protoType = "string") String str, @IdlField(protoType = "bool") @Query("includeNondiscoverableContracts") Boolean bool, @IdlField(protoType = "bool") @Query("hydrateContractGroups") Boolean bool2, @IdlField(protoType = "string") @Query("urlSlug") String str2, Continuation<Response<GetEventResponseDto>> continuation);

    @GET("prediction-markets/v1/events/contracts/{id}")
    Object GetEventContract(@HeaderMap Map<String, String> map, @Path("id") @IdlField(protoType = "string") String str, Continuation<Response<GetEventContractResponseDto>> continuation);

    @GET("prediction-markets/v1/events/order_form/display_details")
    Object GetOrderFormDisplayDetails(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("contractId") String str, @Query("yesNoFromContractElement") YesNoDto yesNoDto, @Query("positionEffect") PositionEffectDto positionEffectDto, @Query("orderFormType") OrderFormTypeDto orderFormTypeDto, Continuation<Response<GetOrderFormDisplayDetailsResponseDto>> continuation);

    @GET("prediction-markets/v1/events/contracts")
    Object ListEventContracts(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("ids") String str, Continuation<Response<ListEventContractsResponseDto>> continuation);

    @GET("prediction-markets/v1/events")
    Object ListEvents(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("ids") String str, @IdlField(protoType = "bool") @Query("includeNondiscoverableContracts") Boolean bool, @IdlField(protoType = "string") @Query("categories") String str2, @IdlField(protoType = "bool") @Query("hydrateContractGroups") Boolean bool2, Continuation<Response<ListEventsResponseDto>> continuation);
}
