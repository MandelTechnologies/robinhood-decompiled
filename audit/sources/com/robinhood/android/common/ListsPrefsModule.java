package com.robinhood.android.common;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.store.lists.prefs.OptionsWatchlistViewModePref;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListsPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ListsPrefsModule;", "", "<init>", "()V", "provideOptionsWatchlistViewModePref", "Lcom/robinhood/prefs/StringPreference;", "prefs", "Landroid/content/SharedPreferences;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ListsPrefsModule {
    public static final ListsPrefsModule INSTANCE = new ListsPrefsModule();

    private ListsPrefsModule() {
    }

    @OptionsWatchlistViewModePref
    public final StringPreference provideOptionsWatchlistViewModePref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringPreference(prefs, "options_watchlist_view_mode", SecurityViewMode.LAST_PRICE.toString(), null, 8, null);
    }
}
