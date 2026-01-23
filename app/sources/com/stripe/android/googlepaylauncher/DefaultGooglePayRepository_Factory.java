package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes8.dex */
public final class DefaultGooglePayRepository_Factory implements Factory<GooglePayRepository2> {
    private final Provider<Context> contextProvider;
    private final Provider<Config> googlePayConfigProvider;
    private final Provider<Logger> loggerProvider;

    public DefaultGooglePayRepository_Factory(Provider<Context> provider, Provider<Config> provider2, Provider<Logger> provider3) {
        this.contextProvider = provider;
        this.googlePayConfigProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public GooglePayRepository2 get() {
        return newInstance(this.contextProvider.get(), this.googlePayConfigProvider.get(), this.loggerProvider.get());
    }

    public static DefaultGooglePayRepository_Factory create(Provider<Context> provider, Provider<Config> provider2, Provider<Logger> provider3) {
        return new DefaultGooglePayRepository_Factory(provider, provider2, provider3);
    }

    public static GooglePayRepository2 newInstance(Context context, Config config, Logger logger) {
        return new GooglePayRepository2(context, config, logger);
    }
}
