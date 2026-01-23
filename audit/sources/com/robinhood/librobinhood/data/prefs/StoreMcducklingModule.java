package com.robinhood.librobinhood.data.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreMcducklingModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/prefs/StoreMcducklingModule;", "", "<init>", "()V", "provideHasVisitedMcDucklingTabEligibleRhyPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideHasVisitedMcDucklingTab", "provideHasClickedDirectDepositNux", "provideRhyMigrationCmSunsetFullScreenCount", "Lcom/robinhood/prefs/IntPreference;", "preferences", "provideRhyCmSunsetOptedOut", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class StoreMcducklingModule {
    public static final StoreMcducklingModule INSTANCE = new StoreMcducklingModule();

    private StoreMcducklingModule() {
    }

    @HasVisitedMcDucklingTabEligibleRhyPref
    public final BooleanPreference provideHasVisitedMcDucklingTabEligibleRhyPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "HasVisitedMcDucklingTabEligibleRhyPref", false, null, 8, null);
    }

    @HasVisitedMcDucklingTabPref
    public final BooleanPreference provideHasVisitedMcDucklingTab(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasVisitedMcDuckTab", false, null, 8, null);
    }

    @HasClickedDirectDepositNuxPref
    public final BooleanPreference provideHasClickedDirectDepositNux(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasClickedDirectDepositNux", false, null, 8, null);
    }

    @RhyMigrationCmSunsetFullScreenCount
    public final IntPreference provideRhyMigrationCmSunsetFullScreenCount(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "rhyMigrationCmSunsetFullScreenCount", 0);
    }

    @RhyCmSunsetOptedOut
    public final BooleanPreference provideRhyCmSunsetOptedOut(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "rhyCmSunsetOptedOut", false, null, 8, null);
    }
}
