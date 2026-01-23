package com.robinhood.android.rhy.waitlist.lib;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLibRhyWaitlistModule_ProvideRhyWaitlistFullscreenAnimationSeenPrefFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/lib/FeatureLibRhyWaitlistModule_ProvideRhyWaitlistFullscreenAnimationSeenPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.waitlist.lib.FeatureLibRhyWaitlistModule_ProvideRhyWaitlistFullscreenAnimationSeenPrefFactory */
/* loaded from: classes20.dex */
public final class C27561xb7cd8f04 implements Factory<BooleanPreference> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SharedPreferences> preferences;

    @JvmStatic
    public static final C27561xb7cd8f04 create(Provider<SharedPreferences> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final BooleanPreference provideRhyWaitlistFullscreenAnimationSeenPref(SharedPreferences sharedPreferences) {
        return INSTANCE.provideRhyWaitlistFullscreenAnimationSeenPref(sharedPreferences);
    }

    public C27561xb7cd8f04(Provider<SharedPreferences> preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // javax.inject.Provider
    public BooleanPreference get() {
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideRhyWaitlistFullscreenAnimationSeenPref(sharedPreferences);
    }

    /* compiled from: FeatureLibRhyWaitlistModule_ProvideRhyWaitlistFullscreenAnimationSeenPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/lib/FeatureLibRhyWaitlistModule_ProvideRhyWaitlistFullscreenAnimationSeenPrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhy/waitlist/lib/FeatureLibRhyWaitlistModule_ProvideRhyWaitlistFullscreenAnimationSeenPrefFactory;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "provideRhyWaitlistFullscreenAnimationSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "feature-lib-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.waitlist.lib.FeatureLibRhyWaitlistModule_ProvideRhyWaitlistFullscreenAnimationSeenPrefFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C27561xb7cd8f04 create(Provider<SharedPreferences> preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new C27561xb7cd8f04(preferences);
        }

        @JvmStatic
        public final BooleanPreference provideRhyWaitlistFullscreenAnimationSeenPref(SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(FeatureLibRhyWaitlistModule.INSTANCE.provideRhyWaitlistFullscreenAnimationSeenPref(preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (BooleanPreference) objCheckNotNull;
        }
    }
}
