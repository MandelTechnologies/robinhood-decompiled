package com.robinhood.android.lib.api.p164fx;

import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.p325fx.api.ApiFxOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: FxOrderApi.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/api/fx/FxOrderApi;", "", "getFxOrder", "Lcom/robinhood/models/fx/api/ApiFxOrder;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFxOrderList", "Lcom/robinhood/models/PaginatedResult;", "paginationCursor", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FxOrderApi {
    @GET("accounts/{account_number}/fx_order/{order_id}/")
    @RequiresRegionGate(regionGates = {McwRegionGate.class})
    Object getFxOrder(@Path("account_number") String str, @Path("order_id") UUID uuid, Continuation<? super ApiFxOrder> continuation);

    @GET("accounts/fx_order/")
    @RequiresRegionGate(regionGates = {McwRegionGate.class})
    Object getFxOrderList(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiFxOrder>> continuation);
}
