package com.robinhood.android.equityadvancedorder;

import android.content.SharedPreferences;
import com.robinhood.android.equityadvancedorder.prefs.DefaultTimeInForcePref;
import com.robinhood.android.equityadvancedorder.prefs.DefaultTradingHoursPref;
import com.robinhood.android.equityadvancedorder.prefs.StreamlinedLimitOrderOnboardingSeenPref;
import com.robinhood.android.equityadvancedorder.prefs.StreamlinedLimitOrderOnboardingSeenPref2;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderModule;", "", "<init>", "()V", "provideStreamlinedLimitOrderSellOnboardingSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideStreamlinedLimitOrderBuyOnboardingSeenPref", "provideDefaultTradingHoursPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "provideDefaultTimeInForcePref", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderModule {
    public static final int $stable = 0;
    public static final EquityAdvancedOrderModule INSTANCE = new EquityAdvancedOrderModule();

    private EquityAdvancedOrderModule() {
    }

    @StreamlinedLimitOrderOnboardingSeenPref2
    public final BooleanPreference provideStreamlinedLimitOrderSellOnboardingSeenPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "streamlinedLimitOrderSellOnboardingSeenPref", false, null, 8, null);
    }

    @StreamlinedLimitOrderOnboardingSeenPref
    public final BooleanPreference provideStreamlinedLimitOrderBuyOnboardingSeenPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "streamlinedLimitOrderBuyOnboardingSeenPref", false, null, 8, null);
    }

    @DefaultTradingHoursPref
    public final StringPreference provideDefaultTradingHoursPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "defaultTradingHoursPref", OrderMarketHours.REGULAR_HOURS.getServerValue(), null, 8, null);
    }

    @DefaultTimeInForcePref
    public final StringPreference provideDefaultTimeInForcePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "defaultTimeInForcePref", OrderTimeInForce.GFD.getServerValue(), null, 8, null);
    }
}
