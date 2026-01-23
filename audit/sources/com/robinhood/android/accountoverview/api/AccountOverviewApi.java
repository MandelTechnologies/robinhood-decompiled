package com.robinhood.android.accountoverview.api;

import com.robinhood.android.models.accountoverview.api.ApiCardOrder;
import com.robinhood.android.models.accountoverview.api.ApiDayTradeCard;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: AccountOverviewApi.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/accountoverview/api/AccountOverviewApi;", "", "getDayTradeCard", "Lcom/robinhood/android/models/accountoverview/api/ApiDayTradeCard;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardOrder", "Lcom/robinhood/android/models/accountoverview/api/ApiCardOrder;", "lib-api-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AccountOverviewApi {
    @GET("account_summary/{account_number}/card_order")
    Object getCardOrder(@Path("account_number") String str, Continuation<? super ApiCardOrder> continuation);

    @GET("margin/{account_number}/day_trades_card")
    Object getDayTradeCard(@Path("account_number") String str, Continuation<? super ApiDayTradeCard> continuation);
}
