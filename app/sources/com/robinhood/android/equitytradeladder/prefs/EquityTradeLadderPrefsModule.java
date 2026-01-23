package com.robinhood.android.equitytradeladder.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/prefs/EquityTradeLadderPrefsModule;", "", "<init>", "()V", "providePostTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "prefs", "Landroid/content/SharedPreferences;", "provideEquityTradeLadderNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideEquityTradeLadderZoomLevelPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderPrefsModule {
    public static final int $stable = 0;

    @PostTradeLadderFtuxStatePref
    public final EnumPreference<EquityPostTradeLadderFtuxState> providePostTradeLadderFtuxStatePref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new EnumPreference<>(EquityPostTradeLadderFtuxState.class, prefs, "equityTradeLadderFtuxStateKey", EquityPostTradeLadderFtuxState.NOT_SEEN, null, 16, null);
    }

    @EquityTradeLadderNuxPref
    public final BooleanPreference provideEquityTradeLadderNuxPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "equityTradeLadderNuxPrefKey", false, null, 8, null);
    }

    @EquityTradeLadderZoomLevelPref
    public final StringToLongMapPreference provideEquityTradeLadderZoomLevelPref(LazyMoshi moshi, @UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringToLongMapPreference(prefs, "equityTradeLadderZoomLevelPrefKey", MapsKt.mapOf(Tuples4.m3642to("penny", 1L), Tuples4.m3642to("standard", 3L), Tuples4.m3642to("high", 6L)), moshi);
    }
}
