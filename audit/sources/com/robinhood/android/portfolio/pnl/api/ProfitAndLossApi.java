package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.models.CommaSeparatedList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ProfitAndLossApi.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApi;", "", "getProfitAndLossChart", "Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossChart;", "accountNumber", "", "assets", "Lcom/robinhood/models/CommaSeparatedList;", "span", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "(Ljava/lang/String;Lcom/robinhood/models/CommaSeparatedList;Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface ProfitAndLossApi {
    @GET("portfolio/profit-and-loss/{account_number}/chart")
    Object getProfitAndLossChart(@Path("account_number") String str, @Query("assets") CommaSeparatedList<String> commaSeparatedList, @Query("span") ProfitAndLossChartSpan profitAndLossChartSpan, Continuation<? super ApiProfitAndLossChart> continuation);

    /* compiled from: ProfitAndLossApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getProfitAndLossChart$default(ProfitAndLossApi profitAndLossApi, String str, CommaSeparatedList commaSeparatedList, ProfitAndLossChartSpan profitAndLossChartSpan, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProfitAndLossChart");
            }
            if ((i & 4) != 0) {
                profitAndLossChartSpan = null;
            }
            return profitAndLossApi.getProfitAndLossChart(str, commaSeparatedList, profitAndLossChartSpan, continuation);
        }
    }
}
