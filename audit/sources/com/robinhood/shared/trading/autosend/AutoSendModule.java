package com.robinhood.shared.trading.autosend;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoSendModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trading/autosend/AutoSendModule;", "", "<init>", "()V", "provideMacAutoSendPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideLadderAutoSendPref", "provideTradeFlowAutoSendPref", "lib-autosend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AutoSendModule {
    public static final AutoSendModule INSTANCE = new AutoSendModule();

    private AutoSendModule() {
    }

    @AutoSendModule3
    public final BooleanPreference provideMacAutoSendPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "autoSendPref_MAC", preferences.getBoolean("autoSendPref", false), null, 8, null);
    }

    @AutoSendModule2
    public final BooleanPreference provideLadderAutoSendPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "autoSendPref_LADDER", preferences.getBoolean("futuresAutoSendPref", false), null, 8, null);
    }

    @AutoSendModule4
    public final BooleanPreference provideTradeFlowAutoSendPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "autoSendPref_TRADE_FLOW", false, null, 8, null);
    }
}
