package com.robinhood.android.lib.margin.api;

import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: InterestRatesApi.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0005¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/InterestRatesApi;", "", "getChoices", "", "Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComparisonVisualization", "Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface InterestRatesApi {
    @GET("margin/interest_rates/choices/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getChoices(Continuation<? super List<MarginInterestRateChoice>> continuation);

    @GET("margin/interest_rates/comparison_visualization/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getComparisonVisualization(Continuation<? super InterestRatesComparisonVisualization> continuation);
}
