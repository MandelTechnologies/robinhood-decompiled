package com.robinhood.android.dashboard.lib;

import android.content.SharedPreferences;
import com.robinhood.android.dashboard.lib.prefs.AccountSwitcherBadgeInteractionMapPref;
import com.robinhood.android.dashboard.lib.prefs.AccountSwitcherTooltipImpressionMapPref;
import com.robinhood.android.dashboard.lib.prefs.AccountSwitcherTooltipInteractionMapPref;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibDashboardModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/LibDashboardModule;", "", "<init>", "()V", "provideHasInteractedWithAccountSwitcherPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "preferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideNumberAccountSwitcherTooltipImpressions", "Lcom/robinhood/prefs/StringToLongMapPreference;", "provideHasInteractedWithAccountSwitcherBadgePref", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LibDashboardModule {
    public static final int $stable = 0;
    public static final LibDashboardModule INSTANCE = new LibDashboardModule();

    private LibDashboardModule() {
    }

    @AccountSwitcherTooltipInteractionMapPref
    public final StringToBooleanMapPreference provideHasInteractedWithAccountSwitcherPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(preferences, "hasInteractedWithAccountSwitcherMap", null, moshi, null, 20, null);
    }

    @AccountSwitcherTooltipImpressionMapPref
    public final StringToLongMapPreference provideNumberAccountSwitcherTooltipImpressions(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(preferences, "numberAccountSwitcherTooltipImpressionsMap", null, moshi, 4, null);
    }

    @AccountSwitcherBadgeInteractionMapPref
    public final StringToBooleanMapPreference provideHasInteractedWithAccountSwitcherBadgePref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(preferences, "hasInteractedWithAccountSwitcherBadgeMap", null, moshi, null, 20, null);
    }
}
