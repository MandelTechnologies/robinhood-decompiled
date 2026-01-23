package com.robinhood.android.lib.margin.hub.api;

import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubOnboardingAlert;
import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubView;
import com.robinhood.android.lib.margin.hub.api.models.MarginStatusDetailViewResponse;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: MarginHubApi.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/api/MarginHubApi;", "", "getBuyingPowerHubView", "Lcom/robinhood/android/lib/margin/hub/api/models/ApiBuyingPowerHubView;", "accountNumber", "", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarginStatusDetailView", "Lcom/robinhood/android/lib/margin/hub/api/models/MarginStatusDetailViewResponse$Success;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBuyingPowerHubOnboardingAlert", "Lcom/robinhood/android/lib/margin/hub/api/models/ApiBuyingPowerHubOnboardingAlert;", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginHubApi {
    @GET("margin/margin_hub_onboarding_alert")
    @RequiresRegionGate(regionGates = {LeveredMarginRegionGate.class})
    Object getBuyingPowerHubOnboardingAlert(@Query("account_number") String str, Continuation<? super ApiBuyingPowerHubOnboardingAlert> continuation);

    @GET("margin/{account_number}/buying_power_hub_view")
    Object getBuyingPowerHubView(@Path("account_number") String str, @Query("display_currency") DisplayCurrency displayCurrency, Continuation<? super ApiBuyingPowerHubView> continuation);

    @GET("margin/{account_number}/status_detail_view")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getMarginStatusDetailView(@Path("account_number") String str, Continuation<? super MarginStatusDetailViewResponse.Success> continuation);

    /* compiled from: MarginHubApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getBuyingPowerHubView$default(MarginHubApi marginHubApi, String str, DisplayCurrency displayCurrency, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBuyingPowerHubView");
            }
            if ((i & 2) != 0) {
                displayCurrency = null;
            }
            return marginHubApi.getBuyingPowerHubView(str, displayCurrency, continuation);
        }

        public static /* synthetic */ Object getBuyingPowerHubOnboardingAlert$default(MarginHubApi marginHubApi, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBuyingPowerHubOnboardingAlert");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return marginHubApi.getBuyingPowerHubOnboardingAlert(str, continuation);
        }
    }
}
