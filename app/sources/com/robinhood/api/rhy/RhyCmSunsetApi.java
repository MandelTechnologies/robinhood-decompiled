package com.robinhood.api.rhy;

import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.minerva.RhyMigrationSunset;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: RhyCmSunsetApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/api/rhy/RhyCmSunsetApi;", "", "getCmShutdown", "Lcom/robinhood/models/api/minerva/RhyMigrationSunset;", "accountId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cmShutdownOptOut", "", "cmShutdownEmailAcctInfo", "lib-api-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface RhyCmSunsetApi {
    @POST("accounts/{accountId}/email_account_info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object cmShutdownEmailAcctInfo(@Path("accountId") UUID uuid, Continuation<? super Unit> continuation);

    @POST("accounts/{accountId}/opt_out_sunset_cm/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object cmShutdownOptOut(@Path("accountId") UUID uuid, Continuation<? super Unit> continuation);

    @GET("accounts/{accountId}/cm_shutdown/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getCmShutdown(@Path("accountId") UUID uuid, Continuation<? super RhyMigrationSunset> continuation);
}
