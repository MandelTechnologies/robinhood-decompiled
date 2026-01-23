package com.robinhood.api.retrofit;

import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.ApiQueuedIavDeposit;
import com.robinhood.models.api.cashier.RhAccountType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: Iav.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Iav;", "", "getQueuedIavDeposit", "Lcom/robinhood/models/api/ApiQueuedIavDeposit;", "rhAccountType", "Lcom/robinhood/models/api/cashier/RhAccountType;", "(Lcom/robinhood/models/api/cashier/RhAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Iav {
    @GET("ach/iav/queued_deposit/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getQueuedIavDeposit(@Query("rh_account_type") RhAccountType rhAccountType, Continuation<? super ApiQueuedIavDeposit> continuation);

    /* compiled from: Iav.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getQueuedIavDeposit$default(Iav iav, RhAccountType rhAccountType, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQueuedIavDeposit");
            }
            if ((i & 1) != 0) {
                rhAccountType = RhAccountType.RHS_ACCOUNT;
            }
            return iav.getQueuedIavDeposit(rhAccountType, continuation);
        }
    }
}
