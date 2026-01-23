package com.robinhood.android.lib.store.creditcard;

import android.content.SharedPreferences;
import com.robinhood.android.lib.store.creditcard.prefs.CreditApplicationIdPref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardApplicationReferralCodePref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardApplicationShowPlanSelectorPref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardEntryPointSourcePref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistAutoJoinPref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistReferralCodePref;
import com.robinhood.android.lib.store.creditcard.prefs.IdentityIdPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardStorePrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/store/creditcard/CreditCardStorePrefsModule;", "", "<init>", "()V", "provideIdentityIdPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideCreditApplicationIdPref", "provideEntryPointSourcePref", "provideCreditCardWaitlistReferralCodePref", "provideCreditCardWaitlistAutoJoinPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideCreditCardApplicationReferralCodePref", "provideCreditCardApplicationShowPlanSelectorPref", "lib-store-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreditCardStorePrefsModule {
    public static final int $stable = 0;
    public static final CreditCardStorePrefsModule INSTANCE = new CreditCardStorePrefsModule();

    private CreditCardStorePrefsModule() {
    }

    @IdentityIdPref
    public final StringPreference provideIdentityIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "identityId", null, null, 12, null);
    }

    @CreditApplicationIdPref
    public final StringPreference provideCreditApplicationIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "creditApplicationId", null, null, 12, null);
    }

    @CreditCardEntryPointSourcePref
    public final StringPreference provideEntryPointSourcePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "creditCardEntryPointSource", null, null, 12, null);
    }

    @CreditCardWaitlistReferralCodePref
    public final StringPreference provideCreditCardWaitlistReferralCodePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "creditCardWaitlistReferralCode", null, null, 12, null);
    }

    @CreditCardWaitlistAutoJoinPref
    public final BooleanPreference provideCreditCardWaitlistAutoJoinPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "creditCardWaitlistAutoJoin", false, null, 8, null);
    }

    @CreditCardApplicationReferralCodePref
    public final StringPreference provideCreditCardApplicationReferralCodePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "creditCardApplicationReferralCode", null, null, 12, null);
    }

    @CreditCardApplicationShowPlanSelectorPref
    public final BooleanPreference provideCreditCardApplicationShowPlanSelectorPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "creditCardApplicationShowPlanSelector", false, null, 8, null);
    }
}
