package com.robinhood.android.api.options.retrofit;

import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.accountswitcher.ApiAggregateOptionsPositionAccountSwitcher;
import com.robinhood.models.api.accountswitcher.ApiOptionsInstrumentAccountSwitcher;
import com.robinhood.models.api.accountswitcher.ApiOptionsOrderFormAccountSwitcher;
import com.robinhood.models.api.accountswitcher.ApiOptionsStrategyAccountSwitcher;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: OptionsAccountSwitcherBonfireApi.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\rH§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/api/options/retrofit/OptionsAccountSwitcherBonfireApi;", "", "getOptionsAccountSwitcherWithInstrumentId", "Lcom/robinhood/models/api/accountswitcher/ApiOptionsInstrumentAccountSwitcher;", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionsAccountSwitcherWithAggregatePositionId", "Lcom/robinhood/models/api/accountswitcher/ApiAggregateOptionsPositionAccountSwitcher;", "aggregatePositionId", "getOptionsAccountSwitcherWithStrategyCode", "Lcom/robinhood/models/api/accountswitcher/ApiOptionsStrategyAccountSwitcher;", "strategyCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionsAccountSwitcherWithChainIdAndLegs", "Lcom/robinhood/models/api/accountswitcher/ApiOptionsOrderFormAccountSwitcher;", "optionChainId", "legsJson", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface OptionsAccountSwitcherBonfireApi {
    @GET("account_switcher/aggregate_option_position/{aggregatePositionId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsAccountSwitcherWithAggregatePositionId(@Path("aggregatePositionId") UUID uuid, Continuation<? super ApiAggregateOptionsPositionAccountSwitcher> continuation);

    @GET("account_switcher/option_chain/{chainId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsAccountSwitcherWithChainIdAndLegs(@Path("chainId") UUID uuid, @Query("option_legs") String str, Continuation<? super ApiOptionsOrderFormAccountSwitcher> continuation);

    @GET("account_switcher/option_instrument/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsAccountSwitcherWithInstrumentId(@Path("instrumentId") UUID uuid, Continuation<? super ApiOptionsInstrumentAccountSwitcher> continuation);

    @GET("account_switcher/option_strategy/{strategyCode}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsAccountSwitcherWithStrategyCode(@Path("strategyCode") String str, Continuation<? super ApiOptionsStrategyAccountSwitcher> continuation);
}
