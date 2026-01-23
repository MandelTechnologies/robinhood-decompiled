package com.robinhood.app.locale;

import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes20.dex */
public final class LocaleConfigurationModule_ProvideLocaleConfigurationFactory implements Factory<LocaleConfiguration> {
    @Override // javax.inject.Provider
    public LocaleConfiguration get() {
        return provideLocaleConfiguration();
    }

    public static LocaleConfigurationModule_ProvideLocaleConfigurationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LocaleConfiguration provideLocaleConfiguration() {
        return (LocaleConfiguration) Preconditions.checkNotNullFromProvides(LocaleConfigurationModule.INSTANCE.provideLocaleConfiguration());
    }

    private static final class InstanceHolder {
        static final LocaleConfigurationModule_ProvideLocaleConfigurationFactory INSTANCE = new LocaleConfigurationModule_ProvideLocaleConfigurationFactory();

        private InstanceHolder() {
        }
    }
}
