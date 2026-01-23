package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.internal.Environment;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class RealFallbackModeManager_Factory implements Factory<RealFallbackModeManager> {
    private final Provider<ApiController> apiControllerProvider;
    private final Provider<Environment> environmentProvider;
    private final Provider<FallbackMode> fallbackModeProvider;
    private final Provider<Moshi> moshiProvider;

    public RealFallbackModeManager_Factory(Provider<FallbackMode> provider, Provider<ApiController> provider2, Provider<Environment> provider3, Provider<Moshi> provider4) {
        this.fallbackModeProvider = provider;
        this.apiControllerProvider = provider2;
        this.environmentProvider = provider3;
        this.moshiProvider = provider4;
    }

    @Override // javax.inject.Provider
    public RealFallbackModeManager get() {
        return newInstance(this.fallbackModeProvider.get(), this.apiControllerProvider.get(), this.environmentProvider.get(), this.moshiProvider.get());
    }

    public static RealFallbackModeManager_Factory create(Provider<FallbackMode> provider, Provider<ApiController> provider2, Provider<Environment> provider3, Provider<Moshi> provider4) {
        return new RealFallbackModeManager_Factory(provider, provider2, provider3, provider4);
    }

    public static RealFallbackModeManager newInstance(FallbackMode fallbackMode, ApiController apiController, Environment environment, Moshi moshi) {
        return new RealFallbackModeManager(fallbackMode, apiController, environment, moshi);
    }
}
