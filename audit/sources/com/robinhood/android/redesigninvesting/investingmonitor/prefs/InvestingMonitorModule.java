package com.robinhood.android.redesigninvesting.investingmonitor.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/prefs/InvestingMonitorModule;", "", "<init>", "()V", "provideInvestingMonitorViewMode", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "preferences", "Landroid/content/SharedPreferences;", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingMonitorModule {
    public static final int $stable = 0;
    public static final InvestingMonitorModule INSTANCE = new InvestingMonitorModule();

    private InvestingMonitorModule() {
    }

    @InvestingMonitorViewModePref
    public final EnumPreference<InvestingMonitorViewMode> provideInvestingMonitorViewMode(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(InvestingMonitorViewMode.class, preferences, "viewMode", InvestingMonitorViewMode.LIST, null, 16, null);
    }
}
