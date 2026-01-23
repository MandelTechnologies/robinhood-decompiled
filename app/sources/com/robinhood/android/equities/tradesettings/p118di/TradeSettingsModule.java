package com.robinhood.android.equities.tradesettings.p118di;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeSettingsModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/di/TradeSettingsModule;", "", "<init>", "()V", "provideTimeInForcePref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "prefs", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideMarketHoursPref", "provideAutoSendAgreementDatePref", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TradeSettingsModule {
    public static final int $stable = 0;
    public static final TradeSettingsModule INSTANCE = new TradeSettingsModule();

    private TradeSettingsModule() {
    }

    @TradeSettingsModule3
    public final StringToStringMapPreference provideTimeInForcePref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToStringMapPreference(prefs, "tradeSettingsTimeInForce", null, moshi, 4, null);
    }

    @TradeSettingsModule4
    public final StringToStringMapPreference provideMarketHoursPref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToStringMapPreference(prefs, "tradeSettingsTradingSession", null, moshi, 4, null);
    }

    @TradeSettingsModule2
    public final StringToStringMapPreference provideAutoSendAgreementDatePref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToStringMapPreference(prefs, "tradeSettingsAutoSendAgreementDate", null, moshi, 4, null);
    }
}
