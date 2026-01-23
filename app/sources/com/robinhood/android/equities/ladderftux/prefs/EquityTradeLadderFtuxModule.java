package com.robinhood.android.equities.ladderftux.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderFtuxModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/prefs/EquityTradeLadderFtuxModule;", "", "<init>", "()V", "provideEquityTradeLadderFtux", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderFtuxModule {
    public static final int $stable = 0;

    @EquityTradeLadderFtuxPref
    public final BooleanPreference provideEquityTradeLadderFtux(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "EquityTradeLadderShouldShowFtuxPref", true, null, 8, null);
    }
}
