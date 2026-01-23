package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class FallbackModeModule_FallbackModeManagerFactory implements Factory<FallbackModeManager> {
    private final Provider<RealFallbackModeManager> fallbackModeManagerProvider;
    private final FallbackModeModule module;

    public FallbackModeModule_FallbackModeManagerFactory(FallbackModeModule fallbackModeModule, Provider<RealFallbackModeManager> provider) {
        this.module = fallbackModeModule;
        this.fallbackModeManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FallbackModeManager get() {
        return fallbackModeManager(this.module, this.fallbackModeManagerProvider.get());
    }

    public static FallbackModeModule_FallbackModeManagerFactory create(FallbackModeModule fallbackModeModule, Provider<RealFallbackModeManager> provider) {
        return new FallbackModeModule_FallbackModeManagerFactory(fallbackModeModule, provider);
    }

    public static FallbackModeManager fallbackModeManager(FallbackModeModule fallbackModeModule, RealFallbackModeManager realFallbackModeManager) {
        return (FallbackModeManager) Preconditions.checkNotNullFromProvides(fallbackModeModule.fallbackModeManager(realFallbackModeManager));
    }
}
