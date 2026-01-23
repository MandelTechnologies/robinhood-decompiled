package com.robinhood.android.common.mcduckling;

import android.content.SharedPreferences;
import com.robinhood.android.common.mcduckling.prefs.RhyAlwaysShowAddToGPayPref;
import com.robinhood.android.common.mcduckling.prefs.RhyDebugHideNuxPref;
import com.robinhood.android.common.mcduckling.prefs.RhyMigrationCmSunsetLastTime;
import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLibMcDucklingModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/FeatureLibMcDucklingModule;", "", "<init>", "()V", "provideShouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideRhyMigrationCmSunsetLastTime", "Lcom/robinhood/prefs/LongPreference;", "provideRhyAlwaysShowAddToGPayPref", "provideDebugHideNuxPref", "prefs", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FeatureLibMcDucklingModule {
    public static final FeatureLibMcDucklingModule INSTANCE = new FeatureLibMcDucklingModule();

    private FeatureLibMcDucklingModule() {
    }

    @ShouldResetCashTabPref
    public final BooleanPreference provideShouldResetCashTabPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "shouldResetCashTabPref", false, null, 8, null);
    }

    @RhyMigrationCmSunsetLastTime
    public final LongPreference provideRhyMigrationCmSunsetLastTime(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "rhyMigrationCmSunsetLastTime", 0L);
    }

    @RhyAlwaysShowAddToGPayPref
    public final BooleanPreference provideRhyAlwaysShowAddToGPayPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "rhyAlwaysShowAddToGPayPref", false, null, 8, null);
    }

    @RhyDebugHideNuxPref
    public final BooleanPreference provideDebugHideNuxPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "debugRhyHideNuxPref", false, null, 8, null);
    }
}
