package com.robinhood.android.common.data.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentRowPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/data/prefs/InstrumentRowPrefsModule;", "", "<init>", "()V", "provideViewModePref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentRowPrefsModule {
    public static final int $stable = 0;
    public static final InstrumentRowPrefsModule INSTANCE = new InstrumentRowPrefsModule();

    private InstrumentRowPrefsModule() {
    }

    @ViewModePref
    public final StringPreference provideViewModePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "view_mode", SecurityViewMode.LAST_PRICE.toString(), null, 8, null);
    }
}
