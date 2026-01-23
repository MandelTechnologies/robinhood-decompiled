package com.robinhood.android.equities.store.swipetotrade;

import android.content.SharedPreferences;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquitySwipeNuxModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxModule;", "", "<init>", "()V", "provideEquitySwipeNuxTooltipLastShownPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideEquitySwipeNuxPeekLastShownPref", "provideEquitySwipeNuxPeekCountPref", "Lcom/robinhood/prefs/IntPreference;", "provideEquitySwipeNuxTradesSinceLastPeekPref", "provideEquitySwipeNuxLastSwipePref", "lib-store-equity-swipetotrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquitySwipeNuxModule {
    public static final EquitySwipeNuxModule INSTANCE = new EquitySwipeNuxModule();

    private EquitySwipeNuxModule() {
    }

    @EquitySwipeNuxModule5
    public final StringPreference provideEquitySwipeNuxTooltipLastShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "EquitySwipeNuxTooltipLastShownPref", null, null, 12, null);
    }

    @EquitySwipeNuxModule4
    public final StringPreference provideEquitySwipeNuxPeekLastShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "EquitySwipeNuxPeekLastShownPref", null, null, 12, null);
    }

    @EquitySwipeNuxModule3
    public final IntPreference provideEquitySwipeNuxPeekCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "EquitySwipeNuxPeekCountPref", 0, 4, null);
    }

    @EquitySwipeNuxModule6
    public final IntPreference provideEquitySwipeNuxTradesSinceLastPeekPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "EquitySwipeNuxTradesSinceLastPeekOrSwipePref", 0, 4, null);
    }

    @EquitySwipeNuxModule2
    public final StringPreference provideEquitySwipeNuxLastSwipePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "EquitySwipeNuxLastTradePref", null, null, 12, null);
    }
}
