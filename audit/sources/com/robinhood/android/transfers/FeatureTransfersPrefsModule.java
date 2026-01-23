package com.robinhood.android.transfers;

import android.content.SharedPreferences;
import com.robinhood.android.transfers.preference.DefaultUkExternalTransferAccountPref;
import com.robinhood.android.transfers.preference.DirectDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositHookExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureResetPref;
import com.robinhood.android.transfers.preference.HasSeenFullscreenMatchSelectionPref;
import com.robinhood.android.transfers.preference.RecurringDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.RhsRecurringDepositHookExposureCountPref;
import com.robinhood.android.transfers.preference.RhyRecurringDepositHookExposureCountPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureTransfersPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/FeatureTransfersPrefsModule;", "", "<init>", "()V", "provideRhsRecurringDepositHookCountPref", "Lcom/robinhood/prefs/IntPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideRhyRecurringDepositHookCountV2Pref", "provideDirectDepositUpsellExposureCountPref", "provideGoldDepositHookExposureCountV2Pref", "provideHasSeenFullscreenMatchSelectionPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideRecurringDepositUpsellExposureCountPref", "provideGoldDepositUpsellExposureCountPref", "provideGoldDepositUpsellExposureResetPref", "provideDefaultUkExternalTransferAccountPref", "Lcom/robinhood/prefs/StringPreference;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class FeatureTransfersPrefsModule {
    public static final int $stable = 0;
    public static final FeatureTransfersPrefsModule INSTANCE = new FeatureTransfersPrefsModule();

    private FeatureTransfersPrefsModule() {
    }

    @RhsRecurringDepositHookExposureCountPref
    public final IntPreference provideRhsRecurringDepositHookCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "recurringDepositHookCountV2Pref", 0);
    }

    @RhyRecurringDepositHookExposureCountPref
    public final IntPreference provideRhyRecurringDepositHookCountV2Pref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "rhyRecurringDepositHookCountV2Pref", 0);
    }

    @DirectDepositUpsellExposureCountPref
    public final IntPreference provideDirectDepositUpsellExposureCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "directDepositUpsellExposureCountPref", 0);
    }

    @GoldDepositHookExposureCountPref
    public final IntPreference provideGoldDepositHookExposureCountV2Pref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "goldDepositHookExposureCountV2Pref", 0);
    }

    @HasSeenFullscreenMatchSelectionPref
    public final BooleanPreference provideHasSeenFullscreenMatchSelectionPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenFullscreenMatchSelectionPref", false, null, 8, null);
    }

    @RecurringDepositUpsellExposureCountPref
    public final IntPreference provideRecurringDepositUpsellExposureCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "recurringDepositUpsellExposureCountPref", 0);
    }

    @GoldDepositUpsellExposureCountPref
    public final IntPreference provideGoldDepositUpsellExposureCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "goldDepositUpsellExposureCountPref", 0);
    }

    @GoldDepositUpsellExposureResetPref
    public final BooleanPreference provideGoldDepositUpsellExposureResetPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "goldDepositUpsellExposureResetPref", false, null, 8, null);
    }

    @DefaultUkExternalTransferAccountPref
    public final StringPreference provideDefaultUkExternalTransferAccountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "defaultUkExternalTransferAccountPref", null, null, 8, null);
    }
}
