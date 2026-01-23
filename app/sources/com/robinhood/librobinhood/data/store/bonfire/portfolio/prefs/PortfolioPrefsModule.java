package com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPrefState;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: PortfolioPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/prefs/PortfolioPrefsModule;", "", "<init>", "()V", "providesAssetHomeShowEntryNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "providesAssetHomeOptionsTourShownPref", "providesChartHoursEnabledPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "providesBenchmarkIntroShownPrefState", "providesOptionsMarketOrdersEntryNuxTimesShownPref", "Lcom/robinhood/prefs/IntPreference;", "providesOptionsMarketOrdersEntryNuxLastShownPref", "Lcom/robinhood/prefs/StringPreference;", "provideFuturesAssetHomeOpenedPref", "provideHasOpenedEcHubPref", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PortfolioPrefsModule {
    public static final PortfolioPrefsModule INSTANCE = new PortfolioPrefsModule();

    private PortfolioPrefsModule() {
    }

    @AssetHomeShowEntryNuxPref
    public final BooleanPreference providesAssetHomeShowEntryNuxPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "portfolio_assetHomeShowEntryNuxPref", true, null, 8, null);
    }

    @AssetHomeOptionsTourShownPref
    public final BooleanPreference providesAssetHomeOptionsTourShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "portfolio_assetHomeOptionsTourShownPref", false, null, 8, null);
    }

    @ChartHoursEnabledPrefState
    public final StateFlow2<Boolean> providesChartHoursEnabledPrefState(@UserPrefs SharedPreferences preferences, LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        return BooleanPrefState.toPrefState(new BooleanPreference(preferences, "portfolio_chartHoursEnabledPref", true, null, 8, null), logoutKillswitch);
    }

    @BenchmarkIntroShownPrefState
    public final StateFlow2<Boolean> providesBenchmarkIntroShownPrefState(@UserPrefs SharedPreferences preferences, LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        return BooleanPrefState.toPrefState(new BooleanPreference(preferences, "portfolio_benchmarkIntroShownPref", false, null, 8, null), logoutKillswitch);
    }

    @OptionsMarketOrdersEntryNuxTimesShownPref
    public final IntPreference providesOptionsMarketOrdersEntryNuxTimesShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "portfolio_optionsMarketOrdersEntryNuxTimesShownPref", 0);
    }

    @OptionsMarketOrdersEntryNuxLastShownPref
    public final StringPreference providesOptionsMarketOrdersEntryNuxLastShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "portfolio_optionsMarketOrdersEntryNuxLastShownPref", "", null, 8, null);
    }

    @FuturesAssetHomeOpenedPref
    public final BooleanPreference provideFuturesAssetHomeOpenedPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "portfolio_futuresAssetHomeOpenedPref", false, null, 8, null);
    }

    @HasOpenedEcHubPref
    public final BooleanPreference provideHasOpenedEcHubPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "portfolio_hasOpenedEcHubPref", false, null, 8, null);
    }
}
