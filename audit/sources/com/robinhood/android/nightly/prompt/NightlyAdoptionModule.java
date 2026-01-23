package com.robinhood.android.nightly.prompt;

import android.content.SharedPreferences;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightlyAdoptionModule.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule;", "", "<init>", "()V", "provideNightlyAdoptionManagerActivityLifecycleListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "nightlyAdoptionManager", "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager;", "provideForceUpdatePrompt", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradePrompt;", "provideLastNightlyPromptDatePref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "prefs", "Landroid/content/SharedPreferences;", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NightlyAdoptionModule {
    public static final int $stable = 0;
    public static final NightlyAdoptionModule INSTANCE = new NightlyAdoptionModule();

    public final ActivityLifecycleListener provideNightlyAdoptionManagerActivityLifecycleListener(NightlyAdoptionManager nightlyAdoptionManager) {
        Intrinsics.checkNotNullParameter(nightlyAdoptionManager, "nightlyAdoptionManager");
        return nightlyAdoptionManager;
    }

    private NightlyAdoptionModule() {
    }

    public final NightlyUpgradePrompt provideForceUpdatePrompt() {
        return NightlyUpgradeDialogFragment.INSTANCE;
    }

    public final LastNightlyPromptDatePreference provideLastNightlyPromptDatePref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LastNightlyPromptDatePreference(prefs, "lastNightlyPromptPref");
    }
}
