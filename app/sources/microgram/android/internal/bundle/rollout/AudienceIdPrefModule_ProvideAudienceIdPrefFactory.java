package microgram.android.internal.bundle.rollout;

import android.content.SharedPreferences;
import com.robinhood.prefs.LongPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudienceIdPrefModule_ProvideAudienceIdPrefFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/internal/bundle/rollout/AudienceIdPrefModule_ProvideAudienceIdPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/LongPreference;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AudienceIdPrefModule_ProvideAudienceIdPrefFactory implements Factory<LongPreference> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final LongPreference provideAudienceIdPref(SharedPreferences sharedPreferences) {
        return INSTANCE.provideAudienceIdPref(sharedPreferences);
    }

    /* compiled from: AudienceIdPrefModule_ProvideAudienceIdPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/internal/bundle/rollout/AudienceIdPrefModule_ProvideAudienceIdPrefFactory$Companion;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", "Lcom/robinhood/prefs/LongPreference;", "provideAudienceIdPref", "(Landroid/content/SharedPreferences;)Lcom/robinhood/prefs/LongPreference;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LongPreference provideAudienceIdPref(SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(AudienceIdPref.INSTANCE.provideAudienceIdPref(preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LongPreference) objCheckNotNull;
        }
    }
}
