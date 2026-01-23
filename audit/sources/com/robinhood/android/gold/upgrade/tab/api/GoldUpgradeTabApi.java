package com.robinhood.android.gold.upgrade.tab.api;

import com.robinhood.android.gold.upgrade.tab.model.ApiGoldUpgradeTab;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: GoldUpgradeTabApi.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/api/GoldUpgradeTabApi;", "", "getGoldUpgradeTab", "Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GoldUpgradeTabApi {
    @GET("tab/")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getGoldUpgradeTab(Continuation<? super ApiGoldUpgradeTab> continuation);
}
