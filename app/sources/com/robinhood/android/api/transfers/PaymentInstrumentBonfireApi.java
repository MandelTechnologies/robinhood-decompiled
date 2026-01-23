package com.robinhood.android.api.transfers;

import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.api.bonfire.paymentinstrument.ApiPaymentInstrumentPrecheckRequest;
import com.robinhood.models.api.bonfire.paymentinstrument.ApiPaymentInstrumentPrecheckResponse;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiLinkDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentUserStatus;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2Request;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstruments;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV2;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV22;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiUpdateDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiVerifyDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentProviderType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PaymentInstrumentBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 .2\u00020\u0001:\u0001.J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ,\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020!2\u000e\b\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H§@¢\u0006\u0002\u0010%J\"\u0010&\u001a\u00020'2\b\b\u0001\u0010(\u001a\u00020$2\b\b\u0001\u0010\u000b\u001a\u00020$H§@¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020+2\b\b\u0001\u0010\u0005\u001a\u00020,H§@¢\u0006\u0002\u0010-¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "", "linkDebitCard", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "request", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiLinkDebitCardRequest;", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiLinkDebitCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyDebitCard", "paymentInstrumentType", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;", "instrumentId", "Ljava/util/UUID;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiVerifyDebitCardRequest;", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiVerifyDebitCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDebitCard", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiUpdateDebitCardRequest;", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiUpdateDebitCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDebitCard", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDebitCards", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstruments;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserStatusForPaymentProvider", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentUserStatus;", "paymentProviderType", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentProviderType;", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentProviderType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "precheck", "Lcom/robinhood/models/api/bonfire/paymentinstrument/ApiPaymentInstrumentPrecheckResponse;", "Lcom/robinhood/models/api/bonfire/paymentinstrument/ApiPaymentInstrumentPrecheckRequest;", "(Lcom/robinhood/models/api/bonfire/paymentinstrument/ApiPaymentInstrumentPrecheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentInstruments", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentsV2;", "types", "Lcom/robinhood/models/CommaSeparatedList;", "", "(Lcom/robinhood/models/CommaSeparatedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentInstrument", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentV2;", "instrumentType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkPaymentInstrument", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiUkPaymentInstrumentsV2Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentV2Request;", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-api-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PaymentInstrumentBonfireApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @GET("payment_instruments/{payment_instrument_type}/{instrument_id}")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getDebitCard(@Path("payment_instrument_type") PaymentInstrumentType paymentInstrumentType, @Path("instrument_id") UUID uuid, Continuation<? super ApiPaymentInstrument> continuation);

    @GET("payment_instruments")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getDebitCards(Continuation<? super ApiPaymentInstruments> continuation);

    @GET("payment_instruments/v2/{instrumentType}/{instrumentId}/")
    Object getPaymentInstrument(@Path("instrumentType") String str, @Path("instrumentId") String str2, Continuation<? super ApiPaymentInstrumentV2> continuation);

    @GET("payment_instruments/v2/")
    Object getPaymentInstruments(@Query("types") CommaSeparatedList<String> commaSeparatedList, Continuation<? super ApiPaymentInstrumentsV2> continuation);

    @GET("user_status/{payment_provider_type}")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getUserStatusForPaymentProvider(@Path("payment_provider_type") PaymentProviderType paymentProviderType, Continuation<? super ApiPaymentInstrumentUserStatus> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 45", "X-Write-Timeout-Seconds-Override: 45"})
    @POST("payment_instruments/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {MoneyMovementsUsRegionGate.class})
    Object linkDebitCard(@Body ApiLinkDebitCardRequest apiLinkDebitCardRequest, Continuation<? super Response<ApiPaymentInstrument>> continuation);

    @POST("payment_instruments/v2/link/")
    Object linkPaymentInstrument(@Body ApiPaymentInstrumentV2Request apiPaymentInstrumentV2Request, Continuation<? super ApiPaymentInstrumentsV22> continuation);

    @POST("payment_instruments/pre_check")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {MoneyMovementsUsRegionGate.class})
    Object precheck(@Body ApiPaymentInstrumentPrecheckRequest apiPaymentInstrumentPrecheckRequest, Continuation<? super Response<ApiPaymentInstrumentPrecheckResponse>> continuation);

    @PATCH("payment_instruments/{payment_instrument_type}/{instrument_id}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {MoneyMovementsUsRegionGate.class})
    Object updateDebitCard(@Path("payment_instrument_type") PaymentInstrumentType paymentInstrumentType, @Path("instrument_id") UUID uuid, @Body ApiUpdateDebitCardRequest apiUpdateDebitCardRequest, Continuation<? super ApiPaymentInstrument> continuation);

    @POST("payment_instruments/{payment_instrument_type}/{instrument_id}/verify/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {MoneyMovementsUsRegionGate.class})
    Object verifyDebitCard(@Path("payment_instrument_type") PaymentInstrumentType paymentInstrumentType, @Path("instrument_id") UUID uuid, @Body ApiVerifyDebitCardRequest apiVerifyDebitCardRequest, Continuation<? super Response<ApiPaymentInstrument>> continuation);

    /* compiled from: PaymentInstrumentBonfireApi.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi$Companion;", "", "<init>", "()V", "DEBIT_CARD_POST_TIMEOUT", "", "lib-api-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DEBIT_CARD_POST_TIMEOUT = 45;

        private Companion() {
        }
    }
}
