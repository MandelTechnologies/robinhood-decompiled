package com.robinhood.android.gold.subscription.api;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: GoldSubscriptionApi.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/GoldSubscriptionApi;", "", "subscribe", "Lcom/robinhood/android/gold/subscription/api/GoldSubscribeResponse;", "request", "Lcom/robinhood/android/gold/subscription/api/GoldSubscribeRequest;", "(Lcom/robinhood/android/gold/subscription/api/GoldSubscribeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "Lcom/robinhood/android/gold/subscription/api/GoldUnsubscribeResponse;", "Lcom/robinhood/android/gold/subscription/api/GoldUnsubscribeRequest;", "(Lcom/robinhood/android/gold/subscription/api/GoldUnsubscribeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchSubscriptionPlan", "Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanResponse;", "Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanRequest;", "(Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downgrade", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface GoldSubscriptionApi {
    @POST("cancel_subscription/?instant_downgrade=true")
    Object downgrade(Continuation<? super Unit> continuation);

    @POST("subscribe/")
    Object subscribe(@Body GoldSubscribeRequest goldSubscribeRequest, Continuation<? super GoldSubscribeResponse> continuation);

    @POST("switch_subscription_plan/")
    Object switchSubscriptionPlan(@Body GoldSwitchSubscriptionPlanRequest goldSwitchSubscriptionPlanRequest, Continuation<? super GoldSwitchSubscriptionPlanResponse> continuation);

    @POST("unsubscribe/")
    Object unsubscribe(@Body GoldUnsubscribeRequest goldUnsubscribeRequest, Continuation<? super GoldUnsubscribeResponse> continuation);
}
