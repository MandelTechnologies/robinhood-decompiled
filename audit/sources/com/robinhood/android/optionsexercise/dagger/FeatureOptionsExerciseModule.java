package com.robinhood.android.optionsexercise.dagger;

import android.content.SharedPreferences;
import com.robinhood.android.optionsexercise.pref.NeverShowEarlyAssignmentSplashPref;
import com.robinhood.android.optionsexercise.pref.NeverShowOptionExerciseSplashPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureOptionsExerciseModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/dagger/FeatureOptionsExerciseModule;", "", "<init>", "()V", "provideNeverShowEarlyAssignmentSplashPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideNeverShowOptionExerciseSplashPref", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class FeatureOptionsExerciseModule {
    public static final int $stable = 0;
    public static final FeatureOptionsExerciseModule INSTANCE = new FeatureOptionsExerciseModule();

    private FeatureOptionsExerciseModule() {
    }

    @NeverShowEarlyAssignmentSplashPref
    public final BooleanPreference provideNeverShowEarlyAssignmentSplashPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "neverShowAssignmentSplashScreen", false, null, 8, null);
    }

    @NeverShowOptionExerciseSplashPref
    public final BooleanPreference provideNeverShowOptionExerciseSplashPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "neverShowExerciseSplashScreen", false, null, 8, null);
    }
}
