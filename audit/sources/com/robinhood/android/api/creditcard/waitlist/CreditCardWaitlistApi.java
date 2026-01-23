package com.robinhood.android.api.creditcard.waitlist;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: CreditCardWaitlistApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/waitlist/CreditCardWaitlistApi;", "", "getWaitlistStatus", "Lcom/robinhood/models/api/bonfire/waitlist/ApiEmailWaitlistSpot;", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinWaitlist", CarResultComposable2.BODY, "Lcom/robinhood/android/api/creditcard/waitlist/JoinWaitlistBody;", "(Lcom/robinhood/android/api/creditcard/waitlist/JoinWaitlistBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface CreditCardWaitlistApi {
    @GET("waitlist/credit_card/email/spot/")
    Object getWaitlistStatus(@Query("email") String str, Continuation<? super ApiEmailWaitlistSpot> continuation);

    @POST("waitlist/credit_card/email/spot/")
    Object joinWaitlist(@Body JoinWaitlistBody joinWaitlistBody, Continuation<? super ApiEmailWaitlistSpot> continuation);
}
