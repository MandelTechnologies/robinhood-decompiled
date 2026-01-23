package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.models.ApiToggleThreadNotificationSettingRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: MarketingOptInApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/MarketingOptInApi;", "", "submitMarketingOptInPreference", "", "request", "Lcom/robinhood/models/ApiToggleThreadNotificationSettingRequest;", "(Lcom/robinhood/models/ApiToggleThreadNotificationSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface MarketingOptInApi {
    @POST("notification_settings/settings/items/email-robinhood-marketing/toggle/")
    Object submitMarketingOptInPreference(@Body ApiToggleThreadNotificationSettingRequest apiToggleThreadNotificationSettingRequest, Continuation<? super Unit> continuation);
}
