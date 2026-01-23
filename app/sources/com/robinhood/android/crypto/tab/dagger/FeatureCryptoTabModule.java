package com.robinhood.android.crypto.tab.dagger;

import android.content.SharedPreferences;
import com.robinhood.android.crypto.tab.p093ui.pnl.CryptoHomePnlEntryPointSeenNewBadgePref;
import com.robinhood.android.crypto.tab.p093ui.power.HasSeenEuBuyingPowerTooltipPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureCryptoTabModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/dagger/FeatureCryptoTabModule;", "", "<init>", "()V", "provideHasSeenEuBuyingPowerTooltip", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "providesCryptoHomePnlEntryPointSeenNewBadgePref", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FeatureCryptoTabModule {
    public static final int $stable = 0;
    public static final FeatureCryptoTabModule INSTANCE = new FeatureCryptoTabModule();

    private FeatureCryptoTabModule() {
    }

    @HasSeenEuBuyingPowerTooltipPref
    public final BooleanPreference provideHasSeenEuBuyingPowerTooltip(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenEuBuyingPowerTooltipPref2", false, null, 8, null);
    }

    @CryptoHomePnlEntryPointSeenNewBadgePref
    public final BooleanPreference providesCryptoHomePnlEntryPointSeenNewBadgePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "cryptoHomePnlEntryPointSeenNewBadgePref", false, null, 8, null);
    }
}
