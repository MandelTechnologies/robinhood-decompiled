package com.robinhood.android.slip.lib.dagger;

import android.content.SharedPreferences;
import com.robinhood.android.slip.lib.prefs.LastTimePromptedToUpdateSlipAgreement;
import com.robinhood.android.slip.lib.prefs.SlipAgreementPromptPeriod;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLibSlipModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/dagger/FeatureLibSlipModule;", "", "<init>", "()V", "provideLastTimePromptedToUpdateSlipAgreementPref", "Lcom/robinhood/prefs/LongPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideSlipAgreementPromptPeriodPref", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FeatureLibSlipModule {
    public static final int $stable = 0;
    public static final FeatureLibSlipModule INSTANCE = new FeatureLibSlipModule();

    private FeatureLibSlipModule() {
    }

    @LastTimePromptedToUpdateSlipAgreement
    public final LongPreference provideLastTimePromptedToUpdateSlipAgreementPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "lastTimePromptedToUpdateSlipAgreement", 0L, 4, null);
    }

    @SlipAgreementPromptPeriod
    public final LongPreference provideSlipAgreementPromptPeriodPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "slipAgreementPromptPeriod", 0L, 4, null);
    }
}
