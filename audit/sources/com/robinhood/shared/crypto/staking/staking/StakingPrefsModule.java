package com.robinhood.shared.crypto.staking.staking;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.crypto.staking.staking.input.StakingIsQuoteInputModePref;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StakingPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/StakingPrefsModule;", "", "<init>", "()V", "provideStakingIsQuoteInputModePref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class StakingPrefsModule {
    public static final int $stable = 0;

    @StakingIsQuoteInputModePref
    public final BooleanPreference provideStakingIsQuoteInputModePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "stakingIsQuoteInputModePref", true, null, 8, null);
    }
}
