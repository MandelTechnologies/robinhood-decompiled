package com.robinhood.librobinhood.data.store.bonfire.daytrades.api;

import com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment;
import com.robinhood.models.api.ApiSessionAlert;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: DayTradeApi.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/api/DayTradeApi;", "", "getPostTradeEquitiesWarning", "Lcom/robinhood/models/api/ApiSessionAlert;", "accountNumber", "", "equityOrderId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostTradeOptionsWarning", ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, "lib-store-day-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public interface DayTradeApi {
    @GET("accounts/{accountNumber}/day_trade_warning/")
    Object getPostTradeEquitiesWarning(@Path("accountNumber") String str, @Query("equity_order_id") UUID uuid, Continuation<? super ApiSessionAlert> continuation);

    @GET("accounts/{accountNumber}/day_trade_warning/")
    Object getPostTradeOptionsWarning(@Path("accountNumber") String str, @Query("option_order_id") UUID uuid, Continuation<? super ApiSessionAlert> continuation);
}
