package com.robinhood.android.disclosures.lib.homescreen;

import android.content.SharedPreferences;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisclosuresModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/disclosures/lib/homescreen/DisclosuresModule;", "", "<init>", "()V", "provideDisclosurePref", "Lcom/robinhood/prefs/IntPreference;", "preferences", "Landroid/content/SharedPreferences;", "lib-disclosures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DisclosuresModule {
    public static final int $stable = 0;
    public static final DisclosuresModule INSTANCE = new DisclosuresModule();

    private DisclosuresModule() {
    }

    @LastSeenDisclosurePref
    public final IntPreference provideDisclosurePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "last_seen_disclosure_version", 0, 4, null);
    }
}
