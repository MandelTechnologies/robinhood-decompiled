package com.robinhood.api.retrofit;

import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.ApiToggleThreadNotificationSettingRequest;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.AchBank;
import com.robinhood.models.api.ApiNotificationChannel;
import com.robinhood.models.api.ApiNotificationSettings;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.models.api.SelectNotificationSettingsRequest;
import com.robinhood.models.api.ToggleNotificationSettingsRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: Midlands.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH§@¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH§@¢\u0006\u0002\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/api/retrofit/Midlands;", "", "getBankName", "Lcom/robinhood/models/api/AchBank;", "routingNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationSettings", "Lcom/robinhood/models/api/ApiNotificationSettings;", "settingsId", "getNotificationSettingsItem", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "itemId", "getThreadSettingsItems", "", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleThreadNotificationsSettings", "threadSettingId", "request", "Lcom/robinhood/models/ApiToggleThreadNotificationSettingRequest;", "(Ljava/lang/String;Lcom/robinhood/models/ApiToggleThreadNotificationSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleNotificationSettings", "Lcom/robinhood/models/api/ToggleNotificationSettingsRequest;", "(Ljava/lang/String;Lcom/robinhood/models/api/ToggleNotificationSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectNotificationSettings", "", "Lcom/robinhood/models/api/SelectNotificationSettingsRequest;", "(Ljava/lang/String;Lcom/robinhood/models/api/SelectNotificationSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationChannels", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiNotificationChannel;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Midlands {
    @GET("ach/banks/{routingNumber}/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getBankName(@Path("routingNumber") String str, Continuation<? super AchBank> continuation);

    @GET("notification_settings/settings/channels/")
    Object getNotificationChannels(Continuation<? super PaginatedResult<ApiNotificationChannel>> continuation);

    @GET("notification_settings/settings/pages/{settingsId}/")
    Object getNotificationSettings(@Path("settingsId") String str, Continuation<? super ApiNotificationSettings> continuation);

    @GET("notification_settings/settings/items/{itemId}/")
    Object getNotificationSettingsItem(@Path("itemId") String str, Continuation<? super ApiNotificationSettingsItem> continuation);

    @GET("notification_settings/settings/threads/muted/")
    Object getThreadSettingsItems(Continuation<? super List<ApiNotificationThreadSettingsItem>> continuation);

    @POST("notification_settings/settings/items/{itemId}/select/")
    Object selectNotificationSettings(@Path("itemId") String str, @Body SelectNotificationSettingsRequest selectNotificationSettingsRequest, Continuation<? super Unit> continuation);

    @POST("notification_settings/settings/items/{itemId}/toggle/")
    Object toggleNotificationSettings(@Path("itemId") String str, @Body ToggleNotificationSettingsRequest toggleNotificationSettingsRequest, Continuation<? super ApiNotificationSettingsItem> continuation);

    @POST("notification_settings/settings/threads/muted/{threadSettingId}/")
    Object toggleThreadNotificationsSettings(@Path("threadSettingId") String str, @Body ApiToggleThreadNotificationSettingRequest apiToggleThreadNotificationSettingRequest, Continuation<? super ApiNotificationThreadSettingsItem> continuation);
}
