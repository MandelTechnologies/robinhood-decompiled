package com.robinhood.android.lib.api.instant;

import com.robinhood.android.lib.models.instant.api.ApiInstantDepositCard;
import com.robinhood.android.regiongate.InstantDepositRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: InstantBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/api/instant/InstantBonfireApi;", "", "getInstantDepositsCard", "Lcom/robinhood/android/lib/models/instant/api/ApiInstantDepositCard;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-instant_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface InstantBonfireApi {
    @GET("accounts/{account_number}/account_instant_deposits_card/")
    @RequiresRegionGate(regionGates = {InstantDepositRegionGate.class})
    Object getInstantDepositsCard(@Path("account_number") String str, Continuation<? super ApiInstantDepositCard> continuation);
}
