package com.robinhood.librobinhood.data.store.region;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.annotation.UserRegionPref;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserRegionPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/region/UserRegionPrefsModule;", "", "<init>", "()V", "providesUserRegionPrefs", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class UserRegionPrefsModule {
    public static final UserRegionPrefsModule INSTANCE = new UserRegionPrefsModule();

    private UserRegionPrefsModule() {
    }

    @UserRegionPref
    public final StringPreference providesUserRegionPrefs(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "userRegionPref", null, null, 12, null);
    }
}
