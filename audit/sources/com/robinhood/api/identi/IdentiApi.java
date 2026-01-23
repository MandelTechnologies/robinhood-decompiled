package com.robinhood.api.identi;

import com.robinhood.android.regiongate.SingpassRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.identi.ApiPhoneProhibitedCountryCodes;
import com.robinhood.models.api.identi.ApiSingpassResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: IdentiApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/api/identi/IdentiApi;", "", "getPhoneProhibitedCountryCodes", "Lcom/robinhood/models/api/identi/ApiPhoneProhibitedCountryCodes;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSingpassUserInfoExists", "Lcom/robinhood/models/api/identi/ApiSingpassResult;", "lib-api-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface IdentiApi {
    @GET("user_info/phone_update_info/")
    Object getPhoneProhibitedCountryCodes(Continuation<? super ApiPhoneProhibitedCountryCodes> continuation);

    @POST("system_check/singpass/user_info_exists/")
    @RequiresRegionGate(regionGates = {SingpassRegionGate.class})
    Object postSingpassUserInfoExists(Continuation<? super ApiSingpassResult> continuation);
}
