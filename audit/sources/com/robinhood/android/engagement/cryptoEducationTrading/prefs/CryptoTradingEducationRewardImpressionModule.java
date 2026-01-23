package com.robinhood.android.engagement.cryptoEducationTrading.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradingEducationRewardImpressionModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/prefs/HasCryptoTradingEducationRewardImpressionModule;", "", "<init>", "()V", "provideCryptoImpressionPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "lib-crypto-education-trading_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.prefs.HasCryptoTradingEducationRewardImpressionModule, reason: use source file name */
/* loaded from: classes7.dex */
public final class CryptoTradingEducationRewardImpressionModule {
    public static final int $stable = 0;
    public static final CryptoTradingEducationRewardImpressionModule INSTANCE = new CryptoTradingEducationRewardImpressionModule();

    private CryptoTradingEducationRewardImpressionModule() {
    }

    @HasCryptoTradingEducationRewardImpressionPref
    public final BooleanPreference provideCryptoImpressionPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "has_crypto_trading_education_reward_impression", false, null, 8, null);
    }
}
