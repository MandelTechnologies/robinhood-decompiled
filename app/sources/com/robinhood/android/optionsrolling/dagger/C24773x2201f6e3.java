package com.robinhood.android.optionsrolling.dagger;

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

/* compiled from: FeatureOptionsRollingPrefsModule_ProvideHasShownRollingNuxPrefFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/dagger/FeatureOptionsRollingPrefsModule_ProvideHasShownRollingNuxPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsrolling.dagger.FeatureOptionsRollingPrefsModule_ProvideHasShownRollingNuxPrefFactory */
/* loaded from: classes17.dex */
public final class C24773x2201f6e3 implements Factory<BooleanPreference> {
    private final Provider<SharedPreferences> preferences;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C24773x2201f6e3 create(Provider<SharedPreferences> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final BooleanPreference provideHasShownRollingNuxPref(SharedPreferences sharedPreferences) {
        return INSTANCE.provideHasShownRollingNuxPref(sharedPreferences);
    }

    public C24773x2201f6e3(Provider<SharedPreferences> preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // javax.inject.Provider
    public BooleanPreference get() {
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideHasShownRollingNuxPref(sharedPreferences);
    }

    /* compiled from: FeatureOptionsRollingPrefsModule_ProvideHasShownRollingNuxPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/dagger/FeatureOptionsRollingPrefsModule_ProvideHasShownRollingNuxPrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionsrolling/dagger/FeatureOptionsRollingPrefsModule_ProvideHasShownRollingNuxPrefFactory;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "provideHasShownRollingNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsrolling.dagger.FeatureOptionsRollingPrefsModule_ProvideHasShownRollingNuxPrefFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C24773x2201f6e3 create(Provider<SharedPreferences> preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new C24773x2201f6e3(preferences);
        }

        @JvmStatic
        public final BooleanPreference provideHasShownRollingNuxPref(SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(FeatureOptionsRollingPrefsModule.INSTANCE.provideHasShownRollingNuxPref(preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (BooleanPreference) objCheckNotNull;
        }
    }
}
