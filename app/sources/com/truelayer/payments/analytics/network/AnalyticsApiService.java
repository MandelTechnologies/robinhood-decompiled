package com.truelayer.payments.analytics.network;

import com.robinhood.android.car.result.CarResultComposable2;
import com.truelayer.payments.analytics.events.NetworkEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* compiled from: AnalyticsApiService.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/truelayer/payments/analytics/network/AnalyticsApiService;", "", "event", "Lretrofit2/Response;", "Ljava/lang/Void;", "auth", "", CarResultComposable2.BODY, "Lcom/truelayer/payments/analytics/events/NetworkEvent;", "(Ljava/lang/String;Lcom/truelayer/payments/analytics/events/NetworkEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsApiService {
    @POST("/v1/event/")
    Object event(@Header("Authorization") String str, @Body NetworkEvent networkEvent, Continuation<? super Response<Void>> continuation);
}
