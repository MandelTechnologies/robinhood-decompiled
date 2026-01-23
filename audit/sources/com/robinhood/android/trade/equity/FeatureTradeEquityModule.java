package com.robinhood.android.trade.equity;

import android.content.SharedPreferences;
import com.robinhood.android.trade.equity.prefs.BuySellOrderOnboardingSeenPref;
import com.robinhood.android.trade.equity.prefs.HasShownAdtOrderTypeMenuOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownBuySellOrderTypeMenuOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownExtendedHoursAlertPref;
import com.robinhood.android.trade.equity.prefs.HasShownMarketBuysOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownTaxLotsOnboardingTooltipPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureTradeEquityModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/FeatureTradeEquityModule;", "", "<init>", "()V", "provideHasShownExtendedHoursAlertPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideHasShownOrderTypeMenuOnboardingTooltipPref", "provideHasShownMarketBuysOnboardingTooltipPref", "provideHasShownAdtOrderTypeMenuOnboardingTooltipPref", "provideBuySellOrderOnboardingSeenPref", "preferences", "provideTaxLotsOnboardingSeenPref", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class FeatureTradeEquityModule {
    public static final int $stable = 0;
    public static final FeatureTradeEquityModule INSTANCE = new FeatureTradeEquityModule();

    private FeatureTradeEquityModule() {
    }

    @HasShownExtendedHoursAlertPref
    public final BooleanPreference provideHasShownExtendedHoursAlertPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasShownExtendedHoursAlert", false, null, 8, null);
    }

    @HasShownBuySellOrderTypeMenuOnboardingTooltipPref
    public final BooleanPreference provideHasShownOrderTypeMenuOnboardingTooltipPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasShownBuySellOrderTypeMenuOnboardingTooltip", false, null, 8, null);
    }

    @HasShownMarketBuysOnboardingTooltipPref
    public final BooleanPreference provideHasShownMarketBuysOnboardingTooltipPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasShownMarketBuysOnboardingTooltip", false, null, 8, null);
    }

    @HasShownAdtOrderTypeMenuOnboardingTooltipPref
    public final BooleanPreference provideHasShownAdtOrderTypeMenuOnboardingTooltipPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasShownAdtOrderTypeMenuOnboardingTooltip", false, null, 8, null);
    }

    @BuySellOrderOnboardingSeenPref
    public final BooleanPreference provideBuySellOrderOnboardingSeenPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "buySellOrderOnboardingSeen", false, null, 8, null);
    }

    @HasShownTaxLotsOnboardingTooltipPref
    public final BooleanPreference provideTaxLotsOnboardingSeenPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "taxLotsOnboardingSeen", false, null, 8, null);
    }
}
