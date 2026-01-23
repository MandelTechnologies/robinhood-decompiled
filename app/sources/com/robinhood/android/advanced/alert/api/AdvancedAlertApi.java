package com.robinhood.android.advanced.alert.api;

import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiAlertHubUiResources;
import com.robinhood.models.advanced.alert.api.ApiAlertHubUiResources2;
import com.robinhood.models.advanced.alert.api.ApiCreateAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.api.ApiCreateIndicatorAlertRequest;
import com.robinhood.models.advanced.alert.api.ApiDeleteAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.api.ApiUpdateAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.api.ApiUpdateIndicatorAlertRequest;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AdvancedAlertApi.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJJ\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J@\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J6\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ6\u0010\u001d\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ6\u0010 \u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ6\u0010!\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020%2\b\b\u0001\u0010\u0004\u001a\u00020&H§@¢\u0006\u0002\u0010'J\"\u0010(\u001a\u00020%2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020&H§@¢\u0006\u0002\u0010)¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;", "", "getAdvancedAlertSettings", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "entityId", "Ljava/util/UUID;", "allowMultiple", "", "sortType", "", "(Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Ljava/util/UUID;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAdvancedAlertSettings", "tmpSettingId", "request", "Lcom/robinhood/models/advanced/alert/api/ApiCreateAdvancedAlertSettingRequest;", "(Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Ljava/util/UUID;Ljava/util/UUID;ZLjava/lang/String;Lcom/robinhood/models/advanced/alert/api/ApiCreateAdvancedAlertSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdvancedAlertSettings", "Lcom/robinhood/models/advanced/alert/api/ApiUpdateAdvancedAlertSettingRequest;", "(Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Ljava/util/UUID;Ljava/lang/String;ZLcom/robinhood/models/advanced/alert/api/ApiUpdateAdvancedAlertSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdvancedAlertUIResources", "Lcom/robinhood/models/advanced/alert/api/ApiAlertHubUiResources;", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertResourceEntityType;", "(Lcom/robinhood/models/advanced/alert/api/AdvancedAlertResourceEntityType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAdvancedAlertSettingsV2", "instrumentId", "Lcom/robinhood/models/advanced/alert/api/ApiCreateIndicatorAlertRequest;", "(Ljava/util/UUID;Ljava/util/UUID;ZLcom/robinhood/models/advanced/alert/api/ApiCreateIndicatorAlertRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAdvancedAlertSettings", "Lcom/robinhood/models/advanced/alert/api/ApiDeleteAdvancedAlertSettingRequest;", "(Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Ljava/util/UUID;ZLcom/robinhood/models/advanced/alert/api/ApiDeleteAdvancedAlertSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdvancedAlertSettingsV2", "toggleAdvancedAlertSettingsV2", "Lcom/robinhood/models/advanced/alert/api/ApiUpdateIndicatorAlertRequest;", "(Ljava/util/UUID;Ljava/util/UUID;ZLcom/robinhood/models/advanced/alert/api/ApiUpdateIndicatorAlertRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlertHubSettings", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettings;", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlertHubSettingsItem", "(Ljava/util/UUID;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AdvancedAlertApi {
    @POST("notification_settings/{entityType}/{entityId}/")
    Object createAdvancedAlertSettings(@Path("entityType") ApiAdvancedAlert2 apiAdvancedAlert2, @Path("entityId") UUID uuid, @Query("iid") UUID uuid2, @Query("allow_multiple") boolean z, @Query("sort_by") String str, @Body ApiCreateAdvancedAlertSettingRequest apiCreateAdvancedAlertSettingRequest, Continuation<? super ApiAdvancedAlert> continuation);

    @POST("notification_settings/instruments/{instrumentId}/?sort_by=created_at")
    Object createAdvancedAlertSettingsV2(@Path("instrumentId") UUID uuid, @Query("iid") UUID uuid2, @Query("allow_multiple") boolean z, @Body ApiCreateIndicatorAlertRequest apiCreateIndicatorAlertRequest, Continuation<? super ApiAdvancedAlert> continuation);

    @HTTP(hasBody = true, method = "DELETE", path = "notification_settings/{entityType}/{entityId}/?sort_by=created_at")
    Object deleteAdvancedAlertSettings(@Path("entityType") ApiAdvancedAlert2 apiAdvancedAlert2, @Path("entityId") UUID uuid, @Query("allow_multiple") boolean z, @Body ApiDeleteAdvancedAlertSettingRequest apiDeleteAdvancedAlertSettingRequest, Continuation<? super ApiAdvancedAlert> continuation);

    @DELETE("notification_settings/settings/alert_hub/")
    Object deleteAlertHubSettingsItem(@Query("entity_id") UUID uuid, @Query("entity_type") AlertHubSettings2 alertHubSettings2, Continuation<? super AlertHubSettings> continuation);

    @GET("notification_settings/{entityType}/{entityId}/")
    Object getAdvancedAlertSettings(@Path("entityType") ApiAdvancedAlert2 apiAdvancedAlert2, @Path("entityId") UUID uuid, @Query("allow_multiple") boolean z, @Query("sort_by") String str, Continuation<? super ApiAdvancedAlert> continuation);

    @GET("notification_settings/ui_resources/")
    Object getAdvancedAlertUIResources(@Query("entity_type") ApiAlertHubUiResources2 apiAlertHubUiResources2, Continuation<? super ApiAlertHubUiResources> continuation);

    @GET("notification_settings/settings/alert_hub/")
    Object getAlertHubSettings(@Query("entity_type") AlertHubSettings2 alertHubSettings2, Continuation<? super AlertHubSettings> continuation);

    @PATCH("notification_settings/instruments/{instrumentId}/?sort_by=created_at")
    Object toggleAdvancedAlertSettingsV2(@Path("instrumentId") UUID uuid, @Query("iid") UUID uuid2, @Query("allow_multiple") boolean z, @Body ApiUpdateIndicatorAlertRequest apiUpdateIndicatorAlertRequest, Continuation<? super ApiAdvancedAlert> continuation);

    @PATCH("notification_settings/{entityType}/{entityId}/")
    Object updateAdvancedAlertSettings(@Path("entityType") ApiAdvancedAlert2 apiAdvancedAlert2, @Path("entityId") UUID uuid, @Query("sort_by") String str, @Query("allow_multiple") boolean z, @Body ApiUpdateAdvancedAlertSettingRequest apiUpdateAdvancedAlertSettingRequest, Continuation<? super ApiAdvancedAlert> continuation);

    @PATCH("notification_settings/instruments/{instrumentId}/?sort_by=created_at")
    Object updateAdvancedAlertSettingsV2(@Path("instrumentId") UUID uuid, @Query("iid") UUID uuid2, @Query("allow_multiple") boolean z, @Body ApiCreateIndicatorAlertRequest apiCreateIndicatorAlertRequest, Continuation<? super ApiAdvancedAlert> continuation);
}
