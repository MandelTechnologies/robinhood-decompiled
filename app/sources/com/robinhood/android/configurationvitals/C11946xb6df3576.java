package com.robinhood.android.configurationvitals;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationVitalsModule_ProvideConfigurationVitalsManagerActivityLifecycleListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsModule_ProvideConfigurationVitalsManagerActivityLifecycleListenerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "configurationVitalsManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsModule_ProvideConfigurationVitalsManagerActivityLifecycleListenerFactory */
/* loaded from: classes17.dex */
public final class C11946xb6df3576 implements Factory<ActivityLifecycleListener> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ConfigurationVitalsManager> configurationVitalsManager;

    @JvmStatic
    public static final C11946xb6df3576 create(Provider<ConfigurationVitalsManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ActivityLifecycleListener provideConfigurationVitalsManagerActivityLifecycleListener(ConfigurationVitalsManager configurationVitalsManager) {
        return INSTANCE.provideConfigurationVitalsManagerActivityLifecycleListener(configurationVitalsManager);
    }

    public C11946xb6df3576(Provider<ConfigurationVitalsManager> configurationVitalsManager) {
        Intrinsics.checkNotNullParameter(configurationVitalsManager, "configurationVitalsManager");
        this.configurationVitalsManager = configurationVitalsManager;
    }

    @Override // javax.inject.Provider
    public ActivityLifecycleListener get() {
        Companion companion = INSTANCE;
        ConfigurationVitalsManager configurationVitalsManager = this.configurationVitalsManager.get();
        Intrinsics.checkNotNullExpressionValue(configurationVitalsManager, "get(...)");
        return companion.provideConfigurationVitalsManagerActivityLifecycleListener(configurationVitalsManager);
    }

    /* compiled from: ConfigurationVitalsModule_ProvideConfigurationVitalsManagerActivityLifecycleListenerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsModule_ProvideConfigurationVitalsManagerActivityLifecycleListenerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsModule_ProvideConfigurationVitalsManagerActivityLifecycleListenerFactory;", "configurationVitalsManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "provideConfigurationVitalsManagerActivityLifecycleListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsModule_ProvideConfigurationVitalsManagerActivityLifecycleListenerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C11946xb6df3576 create(Provider<ConfigurationVitalsManager> configurationVitalsManager) {
            Intrinsics.checkNotNullParameter(configurationVitalsManager, "configurationVitalsManager");
            return new C11946xb6df3576(configurationVitalsManager);
        }

        @JvmStatic
        public final ActivityLifecycleListener provideConfigurationVitalsManagerActivityLifecycleListener(ConfigurationVitalsManager configurationVitalsManager) {
            Intrinsics.checkNotNullParameter(configurationVitalsManager, "configurationVitalsManager");
            Object objCheckNotNull = Preconditions.checkNotNull(ConfigurationVitalsModule.INSTANCE.provideConfigurationVitalsManagerActivityLifecycleListener(configurationVitalsManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ActivityLifecycleListener) objCheckNotNull;
        }
    }
}
