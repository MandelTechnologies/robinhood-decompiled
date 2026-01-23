package com.robinhood.android.lib.psp;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLibPspPrefModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/psp/FeatureLibPspPrefModule;", "", "<init>", "()V", "provideShowPspDetailOnLaunchPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "prefs", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "feature-lib-psp_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class FeatureLibPspPrefModule {
    public static final FeatureLibPspPrefModule INSTANCE = new FeatureLibPspPrefModule();

    private FeatureLibPspPrefModule() {
    }

    @ShowPspDetailOnLaunchPref
    public final StringToBooleanMapPreference provideShowPspDetailOnLaunchPref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(prefs, "showPspDetailOnLaunchPref", MapsKt.emptyMap(), moshi, null, 16, null);
    }
}
