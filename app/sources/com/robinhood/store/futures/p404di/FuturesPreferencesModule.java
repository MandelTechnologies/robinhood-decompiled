package com.robinhood.store.futures.p404di;

import android.content.SharedPreferences;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.store.futures.ChartType;
import com.robinhood.store.futures.PostTradeLadderFtuxState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesPreferencesModule.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/futures/di/FuturesPreferencesModule;", "", "<init>", "()V", "provideFuturesTimeInForcePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "preferences", "Landroid/content/SharedPreferences;", "provideFuturesChartTypePref", "Lcom/robinhood/store/futures/ChartType;", "provideFuturesContinuousChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideShouldShowFuturesDetailsFtuxPref", "provideShouldShowFuturesLadderFtuxPref", "providesShouldShowLadderButtonTooltipPref", "providesPostTradeLadderFtuxStatePref", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "providesShouldShowFuturesGoldUpsellPref", "provideFuturesVisitedMacPref", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesPreferencesModule {
    @FuturesTimeInForcePref
    public final EnumPreference<FuturesTimeInForce> provideFuturesTimeInForcePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(FuturesTimeInForce.INSTANCE.getEnumClass(), preferences, "futuresTimeInForcePref", FuturesTimeInForce.GFD, null, 16, null);
    }

    @FuturesChartTypePref
    public final EnumPreference<ChartType> provideFuturesChartTypePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(ChartType.class, preferences, "futuresChartType", ChartType.LINE, null, 16, null);
    }

    @FuturesContinuousChartPref
    public final BooleanPreference provideFuturesContinuousChartPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "futuresContinuousChart", true, null, 8, null);
    }

    @FuturesFtuxPref2
    public final BooleanPreference provideShouldShowFuturesDetailsFtuxPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "shouldShowFuturesDetailsFtuxPrefKey", true, null, 8, null);
    }

    @FuturesFtuxPref3
    public final BooleanPreference provideShouldShowFuturesLadderFtuxPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "shouldShowFuturesLadderFtuxPrefKey", true, null, 8, null);
    }

    @FuturesFtuxPref4
    public final BooleanPreference providesShouldShowLadderButtonTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "shouldShowLadderButtonTooltipPrefKey", true, null, 8, null);
    }

    @FuturesFtuxPref
    public final EnumPreference<PostTradeLadderFtuxState> providesPostTradeLadderFtuxStatePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(PostTradeLadderFtuxState.class, preferences, "postTradeLadderFtuxStateKey", PostTradeLadderFtuxState.NOT_SEEN, null, 16, null);
    }

    @FuturesTradePref
    public final BooleanPreference providesShouldShowFuturesGoldUpsellPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "shouldShowFuturesGoldUpsellPrefKey", true, null, 8, null);
    }

    @FuturesVisitedMacPref
    public final BooleanPreference provideFuturesVisitedMacPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "futuresVisitedMacPrefKey", false, null, 8, null);
    }
}
