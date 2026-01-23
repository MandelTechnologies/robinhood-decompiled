package com.robinhood.android.lib.margin.api;

import android.annotation.SuppressLint;
import com.robinhood.android.lib.margin.api.models.ApiMarginUpgradeRestriction;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: MarginBrokebackApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/MarginBrokebackApi;", "", "getMarginUpgradeRestrictions", "Lcom/robinhood/android/lib/margin/api/models/ApiMarginUpgradeRestriction;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginBrokebackApi {
    @GET("margin/{accountNumber}/upgrade_restrictions/")
    @SuppressLint({"NoNewRetrofitEndpoints"})
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getMarginUpgradeRestrictions(@Path("accountNumber") String str, Continuation<? super ApiMarginUpgradeRestriction> continuation);
}
