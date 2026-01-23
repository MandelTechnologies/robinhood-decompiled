package crypto_perpetuals.service.p440v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import crypto_perpetuals.order.p438v1.OrderStatusDto;
import crypto_perpetuals.order.p438v1.OrderTypeDto;
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

/* compiled from: CryptoPerpetualsServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0011\u0010\u000eJ6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0014\u0010\u000eJb\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0003H§@¢\u0006\u0004\b \u0010\u000eJ\u008c\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0010\b\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!2\u0010\b\u0001\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!2\u0010\b\u0001\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b(\u0010)J6\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/CryptoPerpetualsServiceRetrofit;", "", "", "", "headers", "", "suppress_account_not_found", "Lretrofit2/Response;", "Lcrypto_perpetuals/service/v1/GetAccountResponseDto;", "GetAccount", "(Ljava/util/Map;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contract_id", "Lcrypto_perpetuals/service/v1/GetContractResponseDto;", "GetContract", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "Lcrypto_perpetuals/service/v1/ListContractResponseDto;", "ListContract", "margin_edit_id", "Lcrypto_perpetuals/service/v1/GetMarginEditResponseDto;", "GetMarginEdit", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at_gte", "", "page_size", "token", "Lcrypto_perpetuals/service/v1/ListMarginEditsResponseDto;", "ListMarginEdits", "(Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "order_id", "Lcrypto_perpetuals/service/v1/GetOrderResponseDto;", "GetOrder", "", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", "status_filter", "Lcrypto_perpetuals/order/v1/OrderTypeDto;", "type_filter", "contract_id_filter", "Lcrypto_perpetuals/service/v1/ListOrderResponseDto;", "ListOrder", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;", CarResultComposable2.BODY, "Lcrypto_perpetuals/service/v1/ValidateOrderPriceResponseDto;", "ValidateOrderPrice", "(Ljava/util/Map;Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes18.dex */
public interface CryptoPerpetualsServiceRetrofit {
    @GET("crypto-perpetuals/v1/account")
    Object GetAccount(@HeaderMap Map<String, String> map, @IdlField(protoType = "bool") @Query("suppressAccountNotFound") Boolean bool, Continuation<Response<GetAccountResponseDto>> continuation);

    @GET("crypto-perpetuals/v1/contract/{contract_id}")
    Object GetContract(@HeaderMap Map<String, String> map, @Path("contract_id") @IdlField(protoType = "string") String str, Continuation<Response<GetContractResponseDto>> continuation);

    @GET("crypto-perpetuals/v1/margin-edit/{margin_edit_id}")
    Object GetMarginEdit(@HeaderMap Map<String, String> map, @Path("margin_edit_id") @IdlField(protoType = "string") String str, Continuation<Response<GetMarginEditResponseDto>> continuation);

    @GET("crypto-perpetuals/v1/order/{order_id}")
    Object GetOrder(@HeaderMap Map<String, String> map, @Path("order_id") @IdlField(protoType = "string") String str, Continuation<Response<GetOrderResponseDto>> continuation);

    @GET("crypto-perpetuals/v1/contract/list")
    Object ListContract(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("query") String str, Continuation<Response<ListContractResponseDto>> continuation);

    @GET("crypto-perpetuals/v1/margin-edit/list")
    Object ListMarginEdits(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("contractId") String str, @IdlField(protoType = "google.protobuf.Timestamp") @Query("updatedAtGte") Instant instant, @IdlField(protoType = "int32") @Query("pageSize") Integer num, @IdlField(protoType = "string") @Query("token") String str2, Continuation<Response<ListMarginEditsResponseDto>> continuation);

    @GET("crypto-perpetuals/v1/order/list")
    Object ListOrder(@HeaderMap Map<String, String> map, @Query("statusFilter") List<OrderStatusDto> list, @Query("typeFilter") List<OrderTypeDto> list2, @IdlField(protoType = "string") @Query("contractIdFilter") List<String> list3, @IdlField(protoType = "google.protobuf.Timestamp") @Query("updatedAtGte") Instant instant, @IdlField(protoType = "int32") @Query("pageSize") Integer num, @IdlField(protoType = "string") @Query("token") String str, Continuation<Response<ListOrderResponseDto>> continuation);

    @POST("crypto-perpetuals/v1/order/validate-price")
    Object ValidateOrderPrice(@HeaderMap Map<String, String> map, @Body ValidateOrderPriceRequestDto validateOrderPriceRequestDto, Continuation<Response<ValidateOrderPriceResponseDto>> continuation);
}
