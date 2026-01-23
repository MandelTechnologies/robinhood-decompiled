package com.robinhood.android.cash.rhy.tab;

import android.content.SharedPreferences;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.HasShownRhyNuxTimestampPref;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.PaycheckModuleInfoBannerDismissTimeoutsPref;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.RhyHasDismissedClosedCmBannerPref;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.RhyHasSeenFixedPercentPopupPref;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.RhyHasSeenRurOnboardingPref;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.RhyShowCardNumberPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureCashRhyTabModule.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\u0007J\u0012\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/FeatureCashRhyTabModule;", "", "<init>", "()V", "provideRhyShowCardNumberPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideRhyHasSeenRurOnboardingPref", "provideRhyHasSeenFixedPercentPopupPref", "provideRhyPaycheckModuleInfoBannerDismissTimeoutsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideHasShownRhyNuxTimestampPref", "Lcom/robinhood/prefs/LongPreference;", "prefs", "provideRhyHasDismissedClosedCmBannerPref", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FeatureCashRhyTabModule {
    public static final int $stable = 0;
    public static final FeatureCashRhyTabModule INSTANCE = new FeatureCashRhyTabModule();

    private FeatureCashRhyTabModule() {
    }

    @RhyShowCardNumberPref
    public final BooleanPreference provideRhyShowCardNumberPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "rhyShowCardNumber", false, null, 8, null);
    }

    @RhyHasSeenRurOnboardingPref
    public final BooleanPreference provideRhyHasSeenRurOnboardingPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "rhyHasSeenRurOnboardingPref", false, null, 8, null);
    }

    @RhyHasSeenFixedPercentPopupPref
    public final BooleanPreference provideRhyHasSeenFixedPercentPopupPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "rhyRhyHasSeenFixedPercentPopupPref", false, null, 8, null);
    }

    @PaycheckModuleInfoBannerDismissTimeoutsPref
    public final StringToLongMapPreference provideRhyPaycheckModuleInfoBannerDismissTimeoutsPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(preferences, "rhyPaycheckModuleInfoBannerDismissTimeoutsPref", MapsKt.emptyMap(), moshi);
    }

    @HasShownRhyNuxTimestampPref
    public final LongPreference provideHasShownRhyNuxTimestampPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongPreference(prefs, "hasShownRhyNuxTimestampPref", 0L, 4, null);
    }

    @RhyHasDismissedClosedCmBannerPref
    public final BooleanPreference provideRhyHasDismissedClosedCmBannerPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "rhyHasDismissedClosedCmBannerPref", false, null, 8, null);
    }
}
