package com.robinhood.android.equities.equityupsell;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityUpsellModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/EquityUpsellModule;", "", "<init>", "()V", "provideUpsellViewCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "prefs", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideEquityUpsellLastSeenPref", "provideEquityUpsellCompletePref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityUpsellModule {
    public static final int $stable = 0;

    @EquityUpsellModule4
    public final StringToLongMapPreference provideUpsellViewCountPref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(prefs, "EquityUpsellViewCountPref", null, moshi, 4, null);
    }

    @EquityUpsellModule3
    public final StringToLongMapPreference provideEquityUpsellLastSeenPref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(prefs, "EquityUpsellLastSeenPref", null, moshi, 4, null);
    }

    @EquityUpsellModule2
    public final StringToBooleanMapPreference provideEquityUpsellCompletePref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(prefs, "EquityUpsellCompletePref", null, moshi, null, 20, null);
    }
}
