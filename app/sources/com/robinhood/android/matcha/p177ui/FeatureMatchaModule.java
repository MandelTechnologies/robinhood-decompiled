package com.robinhood.android.matcha.p177ui;

import android.content.SharedPreferences;
import com.robinhood.android.matcha.p177ui.common.HasPromptedUsernameUpdatePref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureMatchaModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/FeatureMatchaModule;", "", "<init>", "()V", "providePromptUsernameUpdatePref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class FeatureMatchaModule {
    public static final int $stable = 0;
    public static final FeatureMatchaModule INSTANCE = new FeatureMatchaModule();

    private FeatureMatchaModule() {
    }

    @HasPromptedUsernameUpdatePref
    public final BooleanPreference providePromptUsernameUpdatePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasPromptedUsernameUpdate", false, null, 8, null);
    }
}
