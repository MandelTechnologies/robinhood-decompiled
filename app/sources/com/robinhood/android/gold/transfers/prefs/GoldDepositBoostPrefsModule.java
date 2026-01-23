package com.robinhood.android.gold.transfers.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/transfers/prefs/GoldDepositBoostPrefsModule;", "", "<init>", "()V", "provideGoldDepositBoostTransferTimestampPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideGoldDepositBoostTransferAmountPref", "provideGoldDepositBoostTransferIdPref", "lib-gold-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDepositBoostPrefsModule {
    public static final int $stable = 0;
    public static final GoldDepositBoostPrefsModule INSTANCE = new GoldDepositBoostPrefsModule();

    private GoldDepositBoostPrefsModule() {
    }

    @GoldDepositBoostTransferTimestampPref
    public final StringPreference provideGoldDepositBoostTransferTimestampPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "goldDepositBoostTransferTimestampPref", null, null, 8, null);
    }

    @GoldDepositBoostTransferAmountPref
    public final StringPreference provideGoldDepositBoostTransferAmountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "goldDepositBoostTransferAmountPref", null, null, 8, null);
    }

    @GoldDepositBoostTransferIdPref
    public final StringPreference provideGoldDepositBoostTransferIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "goldDepositBoostTransferIdPref", null, null, 8, null);
    }
}
