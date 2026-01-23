package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.FallbackMode;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class FallbackModeModule_FallbackModeFactory implements Factory<FallbackMode> {
    private final FallbackModeModule module;

    public FallbackModeModule_FallbackModeFactory(FallbackModeModule fallbackModeModule) {
        this.module = fallbackModeModule;
    }

    @Override // javax.inject.Provider
    public FallbackMode get() {
        return fallbackMode(this.module);
    }

    public static FallbackModeModule_FallbackModeFactory create(FallbackModeModule fallbackModeModule) {
        return new FallbackModeModule_FallbackModeFactory(fallbackModeModule);
    }

    public static FallbackMode fallbackMode(FallbackModeModule fallbackModeModule) {
        return (FallbackMode) Preconditions.checkNotNullFromProvides(fallbackModeModule.getFallbackMode());
    }
}
