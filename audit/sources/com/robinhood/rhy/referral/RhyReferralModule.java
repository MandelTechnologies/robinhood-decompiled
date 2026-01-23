package com.robinhood.rhy.referral;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralModule;", "", "<init>", "()V", "provideRhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideHasSeenRhyReferralLandingTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideHasViewedRefereeOfferPref", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RhyReferralModule {
    public static final RhyReferralModule INSTANCE = new RhyReferralModule();

    private RhyReferralModule() {
    }

    @RhyReferralOnboardingDataPref
    public final StringPreference provideRhyReferralOnboardingDataPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "rhyReferralOnboardingPref", null, null, 12, null);
    }

    @HasSeenRhyReferralLandingTooltipPref
    public final BooleanPreference provideHasSeenRhyReferralLandingTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenRhyReferralLandingTooltipPref", false, null, 8, null);
    }

    @HasViewedRefereeOfferPref
    public final BooleanPreference provideHasViewedRefereeOfferPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasViewedRefereeOfferPref", false, null, 8, null);
    }
}
