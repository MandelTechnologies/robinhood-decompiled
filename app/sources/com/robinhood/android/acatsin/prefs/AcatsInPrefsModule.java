package com.robinhood.android.acatsin.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringSetPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/prefs/AcatsInPrefsModule;", "", "<init>", "()V", "providesAcatsInIntroWithFeeShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "providesAcatsInIntroBonusLastShownPromoIdPref", "Lcom/robinhood/prefs/StringPreference;", "providesAcatsInFailedBottomSheetShownPref", "Lcom/robinhood/prefs/StringSetPreference;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPrefsModule {
    public static final int $stable = 0;
    public static final AcatsInPrefsModule INSTANCE = new AcatsInPrefsModule();

    private AcatsInPrefsModule() {
    }

    @AcatsInIntroWithFeeShownPref
    public final BooleanPreference providesAcatsInIntroWithFeeShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "acatsInIntroWithFeeShownPref", false, null, 8, null);
    }

    @AcatsInIntroBonusLastShownPromoIdPref
    public final StringPreference providesAcatsInIntroBonusLastShownPromoIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "acatsInIntroBonusLastShownPromoIdPref", null, null, 8, null);
    }

    @AcatsInFailedBottomSheetShownPref
    public final StringSetPreference providesAcatsInFailedBottomSheetShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringSetPreference(preferences, "acatsInFailedBottomSheetShownPref", null, 4, null);
    }
}
