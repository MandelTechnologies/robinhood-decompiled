package nummus.p512v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: NummusServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u00018J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012JN\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00032\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0019\u0010\u000eJB\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u001c\u0010\u001dJV\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\"\u0010#JV\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b%\u0010#J6\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)J\u0098\u0001\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0001\u00100\u001a\u0004\u0018\u00010.2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u00102\u001a\u0004\u0018\u000101H§@¢\u0006\u0004\b4\u00105JP\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b7\u0010\u0017¨\u00069"}, m3636d2 = {"Lnummus/v1/NummusServiceRetrofit;", "", "", "", "headers", "Lnummus/v1/FeeEstimationRequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Lnummus/v1/FeeEstimationResponseDto;", "FeeEstimation", "(Ljava/util/Map;Lnummus/v1/FeeEstimationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_id", "Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "AccountPreferenceRetrieve", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/AccountPreferencePutRequestDto;", "Lnummus/v1/AccountPreferencePutResponseDto;", "AccountPreferencePut", "(Ljava/util/Map;Lnummus/v1/AccountPreferencePutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "order_id", "cursor", "Lnummus/v1/TaxLotsForOrderResponseDto;", "TaxLotsForOrder", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/UserFeeTierResponseDto;", "UserFeeTier", "currency_pair_id", "Lnummus/v1/TaxlotabilityResponseDto;", "Taxlotability", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at_gte", "Lnummus/v1/CorpActionSplitPaymentListResponseDto;", "CorpActionSplitPaymentList", "(Ljava/util/Map;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/CorpActionDividendsPaymentListResponseDto;", "CorpActionDividendsPaymentList", "Lnummus/v1/CreateCostBasisLotRequestDto;", "Lnummus/v1/CreateCostBasisLotResponseDto;", "CreateCostBasisLot", "(Ljava/util/Map;Lnummus/v1/CreateCostBasisLotRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "source_id", "source_type", "Lnummus/v1/CostBasisStatusDto;", "status", "", "year", "limit", "", "allow_correction", "Lnummus/v1/GetCostBasisSummaryResponseDto;", "GetCostBasisSummary", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatusDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/GetCostBasisDetailsResponseDto;", "GetCostBasisDetails", "FlattenPositionsBodyTransformer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes25.dex */
public interface NummusServiceRetrofit {
    @PUT("v1/account/preferences")
    Object AccountPreferencePut(@HeaderMap Map<String, String> map, @Body AccountPreferencePutRequestDto accountPreferencePutRequestDto, Continuation<Response<AccountPreferencePutResponseDto>> continuation);

    @GET("v1/account/preferences")
    Object AccountPreferenceRetrieve(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountId") String str, Continuation<Response<AccountPreferenceRetrieveResponseDto>> continuation);

    @GET("v1/corp_actions/dividends_payments")
    Object CorpActionDividendsPaymentList(@HeaderMap Map<String, String> map, @IdlField(protoType = "google.protobuf.Timestamp") @Query("updatedAtGte") Instant instant, @IdlField(protoType = "string") @Query("cursor") String str, @IdlField(protoType = "string") @Query("currencyPairId") String str2, Continuation<Response<CorpActionDividendsPaymentListResponseDto>> continuation);

    @GET("v1/corp_actions/split_payments")
    Object CorpActionSplitPaymentList(@HeaderMap Map<String, String> map, @IdlField(protoType = "google.protobuf.Timestamp") @Query("updatedAtGte") Instant instant, @IdlField(protoType = "string") @Query("cursor") String str, @IdlField(protoType = "string") @Query("currencyPairId") String str2, Continuation<Response<CorpActionSplitPaymentListResponseDto>> continuation);

    @POST("v1/cost_basis/lots")
    Object CreateCostBasisLot(@HeaderMap Map<String, String> map, @Body CreateCostBasisLotRequestDto createCostBasisLotRequestDto, Continuation<Response<CreateCostBasisLotResponseDto>> continuation);

    @POST("v1/fee/estimation")
    Object FeeEstimation(@HeaderMap Map<String, String> map, @Body FeeEstimationRequestDto feeEstimationRequestDto, Continuation<Response<FeeEstimationResponseDto>> continuation);

    @GET("v1/cost_basis/details")
    Object GetCostBasisDetails(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountId") String str, @IdlField(protoType = "string") @Query("sourceId") String str2, @IdlField(protoType = "string") @Query("sourceType") String str3, Continuation<Response<GetCostBasisDetailsResponseDto>> continuation);

    @GET("v1/cost_basis")
    Object GetCostBasisSummary(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountId") String str, @IdlField(protoType = "string") @Query("sourceId") String str2, @IdlField(protoType = "string") @Query("sourceType") String str3, @IdlField(protoType = "string") @Query("currencyPairId") String str4, @Query("status") CostBasisStatusDto costBasisStatusDto, @IdlField(protoType = "int32") @Query("year") Integer num, @IdlField(protoType = "int32") @Query("limit") Integer num2, @IdlField(protoType = "string") @Query("cursor") String str5, @IdlField(protoType = "bool") @Query("allowCorrection") Boolean bool, Continuation<Response<GetCostBasisSummaryResponseDto>> continuation);

    @GET("v1/tax_lots/order/{order_id}")
    Object TaxLotsForOrder(@HeaderMap Map<String, String> map, @Path("order_id") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("cursor") String str2, @IdlField(protoType = "string") @Query("accountId") String str3, Continuation<Response<TaxLotsForOrderResponseDto>> continuation);

    @GET("v1/tax_lots/{currency_pair_id}/taxlotability")
    Object Taxlotability(@HeaderMap Map<String, String> map, @Path("currency_pair_id") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("accountId") String str2, Continuation<Response<TaxlotabilityResponseDto>> continuation);

    @GET("v1/fee/tier_info")
    Object UserFeeTier(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountId") String str, Continuation<Response<UserFeeTierResponseDto>> continuation);

    /* compiled from: NummusServiceRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/NummusServiceRetrofit$FlattenPositionsBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lnummus/v1/FlattenPositionsRequest;", "<init>", "()V", "apply", "value", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FlattenPositionsBodyTransformer implements UnaryOperator<FlattenPositionsRequest> {
        public static final FlattenPositionsBodyTransformer INSTANCE = new FlattenPositionsBodyTransformer();

        private FlattenPositionsBodyTransformer() {
        }

        @Override // java.util.function.Function
        public FlattenPositionsRequest apply(FlattenPositionsRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return FlattenPositionsRequest.copy$default(value, "", null, null, null, 14, null);
        }
    }
}
