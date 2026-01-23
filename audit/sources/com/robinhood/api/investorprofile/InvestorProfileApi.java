package com.robinhood.api.investorprofile;

import com.robinhood.models.api.identi.ApiInvestmentProfileRefresh;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: InvestorProfileApi.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/api/investorprofile/InvestorProfileApi;", "", "checkInvestmentProfileRefresh", "Lcom/robinhood/models/api/identi/ApiInvestmentProfileRefresh;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface InvestorProfileApi {
    @GET("user_info/investment_profile/refresh/")
    Object checkInvestmentProfileRefresh(Continuation<? super ApiInvestmentProfileRefresh> continuation);
}
