package com.robinhood.android.configurationvitals;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationVitalsModule_ProvideConfigurationVitalsPreferenceFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsModule_ProvideConfigurationVitalsPreferenceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsPreference;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", SharedPreferencesModule.DEVICE_PREFS_NAME, "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsModule_ProvideConfigurationVitalsPreferenceFactory */
/* loaded from: classes17.dex */
public final class C11947xadf8e8bd implements Factory<ConfigurationVitalsPreference> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SharedPreferences> devicePrefs;
    private final Provider<LazyMoshi> moshi;

    @JvmStatic
    public static final C11947xadf8e8bd create(Provider<LazyMoshi> provider, Provider<SharedPreferences> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final ConfigurationVitalsPreference provideConfigurationVitalsPreference(LazyMoshi lazyMoshi, SharedPreferences sharedPreferences) {
        return INSTANCE.provideConfigurationVitalsPreference(lazyMoshi, sharedPreferences);
    }

    public C11947xadf8e8bd(Provider<LazyMoshi> moshi, Provider<SharedPreferences> devicePrefs) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
        this.moshi = moshi;
        this.devicePrefs = devicePrefs;
    }

    @Override // javax.inject.Provider
    public ConfigurationVitalsPreference get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        SharedPreferences sharedPreferences = this.devicePrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideConfigurationVitalsPreference(lazyMoshi, sharedPreferences);
    }

    /* compiled from: ConfigurationVitalsModule_ProvideConfigurationVitalsPreferenceFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsModule_ProvideConfigurationVitalsPreferenceFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsModule_ProvideConfigurationVitalsPreferenceFactory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", SharedPreferencesModule.DEVICE_PREFS_NAME, "Landroid/content/SharedPreferences;", "provideConfigurationVitalsPreference", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsPreference;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsModule_ProvideConfigurationVitalsPreferenceFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C11947xadf8e8bd create(Provider<LazyMoshi> moshi, Provider<SharedPreferences> devicePrefs) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
            return new C11947xadf8e8bd(moshi, devicePrefs);
        }

        @JvmStatic
        public final ConfigurationVitalsPreference provideConfigurationVitalsPreference(LazyMoshi moshi, SharedPreferences devicePrefs) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
            Object objCheckNotNull = Preconditions.checkNotNull(ConfigurationVitalsModule.INSTANCE.provideConfigurationVitalsPreference(moshi, devicePrefs), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ConfigurationVitalsPreference) objCheckNotNull;
        }
    }
}
