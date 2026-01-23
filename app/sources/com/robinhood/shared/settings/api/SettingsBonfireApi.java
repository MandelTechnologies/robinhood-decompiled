package com.robinhood.shared.settings.api;

import com.robinhood.android.settings.models.api.ApiSettingsSelectOneUpdateRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: SettingsBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/settings/api/SettingsBonfireApi;", "", "updateSelectOneSetting", "", "request", "Lcom/robinhood/android/settings/models/api/ApiSettingsSelectOneUpdateRequest;", "(Lcom/robinhood/android/settings/models/api/ApiSettingsSelectOneUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface SettingsBonfireApi {
    @POST("update_select_one_setting/")
    Object updateSelectOneSetting(@Body ApiSettingsSelectOneUpdateRequest apiSettingsSelectOneUpdateRequest, Continuation<? super Unit> continuation);
}
