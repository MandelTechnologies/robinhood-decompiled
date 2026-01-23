package com.robinhood.android.plaidconnect.api;

import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.PreparePaymentInstrumentDetails;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* compiled from: PlaidConnectApi.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "", "prepare", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PreparePaymentInstrumentDetails;", "request", "Lcom/robinhood/android/plaidconnect/models/PreparePaymentInstrumentRequest;", "(Lcom/robinhood/android/plaidconnect/models/PreparePaymentInstrumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-plaidconnect_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PlaidConnectApi {
    @Headers({"X-Read-Timeout-Seconds-Override: 60", "X-Write-Timeout-Seconds-Override: 60"})
    @POST("payment_instruments/v2/prepare/")
    Object prepare(@Body PreparePaymentInstrumentRequest preparePaymentInstrumentRequest, Continuation<? super Response<PreparePaymentInstrumentDetails>> continuation);
}
