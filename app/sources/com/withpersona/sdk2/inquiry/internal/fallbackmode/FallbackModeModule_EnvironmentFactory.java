package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.Environment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class FallbackModeModule_EnvironmentFactory implements Factory<Environment> {
    private final FallbackModeModule module;

    public FallbackModeModule_EnvironmentFactory(FallbackModeModule fallbackModeModule) {
        this.module = fallbackModeModule;
    }

    @Override // javax.inject.Provider
    public Environment get() {
        return environment(this.module);
    }

    public static FallbackModeModule_EnvironmentFactory create(FallbackModeModule fallbackModeModule) {
        return new FallbackModeModule_EnvironmentFactory(fallbackModeModule);
    }

    public static Environment environment(FallbackModeModule fallbackModeModule) {
        return (Environment) Preconditions.checkNotNullFromProvides(fallbackModeModule.getEnvironment());
    }
}
