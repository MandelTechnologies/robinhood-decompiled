package com.robinhood.android.lib.p166fx.provider;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayCurrencySelectionPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/fx/provider/DisplayCurrencySelectionPrefsModule;", "", "<init>", "()V", "provideHomeDisplayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideAccountTabDisplayCurrencySelectionPref", "provideHasSeenFxSwitcherFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "lib-fx-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DisplayCurrencySelectionPrefsModule {
    public static final DisplayCurrencySelectionPrefsModule INSTANCE = new DisplayCurrencySelectionPrefsModule();

    private DisplayCurrencySelectionPrefsModule() {
    }

    @DisplayCurrencySelectionPrefs3
    public final IntPreference provideHomeDisplayCurrencySelectionPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "homeDisplayCurrencySelectionPref", 1);
    }

    @DisplayCurrencySelectionPrefs
    public final IntPreference provideAccountTabDisplayCurrencySelectionPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "accountTabDisplayCurrencySelectionPref", 1);
    }

    @DisplayCurrencySelectionPrefs2
    public final BooleanPreference provideHasSeenFxSwitcherFtuxPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenFxSwitcherFtuxPref", false, null, 8, null);
    }
}
