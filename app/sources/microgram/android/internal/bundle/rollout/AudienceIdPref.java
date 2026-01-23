package microgram.android.internal.bundle.rollout;

import android.content.SharedPreferences;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudienceIdPref.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/rollout/AudienceIdPrefModule;", "", "<init>", "()V", "provideAudienceIdPref", "Lcom/robinhood/prefs/LongPreference;", "preferences", "Landroid/content/SharedPreferences;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.bundle.rollout.AudienceIdPrefModule, reason: use source file name */
/* loaded from: classes14.dex */
public final class AudienceIdPref {
    public static final AudienceIdPref INSTANCE = new AudienceIdPref();

    private AudienceIdPref() {
    }

    public final LongPreference provideAudienceIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "microgram.android.audienceId", -1L);
    }
}
